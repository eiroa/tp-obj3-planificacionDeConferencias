/*
 * generated by Xtext
 */
package ar.unq.edu.objetos3.validation

import ar.unq.edu.objetos3.pdc.Greeting
import org.eclipse.xtext.validation.Check
import ar.unq.edu.objetos3.pdc.*

//import org.eclipse.xtext.validation.Check

/**
 * Custom validation rules. 
 *
 * see http://www.eclipse.org/Xtext/documentation.html#validation
 */
class PdcValidator extends AbstractPdcValidator {

  public static val INVALID_NAME = 'invalidName'
	

	@Check
	def checkGreetingStartsWithCapital(Greeting greeting) {
		if (!Character.isUpperCase(greeting.name.charAt(0))) {
			warning('Name should start with a capital', 
					PdcPackage.Literals.GREETING__NAME,
					INVALID_NAME)
		}
	}
	
	@Check
	def checkActivityDurationl(Actividad actividad) {
		if (actividad.duracion < 30) {
			error('Duration must be at least 30 minutes', 
					PdcPackage.Literals.ACTIVIDAD__DURACION,
					INVALID_NAME)
		}
	}
	
	@Check
	def checkActivityCapacity(Actividad actividad) {
		val x = actividad.genteEsperada
		switch (x){
			case null: error("Specify Expected people",
					PdcPackage.Literals.ACTIVIDAD__GENTE_ESPERADA,
					INVALID_NAME)
			case x>actividad.espacio.capacidad: error('There is not enough space', 
					PdcPackage.Literals.ACTIVIDAD__GENTE_ESPERADA,
					INVALID_NAME)
			case x<(actividad.espacio.capacidad / 2) : warning('There is way too much space without being used', 
					PdcPackage.Literals.ACTIVIDAD__GENTE_ESPERADA,
					INVALID_NAME)
			case x>( (90 * actividad.espacio.capacidad) / 100) : warning('Expected people almost exceeds capacity', 
					PdcPackage.Literals.ACTIVIDAD__GENTE_ESPERADA,
					INVALID_NAME)
		}
		
	}
}
