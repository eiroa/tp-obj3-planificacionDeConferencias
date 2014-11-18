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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Schedule'", "':'", "'Fin del schedule'", "'Espacio'", "','", "'Organizacion'", "'Orador'", "'de:'", "'Actividad'", "'Charla'", "'Taller'", "'Mesa de debate'"
    };
    public static final int RULE_ID=6;
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
    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:76:1: ruleSchedule returns [EObject current=null] : (otherlv_0= 'Schedule' ( (lv_nombre_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_actividades_3_0= ruleActividad ) )* ( (lv_fin_4_0= 'Fin del schedule' ) ) ) ;
    public final EObject ruleSchedule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_nombre_1_0=null;
        Token otherlv_2=null;
        Token lv_fin_4_0=null;
        EObject lv_actividades_3_0 = null;


         enterRule(); 
            
        try {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:79:28: ( (otherlv_0= 'Schedule' ( (lv_nombre_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_actividades_3_0= ruleActividad ) )* ( (lv_fin_4_0= 'Fin del schedule' ) ) ) )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:80:1: (otherlv_0= 'Schedule' ( (lv_nombre_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_actividades_3_0= ruleActividad ) )* ( (lv_fin_4_0= 'Fin del schedule' ) ) )
            {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:80:1: (otherlv_0= 'Schedule' ( (lv_nombre_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_actividades_3_0= ruleActividad ) )* ( (lv_fin_4_0= 'Fin del schedule' ) ) )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:80:3: otherlv_0= 'Schedule' ( (lv_nombre_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_actividades_3_0= ruleActividad ) )* ( (lv_fin_4_0= 'Fin del schedule' ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleSchedule122); 

                	newLeafNode(otherlv_0, grammarAccess.getScheduleAccess().getScheduleKeyword_0());
                
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:84:1: ( (lv_nombre_1_0= RULE_STRING ) )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:85:1: (lv_nombre_1_0= RULE_STRING )
            {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:85:1: (lv_nombre_1_0= RULE_STRING )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:86:3: lv_nombre_1_0= RULE_STRING
            {
            lv_nombre_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSchedule139); 

            			newLeafNode(lv_nombre_1_0, grammarAccess.getScheduleAccess().getNombreSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getScheduleRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"nombre",
                    		lv_nombre_1_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleSchedule156); 

                	newLeafNode(otherlv_2, grammarAccess.getScheduleAccess().getColonKeyword_2());
                
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:106:1: ( (lv_actividades_3_0= ruleActividad ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=20 && LA1_0<=22)) ) {
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

            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:124:3: ( (lv_fin_4_0= 'Fin del schedule' ) )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:125:1: (lv_fin_4_0= 'Fin del schedule' )
            {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:125:1: (lv_fin_4_0= 'Fin del schedule' )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:126:3: lv_fin_4_0= 'Fin del schedule'
            {
            lv_fin_4_0=(Token)match(input,13,FOLLOW_13_in_ruleSchedule196); 

                    newLeafNode(lv_fin_4_0, grammarAccess.getScheduleAccess().getFinFinDelScheduleKeyword_4_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getScheduleRule());
            	        }
                   		setWithLastConsumed(current, "fin", lv_fin_4_0, "Fin del schedule");
            	    

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


    // $ANTLR start "entryRuleEspacio"
    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:147:1: entryRuleEspacio returns [EObject current=null] : iv_ruleEspacio= ruleEspacio EOF ;
    public final EObject entryRuleEspacio() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEspacio = null;


        try {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:148:2: (iv_ruleEspacio= ruleEspacio EOF )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:149:2: iv_ruleEspacio= ruleEspacio EOF
            {
             newCompositeNode(grammarAccess.getEspacioRule()); 
            pushFollow(FOLLOW_ruleEspacio_in_entryRuleEspacio245);
            iv_ruleEspacio=ruleEspacio();

            state._fsp--;

             current =iv_ruleEspacio; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEspacio255); 

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
    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:156:1: ruleEspacio returns [EObject current=null] : (otherlv_0= 'Espacio' otherlv_1= ':' ( (lv_titulo_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_capacidad_4_0= RULE_INT ) ) ) ;
    public final EObject ruleEspacio() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_titulo_2_0=null;
        Token otherlv_3=null;
        Token lv_capacidad_4_0=null;

         enterRule(); 
            
        try {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:159:28: ( (otherlv_0= 'Espacio' otherlv_1= ':' ( (lv_titulo_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_capacidad_4_0= RULE_INT ) ) ) )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:160:1: (otherlv_0= 'Espacio' otherlv_1= ':' ( (lv_titulo_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_capacidad_4_0= RULE_INT ) ) )
            {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:160:1: (otherlv_0= 'Espacio' otherlv_1= ':' ( (lv_titulo_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_capacidad_4_0= RULE_INT ) ) )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:160:3: otherlv_0= 'Espacio' otherlv_1= ':' ( (lv_titulo_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_capacidad_4_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleEspacio292); 

                	newLeafNode(otherlv_0, grammarAccess.getEspacioAccess().getEspacioKeyword_0());
                
            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleEspacio304); 

                	newLeafNode(otherlv_1, grammarAccess.getEspacioAccess().getColonKeyword_1());
                
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:168:1: ( (lv_titulo_2_0= RULE_STRING ) )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:169:1: (lv_titulo_2_0= RULE_STRING )
            {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:169:1: (lv_titulo_2_0= RULE_STRING )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:170:3: lv_titulo_2_0= RULE_STRING
            {
            lv_titulo_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEspacio321); 

            			newLeafNode(lv_titulo_2_0, grammarAccess.getEspacioAccess().getTituloSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEspacioRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"titulo",
                    		lv_titulo_2_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleEspacio338); 

                	newLeafNode(otherlv_3, grammarAccess.getEspacioAccess().getCommaKeyword_3());
                
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:190:1: ( (lv_capacidad_4_0= RULE_INT ) )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:191:1: (lv_capacidad_4_0= RULE_INT )
            {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:191:1: (lv_capacidad_4_0= RULE_INT )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:192:3: lv_capacidad_4_0= RULE_INT
            {
            lv_capacidad_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEspacio355); 

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


    // $ANTLR start "entryRuleOrganizacion"
    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:216:1: entryRuleOrganizacion returns [EObject current=null] : iv_ruleOrganizacion= ruleOrganizacion EOF ;
    public final EObject entryRuleOrganizacion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrganizacion = null;


        try {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:217:2: (iv_ruleOrganizacion= ruleOrganizacion EOF )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:218:2: iv_ruleOrganizacion= ruleOrganizacion EOF
            {
             newCompositeNode(grammarAccess.getOrganizacionRule()); 
            pushFollow(FOLLOW_ruleOrganizacion_in_entryRuleOrganizacion396);
            iv_ruleOrganizacion=ruleOrganizacion();

            state._fsp--;

             current =iv_ruleOrganizacion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrganizacion406); 

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
    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:225:1: ruleOrganizacion returns [EObject current=null] : (otherlv_0= 'Organizacion' ( (lv_nombre_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleOrganizacion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_nombre_1_0=null;

         enterRule(); 
            
        try {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:228:28: ( (otherlv_0= 'Organizacion' ( (lv_nombre_1_0= RULE_STRING ) ) ) )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:229:1: (otherlv_0= 'Organizacion' ( (lv_nombre_1_0= RULE_STRING ) ) )
            {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:229:1: (otherlv_0= 'Organizacion' ( (lv_nombre_1_0= RULE_STRING ) ) )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:229:3: otherlv_0= 'Organizacion' ( (lv_nombre_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleOrganizacion443); 

                	newLeafNode(otherlv_0, grammarAccess.getOrganizacionAccess().getOrganizacionKeyword_0());
                
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:233:1: ( (lv_nombre_1_0= RULE_STRING ) )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:234:1: (lv_nombre_1_0= RULE_STRING )
            {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:234:1: (lv_nombre_1_0= RULE_STRING )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:235:3: lv_nombre_1_0= RULE_STRING
            {
            lv_nombre_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleOrganizacion460); 

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
    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:259:1: entryRuleOrador returns [EObject current=null] : iv_ruleOrador= ruleOrador EOF ;
    public final EObject entryRuleOrador() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrador = null;


        try {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:260:2: (iv_ruleOrador= ruleOrador EOF )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:261:2: iv_ruleOrador= ruleOrador EOF
            {
             newCompositeNode(grammarAccess.getOradorRule()); 
            pushFollow(FOLLOW_ruleOrador_in_entryRuleOrador501);
            iv_ruleOrador=ruleOrador();

            state._fsp--;

             current =iv_ruleOrador; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrador511); 

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
    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:268:1: ruleOrador returns [EObject current=null] : (otherlv_0= 'Orador' ( (lv_nombre_1_0= RULE_STRING ) ) otherlv_2= 'de:' ( (lv_organizacion_3_0= ruleOrganizacion ) ) ) ;
    public final EObject ruleOrador() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_nombre_1_0=null;
        Token otherlv_2=null;
        EObject lv_organizacion_3_0 = null;


         enterRule(); 
            
        try {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:271:28: ( (otherlv_0= 'Orador' ( (lv_nombre_1_0= RULE_STRING ) ) otherlv_2= 'de:' ( (lv_organizacion_3_0= ruleOrganizacion ) ) ) )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:272:1: (otherlv_0= 'Orador' ( (lv_nombre_1_0= RULE_STRING ) ) otherlv_2= 'de:' ( (lv_organizacion_3_0= ruleOrganizacion ) ) )
            {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:272:1: (otherlv_0= 'Orador' ( (lv_nombre_1_0= RULE_STRING ) ) otherlv_2= 'de:' ( (lv_organizacion_3_0= ruleOrganizacion ) ) )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:272:3: otherlv_0= 'Orador' ( (lv_nombre_1_0= RULE_STRING ) ) otherlv_2= 'de:' ( (lv_organizacion_3_0= ruleOrganizacion ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleOrador548); 

                	newLeafNode(otherlv_0, grammarAccess.getOradorAccess().getOradorKeyword_0());
                
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:276:1: ( (lv_nombre_1_0= RULE_STRING ) )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:277:1: (lv_nombre_1_0= RULE_STRING )
            {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:277:1: (lv_nombre_1_0= RULE_STRING )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:278:3: lv_nombre_1_0= RULE_STRING
            {
            lv_nombre_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleOrador565); 

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

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleOrador582); 

                	newLeafNode(otherlv_2, grammarAccess.getOradorAccess().getDeKeyword_2());
                
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:298:1: ( (lv_organizacion_3_0= ruleOrganizacion ) )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:299:1: (lv_organizacion_3_0= ruleOrganizacion )
            {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:299:1: (lv_organizacion_3_0= ruleOrganizacion )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:300:3: lv_organizacion_3_0= ruleOrganizacion
            {
             
            	        newCompositeNode(grammarAccess.getOradorAccess().getOrganizacionOrganizacionParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleOrganizacion_in_ruleOrador603);
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
    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:324:1: entryRuleActividad returns [EObject current=null] : iv_ruleActividad= ruleActividad EOF ;
    public final EObject entryRuleActividad() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActividad = null;


        try {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:325:2: (iv_ruleActividad= ruleActividad EOF )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:326:2: iv_ruleActividad= ruleActividad EOF
            {
             newCompositeNode(grammarAccess.getActividadRule()); 
            pushFollow(FOLLOW_ruleActividad_in_entryRuleActividad639);
            iv_ruleActividad=ruleActividad();

            state._fsp--;

             current =iv_ruleActividad; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActividad649); 

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
    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:333:1: ruleActividad returns [EObject current=null] : (this_Charla_0= ruleCharla | this_Taller_1= ruleTaller | (this_MesaDeDebate_2= ruleMesaDeDebate otherlv_3= 'Actividad' otherlv_4= ':' ( (lv_tipo_5_0= ruleActividad ) ) otherlv_6= ',' ( (lv_titulo_7_0= RULE_STRING ) ) otherlv_8= ',' ( (lv_duracion_9_0= RULE_INT ) ) otherlv_10= ',' ( (lv_aula_11_0= ruleEspacio ) ) ) ) ;
    public final EObject ruleActividad() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token lv_titulo_7_0=null;
        Token otherlv_8=null;
        Token lv_duracion_9_0=null;
        Token otherlv_10=null;
        EObject this_Charla_0 = null;

        EObject this_Taller_1 = null;

        EObject this_MesaDeDebate_2 = null;

        EObject lv_tipo_5_0 = null;

        EObject lv_aula_11_0 = null;


         enterRule(); 
            
        try {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:336:28: ( (this_Charla_0= ruleCharla | this_Taller_1= ruleTaller | (this_MesaDeDebate_2= ruleMesaDeDebate otherlv_3= 'Actividad' otherlv_4= ':' ( (lv_tipo_5_0= ruleActividad ) ) otherlv_6= ',' ( (lv_titulo_7_0= RULE_STRING ) ) otherlv_8= ',' ( (lv_duracion_9_0= RULE_INT ) ) otherlv_10= ',' ( (lv_aula_11_0= ruleEspacio ) ) ) ) )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:337:1: (this_Charla_0= ruleCharla | this_Taller_1= ruleTaller | (this_MesaDeDebate_2= ruleMesaDeDebate otherlv_3= 'Actividad' otherlv_4= ':' ( (lv_tipo_5_0= ruleActividad ) ) otherlv_6= ',' ( (lv_titulo_7_0= RULE_STRING ) ) otherlv_8= ',' ( (lv_duracion_9_0= RULE_INT ) ) otherlv_10= ',' ( (lv_aula_11_0= ruleEspacio ) ) ) )
            {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:337:1: (this_Charla_0= ruleCharla | this_Taller_1= ruleTaller | (this_MesaDeDebate_2= ruleMesaDeDebate otherlv_3= 'Actividad' otherlv_4= ':' ( (lv_tipo_5_0= ruleActividad ) ) otherlv_6= ',' ( (lv_titulo_7_0= RULE_STRING ) ) otherlv_8= ',' ( (lv_duracion_9_0= RULE_INT ) ) otherlv_10= ',' ( (lv_aula_11_0= ruleEspacio ) ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt2=1;
                }
                break;
            case 21:
                {
                alt2=2;
                }
                break;
            case 22:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:338:5: this_Charla_0= ruleCharla
                    {
                     
                            newCompositeNode(grammarAccess.getActividadAccess().getCharlaParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleCharla_in_ruleActividad696);
                    this_Charla_0=ruleCharla();

                    state._fsp--;

                     
                            current = this_Charla_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:348:5: this_Taller_1= ruleTaller
                    {
                     
                            newCompositeNode(grammarAccess.getActividadAccess().getTallerParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleTaller_in_ruleActividad723);
                    this_Taller_1=ruleTaller();

                    state._fsp--;

                     
                            current = this_Taller_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:357:6: (this_MesaDeDebate_2= ruleMesaDeDebate otherlv_3= 'Actividad' otherlv_4= ':' ( (lv_tipo_5_0= ruleActividad ) ) otherlv_6= ',' ( (lv_titulo_7_0= RULE_STRING ) ) otherlv_8= ',' ( (lv_duracion_9_0= RULE_INT ) ) otherlv_10= ',' ( (lv_aula_11_0= ruleEspacio ) ) )
                    {
                    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:357:6: (this_MesaDeDebate_2= ruleMesaDeDebate otherlv_3= 'Actividad' otherlv_4= ':' ( (lv_tipo_5_0= ruleActividad ) ) otherlv_6= ',' ( (lv_titulo_7_0= RULE_STRING ) ) otherlv_8= ',' ( (lv_duracion_9_0= RULE_INT ) ) otherlv_10= ',' ( (lv_aula_11_0= ruleEspacio ) ) )
                    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:358:5: this_MesaDeDebate_2= ruleMesaDeDebate otherlv_3= 'Actividad' otherlv_4= ':' ( (lv_tipo_5_0= ruleActividad ) ) otherlv_6= ',' ( (lv_titulo_7_0= RULE_STRING ) ) otherlv_8= ',' ( (lv_duracion_9_0= RULE_INT ) ) otherlv_10= ',' ( (lv_aula_11_0= ruleEspacio ) )
                    {
                     
                            newCompositeNode(grammarAccess.getActividadAccess().getMesaDeDebateParserRuleCall_2_0()); 
                        
                    pushFollow(FOLLOW_ruleMesaDeDebate_in_ruleActividad751);
                    this_MesaDeDebate_2=ruleMesaDeDebate();

                    state._fsp--;

                     
                            current = this_MesaDeDebate_2; 
                            afterParserOrEnumRuleCall();
                        
                    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleActividad762); 

                        	newLeafNode(otherlv_3, grammarAccess.getActividadAccess().getActividadKeyword_2_1());
                        
                    otherlv_4=(Token)match(input,12,FOLLOW_12_in_ruleActividad774); 

                        	newLeafNode(otherlv_4, grammarAccess.getActividadAccess().getColonKeyword_2_2());
                        
                    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:374:1: ( (lv_tipo_5_0= ruleActividad ) )
                    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:375:1: (lv_tipo_5_0= ruleActividad )
                    {
                    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:375:1: (lv_tipo_5_0= ruleActividad )
                    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:376:3: lv_tipo_5_0= ruleActividad
                    {
                     
                    	        newCompositeNode(grammarAccess.getActividadAccess().getTipoActividadParserRuleCall_2_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleActividad_in_ruleActividad795);
                    lv_tipo_5_0=ruleActividad();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getActividadRule());
                    	        }
                           		set(
                           			current, 
                           			"tipo",
                            		lv_tipo_5_0, 
                            		"Actividad");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleActividad807); 

                        	newLeafNode(otherlv_6, grammarAccess.getActividadAccess().getCommaKeyword_2_4());
                        
                    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:396:1: ( (lv_titulo_7_0= RULE_STRING ) )
                    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:397:1: (lv_titulo_7_0= RULE_STRING )
                    {
                    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:397:1: (lv_titulo_7_0= RULE_STRING )
                    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:398:3: lv_titulo_7_0= RULE_STRING
                    {
                    lv_titulo_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleActividad824); 

                    			newLeafNode(lv_titulo_7_0, grammarAccess.getActividadAccess().getTituloSTRINGTerminalRuleCall_2_5_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getActividadRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"titulo",
                            		lv_titulo_7_0, 
                            		"STRING");
                    	    

                    }


                    }

                    otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleActividad841); 

                        	newLeafNode(otherlv_8, grammarAccess.getActividadAccess().getCommaKeyword_2_6());
                        
                    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:418:1: ( (lv_duracion_9_0= RULE_INT ) )
                    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:419:1: (lv_duracion_9_0= RULE_INT )
                    {
                    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:419:1: (lv_duracion_9_0= RULE_INT )
                    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:420:3: lv_duracion_9_0= RULE_INT
                    {
                    lv_duracion_9_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleActividad858); 

                    			newLeafNode(lv_duracion_9_0, grammarAccess.getActividadAccess().getDuracionINTTerminalRuleCall_2_7_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getActividadRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"duracion",
                            		lv_duracion_9_0, 
                            		"INT");
                    	    

                    }


                    }

                    otherlv_10=(Token)match(input,15,FOLLOW_15_in_ruleActividad875); 

                        	newLeafNode(otherlv_10, grammarAccess.getActividadAccess().getCommaKeyword_2_8());
                        
                    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:440:1: ( (lv_aula_11_0= ruleEspacio ) )
                    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:441:1: (lv_aula_11_0= ruleEspacio )
                    {
                    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:441:1: (lv_aula_11_0= ruleEspacio )
                    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:442:3: lv_aula_11_0= ruleEspacio
                    {
                     
                    	        newCompositeNode(grammarAccess.getActividadAccess().getAulaEspacioParserRuleCall_2_9_0()); 
                    	    
                    pushFollow(FOLLOW_ruleEspacio_in_ruleActividad896);
                    lv_aula_11_0=ruleEspacio();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getActividadRule());
                    	        }
                           		set(
                           			current, 
                           			"aula",
                            		lv_aula_11_0, 
                            		"Espacio");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


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
    // $ANTLR end "ruleActividad"


    // $ANTLR start "entryRuleCharla"
    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:466:1: entryRuleCharla returns [EObject current=null] : iv_ruleCharla= ruleCharla EOF ;
    public final EObject entryRuleCharla() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCharla = null;


        try {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:467:2: (iv_ruleCharla= ruleCharla EOF )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:468:2: iv_ruleCharla= ruleCharla EOF
            {
             newCompositeNode(grammarAccess.getCharlaRule()); 
            pushFollow(FOLLOW_ruleCharla_in_entryRuleCharla933);
            iv_ruleCharla=ruleCharla();

            state._fsp--;

             current =iv_ruleCharla; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCharla943); 

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
    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:475:1: ruleCharla returns [EObject current=null] : ( () otherlv_1= 'Charla' ( (lv_oradores_2_0= ruleOrador ) )* ) ;
    public final EObject ruleCharla() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_oradores_2_0 = null;


         enterRule(); 
            
        try {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:478:28: ( ( () otherlv_1= 'Charla' ( (lv_oradores_2_0= ruleOrador ) )* ) )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:479:1: ( () otherlv_1= 'Charla' ( (lv_oradores_2_0= ruleOrador ) )* )
            {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:479:1: ( () otherlv_1= 'Charla' ( (lv_oradores_2_0= ruleOrador ) )* )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:479:2: () otherlv_1= 'Charla' ( (lv_oradores_2_0= ruleOrador ) )*
            {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:479:2: ()
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:480:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCharlaAccess().getCharlaAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleCharla989); 

                	newLeafNode(otherlv_1, grammarAccess.getCharlaAccess().getCharlaKeyword_1());
                
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:489:1: ( (lv_oradores_2_0= ruleOrador ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:490:1: (lv_oradores_2_0= ruleOrador )
            	    {
            	    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:490:1: (lv_oradores_2_0= ruleOrador )
            	    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:491:3: lv_oradores_2_0= ruleOrador
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCharlaAccess().getOradoresOradorParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleOrador_in_ruleCharla1010);
            	    lv_oradores_2_0=ruleOrador();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCharlaRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"oradores",
            	            		lv_oradores_2_0, 
            	            		"Orador");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
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
    // $ANTLR end "ruleCharla"


    // $ANTLR start "entryRuleTaller"
    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:515:1: entryRuleTaller returns [EObject current=null] : iv_ruleTaller= ruleTaller EOF ;
    public final EObject entryRuleTaller() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaller = null;


        try {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:516:2: (iv_ruleTaller= ruleTaller EOF )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:517:2: iv_ruleTaller= ruleTaller EOF
            {
             newCompositeNode(grammarAccess.getTallerRule()); 
            pushFollow(FOLLOW_ruleTaller_in_entryRuleTaller1047);
            iv_ruleTaller=ruleTaller();

            state._fsp--;

             current =iv_ruleTaller; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTaller1057); 

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
    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:524:1: ruleTaller returns [EObject current=null] : ( () otherlv_1= 'Taller' ( (lv_oradores_2_0= ruleOrador ) )* ) ;
    public final EObject ruleTaller() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_oradores_2_0 = null;


         enterRule(); 
            
        try {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:527:28: ( ( () otherlv_1= 'Taller' ( (lv_oradores_2_0= ruleOrador ) )* ) )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:528:1: ( () otherlv_1= 'Taller' ( (lv_oradores_2_0= ruleOrador ) )* )
            {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:528:1: ( () otherlv_1= 'Taller' ( (lv_oradores_2_0= ruleOrador ) )* )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:528:2: () otherlv_1= 'Taller' ( (lv_oradores_2_0= ruleOrador ) )*
            {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:528:2: ()
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:529:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTallerAccess().getTallerAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleTaller1103); 

                	newLeafNode(otherlv_1, grammarAccess.getTallerAccess().getTallerKeyword_1());
                
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:538:1: ( (lv_oradores_2_0= ruleOrador ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==17) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:539:1: (lv_oradores_2_0= ruleOrador )
            	    {
            	    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:539:1: (lv_oradores_2_0= ruleOrador )
            	    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:540:3: lv_oradores_2_0= ruleOrador
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTallerAccess().getOradoresOradorParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleOrador_in_ruleTaller1124);
            	    lv_oradores_2_0=ruleOrador();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTallerRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"oradores",
            	            		lv_oradores_2_0, 
            	            		"Orador");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
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
    // $ANTLR end "ruleTaller"


    // $ANTLR start "entryRuleMesaDeDebate"
    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:564:1: entryRuleMesaDeDebate returns [EObject current=null] : iv_ruleMesaDeDebate= ruleMesaDeDebate EOF ;
    public final EObject entryRuleMesaDeDebate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMesaDeDebate = null;


        try {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:565:2: (iv_ruleMesaDeDebate= ruleMesaDeDebate EOF )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:566:2: iv_ruleMesaDeDebate= ruleMesaDeDebate EOF
            {
             newCompositeNode(grammarAccess.getMesaDeDebateRule()); 
            pushFollow(FOLLOW_ruleMesaDeDebate_in_entryRuleMesaDeDebate1161);
            iv_ruleMesaDeDebate=ruleMesaDeDebate();

            state._fsp--;

             current =iv_ruleMesaDeDebate; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMesaDeDebate1171); 

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
    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:573:1: ruleMesaDeDebate returns [EObject current=null] : ( () otherlv_1= 'Mesa de debate' ( (lv_oradores_2_0= ruleOrador ) )* ) ;
    public final EObject ruleMesaDeDebate() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_oradores_2_0 = null;


         enterRule(); 
            
        try {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:576:28: ( ( () otherlv_1= 'Mesa de debate' ( (lv_oradores_2_0= ruleOrador ) )* ) )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:577:1: ( () otherlv_1= 'Mesa de debate' ( (lv_oradores_2_0= ruleOrador ) )* )
            {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:577:1: ( () otherlv_1= 'Mesa de debate' ( (lv_oradores_2_0= ruleOrador ) )* )
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:577:2: () otherlv_1= 'Mesa de debate' ( (lv_oradores_2_0= ruleOrador ) )*
            {
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:577:2: ()
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:578:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getMesaDeDebateAccess().getMesaDeDebateAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleMesaDeDebate1217); 

                	newLeafNode(otherlv_1, grammarAccess.getMesaDeDebateAccess().getMesaDeDebateKeyword_1());
                
            // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:587:1: ( (lv_oradores_2_0= ruleOrador ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==17) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:588:1: (lv_oradores_2_0= ruleOrador )
            	    {
            	    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:588:1: (lv_oradores_2_0= ruleOrador )
            	    // ../ar.unq.edu.objetos3.pdc/src-gen/ar/unq/edu/objetos3/parser/antlr/internal/InternalPdc.g:589:3: lv_oradores_2_0= ruleOrador
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMesaDeDebateAccess().getOradoresOradorParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleOrador_in_ruleMesaDeDebate1238);
            	    lv_oradores_2_0=ruleOrador();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMesaDeDebateRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"oradores",
            	            		lv_oradores_2_0, 
            	            		"Orador");
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
    // $ANTLR end "ruleMesaDeDebate"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleSchedule_in_entryRuleSchedule75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchedule85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleSchedule122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSchedule139 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleSchedule156 = new BitSet(new long[]{0x0000000000702000L});
    public static final BitSet FOLLOW_ruleActividad_in_ruleSchedule177 = new BitSet(new long[]{0x0000000000702000L});
    public static final BitSet FOLLOW_13_in_ruleSchedule196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEspacio_in_entryRuleEspacio245 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEspacio255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleEspacio292 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleEspacio304 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEspacio321 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEspacio338 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEspacio355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrganizacion_in_entryRuleOrganizacion396 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrganizacion406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleOrganizacion443 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleOrganizacion460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrador_in_entryRuleOrador501 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrador511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleOrador548 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleOrador565 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleOrador582 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ruleOrganizacion_in_ruleOrador603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActividad_in_entryRuleActividad639 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActividad649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCharla_in_ruleActividad696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTaller_in_ruleActividad723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMesaDeDebate_in_ruleActividad751 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleActividad762 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleActividad774 = new BitSet(new long[]{0x0000000000700000L});
    public static final BitSet FOLLOW_ruleActividad_in_ruleActividad795 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleActividad807 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleActividad824 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleActividad841 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleActividad858 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleActividad875 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ruleEspacio_in_ruleActividad896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCharla_in_entryRuleCharla933 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCharla943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleCharla989 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ruleOrador_in_ruleCharla1010 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ruleTaller_in_entryRuleTaller1047 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTaller1057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleTaller1103 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ruleOrador_in_ruleTaller1124 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ruleMesaDeDebate_in_entryRuleMesaDeDebate1161 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMesaDeDebate1171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleMesaDeDebate1217 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ruleOrador_in_ruleMesaDeDebate1238 = new BitSet(new long[]{0x0000000000020002L});

}