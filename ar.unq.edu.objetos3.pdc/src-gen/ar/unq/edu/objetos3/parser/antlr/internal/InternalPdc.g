/*
* generated by Xtext
*/
grammar InternalPdc;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package ar.unq.edu.objetos3.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package ar.unq.edu.objetos3.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import ar.unq.edu.objetos3.services.PdcGrammarAccess;

}

@parser::members {

 	private PdcGrammarAccess grammarAccess;
 	
    public InternalPdcParser(TokenStream input, PdcGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "PDC";	
   	}
   	
   	@Override
   	protected PdcGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRulePDC
entryRulePDC returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getPDCRule()); }
	 iv_rulePDC=rulePDC 
	 { $current=$iv_rulePDC.current; } 
	 EOF 
;

// Rule PDC
rulePDC returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getPDCAccess().getLasOrganizacionesOrganizacionesParserRuleCall_0_0()); 
	    }
		lv_lasOrganizaciones_0_0=ruleOrganizaciones		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getPDCRule());
	        }
       		add(
       			$current, 
       			"lasOrganizaciones",
        		lv_lasOrganizaciones_0_0, 
        		"Organizaciones");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getPDCAccess().getLosOradoresOradoresParserRuleCall_1_0()); 
	    }
		lv_losOradores_1_0=ruleOradores		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getPDCRule());
	        }
       		add(
       			$current, 
       			"losOradores",
        		lv_losOradores_1_0, 
        		"Oradores");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getPDCAccess().getLosEspaciosEspaciosParserRuleCall_2_0()); 
	    }
		lv_losEspacios_2_0=ruleEspacios		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getPDCRule());
	        }
       		add(
       			$current, 
       			"losEspacios",
        		lv_losEspacios_2_0, 
        		"Espacios");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getPDCAccess().getLosTracksTracksParserRuleCall_3_0()); 
	    }
		lv_losTracks_3_0=ruleTracks		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getPDCRule());
	        }
       		add(
       			$current, 
       			"losTracks",
        		lv_losTracks_3_0, 
        		"Tracks");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getPDCAccess().getScheduleScheduleParserRuleCall_4_0()); 
	    }
		lv_schedule_4_0=ruleSchedule		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getPDCRule());
	        }
       		set(
       			$current, 
       			"schedule",
        		lv_schedule_4_0, 
        		"Schedule");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleOrganizaciones
entryRuleOrganizaciones returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getOrganizacionesRule()); }
	 iv_ruleOrganizaciones=ruleOrganizaciones 
	 { $current=$iv_ruleOrganizaciones.current; } 
	 EOF 
;

// Rule Organizaciones
ruleOrganizaciones returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getOrganizacionesAccess().getOrganizacionesAction_0(),
            $current);
    }
)	otherlv_1='Organizaciones' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getOrganizacionesAccess().getOrganizacionesKeyword_1());
    }
	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getOrganizacionesAccess().getLeftCurlyBracketKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getOrganizacionesAccess().getOrganizacionesOrganizacionParserRuleCall_3_0()); 
	    }
		lv_organizaciones_3_0=ruleOrganizacion		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getOrganizacionesRule());
	        }
       		add(
       			$current, 
       			"organizaciones",
        		lv_organizaciones_3_0, 
        		"Organizacion");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_4='}' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getOrganizacionesAccess().getRightCurlyBracketKeyword_4());
    }
)
;





// Entry rule entryRuleOradores
entryRuleOradores returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getOradoresRule()); }
	 iv_ruleOradores=ruleOradores 
	 { $current=$iv_ruleOradores.current; } 
	 EOF 
;

// Rule Oradores
ruleOradores returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getOradoresAccess().getOradoresAction_0(),
            $current);
    }
)	otherlv_1='Oradores' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getOradoresAccess().getOradoresKeyword_1());
    }
	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getOradoresAccess().getLeftCurlyBracketKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getOradoresAccess().getOradoresOradorParserRuleCall_3_0()); 
	    }
		lv_oradores_3_0=ruleOrador		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getOradoresRule());
	        }
       		add(
       			$current, 
       			"oradores",
        		lv_oradores_3_0, 
        		"Orador");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_4='}' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getOradoresAccess().getRightCurlyBracketKeyword_4());
    }
)
;





