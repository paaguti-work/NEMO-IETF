package com.telefonica.ietf.nemo.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.telefonica.ietf.nemo.services.NemoDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalNemoDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "';'", "'NodeModel'", "'Property'", "','", "':'", "'Boolean'", "'Integer'", "'String'", "'Date'", "'UUID'", "'EthAddr'", "'IPPrefix'"
    };
    public static final int RULE_ID=4;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__19=19;
    public static final int RULE_STRING=6;
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


        public InternalNemoDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalNemoDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalNemoDSLParser.tokenNames; }
    public String getGrammarFileName() { return "../com.telefonica.ietf.nemo/src-gen/com/telefonica/ietf/nemo/parser/antlr/internal/InternalNemoDSL.g"; }



     	private NemoDSLGrammarAccess grammarAccess;
     	
        public InternalNemoDSLParser(TokenStream input, NemoDSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "NemoFile";	
       	}
       	
       	@Override
       	protected NemoDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleNemoFile"
    // ../com.telefonica.ietf.nemo/src-gen/com/telefonica/ietf/nemo/parser/antlr/internal/InternalNemoDSL.g:67:1: entryRuleNemoFile returns [EObject current=null] : iv_ruleNemoFile= ruleNemoFile EOF ;
    public final EObject entryRuleNemoFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNemoFile = null;


        try {
            // ../com.telefonica.ietf.nemo/src-gen/com/telefonica/ietf/nemo/parser/antlr/internal/InternalNemoDSL.g:68:2: (iv_ruleNemoFile= ruleNemoFile EOF )
            // ../com.telefonica.ietf.nemo/src-gen/com/telefonica/ietf/nemo/parser/antlr/internal/InternalNemoDSL.g:69:2: iv_ruleNemoFile= ruleNemoFile EOF
            {
             newCompositeNode(grammarAccess.getNemoFileRule()); 
            pushFollow(FOLLOW_ruleNemoFile_in_entryRuleNemoFile75);
            iv_ruleNemoFile=ruleNemoFile();

            state._fsp--;

             current =iv_ruleNemoFile; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNemoFile85); 

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
    // $ANTLR end "entryRuleNemoFile"


    // $ANTLR start "ruleNemoFile"
    // ../com.telefonica.ietf.nemo/src-gen/com/telefonica/ietf/nemo/parser/antlr/internal/InternalNemoDSL.g:76:1: ruleNemoFile returns [EObject current=null] : ( (lv_specss_0_0= ruleSpec ) )* ;
    public final EObject ruleNemoFile() throws RecognitionException {
        EObject current = null;

        EObject lv_specss_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.telefonica.ietf.nemo/src-gen/com/telefonica/ietf/nemo/parser/antlr/internal/InternalNemoDSL.g:79:28: ( ( (lv_specss_0_0= ruleSpec ) )* )
            // ../com.telefonica.ietf.nemo/src-gen/com/telefonica/ietf/nemo/parser/antlr/internal/InternalNemoDSL.g:80:1: ( (lv_specss_0_0= ruleSpec ) )*
            {
            // ../com.telefonica.ietf.nemo/src-gen/com/telefonica/ietf/nemo/parser/antlr/internal/InternalNemoDSL.g:80:1: ( (lv_specss_0_0= ruleSpec ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../com.telefonica.ietf.nemo/src-gen/com/telefonica/ietf/nemo/parser/antlr/internal/InternalNemoDSL.g:81:1: (lv_specss_0_0= ruleSpec )
            	    {
            	    // ../com.telefonica.ietf.nemo/src-gen/com/telefonica/ietf/nemo/parser/antlr/internal/InternalNemoDSL.g:81:1: (lv_specss_0_0= ruleSpec )
            	    // ../com.telefonica.ietf.nemo/src-gen/com/telefonica/ietf/nemo/parser/antlr/internal/InternalNemoDSL.g:82:3: lv_specss_0_0= ruleSpec
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getNemoFileAccess().getSpecssSpecParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSpec_in_ruleNemoFile130);
            	    lv_specss_0_0=ruleSpec();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getNemoFileRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"specss",
            	            		lv_specss_0_0, 
            	            		"Spec");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleNemoFile"


    // $ANTLR start "entryRuleSpec"
    // ../com.telefonica.ietf.nemo/src-gen/com/telefonica/ietf/nemo/parser/antlr/internal/InternalNemoDSL.g:106:1: entryRuleSpec returns [EObject current=null] : iv_ruleSpec= ruleSpec EOF ;
    public final EObject entryRuleSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpec = null;


        try {
            // ../com.telefonica.ietf.nemo/src-gen/com/telefonica/ietf/nemo/parser/antlr/internal/InternalNemoDSL.g:107:2: (iv_ruleSpec= ruleSpec EOF )
            // ../com.telefonica.ietf.nemo/src-gen/com/telefonica/ietf/nemo/parser/antlr/internal/InternalNemoDSL.g:108:2: iv_ruleSpec= ruleSpec EOF
            {
             newCompositeNode(grammarAccess.getSpecRule()); 
            pushFollow(FOLLOW_ruleSpec_in_entryRuleSpec166);
            iv_ruleSpec=ruleSpec();

            state._fsp--;

             current =iv_ruleSpec; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSpec176); 

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
    // $ANTLR end "entryRuleSpec"


    // $ANTLR start "ruleSpec"
    // ../com.telefonica.ietf.nemo/src-gen/com/telefonica/ietf/nemo/parser/antlr/internal/InternalNemoDSL.g:115:1: ruleSpec returns [EObject current=null] : (this_ModelDefinition_0= ruleModelDefinition otherlv_1= ';' ) ;
    public final EObject ruleSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_ModelDefinition_0 = null;


         enterRule(); 
            
        try {
            // ../com.telefonica.ietf.nemo/src-gen/com/telefonica/ietf/nemo/parser/antlr/internal/InternalNemoDSL.g:118:28: ( (this_ModelDefinition_0= ruleModelDefinition otherlv_1= ';' ) )
            // ../com.telefonica.ietf.nemo/src-gen/com/telefonica/ietf/nemo/parser/antlr/internal/InternalNemoDSL.g:119:1: (this_ModelDefinition_0= ruleModelDefinition otherlv_1= ';' )
            {
            // ../com.telefonica.ietf.nemo/src-gen/com/telefonica/ietf/nemo/parser/antlr/internal/InternalNemoDSL.g:119:1: (this_ModelDefinition_0= ruleModelDefinition otherlv_1= ';' )
            // ../com.telefonica.ietf.nemo/src-gen/com/telefonica/ietf/nemo/parser/antlr/internal/InternalNemoDSL.g:120:5: this_ModelDefinition_0= ruleModelDefinition otherlv_1= ';'
            {
             
                    newCompositeNode(grammarAccess.getSpecAccess().getModelDefinitionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleModelDefinition_in_ruleSpec223);
            this_ModelDefinition_0=ruleModelDefinition();

            state._fsp--;

             
                    current = this_ModelDefinition_0; 
                    afterParserOrEnumRuleCall();
                
            otherlv_1=(Token)match(input,11,FOLLOW_11_in_ruleSpec234); 

                	newLeafNode(otherlv_1, grammarAccess.getSpecAccess().getSemicolonKeyword_1());
                

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
    // $ANTLR end "ruleSpec"


    // $ANTLR start "entryRuleModelDefinition"
    // ../com.telefonica.ietf.nemo/src-gen/com/telefonica/ietf/nemo/parser/antlr/internal/InternalNemoDSL.g:140:1: entryRuleModelDefinition returns [EObject current=null] : iv_ruleModelDefinition= ruleModelDefinition EOF ;
    public final EObject entryRuleModelDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelDefinition = null;


        try {
            // ../com.telefonica.ietf.nemo/src-gen/com/telefonica/ietf/nemo/parser/antlr/internal/InternalNemoDSL.g:141:2: (iv_ruleModelDefinition= ruleModelDefinition EOF )
            // ../com.telefonica.ietf.nemo/src-gen/com/telefonica/ietf/nemo/parser/antlr/internal/InternalNemoDSL.g:142:2: iv_ruleModelDefinition= ruleModelDefinition EOF
            {
             newCompositeNode(grammarAccess.getModelDefinitionRule()); 
            pushFollow(FOLLOW_ruleModelDefinition_in_entryRuleModelDefinition270);
            iv_ruleModelDefinition=ruleModelDefinition();

            state._fsp--;

             current =iv_ruleModelDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModelDefinition280); 

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
    // $ANTLR end "entryRuleModelDefinition"


    // $ANTLR start "ruleModelDefinition"
    // ../com.telefonica.ietf.nemo/src-gen/com/telefonica/ietf/nemo/parser/antlr/internal/InternalNemoDSL.g:149:1: ruleModelDefinition returns [EObject current=null] : this_NodeModel_0= ruleNodeModel ;
    public final EObject ruleModelDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_NodeModel_0 = null;


         enterRule(); 
            
        try {
            // ../com.telefonica.ietf.nemo/src-gen/com/telefonica/ietf/nemo/parser/antlr/internal/InternalNemoDSL.g:152:28: (this_NodeModel_0= ruleNodeModel )
            // ../com.telefonica.ietf.nemo/src-gen/com/telefonica/ietf/nemo/parser/antlr/internal/InternalNemoDSL.g:154:5: this_NodeModel_0= ruleNodeModel
            {
             
                    newCompositeNode(grammarAccess.getModelDefinitionAccess().getNodeModelParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleNodeModel_in_ruleModelDefinition326);
            this_NodeModel_0=ruleNodeModel();

            state._fsp--;

             
                    current = this_NodeModel_0; 
                    afterParserOrEnumRuleCall();
                

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
    // $ANTLR end "ruleModelDefinition"


    // $ANTLR start "entryRuleNodeModel"
    // ../com.telefonica.ietf.nemo/src-gen/com/telefonica/ietf/nemo/parser/antlr/internal/InternalNemoDSL.g:170:1: entryRuleNodeModel returns [EObject current=null] : iv_ruleNodeModel= ruleNodeModel EOF ;
    public final EObject entryRuleNodeModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeModel = null;


        try {
            // ../com.telefonica.ietf.nemo/src-gen/com/telefonica/ietf/nemo/parser/antlr/internal/InternalNemoDSL.g:171:2: (iv_ruleNodeModel= ruleNodeModel EOF )
            // ../com.telefonica.ietf.nemo/src-gen/com/telefonica/ietf/nemo/parser/antlr/internal/InternalNemoDSL.g:172:2: iv_ruleNodeModel= ruleNodeModel EOF
            {
             newCompositeNode(grammarAccess.getNodeModelRule()); 
            pushFollow(FOLLOW_ruleNodeModel_in_entryRuleNodeModel360);
            iv_ruleNodeModel=ruleNodeModel();

            state._fsp--;

             current =iv_ruleNodeModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNodeModel370); 

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
    // $ANTLR end "entryRuleNodeModel"


    // $ANTLR start "ruleNodeModel"
    // ../com.telefonica.ietf.nemo/src-gen/com/telefonica/ietf/nemo/parser/antlr/internal/InternalNemoDSL.g:179:1: ruleNodeModel returns [EObject current=null] : (otherlv_0= 'NodeModel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Property' ( (lv_propertyDefinitions_3_0= ruleDefineProperty ) ) (otherlv_4= ',' ( (lv_propertyDefinitions_5_0= ruleDefineProperty ) ) )* ) ;
    public final EObject ruleNodeModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_propertyDefinitions_3_0 = null;

        EObject lv_propertyDefinitions_5_0 = null;


         enterRule(); 
            
        try {
            // ../com.telefonica.ietf.nemo/src-gen/com/telefonica/ietf/nemo/parser/antlr/internal/InternalNemoDSL.g:182:28: ( (otherlv_0= 'NodeModel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Property' ( (lv_propertyDefinitions_3_0= ruleDefineProperty ) ) (otherlv_4= ',' ( (lv_propertyDefinitions_5_0= ruleDefineProperty ) ) )* ) )
            // ../com.telefonica.ietf.nemo/src-gen/com/telefonica/ietf/nemo/parser/antlr/internal/InternalNemoDSL.g:183:1: (otherlv_0= 'NodeModel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Property' ( (lv_propertyDefinitions_3_0= ruleDefineProperty ) ) (otherlv_4= ',' ( (lv_propertyDefinitions_5_0= ruleDefineProperty ) ) )* )
            {
            // ../com.telefonica.ietf.nemo/src-gen/com/telefonica/ietf/nemo/parser/antlr/internal/InternalNemoDSL.g:183:1: (otherlv_0= 'NodeModel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Property' ( (lv_propertyDefinitions_3_0= ruleDefineProperty ) ) (otherlv_4= ',' ( (lv_propertyDefinitions_5_0= ruleDefineProperty ) ) )* )
            // ../com.telefonica.ietf.nemo/src-gen/com/telefonica/ietf/nemo/parser/antlr/internal/InternalNemoDSL.g:183:3: otherlv_0= 'NodeModel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Property' ( (lv_propertyDefinitions_3_0= ruleDefineProperty ) ) (otherlv_4= ',' ( (lv_propertyDefinitions_5_0= ruleDefineProperty ) ) )*
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleNodeModel407); 

                	newLeafNode(otherlv_0, grammarAccess.getNodeModelAccess().getNodeModelKeyword_0());
                
            // ../com.telefonica.ietf.nemo/src-gen/com/telefonica/ietf/nemo/parser/antlr/internal/InternalNemoDSL.g:187:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.telefonica.ietf.nemo/src-gen/com/telefonica/ietf/nemo/parser/antlr/internal/InternalNemoDSL.g:188:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.telefonica.ietf.nemo/src-gen/com/telefonica/ietf/nemo/parser/antlr/internal/InternalNemoDSL.g:188:1: (lv_name_1_0= RULE_ID )
            // ../com.telefonica.ietf.nemo/src-gen/com/telefonica/ietf/nemo/parser/antlr/internal/InternalNemoDSL.g:189:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNodeModel424); 

            			newLeafNode(lv_name_1_0, grammarAccess.getNodeModelAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNodeModelRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleNodeModel441); 

                	newLeafNode(otherlv_2, grammarAccess.getNodeModelAccess().getPropertyKeyword_2());
                
            // ../com.telefonica.ietf.nemo/src-gen/com/telefonica/ietf/nemo/parser/antlr/internal/InternalNemoDSL.g:209:1: ( (lv_propertyDefinitions_3_0= ruleDefineProperty ) )
            // ../com.telefonica.ietf.nemo/src-gen/com/telefonica/ietf/nemo/parser/antlr/internal/InternalNemoDSL.g:210:1: (lv_propertyDefinitions_3_0= ruleDefineProperty )
            {
            // ../com.telefonica.ietf.nemo/src-gen/com/telefonica/ietf/nemo/parser/antlr/internal/InternalNemoDSL.g:210:1: (lv_propertyDefinitions_3_0= ruleDefineProperty )
            // ../com.telefonica.ietf.nemo/src-gen/com/telefonica/ietf/nemo/parser/antlr/internal/InternalNemoDSL.g:211:3: lv_propertyDefinitions_3_0= ruleDefineProperty
            {
             
            	        newCompositeNode(grammarAccess.getNodeModelAccess().getPropertyDefinitionsDefinePropertyParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleDefineProperty_in_ruleNodeModel462);
            lv_propertyDefinitions_3_0=ruleDefineProperty();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNodeModelRule());
            	        }
                   		add(
                   			current, 
                   			"propertyDefinitions",
                    		lv_propertyDefinitions_3_0, 
                    		"DefineProperty");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.telefonica.ietf.nemo/src-gen/com/telefonica/ietf/nemo/parser/antlr/internal/InternalNemoDSL.g:227:2: (otherlv_4= ',' ( (lv_propertyDefinitions_5_0= ruleDefineProperty ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../com.telefonica.ietf.nemo/src-gen/com/telefonica/ietf/nemo/parser/antlr/internal/InternalNemoDSL.g:227:4: otherlv_4= ',' ( (lv_propertyDefinitions_5_0= ruleDefineProperty ) )
            	    {
            	    otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleNodeModel475); 

            	        	newLeafNode(otherlv_4, grammarAccess.getNodeModelAccess().getCommaKeyword_4_0());
            	        
            	    // ../com.telefonica.ietf.nemo/src-gen/com/telefonica/ietf/nemo/parser/antlr/internal/InternalNemoDSL.g:231:1: ( (lv_propertyDefinitions_5_0= ruleDefineProperty ) )
            	    // ../com.telefonica.ietf.nemo/src-gen/com/telefonica/ietf/nemo/parser/antlr/internal/InternalNemoDSL.g:232:1: (lv_propertyDefinitions_5_0= ruleDefineProperty )
            	    {
            	    // ../com.telefonica.ietf.nemo/src-gen/com/telefonica/ietf/nemo/parser/antlr/internal/InternalNemoDSL.g:232:1: (lv_propertyDefinitions_5_0= ruleDefineProperty )
            	    // ../com.telefonica.ietf.nemo/src-gen/com/telefonica/ietf/nemo/parser/antlr/internal/InternalNemoDSL.g:233:3: lv_propertyDefinitions_5_0= ruleDefineProperty
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getNodeModelAccess().getPropertyDefinitionsDefinePropertyParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDefineProperty_in_ruleNodeModel496);
            	    lv_propertyDefinitions_5_0=ruleDefineProperty();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getNodeModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"propertyDefinitions",
            	            		lv_propertyDefinitions_5_0, 
            	            		"DefineProperty");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
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
    // $ANTLR end "ruleNodeModel"


    // $ANTLR start "entryRuleDefineProperty"
    // ../com.telefonica.ietf.nemo/src-gen/com/telefonica/ietf/nemo/parser/antlr/internal/InternalNemoDSL.g:257:1: entryRuleDefineProperty returns [EObject current=null] : iv_ruleDefineProperty= ruleDefineProperty EOF ;
    public final EObject entryRuleDefineProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefineProperty = null;


        try {
            // ../com.telefonica.ietf.nemo/src-gen/com/telefonica/ietf/nemo/parser/antlr/internal/InternalNemoDSL.g:258:2: (iv_ruleDefineProperty= ruleDefineProperty EOF )
            // ../com.telefonica.ietf.nemo/src-gen/com/telefonica/ietf/nemo/parser/antlr/internal/InternalNemoDSL.g:259:2: iv_ruleDefineProperty= ruleDefineProperty EOF
            {
             newCompositeNode(grammarAccess.getDefinePropertyRule()); 
            pushFollow(FOLLOW_ruleDefineProperty_in_entryRuleDefineProperty534);
            iv_ruleDefineProperty=ruleDefineProperty();

            state._fsp--;

             current =iv_ruleDefineProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefineProperty544); 

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
    // $ANTLR end "entryRuleDefineProperty"


    // $ANTLR start "ruleDefineProperty"
    // ../com.telefonica.ietf.nemo/src-gen/com/telefonica/ietf/nemo/parser/antlr/internal/InternalNemoDSL.g:266:1: ruleDefineProperty returns [EObject current=null] : ( ( (lv_propertyType_0_0= ruleType ) ) otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleDefineProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        EObject lv_propertyType_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.telefonica.ietf.nemo/src-gen/com/telefonica/ietf/nemo/parser/antlr/internal/InternalNemoDSL.g:269:28: ( ( ( (lv_propertyType_0_0= ruleType ) ) otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) ) )
            // ../com.telefonica.ietf.nemo/src-gen/com/telefonica/ietf/nemo/parser/antlr/internal/InternalNemoDSL.g:270:1: ( ( (lv_propertyType_0_0= ruleType ) ) otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) )
            {
            // ../com.telefonica.ietf.nemo/src-gen/com/telefonica/ietf/nemo/parser/antlr/internal/InternalNemoDSL.g:270:1: ( ( (lv_propertyType_0_0= ruleType ) ) otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) )
            // ../com.telefonica.ietf.nemo/src-gen/com/telefonica/ietf/nemo/parser/antlr/internal/InternalNemoDSL.g:270:2: ( (lv_propertyType_0_0= ruleType ) ) otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) )
            {
            // ../com.telefonica.ietf.nemo/src-gen/com/telefonica/ietf/nemo/parser/antlr/internal/InternalNemoDSL.g:270:2: ( (lv_propertyType_0_0= ruleType ) )
            // ../com.telefonica.ietf.nemo/src-gen/com/telefonica/ietf/nemo/parser/antlr/internal/InternalNemoDSL.g:271:1: (lv_propertyType_0_0= ruleType )
            {
            // ../com.telefonica.ietf.nemo/src-gen/com/telefonica/ietf/nemo/parser/antlr/internal/InternalNemoDSL.g:271:1: (lv_propertyType_0_0= ruleType )
            // ../com.telefonica.ietf.nemo/src-gen/com/telefonica/ietf/nemo/parser/antlr/internal/InternalNemoDSL.g:272:3: lv_propertyType_0_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getDefinePropertyAccess().getPropertyTypeTypeParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleDefineProperty590);
            lv_propertyType_0_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDefinePropertyRule());
            	        }
                   		set(
                   			current, 
                   			"propertyType",
                    		lv_propertyType_0_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleDefineProperty602); 

                	newLeafNode(otherlv_1, grammarAccess.getDefinePropertyAccess().getColonKeyword_1());
                
            // ../com.telefonica.ietf.nemo/src-gen/com/telefonica/ietf/nemo/parser/antlr/internal/InternalNemoDSL.g:292:1: ( (lv_name_2_0= RULE_ID ) )
            // ../com.telefonica.ietf.nemo/src-gen/com/telefonica/ietf/nemo/parser/antlr/internal/InternalNemoDSL.g:293:1: (lv_name_2_0= RULE_ID )
            {
            // ../com.telefonica.ietf.nemo/src-gen/com/telefonica/ietf/nemo/parser/antlr/internal/InternalNemoDSL.g:293:1: (lv_name_2_0= RULE_ID )
            // ../com.telefonica.ietf.nemo/src-gen/com/telefonica/ietf/nemo/parser/antlr/internal/InternalNemoDSL.g:294:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDefineProperty619); 

            			newLeafNode(lv_name_2_0, grammarAccess.getDefinePropertyAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDefinePropertyRule());
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
    // $ANTLR end "ruleDefineProperty"


    // $ANTLR start "entryRuleType"
    // ../com.telefonica.ietf.nemo/src-gen/com/telefonica/ietf/nemo/parser/antlr/internal/InternalNemoDSL.g:318:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../com.telefonica.ietf.nemo/src-gen/com/telefonica/ietf/nemo/parser/antlr/internal/InternalNemoDSL.g:319:2: (iv_ruleType= ruleType EOF )
            // ../com.telefonica.ietf.nemo/src-gen/com/telefonica/ietf/nemo/parser/antlr/internal/InternalNemoDSL.g:320:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType660);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType670); 

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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../com.telefonica.ietf.nemo/src-gen/com/telefonica/ietf/nemo/parser/antlr/internal/InternalNemoDSL.g:327:1: ruleType returns [EObject current=null] : ( ( () otherlv_1= 'Boolean' ) | otherlv_2= 'Integer' | otherlv_3= 'String' | otherlv_4= 'Date' | otherlv_5= 'UUID' | otherlv_6= 'EthAddr' | otherlv_7= 'IPPrefix' ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;

         enterRule(); 
            
        try {
            // ../com.telefonica.ietf.nemo/src-gen/com/telefonica/ietf/nemo/parser/antlr/internal/InternalNemoDSL.g:330:28: ( ( ( () otherlv_1= 'Boolean' ) | otherlv_2= 'Integer' | otherlv_3= 'String' | otherlv_4= 'Date' | otherlv_5= 'UUID' | otherlv_6= 'EthAddr' | otherlv_7= 'IPPrefix' ) )
            // ../com.telefonica.ietf.nemo/src-gen/com/telefonica/ietf/nemo/parser/antlr/internal/InternalNemoDSL.g:331:1: ( ( () otherlv_1= 'Boolean' ) | otherlv_2= 'Integer' | otherlv_3= 'String' | otherlv_4= 'Date' | otherlv_5= 'UUID' | otherlv_6= 'EthAddr' | otherlv_7= 'IPPrefix' )
            {
            // ../com.telefonica.ietf.nemo/src-gen/com/telefonica/ietf/nemo/parser/antlr/internal/InternalNemoDSL.g:331:1: ( ( () otherlv_1= 'Boolean' ) | otherlv_2= 'Integer' | otherlv_3= 'String' | otherlv_4= 'Date' | otherlv_5= 'UUID' | otherlv_6= 'EthAddr' | otherlv_7= 'IPPrefix' )
            int alt3=7;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt3=1;
                }
                break;
            case 17:
                {
                alt3=2;
                }
                break;
            case 18:
                {
                alt3=3;
                }
                break;
            case 19:
                {
                alt3=4;
                }
                break;
            case 20:
                {
                alt3=5;
                }
                break;
            case 21:
                {
                alt3=6;
                }
                break;
            case 22:
                {
                alt3=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../com.telefonica.ietf.nemo/src-gen/com/telefonica/ietf/nemo/parser/antlr/internal/InternalNemoDSL.g:331:2: ( () otherlv_1= 'Boolean' )
                    {
                    // ../com.telefonica.ietf.nemo/src-gen/com/telefonica/ietf/nemo/parser/antlr/internal/InternalNemoDSL.g:331:2: ( () otherlv_1= 'Boolean' )
                    // ../com.telefonica.ietf.nemo/src-gen/com/telefonica/ietf/nemo/parser/antlr/internal/InternalNemoDSL.g:331:3: () otherlv_1= 'Boolean'
                    {
                    // ../com.telefonica.ietf.nemo/src-gen/com/telefonica/ietf/nemo/parser/antlr/internal/InternalNemoDSL.g:331:3: ()
                    // ../com.telefonica.ietf.nemo/src-gen/com/telefonica/ietf/nemo/parser/antlr/internal/InternalNemoDSL.g:332:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getTypeAccess().getTypeAction_0_0(),
                                current);
                        

                    }

                    otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleType717); 

                        	newLeafNode(otherlv_1, grammarAccess.getTypeAccess().getBooleanKeyword_0_1());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../com.telefonica.ietf.nemo/src-gen/com/telefonica/ietf/nemo/parser/antlr/internal/InternalNemoDSL.g:342:7: otherlv_2= 'Integer'
                    {
                    otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleType736); 

                        	newLeafNode(otherlv_2, grammarAccess.getTypeAccess().getIntegerKeyword_1());
                        

                    }
                    break;
                case 3 :
                    // ../com.telefonica.ietf.nemo/src-gen/com/telefonica/ietf/nemo/parser/antlr/internal/InternalNemoDSL.g:347:7: otherlv_3= 'String'
                    {
                    otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleType754); 

                        	newLeafNode(otherlv_3, grammarAccess.getTypeAccess().getStringKeyword_2());
                        

                    }
                    break;
                case 4 :
                    // ../com.telefonica.ietf.nemo/src-gen/com/telefonica/ietf/nemo/parser/antlr/internal/InternalNemoDSL.g:352:7: otherlv_4= 'Date'
                    {
                    otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleType772); 

                        	newLeafNode(otherlv_4, grammarAccess.getTypeAccess().getDateKeyword_3());
                        

                    }
                    break;
                case 5 :
                    // ../com.telefonica.ietf.nemo/src-gen/com/telefonica/ietf/nemo/parser/antlr/internal/InternalNemoDSL.g:357:7: otherlv_5= 'UUID'
                    {
                    otherlv_5=(Token)match(input,20,FOLLOW_20_in_ruleType790); 

                        	newLeafNode(otherlv_5, grammarAccess.getTypeAccess().getUUIDKeyword_4());
                        

                    }
                    break;
                case 6 :
                    // ../com.telefonica.ietf.nemo/src-gen/com/telefonica/ietf/nemo/parser/antlr/internal/InternalNemoDSL.g:362:7: otherlv_6= 'EthAddr'
                    {
                    otherlv_6=(Token)match(input,21,FOLLOW_21_in_ruleType808); 

                        	newLeafNode(otherlv_6, grammarAccess.getTypeAccess().getEthAddrKeyword_5());
                        

                    }
                    break;
                case 7 :
                    // ../com.telefonica.ietf.nemo/src-gen/com/telefonica/ietf/nemo/parser/antlr/internal/InternalNemoDSL.g:367:7: otherlv_7= 'IPPrefix'
                    {
                    otherlv_7=(Token)match(input,22,FOLLOW_22_in_ruleType826); 

                        	newLeafNode(otherlv_7, grammarAccess.getTypeAccess().getIPPrefixKeyword_6());
                        

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
    // $ANTLR end "ruleType"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleNemoFile_in_entryRuleNemoFile75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNemoFile85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpec_in_ruleNemoFile130 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ruleSpec_in_entryRuleSpec166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSpec176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelDefinition_in_ruleSpec223 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleSpec234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelDefinition_in_entryRuleModelDefinition270 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModelDefinition280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeModel_in_ruleModelDefinition326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeModel_in_entryRuleNodeModel360 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNodeModel370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleNodeModel407 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNodeModel424 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleNodeModel441 = new BitSet(new long[]{0x00000000007F0000L});
    public static final BitSet FOLLOW_ruleDefineProperty_in_ruleNodeModel462 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleNodeModel475 = new BitSet(new long[]{0x00000000007F0000L});
    public static final BitSet FOLLOW_ruleDefineProperty_in_ruleNodeModel496 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleDefineProperty_in_entryRuleDefineProperty534 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefineProperty544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleDefineProperty590 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleDefineProperty602 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDefineProperty619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType660 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleType717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleType736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleType754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleType772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleType790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleType808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleType826 = new BitSet(new long[]{0x0000000000000002L});

}