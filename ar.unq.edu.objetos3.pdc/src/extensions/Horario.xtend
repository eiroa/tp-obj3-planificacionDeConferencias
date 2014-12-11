package extensions

import org.eclipse.xtend.lib.annotations.Accessors

@Accessors
class Horario {
	var int hora
	var int minutos
	 
	new(Integer horas,Integer mins){
		hora = horas
		minutos = mins
	}
		
	def toMinutes(){
		hora * 60 + minutos
	}
	
	def Horario createHour(Integer hora, Integer minutos){
	
		return new Horario(hora,minutos)
	}
	
	
	def Horario pass(Integer n){ 
		if(n >= 60)
			return createHour(hora+1,minutos).pass(n-60)
		if(n < 60 && n > 0){
			if((n+ minutos) >= 60)
				return createHour(hora+1,minutos).pass(n-60)
		}		
		return createHour(hora,minutos+n)						
	}
	
	def belongsTo(Horario begin, Horario end){
		print(begin.minor(this))
		print(this.minor(end))
		return begin.minor(this) && this.minor(end)	
	}
	
	def minor(Horario h2){
		if(hora < h2.hora)
			 return true 
		else{
			if(hora == h2.hora)
				return minutos < h2.minutos
		}
				 
		return false
	}
	
}