// Entry rule entryRuleEspacios
entryRuleEspacios returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getEspaciosRule()); }
	 iv_ruleEspacios=ruleEspacios 
	 { $current=$iv_ruleEspacios.current; } 
	 EOF 
;

// Rule Espacios
ruleEspacios returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getEspaciosAccess().getEspaciosAction_0(),
            $current);
    }
)	otherlv_1='Espacios' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getEspaciosAccess().getEspaciosKeyword_1());
    }
	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getEspaciosAccess().getLeftCurlyBracketKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getEspaciosAccess().getEspaciosEspacioParserRuleCall_3_0()); 
	    }
		lv_espacios_3_0=ruleEspacio		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getEspaciosRule());
	        }
       		add(
       			$current, 
       			"espacios",
        		lv_espacios_3_0, 
        		"Espacio");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_4='}' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getEspaciosAccess().getRightCurlyBracketKeyword_4());
    }
)
;





// Entry rule entryRuleTracks
entryRuleTracks returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getTracksRule()); }
	 iv_ruleTracks=ruleTracks 
	 { $current=$iv_ruleTracks.current; } 
	 EOF 
;

// Rule Tracks
ruleTracks returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getTracksAccess().getTracksAction_0(),
            $current);
    }
)	otherlv_1='Tracks' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getTracksAccess().getTracksKeyword_1());
    }
	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getTracksAccess().getLeftCurlyBracketKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getTracksAccess().getTracksTrackParserRuleCall_3_0()); 
	    }
		lv_tracks_3_0=ruleTrack		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getTracksRule());
	        }
       		add(
       			$current, 
       			"tracks",
        		lv_tracks_3_0, 
        		"Track");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_4='}' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getTracksAccess().getRightCurlyBracketKeyword_4());
    }
)
;





// Entry rule entryRuleSchedule
entryRuleSchedule returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getScheduleRule()); }
	 iv_ruleSchedule=ruleSchedule 
	 { $current=$iv_ruleSchedule.current; } 
	 EOF 
;

// Rule Schedule
ruleSchedule returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='Schedule' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getScheduleAccess().getScheduleKeyword_0());
    }
	otherlv_1=':' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getScheduleAccess().getColonKeyword_1());
    }
(
(
		lv_nombre_2_0=RULE_STRING
		{
			newLeafNode(lv_nombre_2_0, grammarAccess.getScheduleAccess().getNombreSTRINGTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getScheduleRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"nombre",
        		lv_nombre_2_0, 
        		"STRING");
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getScheduleAccess().getActividadesActividadParserRuleCall_3_0()); 
	    }
		lv_actividades_3_0=ruleActividad		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getScheduleRule());
	        }
       		add(
       			$current, 
       			"actividades",
        		lv_actividades_3_0, 
        		"Actividad");
	        afterParserOrEnumRuleCall();
	    }

)
)*)
;





// Entry rule entryRuleOrganizacion
entryRuleOrganizacion returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getOrganizacionRule()); }
	 iv_ruleOrganizacion=ruleOrganizacion 
	 { $current=$iv_ruleOrganizacion.current; } 
	 EOF 
;

// Rule Organizacion
ruleOrganizacion returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='Organizacion' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getOrganizacionAccess().getOrganizacionKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getOrganizacionAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getOrganizacionRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
))
;





// Entry rule entryRuleOrador
entryRuleOrador returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getOradorRule()); }
	 iv_ruleOrador=ruleOrador 
	 { $current=$iv_ruleOrador.current; } 
	 EOF 
;

// Rule Orador
ruleOrador returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='Orador' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getOradorAccess().getOradorKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getOradorAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getOradorRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)	otherlv_2='de:' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getOradorAccess().getDeKeyword_2());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getOradorRule());
	        }
        }
	otherlv_3=RULE_ID
	{
		newLeafNode(otherlv_3, grammarAccess.getOradorAccess().getOrganizacionOrganizacionCrossReference_3_0()); 
	}

)
))
;





// Entry rule entryRuleEspacio
entryRuleEspacio returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getEspacioRule()); }
	 iv_ruleEspacio=ruleEspacio 
	 { $current=$iv_ruleEspacio.current; } 
	 EOF 
;

