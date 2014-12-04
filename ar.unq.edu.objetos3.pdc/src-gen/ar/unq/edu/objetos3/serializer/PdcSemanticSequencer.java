package ar.unq.edu.objetos3.serializer;

import ar.unq.edu.objetos3.pdc.Actividad;
import ar.unq.edu.objetos3.pdc.Almuerzo;
import ar.unq.edu.objetos3.pdc.Desayuno;
import ar.unq.edu.objetos3.pdc.Espacio;
import ar.unq.edu.objetos3.pdc.Espacios;
import ar.unq.edu.objetos3.pdc.Horario;
import ar.unq.edu.objetos3.pdc.Merienda;
import ar.unq.edu.objetos3.pdc.Orador;
import ar.unq.edu.objetos3.pdc.Oradores;
import ar.unq.edu.objetos3.pdc.Organizacion;
import ar.unq.edu.objetos3.pdc.Organizaciones;
import ar.unq.edu.objetos3.pdc.PDC;
import ar.unq.edu.objetos3.pdc.PdcPackage;
import ar.unq.edu.objetos3.pdc.Schedule;
import ar.unq.edu.objetos3.pdc.Track;
import ar.unq.edu.objetos3.pdc.Tracks;
import ar.unq.edu.objetos3.services.PdcGrammarAccess;
import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class PdcSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private PdcGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == PdcPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case PdcPackage.ACTIVIDAD:
				if(context == grammarAccess.getActividadRule()) {
					sequence_Actividad(context, (Actividad) semanticObject); 
					return; 
				}
				else break;
			case PdcPackage.ALMUERZO:
				if(context == grammarAccess.getAlmuerzoRule() ||
				   context == grammarAccess.getTipoDeBreakRule()) {
					sequence_Almuerzo(context, (Almuerzo) semanticObject); 
					return; 
				}
				else break;
			case PdcPackage.DESAYUNO:
				if(context == grammarAccess.getDesayunoRule() ||
				   context == grammarAccess.getTipoDeBreakRule()) {
					sequence_Desayuno(context, (Desayuno) semanticObject); 
					return; 
				}
				else break;
			case PdcPackage.ESPACIO:
				if(context == grammarAccess.getEspacioRule()) {
					sequence_Espacio(context, (Espacio) semanticObject); 
					return; 
				}
				else break;
			case PdcPackage.ESPACIOS:
				if(context == grammarAccess.getEspaciosRule()) {
					sequence_Espacios(context, (Espacios) semanticObject); 
					return; 
				}
				else break;
			case PdcPackage.HORARIO:
				if(context == grammarAccess.getHorarioRule()) {
					sequence_Horario(context, (Horario) semanticObject); 
					return; 
				}
				else break;
			case PdcPackage.MERIENDA:
				if(context == grammarAccess.getMeriendaRule() ||
				   context == grammarAccess.getTipoDeBreakRule()) {
					sequence_Merienda(context, (Merienda) semanticObject); 
					return; 
				}
				else break;
			case PdcPackage.ORADOR:
				if(context == grammarAccess.getOradorRule()) {
					sequence_Orador(context, (Orador) semanticObject); 
					return; 
				}
				else break;
			case PdcPackage.ORADORES:
				if(context == grammarAccess.getOradoresRule()) {
					sequence_Oradores(context, (Oradores) semanticObject); 
					return; 
				}
				else break;
			case PdcPackage.ORGANIZACION:
				if(context == grammarAccess.getOrganizacionRule()) {
					sequence_Organizacion(context, (Organizacion) semanticObject); 
					return; 
				}
				else break;
			case PdcPackage.ORGANIZACIONES:
				if(context == grammarAccess.getOrganizacionesRule()) {
					sequence_Organizaciones(context, (Organizaciones) semanticObject); 
					return; 
				}
				else break;
			case PdcPackage.PDC:
				if(context == grammarAccess.getPDCRule()) {
					sequence_PDC(context, (PDC) semanticObject); 
					return; 
				}
				else break;
			case PdcPackage.SCHEDULE:
				if(context == grammarAccess.getScheduleRule()) {
					sequence_Schedule(context, (Schedule) semanticObject); 
					return; 
				}
				else break;
			case PdcPackage.TRACK:
				if(context == grammarAccess.getTrackRule()) {
					sequence_Track(context, (Track) semanticObject); 
					return; 
				}
				else break;
			case PdcPackage.TRACKS:
				if(context == grammarAccess.getTracksRule()) {
					sequence_Tracks(context, (Tracks) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (
	 *         esCharla?='Charla'? 
	 *         esMesaDeDebate?='Mesa de debate'? 
	 *         esTaller?='Taller'? 
	 *         esBreak?='Break'? 
	 *         esEventoDeInauguracion?='Evento de Inauguración'? 
	 *         esRegistracion?='Registracion'? 
	 *         esEventoDeCierre?='Evento de cierre'? 
	 *         keynote?='Keynote'? 
	 *         tipoDeBreak=TipoDeBreak? 
	 *         track=[Track|ID]? 
	 *         titulo=STRING 
	 *         duracion=INT 
	 *         espacio=[Espacio|ID] 
	 *         genteEsperada=INT 
	 *         oradores+=[Orador|ID]* 
	 *         horario=Horario
	 *     )
	 */
	protected void sequence_Actividad(EObject context, Actividad semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {Almuerzo}
	 */
	protected void sequence_Almuerzo(EObject context, Almuerzo semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {Desayuno}
	 */
	protected void sequence_Desayuno(EObject context, Desayuno semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID capacidad=INT tieneComputadoras?='poseeComputadoras'?)
	 */
	protected void sequence_Espacio(EObject context, Espacio semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (espacios+=Espacio*)
	 */
	protected void sequence_Espacios(EObject context, Espacios semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (hora=INT minutos=INT)
	 */
	protected void sequence_Horario(EObject context, Horario semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PdcPackage.Literals.HORARIO__HORA) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PdcPackage.Literals.HORARIO__HORA));
			if(transientValues.isValueTransient(semanticObject, PdcPackage.Literals.HORARIO__MINUTOS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PdcPackage.Literals.HORARIO__MINUTOS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getHorarioAccess().getHoraINTTerminalRuleCall_2_0(), semanticObject.getHora());
		feeder.accept(grammarAccess.getHorarioAccess().getMinutosINTTerminalRuleCall_4_0(), semanticObject.getMinutos());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     {Merienda}
	 */
	protected void sequence_Merienda(EObject context, Merienda semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID organizacion=[Organizacion|ID])
	 */
	protected void sequence_Orador(EObject context, Orador semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PdcPackage.Literals.ORADOR__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PdcPackage.Literals.ORADOR__NAME));
			if(transientValues.isValueTransient(semanticObject, PdcPackage.Literals.ORADOR__ORGANIZACION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PdcPackage.Literals.ORADOR__ORGANIZACION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getOradorAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getOradorAccess().getOrganizacionOrganizacionIDTerminalRuleCall_3_0_1(), semanticObject.getOrganizacion());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (oradores+=Orador*)
	 */
	protected void sequence_Oradores(EObject context, Oradores semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Organizacion(EObject context, Organizacion semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PdcPackage.Literals.ORGANIZACION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PdcPackage.Literals.ORGANIZACION__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getOrganizacionAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (organizaciones+=Organizacion*)
	 */
	protected void sequence_Organizaciones(EObject context, Organizaciones semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (lasOrganizaciones+=Organizaciones losOradores+=Oradores losEspacios+=Espacios losTracks+=Tracks schedule=Schedule)
	 */
	protected void sequence_PDC(EObject context, PDC semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (nombre=STRING actividades+=Actividad*)
	 */
	protected void sequence_Schedule(EObject context, Schedule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Track(EObject context, Track semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PdcPackage.Literals.TRACK__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PdcPackage.Literals.TRACK__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTrackAccess().getNameIDTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (tracks+=Track*)
	 */
	protected void sequence_Tracks(EObject context, Tracks semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
