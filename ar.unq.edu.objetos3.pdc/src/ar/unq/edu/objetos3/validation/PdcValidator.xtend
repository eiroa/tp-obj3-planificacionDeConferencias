/*
 * generated by Xtext
 */
package ar.unq.edu.objetos3.validation

import org.eclipse.xtext.validation.Check
import ar.unq.edu.objetos3.pdc.*
import java.util.HashMap
import java.util.List

//import org.eclipse.xtext.validation.Check
/**
 * Custom validation rules. 
 *
 * see http://www.eclipse.org/Xtext/documentation.html#validation
 */
class PdcValidator extends AbstractPdcValidator {

	public static val INVALID_NAME = 'invalidName'

	@Check
	def checkActividadEmpiezaConMayuscula(Actividad actividad) {
		if (!Character.isUpperCase(actividad.titulo.charAt(0))) {
			warning(
				'El titulo deberia comenzar con mayuscula',
				PdcPackage.Literals.ACTIVIDAD__TITULO,
				INVALID_NAME
			)
		}
	}

	@Check
	def void checkTituloEsUnico(Schedule s) {
		if (s.actividades.map[a|a.titulo].toList.length > s.actividades.map[a|a.titulo].toSet.length) {
			error('Existen titulos repetidos', PdcPackage.Literals.SCHEDULE__NOMBRE, INVALID_NAME)
		}
	}

	@Check
	def checkCharlaDuracion(Actividad actividad) {

		if (actividad.esCharla && actividad.duracion < 30) {
			error('Una charla no puede durar menos de 30 minutos', PdcPackage.Literals.ACTIVIDAD__DURACION,
				INVALID_NAME)
		}
	}

	@Check
	def checkMesaDebateDuracion(Actividad actividad) {
		if (actividad.esMesaDeDebate && actividad.duracion < 60) {
			error('Una mesa de debate no puede durar menos de 1 hora', PdcPackage.Literals.ACTIVIDAD__DURACION,
				INVALID_NAME)
		}
	}

	@Check
	def checkExistenciaDeTitulos(Actividad actividad) {
		if (actividad.titulo.nullOrEmpty) {
			error('Actividad requiere titulo', PdcPackage.Literals.ACTIVIDAD__DURACION, INVALID_NAME)
		}
	}

	@Check
	def checkActividadesConcurrentes(PDC pdc) {

		//		Genero un mapa con actividades y espacio, si resulta que un espacio tiene dos actividades, 
		//		verificar concurrencias 
		pdc.schedule.actividades.groupBy[a|a.espacio].forEach [ p1, p2 | //key,value
			if (p2.length > 1) {
				var sortedValues = p2.sortBy[horario.minutos]
				sortedValues = sortedValues.sortBy[horario.hora]

				//En este punto ya tenemos las actividades de un mismo espacio ordenadas segun el horario
				//Ahora debemos corroborar que no se superpongan
				var x = 0
				for (a : sortedValues) {
					var totalMinutes = a.horario.hora * 60 + a.horario.minutos + a.duracion
					if (sortedValues.size - x > 1) {
						var next = sortedValues.get(x + 1)
						var nextTotalMinutes = next.horario.hora * 60 + next.horario.minutos
						if (totalMinutes > nextTotalMinutes) {
							error(
								"Las actividades " + a.titulo + " y " + next.titulo + " se superponen en el mismo lugar",
								PdcPackage.Literals.PDC__SCHEDULE, INVALID_NAME)
						}
						x++
					}
				}
			}
		]
	}

