package extensions

import ar.unq.edu.objetos3.pdc.Actividad
import ar.unq.edu.objetos3.pdc.Schedule


import java.util.List
import java.util.HashMap

class ActivitiesExtension {
	extension HourExtension = new HourExtension
	//		Genero un mapa con actividades y espacio, si resulta que un espacio tiene dos actividades, 
	//		verificar concurrencias 
	def activitiesSortedByPlaceAndTime(Schedule schedule){
		var sorted = schedule.actividades.groupBy[a|a.espacio]
		sorted.forEach[e,acts| acts.sortByTime]
		
		return sorted
	}
	
	def List<Actividad> sortByTime(List<Actividad> acts){
		return acts.sortBy[horario.minutos].sortBy[horario.hora].reverse
	}

	def fst(List<Actividad> l){ l.head }
	
	def snd(List<Actividad> l){ l.get(1) } 

	
	def activitiesSortedBySpeakerAndTime(Schedule schedule){
		val map = new HashMap()
		var oradores = schedule.actividades.fold(#[],[result, a|a.oradores])
		oradores.forEach [ o |
			var actividadesRelacionadas = schedule.actividades.filter[act|act.oradores.contains(o)]
			map.put(o, actividadesRelacionadas)
		]
		return map
	}
	
	def endTime(Actividad act){
		return act.horario.pass(act.duracion)
	}
	
	
	def Boolean inTheMiddleOf(Actividad act, Actividad in){
		return act.horario.belongsTo(in.horario,in.endTime)
	}
	
	//En este punto ya tenemos las actividades de un mismo espacio ordenadas segun el horario
	//Ahora debemos corroborar que no se superpongan
	def hayHorariosSuperpuestos(List<Actividad> acts){

		return acts.snd.inTheMiddleOf(acts.fst)
	}
	
}