// Rule Espacio
ruleEspacio returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='Espacio' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getEspacioAccess().getEspacioKeyword_0());
    }
	otherlv_1=':' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getEspacioAccess().getColonKeyword_1());
    }
(
(
		lv_name_2_0=RULE_ID
		{
			newLeafNode(lv_name_2_0, grammarAccess.getEspacioAccess().getNameIDTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getEspacioRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"ID");
	    }

)
)	otherlv_3=',' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getEspacioAccess().getCommaKeyword_3());
    }
(
(
		lv_capacidad_4_0=RULE_INT
		{
			newLeafNode(lv_capacidad_4_0, grammarAccess.getEspacioAccess().getCapacidadINTTerminalRuleCall_4_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getEspacioRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"capacidad",
        		lv_capacidad_4_0, 
        		"INT");
	    }

)
)(
(
		lv_tieneComputadoras_5_0=	'poseeComputadoras' 
    {
        newLeafNode(lv_tieneComputadoras_5_0, grammarAccess.getEspacioAccess().getTieneComputadorasPoseeComputadorasKeyword_5_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getEspacioRule());
	        }
       		setWithLastConsumed($current, "tieneComputadoras", true, "poseeComputadoras");
	    }

)
)?)
;





// Entry rule entryRuleActividad
entryRuleActividad returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getActividadRule()); }
	 iv_ruleActividad=ruleActividad 
	 { $current=$iv_ruleActividad.current; } 
	 EOF 
;

// Rule Actividad
ruleActividad returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_esCharla_0_0=	'Charla' 
    {
        newLeafNode(lv_esCharla_0_0, grammarAccess.getActividadAccess().getEsCharlaCharlaKeyword_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getActividadRule());
	        }
       		setWithLastConsumed($current, "esCharla", true, "Charla");
	    }

)
)?(
(
		lv_esMesaDeDebate_1_0=	'Mesa de debate' 
    {
        newLeafNode(lv_esMesaDeDebate_1_0, grammarAccess.getActividadAccess().getEsMesaDeDebateMesaDeDebateKeyword_1_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getActividadRule());
	        }
       		setWithLastConsumed($current, "esMesaDeDebate", true, "Mesa de debate");
	    }

)
)?(
(
		lv_esTaller_2_0=	'Taller' 
    {
        newLeafNode(lv_esTaller_2_0, grammarAccess.getActividadAccess().getEsTallerTallerKeyword_2_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getActividadRule());
	        }
       		setWithLastConsumed($current, "esTaller", true, "Taller");
	    }

)
)?(
(
		lv_esBreak_3_0=	'Break' 
    {
        newLeafNode(lv_esBreak_3_0, grammarAccess.getActividadAccess().getEsBreakBreakKeyword_3_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getActividadRule());
	        }
       		setWithLastConsumed($current, "esBreak", true, "Break");
	    }

)
)?(
(
		lv_esEventoDeInauguracion_4_0=	'Evento de Inauguraci\u00F3n' 
    {
        newLeafNode(lv_esEventoDeInauguracion_4_0, grammarAccess.getActividadAccess().getEsEventoDeInauguracionEventoDeInauguraciNKeyword_4_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getActividadRule());
	        }
       		setWithLastConsumed($current, "esEventoDeInauguracion", true, "Evento de Inauguraci\u00F3n");
	    }

)
)?(
(
		lv_esRegistracion_5_0=	'Registracion' 
    {
        newLeafNode(lv_esRegistracion_5_0, grammarAccess.getActividadAccess().getEsRegistracionRegistracionKeyword_5_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getActividadRule());
	        }
       		setWithLastConsumed($current, "esRegistracion", true, "Registracion");
	    }

)
)?(
(
		lv_esEventoDeCierre_6_0=	'Evento de cierre' 
    {
        newLeafNode(lv_esEventoDeCierre_6_0, grammarAccess.getActividadAccess().getEsEventoDeCierreEventoDeCierreKeyword_6_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getActividadRule());
	        }
       		setWithLastConsumed($current, "esEventoDeCierre", true, "Evento de cierre");
	    }

)
)?(
(
		lv_keynote_7_0=	'Keynote' 
    {
        newLeafNode(lv_keynote_7_0, grammarAccess.getActividadAccess().getKeynoteKeynoteKeyword_7_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getActividadRule());
	        }
       		setWithLastConsumed($current, "keynote", true, "Keynote");
	    }

)
)?(
(
		{ 
	        newCompositeNode(grammarAccess.getActividadAccess().getTipoDeBreakTipoDeBreakParserRuleCall_8_0()); 
	    }
		lv_tipoDeBreak_8_0=ruleTipoDeBreak		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getActividadRule());
	        }
       		set(
       			$current, 
       			"tipoDeBreak",
        		lv_tipoDeBreak_8_0, 
        		"TipoDeBreak");
	        afterParserOrEnumRuleCall();
	    }

)
)?(	otherlv_9='parte de ' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getActividadAccess().getParteDeKeyword_9_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getActividadRule());
	        }
        }
	otherlv_10=RULE_ID
	{
		newLeafNode(otherlv_10, grammarAccess.getActividadAccess().getTrackTrackCrossReference_9_1_0()); 
	}

)
))?	otherlv_11=',' 
    {
    	newLeafNode(otherlv_11, grammarAccess.getActividadAccess().getCommaKeyword_10());
    }