	@Check
	def checkConcurrenciaDeOradores(PDC pdc) {
		val map = new HashMap()

		//		Genero un mapa con actividades y oradores
		pdc.losOradores.head.oradores.forEach [ o |
			var actividadesRelacionadas = pdc.schedule.actividades.filter[act|act.oradores.contains(o)]
			println("orador: " + o.toString + " posee las actividades: " + actividadesRelacionadas)
			map.put(o, actividadesRelacionadas)
		]
		map.forEach [ p1, p2 |
			if (p2.length > 1) {
				var sortedValues = p2.sortBy[horario.minutos]
				sortedValues = sortedValues.sortBy[horario.hora]

				//En este punto ya tenemos las actividades de un mismo espacio ordenadas segun el horario
				//Ahora debemos corroborar que no se superpongan
				var x = 0
				for (a : sortedValues) {
					var totalMinutes = a.horario.hora * 60 + a.horario.minutos + a.duracion
					if (sortedValues.size - x > 1) {
						var next = sortedValues.get(x + 1)
						var nextTotalMinutes = next.horario.hora * 60 + next.horario.minutos
						if (totalMinutes == nextTotalMinutes) {
							warning(
								"Advertencia, el orador " + p1.name + " esta asignado a las actividades adyacentes" +
									a.titulo + " y " + next.titulo, PdcPackage.Literals.PDC__SCHEDULE,
								INVALID_NAME)
						} else {
							if (totalMinutes > nextTotalMinutes) {
								error(
									"Las actividades " + a.titulo + " y " + next.titulo + " del orador " + p1.name +
										" se superponen", PdcPackage.Literals.PDC__SCHEDULE, INVALID_NAME)
							}
						}
						x++
					}
				}
			}
		]
	}

	@Check
	def checkMesaDebate2Oradores(Actividad actividad) {
		if (actividad.esMesaDeDebate && actividad.oradores.length < 2) {
			error('Mesa de debate necesita 2 oradores al menos', PdcPackage.Literals.ACTIVIDAD__ORADORES, INVALID_NAME)
		}
	}

	@Check
	def checkHorariosValidos(Horario horario) {
		if (horario.hora < 0 || horario.hora > 23) {
			error('Hora invalida utilice valores entre 0 y 23', PdcPackage.Literals.HORARIO__HORA, INVALID_NAME)
		}
		if (horario.minutos < 0 || horario.minutos > 59) {
			error('Minutos invalidos utilice valores entre 0 y 59', PdcPackage.Literals.HORARIO__MINUTOS, INVALID_NAME)
		}
	}

	@Check
	def checkKeynote(Actividad actividad) {
		if (actividad.keynote) {
			warning('Keynote detecteda', PdcPackage.Literals.ACTIVIDAD__KEYNOTE, INVALID_NAME)
		}
	}

	@Check
	def checkDuracionBreak(Actividad actividad) {
		if (actividad.esBreak && actividad.duracion < 15) {
			error('Los breaks no pueden durar menos de 15 minutos', PdcPackage.Literals.ACTIVIDAD__DURACION,
				INVALID_NAME)
		}
	}

	@Check
	def checkDuracionAlmuerzo(Actividad actividad) {
		if (actividad.esBreak && actividad.tipoDeBreak.eClass.name.equals("Almuerzo") && actividad.duracion < 45) {
			error('Los almuerzos no pueden durar menos de 45 minutos', PdcPackage.Literals.ACTIVIDAD__DURACION,
				INVALID_NAME)
		}
	}

	@Check
	def checkAulasConMaquinasSoloParaTalleres(Actividad actividad) {
		if (actividad.espacio.tieneComputadoras && !actividad.esTaller) {
			error('Un aula con computadoras solo puede utilizarse para talleres', PdcPackage.Literals.ACTIVIDAD__ESPACIO,
				INVALID_NAME)
		}
	}

	@Check
	def checkCapacidadActividad(Actividad actividad) {
		val x = actividad.genteEsperada
		switch (x) {
			case null:
				error('Especifique la gente esperada para la actividad ' + actividad.titulo, PdcPackage.Literals.ACTIVIDAD__GENTE_ESPERADA, INVALID_NAME)
			case x > actividad.espacio.capacidad:
				error('No hay suficiente espacio en actividad ' + actividad.titulo, PdcPackage.Literals.ACTIVIDAD__GENTE_ESPERADA, INVALID_NAME)
			case x < (actividad.espacio.capacidad / 2):
				warning('Existe demasiado espacio en actividad ' +actividad.titulo+ ' sin usar', PdcPackage.Literals.ACTIVIDAD__GENTE_ESPERADA,
					INVALID_NAME)
			case x > ( (90 * actividad.espacio.capacidad) / 100):
				warning('La cantidad de gente esperada para la actividad ' + actividad.titulo+ ' es próxima a la capacidad máxima del lugar',
					PdcPackage.Literals.ACTIVIDAD__GENTE_ESPERADA, INVALID_NAME)
		}

	}
}
