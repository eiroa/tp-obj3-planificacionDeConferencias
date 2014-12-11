package extensions

import ar.unq.edu.objetos3.pdc.Actividad
import ar.unq.edu.objetos3.pdc.Schedule
import java.util.List

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

	def fst(List<Actividad> l){ l.get(0) }
	
	def snd(List<Actividad> l){ l.get(1) } 

	//Precondición: 
	//				l1 y l2 deben tener el mismo tamaño
	def List<List<Actividad>> zip(List<Actividad> l1){
		var zipped = newArrayList
		if(l1.size > 2){
			zipped.add(l1.take(2).toList)
			zipped.addAll(zip(l1.tail.toList))
		}else
			zipped.add(l1)
		
		return zipped.toList		
	}
	
	def even(Integer n){ (n % Integer.valueOf(2)) == 0 }
	
	
	
	def Boolean isZippeable(List<Actividad> l1){
		return (l1.size > 1) && !l1.size.even
	}

	def List<List<Actividad>> consecutiveActs(List<Actividad> acts){
		if(acts.isZippeable){
			if(acts.size.equals(2))
				return #[acts]
			else	
				return acts.zip	
		}
	}
	
	def Integer indexOf(Actividad obj, List<Actividad> objs){
		var count = 0
		for(o : objs){
			if(o.equals(obj))
				return count	
			else
				count++
		}
		throw new Exception('No index found!')
	}	

	
	//En este punto ya tenemos las actividades de un mismo espacio ordenadas segun el horario
	//Ahora debemos corroborar que no se superpongan
	def hayHorariosSuperpuestos(List<Actividad> acts){

		return acts.snd.inTheMiddleOf(acts.fst)
	}
	
}