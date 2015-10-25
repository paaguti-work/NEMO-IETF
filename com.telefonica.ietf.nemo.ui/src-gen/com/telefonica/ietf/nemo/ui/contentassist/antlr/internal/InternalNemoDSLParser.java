package com.telefonica.ietf.nemo.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import com.telefonica.ietf.nemo.services.NemoDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalNemoDSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Integer'", "'String'", "'Date'", "'UUID'", "'EthAddr'", "'IPPrefix'", "';'", "'NodeModel'", "'Property'", "','", "':'", "'Boolean'"
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
    public String getGrammarFileName() { return "../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g"; }


     
     	private NemoDSLGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(NemoDSLGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleNemoFile"
    // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:60:1: entryRuleNemoFile : ruleNemoFile EOF ;
    public final void entryRuleNemoFile() throws RecognitionException {
        try {
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:61:1: ( ruleNemoFile EOF )
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:62:1: ruleNemoFile EOF
            {
             before(grammarAccess.getNemoFileRule()); 
            pushFollow(FOLLOW_ruleNemoFile_in_entryRuleNemoFile61);
            ruleNemoFile();

            state._fsp--;

             after(grammarAccess.getNemoFileRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNemoFile68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNemoFile"


    // $ANTLR start "ruleNemoFile"
    // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:69:1: ruleNemoFile : ( ( rule__NemoFile__SpecssAssignment )* ) ;
    public final void ruleNemoFile() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:73:2: ( ( ( rule__NemoFile__SpecssAssignment )* ) )
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:74:1: ( ( rule__NemoFile__SpecssAssignment )* )
            {
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:74:1: ( ( rule__NemoFile__SpecssAssignment )* )
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:75:1: ( rule__NemoFile__SpecssAssignment )*
            {
             before(grammarAccess.getNemoFileAccess().getSpecssAssignment()); 
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:76:1: ( rule__NemoFile__SpecssAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==18) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:76:2: rule__NemoFile__SpecssAssignment
            	    {
            	    pushFollow(FOLLOW_rule__NemoFile__SpecssAssignment_in_ruleNemoFile94);
            	    rule__NemoFile__SpecssAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getNemoFileAccess().getSpecssAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNemoFile"


    // $ANTLR start "entryRuleSpec"
    // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:88:1: entryRuleSpec : ruleSpec EOF ;
    public final void entryRuleSpec() throws RecognitionException {
        try {
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:89:1: ( ruleSpec EOF )
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:90:1: ruleSpec EOF
            {
             before(grammarAccess.getSpecRule()); 
            pushFollow(FOLLOW_ruleSpec_in_entryRuleSpec122);
            ruleSpec();

            state._fsp--;

             after(grammarAccess.getSpecRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSpec129); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSpec"


    // $ANTLR start "ruleSpec"
    // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:97:1: ruleSpec : ( ( rule__Spec__Group__0 ) ) ;
    public final void ruleSpec() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:101:2: ( ( ( rule__Spec__Group__0 ) ) )
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:102:1: ( ( rule__Spec__Group__0 ) )
            {
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:102:1: ( ( rule__Spec__Group__0 ) )
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:103:1: ( rule__Spec__Group__0 )
            {
             before(grammarAccess.getSpecAccess().getGroup()); 
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:104:1: ( rule__Spec__Group__0 )
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:104:2: rule__Spec__Group__0
            {
            pushFollow(FOLLOW_rule__Spec__Group__0_in_ruleSpec155);
            rule__Spec__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSpecAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSpec"


    // $ANTLR start "entryRuleModelDefinition"
    // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:116:1: entryRuleModelDefinition : ruleModelDefinition EOF ;
    public final void entryRuleModelDefinition() throws RecognitionException {
        try {
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:117:1: ( ruleModelDefinition EOF )
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:118:1: ruleModelDefinition EOF
            {
             before(grammarAccess.getModelDefinitionRule()); 
            pushFollow(FOLLOW_ruleModelDefinition_in_entryRuleModelDefinition182);
            ruleModelDefinition();

            state._fsp--;

             after(grammarAccess.getModelDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModelDefinition189); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModelDefinition"


    // $ANTLR start "ruleModelDefinition"
    // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:125:1: ruleModelDefinition : ( ruleNodeModel ) ;
    public final void ruleModelDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:129:2: ( ( ruleNodeModel ) )
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:130:1: ( ruleNodeModel )
            {
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:130:1: ( ruleNodeModel )
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:131:1: ruleNodeModel
            {
             before(grammarAccess.getModelDefinitionAccess().getNodeModelParserRuleCall()); 
            pushFollow(FOLLOW_ruleNodeModel_in_ruleModelDefinition215);
            ruleNodeModel();

            state._fsp--;

             after(grammarAccess.getModelDefinitionAccess().getNodeModelParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModelDefinition"


    // $ANTLR start "entryRuleNodeModel"
    // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:144:1: entryRuleNodeModel : ruleNodeModel EOF ;
    public final void entryRuleNodeModel() throws RecognitionException {
        try {
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:145:1: ( ruleNodeModel EOF )
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:146:1: ruleNodeModel EOF
            {
             before(grammarAccess.getNodeModelRule()); 
            pushFollow(FOLLOW_ruleNodeModel_in_entryRuleNodeModel241);
            ruleNodeModel();

            state._fsp--;

             after(grammarAccess.getNodeModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNodeModel248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNodeModel"


    // $ANTLR start "ruleNodeModel"
    // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:153:1: ruleNodeModel : ( ( rule__NodeModel__Group__0 ) ) ;
    public final void ruleNodeModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:157:2: ( ( ( rule__NodeModel__Group__0 ) ) )
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:158:1: ( ( rule__NodeModel__Group__0 ) )
            {
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:158:1: ( ( rule__NodeModel__Group__0 ) )
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:159:1: ( rule__NodeModel__Group__0 )
            {
             before(grammarAccess.getNodeModelAccess().getGroup()); 
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:160:1: ( rule__NodeModel__Group__0 )
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:160:2: rule__NodeModel__Group__0
            {
            pushFollow(FOLLOW_rule__NodeModel__Group__0_in_ruleNodeModel274);
            rule__NodeModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNodeModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNodeModel"


    // $ANTLR start "entryRuleDefineProperty"
    // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:172:1: entryRuleDefineProperty : ruleDefineProperty EOF ;
    public final void entryRuleDefineProperty() throws RecognitionException {
        try {
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:173:1: ( ruleDefineProperty EOF )
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:174:1: ruleDefineProperty EOF
            {
             before(grammarAccess.getDefinePropertyRule()); 
            pushFollow(FOLLOW_ruleDefineProperty_in_entryRuleDefineProperty301);
            ruleDefineProperty();

            state._fsp--;

             after(grammarAccess.getDefinePropertyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefineProperty308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDefineProperty"


    // $ANTLR start "ruleDefineProperty"
    // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:181:1: ruleDefineProperty : ( ( rule__DefineProperty__Group__0 ) ) ;
    public final void ruleDefineProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:185:2: ( ( ( rule__DefineProperty__Group__0 ) ) )
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:186:1: ( ( rule__DefineProperty__Group__0 ) )
            {
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:186:1: ( ( rule__DefineProperty__Group__0 ) )
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:187:1: ( rule__DefineProperty__Group__0 )
            {
             before(grammarAccess.getDefinePropertyAccess().getGroup()); 
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:188:1: ( rule__DefineProperty__Group__0 )
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:188:2: rule__DefineProperty__Group__0
            {
            pushFollow(FOLLOW_rule__DefineProperty__Group__0_in_ruleDefineProperty334);
            rule__DefineProperty__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDefinePropertyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDefineProperty"


    // $ANTLR start "entryRuleType"
    // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:200:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:201:1: ( ruleType EOF )
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:202:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType361);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:209:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:213:2: ( ( ( rule__Type__Alternatives ) ) )
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:214:1: ( ( rule__Type__Alternatives ) )
            {
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:214:1: ( ( rule__Type__Alternatives ) )
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:215:1: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:216:1: ( rule__Type__Alternatives )
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:216:2: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_rule__Type__Alternatives_in_ruleType394);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "rule__Type__Alternatives"
    // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:228:1: rule__Type__Alternatives : ( ( ( rule__Type__Group_0__0 ) ) | ( 'Integer' ) | ( 'String' ) | ( 'Date' ) | ( 'UUID' ) | ( 'EthAddr' ) | ( 'IPPrefix' ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:232:1: ( ( ( rule__Type__Group_0__0 ) ) | ( 'Integer' ) | ( 'String' ) | ( 'Date' ) | ( 'UUID' ) | ( 'EthAddr' ) | ( 'IPPrefix' ) )
            int alt2=7;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt2=1;
                }
                break;
            case 11:
                {
                alt2=2;
                }
                break;
            case 12:
                {
                alt2=3;
                }
                break;
            case 13:
                {
                alt2=4;
                }
                break;
            case 14:
                {
                alt2=5;
                }
                break;
            case 15:
                {
                alt2=6;
                }
                break;
            case 16:
                {
                alt2=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:233:1: ( ( rule__Type__Group_0__0 ) )
                    {
                    // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:233:1: ( ( rule__Type__Group_0__0 ) )
                    // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:234:1: ( rule__Type__Group_0__0 )
                    {
                     before(grammarAccess.getTypeAccess().getGroup_0()); 
                    // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:235:1: ( rule__Type__Group_0__0 )
                    // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:235:2: rule__Type__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Type__Group_0__0_in_rule__Type__Alternatives430);
                    rule__Type__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:239:6: ( 'Integer' )
                    {
                    // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:239:6: ( 'Integer' )
                    // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:240:1: 'Integer'
                    {
                     before(grammarAccess.getTypeAccess().getIntegerKeyword_1()); 
                    match(input,11,FOLLOW_11_in_rule__Type__Alternatives449); 
                     after(grammarAccess.getTypeAccess().getIntegerKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:247:6: ( 'String' )
                    {
                    // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:247:6: ( 'String' )
                    // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:248:1: 'String'
                    {
                     before(grammarAccess.getTypeAccess().getStringKeyword_2()); 
                    match(input,12,FOLLOW_12_in_rule__Type__Alternatives469); 
                     after(grammarAccess.getTypeAccess().getStringKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:255:6: ( 'Date' )
                    {
                    // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:255:6: ( 'Date' )
                    // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:256:1: 'Date'
                    {
                     before(grammarAccess.getTypeAccess().getDateKeyword_3()); 
                    match(input,13,FOLLOW_13_in_rule__Type__Alternatives489); 
                     after(grammarAccess.getTypeAccess().getDateKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:263:6: ( 'UUID' )
                    {
                    // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:263:6: ( 'UUID' )
                    // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:264:1: 'UUID'
                    {
                     before(grammarAccess.getTypeAccess().getUUIDKeyword_4()); 
                    match(input,14,FOLLOW_14_in_rule__Type__Alternatives509); 
                     after(grammarAccess.getTypeAccess().getUUIDKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:271:6: ( 'EthAddr' )
                    {
                    // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:271:6: ( 'EthAddr' )
                    // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:272:1: 'EthAddr'
                    {
                     before(grammarAccess.getTypeAccess().getEthAddrKeyword_5()); 
                    match(input,15,FOLLOW_15_in_rule__Type__Alternatives529); 
                     after(grammarAccess.getTypeAccess().getEthAddrKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:279:6: ( 'IPPrefix' )
                    {
                    // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:279:6: ( 'IPPrefix' )
                    // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:280:1: 'IPPrefix'
                    {
                     before(grammarAccess.getTypeAccess().getIPPrefixKeyword_6()); 
                    match(input,16,FOLLOW_16_in_rule__Type__Alternatives549); 
                     after(grammarAccess.getTypeAccess().getIPPrefixKeyword_6()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__Spec__Group__0"
    // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:294:1: rule__Spec__Group__0 : rule__Spec__Group__0__Impl rule__Spec__Group__1 ;
    public final void rule__Spec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:298:1: ( rule__Spec__Group__0__Impl rule__Spec__Group__1 )
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:299:2: rule__Spec__Group__0__Impl rule__Spec__Group__1
            {
            pushFollow(FOLLOW_rule__Spec__Group__0__Impl_in_rule__Spec__Group__0581);
            rule__Spec__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Spec__Group__1_in_rule__Spec__Group__0584);
            rule__Spec__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spec__Group__0"


    // $ANTLR start "rule__Spec__Group__0__Impl"
    // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:306:1: rule__Spec__Group__0__Impl : ( ruleModelDefinition ) ;
    public final void rule__Spec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:310:1: ( ( ruleModelDefinition ) )
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:311:1: ( ruleModelDefinition )
            {
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:311:1: ( ruleModelDefinition )
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:312:1: ruleModelDefinition
            {
             before(grammarAccess.getSpecAccess().getModelDefinitionParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleModelDefinition_in_rule__Spec__Group__0__Impl611);
            ruleModelDefinition();

            state._fsp--;

             after(grammarAccess.getSpecAccess().getModelDefinitionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spec__Group__0__Impl"


    // $ANTLR start "rule__Spec__Group__1"
    // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:323:1: rule__Spec__Group__1 : rule__Spec__Group__1__Impl ;
    public final void rule__Spec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:327:1: ( rule__Spec__Group__1__Impl )
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:328:2: rule__Spec__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Spec__Group__1__Impl_in_rule__Spec__Group__1640);
            rule__Spec__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spec__Group__1"


    // $ANTLR start "rule__Spec__Group__1__Impl"
    // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:334:1: rule__Spec__Group__1__Impl : ( ';' ) ;
    public final void rule__Spec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:338:1: ( ( ';' ) )
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:339:1: ( ';' )
            {
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:339:1: ( ';' )
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:340:1: ';'
            {
             before(grammarAccess.getSpecAccess().getSemicolonKeyword_1()); 
            match(input,17,FOLLOW_17_in_rule__Spec__Group__1__Impl668); 
             after(grammarAccess.getSpecAccess().getSemicolonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spec__Group__1__Impl"


    // $ANTLR start "rule__NodeModel__Group__0"
    // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:357:1: rule__NodeModel__Group__0 : rule__NodeModel__Group__0__Impl rule__NodeModel__Group__1 ;
    public final void rule__NodeModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:361:1: ( rule__NodeModel__Group__0__Impl rule__NodeModel__Group__1 )
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:362:2: rule__NodeModel__Group__0__Impl rule__NodeModel__Group__1
            {
            pushFollow(FOLLOW_rule__NodeModel__Group__0__Impl_in_rule__NodeModel__Group__0703);
            rule__NodeModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NodeModel__Group__1_in_rule__NodeModel__Group__0706);
            rule__NodeModel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeModel__Group__0"


    // $ANTLR start "rule__NodeModel__Group__0__Impl"
    // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:369:1: rule__NodeModel__Group__0__Impl : ( 'NodeModel' ) ;
    public final void rule__NodeModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:373:1: ( ( 'NodeModel' ) )
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:374:1: ( 'NodeModel' )
            {
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:374:1: ( 'NodeModel' )
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:375:1: 'NodeModel'
            {
             before(grammarAccess.getNodeModelAccess().getNodeModelKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__NodeModel__Group__0__Impl734); 
             after(grammarAccess.getNodeModelAccess().getNodeModelKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeModel__Group__0__Impl"


    // $ANTLR start "rule__NodeModel__Group__1"
    // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:388:1: rule__NodeModel__Group__1 : rule__NodeModel__Group__1__Impl rule__NodeModel__Group__2 ;
    public final void rule__NodeModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:392:1: ( rule__NodeModel__Group__1__Impl rule__NodeModel__Group__2 )
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:393:2: rule__NodeModel__Group__1__Impl rule__NodeModel__Group__2
            {
            pushFollow(FOLLOW_rule__NodeModel__Group__1__Impl_in_rule__NodeModel__Group__1765);
            rule__NodeModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NodeModel__Group__2_in_rule__NodeModel__Group__1768);
            rule__NodeModel__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeModel__Group__1"


    // $ANTLR start "rule__NodeModel__Group__1__Impl"
    // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:400:1: rule__NodeModel__Group__1__Impl : ( ( rule__NodeModel__NameAssignment_1 ) ) ;
    public final void rule__NodeModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:404:1: ( ( ( rule__NodeModel__NameAssignment_1 ) ) )
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:405:1: ( ( rule__NodeModel__NameAssignment_1 ) )
            {
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:405:1: ( ( rule__NodeModel__NameAssignment_1 ) )
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:406:1: ( rule__NodeModel__NameAssignment_1 )
            {
             before(grammarAccess.getNodeModelAccess().getNameAssignment_1()); 
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:407:1: ( rule__NodeModel__NameAssignment_1 )
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:407:2: rule__NodeModel__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__NodeModel__NameAssignment_1_in_rule__NodeModel__Group__1__Impl795);
            rule__NodeModel__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNodeModelAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeModel__Group__1__Impl"


    // $ANTLR start "rule__NodeModel__Group__2"
    // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:417:1: rule__NodeModel__Group__2 : rule__NodeModel__Group__2__Impl rule__NodeModel__Group__3 ;
    public final void rule__NodeModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:421:1: ( rule__NodeModel__Group__2__Impl rule__NodeModel__Group__3 )
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:422:2: rule__NodeModel__Group__2__Impl rule__NodeModel__Group__3
            {
            pushFollow(FOLLOW_rule__NodeModel__Group__2__Impl_in_rule__NodeModel__Group__2825);
            rule__NodeModel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NodeModel__Group__3_in_rule__NodeModel__Group__2828);
            rule__NodeModel__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeModel__Group__2"


    // $ANTLR start "rule__NodeModel__Group__2__Impl"
    // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:429:1: rule__NodeModel__Group__2__Impl : ( 'Property' ) ;
    public final void rule__NodeModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:433:1: ( ( 'Property' ) )
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:434:1: ( 'Property' )
            {
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:434:1: ( 'Property' )
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:435:1: 'Property'
            {
             before(grammarAccess.getNodeModelAccess().getPropertyKeyword_2()); 
            match(input,19,FOLLOW_19_in_rule__NodeModel__Group__2__Impl856); 
             after(grammarAccess.getNodeModelAccess().getPropertyKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeModel__Group__2__Impl"


    // $ANTLR start "rule__NodeModel__Group__3"
    // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:448:1: rule__NodeModel__Group__3 : rule__NodeModel__Group__3__Impl rule__NodeModel__Group__4 ;
    public final void rule__NodeModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:452:1: ( rule__NodeModel__Group__3__Impl rule__NodeModel__Group__4 )
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:453:2: rule__NodeModel__Group__3__Impl rule__NodeModel__Group__4
            {
            pushFollow(FOLLOW_rule__NodeModel__Group__3__Impl_in_rule__NodeModel__Group__3887);
            rule__NodeModel__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NodeModel__Group__4_in_rule__NodeModel__Group__3890);
            rule__NodeModel__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeModel__Group__3"


    // $ANTLR start "rule__NodeModel__Group__3__Impl"
    // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:460:1: rule__NodeModel__Group__3__Impl : ( ( rule__NodeModel__PropertyDefinitionsAssignment_3 ) ) ;
    public final void rule__NodeModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:464:1: ( ( ( rule__NodeModel__PropertyDefinitionsAssignment_3 ) ) )
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:465:1: ( ( rule__NodeModel__PropertyDefinitionsAssignment_3 ) )
            {
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:465:1: ( ( rule__NodeModel__PropertyDefinitionsAssignment_3 ) )
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:466:1: ( rule__NodeModel__PropertyDefinitionsAssignment_3 )
            {
             before(grammarAccess.getNodeModelAccess().getPropertyDefinitionsAssignment_3()); 
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:467:1: ( rule__NodeModel__PropertyDefinitionsAssignment_3 )
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:467:2: rule__NodeModel__PropertyDefinitionsAssignment_3
            {
            pushFollow(FOLLOW_rule__NodeModel__PropertyDefinitionsAssignment_3_in_rule__NodeModel__Group__3__Impl917);
            rule__NodeModel__PropertyDefinitionsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getNodeModelAccess().getPropertyDefinitionsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeModel__Group__3__Impl"


    // $ANTLR start "rule__NodeModel__Group__4"
    // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:477:1: rule__NodeModel__Group__4 : rule__NodeModel__Group__4__Impl ;
    public final void rule__NodeModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:481:1: ( rule__NodeModel__Group__4__Impl )
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:482:2: rule__NodeModel__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__NodeModel__Group__4__Impl_in_rule__NodeModel__Group__4947);
            rule__NodeModel__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeModel__Group__4"


    // $ANTLR start "rule__NodeModel__Group__4__Impl"
    // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:488:1: rule__NodeModel__Group__4__Impl : ( ( rule__NodeModel__Group_4__0 )* ) ;
    public final void rule__NodeModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:492:1: ( ( ( rule__NodeModel__Group_4__0 )* ) )
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:493:1: ( ( rule__NodeModel__Group_4__0 )* )
            {
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:493:1: ( ( rule__NodeModel__Group_4__0 )* )
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:494:1: ( rule__NodeModel__Group_4__0 )*
            {
             before(grammarAccess.getNodeModelAccess().getGroup_4()); 
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:495:1: ( rule__NodeModel__Group_4__0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==20) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:495:2: rule__NodeModel__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__NodeModel__Group_4__0_in_rule__NodeModel__Group__4__Impl974);
            	    rule__NodeModel__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getNodeModelAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeModel__Group__4__Impl"


    // $ANTLR start "rule__NodeModel__Group_4__0"
    // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:515:1: rule__NodeModel__Group_4__0 : rule__NodeModel__Group_4__0__Impl rule__NodeModel__Group_4__1 ;
    public final void rule__NodeModel__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:519:1: ( rule__NodeModel__Group_4__0__Impl rule__NodeModel__Group_4__1 )
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:520:2: rule__NodeModel__Group_4__0__Impl rule__NodeModel__Group_4__1
            {
            pushFollow(FOLLOW_rule__NodeModel__Group_4__0__Impl_in_rule__NodeModel__Group_4__01015);
            rule__NodeModel__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NodeModel__Group_4__1_in_rule__NodeModel__Group_4__01018);
            rule__NodeModel__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeModel__Group_4__0"


    // $ANTLR start "rule__NodeModel__Group_4__0__Impl"
    // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:527:1: rule__NodeModel__Group_4__0__Impl : ( ',' ) ;
    public final void rule__NodeModel__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:531:1: ( ( ',' ) )
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:532:1: ( ',' )
            {
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:532:1: ( ',' )
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:533:1: ','
            {
             before(grammarAccess.getNodeModelAccess().getCommaKeyword_4_0()); 
            match(input,20,FOLLOW_20_in_rule__NodeModel__Group_4__0__Impl1046); 
             after(grammarAccess.getNodeModelAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeModel__Group_4__0__Impl"


    // $ANTLR start "rule__NodeModel__Group_4__1"
    // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:546:1: rule__NodeModel__Group_4__1 : rule__NodeModel__Group_4__1__Impl ;
    public final void rule__NodeModel__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:550:1: ( rule__NodeModel__Group_4__1__Impl )
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:551:2: rule__NodeModel__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__NodeModel__Group_4__1__Impl_in_rule__NodeModel__Group_4__11077);
            rule__NodeModel__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeModel__Group_4__1"


    // $ANTLR start "rule__NodeModel__Group_4__1__Impl"
    // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:557:1: rule__NodeModel__Group_4__1__Impl : ( ( rule__NodeModel__PropertyDefinitionsAssignment_4_1 ) ) ;
    public final void rule__NodeModel__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:561:1: ( ( ( rule__NodeModel__PropertyDefinitionsAssignment_4_1 ) ) )
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:562:1: ( ( rule__NodeModel__PropertyDefinitionsAssignment_4_1 ) )
            {
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:562:1: ( ( rule__NodeModel__PropertyDefinitionsAssignment_4_1 ) )
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:563:1: ( rule__NodeModel__PropertyDefinitionsAssignment_4_1 )
            {
             before(grammarAccess.getNodeModelAccess().getPropertyDefinitionsAssignment_4_1()); 
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:564:1: ( rule__NodeModel__PropertyDefinitionsAssignment_4_1 )
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:564:2: rule__NodeModel__PropertyDefinitionsAssignment_4_1
            {
            pushFollow(FOLLOW_rule__NodeModel__PropertyDefinitionsAssignment_4_1_in_rule__NodeModel__Group_4__1__Impl1104);
            rule__NodeModel__PropertyDefinitionsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getNodeModelAccess().getPropertyDefinitionsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeModel__Group_4__1__Impl"


    // $ANTLR start "rule__DefineProperty__Group__0"
    // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:578:1: rule__DefineProperty__Group__0 : rule__DefineProperty__Group__0__Impl rule__DefineProperty__Group__1 ;
    public final void rule__DefineProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:582:1: ( rule__DefineProperty__Group__0__Impl rule__DefineProperty__Group__1 )
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:583:2: rule__DefineProperty__Group__0__Impl rule__DefineProperty__Group__1
            {
            pushFollow(FOLLOW_rule__DefineProperty__Group__0__Impl_in_rule__DefineProperty__Group__01138);
            rule__DefineProperty__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DefineProperty__Group__1_in_rule__DefineProperty__Group__01141);
            rule__DefineProperty__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefineProperty__Group__0"


    // $ANTLR start "rule__DefineProperty__Group__0__Impl"
    // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:590:1: rule__DefineProperty__Group__0__Impl : ( ( rule__DefineProperty__PropertyTypeAssignment_0 ) ) ;
    public final void rule__DefineProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:594:1: ( ( ( rule__DefineProperty__PropertyTypeAssignment_0 ) ) )
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:595:1: ( ( rule__DefineProperty__PropertyTypeAssignment_0 ) )
            {
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:595:1: ( ( rule__DefineProperty__PropertyTypeAssignment_0 ) )
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:596:1: ( rule__DefineProperty__PropertyTypeAssignment_0 )
            {
             before(grammarAccess.getDefinePropertyAccess().getPropertyTypeAssignment_0()); 
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:597:1: ( rule__DefineProperty__PropertyTypeAssignment_0 )
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:597:2: rule__DefineProperty__PropertyTypeAssignment_0
            {
            pushFollow(FOLLOW_rule__DefineProperty__PropertyTypeAssignment_0_in_rule__DefineProperty__Group__0__Impl1168);
            rule__DefineProperty__PropertyTypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDefinePropertyAccess().getPropertyTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefineProperty__Group__0__Impl"


    // $ANTLR start "rule__DefineProperty__Group__1"
    // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:607:1: rule__DefineProperty__Group__1 : rule__DefineProperty__Group__1__Impl rule__DefineProperty__Group__2 ;
    public final void rule__DefineProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:611:1: ( rule__DefineProperty__Group__1__Impl rule__DefineProperty__Group__2 )
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:612:2: rule__DefineProperty__Group__1__Impl rule__DefineProperty__Group__2
            {
            pushFollow(FOLLOW_rule__DefineProperty__Group__1__Impl_in_rule__DefineProperty__Group__11198);
            rule__DefineProperty__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DefineProperty__Group__2_in_rule__DefineProperty__Group__11201);
            rule__DefineProperty__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefineProperty__Group__1"


    // $ANTLR start "rule__DefineProperty__Group__1__Impl"
    // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:619:1: rule__DefineProperty__Group__1__Impl : ( ':' ) ;
    public final void rule__DefineProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:623:1: ( ( ':' ) )
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:624:1: ( ':' )
            {
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:624:1: ( ':' )
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:625:1: ':'
            {
             before(grammarAccess.getDefinePropertyAccess().getColonKeyword_1()); 
            match(input,21,FOLLOW_21_in_rule__DefineProperty__Group__1__Impl1229); 
             after(grammarAccess.getDefinePropertyAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefineProperty__Group__1__Impl"


    // $ANTLR start "rule__DefineProperty__Group__2"
    // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:638:1: rule__DefineProperty__Group__2 : rule__DefineProperty__Group__2__Impl ;
    public final void rule__DefineProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:642:1: ( rule__DefineProperty__Group__2__Impl )
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:643:2: rule__DefineProperty__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__DefineProperty__Group__2__Impl_in_rule__DefineProperty__Group__21260);
            rule__DefineProperty__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefineProperty__Group__2"


    // $ANTLR start "rule__DefineProperty__Group__2__Impl"
    // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:649:1: rule__DefineProperty__Group__2__Impl : ( ( rule__DefineProperty__NameAssignment_2 ) ) ;
    public final void rule__DefineProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:653:1: ( ( ( rule__DefineProperty__NameAssignment_2 ) ) )
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:654:1: ( ( rule__DefineProperty__NameAssignment_2 ) )
            {
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:654:1: ( ( rule__DefineProperty__NameAssignment_2 ) )
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:655:1: ( rule__DefineProperty__NameAssignment_2 )
            {
             before(grammarAccess.getDefinePropertyAccess().getNameAssignment_2()); 
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:656:1: ( rule__DefineProperty__NameAssignment_2 )
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:656:2: rule__DefineProperty__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__DefineProperty__NameAssignment_2_in_rule__DefineProperty__Group__2__Impl1287);
            rule__DefineProperty__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDefinePropertyAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefineProperty__Group__2__Impl"


    // $ANTLR start "rule__Type__Group_0__0"
    // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:672:1: rule__Type__Group_0__0 : rule__Type__Group_0__0__Impl rule__Type__Group_0__1 ;
    public final void rule__Type__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:676:1: ( rule__Type__Group_0__0__Impl rule__Type__Group_0__1 )
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:677:2: rule__Type__Group_0__0__Impl rule__Type__Group_0__1
            {
            pushFollow(FOLLOW_rule__Type__Group_0__0__Impl_in_rule__Type__Group_0__01323);
            rule__Type__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Type__Group_0__1_in_rule__Type__Group_0__01326);
            rule__Type__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_0__0"


    // $ANTLR start "rule__Type__Group_0__0__Impl"
    // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:684:1: rule__Type__Group_0__0__Impl : ( () ) ;
    public final void rule__Type__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:688:1: ( ( () ) )
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:689:1: ( () )
            {
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:689:1: ( () )
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:690:1: ()
            {
             before(grammarAccess.getTypeAccess().getTypeAction_0_0()); 
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:691:1: ()
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:693:1: 
            {
            }

             after(grammarAccess.getTypeAccess().getTypeAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_0__0__Impl"


    // $ANTLR start "rule__Type__Group_0__1"
    // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:703:1: rule__Type__Group_0__1 : rule__Type__Group_0__1__Impl ;
    public final void rule__Type__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:707:1: ( rule__Type__Group_0__1__Impl )
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:708:2: rule__Type__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Type__Group_0__1__Impl_in_rule__Type__Group_0__11384);
            rule__Type__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_0__1"


    // $ANTLR start "rule__Type__Group_0__1__Impl"
    // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:714:1: rule__Type__Group_0__1__Impl : ( 'Boolean' ) ;
    public final void rule__Type__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:718:1: ( ( 'Boolean' ) )
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:719:1: ( 'Boolean' )
            {
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:719:1: ( 'Boolean' )
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:720:1: 'Boolean'
            {
             before(grammarAccess.getTypeAccess().getBooleanKeyword_0_1()); 
            match(input,22,FOLLOW_22_in_rule__Type__Group_0__1__Impl1412); 
             after(grammarAccess.getTypeAccess().getBooleanKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_0__1__Impl"


    // $ANTLR start "rule__NemoFile__SpecssAssignment"
    // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:738:1: rule__NemoFile__SpecssAssignment : ( ruleSpec ) ;
    public final void rule__NemoFile__SpecssAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:742:1: ( ( ruleSpec ) )
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:743:1: ( ruleSpec )
            {
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:743:1: ( ruleSpec )
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:744:1: ruleSpec
            {
             before(grammarAccess.getNemoFileAccess().getSpecssSpecParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleSpec_in_rule__NemoFile__SpecssAssignment1452);
            ruleSpec();

            state._fsp--;

             after(grammarAccess.getNemoFileAccess().getSpecssSpecParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NemoFile__SpecssAssignment"


    // $ANTLR start "rule__NodeModel__NameAssignment_1"
    // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:753:1: rule__NodeModel__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__NodeModel__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:757:1: ( ( RULE_ID ) )
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:758:1: ( RULE_ID )
            {
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:758:1: ( RULE_ID )
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:759:1: RULE_ID
            {
             before(grammarAccess.getNodeModelAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NodeModel__NameAssignment_11483); 
             after(grammarAccess.getNodeModelAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeModel__NameAssignment_1"


    // $ANTLR start "rule__NodeModel__PropertyDefinitionsAssignment_3"
    // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:768:1: rule__NodeModel__PropertyDefinitionsAssignment_3 : ( ruleDefineProperty ) ;
    public final void rule__NodeModel__PropertyDefinitionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:772:1: ( ( ruleDefineProperty ) )
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:773:1: ( ruleDefineProperty )
            {
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:773:1: ( ruleDefineProperty )
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:774:1: ruleDefineProperty
            {
             before(grammarAccess.getNodeModelAccess().getPropertyDefinitionsDefinePropertyParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleDefineProperty_in_rule__NodeModel__PropertyDefinitionsAssignment_31514);
            ruleDefineProperty();

            state._fsp--;

             after(grammarAccess.getNodeModelAccess().getPropertyDefinitionsDefinePropertyParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeModel__PropertyDefinitionsAssignment_3"


    // $ANTLR start "rule__NodeModel__PropertyDefinitionsAssignment_4_1"
    // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:783:1: rule__NodeModel__PropertyDefinitionsAssignment_4_1 : ( ruleDefineProperty ) ;
    public final void rule__NodeModel__PropertyDefinitionsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:787:1: ( ( ruleDefineProperty ) )
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:788:1: ( ruleDefineProperty )
            {
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:788:1: ( ruleDefineProperty )
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:789:1: ruleDefineProperty
            {
             before(grammarAccess.getNodeModelAccess().getPropertyDefinitionsDefinePropertyParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleDefineProperty_in_rule__NodeModel__PropertyDefinitionsAssignment_4_11545);
            ruleDefineProperty();

            state._fsp--;

             after(grammarAccess.getNodeModelAccess().getPropertyDefinitionsDefinePropertyParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeModel__PropertyDefinitionsAssignment_4_1"


    // $ANTLR start "rule__DefineProperty__PropertyTypeAssignment_0"
    // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:798:1: rule__DefineProperty__PropertyTypeAssignment_0 : ( ruleType ) ;
    public final void rule__DefineProperty__PropertyTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:802:1: ( ( ruleType ) )
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:803:1: ( ruleType )
            {
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:803:1: ( ruleType )
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:804:1: ruleType
            {
             before(grammarAccess.getDefinePropertyAccess().getPropertyTypeTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__DefineProperty__PropertyTypeAssignment_01576);
            ruleType();

            state._fsp--;

             after(grammarAccess.getDefinePropertyAccess().getPropertyTypeTypeParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefineProperty__PropertyTypeAssignment_0"


    // $ANTLR start "rule__DefineProperty__NameAssignment_2"
    // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:813:1: rule__DefineProperty__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__DefineProperty__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:817:1: ( ( RULE_ID ) )
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:818:1: ( RULE_ID )
            {
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:818:1: ( RULE_ID )
            // ../com.telefonica.ietf.nemo.ui/src-gen/com/telefonica/ietf/nemo/ui/contentassist/antlr/internal/InternalNemoDSL.g:819:1: RULE_ID
            {
             before(grammarAccess.getDefinePropertyAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DefineProperty__NameAssignment_21607); 
             after(grammarAccess.getDefinePropertyAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefineProperty__NameAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleNemoFile_in_entryRuleNemoFile61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNemoFile68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NemoFile__SpecssAssignment_in_ruleNemoFile94 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ruleSpec_in_entryRuleSpec122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSpec129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Spec__Group__0_in_ruleSpec155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelDefinition_in_entryRuleModelDefinition182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModelDefinition189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeModel_in_ruleModelDefinition215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeModel_in_entryRuleNodeModel241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNodeModel248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeModel__Group__0_in_ruleNodeModel274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefineProperty_in_entryRuleDefineProperty301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefineProperty308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefineProperty__Group__0_in_ruleDefineProperty334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Alternatives_in_ruleType394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_0__0_in_rule__Type__Alternatives430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Type__Alternatives449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Type__Alternatives469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Type__Alternatives489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Type__Alternatives509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Type__Alternatives529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Type__Alternatives549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Spec__Group__0__Impl_in_rule__Spec__Group__0581 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Spec__Group__1_in_rule__Spec__Group__0584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelDefinition_in_rule__Spec__Group__0__Impl611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Spec__Group__1__Impl_in_rule__Spec__Group__1640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Spec__Group__1__Impl668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeModel__Group__0__Impl_in_rule__NodeModel__Group__0703 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__NodeModel__Group__1_in_rule__NodeModel__Group__0706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__NodeModel__Group__0__Impl734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeModel__Group__1__Impl_in_rule__NodeModel__Group__1765 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__NodeModel__Group__2_in_rule__NodeModel__Group__1768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeModel__NameAssignment_1_in_rule__NodeModel__Group__1__Impl795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeModel__Group__2__Impl_in_rule__NodeModel__Group__2825 = new BitSet(new long[]{0x000000000041F800L});
    public static final BitSet FOLLOW_rule__NodeModel__Group__3_in_rule__NodeModel__Group__2828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__NodeModel__Group__2__Impl856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeModel__Group__3__Impl_in_rule__NodeModel__Group__3887 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__NodeModel__Group__4_in_rule__NodeModel__Group__3890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeModel__PropertyDefinitionsAssignment_3_in_rule__NodeModel__Group__3__Impl917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeModel__Group__4__Impl_in_rule__NodeModel__Group__4947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeModel__Group_4__0_in_rule__NodeModel__Group__4__Impl974 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__NodeModel__Group_4__0__Impl_in_rule__NodeModel__Group_4__01015 = new BitSet(new long[]{0x000000000041F800L});
    public static final BitSet FOLLOW_rule__NodeModel__Group_4__1_in_rule__NodeModel__Group_4__01018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__NodeModel__Group_4__0__Impl1046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeModel__Group_4__1__Impl_in_rule__NodeModel__Group_4__11077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeModel__PropertyDefinitionsAssignment_4_1_in_rule__NodeModel__Group_4__1__Impl1104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefineProperty__Group__0__Impl_in_rule__DefineProperty__Group__01138 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__DefineProperty__Group__1_in_rule__DefineProperty__Group__01141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefineProperty__PropertyTypeAssignment_0_in_rule__DefineProperty__Group__0__Impl1168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefineProperty__Group__1__Impl_in_rule__DefineProperty__Group__11198 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DefineProperty__Group__2_in_rule__DefineProperty__Group__11201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__DefineProperty__Group__1__Impl1229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefineProperty__Group__2__Impl_in_rule__DefineProperty__Group__21260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefineProperty__NameAssignment_2_in_rule__DefineProperty__Group__2__Impl1287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_0__0__Impl_in_rule__Type__Group_0__01323 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Type__Group_0__1_in_rule__Type__Group_0__01326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_0__1__Impl_in_rule__Type__Group_0__11384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Type__Group_0__1__Impl1412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpec_in_rule__NemoFile__SpecssAssignment1452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__NodeModel__NameAssignment_11483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefineProperty_in_rule__NodeModel__PropertyDefinitionsAssignment_31514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefineProperty_in_rule__NodeModel__PropertyDefinitionsAssignment_4_11545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__DefineProperty__PropertyTypeAssignment_01576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DefineProperty__NameAssignment_21607 = new BitSet(new long[]{0x0000000000000002L});

}