package extensions

import ar.unq.edu.objetos3.pdc.Horario
import ar.unq.edu.objetos3.pdc.Actividad

class HourExtension {
		
	def toMinutes(Horario h){
		h.hora * 60 + h.minutos
	}
	
	def createHour(Horario h, Integer hora, Integer minutos){
		h.setHora(hora)
		h.setMinutos(minutos)
		return h
	}
	
	def Horario pass(Horario h, Integer n){ 
		var hora = h.hora
		var minutos = h.minutos + n
		if(minutos >= 60 ){
			hora = hora+1
			minutos = minutos - 60
			return pass(h.createHour(hora,minutos),minutos)
		}
		return h.createHour(h.hora,minutos)
	}
	
	def belongsTo(Horario h, Horario begin, Horario end){
		if(begin.hora <= h.hora && h.hora <= end.hora)
			return begin.minutos <= h.minutos && h.minutos <= end.minutos
	}
	
	def <(Horario h,Horario h2){
		if(h.hora >= h2.hora)
			 return h.minutos < h2.minutos
		
		return true
	}
	
	def Boolean inTheMiddleOf(Actividad act, Actividad in){
		return act.horario.belongsTo(in.horario,in.horario.pass(in.duracion))
	}
	
}