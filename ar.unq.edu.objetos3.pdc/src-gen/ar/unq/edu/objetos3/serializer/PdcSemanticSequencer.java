package ar.unq.edu.objetos3.serializer;

import ar.unq.edu.objetos3.pdc.Actividad;
import ar.unq.edu.objetos3.pdc.Charla;
import ar.unq.edu.objetos3.pdc.Espacio;
import ar.unq.edu.objetos3.pdc.Hora;
import ar.unq.edu.objetos3.pdc.MesaDeDebate;
import ar.unq.edu.objetos3.pdc.Orador;
import ar.unq.edu.objetos3.pdc.Organizacion;
import ar.unq.edu.objetos3.pdc.PdcPackage;
import ar.unq.edu.objetos3.pdc.Schedule;
import ar.unq.edu.objetos3.pdc.Taller;
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
			case PdcPackage.CHARLA:
				if(context == grammarAccess.getCharlaRule() ||
				   context == grammarAccess.getTipoDeActividadRule()) {
					sequence_Charla(context, (Charla) semanticObject); 
					return; 
				}
				else break;
			case PdcPackage.ESPACIO:
				if(context == grammarAccess.getEspacioRule()) {
					sequence_Espacio(context, (Espacio) semanticObject); 
					return; 
				}
				else break;
			case PdcPackage.HORA:
				if(context == grammarAccess.getHoraRule()) {
					sequence_Hora(context, (Hora) semanticObject); 
					return; 
				}
				else break;
			case PdcPackage.MESA_DE_DEBATE:
				if(context == grammarAccess.getMesaDeDebateRule() ||
				   context == grammarAccess.getTipoDeActividadRule()) {
					sequence_MesaDeDebate(context, (MesaDeDebate) semanticObject); 
					return; 
				}
				else break;
			case PdcPackage.ORADOR:
				if(context == grammarAccess.getOradorRule()) {
					sequence_Orador(context, (Orador) semanticObject); 
					return; 
				}
				else break;
			case PdcPackage.ORGANIZACION:
				if(context == grammarAccess.getOrganizacionRule()) {
					sequence_Organizacion(context, (Organizacion) semanticObject); 
					return; 
				}
				else break;
			case PdcPackage.SCHEDULE:
				if(context == grammarAccess.getScheduleRule()) {
					sequence_Schedule(context, (Schedule) semanticObject); 
					return; 
				}
				else break;
			case PdcPackage.TALLER:
				if(context == grammarAccess.getTallerRule() ||
				   context == grammarAccess.getTipoDeActividadRule()) {
					sequence_Taller(context, (Taller) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (
	 *         tipo=TipoDeActividad 
	 *         titulo=STRING 
	 *         duracion=INT 
	 *         espacio=Espacio 
	 *         genteEsperada=INT 
	 *         oradores+=Orador* 
	 *         horario=Hora
	 *     )
	 */
	protected void sequence_Actividad(EObject context, Actividad semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {Charla}
	 */
	protected void sequence_Charla(EObject context, Charla semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (nombre=STRING capacidad=INT)
	 */
	protected void sequence_Espacio(EObject context, Espacio semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PdcPackage.Literals.ESPACIO__NOMBRE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PdcPackage.Literals.ESPACIO__NOMBRE));
			if(transientValues.isValueTransient(semanticObject, PdcPackage.Literals.ESPACIO__CAPACIDAD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PdcPackage.Literals.ESPACIO__CAPACIDAD));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEspacioAccess().getNombreSTRINGTerminalRuleCall_2_0(), semanticObject.getNombre());
		feeder.accept(grammarAccess.getEspacioAccess().getCapacidadINTTerminalRuleCall_4_0(), semanticObject.getCapacidad());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (hora=INT minutos=INT)
	 */
	protected void sequence_Hora(EObject context, Hora semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PdcPackage.Literals.HORA__HORA) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PdcPackage.Literals.HORA__HORA));
			if(transientValues.isValueTransient(semanticObject, PdcPackage.Literals.HORA__MINUTOS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PdcPackage.Literals.HORA__MINUTOS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getHoraAccess().getHoraINTTerminalRuleCall_2_0(), semanticObject.getHora());
		feeder.accept(grammarAccess.getHoraAccess().getMinutosINTTerminalRuleCall_4_0(), semanticObject.getMinutos());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     {MesaDeDebate}
	 */
	protected void sequence_MesaDeDebate(EObject context, MesaDeDebate semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (nombre=STRING organizacion=Organizacion)
	 */
	protected void sequence_Orador(EObject context, Orador semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PdcPackage.Literals.ORADOR__NOMBRE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PdcPackage.Literals.ORADOR__NOMBRE));
			if(transientValues.isValueTransient(semanticObject, PdcPackage.Literals.ORADOR__ORGANIZACION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PdcPackage.Literals.ORADOR__ORGANIZACION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getOradorAccess().getNombreSTRINGTerminalRuleCall_1_0(), semanticObject.getNombre());
		feeder.accept(grammarAccess.getOradorAccess().getOrganizacionOrganizacionParserRuleCall_3_0(), semanticObject.getOrganizacion());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     nombre=STRING
	 */
	protected void sequence_Organizacion(EObject context, Organizacion semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PdcPackage.Literals.ORGANIZACION__NOMBRE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PdcPackage.Literals.ORGANIZACION__NOMBRE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getOrganizacionAccess().getNombreSTRINGTerminalRuleCall_1_0(), semanticObject.getNombre());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (nombre=STRING actividades+=Actividad* fin='/Fin del schedule')
	 */
	protected void sequence_Schedule(EObject context, Schedule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {Taller}
	 */
	protected void sequence_Taller(EObject context, Taller semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
