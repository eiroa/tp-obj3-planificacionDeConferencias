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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Schedule'", "':'", "'/Fin del schedule'", "'Organizacion'", "'Orador'", "'de:'", "'Actividad'", "'{'", "','", "'}'", "'Espacio'", "'Horario'", "'('", "')'", "'Charla'", "'Taller'", "'Mesa de debate'"
    };
    public static final int RULE_ID=6;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__19=19;
    public static final int RULE_STRING=4;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
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
        	return "Schedule";	
       	}
       	
       	@Override
       	protected PdcGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleSchedule"
    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:67:1: entryRuleSchedule returns [EObject current=null] : iv_ruleSchedule= ruleSchedule EOF ;
    public final EObject entryRuleSchedule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchedule = null;


        try {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:68:2: (iv_ruleSchedule= ruleSchedule EOF )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:69:2: iv_ruleSchedule= ruleSchedule EOF
            {
             newCompositeNode(grammarAccess.getScheduleRule()); 
            pushFollow(FOLLOW_ruleSchedule_in_entryRuleSchedule75);
            iv_ruleSchedule=ruleSchedule();

            state._fsp--;

             current =iv_ruleSchedule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchedule85); 

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
    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:76:1: ruleSchedule returns [EObject current=null] : (otherlv_0= 'Schedule' otherlv_1= ':' ( (lv_nombre_2_0= RULE_STRING ) ) ( (lv_actividades_3_0= ruleActividad ) )* ( (lv_fin_4_0= '/Fin del schedule' ) ) ) ;
    public final EObject ruleSchedule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_nombre_2_0=null;
        Token lv_fin_4_0=null;
        EObject lv_actividades_3_0 = null;


         enterRule(); 
            
        try {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:79:28: ( (otherlv_0= 'Schedule' otherlv_1= ':' ( (lv_nombre_2_0= RULE_STRING ) ) ( (lv_actividades_3_0= ruleActividad ) )* ( (lv_fin_4_0= '/Fin del schedule' ) ) ) )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:80:1: (otherlv_0= 'Schedule' otherlv_1= ':' ( (lv_nombre_2_0= RULE_STRING ) ) ( (lv_actividades_3_0= ruleActividad ) )* ( (lv_fin_4_0= '/Fin del schedule' ) ) )
            {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:80:1: (otherlv_0= 'Schedule' otherlv_1= ':' ( (lv_nombre_2_0= RULE_STRING ) ) ( (lv_actividades_3_0= ruleActividad ) )* ( (lv_fin_4_0= '/Fin del schedule' ) ) )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:80:3: otherlv_0= 'Schedule' otherlv_1= ':' ( (lv_nombre_2_0= RULE_STRING ) ) ( (lv_actividades_3_0= ruleActividad ) )* ( (lv_fin_4_0= '/Fin del schedule' ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleSchedule122); 

                	newLeafNode(otherlv_0, grammarAccess.getScheduleAccess().getScheduleKeyword_0());
                
            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleSchedule134); 

                	newLeafNode(otherlv_1, grammarAccess.getScheduleAccess().getColonKeyword_1());
                
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:88:1: ( (lv_nombre_2_0= RULE_STRING ) )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:89:1: (lv_nombre_2_0= RULE_STRING )
            {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:89:1: (lv_nombre_2_0= RULE_STRING )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:90:3: lv_nombre_2_0= RULE_STRING
            {
            lv_nombre_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSchedule151); 

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

            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:106:2: ( (lv_actividades_3_0= ruleActividad ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==17) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:107:1: (lv_actividades_3_0= ruleActividad )
            	    {
            	    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:107:1: (lv_actividades_3_0= ruleActividad )
            	    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:108:3: lv_actividades_3_0= ruleActividad
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getScheduleAccess().getActividadesActividadParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleActividad_in_ruleSchedule177);
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
            	    break loop1;
                }
            } while (true);

            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:124:3: ( (lv_fin_4_0= '/Fin del schedule' ) )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:125:1: (lv_fin_4_0= '/Fin del schedule' )
            {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:125:1: (lv_fin_4_0= '/Fin del schedule' )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:126:3: lv_fin_4_0= '/Fin del schedule'
            {
            lv_fin_4_0=(Token)match(input,13,FOLLOW_13_in_ruleSchedule196); 

                    newLeafNode(lv_fin_4_0, grammarAccess.getScheduleAccess().getFinFinDelScheduleKeyword_4_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getScheduleRule());
            	        }
                   		setWithLastConsumed(current, "fin", lv_fin_4_0, "/Fin del schedule");
            	    

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
    // $ANTLR end "ruleSchedule"


    // $ANTLR start "entryRuleOrganizacion"
    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:147:1: entryRuleOrganizacion returns [EObject current=null] : iv_ruleOrganizacion= ruleOrganizacion EOF ;
    public final EObject entryRuleOrganizacion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrganizacion = null;


        try {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:148:2: (iv_ruleOrganizacion= ruleOrganizacion EOF )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:149:2: iv_ruleOrganizacion= ruleOrganizacion EOF
            {
             newCompositeNode(grammarAccess.getOrganizacionRule()); 
            pushFollow(FOLLOW_ruleOrganizacion_in_entryRuleOrganizacion245);
            iv_ruleOrganizacion=ruleOrganizacion();

            state._fsp--;

             current =iv_ruleOrganizacion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrganizacion255); 

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
    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:156:1: ruleOrganizacion returns [EObject current=null] : (otherlv_0= 'Organizacion' ( (lv_nombre_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleOrganizacion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_nombre_1_0=null;

         enterRule(); 
            
        try {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:159:28: ( (otherlv_0= 'Organizacion' ( (lv_nombre_1_0= RULE_STRING ) ) ) )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:160:1: (otherlv_0= 'Organizacion' ( (lv_nombre_1_0= RULE_STRING ) ) )
            {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:160:1: (otherlv_0= 'Organizacion' ( (lv_nombre_1_0= RULE_STRING ) ) )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:160:3: otherlv_0= 'Organizacion' ( (lv_nombre_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleOrganizacion292); 

                	newLeafNode(otherlv_0, grammarAccess.getOrganizacionAccess().getOrganizacionKeyword_0());
                
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:164:1: ( (lv_nombre_1_0= RULE_STRING ) )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:165:1: (lv_nombre_1_0= RULE_STRING )
            {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:165:1: (lv_nombre_1_0= RULE_STRING )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:166:3: lv_nombre_1_0= RULE_STRING
            {
            lv_nombre_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleOrganizacion309); 

            			newLeafNode(lv_nombre_1_0, grammarAccess.getOrganizacionAccess().getNombreSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getOrganizacionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"nombre",
                    		lv_nombre_1_0, 
                    		"STRING");
            	    

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
    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:190:1: entryRuleOrador returns [EObject current=null] : iv_ruleOrador= ruleOrador EOF ;
    public final EObject entryRuleOrador() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrador = null;


        try {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:191:2: (iv_ruleOrador= ruleOrador EOF )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:192:2: iv_ruleOrador= ruleOrador EOF
            {
             newCompositeNode(grammarAccess.getOradorRule()); 
            pushFollow(FOLLOW_ruleOrador_in_entryRuleOrador350);
            iv_ruleOrador=ruleOrador();

            state._fsp--;

             current =iv_ruleOrador; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrador360); 

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
    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:199:1: ruleOrador returns [EObject current=null] : (otherlv_0= 'Orador' ( (lv_nombre_1_0= RULE_STRING ) ) otherlv_2= 'de:' ( (lv_organizacion_3_0= ruleOrganizacion ) ) ) ;
    public final EObject ruleOrador() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_nombre_1_0=null;
        Token otherlv_2=null;
        EObject lv_organizacion_3_0 = null;


         enterRule(); 
            
        try {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:202:28: ( (otherlv_0= 'Orador' ( (lv_nombre_1_0= RULE_STRING ) ) otherlv_2= 'de:' ( (lv_organizacion_3_0= ruleOrganizacion ) ) ) )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:203:1: (otherlv_0= 'Orador' ( (lv_nombre_1_0= RULE_STRING ) ) otherlv_2= 'de:' ( (lv_organizacion_3_0= ruleOrganizacion ) ) )
            {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:203:1: (otherlv_0= 'Orador' ( (lv_nombre_1_0= RULE_STRING ) ) otherlv_2= 'de:' ( (lv_organizacion_3_0= ruleOrganizacion ) ) )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:203:3: otherlv_0= 'Orador' ( (lv_nombre_1_0= RULE_STRING ) ) otherlv_2= 'de:' ( (lv_organizacion_3_0= ruleOrganizacion ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleOrador397); 

                	newLeafNode(otherlv_0, grammarAccess.getOradorAccess().getOradorKeyword_0());
                
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:207:1: ( (lv_nombre_1_0= RULE_STRING ) )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:208:1: (lv_nombre_1_0= RULE_STRING )
            {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:208:1: (lv_nombre_1_0= RULE_STRING )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:209:3: lv_nombre_1_0= RULE_STRING
            {
            lv_nombre_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleOrador414); 

            			newLeafNode(lv_nombre_1_0, grammarAccess.getOradorAccess().getNombreSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getOradorRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"nombre",
                    		lv_nombre_1_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleOrador431); 

                	newLeafNode(otherlv_2, grammarAccess.getOradorAccess().getDeKeyword_2());
                
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:229:1: ( (lv_organizacion_3_0= ruleOrganizacion ) )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:230:1: (lv_organizacion_3_0= ruleOrganizacion )
            {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:230:1: (lv_organizacion_3_0= ruleOrganizacion )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:231:3: lv_organizacion_3_0= ruleOrganizacion
            {
             
            	        newCompositeNode(grammarAccess.getOradorAccess().getOrganizacionOrganizacionParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleOrganizacion_in_ruleOrador452);
            lv_organizacion_3_0=ruleOrganizacion();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOradorRule());
            	        }
                   		set(
                   			current, 
                   			"organizacion",
                    		lv_organizacion_3_0, 
                    		"Organizacion");
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
    // $ANTLR end "ruleOrador"


    // $ANTLR start "entryRuleActividad"
    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:255:1: entryRuleActividad returns [EObject current=null] : iv_ruleActividad= ruleActividad EOF ;
    public final EObject entryRuleActividad() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActividad = null;


        try {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:256:2: (iv_ruleActividad= ruleActividad EOF )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:257:2: iv_ruleActividad= ruleActividad EOF
            {
             newCompositeNode(grammarAccess.getActividadRule()); 
            pushFollow(FOLLOW_ruleActividad_in_entryRuleActividad488);
            iv_ruleActividad=ruleActividad();

            state._fsp--;

             current =iv_ruleActividad; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActividad498); 

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
    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:264:1: ruleActividad returns [EObject current=null] : (otherlv_0= 'Actividad' otherlv_1= '{' ( (lv_tipo_2_0= ruleTipoDeActividad ) ) otherlv_3= ',' ( (lv_titulo_4_0= RULE_STRING ) ) otherlv_5= ',' ( (lv_duracion_6_0= RULE_INT ) ) otherlv_7= ',' ( (lv_espacio_8_0= ruleEspacio ) ) otherlv_9= ',' ( (lv_genteEsperada_10_0= RULE_INT ) ) otherlv_11= ',' ( (lv_oradores_12_0= ruleOrador ) )* otherlv_13= ',' ( (lv_horario_14_0= ruleHora ) ) otherlv_15= '}' ) ;
    public final EObject ruleActividad() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_titulo_4_0=null;
        Token otherlv_5=null;
        Token lv_duracion_6_0=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token lv_genteEsperada_10_0=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        EObject lv_tipo_2_0 = null;

        EObject lv_espacio_8_0 = null;

        EObject lv_oradores_12_0 = null;

        EObject lv_horario_14_0 = null;


         enterRule(); 
            
        try {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:267:28: ( (otherlv_0= 'Actividad' otherlv_1= '{' ( (lv_tipo_2_0= ruleTipoDeActividad ) ) otherlv_3= ',' ( (lv_titulo_4_0= RULE_STRING ) ) otherlv_5= ',' ( (lv_duracion_6_0= RULE_INT ) ) otherlv_7= ',' ( (lv_espacio_8_0= ruleEspacio ) ) otherlv_9= ',' ( (lv_genteEsperada_10_0= RULE_INT ) ) otherlv_11= ',' ( (lv_oradores_12_0= ruleOrador ) )* otherlv_13= ',' ( (lv_horario_14_0= ruleHora ) ) otherlv_15= '}' ) )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:268:1: (otherlv_0= 'Actividad' otherlv_1= '{' ( (lv_tipo_2_0= ruleTipoDeActividad ) ) otherlv_3= ',' ( (lv_titulo_4_0= RULE_STRING ) ) otherlv_5= ',' ( (lv_duracion_6_0= RULE_INT ) ) otherlv_7= ',' ( (lv_espacio_8_0= ruleEspacio ) ) otherlv_9= ',' ( (lv_genteEsperada_10_0= RULE_INT ) ) otherlv_11= ',' ( (lv_oradores_12_0= ruleOrador ) )* otherlv_13= ',' ( (lv_horario_14_0= ruleHora ) ) otherlv_15= '}' )
            {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:268:1: (otherlv_0= 'Actividad' otherlv_1= '{' ( (lv_tipo_2_0= ruleTipoDeActividad ) ) otherlv_3= ',' ( (lv_titulo_4_0= RULE_STRING ) ) otherlv_5= ',' ( (lv_duracion_6_0= RULE_INT ) ) otherlv_7= ',' ( (lv_espacio_8_0= ruleEspacio ) ) otherlv_9= ',' ( (lv_genteEsperada_10_0= RULE_INT ) ) otherlv_11= ',' ( (lv_oradores_12_0= ruleOrador ) )* otherlv_13= ',' ( (lv_horario_14_0= ruleHora ) ) otherlv_15= '}' )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:268:3: otherlv_0= 'Actividad' otherlv_1= '{' ( (lv_tipo_2_0= ruleTipoDeActividad ) ) otherlv_3= ',' ( (lv_titulo_4_0= RULE_STRING ) ) otherlv_5= ',' ( (lv_duracion_6_0= RULE_INT ) ) otherlv_7= ',' ( (lv_espacio_8_0= ruleEspacio ) ) otherlv_9= ',' ( (lv_genteEsperada_10_0= RULE_INT ) ) otherlv_11= ',' ( (lv_oradores_12_0= ruleOrador ) )* otherlv_13= ',' ( (lv_horario_14_0= ruleHora ) ) otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleActividad535); 

                	newLeafNode(otherlv_0, grammarAccess.getActividadAccess().getActividadKeyword_0());
                
            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleActividad547); 

                	newLeafNode(otherlv_1, grammarAccess.getActividadAccess().getLeftCurlyBracketKeyword_1());
                
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:276:1: ( (lv_tipo_2_0= ruleTipoDeActividad ) )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:277:1: (lv_tipo_2_0= ruleTipoDeActividad )
            {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:277:1: (lv_tipo_2_0= ruleTipoDeActividad )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:278:3: lv_tipo_2_0= ruleTipoDeActividad
            {
             
            	        newCompositeNode(grammarAccess.getActividadAccess().getTipoTipoDeActividadParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleTipoDeActividad_in_ruleActividad568);
            lv_tipo_2_0=ruleTipoDeActividad();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getActividadRule());
            	        }
                   		set(
                   			current, 
                   			"tipo",
                    		lv_tipo_2_0, 
                    		"TipoDeActividad");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleActividad580); 

                	newLeafNode(otherlv_3, grammarAccess.getActividadAccess().getCommaKeyword_3());
                
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:298:1: ( (lv_titulo_4_0= RULE_STRING ) )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:299:1: (lv_titulo_4_0= RULE_STRING )
            {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:299:1: (lv_titulo_4_0= RULE_STRING )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:300:3: lv_titulo_4_0= RULE_STRING
            {
            lv_titulo_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleActividad597); 

            			newLeafNode(lv_titulo_4_0, grammarAccess.getActividadAccess().getTituloSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getActividadRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"titulo",
                    		lv_titulo_4_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleActividad614); 

                	newLeafNode(otherlv_5, grammarAccess.getActividadAccess().getCommaKeyword_5());
                
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:320:1: ( (lv_duracion_6_0= RULE_INT ) )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:321:1: (lv_duracion_6_0= RULE_INT )
            {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:321:1: (lv_duracion_6_0= RULE_INT )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:322:3: lv_duracion_6_0= RULE_INT
            {
            lv_duracion_6_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleActividad631); 

            			newLeafNode(lv_duracion_6_0, grammarAccess.getActividadAccess().getDuracionINTTerminalRuleCall_6_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getActividadRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"duracion",
                    		lv_duracion_6_0, 
                    		"INT");
            	    

            }


            }

            otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleActividad648); 

                	newLeafNode(otherlv_7, grammarAccess.getActividadAccess().getCommaKeyword_7());
                
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:342:1: ( (lv_espacio_8_0= ruleEspacio ) )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:343:1: (lv_espacio_8_0= ruleEspacio )
            {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:343:1: (lv_espacio_8_0= ruleEspacio )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:344:3: lv_espacio_8_0= ruleEspacio
            {
             
            	        newCompositeNode(grammarAccess.getActividadAccess().getEspacioEspacioParserRuleCall_8_0()); 
            	    
            pushFollow(FOLLOW_ruleEspacio_in_ruleActividad669);
            lv_espacio_8_0=ruleEspacio();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getActividadRule());
            	        }
                   		set(
                   			current, 
                   			"espacio",
                    		lv_espacio_8_0, 
                    		"Espacio");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_9=(Token)match(input,19,FOLLOW_19_in_ruleActividad681); 

                	newLeafNode(otherlv_9, grammarAccess.getActividadAccess().getCommaKeyword_9());
                
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:364:1: ( (lv_genteEsperada_10_0= RULE_INT ) )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:365:1: (lv_genteEsperada_10_0= RULE_INT )
            {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:365:1: (lv_genteEsperada_10_0= RULE_INT )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:366:3: lv_genteEsperada_10_0= RULE_INT
            {
            lv_genteEsperada_10_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleActividad698); 

            			newLeafNode(lv_genteEsperada_10_0, grammarAccess.getActividadAccess().getGenteEsperadaINTTerminalRuleCall_10_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getActividadRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"genteEsperada",
                    		lv_genteEsperada_10_0, 
                    		"INT");
            	    

            }


            }

            otherlv_11=(Token)match(input,19,FOLLOW_19_in_ruleActividad715); 

                	newLeafNode(otherlv_11, grammarAccess.getActividadAccess().getCommaKeyword_11());
                
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:386:1: ( (lv_oradores_12_0= ruleOrador ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:387:1: (lv_oradores_12_0= ruleOrador )
            	    {
            	    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:387:1: (lv_oradores_12_0= ruleOrador )
            	    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:388:3: lv_oradores_12_0= ruleOrador
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getActividadAccess().getOradoresOradorParserRuleCall_12_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleOrador_in_ruleActividad736);
            	    lv_oradores_12_0=ruleOrador();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getActividadRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"oradores",
            	            		lv_oradores_12_0, 
            	            		"Orador");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_13=(Token)match(input,19,FOLLOW_19_in_ruleActividad749); 

                	newLeafNode(otherlv_13, grammarAccess.getActividadAccess().getCommaKeyword_13());
                
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:408:1: ( (lv_horario_14_0= ruleHora ) )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:409:1: (lv_horario_14_0= ruleHora )
            {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:409:1: (lv_horario_14_0= ruleHora )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:410:3: lv_horario_14_0= ruleHora
            {
             
            	        newCompositeNode(grammarAccess.getActividadAccess().getHorarioHoraParserRuleCall_14_0()); 
            	    
            pushFollow(FOLLOW_ruleHora_in_ruleActividad770);
            lv_horario_14_0=ruleHora();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getActividadRule());
            	        }
                   		set(
                   			current, 
                   			"horario",
                    		lv_horario_14_0, 
                    		"Hora");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_15=(Token)match(input,20,FOLLOW_20_in_ruleActividad782); 

                	newLeafNode(otherlv_15, grammarAccess.getActividadAccess().getRightCurlyBracketKeyword_15());
                

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


    // $ANTLR start "entryRuleEspacio"
    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:438:1: entryRuleEspacio returns [EObject current=null] : iv_ruleEspacio= ruleEspacio EOF ;
    public final EObject entryRuleEspacio() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEspacio = null;


        try {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:439:2: (iv_ruleEspacio= ruleEspacio EOF )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:440:2: iv_ruleEspacio= ruleEspacio EOF
            {
             newCompositeNode(grammarAccess.getEspacioRule()); 
            pushFollow(FOLLOW_ruleEspacio_in_entryRuleEspacio818);
            iv_ruleEspacio=ruleEspacio();

            state._fsp--;

             current =iv_ruleEspacio; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEspacio828); 

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
    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:447:1: ruleEspacio returns [EObject current=null] : (otherlv_0= 'Espacio' otherlv_1= ':' ( (lv_nombre_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_capacidad_4_0= RULE_INT ) ) ) ;
    public final EObject ruleEspacio() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_nombre_2_0=null;
        Token otherlv_3=null;
        Token lv_capacidad_4_0=null;

         enterRule(); 
            
        try {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:450:28: ( (otherlv_0= 'Espacio' otherlv_1= ':' ( (lv_nombre_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_capacidad_4_0= RULE_INT ) ) ) )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:451:1: (otherlv_0= 'Espacio' otherlv_1= ':' ( (lv_nombre_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_capacidad_4_0= RULE_INT ) ) )
            {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:451:1: (otherlv_0= 'Espacio' otherlv_1= ':' ( (lv_nombre_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_capacidad_4_0= RULE_INT ) ) )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:451:3: otherlv_0= 'Espacio' otherlv_1= ':' ( (lv_nombre_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_capacidad_4_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleEspacio865); 

                	newLeafNode(otherlv_0, grammarAccess.getEspacioAccess().getEspacioKeyword_0());
                
            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleEspacio877); 

                	newLeafNode(otherlv_1, grammarAccess.getEspacioAccess().getColonKeyword_1());
                
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:459:1: ( (lv_nombre_2_0= RULE_STRING ) )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:460:1: (lv_nombre_2_0= RULE_STRING )
            {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:460:1: (lv_nombre_2_0= RULE_STRING )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:461:3: lv_nombre_2_0= RULE_STRING
            {
            lv_nombre_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEspacio894); 

            			newLeafNode(lv_nombre_2_0, grammarAccess.getEspacioAccess().getNombreSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEspacioRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"nombre",
                    		lv_nombre_2_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleEspacio911); 

                	newLeafNode(otherlv_3, grammarAccess.getEspacioAccess().getCommaKeyword_3());
                
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:481:1: ( (lv_capacidad_4_0= RULE_INT ) )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:482:1: (lv_capacidad_4_0= RULE_INT )
            {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:482:1: (lv_capacidad_4_0= RULE_INT )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:483:3: lv_capacidad_4_0= RULE_INT
            {
            lv_capacidad_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEspacio928); 

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


    // $ANTLR start "entryRuleTipoDeActividad"
    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:507:1: entryRuleTipoDeActividad returns [EObject current=null] : iv_ruleTipoDeActividad= ruleTipoDeActividad EOF ;
    public final EObject entryRuleTipoDeActividad() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTipoDeActividad = null;


        try {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:508:2: (iv_ruleTipoDeActividad= ruleTipoDeActividad EOF )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:509:2: iv_ruleTipoDeActividad= ruleTipoDeActividad EOF
            {
             newCompositeNode(grammarAccess.getTipoDeActividadRule()); 
            pushFollow(FOLLOW_ruleTipoDeActividad_in_entryRuleTipoDeActividad969);
            iv_ruleTipoDeActividad=ruleTipoDeActividad();

            state._fsp--;

             current =iv_ruleTipoDeActividad; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTipoDeActividad979); 

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
    // $ANTLR end "entryRuleTipoDeActividad"


    // $ANTLR start "ruleTipoDeActividad"
    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:516:1: ruleTipoDeActividad returns [EObject current=null] : (this_Charla_0= ruleCharla | this_Taller_1= ruleTaller | this_MesaDeDebate_2= ruleMesaDeDebate ) ;
    public final EObject ruleTipoDeActividad() throws RecognitionException {
        EObject current = null;

        EObject this_Charla_0 = null;

        EObject this_Taller_1 = null;

        EObject this_MesaDeDebate_2 = null;


         enterRule(); 
            
        try {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:519:28: ( (this_Charla_0= ruleCharla | this_Taller_1= ruleTaller | this_MesaDeDebate_2= ruleMesaDeDebate ) )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:520:1: (this_Charla_0= ruleCharla | this_Taller_1= ruleTaller | this_MesaDeDebate_2= ruleMesaDeDebate )
            {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:520:1: (this_Charla_0= ruleCharla | this_Taller_1= ruleTaller | this_MesaDeDebate_2= ruleMesaDeDebate )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt3=1;
                }
                break;
            case 26:
                {
                alt3=2;
                }
                break;
            case 27:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:521:5: this_Charla_0= ruleCharla
                    {
                     
                            newCompositeNode(grammarAccess.getTipoDeActividadAccess().getCharlaParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleCharla_in_ruleTipoDeActividad1026);
                    this_Charla_0=ruleCharla();

                    state._fsp--;

                     
                            current = this_Charla_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:531:5: this_Taller_1= ruleTaller
                    {
                     
                            newCompositeNode(grammarAccess.getTipoDeActividadAccess().getTallerParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleTaller_in_ruleTipoDeActividad1053);
                    this_Taller_1=ruleTaller();

                    state._fsp--;

                     
                            current = this_Taller_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:541:5: this_MesaDeDebate_2= ruleMesaDeDebate
                    {
                     
                            newCompositeNode(grammarAccess.getTipoDeActividadAccess().getMesaDeDebateParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleMesaDeDebate_in_ruleTipoDeActividad1080);
                    this_MesaDeDebate_2=ruleMesaDeDebate();

                    state._fsp--;

                     
                            current = this_MesaDeDebate_2; 
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
    // $ANTLR end "ruleTipoDeActividad"


    // $ANTLR start "entryRuleHora"
    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:557:1: entryRuleHora returns [EObject current=null] : iv_ruleHora= ruleHora EOF ;
    public final EObject entryRuleHora() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHora = null;


        try {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:558:2: (iv_ruleHora= ruleHora EOF )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:559:2: iv_ruleHora= ruleHora EOF
            {
             newCompositeNode(grammarAccess.getHoraRule()); 
            pushFollow(FOLLOW_ruleHora_in_entryRuleHora1115);
            iv_ruleHora=ruleHora();

            state._fsp--;

             current =iv_ruleHora; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHora1125); 

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
    // $ANTLR end "entryRuleHora"


    // $ANTLR start "ruleHora"
    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:566:1: ruleHora returns [EObject current=null] : (otherlv_0= 'Horario' otherlv_1= '(' ( (lv_hora_2_0= RULE_INT ) ) otherlv_3= ':' ( (lv_minutos_4_0= RULE_INT ) ) otherlv_5= ')' ) ;
    public final EObject ruleHora() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_hora_2_0=null;
        Token otherlv_3=null;
        Token lv_minutos_4_0=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:569:28: ( (otherlv_0= 'Horario' otherlv_1= '(' ( (lv_hora_2_0= RULE_INT ) ) otherlv_3= ':' ( (lv_minutos_4_0= RULE_INT ) ) otherlv_5= ')' ) )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:570:1: (otherlv_0= 'Horario' otherlv_1= '(' ( (lv_hora_2_0= RULE_INT ) ) otherlv_3= ':' ( (lv_minutos_4_0= RULE_INT ) ) otherlv_5= ')' )
            {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:570:1: (otherlv_0= 'Horario' otherlv_1= '(' ( (lv_hora_2_0= RULE_INT ) ) otherlv_3= ':' ( (lv_minutos_4_0= RULE_INT ) ) otherlv_5= ')' )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:570:3: otherlv_0= 'Horario' otherlv_1= '(' ( (lv_hora_2_0= RULE_INT ) ) otherlv_3= ':' ( (lv_minutos_4_0= RULE_INT ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleHora1162); 

                	newLeafNode(otherlv_0, grammarAccess.getHoraAccess().getHorarioKeyword_0());
                
            otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleHora1174); 

                	newLeafNode(otherlv_1, grammarAccess.getHoraAccess().getLeftParenthesisKeyword_1());
                
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:578:1: ( (lv_hora_2_0= RULE_INT ) )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:579:1: (lv_hora_2_0= RULE_INT )
            {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:579:1: (lv_hora_2_0= RULE_INT )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:580:3: lv_hora_2_0= RULE_INT
            {
            lv_hora_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleHora1191); 

            			newLeafNode(lv_hora_2_0, grammarAccess.getHoraAccess().getHoraINTTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getHoraRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"hora",
                    		lv_hora_2_0, 
                    		"INT");
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleHora1208); 

                	newLeafNode(otherlv_3, grammarAccess.getHoraAccess().getColonKeyword_3());
                
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:600:1: ( (lv_minutos_4_0= RULE_INT ) )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:601:1: (lv_minutos_4_0= RULE_INT )
            {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:601:1: (lv_minutos_4_0= RULE_INT )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:602:3: lv_minutos_4_0= RULE_INT
            {
            lv_minutos_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleHora1225); 

            			newLeafNode(lv_minutos_4_0, grammarAccess.getHoraAccess().getMinutosINTTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getHoraRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"minutos",
                    		lv_minutos_4_0, 
                    		"INT");
            	    

            }


            }

            otherlv_5=(Token)match(input,24,FOLLOW_24_in_ruleHora1242); 

                	newLeafNode(otherlv_5, grammarAccess.getHoraAccess().getRightParenthesisKeyword_5());
                

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
    // $ANTLR end "ruleHora"


    // $ANTLR start "entryRuleCharla"
    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:630:1: entryRuleCharla returns [EObject current=null] : iv_ruleCharla= ruleCharla EOF ;
    public final EObject entryRuleCharla() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCharla = null;


        try {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:631:2: (iv_ruleCharla= ruleCharla EOF )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:632:2: iv_ruleCharla= ruleCharla EOF
            {
             newCompositeNode(grammarAccess.getCharlaRule()); 
            pushFollow(FOLLOW_ruleCharla_in_entryRuleCharla1278);
            iv_ruleCharla=ruleCharla();

            state._fsp--;

             current =iv_ruleCharla; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCharla1288); 

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
    // $ANTLR end "entryRuleCharla"


    // $ANTLR start "ruleCharla"
    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:639:1: ruleCharla returns [EObject current=null] : ( () otherlv_1= 'Charla' ) ;
    public final EObject ruleCharla() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:642:28: ( ( () otherlv_1= 'Charla' ) )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:643:1: ( () otherlv_1= 'Charla' )
            {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:643:1: ( () otherlv_1= 'Charla' )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:643:2: () otherlv_1= 'Charla'
            {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:643:2: ()
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:644:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCharlaAccess().getCharlaAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleCharla1334); 

                	newLeafNode(otherlv_1, grammarAccess.getCharlaAccess().getCharlaKeyword_1());
                

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
    // $ANTLR end "ruleCharla"


    // $ANTLR start "entryRuleTaller"
    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:661:1: entryRuleTaller returns [EObject current=null] : iv_ruleTaller= ruleTaller EOF ;
    public final EObject entryRuleTaller() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaller = null;


        try {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:662:2: (iv_ruleTaller= ruleTaller EOF )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:663:2: iv_ruleTaller= ruleTaller EOF
            {
             newCompositeNode(grammarAccess.getTallerRule()); 
            pushFollow(FOLLOW_ruleTaller_in_entryRuleTaller1370);
            iv_ruleTaller=ruleTaller();

            state._fsp--;

             current =iv_ruleTaller; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTaller1380); 

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
    // $ANTLR end "entryRuleTaller"


    // $ANTLR start "ruleTaller"
    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:670:1: ruleTaller returns [EObject current=null] : ( () otherlv_1= 'Taller' ) ;
    public final EObject ruleTaller() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:673:28: ( ( () otherlv_1= 'Taller' ) )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:674:1: ( () otherlv_1= 'Taller' )
            {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:674:1: ( () otherlv_1= 'Taller' )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:674:2: () otherlv_1= 'Taller'
            {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:674:2: ()
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:675:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTallerAccess().getTallerAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,26,FOLLOW_26_in_ruleTaller1426); 

                	newLeafNode(otherlv_1, grammarAccess.getTallerAccess().getTallerKeyword_1());
                

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
    // $ANTLR end "ruleTaller"


    // $ANTLR start "entryRuleMesaDeDebate"
    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:692:1: entryRuleMesaDeDebate returns [EObject current=null] : iv_ruleMesaDeDebate= ruleMesaDeDebate EOF ;
    public final EObject entryRuleMesaDeDebate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMesaDeDebate = null;


        try {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:693:2: (iv_ruleMesaDeDebate= ruleMesaDeDebate EOF )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:694:2: iv_ruleMesaDeDebate= ruleMesaDeDebate EOF
            {
             newCompositeNode(grammarAccess.getMesaDeDebateRule()); 
            pushFollow(FOLLOW_ruleMesaDeDebate_in_entryRuleMesaDeDebate1462);
            iv_ruleMesaDeDebate=ruleMesaDeDebate();

            state._fsp--;

             current =iv_ruleMesaDeDebate; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMesaDeDebate1472); 

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
    // $ANTLR end "entryRuleMesaDeDebate"


    // $ANTLR start "ruleMesaDeDebate"
    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:701:1: ruleMesaDeDebate returns [EObject current=null] : ( () otherlv_1= 'Mesa de debate' ) ;
    public final EObject ruleMesaDeDebate() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:704:28: ( ( () otherlv_1= 'Mesa de debate' ) )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:705:1: ( () otherlv_1= 'Mesa de debate' )
            {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:705:1: ( () otherlv_1= 'Mesa de debate' )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:705:2: () otherlv_1= 'Mesa de debate'
            {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:705:2: ()
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:706:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getMesaDeDebateAccess().getMesaDeDebateAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleMesaDeDebate1518); 

                	newLeafNode(otherlv_1, grammarAccess.getMesaDeDebateAccess().getMesaDeDebateKeyword_1());
                

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
    // $ANTLR end "ruleMesaDeDebate"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleSchedule_in_entryRuleSchedule75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchedule85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleSchedule122 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleSchedule134 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSchedule151 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_ruleActividad_in_ruleSchedule177 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_13_in_ruleSchedule196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrganizacion_in_entryRuleOrganizacion245 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrganizacion255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleOrganizacion292 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleOrganizacion309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrador_in_entryRuleOrador350 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrador360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleOrador397 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleOrador414 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleOrador431 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ruleOrganizacion_in_ruleOrador452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActividad_in_entryRuleActividad488 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActividad498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleActividad535 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleActividad547 = new BitSet(new long[]{0x000000000E000000L});
    public static final BitSet FOLLOW_ruleTipoDeActividad_in_ruleActividad568 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleActividad580 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleActividad597 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleActividad614 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleActividad631 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleActividad648 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ruleEspacio_in_ruleActividad669 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleActividad681 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleActividad698 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleActividad715 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_ruleOrador_in_ruleActividad736 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_19_in_ruleActividad749 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ruleHora_in_ruleActividad770 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleActividad782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEspacio_in_entryRuleEspacio818 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEspacio828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleEspacio865 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleEspacio877 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEspacio894 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleEspacio911 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEspacio928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTipoDeActividad_in_entryRuleTipoDeActividad969 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTipoDeActividad979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCharla_in_ruleTipoDeActividad1026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTaller_in_ruleTipoDeActividad1053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMesaDeDebate_in_ruleTipoDeActividad1080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHora_in_entryRuleHora1115 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHora1125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleHora1162 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleHora1174 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleHora1191 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleHora1208 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleHora1225 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleHora1242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCharla_in_entryRuleCharla1278 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCharla1288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleCharla1334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTaller_in_entryRuleTaller1370 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTaller1380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleTaller1426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMesaDeDebate_in_entryRuleMesaDeDebate1462 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMesaDeDebate1472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleMesaDeDebate1518 = new BitSet(new long[]{0x0000000000000002L});

}