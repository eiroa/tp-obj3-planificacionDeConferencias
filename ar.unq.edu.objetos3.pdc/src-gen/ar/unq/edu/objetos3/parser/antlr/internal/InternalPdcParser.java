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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPdcParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Organizaciones'", "'{'", "'}'", "'Oradores'", "'Espacios'", "'Tracks'", "'Schedule'", "':'", "'Organizacion'", "'Orador'", "'de:'", "'Espacio'", "','", "'poseeComputadoras'", "'Charla'", "'Mesa de debate'", "'Taller'", "'Break'", "'Evento de Inauguraci\\u00F3n'", "'Registracion'", "'Evento de cierre'", "'Keynote'", "'parte de '", "'Duracion:'", "'Lugar:'", "'Gente esperada:'", "'Oradores:'", "'Desayuno'", "'Almuerzo'", "'Merienda'", "'Horario'", "'('", "')'", "'Track'"
    };
    public static final int RULE_ID=5;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__44=44;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=4;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalPdcParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPdcParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPdcParser.tokenNames; }
    public String getGrammarFileName() { return "../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g"; }



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



    // $ANTLR start "entryRulePDC"
    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:67:1: entryRulePDC returns [EObject current=null] : iv_rulePDC= rulePDC EOF ;
    public final EObject entryRulePDC() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePDC = null;


        try {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:68:2: (iv_rulePDC= rulePDC EOF )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:69:2: iv_rulePDC= rulePDC EOF
            {
             newCompositeNode(grammarAccess.getPDCRule()); 
            pushFollow(FOLLOW_rulePDC_in_entryRulePDC75);
            iv_rulePDC=rulePDC();

            state._fsp--;

             current =iv_rulePDC; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePDC85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePDC"


    // $ANTLR start "rulePDC"
    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:76:1: rulePDC returns [EObject current=null] : ( ( (lv_lasOrganizaciones_0_0= ruleOrganizaciones ) ) ( (lv_losOradores_1_0= ruleOradores ) ) ( (lv_losEspacios_2_0= ruleEspacios ) ) ( (lv_losTracks_3_0= ruleTracks ) ) ( (lv_schedule_4_0= ruleSchedule ) ) ) ;
    public final EObject rulePDC() throws RecognitionException {
        EObject current = null;

        EObject lv_lasOrganizaciones_0_0 = null;

        EObject lv_losOradores_1_0 = null;

        EObject lv_losEspacios_2_0 = null;

        EObject lv_losTracks_3_0 = null;

        EObject lv_schedule_4_0 = null;


         enterRule(); 
            
        try {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:79:28: ( ( ( (lv_lasOrganizaciones_0_0= ruleOrganizaciones ) ) ( (lv_losOradores_1_0= ruleOradores ) ) ( (lv_losEspacios_2_0= ruleEspacios ) ) ( (lv_losTracks_3_0= ruleTracks ) ) ( (lv_schedule_4_0= ruleSchedule ) ) ) )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:80:1: ( ( (lv_lasOrganizaciones_0_0= ruleOrganizaciones ) ) ( (lv_losOradores_1_0= ruleOradores ) ) ( (lv_losEspacios_2_0= ruleEspacios ) ) ( (lv_losTracks_3_0= ruleTracks ) ) ( (lv_schedule_4_0= ruleSchedule ) ) )
            {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:80:1: ( ( (lv_lasOrganizaciones_0_0= ruleOrganizaciones ) ) ( (lv_losOradores_1_0= ruleOradores ) ) ( (lv_losEspacios_2_0= ruleEspacios ) ) ( (lv_losTracks_3_0= ruleTracks ) ) ( (lv_schedule_4_0= ruleSchedule ) ) )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:80:2: ( (lv_lasOrganizaciones_0_0= ruleOrganizaciones ) ) ( (lv_losOradores_1_0= ruleOradores ) ) ( (lv_losEspacios_2_0= ruleEspacios ) ) ( (lv_losTracks_3_0= ruleTracks ) ) ( (lv_schedule_4_0= ruleSchedule ) )
            {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:80:2: ( (lv_lasOrganizaciones_0_0= ruleOrganizaciones ) )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:81:1: (lv_lasOrganizaciones_0_0= ruleOrganizaciones )
            {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:81:1: (lv_lasOrganizaciones_0_0= ruleOrganizaciones )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:82:3: lv_lasOrganizaciones_0_0= ruleOrganizaciones
            {
             
            	        newCompositeNode(grammarAccess.getPDCAccess().getLasOrganizacionesOrganizacionesParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleOrganizaciones_in_rulePDC131);
            lv_lasOrganizaciones_0_0=ruleOrganizaciones();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPDCRule());
            	        }
                   		add(
                   			current, 
                   			"lasOrganizaciones",
                    		lv_lasOrganizaciones_0_0, 
                    		"Organizaciones");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:98:2: ( (lv_losOradores_1_0= ruleOradores ) )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:99:1: (lv_losOradores_1_0= ruleOradores )
            {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:99:1: (lv_losOradores_1_0= ruleOradores )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:100:3: lv_losOradores_1_0= ruleOradores
            {
             
            	        newCompositeNode(grammarAccess.getPDCAccess().getLosOradoresOradoresParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleOradores_in_rulePDC152);
            lv_losOradores_1_0=ruleOradores();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPDCRule());
            	        }
                   		add(
                   			current, 
                   			"losOradores",
                    		lv_losOradores_1_0, 
                    		"Oradores");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:116:2: ( (lv_losEspacios_2_0= ruleEspacios ) )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:117:1: (lv_losEspacios_2_0= ruleEspacios )
            {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:117:1: (lv_losEspacios_2_0= ruleEspacios )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:118:3: lv_losEspacios_2_0= ruleEspacios
            {
             
            	        newCompositeNode(grammarAccess.getPDCAccess().getLosEspaciosEspaciosParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleEspacios_in_rulePDC173);
            lv_losEspacios_2_0=ruleEspacios();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPDCRule());
            	        }
                   		add(
                   			current, 
                   			"losEspacios",
                    		lv_losEspacios_2_0, 
                    		"Espacios");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:134:2: ( (lv_losTracks_3_0= ruleTracks ) )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:135:1: (lv_losTracks_3_0= ruleTracks )
            {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:135:1: (lv_losTracks_3_0= ruleTracks )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:136:3: lv_losTracks_3_0= ruleTracks
            {
             
            	        newCompositeNode(grammarAccess.getPDCAccess().getLosTracksTracksParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleTracks_in_rulePDC194);
            lv_losTracks_3_0=ruleTracks();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPDCRule());
            	        }
                   		add(
                   			current, 
                   			"losTracks",
                    		lv_losTracks_3_0, 
                    		"Tracks");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:152:2: ( (lv_schedule_4_0= ruleSchedule ) )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:153:1: (lv_schedule_4_0= ruleSchedule )
            {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:153:1: (lv_schedule_4_0= ruleSchedule )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:154:3: lv_schedule_4_0= ruleSchedule
            {
             
            	        newCompositeNode(grammarAccess.getPDCAccess().getScheduleScheduleParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleSchedule_in_rulePDC215);
            lv_schedule_4_0=ruleSchedule();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPDCRule());
            	        }
                   		set(
                   			current, 
                   			"schedule",
                    		lv_schedule_4_0, 
                    		"Schedule");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePDC"


    // $ANTLR start "entryRuleOrganizaciones"
    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:178:1: entryRuleOrganizaciones returns [EObject current=null] : iv_ruleOrganizaciones= ruleOrganizaciones EOF ;
    public final EObject entryRuleOrganizaciones() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrganizaciones = null;


        try {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:179:2: (iv_ruleOrganizaciones= ruleOrganizaciones EOF )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:180:2: iv_ruleOrganizaciones= ruleOrganizaciones EOF
            {
             newCompositeNode(grammarAccess.getOrganizacionesRule()); 
            pushFollow(FOLLOW_ruleOrganizaciones_in_entryRuleOrganizaciones251);
            iv_ruleOrganizaciones=ruleOrganizaciones();

            state._fsp--;

             current =iv_ruleOrganizaciones; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrganizaciones261); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOrganizaciones"


    // $ANTLR start "ruleOrganizaciones"
    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:187:1: ruleOrganizaciones returns [EObject current=null] : ( () otherlv_1= 'Organizaciones' otherlv_2= '{' ( (lv_organizaciones_3_0= ruleOrganizacion ) )* otherlv_4= '}' ) ;
    public final EObject ruleOrganizaciones() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_organizaciones_3_0 = null;


         enterRule(); 
            
        try {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:190:28: ( ( () otherlv_1= 'Organizaciones' otherlv_2= '{' ( (lv_organizaciones_3_0= ruleOrganizacion ) )* otherlv_4= '}' ) )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:191:1: ( () otherlv_1= 'Organizaciones' otherlv_2= '{' ( (lv_organizaciones_3_0= ruleOrganizacion ) )* otherlv_4= '}' )
            {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:191:1: ( () otherlv_1= 'Organizaciones' otherlv_2= '{' ( (lv_organizaciones_3_0= ruleOrganizacion ) )* otherlv_4= '}' )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:191:2: () otherlv_1= 'Organizaciones' otherlv_2= '{' ( (lv_organizaciones_3_0= ruleOrganizacion ) )* otherlv_4= '}'
            {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:191:2: ()
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:192:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getOrganizacionesAccess().getOrganizacionesAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,11,FOLLOW_11_in_ruleOrganizaciones307); 

                	newLeafNode(otherlv_1, grammarAccess.getOrganizacionesAccess().getOrganizacionesKeyword_1());
                
            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleOrganizaciones319); 

                	newLeafNode(otherlv_2, grammarAccess.getOrganizacionesAccess().getLeftCurlyBracketKeyword_2());
                
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:205:1: ( (lv_organizaciones_3_0= ruleOrganizacion ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==19) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:206:1: (lv_organizaciones_3_0= ruleOrganizacion )
            	    {
            	    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:206:1: (lv_organizaciones_3_0= ruleOrganizacion )
            	    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:207:3: lv_organizaciones_3_0= ruleOrganizacion
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOrganizacionesAccess().getOrganizacionesOrganizacionParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleOrganizacion_in_ruleOrganizaciones340);
            	    lv_organizaciones_3_0=ruleOrganizacion();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getOrganizacionesRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"organizaciones",
            	            		lv_organizaciones_3_0, 
            	            		"Organizacion");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleOrganizaciones353); 

                	newLeafNode(otherlv_4, grammarAccess.getOrganizacionesAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOrganizaciones"


    // $ANTLR start "entryRuleOradores"
    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:235:1: entryRuleOradores returns [EObject current=null] : iv_ruleOradores= ruleOradores EOF ;
    public final EObject entryRuleOradores() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOradores = null;


        try {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:236:2: (iv_ruleOradores= ruleOradores EOF )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:237:2: iv_ruleOradores= ruleOradores EOF
            {
             newCompositeNode(grammarAccess.getOradoresRule()); 
            pushFollow(FOLLOW_ruleOradores_in_entryRuleOradores389);
            iv_ruleOradores=ruleOradores();

            state._fsp--;

             current =iv_ruleOradores; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOradores399); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOradores"


    // $ANTLR start "ruleOradores"
    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:244:1: ruleOradores returns [EObject current=null] : ( () otherlv_1= 'Oradores' otherlv_2= '{' ( (lv_oradores_3_0= ruleOrador ) )* otherlv_4= '}' ) ;
    public final EObject ruleOradores() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_oradores_3_0 = null;


         enterRule(); 
            
        try {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:247:28: ( ( () otherlv_1= 'Oradores' otherlv_2= '{' ( (lv_oradores_3_0= ruleOrador ) )* otherlv_4= '}' ) )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:248:1: ( () otherlv_1= 'Oradores' otherlv_2= '{' ( (lv_oradores_3_0= ruleOrador ) )* otherlv_4= '}' )
            {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:248:1: ( () otherlv_1= 'Oradores' otherlv_2= '{' ( (lv_oradores_3_0= ruleOrador ) )* otherlv_4= '}' )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:248:2: () otherlv_1= 'Oradores' otherlv_2= '{' ( (lv_oradores_3_0= ruleOrador ) )* otherlv_4= '}'
            {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:248:2: ()
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:249:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getOradoresAccess().getOradoresAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleOradores445); 

                	newLeafNode(otherlv_1, grammarAccess.getOradoresAccess().getOradoresKeyword_1());
                
            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleOradores457); 

                	newLeafNode(otherlv_2, grammarAccess.getOradoresAccess().getLeftCurlyBracketKeyword_2());
                
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:262:1: ( (lv_oradores_3_0= ruleOrador ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==20) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:263:1: (lv_oradores_3_0= ruleOrador )
            	    {
            	    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:263:1: (lv_oradores_3_0= ruleOrador )
            	    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:264:3: lv_oradores_3_0= ruleOrador
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOradoresAccess().getOradoresOradorParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleOrador_in_ruleOradores478);
            	    lv_oradores_3_0=ruleOrador();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getOradoresRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"oradores",
            	            		lv_oradores_3_0, 
            	            		"Orador");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleOradores491); 

                	newLeafNode(otherlv_4, grammarAccess.getOradoresAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOradores"


    // $ANTLR start "entryRuleEspacios"
    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:292:1: entryRuleEspacios returns [EObject current=null] : iv_ruleEspacios= ruleEspacios EOF ;
    public final EObject entryRuleEspacios() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEspacios = null;


        try {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:293:2: (iv_ruleEspacios= ruleEspacios EOF )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:294:2: iv_ruleEspacios= ruleEspacios EOF
            {
             newCompositeNode(grammarAccess.getEspaciosRule()); 
            pushFollow(FOLLOW_ruleEspacios_in_entryRuleEspacios527);
            iv_ruleEspacios=ruleEspacios();

            state._fsp--;

             current =iv_ruleEspacios; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEspacios537); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEspacios"


    // $ANTLR start "ruleEspacios"
    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:301:1: ruleEspacios returns [EObject current=null] : ( () otherlv_1= 'Espacios' otherlv_2= '{' ( (lv_espacios_3_0= ruleEspacio ) )* otherlv_4= '}' ) ;
    public final EObject ruleEspacios() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_espacios_3_0 = null;


         enterRule(); 
            
        try {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:304:28: ( ( () otherlv_1= 'Espacios' otherlv_2= '{' ( (lv_espacios_3_0= ruleEspacio ) )* otherlv_4= '}' ) )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:305:1: ( () otherlv_1= 'Espacios' otherlv_2= '{' ( (lv_espacios_3_0= ruleEspacio ) )* otherlv_4= '}' )
            {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:305:1: ( () otherlv_1= 'Espacios' otherlv_2= '{' ( (lv_espacios_3_0= ruleEspacio ) )* otherlv_4= '}' )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:305:2: () otherlv_1= 'Espacios' otherlv_2= '{' ( (lv_espacios_3_0= ruleEspacio ) )* otherlv_4= '}'
            {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:305:2: ()
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:306:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEspaciosAccess().getEspaciosAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleEspacios583); 

                	newLeafNode(otherlv_1, grammarAccess.getEspaciosAccess().getEspaciosKeyword_1());
                
            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleEspacios595); 

                	newLeafNode(otherlv_2, grammarAccess.getEspaciosAccess().getLeftCurlyBracketKeyword_2());
                
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:319:1: ( (lv_espacios_3_0= ruleEspacio ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==22) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:320:1: (lv_espacios_3_0= ruleEspacio )
            	    {
            	    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:320:1: (lv_espacios_3_0= ruleEspacio )
            	    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:321:3: lv_espacios_3_0= ruleEspacio
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEspaciosAccess().getEspaciosEspacioParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEspacio_in_ruleEspacios616);
            	    lv_espacios_3_0=ruleEspacio();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEspaciosRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"espacios",
            	            		lv_espacios_3_0, 
            	            		"Espacio");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleEspacios629); 

                	newLeafNode(otherlv_4, grammarAccess.getEspaciosAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEspacios"


    // $ANTLR start "entryRuleTracks"
    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:349:1: entryRuleTracks returns [EObject current=null] : iv_ruleTracks= ruleTracks EOF ;
    public final EObject entryRuleTracks() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTracks = null;


        try {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:350:2: (iv_ruleTracks= ruleTracks EOF )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:351:2: iv_ruleTracks= ruleTracks EOF
            {
             newCompositeNode(grammarAccess.getTracksRule()); 
            pushFollow(FOLLOW_ruleTracks_in_entryRuleTracks665);
            iv_ruleTracks=ruleTracks();

            state._fsp--;

             current =iv_ruleTracks; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTracks675); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTracks"


    // $ANTLR start "ruleTracks"
    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:358:1: ruleTracks returns [EObject current=null] : ( () otherlv_1= 'Tracks' otherlv_2= '{' ( (lv_tracks_3_0= ruleTrack ) )* otherlv_4= '}' ) ;
    public final EObject ruleTracks() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_tracks_3_0 = null;


         enterRule(); 
            
        try {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:361:28: ( ( () otherlv_1= 'Tracks' otherlv_2= '{' ( (lv_tracks_3_0= ruleTrack ) )* otherlv_4= '}' ) )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:362:1: ( () otherlv_1= 'Tracks' otherlv_2= '{' ( (lv_tracks_3_0= ruleTrack ) )* otherlv_4= '}' )
            {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:362:1: ( () otherlv_1= 'Tracks' otherlv_2= '{' ( (lv_tracks_3_0= ruleTrack ) )* otherlv_4= '}' )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:362:2: () otherlv_1= 'Tracks' otherlv_2= '{' ( (lv_tracks_3_0= ruleTrack ) )* otherlv_4= '}'
            {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:362:2: ()
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:363:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTracksAccess().getTracksAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleTracks721); 

                	newLeafNode(otherlv_1, grammarAccess.getTracksAccess().getTracksKeyword_1());
                
            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleTracks733); 

                	newLeafNode(otherlv_2, grammarAccess.getTracksAccess().getLeftCurlyBracketKeyword_2());
                
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:376:1: ( (lv_tracks_3_0= ruleTrack ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==44) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:377:1: (lv_tracks_3_0= ruleTrack )
            	    {
            	    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:377:1: (lv_tracks_3_0= ruleTrack )
            	    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:378:3: lv_tracks_3_0= ruleTrack
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTracksAccess().getTracksTrackParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTrack_in_ruleTracks754);
            	    lv_tracks_3_0=ruleTrack();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTracksRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"tracks",
            	            		lv_tracks_3_0, 
            	            		"Track");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleTracks767); 

                	newLeafNode(otherlv_4, grammarAccess.getTracksAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTracks"


    // $ANTLR start "entryRuleSchedule"
    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:406:1: entryRuleSchedule returns [EObject current=null] : iv_ruleSchedule= ruleSchedule EOF ;
    public final EObject entryRuleSchedule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchedule = null;


        try {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:407:2: (iv_ruleSchedule= ruleSchedule EOF )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:408:2: iv_ruleSchedule= ruleSchedule EOF
            {
             newCompositeNode(grammarAccess.getScheduleRule()); 
            pushFollow(FOLLOW_ruleSchedule_in_entryRuleSchedule803);
            iv_ruleSchedule=ruleSchedule();

            state._fsp--;

             current =iv_ruleSchedule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchedule813); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSchedule"


    // $ANTLR start "ruleSchedule"
    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:415:1: ruleSchedule returns [EObject current=null] : (otherlv_0= 'Schedule' otherlv_1= ':' ( (lv_nombre_2_0= RULE_STRING ) ) ( (lv_actividades_3_0= ruleActividad ) )* ) ;
    public final EObject ruleSchedule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_nombre_2_0=null;
        EObject lv_actividades_3_0 = null;


         enterRule(); 
            
        try {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:418:28: ( (otherlv_0= 'Schedule' otherlv_1= ':' ( (lv_nombre_2_0= RULE_STRING ) ) ( (lv_actividades_3_0= ruleActividad ) )* ) )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:419:1: (otherlv_0= 'Schedule' otherlv_1= ':' ( (lv_nombre_2_0= RULE_STRING ) ) ( (lv_actividades_3_0= ruleActividad ) )* )
            {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:419:1: (otherlv_0= 'Schedule' otherlv_1= ':' ( (lv_nombre_2_0= RULE_STRING ) ) ( (lv_actividades_3_0= ruleActividad ) )* )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:419:3: otherlv_0= 'Schedule' otherlv_1= ':' ( (lv_nombre_2_0= RULE_STRING ) ) ( (lv_actividades_3_0= ruleActividad ) )*
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleSchedule850); 

                	newLeafNode(otherlv_0, grammarAccess.getScheduleAccess().getScheduleKeyword_0());
                
            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleSchedule862); 

                	newLeafNode(otherlv_1, grammarAccess.getScheduleAccess().getColonKeyword_1());
                
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:427:1: ( (lv_nombre_2_0= RULE_STRING ) )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:428:1: (lv_nombre_2_0= RULE_STRING )
            {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:428:1: (lv_nombre_2_0= RULE_STRING )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:429:3: lv_nombre_2_0= RULE_STRING
            {
            lv_nombre_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSchedule879); 

            			newLeafNode(lv_nombre_2_0, grammarAccess.getScheduleAccess().getNombreSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getScheduleRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"nombre",
                    		lv_nombre_2_0, 
                    		"STRING");
            	    

            }


            }

            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:445:2: ( (lv_actividades_3_0= ruleActividad ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==23||(LA5_0>=25 && LA5_0<=33)||(LA5_0>=38 && LA5_0<=40)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:446:1: (lv_actividades_3_0= ruleActividad )
            	    {
            	    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:446:1: (lv_actividades_3_0= ruleActividad )
            	    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:447:3: lv_actividades_3_0= ruleActividad
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getScheduleAccess().getActividadesActividadParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleActividad_in_ruleSchedule905);
            	    lv_actividades_3_0=ruleActividad();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getScheduleRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"actividades",
            	            		lv_actividades_3_0, 
            	            		"Actividad");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSchedule"


    // $ANTLR start "entryRuleOrganizacion"
    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:471:1: entryRuleOrganizacion returns [EObject current=null] : iv_ruleOrganizacion= ruleOrganizacion EOF ;
    public final EObject entryRuleOrganizacion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrganizacion = null;


        try {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:472:2: (iv_ruleOrganizacion= ruleOrganizacion EOF )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:473:2: iv_ruleOrganizacion= ruleOrganizacion EOF
            {
             newCompositeNode(grammarAccess.getOrganizacionRule()); 
            pushFollow(FOLLOW_ruleOrganizacion_in_entryRuleOrganizacion942);
            iv_ruleOrganizacion=ruleOrganizacion();

            state._fsp--;

             current =iv_ruleOrganizacion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrganizacion952); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOrganizacion"


    // $ANTLR start "ruleOrganizacion"
    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:480:1: ruleOrganizacion returns [EObject current=null] : (otherlv_0= 'Organizacion' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleOrganizacion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:483:28: ( (otherlv_0= 'Organizacion' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:484:1: (otherlv_0= 'Organizacion' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:484:1: (otherlv_0= 'Organizacion' ( (lv_name_1_0= RULE_ID ) ) )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:484:3: otherlv_0= 'Organizacion' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleOrganizacion989); 

                	newLeafNode(otherlv_0, grammarAccess.getOrganizacionAccess().getOrganizacionKeyword_0());
                
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:488:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:489:1: (lv_name_1_0= RULE_ID )
            {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:489:1: (lv_name_1_0= RULE_ID )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:490:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOrganizacion1006); 

            			newLeafNode(lv_name_1_0, grammarAccess.getOrganizacionAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getOrganizacionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOrganizacion"


    // $ANTLR start "entryRuleOrador"
    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:514:1: entryRuleOrador returns [EObject current=null] : iv_ruleOrador= ruleOrador EOF ;
    public final EObject entryRuleOrador() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrador = null;


        try {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:515:2: (iv_ruleOrador= ruleOrador EOF )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:516:2: iv_ruleOrador= ruleOrador EOF
            {
             newCompositeNode(grammarAccess.getOradorRule()); 
            pushFollow(FOLLOW_ruleOrador_in_entryRuleOrador1047);
            iv_ruleOrador=ruleOrador();

            state._fsp--;

             current =iv_ruleOrador; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrador1057); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOrador"


    // $ANTLR start "ruleOrador"
    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:523:1: ruleOrador returns [EObject current=null] : (otherlv_0= 'Orador' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'de:' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleOrador() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:526:28: ( (otherlv_0= 'Orador' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'de:' ( (otherlv_3= RULE_ID ) ) ) )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:527:1: (otherlv_0= 'Orador' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'de:' ( (otherlv_3= RULE_ID ) ) )
            {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:527:1: (otherlv_0= 'Orador' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'de:' ( (otherlv_3= RULE_ID ) ) )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:527:3: otherlv_0= 'Orador' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'de:' ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleOrador1094); 

                	newLeafNode(otherlv_0, grammarAccess.getOradorAccess().getOradorKeyword_0());
                
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:531:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:532:1: (lv_name_1_0= RULE_ID )
            {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:532:1: (lv_name_1_0= RULE_ID )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:533:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOrador1111); 

            			newLeafNode(lv_name_1_0, grammarAccess.getOradorAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getOradorRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleOrador1128); 

                	newLeafNode(otherlv_2, grammarAccess.getOradorAccess().getDeKeyword_2());
                
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:553:1: ( (otherlv_3= RULE_ID ) )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:554:1: (otherlv_3= RULE_ID )
            {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:554:1: (otherlv_3= RULE_ID )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:555:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getOradorRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOrador1148); 

            		newLeafNode(otherlv_3, grammarAccess.getOradorAccess().getOrganizacionOrganizacionCrossReference_3_0()); 
            	

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOrador"


    // $ANTLR start "entryRuleEspacio"
    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:574:1: entryRuleEspacio returns [EObject current=null] : iv_ruleEspacio= ruleEspacio EOF ;
    public final EObject entryRuleEspacio() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEspacio = null;


        try {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:575:2: (iv_ruleEspacio= ruleEspacio EOF )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:576:2: iv_ruleEspacio= ruleEspacio EOF
            {
             newCompositeNode(grammarAccess.getEspacioRule()); 
            pushFollow(FOLLOW_ruleEspacio_in_entryRuleEspacio1184);
            iv_ruleEspacio=ruleEspacio();

            state._fsp--;

             current =iv_ruleEspacio; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEspacio1194); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEspacio"


    // $ANTLR start "ruleEspacio"
    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:583:1: ruleEspacio returns [EObject current=null] : (otherlv_0= 'Espacio' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ',' ( (lv_capacidad_4_0= RULE_INT ) ) ( (lv_tieneComputadoras_5_0= 'poseeComputadoras' ) )? ) ;
    public final EObject ruleEspacio() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_capacidad_4_0=null;
        Token lv_tieneComputadoras_5_0=null;

         enterRule(); 
            
        try {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:586:28: ( (otherlv_0= 'Espacio' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ',' ( (lv_capacidad_4_0= RULE_INT ) ) ( (lv_tieneComputadoras_5_0= 'poseeComputadoras' ) )? ) )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:587:1: (otherlv_0= 'Espacio' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ',' ( (lv_capacidad_4_0= RULE_INT ) ) ( (lv_tieneComputadoras_5_0= 'poseeComputadoras' ) )? )
            {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:587:1: (otherlv_0= 'Espacio' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ',' ( (lv_capacidad_4_0= RULE_INT ) ) ( (lv_tieneComputadoras_5_0= 'poseeComputadoras' ) )? )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:587:3: otherlv_0= 'Espacio' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ',' ( (lv_capacidad_4_0= RULE_INT ) ) ( (lv_tieneComputadoras_5_0= 'poseeComputadoras' ) )?
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleEspacio1231); 

                	newLeafNode(otherlv_0, grammarAccess.getEspacioAccess().getEspacioKeyword_0());
                
            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleEspacio1243); 

                	newLeafNode(otherlv_1, grammarAccess.getEspacioAccess().getColonKeyword_1());
                
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:595:1: ( (lv_name_2_0= RULE_ID ) )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:596:1: (lv_name_2_0= RULE_ID )
            {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:596:1: (lv_name_2_0= RULE_ID )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:597:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEspacio1260); 

            			newLeafNode(lv_name_2_0, grammarAccess.getEspacioAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEspacioRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_23_in_ruleEspacio1277); 

                	newLeafNode(otherlv_3, grammarAccess.getEspacioAccess().getCommaKeyword_3());
                
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:617:1: ( (lv_capacidad_4_0= RULE_INT ) )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:618:1: (lv_capacidad_4_0= RULE_INT )
            {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:618:1: (lv_capacidad_4_0= RULE_INT )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:619:3: lv_capacidad_4_0= RULE_INT
            {
            lv_capacidad_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEspacio1294); 

            			newLeafNode(lv_capacidad_4_0, grammarAccess.getEspacioAccess().getCapacidadINTTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEspacioRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"capacidad",
                    		lv_capacidad_4_0, 
                    		"INT");
            	    

            }


            }

            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:635:2: ( (lv_tieneComputadoras_5_0= 'poseeComputadoras' ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==24) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:636:1: (lv_tieneComputadoras_5_0= 'poseeComputadoras' )
                    {
                    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:636:1: (lv_tieneComputadoras_5_0= 'poseeComputadoras' )
                    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:637:3: lv_tieneComputadoras_5_0= 'poseeComputadoras'
                    {
                    lv_tieneComputadoras_5_0=(Token)match(input,24,FOLLOW_24_in_ruleEspacio1317); 

                            newLeafNode(lv_tieneComputadoras_5_0, grammarAccess.getEspacioAccess().getTieneComputadorasPoseeComputadorasKeyword_5_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEspacioRule());
                    	        }
                           		setWithLastConsumed(current, "tieneComputadoras", true, "poseeComputadoras");
                    	    

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEspacio"


    // $ANTLR start "entryRuleActividad"
    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:658:1: entryRuleActividad returns [EObject current=null] : iv_ruleActividad= ruleActividad EOF ;
    public final EObject entryRuleActividad() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActividad = null;


        try {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:659:2: (iv_ruleActividad= ruleActividad EOF )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:660:2: iv_ruleActividad= ruleActividad EOF
            {
             newCompositeNode(grammarAccess.getActividadRule()); 
            pushFollow(FOLLOW_ruleActividad_in_entryRuleActividad1367);
            iv_ruleActividad=ruleActividad();

            state._fsp--;

             current =iv_ruleActividad; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActividad1377); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleActividad"


    // $ANTLR start "ruleActividad"
    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:667:1: ruleActividad returns [EObject current=null] : ( ( (lv_esCharla_0_0= 'Charla' ) )? ( (lv_esMesaDeDebate_1_0= 'Mesa de debate' ) )? ( (lv_esTaller_2_0= 'Taller' ) )? ( (lv_esBreak_3_0= 'Break' ) )? ( (lv_esEventoDeInauguracion_4_0= 'Evento de Inauguraci\\u00F3n' ) )? ( (lv_esRegistracion_5_0= 'Registracion' ) )? ( (lv_esEventoDeCierre_6_0= 'Evento de cierre' ) )? ( (lv_keynote_7_0= 'Keynote' ) )? ( (lv_tipoDeBreak_8_0= ruleTipoDeBreak ) )? (otherlv_9= 'parte de ' ( (otherlv_10= RULE_ID ) ) )? otherlv_11= ',' ( (lv_titulo_12_0= RULE_STRING ) ) otherlv_13= ',' otherlv_14= 'Duracion:' ( (lv_duracion_15_0= RULE_INT ) ) otherlv_16= ',' otherlv_17= 'Lugar:' ( (otherlv_18= RULE_ID ) ) otherlv_19= ',' otherlv_20= 'Gente esperada:' ( (lv_genteEsperada_21_0= RULE_INT ) ) (otherlv_22= ',' otherlv_23= 'Oradores:' ( (otherlv_24= RULE_ID ) )* )? otherlv_25= ',' ( (lv_horario_26_0= ruleHorario ) ) ) ;
    public final EObject ruleActividad() throws RecognitionException {
        EObject current = null;

        Token lv_esCharla_0_0=null;
        Token lv_esMesaDeDebate_1_0=null;
        Token lv_esTaller_2_0=null;
        Token lv_esBreak_3_0=null;
        Token lv_esEventoDeInauguracion_4_0=null;
        Token lv_esRegistracion_5_0=null;
        Token lv_esEventoDeCierre_6_0=null;
        Token lv_keynote_7_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token lv_titulo_12_0=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token lv_duracion_15_0=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token lv_genteEsperada_21_0=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        EObject lv_tipoDeBreak_8_0 = null;

        EObject lv_horario_26_0 = null;


         enterRule(); 
            
        try {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:670:28: ( ( ( (lv_esCharla_0_0= 'Charla' ) )? ( (lv_esMesaDeDebate_1_0= 'Mesa de debate' ) )? ( (lv_esTaller_2_0= 'Taller' ) )? ( (lv_esBreak_3_0= 'Break' ) )? ( (lv_esEventoDeInauguracion_4_0= 'Evento de Inauguraci\\u00F3n' ) )? ( (lv_esRegistracion_5_0= 'Registracion' ) )? ( (lv_esEventoDeCierre_6_0= 'Evento de cierre' ) )? ( (lv_keynote_7_0= 'Keynote' ) )? ( (lv_tipoDeBreak_8_0= ruleTipoDeBreak ) )? (otherlv_9= 'parte de ' ( (otherlv_10= RULE_ID ) ) )? otherlv_11= ',' ( (lv_titulo_12_0= RULE_STRING ) ) otherlv_13= ',' otherlv_14= 'Duracion:' ( (lv_duracion_15_0= RULE_INT ) ) otherlv_16= ',' otherlv_17= 'Lugar:' ( (otherlv_18= RULE_ID ) ) otherlv_19= ',' otherlv_20= 'Gente esperada:' ( (lv_genteEsperada_21_0= RULE_INT ) ) (otherlv_22= ',' otherlv_23= 'Oradores:' ( (otherlv_24= RULE_ID ) )* )? otherlv_25= ',' ( (lv_horario_26_0= ruleHorario ) ) ) )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:671:1: ( ( (lv_esCharla_0_0= 'Charla' ) )? ( (lv_esMesaDeDebate_1_0= 'Mesa de debate' ) )? ( (lv_esTaller_2_0= 'Taller' ) )? ( (lv_esBreak_3_0= 'Break' ) )? ( (lv_esEventoDeInauguracion_4_0= 'Evento de Inauguraci\\u00F3n' ) )? ( (lv_esRegistracion_5_0= 'Registracion' ) )? ( (lv_esEventoDeCierre_6_0= 'Evento de cierre' ) )? ( (lv_keynote_7_0= 'Keynote' ) )? ( (lv_tipoDeBreak_8_0= ruleTipoDeBreak ) )? (otherlv_9= 'parte de ' ( (otherlv_10= RULE_ID ) ) )? otherlv_11= ',' ( (lv_titulo_12_0= RULE_STRING ) ) otherlv_13= ',' otherlv_14= 'Duracion:' ( (lv_duracion_15_0= RULE_INT ) ) otherlv_16= ',' otherlv_17= 'Lugar:' ( (otherlv_18= RULE_ID ) ) otherlv_19= ',' otherlv_20= 'Gente esperada:' ( (lv_genteEsperada_21_0= RULE_INT ) ) (otherlv_22= ',' otherlv_23= 'Oradores:' ( (otherlv_24= RULE_ID ) )* )? otherlv_25= ',' ( (lv_horario_26_0= ruleHorario ) ) )
            {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:671:1: ( ( (lv_esCharla_0_0= 'Charla' ) )? ( (lv_esMesaDeDebate_1_0= 'Mesa de debate' ) )? ( (lv_esTaller_2_0= 'Taller' ) )? ( (lv_esBreak_3_0= 'Break' ) )? ( (lv_esEventoDeInauguracion_4_0= 'Evento de Inauguraci\\u00F3n' ) )? ( (lv_esRegistracion_5_0= 'Registracion' ) )? ( (lv_esEventoDeCierre_6_0= 'Evento de cierre' ) )? ( (lv_keynote_7_0= 'Keynote' ) )? ( (lv_tipoDeBreak_8_0= ruleTipoDeBreak ) )? (otherlv_9= 'parte de ' ( (otherlv_10= RULE_ID ) ) )? otherlv_11= ',' ( (lv_titulo_12_0= RULE_STRING ) ) otherlv_13= ',' otherlv_14= 'Duracion:' ( (lv_duracion_15_0= RULE_INT ) ) otherlv_16= ',' otherlv_17= 'Lugar:' ( (otherlv_18= RULE_ID ) ) otherlv_19= ',' otherlv_20= 'Gente esperada:' ( (lv_genteEsperada_21_0= RULE_INT ) ) (otherlv_22= ',' otherlv_23= 'Oradores:' ( (otherlv_24= RULE_ID ) )* )? otherlv_25= ',' ( (lv_horario_26_0= ruleHorario ) ) )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:671:2: ( (lv_esCharla_0_0= 'Charla' ) )? ( (lv_esMesaDeDebate_1_0= 'Mesa de debate' ) )? ( (lv_esTaller_2_0= 'Taller' ) )? ( (lv_esBreak_3_0= 'Break' ) )? ( (lv_esEventoDeInauguracion_4_0= 'Evento de Inauguraci\\u00F3n' ) )? ( (lv_esRegistracion_5_0= 'Registracion' ) )? ( (lv_esEventoDeCierre_6_0= 'Evento de cierre' ) )? ( (lv_keynote_7_0= 'Keynote' ) )? ( (lv_tipoDeBreak_8_0= ruleTipoDeBreak ) )? (otherlv_9= 'parte de ' ( (otherlv_10= RULE_ID ) ) )? otherlv_11= ',' ( (lv_titulo_12_0= RULE_STRING ) ) otherlv_13= ',' otherlv_14= 'Duracion:' ( (lv_duracion_15_0= RULE_INT ) ) otherlv_16= ',' otherlv_17= 'Lugar:' ( (otherlv_18= RULE_ID ) ) otherlv_19= ',' otherlv_20= 'Gente esperada:' ( (lv_genteEsperada_21_0= RULE_INT ) ) (otherlv_22= ',' otherlv_23= 'Oradores:' ( (otherlv_24= RULE_ID ) )* )? otherlv_25= ',' ( (lv_horario_26_0= ruleHorario ) )
            {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:671:2: ( (lv_esCharla_0_0= 'Charla' ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==25) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:672:1: (lv_esCharla_0_0= 'Charla' )
                    {
                    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:672:1: (lv_esCharla_0_0= 'Charla' )
                    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:673:3: lv_esCharla_0_0= 'Charla'
                    {
                    lv_esCharla_0_0=(Token)match(input,25,FOLLOW_25_in_ruleActividad1420); 

                            newLeafNode(lv_esCharla_0_0, grammarAccess.getActividadAccess().getEsCharlaCharlaKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getActividadRule());
                    	        }
                           		setWithLastConsumed(current, "esCharla", true, "Charla");
                    	    

                    }


                    }
                    break;

            }

            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:686:3: ( (lv_esMesaDeDebate_1_0= 'Mesa de debate' ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==26) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:687:1: (lv_esMesaDeDebate_1_0= 'Mesa de debate' )
                    {
                    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:687:1: (lv_esMesaDeDebate_1_0= 'Mesa de debate' )
                    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:688:3: lv_esMesaDeDebate_1_0= 'Mesa de debate'
                    {
                    lv_esMesaDeDebate_1_0=(Token)match(input,26,FOLLOW_26_in_ruleActividad1452); 

                            newLeafNode(lv_esMesaDeDebate_1_0, grammarAccess.getActividadAccess().getEsMesaDeDebateMesaDeDebateKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getActividadRule());
                    	        }
                           		setWithLastConsumed(current, "esMesaDeDebate", true, "Mesa de debate");
                    	    

                    }


                    }
                    break;

            }

            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:701:3: ( (lv_esTaller_2_0= 'Taller' ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==27) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:702:1: (lv_esTaller_2_0= 'Taller' )
                    {
                    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:702:1: (lv_esTaller_2_0= 'Taller' )
                    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:703:3: lv_esTaller_2_0= 'Taller'
                    {
                    lv_esTaller_2_0=(Token)match(input,27,FOLLOW_27_in_ruleActividad1484); 

                            newLeafNode(lv_esTaller_2_0, grammarAccess.getActividadAccess().getEsTallerTallerKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getActividadRule());
                    	        }
                           		setWithLastConsumed(current, "esTaller", true, "Taller");
                    	    

                    }


                    }
                    break;

            }

            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:716:3: ( (lv_esBreak_3_0= 'Break' ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==28) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:717:1: (lv_esBreak_3_0= 'Break' )
                    {
                    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:717:1: (lv_esBreak_3_0= 'Break' )
                    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:718:3: lv_esBreak_3_0= 'Break'
                    {
                    lv_esBreak_3_0=(Token)match(input,28,FOLLOW_28_in_ruleActividad1516); 

                            newLeafNode(lv_esBreak_3_0, grammarAccess.getActividadAccess().getEsBreakBreakKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getActividadRule());
                    	        }
                           		setWithLastConsumed(current, "esBreak", true, "Break");
                    	    

                    }


                    }
                    break;

            }

            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:731:3: ( (lv_esEventoDeInauguracion_4_0= 'Evento de Inauguraci\\u00F3n' ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==29) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:732:1: (lv_esEventoDeInauguracion_4_0= 'Evento de Inauguraci\\u00F3n' )
                    {
                    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:732:1: (lv_esEventoDeInauguracion_4_0= 'Evento de Inauguraci\\u00F3n' )
                    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:733:3: lv_esEventoDeInauguracion_4_0= 'Evento de Inauguraci\\u00F3n'
                    {
                    lv_esEventoDeInauguracion_4_0=(Token)match(input,29,FOLLOW_29_in_ruleActividad1548); 

                            newLeafNode(lv_esEventoDeInauguracion_4_0, grammarAccess.getActividadAccess().getEsEventoDeInauguracionEventoDeInauguraciNKeyword_4_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getActividadRule());
                    	        }
                           		setWithLastConsumed(current, "esEventoDeInauguracion", true, "Evento de Inauguraci\u00F3n");
                    	    

                    }


                    }
                    break;

            }

            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:746:3: ( (lv_esRegistracion_5_0= 'Registracion' ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==30) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:747:1: (lv_esRegistracion_5_0= 'Registracion' )
                    {
                    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:747:1: (lv_esRegistracion_5_0= 'Registracion' )
                    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:748:3: lv_esRegistracion_5_0= 'Registracion'
                    {
                    lv_esRegistracion_5_0=(Token)match(input,30,FOLLOW_30_in_ruleActividad1580); 

                            newLeafNode(lv_esRegistracion_5_0, grammarAccess.getActividadAccess().getEsRegistracionRegistracionKeyword_5_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getActividadRule());
                    	        }
                           		setWithLastConsumed(current, "esRegistracion", true, "Registracion");
                    	    

                    }


                    }
                    break;

            }

            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:761:3: ( (lv_esEventoDeCierre_6_0= 'Evento de cierre' ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==31) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:762:1: (lv_esEventoDeCierre_6_0= 'Evento de cierre' )
                    {
                    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:762:1: (lv_esEventoDeCierre_6_0= 'Evento de cierre' )
                    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:763:3: lv_esEventoDeCierre_6_0= 'Evento de cierre'
                    {
                    lv_esEventoDeCierre_6_0=(Token)match(input,31,FOLLOW_31_in_ruleActividad1612); 

                            newLeafNode(lv_esEventoDeCierre_6_0, grammarAccess.getActividadAccess().getEsEventoDeCierreEventoDeCierreKeyword_6_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getActividadRule());
                    	        }
                           		setWithLastConsumed(current, "esEventoDeCierre", true, "Evento de cierre");
                    	    

                    }


                    }
                    break;

            }

            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:776:3: ( (lv_keynote_7_0= 'Keynote' ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==32) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:777:1: (lv_keynote_7_0= 'Keynote' )
                    {
                    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:777:1: (lv_keynote_7_0= 'Keynote' )
                    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:778:3: lv_keynote_7_0= 'Keynote'
                    {
                    lv_keynote_7_0=(Token)match(input,32,FOLLOW_32_in_ruleActividad1644); 

                            newLeafNode(lv_keynote_7_0, grammarAccess.getActividadAccess().getKeynoteKeynoteKeyword_7_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getActividadRule());
                    	        }
                           		setWithLastConsumed(current, "keynote", true, "Keynote");
                    	    

                    }


                    }
                    break;

            }

            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:791:3: ( (lv_tipoDeBreak_8_0= ruleTipoDeBreak ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=38 && LA15_0<=40)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:792:1: (lv_tipoDeBreak_8_0= ruleTipoDeBreak )
                    {
                    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:792:1: (lv_tipoDeBreak_8_0= ruleTipoDeBreak )
                    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:793:3: lv_tipoDeBreak_8_0= ruleTipoDeBreak
                    {
                     
                    	        newCompositeNode(grammarAccess.getActividadAccess().getTipoDeBreakTipoDeBreakParserRuleCall_8_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTipoDeBreak_in_ruleActividad1679);
                    lv_tipoDeBreak_8_0=ruleTipoDeBreak();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getActividadRule());
                    	        }
                           		set(
                           			current, 
                           			"tipoDeBreak",
                            		lv_tipoDeBreak_8_0, 
                            		"TipoDeBreak");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:809:3: (otherlv_9= 'parte de ' ( (otherlv_10= RULE_ID ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==33) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:809:5: otherlv_9= 'parte de ' ( (otherlv_10= RULE_ID ) )
                    {
                    otherlv_9=(Token)match(input,33,FOLLOW_33_in_ruleActividad1693); 

                        	newLeafNode(otherlv_9, grammarAccess.getActividadAccess().getParteDeKeyword_9_0());
                        
                    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:813:1: ( (otherlv_10= RULE_ID ) )
                    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:814:1: (otherlv_10= RULE_ID )
                    {
                    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:814:1: (otherlv_10= RULE_ID )
                    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:815:3: otherlv_10= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getActividadRule());
                    	        }
                            
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActividad1713); 

                    		newLeafNode(otherlv_10, grammarAccess.getActividadAccess().getTrackTrackCrossReference_9_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,23,FOLLOW_23_in_ruleActividad1727); 

                	newLeafNode(otherlv_11, grammarAccess.getActividadAccess().getCommaKeyword_10());
                
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:830:1: ( (lv_titulo_12_0= RULE_STRING ) )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:831:1: (lv_titulo_12_0= RULE_STRING )
            {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:831:1: (lv_titulo_12_0= RULE_STRING )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:832:3: lv_titulo_12_0= RULE_STRING
            {
            lv_titulo_12_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleActividad1744); 

            			newLeafNode(lv_titulo_12_0, grammarAccess.getActividadAccess().getTituloSTRINGTerminalRuleCall_11_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getActividadRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"titulo",
                    		lv_titulo_12_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_13=(Token)match(input,23,FOLLOW_23_in_ruleActividad1761); 

                	newLeafNode(otherlv_13, grammarAccess.getActividadAccess().getCommaKeyword_12());
                
            otherlv_14=(Token)match(input,34,FOLLOW_34_in_ruleActividad1773); 

                	newLeafNode(otherlv_14, grammarAccess.getActividadAccess().getDuracionKeyword_13());
                
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:856:1: ( (lv_duracion_15_0= RULE_INT ) )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:857:1: (lv_duracion_15_0= RULE_INT )
            {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:857:1: (lv_duracion_15_0= RULE_INT )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:858:3: lv_duracion_15_0= RULE_INT
            {
            lv_duracion_15_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleActividad1790); 

            			newLeafNode(lv_duracion_15_0, grammarAccess.getActividadAccess().getDuracionINTTerminalRuleCall_14_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getActividadRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"duracion",
                    		lv_duracion_15_0, 
                    		"INT");
            	    

            }


            }

            otherlv_16=(Token)match(input,23,FOLLOW_23_in_ruleActividad1807); 

                	newLeafNode(otherlv_16, grammarAccess.getActividadAccess().getCommaKeyword_15());
                
            otherlv_17=(Token)match(input,35,FOLLOW_35_in_ruleActividad1819); 

                	newLeafNode(otherlv_17, grammarAccess.getActividadAccess().getLugarKeyword_16());
                
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:882:1: ( (otherlv_18= RULE_ID ) )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:883:1: (otherlv_18= RULE_ID )
            {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:883:1: (otherlv_18= RULE_ID )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:884:3: otherlv_18= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getActividadRule());
            	        }
                    
            otherlv_18=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActividad1839); 

            		newLeafNode(otherlv_18, grammarAccess.getActividadAccess().getEspacioEspacioCrossReference_17_0()); 
            	

            }


            }

            otherlv_19=(Token)match(input,23,FOLLOW_23_in_ruleActividad1851); 

                	newLeafNode(otherlv_19, grammarAccess.getActividadAccess().getCommaKeyword_18());
                
            otherlv_20=(Token)match(input,36,FOLLOW_36_in_ruleActividad1863); 

                	newLeafNode(otherlv_20, grammarAccess.getActividadAccess().getGenteEsperadaKeyword_19());
                
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:903:1: ( (lv_genteEsperada_21_0= RULE_INT ) )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:904:1: (lv_genteEsperada_21_0= RULE_INT )
            {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:904:1: (lv_genteEsperada_21_0= RULE_INT )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:905:3: lv_genteEsperada_21_0= RULE_INT
            {
            lv_genteEsperada_21_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleActividad1880); 

            			newLeafNode(lv_genteEsperada_21_0, grammarAccess.getActividadAccess().getGenteEsperadaINTTerminalRuleCall_20_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getActividadRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"genteEsperada",
                    		lv_genteEsperada_21_0, 
                    		"INT");
            	    

            }


            }

            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:921:2: (otherlv_22= ',' otherlv_23= 'Oradores:' ( (otherlv_24= RULE_ID ) )* )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==23) ) {
                int LA18_1 = input.LA(2);

                if ( (LA18_1==37) ) {
                    alt18=1;
                }
            }
            switch (alt18) {
                case 1 :
                    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:921:4: otherlv_22= ',' otherlv_23= 'Oradores:' ( (otherlv_24= RULE_ID ) )*
                    {
                    otherlv_22=(Token)match(input,23,FOLLOW_23_in_ruleActividad1898); 

                        	newLeafNode(otherlv_22, grammarAccess.getActividadAccess().getCommaKeyword_21_0());
                        
                    otherlv_23=(Token)match(input,37,FOLLOW_37_in_ruleActividad1910); 

                        	newLeafNode(otherlv_23, grammarAccess.getActividadAccess().getOradoresKeyword_21_1());
                        
                    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:929:1: ( (otherlv_24= RULE_ID ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==RULE_ID) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:930:1: (otherlv_24= RULE_ID )
                    	    {
                    	    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:930:1: (otherlv_24= RULE_ID )
                    	    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:931:3: otherlv_24= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getActividadRule());
                    	    	        }
                    	            
                    	    otherlv_24=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActividad1930); 

                    	    		newLeafNode(otherlv_24, grammarAccess.getActividadAccess().getOradoresOradorCrossReference_21_2_0()); 
                    	    	

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_25=(Token)match(input,23,FOLLOW_23_in_ruleActividad1945); 

                	newLeafNode(otherlv_25, grammarAccess.getActividadAccess().getCommaKeyword_22());
                
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:946:1: ( (lv_horario_26_0= ruleHorario ) )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:947:1: (lv_horario_26_0= ruleHorario )
            {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:947:1: (lv_horario_26_0= ruleHorario )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:948:3: lv_horario_26_0= ruleHorario
            {
             
            	        newCompositeNode(grammarAccess.getActividadAccess().getHorarioHorarioParserRuleCall_23_0()); 
            	    
            pushFollow(FOLLOW_ruleHorario_in_ruleActividad1966);
            lv_horario_26_0=ruleHorario();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getActividadRule());
            	        }
                   		set(
                   			current, 
                   			"horario",
                    		lv_horario_26_0, 
                    		"Horario");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActividad"


    // $ANTLR start "entryRuleTipoDeBreak"
    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:972:1: entryRuleTipoDeBreak returns [EObject current=null] : iv_ruleTipoDeBreak= ruleTipoDeBreak EOF ;
    public final EObject entryRuleTipoDeBreak() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTipoDeBreak = null;


        try {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:973:2: (iv_ruleTipoDeBreak= ruleTipoDeBreak EOF )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:974:2: iv_ruleTipoDeBreak= ruleTipoDeBreak EOF
            {
             newCompositeNode(grammarAccess.getTipoDeBreakRule()); 
            pushFollow(FOLLOW_ruleTipoDeBreak_in_entryRuleTipoDeBreak2002);
            iv_ruleTipoDeBreak=ruleTipoDeBreak();

            state._fsp--;

             current =iv_ruleTipoDeBreak; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTipoDeBreak2012); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTipoDeBreak"


    // $ANTLR start "ruleTipoDeBreak"
    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:981:1: ruleTipoDeBreak returns [EObject current=null] : (this_Desayuno_0= ruleDesayuno | this_Almuerzo_1= ruleAlmuerzo | this_Merienda_2= ruleMerienda ) ;
    public final EObject ruleTipoDeBreak() throws RecognitionException {
        EObject current = null;

        EObject this_Desayuno_0 = null;

        EObject this_Almuerzo_1 = null;

        EObject this_Merienda_2 = null;


         enterRule(); 
            
        try {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:984:28: ( (this_Desayuno_0= ruleDesayuno | this_Almuerzo_1= ruleAlmuerzo | this_Merienda_2= ruleMerienda ) )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:985:1: (this_Desayuno_0= ruleDesayuno | this_Almuerzo_1= ruleAlmuerzo | this_Merienda_2= ruleMerienda )
            {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:985:1: (this_Desayuno_0= ruleDesayuno | this_Almuerzo_1= ruleAlmuerzo | this_Merienda_2= ruleMerienda )
            int alt19=3;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt19=1;
                }
                break;
            case 39:
                {
                alt19=2;
                }
                break;
            case 40:
                {
                alt19=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:986:5: this_Desayuno_0= ruleDesayuno
                    {
                     
                            newCompositeNode(grammarAccess.getTipoDeBreakAccess().getDesayunoParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleDesayuno_in_ruleTipoDeBreak2059);
                    this_Desayuno_0=ruleDesayuno();

                    state._fsp--;

                     
                            current = this_Desayuno_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:996:5: this_Almuerzo_1= ruleAlmuerzo
                    {
                     
                            newCompositeNode(grammarAccess.getTipoDeBreakAccess().getAlmuerzoParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleAlmuerzo_in_ruleTipoDeBreak2086);
                    this_Almuerzo_1=ruleAlmuerzo();

                    state._fsp--;

                     
                            current = this_Almuerzo_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:1006:5: this_Merienda_2= ruleMerienda
                    {
                     
                            newCompositeNode(grammarAccess.getTipoDeBreakAccess().getMeriendaParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleMerienda_in_ruleTipoDeBreak2113);
                    this_Merienda_2=ruleMerienda();

                    state._fsp--;

                     
                            current = this_Merienda_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTipoDeBreak"


    // $ANTLR start "entryRuleDesayuno"
    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:1022:1: entryRuleDesayuno returns [EObject current=null] : iv_ruleDesayuno= ruleDesayuno EOF ;
    public final EObject entryRuleDesayuno() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDesayuno = null;


        try {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:1023:2: (iv_ruleDesayuno= ruleDesayuno EOF )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:1024:2: iv_ruleDesayuno= ruleDesayuno EOF
            {
             newCompositeNode(grammarAccess.getDesayunoRule()); 
            pushFollow(FOLLOW_ruleDesayuno_in_entryRuleDesayuno2148);
            iv_ruleDesayuno=ruleDesayuno();

            state._fsp--;

             current =iv_ruleDesayuno; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDesayuno2158); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDesayuno"


    // $ANTLR start "ruleDesayuno"
    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:1031:1: ruleDesayuno returns [EObject current=null] : ( () otherlv_1= 'Desayuno' ) ;
    public final EObject ruleDesayuno() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:1034:28: ( ( () otherlv_1= 'Desayuno' ) )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:1035:1: ( () otherlv_1= 'Desayuno' )
            {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:1035:1: ( () otherlv_1= 'Desayuno' )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:1035:2: () otherlv_1= 'Desayuno'
            {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:1035:2: ()
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:1036:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDesayunoAccess().getDesayunoAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,38,FOLLOW_38_in_ruleDesayuno2204); 

                	newLeafNode(otherlv_1, grammarAccess.getDesayunoAccess().getDesayunoKeyword_1());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDesayuno"


    // $ANTLR start "entryRuleAlmuerzo"
    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:1053:1: entryRuleAlmuerzo returns [EObject current=null] : iv_ruleAlmuerzo= ruleAlmuerzo EOF ;
    public final EObject entryRuleAlmuerzo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlmuerzo = null;


        try {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:1054:2: (iv_ruleAlmuerzo= ruleAlmuerzo EOF )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:1055:2: iv_ruleAlmuerzo= ruleAlmuerzo EOF
            {
             newCompositeNode(grammarAccess.getAlmuerzoRule()); 
            pushFollow(FOLLOW_ruleAlmuerzo_in_entryRuleAlmuerzo2240);
            iv_ruleAlmuerzo=ruleAlmuerzo();

            state._fsp--;

             current =iv_ruleAlmuerzo; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAlmuerzo2250); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAlmuerzo"


    // $ANTLR start "ruleAlmuerzo"
    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:1062:1: ruleAlmuerzo returns [EObject current=null] : ( () otherlv_1= 'Almuerzo' ) ;
    public final EObject ruleAlmuerzo() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:1065:28: ( ( () otherlv_1= 'Almuerzo' ) )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:1066:1: ( () otherlv_1= 'Almuerzo' )
            {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:1066:1: ( () otherlv_1= 'Almuerzo' )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:1066:2: () otherlv_1= 'Almuerzo'
            {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:1066:2: ()
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:1067:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAlmuerzoAccess().getAlmuerzoAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,39,FOLLOW_39_in_ruleAlmuerzo2296); 

                	newLeafNode(otherlv_1, grammarAccess.getAlmuerzoAccess().getAlmuerzoKeyword_1());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAlmuerzo"


    // $ANTLR start "entryRuleMerienda"
    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:1084:1: entryRuleMerienda returns [EObject current=null] : iv_ruleMerienda= ruleMerienda EOF ;
    public final EObject entryRuleMerienda() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMerienda = null;


        try {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:1085:2: (iv_ruleMerienda= ruleMerienda EOF )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:1086:2: iv_ruleMerienda= ruleMerienda EOF
            {
             newCompositeNode(grammarAccess.getMeriendaRule()); 
            pushFollow(FOLLOW_ruleMerienda_in_entryRuleMerienda2332);
            iv_ruleMerienda=ruleMerienda();

            state._fsp--;

             current =iv_ruleMerienda; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMerienda2342); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMerienda"


    // $ANTLR start "ruleMerienda"
    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:1093:1: ruleMerienda returns [EObject current=null] : ( () otherlv_1= 'Merienda' ) ;
    public final EObject ruleMerienda() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:1096:28: ( ( () otherlv_1= 'Merienda' ) )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:1097:1: ( () otherlv_1= 'Merienda' )
            {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:1097:1: ( () otherlv_1= 'Merienda' )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:1097:2: () otherlv_1= 'Merienda'
            {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:1097:2: ()
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:1098:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getMeriendaAccess().getMeriendaAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,40,FOLLOW_40_in_ruleMerienda2388); 

                	newLeafNode(otherlv_1, grammarAccess.getMeriendaAccess().getMeriendaKeyword_1());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMerienda"


    // $ANTLR start "entryRuleHorario"
    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:1115:1: entryRuleHorario returns [EObject current=null] : iv_ruleHorario= ruleHorario EOF ;
    public final EObject entryRuleHorario() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHorario = null;


        try {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:1116:2: (iv_ruleHorario= ruleHorario EOF )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:1117:2: iv_ruleHorario= ruleHorario EOF
            {
             newCompositeNode(grammarAccess.getHorarioRule()); 
            pushFollow(FOLLOW_ruleHorario_in_entryRuleHorario2424);
            iv_ruleHorario=ruleHorario();

            state._fsp--;

             current =iv_ruleHorario; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHorario2434); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHorario"


    // $ANTLR start "ruleHorario"
    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:1124:1: ruleHorario returns [EObject current=null] : (otherlv_0= 'Horario' otherlv_1= '(' ( (lv_hora_2_0= RULE_INT ) ) otherlv_3= ':' ( (lv_minutos_4_0= RULE_INT ) ) otherlv_5= ')' ) ;
    public final EObject ruleHorario() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_hora_2_0=null;
        Token otherlv_3=null;
        Token lv_minutos_4_0=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:1127:28: ( (otherlv_0= 'Horario' otherlv_1= '(' ( (lv_hora_2_0= RULE_INT ) ) otherlv_3= ':' ( (lv_minutos_4_0= RULE_INT ) ) otherlv_5= ')' ) )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:1128:1: (otherlv_0= 'Horario' otherlv_1= '(' ( (lv_hora_2_0= RULE_INT ) ) otherlv_3= ':' ( (lv_minutos_4_0= RULE_INT ) ) otherlv_5= ')' )
            {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:1128:1: (otherlv_0= 'Horario' otherlv_1= '(' ( (lv_hora_2_0= RULE_INT ) ) otherlv_3= ':' ( (lv_minutos_4_0= RULE_INT ) ) otherlv_5= ')' )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:1128:3: otherlv_0= 'Horario' otherlv_1= '(' ( (lv_hora_2_0= RULE_INT ) ) otherlv_3= ':' ( (lv_minutos_4_0= RULE_INT ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_41_in_ruleHorario2471); 

                	newLeafNode(otherlv_0, grammarAccess.getHorarioAccess().getHorarioKeyword_0());
                
            otherlv_1=(Token)match(input,42,FOLLOW_42_in_ruleHorario2483); 

                	newLeafNode(otherlv_1, grammarAccess.getHorarioAccess().getLeftParenthesisKeyword_1());
                
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:1136:1: ( (lv_hora_2_0= RULE_INT ) )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:1137:1: (lv_hora_2_0= RULE_INT )
            {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:1137:1: (lv_hora_2_0= RULE_INT )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:1138:3: lv_hora_2_0= RULE_INT
            {
            lv_hora_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleHorario2500); 

            			newLeafNode(lv_hora_2_0, grammarAccess.getHorarioAccess().getHoraINTTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getHorarioRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"hora",
                    		lv_hora_2_0, 
                    		"INT");
            	    

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleHorario2517); 

                	newLeafNode(otherlv_3, grammarAccess.getHorarioAccess().getColonKeyword_3());
                
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:1158:1: ( (lv_minutos_4_0= RULE_INT ) )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:1159:1: (lv_minutos_4_0= RULE_INT )
            {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:1159:1: (lv_minutos_4_0= RULE_INT )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:1160:3: lv_minutos_4_0= RULE_INT
            {
            lv_minutos_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleHorario2534); 

            			newLeafNode(lv_minutos_4_0, grammarAccess.getHorarioAccess().getMinutosINTTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getHorarioRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"minutos",
                    		lv_minutos_4_0, 
                    		"INT");
            	    

            }


            }

            otherlv_5=(Token)match(input,43,FOLLOW_43_in_ruleHorario2551); 

                	newLeafNode(otherlv_5, grammarAccess.getHorarioAccess().getRightParenthesisKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHorario"


    // $ANTLR start "entryRuleTrack"
    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:1188:1: entryRuleTrack returns [EObject current=null] : iv_ruleTrack= ruleTrack EOF ;
    public final EObject entryRuleTrack() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrack = null;


        try {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:1189:2: (iv_ruleTrack= ruleTrack EOF )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:1190:2: iv_ruleTrack= ruleTrack EOF
            {
             newCompositeNode(grammarAccess.getTrackRule()); 
            pushFollow(FOLLOW_ruleTrack_in_entryRuleTrack2587);
            iv_ruleTrack=ruleTrack();

            state._fsp--;

             current =iv_ruleTrack; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTrack2597); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTrack"


    // $ANTLR start "ruleTrack"
    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:1197:1: ruleTrack returns [EObject current=null] : ( () otherlv_1= 'Track' ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleTrack() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;

         enterRule(); 
            
        try {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:1200:28: ( ( () otherlv_1= 'Track' ( (lv_name_2_0= RULE_ID ) ) ) )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:1201:1: ( () otherlv_1= 'Track' ( (lv_name_2_0= RULE_ID ) ) )
            {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:1201:1: ( () otherlv_1= 'Track' ( (lv_name_2_0= RULE_ID ) ) )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:1201:2: () otherlv_1= 'Track' ( (lv_name_2_0= RULE_ID ) )
            {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:1201:2: ()
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:1202:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTrackAccess().getTrackAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,44,FOLLOW_44_in_ruleTrack2643); 

                	newLeafNode(otherlv_1, grammarAccess.getTrackAccess().getTrackKeyword_1());
                
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:1211:1: ( (lv_name_2_0= RULE_ID ) )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:1212:1: (lv_name_2_0= RULE_ID )
            {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:1212:1: (lv_name_2_0= RULE_ID )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:1213:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTrack2660); 

            			newLeafNode(lv_name_2_0, grammarAccess.getTrackAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTrackRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTrack"

    // Delegated rules


 

    public static final BitSet FOLLOW_rulePDC_in_entryRulePDC75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePDC85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrganizaciones_in_rulePDC131 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ruleOradores_in_rulePDC152 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ruleEspacios_in_rulePDC173 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ruleTracks_in_rulePDC194 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleSchedule_in_rulePDC215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrganizaciones_in_entryRuleOrganizaciones251 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrganizaciones261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleOrganizaciones307 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleOrganizaciones319 = new BitSet(new long[]{0x0000000000082000L});
    public static final BitSet FOLLOW_ruleOrganizacion_in_ruleOrganizaciones340 = new BitSet(new long[]{0x0000000000082000L});
    public static final BitSet FOLLOW_13_in_ruleOrganizaciones353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOradores_in_entryRuleOradores389 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOradores399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleOradores445 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleOradores457 = new BitSet(new long[]{0x0000000000102000L});
    public static final BitSet FOLLOW_ruleOrador_in_ruleOradores478 = new BitSet(new long[]{0x0000000000102000L});
    public static final BitSet FOLLOW_13_in_ruleOradores491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEspacios_in_entryRuleEspacios527 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEspacios537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleEspacios583 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleEspacios595 = new BitSet(new long[]{0x0000000000402000L});
    public static final BitSet FOLLOW_ruleEspacio_in_ruleEspacios616 = new BitSet(new long[]{0x0000000000402000L});
    public static final BitSet FOLLOW_13_in_ruleEspacios629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTracks_in_entryRuleTracks665 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTracks675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleTracks721 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleTracks733 = new BitSet(new long[]{0x0000100000002000L});
    public static final BitSet FOLLOW_ruleTrack_in_ruleTracks754 = new BitSet(new long[]{0x0000100000002000L});
    public static final BitSet FOLLOW_13_in_ruleTracks767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchedule_in_entryRuleSchedule803 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchedule813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleSchedule850 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleSchedule862 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSchedule879 = new BitSet(new long[]{0x000001C3FE800002L});
    public static final BitSet FOLLOW_ruleActividad_in_ruleSchedule905 = new BitSet(new long[]{0x000001C3FE800002L});
    public static final BitSet FOLLOW_ruleOrganizacion_in_entryRuleOrganizacion942 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrganizacion952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleOrganizacion989 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOrganizacion1006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrador_in_entryRuleOrador1047 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrador1057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleOrador1094 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOrador1111 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleOrador1128 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOrador1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEspacio_in_entryRuleEspacio1184 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEspacio1194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleEspacio1231 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleEspacio1243 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEspacio1260 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleEspacio1277 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEspacio1294 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleEspacio1317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActividad_in_entryRuleActividad1367 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActividad1377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleActividad1420 = new BitSet(new long[]{0x000001C3FC800000L});
    public static final BitSet FOLLOW_26_in_ruleActividad1452 = new BitSet(new long[]{0x000001C3F8800000L});
    public static final BitSet FOLLOW_27_in_ruleActividad1484 = new BitSet(new long[]{0x000001C3F0800000L});
    public static final BitSet FOLLOW_28_in_ruleActividad1516 = new BitSet(new long[]{0x000001C3E0800000L});
    public static final BitSet FOLLOW_29_in_ruleActividad1548 = new BitSet(new long[]{0x000001C3C0800000L});
    public static final BitSet FOLLOW_30_in_ruleActividad1580 = new BitSet(new long[]{0x000001C380800000L});
    public static final BitSet FOLLOW_31_in_ruleActividad1612 = new BitSet(new long[]{0x000001C300800000L});
    public static final BitSet FOLLOW_32_in_ruleActividad1644 = new BitSet(new long[]{0x000001C200800000L});
    public static final BitSet FOLLOW_ruleTipoDeBreak_in_ruleActividad1679 = new BitSet(new long[]{0x0000000200800000L});
    public static final BitSet FOLLOW_33_in_ruleActividad1693 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActividad1713 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleActividad1727 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleActividad1744 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleActividad1761 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleActividad1773 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleActividad1790 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleActividad1807 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleActividad1819 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActividad1839 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleActividad1851 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleActividad1863 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleActividad1880 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleActividad1898 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleActividad1910 = new BitSet(new long[]{0x0000000000800020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActividad1930 = new BitSet(new long[]{0x0000000000800020L});
    public static final BitSet FOLLOW_23_in_ruleActividad1945 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ruleHorario_in_ruleActividad1966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTipoDeBreak_in_entryRuleTipoDeBreak2002 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTipoDeBreak2012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDesayuno_in_ruleTipoDeBreak2059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlmuerzo_in_ruleTipoDeBreak2086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMerienda_in_ruleTipoDeBreak2113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDesayuno_in_entryRuleDesayuno2148 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDesayuno2158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleDesayuno2204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlmuerzo_in_entryRuleAlmuerzo2240 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlmuerzo2250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleAlmuerzo2296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMerienda_in_entryRuleMerienda2332 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMerienda2342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleMerienda2388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHorario_in_entryRuleHorario2424 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHorario2434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleHorario2471 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleHorario2483 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleHorario2500 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleHorario2517 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleHorario2534 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleHorario2551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTrack_in_entryRuleTrack2587 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTrack2597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleTrack2643 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTrack2660 = new BitSet(new long[]{0x0000000000000002L});

}