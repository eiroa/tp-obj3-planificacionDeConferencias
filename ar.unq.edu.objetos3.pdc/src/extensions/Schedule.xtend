package extensions

import java.util.List
import org.eclipse.xtend.lib.annotations.Accessors

@Accessors
class Schedule {
	
	var String titulo
	var List<Actividad> actividades
	
	new(String t,List<Actividad> acts){
		titulo = t
		actividades=acts
	}
	
	def List<Actividad> sortByTime(List<Actividad> acts){
		acts.sortInplaceBy[horario.minutos].sortInplaceBy[horario.hora]
		return acts
	}
	
	def activitiesSortedByPlaceAndTime(){
		var sorted = actividades.groupBy[a|a.espacio]
		sorted.forEach[e,acts| acts.sortByTime]
		
		return sorted
	}
	
	def fst(List<Actividad> l){ l.get(0) }
	
	def snd(List<Actividad> l){ l.get(1) } 
	
	def Boolean inTheMiddleOf(Actividad act, Actividad in){
		var iniHour = new Horario(in.horario.hora,in.horario.minutos)
		return act.horario.belongsTo(in.horario,iniHour.pass(in.duracion))
	}
	
	def hayHorariosSuperpuestos(List<Actividad> actividades){
			var cursor = new Cursor(actividades)
			var flag = false
			while(cursor.hasNext){
				var current = cursor.current as Actividad
				var next = cursor.next as Actividad
				
				flag = flag || next.inTheMiddleOf(current)
			}	
		return flag	
	}
	
}