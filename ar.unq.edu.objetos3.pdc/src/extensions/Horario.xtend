package extensions

import org.eclipse.xtend.lib.annotations.Accessors


@Accessors
class Horario {
	var Integer hora
	var Integer minutos
	 
	new(Integer horas,Integer mins){
		hora = horas
		minutos = mins
	}
		
	def toMinutes(){
		hora * 60 + minutos
	}
	
	def createHour(Integer hora, Integer minutos){
		setHora(hora)
		setMinutos(minutos)
		return this
	}
	
	
	def Horario pass(Integer n){ 
		if(n >= 60)
			return createHour(hora+1,minutos).pass(n-60)
		if(n < 60 && n > 0)
			if((n+ minutos) >= 60)
				return createHour(hora+1,minutos).pass(n-60)
			else
				return createHour(hora,minutos+n)						
	}
	
	def belongsTo(Horario begin, Horario end){
		if(begin.hora <= hora && hora <= end.hora)
			return begin.minutos <= minutos && minutos <= end.minutos
	}
	
	def minor(Horario h2){
		if(hora >= h2.hora)
			 return minutos < h2.minutos
		
		return true
	}

}