(
(
		lv_titulo_12_0=RULE_STRING
		{
			newLeafNode(lv_titulo_12_0, grammarAccess.getActividadAccess().getTituloSTRINGTerminalRuleCall_11_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getActividadRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"titulo",
        		lv_titulo_12_0, 
        		"STRING");
	    }

)
)	otherlv_13=',' 
    {
    	newLeafNode(otherlv_13, grammarAccess.getActividadAccess().getCommaKeyword_12());
    }
	otherlv_14='Duracion:' 
    {
    	newLeafNode(otherlv_14, grammarAccess.getActividadAccess().getDuracionKeyword_13());
    }
(
(
		lv_duracion_15_0=RULE_INT
		{
			newLeafNode(lv_duracion_15_0, grammarAccess.getActividadAccess().getDuracionINTTerminalRuleCall_14_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getActividadRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"duracion",
        		lv_duracion_15_0, 
        		"INT");
	    }

)
)	otherlv_16=',' 
    {
    	newLeafNode(otherlv_16, grammarAccess.getActividadAccess().getCommaKeyword_15());
    }
	otherlv_17='Lugar:' 
    {
    	newLeafNode(otherlv_17, grammarAccess.getActividadAccess().getLugarKeyword_16());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getActividadRule());
	        }
        }
	otherlv_18=RULE_ID
	{
		newLeafNode(otherlv_18, grammarAccess.getActividadAccess().getEspacioEspacioCrossReference_17_0()); 
	}

)
)	otherlv_19=',' 
    {
    	newLeafNode(otherlv_19, grammarAccess.getActividadAccess().getCommaKeyword_18());
    }
	otherlv_20='Gente esperada:' 
    {
    	newLeafNode(otherlv_20, grammarAccess.getActividadAccess().getGenteEsperadaKeyword_19());
    }
(
(
		lv_genteEsperada_21_0=RULE_INT
		{
			newLeafNode(lv_genteEsperada_21_0, grammarAccess.getActividadAccess().getGenteEsperadaINTTerminalRuleCall_20_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getActividadRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"genteEsperada",
        		lv_genteEsperada_21_0, 
        		"INT");
	    }

)
)(	otherlv_22=',' 
    {
    	newLeafNode(otherlv_22, grammarAccess.getActividadAccess().getCommaKeyword_21_0());
    }
	otherlv_23='Oradores:' 
    {
    	newLeafNode(otherlv_23, grammarAccess.getActividadAccess().getOradoresKeyword_21_1());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getActividadRule());
	        }
        }
	otherlv_24=RULE_ID
	{
		newLeafNode(otherlv_24, grammarAccess.getActividadAccess().getOradoresOradorCrossReference_21_2_0()); 
	}

)
)*)?	otherlv_25=',' 
    {
    	newLeafNode(otherlv_25, grammarAccess.getActividadAccess().getCommaKeyword_22());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getActividadAccess().getHorarioHorarioParserRuleCall_23_0()); 
	    }
		lv_horario_26_0=ruleHorario		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getActividadRule());
	        }
       		set(
       			$current, 
       			"horario",
        		lv_horario_26_0, 
        		"Horario");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleTipoDeBreak
