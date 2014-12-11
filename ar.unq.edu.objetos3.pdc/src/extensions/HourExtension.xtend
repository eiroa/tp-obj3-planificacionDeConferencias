package extensions

import ar.unq.edu.objetos3.pdc.PdcFactory
import ar.unq.edu.objetos3.pdc.Horario

class HourExtension {
		
	def toMinutes(Horario h){
		h.hora * 60 + h.minutos
	}
	
	def createHour(Horario h, Integer hora, Integer minutos){
		var horario = PdcFactory.eINSTANCE.createHorario()
		horario.hora = hora
		horario.minutos = minutos
		return horario
	}
	
	def Horario pass(Horario h,Integer n){ 
		if(n >= 60)
			return h.createHour(h.hora+1,h.minutos).pass(n-60)
		if(n < 60 && n > 0){
			if((n+ h.minutos) >= 60)
				return h.createHour(h.hora+1,h.minutos).pass(n-60)
		}		
		return h.createHour(h.hora,h.minutos+n)						
	}
	
	def belongsTo(Horario h,Horario begin, Horario end){
		if(begin.hora <= h.hora && h.hora <= end.hora)
			return begin.minutos <= h.minutos && h.minutos <= end.minutos
	}
	
	def <(Horario h,Horario h2){
		if(h.hora >= h2.hora)
			 return h.minutos < h2.minutos
		
		return true
	}
	
}