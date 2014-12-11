package extensions

import org.eclipse.xtend.lib.annotations.Accessors

@Accessors
class Actividad {
	Integer duracion
	String titulo
	Espacio espacio
	Horario horario
	
	new(Integer d,String t,Horario h,Espacio e){
		duracion = d
		titulo = t
		horario = h
		espacio = e
	}
	
}