entryRuleTipoDeBreak returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getTipoDeBreakRule()); }
	 iv_ruleTipoDeBreak=ruleTipoDeBreak 
	 { $current=$iv_ruleTipoDeBreak.current; } 
	 EOF 
;

// Rule TipoDeBreak
ruleTipoDeBreak returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getTipoDeBreakAccess().getDesayunoParserRuleCall_0()); 
    }
    this_Desayuno_0=ruleDesayuno
    { 
        $current = $this_Desayuno_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getTipoDeBreakAccess().getAlmuerzoParserRuleCall_1()); 
    }
    this_Almuerzo_1=ruleAlmuerzo
    { 
        $current = $this_Almuerzo_1.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getTipoDeBreakAccess().getMeriendaParserRuleCall_2()); 
    }
    this_Merienda_2=ruleMerienda
    { 
        $current = $this_Merienda_2.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleDesayuno
entryRuleDesayuno returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getDesayunoRule()); }
	 iv_ruleDesayuno=ruleDesayuno 
	 { $current=$iv_ruleDesayuno.current; } 
	 EOF 
;

// Rule Desayuno
ruleDesayuno returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getDesayunoAccess().getDesayunoAction_0(),
            $current);
    }
)	otherlv_1='Desayuno' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getDesayunoAccess().getDesayunoKeyword_1());
    }
)
;





// Entry rule entryRuleAlmuerzo
entryRuleAlmuerzo returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getAlmuerzoRule()); }
	 iv_ruleAlmuerzo=ruleAlmuerzo 
	 { $current=$iv_ruleAlmuerzo.current; } 
	 EOF 
;

// Rule Almuerzo
ruleAlmuerzo returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getAlmuerzoAccess().getAlmuerzoAction_0(),
            $current);
    }
)	otherlv_1='Almuerzo' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getAlmuerzoAccess().getAlmuerzoKeyword_1());
    }
)
;





// Entry rule entryRuleMerienda
entryRuleMerienda returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMeriendaRule()); }
	 iv_ruleMerienda=ruleMerienda 
	 { $current=$iv_ruleMerienda.current; } 
	 EOF 
;

// Rule Merienda
ruleMerienda returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getMeriendaAccess().getMeriendaAction_0(),
            $current);
    }
)	otherlv_1='Merienda' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getMeriendaAccess().getMeriendaKeyword_1());
    }
)
;





// Entry rule entryRuleHorario
entryRuleHorario returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getHorarioRule()); }
	 iv_ruleHorario=ruleHorario 
	 { $current=$iv_ruleHorario.current; } 
	 EOF 
;

// Rule Horario
ruleHorario returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='Horario' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getHorarioAccess().getHorarioKeyword_0());
    }
	otherlv_1='(' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getHorarioAccess().getLeftParenthesisKeyword_1());
    }
(
(
		lv_hora_2_0=RULE_INT
		{
			newLeafNode(lv_hora_2_0, grammarAccess.getHorarioAccess().getHoraINTTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getHorarioRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"hora",
        		lv_hora_2_0, 
        		"INT");
	    }

)
)	otherlv_3=':' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getHorarioAccess().getColonKeyword_3());
    }
(
(
		lv_minutos_4_0=RULE_INT
		{
			newLeafNode(lv_minutos_4_0, grammarAccess.getHorarioAccess().getMinutosINTTerminalRuleCall_4_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getHorarioRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"minutos",
        		lv_minutos_4_0, 
        		"INT");
	    }

)
)	otherlv_5=')' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getHorarioAccess().getRightParenthesisKeyword_5());
    }
)
;





// Entry rule entryRuleTrack
entryRuleTrack returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getTrackRule()); }
	 iv_ruleTrack=ruleTrack 
	 { $current=$iv_ruleTrack.current; } 
	 EOF 
;

// Rule Track
ruleTrack returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getTrackAccess().getTrackAction_0(),
            $current);
    }
)	otherlv_1='Track' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getTrackAccess().getTrackKeyword_1());
    }
(
(
		lv_name_2_0=RULE_ID
		{
			newLeafNode(lv_name_2_0, grammarAccess.getTrackAccess().getNameIDTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTrackRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"ID");
	    }

)
))
;





RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


