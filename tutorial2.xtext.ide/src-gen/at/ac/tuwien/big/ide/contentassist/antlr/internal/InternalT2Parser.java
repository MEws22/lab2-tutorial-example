package at.ac.tuwien.big.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import at.ac.tuwien.big.services.T2GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalT2Parser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Factory'", "'{'", "'}'", "'overseasitem'", "','", "'itemtype'", "'OverseasItem'", "'overseasmaterial'", "'OverseasMaterial'", "'BasicItemType'", "'ComplexItemType'", "'component'", "'Component'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalT2Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalT2Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalT2Parser.tokenNames; }
    public String getGrammarFileName() { return "InternalT2.g"; }


    	private T2GrammarAccess grammarAccess;

    	public void setGrammarAccess(T2GrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleFactory"
    // InternalT2.g:53:1: entryRuleFactory : ruleFactory EOF ;
    public final void entryRuleFactory() throws RecognitionException {
        try {
            // InternalT2.g:54:1: ( ruleFactory EOF )
            // InternalT2.g:55:1: ruleFactory EOF
            {
             before(grammarAccess.getFactoryRule()); 
            pushFollow(FOLLOW_1);
            ruleFactory();

            state._fsp--;

             after(grammarAccess.getFactoryRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFactory"


    // $ANTLR start "ruleFactory"
    // InternalT2.g:62:1: ruleFactory : ( ( rule__Factory__Group__0 ) ) ;
    public final void ruleFactory() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:66:2: ( ( ( rule__Factory__Group__0 ) ) )
            // InternalT2.g:67:2: ( ( rule__Factory__Group__0 ) )
            {
            // InternalT2.g:67:2: ( ( rule__Factory__Group__0 ) )
            // InternalT2.g:68:3: ( rule__Factory__Group__0 )
            {
             before(grammarAccess.getFactoryAccess().getGroup()); 
            // InternalT2.g:69:3: ( rule__Factory__Group__0 )
            // InternalT2.g:69:4: rule__Factory__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Factory__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFactoryAccess().getGroup()); 

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
    // $ANTLR end "ruleFactory"


    // $ANTLR start "entryRuleItemType"
    // InternalT2.g:78:1: entryRuleItemType : ruleItemType EOF ;
    public final void entryRuleItemType() throws RecognitionException {
        try {
            // InternalT2.g:79:1: ( ruleItemType EOF )
            // InternalT2.g:80:1: ruleItemType EOF
            {
             before(grammarAccess.getItemTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleItemType();

            state._fsp--;

             after(grammarAccess.getItemTypeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleItemType"


    // $ANTLR start "ruleItemType"
    // InternalT2.g:87:1: ruleItemType : ( ( rule__ItemType__Alternatives ) ) ;
    public final void ruleItemType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:91:2: ( ( ( rule__ItemType__Alternatives ) ) )
            // InternalT2.g:92:2: ( ( rule__ItemType__Alternatives ) )
            {
            // InternalT2.g:92:2: ( ( rule__ItemType__Alternatives ) )
            // InternalT2.g:93:3: ( rule__ItemType__Alternatives )
            {
             before(grammarAccess.getItemTypeAccess().getAlternatives()); 
            // InternalT2.g:94:3: ( rule__ItemType__Alternatives )
            // InternalT2.g:94:4: rule__ItemType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ItemType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getItemTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleItemType"


    // $ANTLR start "entryRuleOverseasItem"
    // InternalT2.g:103:1: entryRuleOverseasItem : ruleOverseasItem EOF ;
    public final void entryRuleOverseasItem() throws RecognitionException {
        try {
            // InternalT2.g:104:1: ( ruleOverseasItem EOF )
            // InternalT2.g:105:1: ruleOverseasItem EOF
            {
             before(grammarAccess.getOverseasItemRule()); 
            pushFollow(FOLLOW_1);
            ruleOverseasItem();

            state._fsp--;

             after(grammarAccess.getOverseasItemRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleOverseasItem"


    // $ANTLR start "ruleOverseasItem"
    // InternalT2.g:112:1: ruleOverseasItem : ( ( rule__OverseasItem__Group__0 ) ) ;
    public final void ruleOverseasItem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:116:2: ( ( ( rule__OverseasItem__Group__0 ) ) )
            // InternalT2.g:117:2: ( ( rule__OverseasItem__Group__0 ) )
            {
            // InternalT2.g:117:2: ( ( rule__OverseasItem__Group__0 ) )
            // InternalT2.g:118:3: ( rule__OverseasItem__Group__0 )
            {
             before(grammarAccess.getOverseasItemAccess().getGroup()); 
            // InternalT2.g:119:3: ( rule__OverseasItem__Group__0 )
            // InternalT2.g:119:4: rule__OverseasItem__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OverseasItem__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOverseasItemAccess().getGroup()); 

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
    // $ANTLR end "ruleOverseasItem"


    // $ANTLR start "entryRuleEString"
    // InternalT2.g:128:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalT2.g:129:1: ( ruleEString EOF )
            // InternalT2.g:130:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalT2.g:137:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:141:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalT2.g:142:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalT2.g:142:2: ( ( rule__EString__Alternatives ) )
            // InternalT2.g:143:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalT2.g:144:3: ( rule__EString__Alternatives )
            // InternalT2.g:144:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleOverseasMaterial"
    // InternalT2.g:153:1: entryRuleOverseasMaterial : ruleOverseasMaterial EOF ;
    public final void entryRuleOverseasMaterial() throws RecognitionException {
        try {
            // InternalT2.g:154:1: ( ruleOverseasMaterial EOF )
            // InternalT2.g:155:1: ruleOverseasMaterial EOF
            {
             before(grammarAccess.getOverseasMaterialRule()); 
            pushFollow(FOLLOW_1);
            ruleOverseasMaterial();

            state._fsp--;

             after(grammarAccess.getOverseasMaterialRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleOverseasMaterial"


    // $ANTLR start "ruleOverseasMaterial"
    // InternalT2.g:162:1: ruleOverseasMaterial : ( ( rule__OverseasMaterial__Group__0 ) ) ;
    public final void ruleOverseasMaterial() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:166:2: ( ( ( rule__OverseasMaterial__Group__0 ) ) )
            // InternalT2.g:167:2: ( ( rule__OverseasMaterial__Group__0 ) )
            {
            // InternalT2.g:167:2: ( ( rule__OverseasMaterial__Group__0 ) )
            // InternalT2.g:168:3: ( rule__OverseasMaterial__Group__0 )
            {
             before(grammarAccess.getOverseasMaterialAccess().getGroup()); 
            // InternalT2.g:169:3: ( rule__OverseasMaterial__Group__0 )
            // InternalT2.g:169:4: rule__OverseasMaterial__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OverseasMaterial__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOverseasMaterialAccess().getGroup()); 

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
    // $ANTLR end "ruleOverseasMaterial"


    // $ANTLR start "entryRuleBasicItemType"
    // InternalT2.g:178:1: entryRuleBasicItemType : ruleBasicItemType EOF ;
    public final void entryRuleBasicItemType() throws RecognitionException {
        try {
            // InternalT2.g:179:1: ( ruleBasicItemType EOF )
            // InternalT2.g:180:1: ruleBasicItemType EOF
            {
             before(grammarAccess.getBasicItemTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleBasicItemType();

            state._fsp--;

             after(grammarAccess.getBasicItemTypeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBasicItemType"


    // $ANTLR start "ruleBasicItemType"
    // InternalT2.g:187:1: ruleBasicItemType : ( ( rule__BasicItemType__Group__0 ) ) ;
    public final void ruleBasicItemType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:191:2: ( ( ( rule__BasicItemType__Group__0 ) ) )
            // InternalT2.g:192:2: ( ( rule__BasicItemType__Group__0 ) )
            {
            // InternalT2.g:192:2: ( ( rule__BasicItemType__Group__0 ) )
            // InternalT2.g:193:3: ( rule__BasicItemType__Group__0 )
            {
             before(grammarAccess.getBasicItemTypeAccess().getGroup()); 
            // InternalT2.g:194:3: ( rule__BasicItemType__Group__0 )
            // InternalT2.g:194:4: rule__BasicItemType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BasicItemType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBasicItemTypeAccess().getGroup()); 

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
    // $ANTLR end "ruleBasicItemType"


    // $ANTLR start "entryRuleComplexItemType"
    // InternalT2.g:203:1: entryRuleComplexItemType : ruleComplexItemType EOF ;
    public final void entryRuleComplexItemType() throws RecognitionException {
        try {
            // InternalT2.g:204:1: ( ruleComplexItemType EOF )
            // InternalT2.g:205:1: ruleComplexItemType EOF
            {
             before(grammarAccess.getComplexItemTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleComplexItemType();

            state._fsp--;

             after(grammarAccess.getComplexItemTypeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleComplexItemType"


    // $ANTLR start "ruleComplexItemType"
    // InternalT2.g:212:1: ruleComplexItemType : ( ( rule__ComplexItemType__Group__0 ) ) ;
    public final void ruleComplexItemType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:216:2: ( ( ( rule__ComplexItemType__Group__0 ) ) )
            // InternalT2.g:217:2: ( ( rule__ComplexItemType__Group__0 ) )
            {
            // InternalT2.g:217:2: ( ( rule__ComplexItemType__Group__0 ) )
            // InternalT2.g:218:3: ( rule__ComplexItemType__Group__0 )
            {
             before(grammarAccess.getComplexItemTypeAccess().getGroup()); 
            // InternalT2.g:219:3: ( rule__ComplexItemType__Group__0 )
            // InternalT2.g:219:4: rule__ComplexItemType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ComplexItemType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComplexItemTypeAccess().getGroup()); 

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
    // $ANTLR end "ruleComplexItemType"


    // $ANTLR start "entryRuleComponent"
    // InternalT2.g:228:1: entryRuleComponent : ruleComponent EOF ;
    public final void entryRuleComponent() throws RecognitionException {
        try {
            // InternalT2.g:229:1: ( ruleComponent EOF )
            // InternalT2.g:230:1: ruleComponent EOF
            {
             before(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_1);
            ruleComponent();

            state._fsp--;

             after(grammarAccess.getComponentRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // InternalT2.g:237:1: ruleComponent : ( ( rule__Component__Group__0 ) ) ;
    public final void ruleComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:241:2: ( ( ( rule__Component__Group__0 ) ) )
            // InternalT2.g:242:2: ( ( rule__Component__Group__0 ) )
            {
            // InternalT2.g:242:2: ( ( rule__Component__Group__0 ) )
            // InternalT2.g:243:3: ( rule__Component__Group__0 )
            {
             before(grammarAccess.getComponentAccess().getGroup()); 
            // InternalT2.g:244:3: ( rule__Component__Group__0 )
            // InternalT2.g:244:4: rule__Component__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getGroup()); 

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
    // $ANTLR end "ruleComponent"


    // $ANTLR start "rule__ItemType__Alternatives"
    // InternalT2.g:252:1: rule__ItemType__Alternatives : ( ( ruleBasicItemType ) | ( ruleComplexItemType ) );
    public final void rule__ItemType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:256:1: ( ( ruleBasicItemType ) | ( ruleComplexItemType ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==20) ) {
                alt1=1;
            }
            else if ( (LA1_0==21) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalT2.g:257:2: ( ruleBasicItemType )
                    {
                    // InternalT2.g:257:2: ( ruleBasicItemType )
                    // InternalT2.g:258:3: ruleBasicItemType
                    {
                     before(grammarAccess.getItemTypeAccess().getBasicItemTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleBasicItemType();

                    state._fsp--;

                     after(grammarAccess.getItemTypeAccess().getBasicItemTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalT2.g:263:2: ( ruleComplexItemType )
                    {
                    // InternalT2.g:263:2: ( ruleComplexItemType )
                    // InternalT2.g:264:3: ruleComplexItemType
                    {
                     before(grammarAccess.getItemTypeAccess().getComplexItemTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleComplexItemType();

                    state._fsp--;

                     after(grammarAccess.getItemTypeAccess().getComplexItemTypeParserRuleCall_1()); 

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
    // $ANTLR end "rule__ItemType__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalT2.g:273:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:277:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalT2.g:278:2: ( RULE_STRING )
                    {
                    // InternalT2.g:278:2: ( RULE_STRING )
                    // InternalT2.g:279:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalT2.g:284:2: ( RULE_ID )
                    {
                    // InternalT2.g:284:2: ( RULE_ID )
                    // InternalT2.g:285:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__Factory__Group__0"
    // InternalT2.g:294:1: rule__Factory__Group__0 : rule__Factory__Group__0__Impl rule__Factory__Group__1 ;
    public final void rule__Factory__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:298:1: ( rule__Factory__Group__0__Impl rule__Factory__Group__1 )
            // InternalT2.g:299:2: rule__Factory__Group__0__Impl rule__Factory__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Factory__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Factory__Group__1();

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
    // $ANTLR end "rule__Factory__Group__0"


    // $ANTLR start "rule__Factory__Group__0__Impl"
    // InternalT2.g:306:1: rule__Factory__Group__0__Impl : ( () ) ;
    public final void rule__Factory__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:310:1: ( ( () ) )
            // InternalT2.g:311:1: ( () )
            {
            // InternalT2.g:311:1: ( () )
            // InternalT2.g:312:2: ()
            {
             before(grammarAccess.getFactoryAccess().getFactoryAction_0()); 
            // InternalT2.g:313:2: ()
            // InternalT2.g:313:3: 
            {
            }

             after(grammarAccess.getFactoryAccess().getFactoryAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factory__Group__0__Impl"


    // $ANTLR start "rule__Factory__Group__1"
    // InternalT2.g:321:1: rule__Factory__Group__1 : rule__Factory__Group__1__Impl rule__Factory__Group__2 ;
    public final void rule__Factory__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:325:1: ( rule__Factory__Group__1__Impl rule__Factory__Group__2 )
            // InternalT2.g:326:2: rule__Factory__Group__1__Impl rule__Factory__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Factory__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Factory__Group__2();

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
    // $ANTLR end "rule__Factory__Group__1"


    // $ANTLR start "rule__Factory__Group__1__Impl"
    // InternalT2.g:333:1: rule__Factory__Group__1__Impl : ( 'Factory' ) ;
    public final void rule__Factory__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:337:1: ( ( 'Factory' ) )
            // InternalT2.g:338:1: ( 'Factory' )
            {
            // InternalT2.g:338:1: ( 'Factory' )
            // InternalT2.g:339:2: 'Factory'
            {
             before(grammarAccess.getFactoryAccess().getFactoryKeyword_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getFactoryAccess().getFactoryKeyword_1()); 

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
    // $ANTLR end "rule__Factory__Group__1__Impl"


    // $ANTLR start "rule__Factory__Group__2"
    // InternalT2.g:348:1: rule__Factory__Group__2 : rule__Factory__Group__2__Impl rule__Factory__Group__3 ;
    public final void rule__Factory__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:352:1: ( rule__Factory__Group__2__Impl rule__Factory__Group__3 )
            // InternalT2.g:353:2: rule__Factory__Group__2__Impl rule__Factory__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Factory__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Factory__Group__3();

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
    // $ANTLR end "rule__Factory__Group__2"


    // $ANTLR start "rule__Factory__Group__2__Impl"
    // InternalT2.g:360:1: rule__Factory__Group__2__Impl : ( ( rule__Factory__NameAssignment_2 ) ) ;
    public final void rule__Factory__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:364:1: ( ( ( rule__Factory__NameAssignment_2 ) ) )
            // InternalT2.g:365:1: ( ( rule__Factory__NameAssignment_2 ) )
            {
            // InternalT2.g:365:1: ( ( rule__Factory__NameAssignment_2 ) )
            // InternalT2.g:366:2: ( rule__Factory__NameAssignment_2 )
            {
             before(grammarAccess.getFactoryAccess().getNameAssignment_2()); 
            // InternalT2.g:367:2: ( rule__Factory__NameAssignment_2 )
            // InternalT2.g:367:3: rule__Factory__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Factory__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFactoryAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Factory__Group__2__Impl"


    // $ANTLR start "rule__Factory__Group__3"
    // InternalT2.g:375:1: rule__Factory__Group__3 : rule__Factory__Group__3__Impl rule__Factory__Group__4 ;
    public final void rule__Factory__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:379:1: ( rule__Factory__Group__3__Impl rule__Factory__Group__4 )
            // InternalT2.g:380:2: rule__Factory__Group__3__Impl rule__Factory__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Factory__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Factory__Group__4();

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
    // $ANTLR end "rule__Factory__Group__3"


    // $ANTLR start "rule__Factory__Group__3__Impl"
    // InternalT2.g:387:1: rule__Factory__Group__3__Impl : ( '{' ) ;
    public final void rule__Factory__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:391:1: ( ( '{' ) )
            // InternalT2.g:392:1: ( '{' )
            {
            // InternalT2.g:392:1: ( '{' )
            // InternalT2.g:393:2: '{'
            {
             before(grammarAccess.getFactoryAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getFactoryAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Factory__Group__3__Impl"


    // $ANTLR start "rule__Factory__Group__4"
    // InternalT2.g:402:1: rule__Factory__Group__4 : rule__Factory__Group__4__Impl rule__Factory__Group__5 ;
    public final void rule__Factory__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:406:1: ( rule__Factory__Group__4__Impl rule__Factory__Group__5 )
            // InternalT2.g:407:2: rule__Factory__Group__4__Impl rule__Factory__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Factory__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Factory__Group__5();

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
    // $ANTLR end "rule__Factory__Group__4"


    // $ANTLR start "rule__Factory__Group__4__Impl"
    // InternalT2.g:414:1: rule__Factory__Group__4__Impl : ( ( rule__Factory__Group_4__0 )? ) ;
    public final void rule__Factory__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:418:1: ( ( ( rule__Factory__Group_4__0 )? ) )
            // InternalT2.g:419:1: ( ( rule__Factory__Group_4__0 )? )
            {
            // InternalT2.g:419:1: ( ( rule__Factory__Group_4__0 )? )
            // InternalT2.g:420:2: ( rule__Factory__Group_4__0 )?
            {
             before(grammarAccess.getFactoryAccess().getGroup_4()); 
            // InternalT2.g:421:2: ( rule__Factory__Group_4__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalT2.g:421:3: rule__Factory__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Factory__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFactoryAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Factory__Group__4__Impl"


    // $ANTLR start "rule__Factory__Group__5"
    // InternalT2.g:429:1: rule__Factory__Group__5 : rule__Factory__Group__5__Impl rule__Factory__Group__6 ;
    public final void rule__Factory__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:433:1: ( rule__Factory__Group__5__Impl rule__Factory__Group__6 )
            // InternalT2.g:434:2: rule__Factory__Group__5__Impl rule__Factory__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__Factory__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Factory__Group__6();

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
    // $ANTLR end "rule__Factory__Group__5"


    // $ANTLR start "rule__Factory__Group__5__Impl"
    // InternalT2.g:441:1: rule__Factory__Group__5__Impl : ( ( rule__Factory__Group_5__0 )? ) ;
    public final void rule__Factory__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:445:1: ( ( ( rule__Factory__Group_5__0 )? ) )
            // InternalT2.g:446:1: ( ( rule__Factory__Group_5__0 )? )
            {
            // InternalT2.g:446:1: ( ( rule__Factory__Group_5__0 )? )
            // InternalT2.g:447:2: ( rule__Factory__Group_5__0 )?
            {
             before(grammarAccess.getFactoryAccess().getGroup_5()); 
            // InternalT2.g:448:2: ( rule__Factory__Group_5__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalT2.g:448:3: rule__Factory__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Factory__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFactoryAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Factory__Group__5__Impl"


    // $ANTLR start "rule__Factory__Group__6"
    // InternalT2.g:456:1: rule__Factory__Group__6 : rule__Factory__Group__6__Impl ;
    public final void rule__Factory__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:460:1: ( rule__Factory__Group__6__Impl )
            // InternalT2.g:461:2: rule__Factory__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Factory__Group__6__Impl();

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
    // $ANTLR end "rule__Factory__Group__6"


    // $ANTLR start "rule__Factory__Group__6__Impl"
    // InternalT2.g:467:1: rule__Factory__Group__6__Impl : ( '}' ) ;
    public final void rule__Factory__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:471:1: ( ( '}' ) )
            // InternalT2.g:472:1: ( '}' )
            {
            // InternalT2.g:472:1: ( '}' )
            // InternalT2.g:473:2: '}'
            {
             before(grammarAccess.getFactoryAccess().getRightCurlyBracketKeyword_6()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getFactoryAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__Factory__Group__6__Impl"


    // $ANTLR start "rule__Factory__Group_4__0"
    // InternalT2.g:483:1: rule__Factory__Group_4__0 : rule__Factory__Group_4__0__Impl rule__Factory__Group_4__1 ;
    public final void rule__Factory__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:487:1: ( rule__Factory__Group_4__0__Impl rule__Factory__Group_4__1 )
            // InternalT2.g:488:2: rule__Factory__Group_4__0__Impl rule__Factory__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__Factory__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Factory__Group_4__1();

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
    // $ANTLR end "rule__Factory__Group_4__0"


    // $ANTLR start "rule__Factory__Group_4__0__Impl"
    // InternalT2.g:495:1: rule__Factory__Group_4__0__Impl : ( 'overseasitem' ) ;
    public final void rule__Factory__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:499:1: ( ( 'overseasitem' ) )
            // InternalT2.g:500:1: ( 'overseasitem' )
            {
            // InternalT2.g:500:1: ( 'overseasitem' )
            // InternalT2.g:501:2: 'overseasitem'
            {
             before(grammarAccess.getFactoryAccess().getOverseasitemKeyword_4_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getFactoryAccess().getOverseasitemKeyword_4_0()); 

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
    // $ANTLR end "rule__Factory__Group_4__0__Impl"


    // $ANTLR start "rule__Factory__Group_4__1"
    // InternalT2.g:510:1: rule__Factory__Group_4__1 : rule__Factory__Group_4__1__Impl rule__Factory__Group_4__2 ;
    public final void rule__Factory__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:514:1: ( rule__Factory__Group_4__1__Impl rule__Factory__Group_4__2 )
            // InternalT2.g:515:2: rule__Factory__Group_4__1__Impl rule__Factory__Group_4__2
            {
            pushFollow(FOLLOW_7);
            rule__Factory__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Factory__Group_4__2();

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
    // $ANTLR end "rule__Factory__Group_4__1"


    // $ANTLR start "rule__Factory__Group_4__1__Impl"
    // InternalT2.g:522:1: rule__Factory__Group_4__1__Impl : ( '{' ) ;
    public final void rule__Factory__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:526:1: ( ( '{' ) )
            // InternalT2.g:527:1: ( '{' )
            {
            // InternalT2.g:527:1: ( '{' )
            // InternalT2.g:528:2: '{'
            {
             before(grammarAccess.getFactoryAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getFactoryAccess().getLeftCurlyBracketKeyword_4_1()); 

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
    // $ANTLR end "rule__Factory__Group_4__1__Impl"


    // $ANTLR start "rule__Factory__Group_4__2"
    // InternalT2.g:537:1: rule__Factory__Group_4__2 : rule__Factory__Group_4__2__Impl rule__Factory__Group_4__3 ;
    public final void rule__Factory__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:541:1: ( rule__Factory__Group_4__2__Impl rule__Factory__Group_4__3 )
            // InternalT2.g:542:2: rule__Factory__Group_4__2__Impl rule__Factory__Group_4__3
            {
            pushFollow(FOLLOW_8);
            rule__Factory__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Factory__Group_4__3();

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
    // $ANTLR end "rule__Factory__Group_4__2"


    // $ANTLR start "rule__Factory__Group_4__2__Impl"
    // InternalT2.g:549:1: rule__Factory__Group_4__2__Impl : ( ( rule__Factory__OverseasitemAssignment_4_2 ) ) ;
    public final void rule__Factory__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:553:1: ( ( ( rule__Factory__OverseasitemAssignment_4_2 ) ) )
            // InternalT2.g:554:1: ( ( rule__Factory__OverseasitemAssignment_4_2 ) )
            {
            // InternalT2.g:554:1: ( ( rule__Factory__OverseasitemAssignment_4_2 ) )
            // InternalT2.g:555:2: ( rule__Factory__OverseasitemAssignment_4_2 )
            {
             before(grammarAccess.getFactoryAccess().getOverseasitemAssignment_4_2()); 
            // InternalT2.g:556:2: ( rule__Factory__OverseasitemAssignment_4_2 )
            // InternalT2.g:556:3: rule__Factory__OverseasitemAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Factory__OverseasitemAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getFactoryAccess().getOverseasitemAssignment_4_2()); 

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
    // $ANTLR end "rule__Factory__Group_4__2__Impl"


    // $ANTLR start "rule__Factory__Group_4__3"
    // InternalT2.g:564:1: rule__Factory__Group_4__3 : rule__Factory__Group_4__3__Impl rule__Factory__Group_4__4 ;
    public final void rule__Factory__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:568:1: ( rule__Factory__Group_4__3__Impl rule__Factory__Group_4__4 )
            // InternalT2.g:569:2: rule__Factory__Group_4__3__Impl rule__Factory__Group_4__4
            {
            pushFollow(FOLLOW_8);
            rule__Factory__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Factory__Group_4__4();

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
    // $ANTLR end "rule__Factory__Group_4__3"


    // $ANTLR start "rule__Factory__Group_4__3__Impl"
    // InternalT2.g:576:1: rule__Factory__Group_4__3__Impl : ( ( rule__Factory__Group_4_3__0 )* ) ;
    public final void rule__Factory__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:580:1: ( ( ( rule__Factory__Group_4_3__0 )* ) )
            // InternalT2.g:581:1: ( ( rule__Factory__Group_4_3__0 )* )
            {
            // InternalT2.g:581:1: ( ( rule__Factory__Group_4_3__0 )* )
            // InternalT2.g:582:2: ( rule__Factory__Group_4_3__0 )*
            {
             before(grammarAccess.getFactoryAccess().getGroup_4_3()); 
            // InternalT2.g:583:2: ( rule__Factory__Group_4_3__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==15) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalT2.g:583:3: rule__Factory__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Factory__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getFactoryAccess().getGroup_4_3()); 

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
    // $ANTLR end "rule__Factory__Group_4__3__Impl"


    // $ANTLR start "rule__Factory__Group_4__4"
    // InternalT2.g:591:1: rule__Factory__Group_4__4 : rule__Factory__Group_4__4__Impl ;
    public final void rule__Factory__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:595:1: ( rule__Factory__Group_4__4__Impl )
            // InternalT2.g:596:2: rule__Factory__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Factory__Group_4__4__Impl();

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
    // $ANTLR end "rule__Factory__Group_4__4"


    // $ANTLR start "rule__Factory__Group_4__4__Impl"
    // InternalT2.g:602:1: rule__Factory__Group_4__4__Impl : ( '}' ) ;
    public final void rule__Factory__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:606:1: ( ( '}' ) )
            // InternalT2.g:607:1: ( '}' )
            {
            // InternalT2.g:607:1: ( '}' )
            // InternalT2.g:608:2: '}'
            {
             before(grammarAccess.getFactoryAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getFactoryAccess().getRightCurlyBracketKeyword_4_4()); 

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
    // $ANTLR end "rule__Factory__Group_4__4__Impl"


    // $ANTLR start "rule__Factory__Group_4_3__0"
    // InternalT2.g:618:1: rule__Factory__Group_4_3__0 : rule__Factory__Group_4_3__0__Impl rule__Factory__Group_4_3__1 ;
    public final void rule__Factory__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:622:1: ( rule__Factory__Group_4_3__0__Impl rule__Factory__Group_4_3__1 )
            // InternalT2.g:623:2: rule__Factory__Group_4_3__0__Impl rule__Factory__Group_4_3__1
            {
            pushFollow(FOLLOW_7);
            rule__Factory__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Factory__Group_4_3__1();

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
    // $ANTLR end "rule__Factory__Group_4_3__0"


    // $ANTLR start "rule__Factory__Group_4_3__0__Impl"
    // InternalT2.g:630:1: rule__Factory__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__Factory__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:634:1: ( ( ',' ) )
            // InternalT2.g:635:1: ( ',' )
            {
            // InternalT2.g:635:1: ( ',' )
            // InternalT2.g:636:2: ','
            {
             before(grammarAccess.getFactoryAccess().getCommaKeyword_4_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getFactoryAccess().getCommaKeyword_4_3_0()); 

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
    // $ANTLR end "rule__Factory__Group_4_3__0__Impl"


    // $ANTLR start "rule__Factory__Group_4_3__1"
    // InternalT2.g:645:1: rule__Factory__Group_4_3__1 : rule__Factory__Group_4_3__1__Impl ;
    public final void rule__Factory__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:649:1: ( rule__Factory__Group_4_3__1__Impl )
            // InternalT2.g:650:2: rule__Factory__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Factory__Group_4_3__1__Impl();

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
    // $ANTLR end "rule__Factory__Group_4_3__1"


    // $ANTLR start "rule__Factory__Group_4_3__1__Impl"
    // InternalT2.g:656:1: rule__Factory__Group_4_3__1__Impl : ( ( rule__Factory__OverseasitemAssignment_4_3_1 ) ) ;
    public final void rule__Factory__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:660:1: ( ( ( rule__Factory__OverseasitemAssignment_4_3_1 ) ) )
            // InternalT2.g:661:1: ( ( rule__Factory__OverseasitemAssignment_4_3_1 ) )
            {
            // InternalT2.g:661:1: ( ( rule__Factory__OverseasitemAssignment_4_3_1 ) )
            // InternalT2.g:662:2: ( rule__Factory__OverseasitemAssignment_4_3_1 )
            {
             before(grammarAccess.getFactoryAccess().getOverseasitemAssignment_4_3_1()); 
            // InternalT2.g:663:2: ( rule__Factory__OverseasitemAssignment_4_3_1 )
            // InternalT2.g:663:3: rule__Factory__OverseasitemAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Factory__OverseasitemAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getFactoryAccess().getOverseasitemAssignment_4_3_1()); 

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
    // $ANTLR end "rule__Factory__Group_4_3__1__Impl"


    // $ANTLR start "rule__Factory__Group_5__0"
    // InternalT2.g:672:1: rule__Factory__Group_5__0 : rule__Factory__Group_5__0__Impl rule__Factory__Group_5__1 ;
    public final void rule__Factory__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:676:1: ( rule__Factory__Group_5__0__Impl rule__Factory__Group_5__1 )
            // InternalT2.g:677:2: rule__Factory__Group_5__0__Impl rule__Factory__Group_5__1
            {
            pushFollow(FOLLOW_5);
            rule__Factory__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Factory__Group_5__1();

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
    // $ANTLR end "rule__Factory__Group_5__0"


    // $ANTLR start "rule__Factory__Group_5__0__Impl"
    // InternalT2.g:684:1: rule__Factory__Group_5__0__Impl : ( 'itemtype' ) ;
    public final void rule__Factory__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:688:1: ( ( 'itemtype' ) )
            // InternalT2.g:689:1: ( 'itemtype' )
            {
            // InternalT2.g:689:1: ( 'itemtype' )
            // InternalT2.g:690:2: 'itemtype'
            {
             before(grammarAccess.getFactoryAccess().getItemtypeKeyword_5_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getFactoryAccess().getItemtypeKeyword_5_0()); 

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
    // $ANTLR end "rule__Factory__Group_5__0__Impl"


    // $ANTLR start "rule__Factory__Group_5__1"
    // InternalT2.g:699:1: rule__Factory__Group_5__1 : rule__Factory__Group_5__1__Impl rule__Factory__Group_5__2 ;
    public final void rule__Factory__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:703:1: ( rule__Factory__Group_5__1__Impl rule__Factory__Group_5__2 )
            // InternalT2.g:704:2: rule__Factory__Group_5__1__Impl rule__Factory__Group_5__2
            {
            pushFollow(FOLLOW_10);
            rule__Factory__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Factory__Group_5__2();

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
    // $ANTLR end "rule__Factory__Group_5__1"


    // $ANTLR start "rule__Factory__Group_5__1__Impl"
    // InternalT2.g:711:1: rule__Factory__Group_5__1__Impl : ( '{' ) ;
    public final void rule__Factory__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:715:1: ( ( '{' ) )
            // InternalT2.g:716:1: ( '{' )
            {
            // InternalT2.g:716:1: ( '{' )
            // InternalT2.g:717:2: '{'
            {
             before(grammarAccess.getFactoryAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getFactoryAccess().getLeftCurlyBracketKeyword_5_1()); 

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
    // $ANTLR end "rule__Factory__Group_5__1__Impl"


    // $ANTLR start "rule__Factory__Group_5__2"
    // InternalT2.g:726:1: rule__Factory__Group_5__2 : rule__Factory__Group_5__2__Impl rule__Factory__Group_5__3 ;
    public final void rule__Factory__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:730:1: ( rule__Factory__Group_5__2__Impl rule__Factory__Group_5__3 )
            // InternalT2.g:731:2: rule__Factory__Group_5__2__Impl rule__Factory__Group_5__3
            {
            pushFollow(FOLLOW_8);
            rule__Factory__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Factory__Group_5__3();

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
    // $ANTLR end "rule__Factory__Group_5__2"


    // $ANTLR start "rule__Factory__Group_5__2__Impl"
    // InternalT2.g:738:1: rule__Factory__Group_5__2__Impl : ( ( rule__Factory__ItemtypeAssignment_5_2 ) ) ;
    public final void rule__Factory__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:742:1: ( ( ( rule__Factory__ItemtypeAssignment_5_2 ) ) )
            // InternalT2.g:743:1: ( ( rule__Factory__ItemtypeAssignment_5_2 ) )
            {
            // InternalT2.g:743:1: ( ( rule__Factory__ItemtypeAssignment_5_2 ) )
            // InternalT2.g:744:2: ( rule__Factory__ItemtypeAssignment_5_2 )
            {
             before(grammarAccess.getFactoryAccess().getItemtypeAssignment_5_2()); 
            // InternalT2.g:745:2: ( rule__Factory__ItemtypeAssignment_5_2 )
            // InternalT2.g:745:3: rule__Factory__ItemtypeAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__Factory__ItemtypeAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getFactoryAccess().getItemtypeAssignment_5_2()); 

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
    // $ANTLR end "rule__Factory__Group_5__2__Impl"


    // $ANTLR start "rule__Factory__Group_5__3"
    // InternalT2.g:753:1: rule__Factory__Group_5__3 : rule__Factory__Group_5__3__Impl rule__Factory__Group_5__4 ;
    public final void rule__Factory__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:757:1: ( rule__Factory__Group_5__3__Impl rule__Factory__Group_5__4 )
            // InternalT2.g:758:2: rule__Factory__Group_5__3__Impl rule__Factory__Group_5__4
            {
            pushFollow(FOLLOW_8);
            rule__Factory__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Factory__Group_5__4();

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
    // $ANTLR end "rule__Factory__Group_5__3"


    // $ANTLR start "rule__Factory__Group_5__3__Impl"
    // InternalT2.g:765:1: rule__Factory__Group_5__3__Impl : ( ( rule__Factory__Group_5_3__0 )* ) ;
    public final void rule__Factory__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:769:1: ( ( ( rule__Factory__Group_5_3__0 )* ) )
            // InternalT2.g:770:1: ( ( rule__Factory__Group_5_3__0 )* )
            {
            // InternalT2.g:770:1: ( ( rule__Factory__Group_5_3__0 )* )
            // InternalT2.g:771:2: ( rule__Factory__Group_5_3__0 )*
            {
             before(grammarAccess.getFactoryAccess().getGroup_5_3()); 
            // InternalT2.g:772:2: ( rule__Factory__Group_5_3__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==15) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalT2.g:772:3: rule__Factory__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Factory__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getFactoryAccess().getGroup_5_3()); 

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
    // $ANTLR end "rule__Factory__Group_5__3__Impl"


    // $ANTLR start "rule__Factory__Group_5__4"
    // InternalT2.g:780:1: rule__Factory__Group_5__4 : rule__Factory__Group_5__4__Impl ;
    public final void rule__Factory__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:784:1: ( rule__Factory__Group_5__4__Impl )
            // InternalT2.g:785:2: rule__Factory__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Factory__Group_5__4__Impl();

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
    // $ANTLR end "rule__Factory__Group_5__4"


    // $ANTLR start "rule__Factory__Group_5__4__Impl"
    // InternalT2.g:791:1: rule__Factory__Group_5__4__Impl : ( '}' ) ;
    public final void rule__Factory__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:795:1: ( ( '}' ) )
            // InternalT2.g:796:1: ( '}' )
            {
            // InternalT2.g:796:1: ( '}' )
            // InternalT2.g:797:2: '}'
            {
             before(grammarAccess.getFactoryAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getFactoryAccess().getRightCurlyBracketKeyword_5_4()); 

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
    // $ANTLR end "rule__Factory__Group_5__4__Impl"


    // $ANTLR start "rule__Factory__Group_5_3__0"
    // InternalT2.g:807:1: rule__Factory__Group_5_3__0 : rule__Factory__Group_5_3__0__Impl rule__Factory__Group_5_3__1 ;
    public final void rule__Factory__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:811:1: ( rule__Factory__Group_5_3__0__Impl rule__Factory__Group_5_3__1 )
            // InternalT2.g:812:2: rule__Factory__Group_5_3__0__Impl rule__Factory__Group_5_3__1
            {
            pushFollow(FOLLOW_10);
            rule__Factory__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Factory__Group_5_3__1();

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
    // $ANTLR end "rule__Factory__Group_5_3__0"


    // $ANTLR start "rule__Factory__Group_5_3__0__Impl"
    // InternalT2.g:819:1: rule__Factory__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__Factory__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:823:1: ( ( ',' ) )
            // InternalT2.g:824:1: ( ',' )
            {
            // InternalT2.g:824:1: ( ',' )
            // InternalT2.g:825:2: ','
            {
             before(grammarAccess.getFactoryAccess().getCommaKeyword_5_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getFactoryAccess().getCommaKeyword_5_3_0()); 

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
    // $ANTLR end "rule__Factory__Group_5_3__0__Impl"


    // $ANTLR start "rule__Factory__Group_5_3__1"
    // InternalT2.g:834:1: rule__Factory__Group_5_3__1 : rule__Factory__Group_5_3__1__Impl ;
    public final void rule__Factory__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:838:1: ( rule__Factory__Group_5_3__1__Impl )
            // InternalT2.g:839:2: rule__Factory__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Factory__Group_5_3__1__Impl();

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
    // $ANTLR end "rule__Factory__Group_5_3__1"


    // $ANTLR start "rule__Factory__Group_5_3__1__Impl"
    // InternalT2.g:845:1: rule__Factory__Group_5_3__1__Impl : ( ( rule__Factory__ItemtypeAssignment_5_3_1 ) ) ;
    public final void rule__Factory__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:849:1: ( ( ( rule__Factory__ItemtypeAssignment_5_3_1 ) ) )
            // InternalT2.g:850:1: ( ( rule__Factory__ItemtypeAssignment_5_3_1 ) )
            {
            // InternalT2.g:850:1: ( ( rule__Factory__ItemtypeAssignment_5_3_1 ) )
            // InternalT2.g:851:2: ( rule__Factory__ItemtypeAssignment_5_3_1 )
            {
             before(grammarAccess.getFactoryAccess().getItemtypeAssignment_5_3_1()); 
            // InternalT2.g:852:2: ( rule__Factory__ItemtypeAssignment_5_3_1 )
            // InternalT2.g:852:3: rule__Factory__ItemtypeAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Factory__ItemtypeAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getFactoryAccess().getItemtypeAssignment_5_3_1()); 

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
    // $ANTLR end "rule__Factory__Group_5_3__1__Impl"


    // $ANTLR start "rule__OverseasItem__Group__0"
    // InternalT2.g:861:1: rule__OverseasItem__Group__0 : rule__OverseasItem__Group__0__Impl rule__OverseasItem__Group__1 ;
    public final void rule__OverseasItem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:865:1: ( rule__OverseasItem__Group__0__Impl rule__OverseasItem__Group__1 )
            // InternalT2.g:866:2: rule__OverseasItem__Group__0__Impl rule__OverseasItem__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__OverseasItem__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OverseasItem__Group__1();

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
    // $ANTLR end "rule__OverseasItem__Group__0"


    // $ANTLR start "rule__OverseasItem__Group__0__Impl"
    // InternalT2.g:873:1: rule__OverseasItem__Group__0__Impl : ( () ) ;
    public final void rule__OverseasItem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:877:1: ( ( () ) )
            // InternalT2.g:878:1: ( () )
            {
            // InternalT2.g:878:1: ( () )
            // InternalT2.g:879:2: ()
            {
             before(grammarAccess.getOverseasItemAccess().getOverseasItemAction_0()); 
            // InternalT2.g:880:2: ()
            // InternalT2.g:880:3: 
            {
            }

             after(grammarAccess.getOverseasItemAccess().getOverseasItemAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OverseasItem__Group__0__Impl"


    // $ANTLR start "rule__OverseasItem__Group__1"
    // InternalT2.g:888:1: rule__OverseasItem__Group__1 : rule__OverseasItem__Group__1__Impl rule__OverseasItem__Group__2 ;
    public final void rule__OverseasItem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:892:1: ( rule__OverseasItem__Group__1__Impl rule__OverseasItem__Group__2 )
            // InternalT2.g:893:2: rule__OverseasItem__Group__1__Impl rule__OverseasItem__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__OverseasItem__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OverseasItem__Group__2();

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
    // $ANTLR end "rule__OverseasItem__Group__1"


    // $ANTLR start "rule__OverseasItem__Group__1__Impl"
    // InternalT2.g:900:1: rule__OverseasItem__Group__1__Impl : ( 'OverseasItem' ) ;
    public final void rule__OverseasItem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:904:1: ( ( 'OverseasItem' ) )
            // InternalT2.g:905:1: ( 'OverseasItem' )
            {
            // InternalT2.g:905:1: ( 'OverseasItem' )
            // InternalT2.g:906:2: 'OverseasItem'
            {
             before(grammarAccess.getOverseasItemAccess().getOverseasItemKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getOverseasItemAccess().getOverseasItemKeyword_1()); 

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
    // $ANTLR end "rule__OverseasItem__Group__1__Impl"


    // $ANTLR start "rule__OverseasItem__Group__2"
    // InternalT2.g:915:1: rule__OverseasItem__Group__2 : rule__OverseasItem__Group__2__Impl rule__OverseasItem__Group__3 ;
    public final void rule__OverseasItem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:919:1: ( rule__OverseasItem__Group__2__Impl rule__OverseasItem__Group__3 )
            // InternalT2.g:920:2: rule__OverseasItem__Group__2__Impl rule__OverseasItem__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__OverseasItem__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OverseasItem__Group__3();

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
    // $ANTLR end "rule__OverseasItem__Group__2"


    // $ANTLR start "rule__OverseasItem__Group__2__Impl"
    // InternalT2.g:927:1: rule__OverseasItem__Group__2__Impl : ( ( rule__OverseasItem__NameAssignment_2 ) ) ;
    public final void rule__OverseasItem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:931:1: ( ( ( rule__OverseasItem__NameAssignment_2 ) ) )
            // InternalT2.g:932:1: ( ( rule__OverseasItem__NameAssignment_2 ) )
            {
            // InternalT2.g:932:1: ( ( rule__OverseasItem__NameAssignment_2 ) )
            // InternalT2.g:933:2: ( rule__OverseasItem__NameAssignment_2 )
            {
             before(grammarAccess.getOverseasItemAccess().getNameAssignment_2()); 
            // InternalT2.g:934:2: ( rule__OverseasItem__NameAssignment_2 )
            // InternalT2.g:934:3: rule__OverseasItem__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__OverseasItem__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getOverseasItemAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__OverseasItem__Group__2__Impl"


    // $ANTLR start "rule__OverseasItem__Group__3"
    // InternalT2.g:942:1: rule__OverseasItem__Group__3 : rule__OverseasItem__Group__3__Impl rule__OverseasItem__Group__4 ;
    public final void rule__OverseasItem__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:946:1: ( rule__OverseasItem__Group__3__Impl rule__OverseasItem__Group__4 )
            // InternalT2.g:947:2: rule__OverseasItem__Group__3__Impl rule__OverseasItem__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__OverseasItem__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OverseasItem__Group__4();

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
    // $ANTLR end "rule__OverseasItem__Group__3"


    // $ANTLR start "rule__OverseasItem__Group__3__Impl"
    // InternalT2.g:954:1: rule__OverseasItem__Group__3__Impl : ( '{' ) ;
    public final void rule__OverseasItem__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:958:1: ( ( '{' ) )
            // InternalT2.g:959:1: ( '{' )
            {
            // InternalT2.g:959:1: ( '{' )
            // InternalT2.g:960:2: '{'
            {
             before(grammarAccess.getOverseasItemAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getOverseasItemAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__OverseasItem__Group__3__Impl"


    // $ANTLR start "rule__OverseasItem__Group__4"
    // InternalT2.g:969:1: rule__OverseasItem__Group__4 : rule__OverseasItem__Group__4__Impl rule__OverseasItem__Group__5 ;
    public final void rule__OverseasItem__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:973:1: ( rule__OverseasItem__Group__4__Impl rule__OverseasItem__Group__5 )
            // InternalT2.g:974:2: rule__OverseasItem__Group__4__Impl rule__OverseasItem__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__OverseasItem__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OverseasItem__Group__5();

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
    // $ANTLR end "rule__OverseasItem__Group__4"


    // $ANTLR start "rule__OverseasItem__Group__4__Impl"
    // InternalT2.g:981:1: rule__OverseasItem__Group__4__Impl : ( ( rule__OverseasItem__Group_4__0 )? ) ;
    public final void rule__OverseasItem__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:985:1: ( ( ( rule__OverseasItem__Group_4__0 )? ) )
            // InternalT2.g:986:1: ( ( rule__OverseasItem__Group_4__0 )? )
            {
            // InternalT2.g:986:1: ( ( rule__OverseasItem__Group_4__0 )? )
            // InternalT2.g:987:2: ( rule__OverseasItem__Group_4__0 )?
            {
             before(grammarAccess.getOverseasItemAccess().getGroup_4()); 
            // InternalT2.g:988:2: ( rule__OverseasItem__Group_4__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalT2.g:988:3: rule__OverseasItem__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__OverseasItem__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOverseasItemAccess().getGroup_4()); 

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
    // $ANTLR end "rule__OverseasItem__Group__4__Impl"


    // $ANTLR start "rule__OverseasItem__Group__5"
    // InternalT2.g:996:1: rule__OverseasItem__Group__5 : rule__OverseasItem__Group__5__Impl ;
    public final void rule__OverseasItem__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:1000:1: ( rule__OverseasItem__Group__5__Impl )
            // InternalT2.g:1001:2: rule__OverseasItem__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OverseasItem__Group__5__Impl();

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
    // $ANTLR end "rule__OverseasItem__Group__5"


    // $ANTLR start "rule__OverseasItem__Group__5__Impl"
    // InternalT2.g:1007:1: rule__OverseasItem__Group__5__Impl : ( '}' ) ;
    public final void rule__OverseasItem__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:1011:1: ( ( '}' ) )
            // InternalT2.g:1012:1: ( '}' )
            {
            // InternalT2.g:1012:1: ( '}' )
            // InternalT2.g:1013:2: '}'
            {
             before(grammarAccess.getOverseasItemAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getOverseasItemAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__OverseasItem__Group__5__Impl"


    // $ANTLR start "rule__OverseasItem__Group_4__0"
    // InternalT2.g:1023:1: rule__OverseasItem__Group_4__0 : rule__OverseasItem__Group_4__0__Impl rule__OverseasItem__Group_4__1 ;
    public final void rule__OverseasItem__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:1027:1: ( rule__OverseasItem__Group_4__0__Impl rule__OverseasItem__Group_4__1 )
            // InternalT2.g:1028:2: rule__OverseasItem__Group_4__0__Impl rule__OverseasItem__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__OverseasItem__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OverseasItem__Group_4__1();

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
    // $ANTLR end "rule__OverseasItem__Group_4__0"


    // $ANTLR start "rule__OverseasItem__Group_4__0__Impl"
    // InternalT2.g:1035:1: rule__OverseasItem__Group_4__0__Impl : ( 'overseasmaterial' ) ;
    public final void rule__OverseasItem__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:1039:1: ( ( 'overseasmaterial' ) )
            // InternalT2.g:1040:1: ( 'overseasmaterial' )
            {
            // InternalT2.g:1040:1: ( 'overseasmaterial' )
            // InternalT2.g:1041:2: 'overseasmaterial'
            {
             before(grammarAccess.getOverseasItemAccess().getOverseasmaterialKeyword_4_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getOverseasItemAccess().getOverseasmaterialKeyword_4_0()); 

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
    // $ANTLR end "rule__OverseasItem__Group_4__0__Impl"


    // $ANTLR start "rule__OverseasItem__Group_4__1"
    // InternalT2.g:1050:1: rule__OverseasItem__Group_4__1 : rule__OverseasItem__Group_4__1__Impl rule__OverseasItem__Group_4__2 ;
    public final void rule__OverseasItem__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:1054:1: ( rule__OverseasItem__Group_4__1__Impl rule__OverseasItem__Group_4__2 )
            // InternalT2.g:1055:2: rule__OverseasItem__Group_4__1__Impl rule__OverseasItem__Group_4__2
            {
            pushFollow(FOLLOW_12);
            rule__OverseasItem__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OverseasItem__Group_4__2();

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
    // $ANTLR end "rule__OverseasItem__Group_4__1"


    // $ANTLR start "rule__OverseasItem__Group_4__1__Impl"
    // InternalT2.g:1062:1: rule__OverseasItem__Group_4__1__Impl : ( '{' ) ;
    public final void rule__OverseasItem__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:1066:1: ( ( '{' ) )
            // InternalT2.g:1067:1: ( '{' )
            {
            // InternalT2.g:1067:1: ( '{' )
            // InternalT2.g:1068:2: '{'
            {
             before(grammarAccess.getOverseasItemAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getOverseasItemAccess().getLeftCurlyBracketKeyword_4_1()); 

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
    // $ANTLR end "rule__OverseasItem__Group_4__1__Impl"


    // $ANTLR start "rule__OverseasItem__Group_4__2"
    // InternalT2.g:1077:1: rule__OverseasItem__Group_4__2 : rule__OverseasItem__Group_4__2__Impl rule__OverseasItem__Group_4__3 ;
    public final void rule__OverseasItem__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:1081:1: ( rule__OverseasItem__Group_4__2__Impl rule__OverseasItem__Group_4__3 )
            // InternalT2.g:1082:2: rule__OverseasItem__Group_4__2__Impl rule__OverseasItem__Group_4__3
            {
            pushFollow(FOLLOW_8);
            rule__OverseasItem__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OverseasItem__Group_4__3();

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
    // $ANTLR end "rule__OverseasItem__Group_4__2"


    // $ANTLR start "rule__OverseasItem__Group_4__2__Impl"
    // InternalT2.g:1089:1: rule__OverseasItem__Group_4__2__Impl : ( ( rule__OverseasItem__OverseasmaterialAssignment_4_2 ) ) ;
    public final void rule__OverseasItem__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:1093:1: ( ( ( rule__OverseasItem__OverseasmaterialAssignment_4_2 ) ) )
            // InternalT2.g:1094:1: ( ( rule__OverseasItem__OverseasmaterialAssignment_4_2 ) )
            {
            // InternalT2.g:1094:1: ( ( rule__OverseasItem__OverseasmaterialAssignment_4_2 ) )
            // InternalT2.g:1095:2: ( rule__OverseasItem__OverseasmaterialAssignment_4_2 )
            {
             before(grammarAccess.getOverseasItemAccess().getOverseasmaterialAssignment_4_2()); 
            // InternalT2.g:1096:2: ( rule__OverseasItem__OverseasmaterialAssignment_4_2 )
            // InternalT2.g:1096:3: rule__OverseasItem__OverseasmaterialAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__OverseasItem__OverseasmaterialAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getOverseasItemAccess().getOverseasmaterialAssignment_4_2()); 

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
    // $ANTLR end "rule__OverseasItem__Group_4__2__Impl"


    // $ANTLR start "rule__OverseasItem__Group_4__3"
    // InternalT2.g:1104:1: rule__OverseasItem__Group_4__3 : rule__OverseasItem__Group_4__3__Impl rule__OverseasItem__Group_4__4 ;
    public final void rule__OverseasItem__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:1108:1: ( rule__OverseasItem__Group_4__3__Impl rule__OverseasItem__Group_4__4 )
            // InternalT2.g:1109:2: rule__OverseasItem__Group_4__3__Impl rule__OverseasItem__Group_4__4
            {
            pushFollow(FOLLOW_8);
            rule__OverseasItem__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OverseasItem__Group_4__4();

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
    // $ANTLR end "rule__OverseasItem__Group_4__3"


    // $ANTLR start "rule__OverseasItem__Group_4__3__Impl"
    // InternalT2.g:1116:1: rule__OverseasItem__Group_4__3__Impl : ( ( rule__OverseasItem__Group_4_3__0 )* ) ;
    public final void rule__OverseasItem__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:1120:1: ( ( ( rule__OverseasItem__Group_4_3__0 )* ) )
            // InternalT2.g:1121:1: ( ( rule__OverseasItem__Group_4_3__0 )* )
            {
            // InternalT2.g:1121:1: ( ( rule__OverseasItem__Group_4_3__0 )* )
            // InternalT2.g:1122:2: ( rule__OverseasItem__Group_4_3__0 )*
            {
             before(grammarAccess.getOverseasItemAccess().getGroup_4_3()); 
            // InternalT2.g:1123:2: ( rule__OverseasItem__Group_4_3__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==15) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalT2.g:1123:3: rule__OverseasItem__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__OverseasItem__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getOverseasItemAccess().getGroup_4_3()); 

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
    // $ANTLR end "rule__OverseasItem__Group_4__3__Impl"


    // $ANTLR start "rule__OverseasItem__Group_4__4"
    // InternalT2.g:1131:1: rule__OverseasItem__Group_4__4 : rule__OverseasItem__Group_4__4__Impl ;
    public final void rule__OverseasItem__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:1135:1: ( rule__OverseasItem__Group_4__4__Impl )
            // InternalT2.g:1136:2: rule__OverseasItem__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OverseasItem__Group_4__4__Impl();

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
    // $ANTLR end "rule__OverseasItem__Group_4__4"


    // $ANTLR start "rule__OverseasItem__Group_4__4__Impl"
    // InternalT2.g:1142:1: rule__OverseasItem__Group_4__4__Impl : ( '}' ) ;
    public final void rule__OverseasItem__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:1146:1: ( ( '}' ) )
            // InternalT2.g:1147:1: ( '}' )
            {
            // InternalT2.g:1147:1: ( '}' )
            // InternalT2.g:1148:2: '}'
            {
             before(grammarAccess.getOverseasItemAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getOverseasItemAccess().getRightCurlyBracketKeyword_4_4()); 

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
    // $ANTLR end "rule__OverseasItem__Group_4__4__Impl"


    // $ANTLR start "rule__OverseasItem__Group_4_3__0"
    // InternalT2.g:1158:1: rule__OverseasItem__Group_4_3__0 : rule__OverseasItem__Group_4_3__0__Impl rule__OverseasItem__Group_4_3__1 ;
    public final void rule__OverseasItem__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:1162:1: ( rule__OverseasItem__Group_4_3__0__Impl rule__OverseasItem__Group_4_3__1 )
            // InternalT2.g:1163:2: rule__OverseasItem__Group_4_3__0__Impl rule__OverseasItem__Group_4_3__1
            {
            pushFollow(FOLLOW_12);
            rule__OverseasItem__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OverseasItem__Group_4_3__1();

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
    // $ANTLR end "rule__OverseasItem__Group_4_3__0"


    // $ANTLR start "rule__OverseasItem__Group_4_3__0__Impl"
    // InternalT2.g:1170:1: rule__OverseasItem__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__OverseasItem__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:1174:1: ( ( ',' ) )
            // InternalT2.g:1175:1: ( ',' )
            {
            // InternalT2.g:1175:1: ( ',' )
            // InternalT2.g:1176:2: ','
            {
             before(grammarAccess.getOverseasItemAccess().getCommaKeyword_4_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getOverseasItemAccess().getCommaKeyword_4_3_0()); 

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
    // $ANTLR end "rule__OverseasItem__Group_4_3__0__Impl"


    // $ANTLR start "rule__OverseasItem__Group_4_3__1"
    // InternalT2.g:1185:1: rule__OverseasItem__Group_4_3__1 : rule__OverseasItem__Group_4_3__1__Impl ;
    public final void rule__OverseasItem__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:1189:1: ( rule__OverseasItem__Group_4_3__1__Impl )
            // InternalT2.g:1190:2: rule__OverseasItem__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OverseasItem__Group_4_3__1__Impl();

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
    // $ANTLR end "rule__OverseasItem__Group_4_3__1"


    // $ANTLR start "rule__OverseasItem__Group_4_3__1__Impl"
    // InternalT2.g:1196:1: rule__OverseasItem__Group_4_3__1__Impl : ( ( rule__OverseasItem__OverseasmaterialAssignment_4_3_1 ) ) ;
    public final void rule__OverseasItem__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:1200:1: ( ( ( rule__OverseasItem__OverseasmaterialAssignment_4_3_1 ) ) )
            // InternalT2.g:1201:1: ( ( rule__OverseasItem__OverseasmaterialAssignment_4_3_1 ) )
            {
            // InternalT2.g:1201:1: ( ( rule__OverseasItem__OverseasmaterialAssignment_4_3_1 ) )
            // InternalT2.g:1202:2: ( rule__OverseasItem__OverseasmaterialAssignment_4_3_1 )
            {
             before(grammarAccess.getOverseasItemAccess().getOverseasmaterialAssignment_4_3_1()); 
            // InternalT2.g:1203:2: ( rule__OverseasItem__OverseasmaterialAssignment_4_3_1 )
            // InternalT2.g:1203:3: rule__OverseasItem__OverseasmaterialAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__OverseasItem__OverseasmaterialAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getOverseasItemAccess().getOverseasmaterialAssignment_4_3_1()); 

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
    // $ANTLR end "rule__OverseasItem__Group_4_3__1__Impl"


    // $ANTLR start "rule__OverseasMaterial__Group__0"
    // InternalT2.g:1212:1: rule__OverseasMaterial__Group__0 : rule__OverseasMaterial__Group__0__Impl rule__OverseasMaterial__Group__1 ;
    public final void rule__OverseasMaterial__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:1216:1: ( rule__OverseasMaterial__Group__0__Impl rule__OverseasMaterial__Group__1 )
            // InternalT2.g:1217:2: rule__OverseasMaterial__Group__0__Impl rule__OverseasMaterial__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__OverseasMaterial__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OverseasMaterial__Group__1();

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
    // $ANTLR end "rule__OverseasMaterial__Group__0"


    // $ANTLR start "rule__OverseasMaterial__Group__0__Impl"
    // InternalT2.g:1224:1: rule__OverseasMaterial__Group__0__Impl : ( () ) ;
    public final void rule__OverseasMaterial__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:1228:1: ( ( () ) )
            // InternalT2.g:1229:1: ( () )
            {
            // InternalT2.g:1229:1: ( () )
            // InternalT2.g:1230:2: ()
            {
             before(grammarAccess.getOverseasMaterialAccess().getOverseasMaterialAction_0()); 
            // InternalT2.g:1231:2: ()
            // InternalT2.g:1231:3: 
            {
            }

             after(grammarAccess.getOverseasMaterialAccess().getOverseasMaterialAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OverseasMaterial__Group__0__Impl"


    // $ANTLR start "rule__OverseasMaterial__Group__1"
    // InternalT2.g:1239:1: rule__OverseasMaterial__Group__1 : rule__OverseasMaterial__Group__1__Impl rule__OverseasMaterial__Group__2 ;
    public final void rule__OverseasMaterial__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:1243:1: ( rule__OverseasMaterial__Group__1__Impl rule__OverseasMaterial__Group__2 )
            // InternalT2.g:1244:2: rule__OverseasMaterial__Group__1__Impl rule__OverseasMaterial__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__OverseasMaterial__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OverseasMaterial__Group__2();

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
    // $ANTLR end "rule__OverseasMaterial__Group__1"


    // $ANTLR start "rule__OverseasMaterial__Group__1__Impl"
    // InternalT2.g:1251:1: rule__OverseasMaterial__Group__1__Impl : ( 'OverseasMaterial' ) ;
    public final void rule__OverseasMaterial__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:1255:1: ( ( 'OverseasMaterial' ) )
            // InternalT2.g:1256:1: ( 'OverseasMaterial' )
            {
            // InternalT2.g:1256:1: ( 'OverseasMaterial' )
            // InternalT2.g:1257:2: 'OverseasMaterial'
            {
             before(grammarAccess.getOverseasMaterialAccess().getOverseasMaterialKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getOverseasMaterialAccess().getOverseasMaterialKeyword_1()); 

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
    // $ANTLR end "rule__OverseasMaterial__Group__1__Impl"


    // $ANTLR start "rule__OverseasMaterial__Group__2"
    // InternalT2.g:1266:1: rule__OverseasMaterial__Group__2 : rule__OverseasMaterial__Group__2__Impl ;
    public final void rule__OverseasMaterial__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:1270:1: ( rule__OverseasMaterial__Group__2__Impl )
            // InternalT2.g:1271:2: rule__OverseasMaterial__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OverseasMaterial__Group__2__Impl();

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
    // $ANTLR end "rule__OverseasMaterial__Group__2"


    // $ANTLR start "rule__OverseasMaterial__Group__2__Impl"
    // InternalT2.g:1277:1: rule__OverseasMaterial__Group__2__Impl : ( ( rule__OverseasMaterial__NameAssignment_2 ) ) ;
    public final void rule__OverseasMaterial__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:1281:1: ( ( ( rule__OverseasMaterial__NameAssignment_2 ) ) )
            // InternalT2.g:1282:1: ( ( rule__OverseasMaterial__NameAssignment_2 ) )
            {
            // InternalT2.g:1282:1: ( ( rule__OverseasMaterial__NameAssignment_2 ) )
            // InternalT2.g:1283:2: ( rule__OverseasMaterial__NameAssignment_2 )
            {
             before(grammarAccess.getOverseasMaterialAccess().getNameAssignment_2()); 
            // InternalT2.g:1284:2: ( rule__OverseasMaterial__NameAssignment_2 )
            // InternalT2.g:1284:3: rule__OverseasMaterial__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__OverseasMaterial__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getOverseasMaterialAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__OverseasMaterial__Group__2__Impl"


    // $ANTLR start "rule__BasicItemType__Group__0"
    // InternalT2.g:1293:1: rule__BasicItemType__Group__0 : rule__BasicItemType__Group__0__Impl rule__BasicItemType__Group__1 ;
    public final void rule__BasicItemType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:1297:1: ( rule__BasicItemType__Group__0__Impl rule__BasicItemType__Group__1 )
            // InternalT2.g:1298:2: rule__BasicItemType__Group__0__Impl rule__BasicItemType__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__BasicItemType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BasicItemType__Group__1();

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
    // $ANTLR end "rule__BasicItemType__Group__0"


    // $ANTLR start "rule__BasicItemType__Group__0__Impl"
    // InternalT2.g:1305:1: rule__BasicItemType__Group__0__Impl : ( () ) ;
    public final void rule__BasicItemType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:1309:1: ( ( () ) )
            // InternalT2.g:1310:1: ( () )
            {
            // InternalT2.g:1310:1: ( () )
            // InternalT2.g:1311:2: ()
            {
             before(grammarAccess.getBasicItemTypeAccess().getBasicItemTypeAction_0()); 
            // InternalT2.g:1312:2: ()
            // InternalT2.g:1312:3: 
            {
            }

             after(grammarAccess.getBasicItemTypeAccess().getBasicItemTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicItemType__Group__0__Impl"


    // $ANTLR start "rule__BasicItemType__Group__1"
    // InternalT2.g:1320:1: rule__BasicItemType__Group__1 : rule__BasicItemType__Group__1__Impl rule__BasicItemType__Group__2 ;
    public final void rule__BasicItemType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:1324:1: ( rule__BasicItemType__Group__1__Impl rule__BasicItemType__Group__2 )
            // InternalT2.g:1325:2: rule__BasicItemType__Group__1__Impl rule__BasicItemType__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__BasicItemType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BasicItemType__Group__2();

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
    // $ANTLR end "rule__BasicItemType__Group__1"


    // $ANTLR start "rule__BasicItemType__Group__1__Impl"
    // InternalT2.g:1332:1: rule__BasicItemType__Group__1__Impl : ( 'BasicItemType' ) ;
    public final void rule__BasicItemType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:1336:1: ( ( 'BasicItemType' ) )
            // InternalT2.g:1337:1: ( 'BasicItemType' )
            {
            // InternalT2.g:1337:1: ( 'BasicItemType' )
            // InternalT2.g:1338:2: 'BasicItemType'
            {
             before(grammarAccess.getBasicItemTypeAccess().getBasicItemTypeKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getBasicItemTypeAccess().getBasicItemTypeKeyword_1()); 

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
    // $ANTLR end "rule__BasicItemType__Group__1__Impl"


    // $ANTLR start "rule__BasicItemType__Group__2"
    // InternalT2.g:1347:1: rule__BasicItemType__Group__2 : rule__BasicItemType__Group__2__Impl ;
    public final void rule__BasicItemType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:1351:1: ( rule__BasicItemType__Group__2__Impl )
            // InternalT2.g:1352:2: rule__BasicItemType__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BasicItemType__Group__2__Impl();

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
    // $ANTLR end "rule__BasicItemType__Group__2"


    // $ANTLR start "rule__BasicItemType__Group__2__Impl"
    // InternalT2.g:1358:1: rule__BasicItemType__Group__2__Impl : ( ( rule__BasicItemType__NameAssignment_2 ) ) ;
    public final void rule__BasicItemType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:1362:1: ( ( ( rule__BasicItemType__NameAssignment_2 ) ) )
            // InternalT2.g:1363:1: ( ( rule__BasicItemType__NameAssignment_2 ) )
            {
            // InternalT2.g:1363:1: ( ( rule__BasicItemType__NameAssignment_2 ) )
            // InternalT2.g:1364:2: ( rule__BasicItemType__NameAssignment_2 )
            {
             before(grammarAccess.getBasicItemTypeAccess().getNameAssignment_2()); 
            // InternalT2.g:1365:2: ( rule__BasicItemType__NameAssignment_2 )
            // InternalT2.g:1365:3: rule__BasicItemType__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__BasicItemType__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBasicItemTypeAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__BasicItemType__Group__2__Impl"


    // $ANTLR start "rule__ComplexItemType__Group__0"
    // InternalT2.g:1374:1: rule__ComplexItemType__Group__0 : rule__ComplexItemType__Group__0__Impl rule__ComplexItemType__Group__1 ;
    public final void rule__ComplexItemType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:1378:1: ( rule__ComplexItemType__Group__0__Impl rule__ComplexItemType__Group__1 )
            // InternalT2.g:1379:2: rule__ComplexItemType__Group__0__Impl rule__ComplexItemType__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__ComplexItemType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexItemType__Group__1();

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
    // $ANTLR end "rule__ComplexItemType__Group__0"


    // $ANTLR start "rule__ComplexItemType__Group__0__Impl"
    // InternalT2.g:1386:1: rule__ComplexItemType__Group__0__Impl : ( () ) ;
    public final void rule__ComplexItemType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:1390:1: ( ( () ) )
            // InternalT2.g:1391:1: ( () )
            {
            // InternalT2.g:1391:1: ( () )
            // InternalT2.g:1392:2: ()
            {
             before(grammarAccess.getComplexItemTypeAccess().getComplexItemTypeAction_0()); 
            // InternalT2.g:1393:2: ()
            // InternalT2.g:1393:3: 
            {
            }

             after(grammarAccess.getComplexItemTypeAccess().getComplexItemTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexItemType__Group__0__Impl"


    // $ANTLR start "rule__ComplexItemType__Group__1"
    // InternalT2.g:1401:1: rule__ComplexItemType__Group__1 : rule__ComplexItemType__Group__1__Impl rule__ComplexItemType__Group__2 ;
    public final void rule__ComplexItemType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:1405:1: ( rule__ComplexItemType__Group__1__Impl rule__ComplexItemType__Group__2 )
            // InternalT2.g:1406:2: rule__ComplexItemType__Group__1__Impl rule__ComplexItemType__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ComplexItemType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexItemType__Group__2();

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
    // $ANTLR end "rule__ComplexItemType__Group__1"


    // $ANTLR start "rule__ComplexItemType__Group__1__Impl"
    // InternalT2.g:1413:1: rule__ComplexItemType__Group__1__Impl : ( 'ComplexItemType' ) ;
    public final void rule__ComplexItemType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:1417:1: ( ( 'ComplexItemType' ) )
            // InternalT2.g:1418:1: ( 'ComplexItemType' )
            {
            // InternalT2.g:1418:1: ( 'ComplexItemType' )
            // InternalT2.g:1419:2: 'ComplexItemType'
            {
             before(grammarAccess.getComplexItemTypeAccess().getComplexItemTypeKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getComplexItemTypeAccess().getComplexItemTypeKeyword_1()); 

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
    // $ANTLR end "rule__ComplexItemType__Group__1__Impl"


    // $ANTLR start "rule__ComplexItemType__Group__2"
    // InternalT2.g:1428:1: rule__ComplexItemType__Group__2 : rule__ComplexItemType__Group__2__Impl rule__ComplexItemType__Group__3 ;
    public final void rule__ComplexItemType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:1432:1: ( rule__ComplexItemType__Group__2__Impl rule__ComplexItemType__Group__3 )
            // InternalT2.g:1433:2: rule__ComplexItemType__Group__2__Impl rule__ComplexItemType__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__ComplexItemType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexItemType__Group__3();

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
    // $ANTLR end "rule__ComplexItemType__Group__2"


    // $ANTLR start "rule__ComplexItemType__Group__2__Impl"
    // InternalT2.g:1440:1: rule__ComplexItemType__Group__2__Impl : ( ( rule__ComplexItemType__NameAssignment_2 ) ) ;
    public final void rule__ComplexItemType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:1444:1: ( ( ( rule__ComplexItemType__NameAssignment_2 ) ) )
            // InternalT2.g:1445:1: ( ( rule__ComplexItemType__NameAssignment_2 ) )
            {
            // InternalT2.g:1445:1: ( ( rule__ComplexItemType__NameAssignment_2 ) )
            // InternalT2.g:1446:2: ( rule__ComplexItemType__NameAssignment_2 )
            {
             before(grammarAccess.getComplexItemTypeAccess().getNameAssignment_2()); 
            // InternalT2.g:1447:2: ( rule__ComplexItemType__NameAssignment_2 )
            // InternalT2.g:1447:3: rule__ComplexItemType__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ComplexItemType__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getComplexItemTypeAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__ComplexItemType__Group__2__Impl"


    // $ANTLR start "rule__ComplexItemType__Group__3"
    // InternalT2.g:1455:1: rule__ComplexItemType__Group__3 : rule__ComplexItemType__Group__3__Impl rule__ComplexItemType__Group__4 ;
    public final void rule__ComplexItemType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:1459:1: ( rule__ComplexItemType__Group__3__Impl rule__ComplexItemType__Group__4 )
            // InternalT2.g:1460:2: rule__ComplexItemType__Group__3__Impl rule__ComplexItemType__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__ComplexItemType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexItemType__Group__4();

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
    // $ANTLR end "rule__ComplexItemType__Group__3"


    // $ANTLR start "rule__ComplexItemType__Group__3__Impl"
    // InternalT2.g:1467:1: rule__ComplexItemType__Group__3__Impl : ( '{' ) ;
    public final void rule__ComplexItemType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:1471:1: ( ( '{' ) )
            // InternalT2.g:1472:1: ( '{' )
            {
            // InternalT2.g:1472:1: ( '{' )
            // InternalT2.g:1473:2: '{'
            {
             before(grammarAccess.getComplexItemTypeAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getComplexItemTypeAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__ComplexItemType__Group__3__Impl"


    // $ANTLR start "rule__ComplexItemType__Group__4"
    // InternalT2.g:1482:1: rule__ComplexItemType__Group__4 : rule__ComplexItemType__Group__4__Impl rule__ComplexItemType__Group__5 ;
    public final void rule__ComplexItemType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:1486:1: ( rule__ComplexItemType__Group__4__Impl rule__ComplexItemType__Group__5 )
            // InternalT2.g:1487:2: rule__ComplexItemType__Group__4__Impl rule__ComplexItemType__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__ComplexItemType__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexItemType__Group__5();

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
    // $ANTLR end "rule__ComplexItemType__Group__4"


    // $ANTLR start "rule__ComplexItemType__Group__4__Impl"
    // InternalT2.g:1494:1: rule__ComplexItemType__Group__4__Impl : ( ( rule__ComplexItemType__Group_4__0 )? ) ;
    public final void rule__ComplexItemType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:1498:1: ( ( ( rule__ComplexItemType__Group_4__0 )? ) )
            // InternalT2.g:1499:1: ( ( rule__ComplexItemType__Group_4__0 )? )
            {
            // InternalT2.g:1499:1: ( ( rule__ComplexItemType__Group_4__0 )? )
            // InternalT2.g:1500:2: ( rule__ComplexItemType__Group_4__0 )?
            {
             before(grammarAccess.getComplexItemTypeAccess().getGroup_4()); 
            // InternalT2.g:1501:2: ( rule__ComplexItemType__Group_4__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==14) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalT2.g:1501:3: rule__ComplexItemType__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComplexItemType__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComplexItemTypeAccess().getGroup_4()); 

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
    // $ANTLR end "rule__ComplexItemType__Group__4__Impl"


    // $ANTLR start "rule__ComplexItemType__Group__5"
    // InternalT2.g:1509:1: rule__ComplexItemType__Group__5 : rule__ComplexItemType__Group__5__Impl rule__ComplexItemType__Group__6 ;
    public final void rule__ComplexItemType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:1513:1: ( rule__ComplexItemType__Group__5__Impl rule__ComplexItemType__Group__6 )
            // InternalT2.g:1514:2: rule__ComplexItemType__Group__5__Impl rule__ComplexItemType__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__ComplexItemType__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexItemType__Group__6();

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
    // $ANTLR end "rule__ComplexItemType__Group__5"


    // $ANTLR start "rule__ComplexItemType__Group__5__Impl"
    // InternalT2.g:1521:1: rule__ComplexItemType__Group__5__Impl : ( ( rule__ComplexItemType__Group_5__0 )? ) ;
    public final void rule__ComplexItemType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:1525:1: ( ( ( rule__ComplexItemType__Group_5__0 )? ) )
            // InternalT2.g:1526:1: ( ( rule__ComplexItemType__Group_5__0 )? )
            {
            // InternalT2.g:1526:1: ( ( rule__ComplexItemType__Group_5__0 )? )
            // InternalT2.g:1527:2: ( rule__ComplexItemType__Group_5__0 )?
            {
             before(grammarAccess.getComplexItemTypeAccess().getGroup_5()); 
            // InternalT2.g:1528:2: ( rule__ComplexItemType__Group_5__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==18) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalT2.g:1528:3: rule__ComplexItemType__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComplexItemType__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComplexItemTypeAccess().getGroup_5()); 

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
    // $ANTLR end "rule__ComplexItemType__Group__5__Impl"


    // $ANTLR start "rule__ComplexItemType__Group__6"
    // InternalT2.g:1536:1: rule__ComplexItemType__Group__6 : rule__ComplexItemType__Group__6__Impl rule__ComplexItemType__Group__7 ;
    public final void rule__ComplexItemType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:1540:1: ( rule__ComplexItemType__Group__6__Impl rule__ComplexItemType__Group__7 )
            // InternalT2.g:1541:2: rule__ComplexItemType__Group__6__Impl rule__ComplexItemType__Group__7
            {
            pushFollow(FOLLOW_14);
            rule__ComplexItemType__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexItemType__Group__7();

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
    // $ANTLR end "rule__ComplexItemType__Group__6"


    // $ANTLR start "rule__ComplexItemType__Group__6__Impl"
    // InternalT2.g:1548:1: rule__ComplexItemType__Group__6__Impl : ( ( rule__ComplexItemType__Group_6__0 )? ) ;
    public final void rule__ComplexItemType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:1552:1: ( ( ( rule__ComplexItemType__Group_6__0 )? ) )
            // InternalT2.g:1553:1: ( ( rule__ComplexItemType__Group_6__0 )? )
            {
            // InternalT2.g:1553:1: ( ( rule__ComplexItemType__Group_6__0 )? )
            // InternalT2.g:1554:2: ( rule__ComplexItemType__Group_6__0 )?
            {
             before(grammarAccess.getComplexItemTypeAccess().getGroup_6()); 
            // InternalT2.g:1555:2: ( rule__ComplexItemType__Group_6__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==22) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalT2.g:1555:3: rule__ComplexItemType__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComplexItemType__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComplexItemTypeAccess().getGroup_6()); 

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
    // $ANTLR end "rule__ComplexItemType__Group__6__Impl"


    // $ANTLR start "rule__ComplexItemType__Group__7"
    // InternalT2.g:1563:1: rule__ComplexItemType__Group__7 : rule__ComplexItemType__Group__7__Impl ;
    public final void rule__ComplexItemType__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:1567:1: ( rule__ComplexItemType__Group__7__Impl )
            // InternalT2.g:1568:2: rule__ComplexItemType__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComplexItemType__Group__7__Impl();

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
    // $ANTLR end "rule__ComplexItemType__Group__7"


    // $ANTLR start "rule__ComplexItemType__Group__7__Impl"
    // InternalT2.g:1574:1: rule__ComplexItemType__Group__7__Impl : ( '}' ) ;
    public final void rule__ComplexItemType__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:1578:1: ( ( '}' ) )
            // InternalT2.g:1579:1: ( '}' )
            {
            // InternalT2.g:1579:1: ( '}' )
            // InternalT2.g:1580:2: '}'
            {
             before(grammarAccess.getComplexItemTypeAccess().getRightCurlyBracketKeyword_7()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getComplexItemTypeAccess().getRightCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__ComplexItemType__Group__7__Impl"


    // $ANTLR start "rule__ComplexItemType__Group_4__0"
    // InternalT2.g:1590:1: rule__ComplexItemType__Group_4__0 : rule__ComplexItemType__Group_4__0__Impl rule__ComplexItemType__Group_4__1 ;
    public final void rule__ComplexItemType__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:1594:1: ( rule__ComplexItemType__Group_4__0__Impl rule__ComplexItemType__Group_4__1 )
            // InternalT2.g:1595:2: rule__ComplexItemType__Group_4__0__Impl rule__ComplexItemType__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__ComplexItemType__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexItemType__Group_4__1();

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
    // $ANTLR end "rule__ComplexItemType__Group_4__0"


    // $ANTLR start "rule__ComplexItemType__Group_4__0__Impl"
    // InternalT2.g:1602:1: rule__ComplexItemType__Group_4__0__Impl : ( 'overseasitem' ) ;
    public final void rule__ComplexItemType__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:1606:1: ( ( 'overseasitem' ) )
            // InternalT2.g:1607:1: ( 'overseasitem' )
            {
            // InternalT2.g:1607:1: ( 'overseasitem' )
            // InternalT2.g:1608:2: 'overseasitem'
            {
             before(grammarAccess.getComplexItemTypeAccess().getOverseasitemKeyword_4_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getComplexItemTypeAccess().getOverseasitemKeyword_4_0()); 

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
    // $ANTLR end "rule__ComplexItemType__Group_4__0__Impl"


    // $ANTLR start "rule__ComplexItemType__Group_4__1"
    // InternalT2.g:1617:1: rule__ComplexItemType__Group_4__1 : rule__ComplexItemType__Group_4__1__Impl ;
    public final void rule__ComplexItemType__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:1621:1: ( rule__ComplexItemType__Group_4__1__Impl )
            // InternalT2.g:1622:2: rule__ComplexItemType__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComplexItemType__Group_4__1__Impl();

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
    // $ANTLR end "rule__ComplexItemType__Group_4__1"


    // $ANTLR start "rule__ComplexItemType__Group_4__1__Impl"
    // InternalT2.g:1628:1: rule__ComplexItemType__Group_4__1__Impl : ( ( rule__ComplexItemType__OverseasitemAssignment_4_1 ) ) ;
    public final void rule__ComplexItemType__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:1632:1: ( ( ( rule__ComplexItemType__OverseasitemAssignment_4_1 ) ) )
            // InternalT2.g:1633:1: ( ( rule__ComplexItemType__OverseasitemAssignment_4_1 ) )
            {
            // InternalT2.g:1633:1: ( ( rule__ComplexItemType__OverseasitemAssignment_4_1 ) )
            // InternalT2.g:1634:2: ( rule__ComplexItemType__OverseasitemAssignment_4_1 )
            {
             before(grammarAccess.getComplexItemTypeAccess().getOverseasitemAssignment_4_1()); 
            // InternalT2.g:1635:2: ( rule__ComplexItemType__OverseasitemAssignment_4_1 )
            // InternalT2.g:1635:3: rule__ComplexItemType__OverseasitemAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__ComplexItemType__OverseasitemAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getComplexItemTypeAccess().getOverseasitemAssignment_4_1()); 

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
    // $ANTLR end "rule__ComplexItemType__Group_4__1__Impl"


    // $ANTLR start "rule__ComplexItemType__Group_5__0"
    // InternalT2.g:1644:1: rule__ComplexItemType__Group_5__0 : rule__ComplexItemType__Group_5__0__Impl rule__ComplexItemType__Group_5__1 ;
    public final void rule__ComplexItemType__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:1648:1: ( rule__ComplexItemType__Group_5__0__Impl rule__ComplexItemType__Group_5__1 )
            // InternalT2.g:1649:2: rule__ComplexItemType__Group_5__0__Impl rule__ComplexItemType__Group_5__1
            {
            pushFollow(FOLLOW_4);
            rule__ComplexItemType__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexItemType__Group_5__1();

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
    // $ANTLR end "rule__ComplexItemType__Group_5__0"


    // $ANTLR start "rule__ComplexItemType__Group_5__0__Impl"
    // InternalT2.g:1656:1: rule__ComplexItemType__Group_5__0__Impl : ( 'overseasmaterial' ) ;
    public final void rule__ComplexItemType__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:1660:1: ( ( 'overseasmaterial' ) )
            // InternalT2.g:1661:1: ( 'overseasmaterial' )
            {
            // InternalT2.g:1661:1: ( 'overseasmaterial' )
            // InternalT2.g:1662:2: 'overseasmaterial'
            {
             before(grammarAccess.getComplexItemTypeAccess().getOverseasmaterialKeyword_5_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getComplexItemTypeAccess().getOverseasmaterialKeyword_5_0()); 

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
    // $ANTLR end "rule__ComplexItemType__Group_5__0__Impl"


    // $ANTLR start "rule__ComplexItemType__Group_5__1"
    // InternalT2.g:1671:1: rule__ComplexItemType__Group_5__1 : rule__ComplexItemType__Group_5__1__Impl ;
    public final void rule__ComplexItemType__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:1675:1: ( rule__ComplexItemType__Group_5__1__Impl )
            // InternalT2.g:1676:2: rule__ComplexItemType__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComplexItemType__Group_5__1__Impl();

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
    // $ANTLR end "rule__ComplexItemType__Group_5__1"


    // $ANTLR start "rule__ComplexItemType__Group_5__1__Impl"
    // InternalT2.g:1682:1: rule__ComplexItemType__Group_5__1__Impl : ( ( rule__ComplexItemType__OverseasmaterialAssignment_5_1 ) ) ;
    public final void rule__ComplexItemType__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:1686:1: ( ( ( rule__ComplexItemType__OverseasmaterialAssignment_5_1 ) ) )
            // InternalT2.g:1687:1: ( ( rule__ComplexItemType__OverseasmaterialAssignment_5_1 ) )
            {
            // InternalT2.g:1687:1: ( ( rule__ComplexItemType__OverseasmaterialAssignment_5_1 ) )
            // InternalT2.g:1688:2: ( rule__ComplexItemType__OverseasmaterialAssignment_5_1 )
            {
             before(grammarAccess.getComplexItemTypeAccess().getOverseasmaterialAssignment_5_1()); 
            // InternalT2.g:1689:2: ( rule__ComplexItemType__OverseasmaterialAssignment_5_1 )
            // InternalT2.g:1689:3: rule__ComplexItemType__OverseasmaterialAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__ComplexItemType__OverseasmaterialAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getComplexItemTypeAccess().getOverseasmaterialAssignment_5_1()); 

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
    // $ANTLR end "rule__ComplexItemType__Group_5__1__Impl"


    // $ANTLR start "rule__ComplexItemType__Group_6__0"
    // InternalT2.g:1698:1: rule__ComplexItemType__Group_6__0 : rule__ComplexItemType__Group_6__0__Impl rule__ComplexItemType__Group_6__1 ;
    public final void rule__ComplexItemType__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:1702:1: ( rule__ComplexItemType__Group_6__0__Impl rule__ComplexItemType__Group_6__1 )
            // InternalT2.g:1703:2: rule__ComplexItemType__Group_6__0__Impl rule__ComplexItemType__Group_6__1
            {
            pushFollow(FOLLOW_5);
            rule__ComplexItemType__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexItemType__Group_6__1();

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
    // $ANTLR end "rule__ComplexItemType__Group_6__0"


    // $ANTLR start "rule__ComplexItemType__Group_6__0__Impl"
    // InternalT2.g:1710:1: rule__ComplexItemType__Group_6__0__Impl : ( 'component' ) ;
    public final void rule__ComplexItemType__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:1714:1: ( ( 'component' ) )
            // InternalT2.g:1715:1: ( 'component' )
            {
            // InternalT2.g:1715:1: ( 'component' )
            // InternalT2.g:1716:2: 'component'
            {
             before(grammarAccess.getComplexItemTypeAccess().getComponentKeyword_6_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getComplexItemTypeAccess().getComponentKeyword_6_0()); 

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
    // $ANTLR end "rule__ComplexItemType__Group_6__0__Impl"


    // $ANTLR start "rule__ComplexItemType__Group_6__1"
    // InternalT2.g:1725:1: rule__ComplexItemType__Group_6__1 : rule__ComplexItemType__Group_6__1__Impl rule__ComplexItemType__Group_6__2 ;
    public final void rule__ComplexItemType__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:1729:1: ( rule__ComplexItemType__Group_6__1__Impl rule__ComplexItemType__Group_6__2 )
            // InternalT2.g:1730:2: rule__ComplexItemType__Group_6__1__Impl rule__ComplexItemType__Group_6__2
            {
            pushFollow(FOLLOW_15);
            rule__ComplexItemType__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexItemType__Group_6__2();

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
    // $ANTLR end "rule__ComplexItemType__Group_6__1"


    // $ANTLR start "rule__ComplexItemType__Group_6__1__Impl"
    // InternalT2.g:1737:1: rule__ComplexItemType__Group_6__1__Impl : ( '{' ) ;
    public final void rule__ComplexItemType__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:1741:1: ( ( '{' ) )
            // InternalT2.g:1742:1: ( '{' )
            {
            // InternalT2.g:1742:1: ( '{' )
            // InternalT2.g:1743:2: '{'
            {
             before(grammarAccess.getComplexItemTypeAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getComplexItemTypeAccess().getLeftCurlyBracketKeyword_6_1()); 

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
    // $ANTLR end "rule__ComplexItemType__Group_6__1__Impl"


    // $ANTLR start "rule__ComplexItemType__Group_6__2"
    // InternalT2.g:1752:1: rule__ComplexItemType__Group_6__2 : rule__ComplexItemType__Group_6__2__Impl rule__ComplexItemType__Group_6__3 ;
    public final void rule__ComplexItemType__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:1756:1: ( rule__ComplexItemType__Group_6__2__Impl rule__ComplexItemType__Group_6__3 )
            // InternalT2.g:1757:2: rule__ComplexItemType__Group_6__2__Impl rule__ComplexItemType__Group_6__3
            {
            pushFollow(FOLLOW_8);
            rule__ComplexItemType__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexItemType__Group_6__3();

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
    // $ANTLR end "rule__ComplexItemType__Group_6__2"


    // $ANTLR start "rule__ComplexItemType__Group_6__2__Impl"
    // InternalT2.g:1764:1: rule__ComplexItemType__Group_6__2__Impl : ( ( rule__ComplexItemType__ComponentAssignment_6_2 ) ) ;
    public final void rule__ComplexItemType__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:1768:1: ( ( ( rule__ComplexItemType__ComponentAssignment_6_2 ) ) )
            // InternalT2.g:1769:1: ( ( rule__ComplexItemType__ComponentAssignment_6_2 ) )
            {
            // InternalT2.g:1769:1: ( ( rule__ComplexItemType__ComponentAssignment_6_2 ) )
            // InternalT2.g:1770:2: ( rule__ComplexItemType__ComponentAssignment_6_2 )
            {
             before(grammarAccess.getComplexItemTypeAccess().getComponentAssignment_6_2()); 
            // InternalT2.g:1771:2: ( rule__ComplexItemType__ComponentAssignment_6_2 )
            // InternalT2.g:1771:3: rule__ComplexItemType__ComponentAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__ComplexItemType__ComponentAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getComplexItemTypeAccess().getComponentAssignment_6_2()); 

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
    // $ANTLR end "rule__ComplexItemType__Group_6__2__Impl"


    // $ANTLR start "rule__ComplexItemType__Group_6__3"
    // InternalT2.g:1779:1: rule__ComplexItemType__Group_6__3 : rule__ComplexItemType__Group_6__3__Impl rule__ComplexItemType__Group_6__4 ;
    public final void rule__ComplexItemType__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:1783:1: ( rule__ComplexItemType__Group_6__3__Impl rule__ComplexItemType__Group_6__4 )
            // InternalT2.g:1784:2: rule__ComplexItemType__Group_6__3__Impl rule__ComplexItemType__Group_6__4
            {
            pushFollow(FOLLOW_8);
            rule__ComplexItemType__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexItemType__Group_6__4();

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
    // $ANTLR end "rule__ComplexItemType__Group_6__3"


    // $ANTLR start "rule__ComplexItemType__Group_6__3__Impl"
    // InternalT2.g:1791:1: rule__ComplexItemType__Group_6__3__Impl : ( ( rule__ComplexItemType__Group_6_3__0 )* ) ;
    public final void rule__ComplexItemType__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:1795:1: ( ( ( rule__ComplexItemType__Group_6_3__0 )* ) )
            // InternalT2.g:1796:1: ( ( rule__ComplexItemType__Group_6_3__0 )* )
            {
            // InternalT2.g:1796:1: ( ( rule__ComplexItemType__Group_6_3__0 )* )
            // InternalT2.g:1797:2: ( rule__ComplexItemType__Group_6_3__0 )*
            {
             before(grammarAccess.getComplexItemTypeAccess().getGroup_6_3()); 
            // InternalT2.g:1798:2: ( rule__ComplexItemType__Group_6_3__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==15) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalT2.g:1798:3: rule__ComplexItemType__Group_6_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__ComplexItemType__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getComplexItemTypeAccess().getGroup_6_3()); 

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
    // $ANTLR end "rule__ComplexItemType__Group_6__3__Impl"


    // $ANTLR start "rule__ComplexItemType__Group_6__4"
    // InternalT2.g:1806:1: rule__ComplexItemType__Group_6__4 : rule__ComplexItemType__Group_6__4__Impl ;
    public final void rule__ComplexItemType__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:1810:1: ( rule__ComplexItemType__Group_6__4__Impl )
            // InternalT2.g:1811:2: rule__ComplexItemType__Group_6__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComplexItemType__Group_6__4__Impl();

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
    // $ANTLR end "rule__ComplexItemType__Group_6__4"


    // $ANTLR start "rule__ComplexItemType__Group_6__4__Impl"
    // InternalT2.g:1817:1: rule__ComplexItemType__Group_6__4__Impl : ( '}' ) ;
    public final void rule__ComplexItemType__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:1821:1: ( ( '}' ) )
            // InternalT2.g:1822:1: ( '}' )
            {
            // InternalT2.g:1822:1: ( '}' )
            // InternalT2.g:1823:2: '}'
            {
             before(grammarAccess.getComplexItemTypeAccess().getRightCurlyBracketKeyword_6_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getComplexItemTypeAccess().getRightCurlyBracketKeyword_6_4()); 

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
    // $ANTLR end "rule__ComplexItemType__Group_6__4__Impl"


    // $ANTLR start "rule__ComplexItemType__Group_6_3__0"
    // InternalT2.g:1833:1: rule__ComplexItemType__Group_6_3__0 : rule__ComplexItemType__Group_6_3__0__Impl rule__ComplexItemType__Group_6_3__1 ;
    public final void rule__ComplexItemType__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:1837:1: ( rule__ComplexItemType__Group_6_3__0__Impl rule__ComplexItemType__Group_6_3__1 )
            // InternalT2.g:1838:2: rule__ComplexItemType__Group_6_3__0__Impl rule__ComplexItemType__Group_6_3__1
            {
            pushFollow(FOLLOW_15);
            rule__ComplexItemType__Group_6_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexItemType__Group_6_3__1();

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
    // $ANTLR end "rule__ComplexItemType__Group_6_3__0"


    // $ANTLR start "rule__ComplexItemType__Group_6_3__0__Impl"
    // InternalT2.g:1845:1: rule__ComplexItemType__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__ComplexItemType__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:1849:1: ( ( ',' ) )
            // InternalT2.g:1850:1: ( ',' )
            {
            // InternalT2.g:1850:1: ( ',' )
            // InternalT2.g:1851:2: ','
            {
             before(grammarAccess.getComplexItemTypeAccess().getCommaKeyword_6_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getComplexItemTypeAccess().getCommaKeyword_6_3_0()); 

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
    // $ANTLR end "rule__ComplexItemType__Group_6_3__0__Impl"


    // $ANTLR start "rule__ComplexItemType__Group_6_3__1"
    // InternalT2.g:1860:1: rule__ComplexItemType__Group_6_3__1 : rule__ComplexItemType__Group_6_3__1__Impl ;
    public final void rule__ComplexItemType__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:1864:1: ( rule__ComplexItemType__Group_6_3__1__Impl )
            // InternalT2.g:1865:2: rule__ComplexItemType__Group_6_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComplexItemType__Group_6_3__1__Impl();

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
    // $ANTLR end "rule__ComplexItemType__Group_6_3__1"


    // $ANTLR start "rule__ComplexItemType__Group_6_3__1__Impl"
    // InternalT2.g:1871:1: rule__ComplexItemType__Group_6_3__1__Impl : ( ( rule__ComplexItemType__ComponentAssignment_6_3_1 ) ) ;
    public final void rule__ComplexItemType__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:1875:1: ( ( ( rule__ComplexItemType__ComponentAssignment_6_3_1 ) ) )
            // InternalT2.g:1876:1: ( ( rule__ComplexItemType__ComponentAssignment_6_3_1 ) )
            {
            // InternalT2.g:1876:1: ( ( rule__ComplexItemType__ComponentAssignment_6_3_1 ) )
            // InternalT2.g:1877:2: ( rule__ComplexItemType__ComponentAssignment_6_3_1 )
            {
             before(grammarAccess.getComplexItemTypeAccess().getComponentAssignment_6_3_1()); 
            // InternalT2.g:1878:2: ( rule__ComplexItemType__ComponentAssignment_6_3_1 )
            // InternalT2.g:1878:3: rule__ComplexItemType__ComponentAssignment_6_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ComplexItemType__ComponentAssignment_6_3_1();

            state._fsp--;


            }

             after(grammarAccess.getComplexItemTypeAccess().getComponentAssignment_6_3_1()); 

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
    // $ANTLR end "rule__ComplexItemType__Group_6_3__1__Impl"


    // $ANTLR start "rule__Component__Group__0"
    // InternalT2.g:1887:1: rule__Component__Group__0 : rule__Component__Group__0__Impl rule__Component__Group__1 ;
    public final void rule__Component__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:1891:1: ( rule__Component__Group__0__Impl rule__Component__Group__1 )
            // InternalT2.g:1892:2: rule__Component__Group__0__Impl rule__Component__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Component__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__1();

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
    // $ANTLR end "rule__Component__Group__0"


    // $ANTLR start "rule__Component__Group__0__Impl"
    // InternalT2.g:1899:1: rule__Component__Group__0__Impl : ( () ) ;
    public final void rule__Component__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:1903:1: ( ( () ) )
            // InternalT2.g:1904:1: ( () )
            {
            // InternalT2.g:1904:1: ( () )
            // InternalT2.g:1905:2: ()
            {
             before(grammarAccess.getComponentAccess().getComponentAction_0()); 
            // InternalT2.g:1906:2: ()
            // InternalT2.g:1906:3: 
            {
            }

             after(grammarAccess.getComponentAccess().getComponentAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__0__Impl"


    // $ANTLR start "rule__Component__Group__1"
    // InternalT2.g:1914:1: rule__Component__Group__1 : rule__Component__Group__1__Impl rule__Component__Group__2 ;
    public final void rule__Component__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:1918:1: ( rule__Component__Group__1__Impl rule__Component__Group__2 )
            // InternalT2.g:1919:2: rule__Component__Group__1__Impl rule__Component__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Component__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__2();

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
    // $ANTLR end "rule__Component__Group__1"


    // $ANTLR start "rule__Component__Group__1__Impl"
    // InternalT2.g:1926:1: rule__Component__Group__1__Impl : ( 'Component' ) ;
    public final void rule__Component__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:1930:1: ( ( 'Component' ) )
            // InternalT2.g:1931:1: ( 'Component' )
            {
            // InternalT2.g:1931:1: ( 'Component' )
            // InternalT2.g:1932:2: 'Component'
            {
             before(grammarAccess.getComponentAccess().getComponentKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getComponentKeyword_1()); 

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
    // $ANTLR end "rule__Component__Group__1__Impl"


    // $ANTLR start "rule__Component__Group__2"
    // InternalT2.g:1941:1: rule__Component__Group__2 : rule__Component__Group__2__Impl rule__Component__Group__3 ;
    public final void rule__Component__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:1945:1: ( rule__Component__Group__2__Impl rule__Component__Group__3 )
            // InternalT2.g:1946:2: rule__Component__Group__2__Impl rule__Component__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__Component__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__3();

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
    // $ANTLR end "rule__Component__Group__2"


    // $ANTLR start "rule__Component__Group__2__Impl"
    // InternalT2.g:1953:1: rule__Component__Group__2__Impl : ( '{' ) ;
    public final void rule__Component__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:1957:1: ( ( '{' ) )
            // InternalT2.g:1958:1: ( '{' )
            {
            // InternalT2.g:1958:1: ( '{' )
            // InternalT2.g:1959:2: '{'
            {
             before(grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Component__Group__2__Impl"


    // $ANTLR start "rule__Component__Group__3"
    // InternalT2.g:1968:1: rule__Component__Group__3 : rule__Component__Group__3__Impl rule__Component__Group__4 ;
    public final void rule__Component__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:1972:1: ( rule__Component__Group__3__Impl rule__Component__Group__4 )
            // InternalT2.g:1973:2: rule__Component__Group__3__Impl rule__Component__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__Component__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__4();

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
    // $ANTLR end "rule__Component__Group__3"


    // $ANTLR start "rule__Component__Group__3__Impl"
    // InternalT2.g:1980:1: rule__Component__Group__3__Impl : ( ( rule__Component__Group_3__0 )? ) ;
    public final void rule__Component__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:1984:1: ( ( ( rule__Component__Group_3__0 )? ) )
            // InternalT2.g:1985:1: ( ( rule__Component__Group_3__0 )? )
            {
            // InternalT2.g:1985:1: ( ( rule__Component__Group_3__0 )? )
            // InternalT2.g:1986:2: ( rule__Component__Group_3__0 )?
            {
             before(grammarAccess.getComponentAccess().getGroup_3()); 
            // InternalT2.g:1987:2: ( rule__Component__Group_3__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==16) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalT2.g:1987:3: rule__Component__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Component__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComponentAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Component__Group__3__Impl"


    // $ANTLR start "rule__Component__Group__4"
    // InternalT2.g:1995:1: rule__Component__Group__4 : rule__Component__Group__4__Impl rule__Component__Group__5 ;
    public final void rule__Component__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:1999:1: ( rule__Component__Group__4__Impl rule__Component__Group__5 )
            // InternalT2.g:2000:2: rule__Component__Group__4__Impl rule__Component__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__Component__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__5();

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
    // $ANTLR end "rule__Component__Group__4"


    // $ANTLR start "rule__Component__Group__4__Impl"
    // InternalT2.g:2007:1: rule__Component__Group__4__Impl : ( ( rule__Component__Group_4__0 )? ) ;
    public final void rule__Component__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:2011:1: ( ( ( rule__Component__Group_4__0 )? ) )
            // InternalT2.g:2012:1: ( ( rule__Component__Group_4__0 )? )
            {
            // InternalT2.g:2012:1: ( ( rule__Component__Group_4__0 )? )
            // InternalT2.g:2013:2: ( rule__Component__Group_4__0 )?
            {
             before(grammarAccess.getComponentAccess().getGroup_4()); 
            // InternalT2.g:2014:2: ( rule__Component__Group_4__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==14) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalT2.g:2014:3: rule__Component__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Component__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComponentAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Component__Group__4__Impl"


    // $ANTLR start "rule__Component__Group__5"
    // InternalT2.g:2022:1: rule__Component__Group__5 : rule__Component__Group__5__Impl rule__Component__Group__6 ;
    public final void rule__Component__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:2026:1: ( rule__Component__Group__5__Impl rule__Component__Group__6 )
            // InternalT2.g:2027:2: rule__Component__Group__5__Impl rule__Component__Group__6
            {
            pushFollow(FOLLOW_16);
            rule__Component__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__6();

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
    // $ANTLR end "rule__Component__Group__5"


    // $ANTLR start "rule__Component__Group__5__Impl"
    // InternalT2.g:2034:1: rule__Component__Group__5__Impl : ( ( rule__Component__Group_5__0 )? ) ;
    public final void rule__Component__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:2038:1: ( ( ( rule__Component__Group_5__0 )? ) )
            // InternalT2.g:2039:1: ( ( rule__Component__Group_5__0 )? )
            {
            // InternalT2.g:2039:1: ( ( rule__Component__Group_5__0 )? )
            // InternalT2.g:2040:2: ( rule__Component__Group_5__0 )?
            {
             before(grammarAccess.getComponentAccess().getGroup_5()); 
            // InternalT2.g:2041:2: ( rule__Component__Group_5__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==18) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalT2.g:2041:3: rule__Component__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Component__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComponentAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Component__Group__5__Impl"


    // $ANTLR start "rule__Component__Group__6"
    // InternalT2.g:2049:1: rule__Component__Group__6 : rule__Component__Group__6__Impl ;
    public final void rule__Component__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:2053:1: ( rule__Component__Group__6__Impl )
            // InternalT2.g:2054:2: rule__Component__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group__6__Impl();

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
    // $ANTLR end "rule__Component__Group__6"


    // $ANTLR start "rule__Component__Group__6__Impl"
    // InternalT2.g:2060:1: rule__Component__Group__6__Impl : ( '}' ) ;
    public final void rule__Component__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:2064:1: ( ( '}' ) )
            // InternalT2.g:2065:1: ( '}' )
            {
            // InternalT2.g:2065:1: ( '}' )
            // InternalT2.g:2066:2: '}'
            {
             before(grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_6()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__Component__Group__6__Impl"


    // $ANTLR start "rule__Component__Group_3__0"
    // InternalT2.g:2076:1: rule__Component__Group_3__0 : rule__Component__Group_3__0__Impl rule__Component__Group_3__1 ;
    public final void rule__Component__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:2080:1: ( rule__Component__Group_3__0__Impl rule__Component__Group_3__1 )
            // InternalT2.g:2081:2: rule__Component__Group_3__0__Impl rule__Component__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Component__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group_3__1();

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
    // $ANTLR end "rule__Component__Group_3__0"


    // $ANTLR start "rule__Component__Group_3__0__Impl"
    // InternalT2.g:2088:1: rule__Component__Group_3__0__Impl : ( 'itemtype' ) ;
    public final void rule__Component__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:2092:1: ( ( 'itemtype' ) )
            // InternalT2.g:2093:1: ( 'itemtype' )
            {
            // InternalT2.g:2093:1: ( 'itemtype' )
            // InternalT2.g:2094:2: 'itemtype'
            {
             before(grammarAccess.getComponentAccess().getItemtypeKeyword_3_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getItemtypeKeyword_3_0()); 

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
    // $ANTLR end "rule__Component__Group_3__0__Impl"


    // $ANTLR start "rule__Component__Group_3__1"
    // InternalT2.g:2103:1: rule__Component__Group_3__1 : rule__Component__Group_3__1__Impl ;
    public final void rule__Component__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:2107:1: ( rule__Component__Group_3__1__Impl )
            // InternalT2.g:2108:2: rule__Component__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group_3__1__Impl();

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
    // $ANTLR end "rule__Component__Group_3__1"


    // $ANTLR start "rule__Component__Group_3__1__Impl"
    // InternalT2.g:2114:1: rule__Component__Group_3__1__Impl : ( ( rule__Component__ItemtypeAssignment_3_1 ) ) ;
    public final void rule__Component__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:2118:1: ( ( ( rule__Component__ItemtypeAssignment_3_1 ) ) )
            // InternalT2.g:2119:1: ( ( rule__Component__ItemtypeAssignment_3_1 ) )
            {
            // InternalT2.g:2119:1: ( ( rule__Component__ItemtypeAssignment_3_1 ) )
            // InternalT2.g:2120:2: ( rule__Component__ItemtypeAssignment_3_1 )
            {
             before(grammarAccess.getComponentAccess().getItemtypeAssignment_3_1()); 
            // InternalT2.g:2121:2: ( rule__Component__ItemtypeAssignment_3_1 )
            // InternalT2.g:2121:3: rule__Component__ItemtypeAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Component__ItemtypeAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getItemtypeAssignment_3_1()); 

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
    // $ANTLR end "rule__Component__Group_3__1__Impl"


    // $ANTLR start "rule__Component__Group_4__0"
    // InternalT2.g:2130:1: rule__Component__Group_4__0 : rule__Component__Group_4__0__Impl rule__Component__Group_4__1 ;
    public final void rule__Component__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:2134:1: ( rule__Component__Group_4__0__Impl rule__Component__Group_4__1 )
            // InternalT2.g:2135:2: rule__Component__Group_4__0__Impl rule__Component__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__Component__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group_4__1();

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
    // $ANTLR end "rule__Component__Group_4__0"


    // $ANTLR start "rule__Component__Group_4__0__Impl"
    // InternalT2.g:2142:1: rule__Component__Group_4__0__Impl : ( 'overseasitem' ) ;
    public final void rule__Component__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:2146:1: ( ( 'overseasitem' ) )
            // InternalT2.g:2147:1: ( 'overseasitem' )
            {
            // InternalT2.g:2147:1: ( 'overseasitem' )
            // InternalT2.g:2148:2: 'overseasitem'
            {
             before(grammarAccess.getComponentAccess().getOverseasitemKeyword_4_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getOverseasitemKeyword_4_0()); 

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
    // $ANTLR end "rule__Component__Group_4__0__Impl"


    // $ANTLR start "rule__Component__Group_4__1"
    // InternalT2.g:2157:1: rule__Component__Group_4__1 : rule__Component__Group_4__1__Impl ;
    public final void rule__Component__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:2161:1: ( rule__Component__Group_4__1__Impl )
            // InternalT2.g:2162:2: rule__Component__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group_4__1__Impl();

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
    // $ANTLR end "rule__Component__Group_4__1"


    // $ANTLR start "rule__Component__Group_4__1__Impl"
    // InternalT2.g:2168:1: rule__Component__Group_4__1__Impl : ( ( rule__Component__OverseasitemAssignment_4_1 ) ) ;
    public final void rule__Component__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:2172:1: ( ( ( rule__Component__OverseasitemAssignment_4_1 ) ) )
            // InternalT2.g:2173:1: ( ( rule__Component__OverseasitemAssignment_4_1 ) )
            {
            // InternalT2.g:2173:1: ( ( rule__Component__OverseasitemAssignment_4_1 ) )
            // InternalT2.g:2174:2: ( rule__Component__OverseasitemAssignment_4_1 )
            {
             before(grammarAccess.getComponentAccess().getOverseasitemAssignment_4_1()); 
            // InternalT2.g:2175:2: ( rule__Component__OverseasitemAssignment_4_1 )
            // InternalT2.g:2175:3: rule__Component__OverseasitemAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Component__OverseasitemAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getOverseasitemAssignment_4_1()); 

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
    // $ANTLR end "rule__Component__Group_4__1__Impl"


    // $ANTLR start "rule__Component__Group_5__0"
    // InternalT2.g:2184:1: rule__Component__Group_5__0 : rule__Component__Group_5__0__Impl rule__Component__Group_5__1 ;
    public final void rule__Component__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:2188:1: ( rule__Component__Group_5__0__Impl rule__Component__Group_5__1 )
            // InternalT2.g:2189:2: rule__Component__Group_5__0__Impl rule__Component__Group_5__1
            {
            pushFollow(FOLLOW_4);
            rule__Component__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group_5__1();

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
    // $ANTLR end "rule__Component__Group_5__0"


    // $ANTLR start "rule__Component__Group_5__0__Impl"
    // InternalT2.g:2196:1: rule__Component__Group_5__0__Impl : ( 'overseasmaterial' ) ;
    public final void rule__Component__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:2200:1: ( ( 'overseasmaterial' ) )
            // InternalT2.g:2201:1: ( 'overseasmaterial' )
            {
            // InternalT2.g:2201:1: ( 'overseasmaterial' )
            // InternalT2.g:2202:2: 'overseasmaterial'
            {
             before(grammarAccess.getComponentAccess().getOverseasmaterialKeyword_5_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getOverseasmaterialKeyword_5_0()); 

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
    // $ANTLR end "rule__Component__Group_5__0__Impl"


    // $ANTLR start "rule__Component__Group_5__1"
    // InternalT2.g:2211:1: rule__Component__Group_5__1 : rule__Component__Group_5__1__Impl ;
    public final void rule__Component__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:2215:1: ( rule__Component__Group_5__1__Impl )
            // InternalT2.g:2216:2: rule__Component__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group_5__1__Impl();

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
    // $ANTLR end "rule__Component__Group_5__1"


    // $ANTLR start "rule__Component__Group_5__1__Impl"
    // InternalT2.g:2222:1: rule__Component__Group_5__1__Impl : ( ( rule__Component__OverseasmaterialAssignment_5_1 ) ) ;
    public final void rule__Component__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:2226:1: ( ( ( rule__Component__OverseasmaterialAssignment_5_1 ) ) )
            // InternalT2.g:2227:1: ( ( rule__Component__OverseasmaterialAssignment_5_1 ) )
            {
            // InternalT2.g:2227:1: ( ( rule__Component__OverseasmaterialAssignment_5_1 ) )
            // InternalT2.g:2228:2: ( rule__Component__OverseasmaterialAssignment_5_1 )
            {
             before(grammarAccess.getComponentAccess().getOverseasmaterialAssignment_5_1()); 
            // InternalT2.g:2229:2: ( rule__Component__OverseasmaterialAssignment_5_1 )
            // InternalT2.g:2229:3: rule__Component__OverseasmaterialAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Component__OverseasmaterialAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getOverseasmaterialAssignment_5_1()); 

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
    // $ANTLR end "rule__Component__Group_5__1__Impl"


    // $ANTLR start "rule__Factory__NameAssignment_2"
    // InternalT2.g:2238:1: rule__Factory__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Factory__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:2242:1: ( ( ruleEString ) )
            // InternalT2.g:2243:2: ( ruleEString )
            {
            // InternalT2.g:2243:2: ( ruleEString )
            // InternalT2.g:2244:3: ruleEString
            {
             before(grammarAccess.getFactoryAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFactoryAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Factory__NameAssignment_2"


    // $ANTLR start "rule__Factory__OverseasitemAssignment_4_2"
    // InternalT2.g:2253:1: rule__Factory__OverseasitemAssignment_4_2 : ( ruleOverseasItem ) ;
    public final void rule__Factory__OverseasitemAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:2257:1: ( ( ruleOverseasItem ) )
            // InternalT2.g:2258:2: ( ruleOverseasItem )
            {
            // InternalT2.g:2258:2: ( ruleOverseasItem )
            // InternalT2.g:2259:3: ruleOverseasItem
            {
             before(grammarAccess.getFactoryAccess().getOverseasitemOverseasItemParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleOverseasItem();

            state._fsp--;

             after(grammarAccess.getFactoryAccess().getOverseasitemOverseasItemParserRuleCall_4_2_0()); 

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
    // $ANTLR end "rule__Factory__OverseasitemAssignment_4_2"


    // $ANTLR start "rule__Factory__OverseasitemAssignment_4_3_1"
    // InternalT2.g:2268:1: rule__Factory__OverseasitemAssignment_4_3_1 : ( ruleOverseasItem ) ;
    public final void rule__Factory__OverseasitemAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:2272:1: ( ( ruleOverseasItem ) )
            // InternalT2.g:2273:2: ( ruleOverseasItem )
            {
            // InternalT2.g:2273:2: ( ruleOverseasItem )
            // InternalT2.g:2274:3: ruleOverseasItem
            {
             before(grammarAccess.getFactoryAccess().getOverseasitemOverseasItemParserRuleCall_4_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOverseasItem();

            state._fsp--;

             after(grammarAccess.getFactoryAccess().getOverseasitemOverseasItemParserRuleCall_4_3_1_0()); 

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
    // $ANTLR end "rule__Factory__OverseasitemAssignment_4_3_1"


    // $ANTLR start "rule__Factory__ItemtypeAssignment_5_2"
    // InternalT2.g:2283:1: rule__Factory__ItemtypeAssignment_5_2 : ( ruleItemType ) ;
    public final void rule__Factory__ItemtypeAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:2287:1: ( ( ruleItemType ) )
            // InternalT2.g:2288:2: ( ruleItemType )
            {
            // InternalT2.g:2288:2: ( ruleItemType )
            // InternalT2.g:2289:3: ruleItemType
            {
             before(grammarAccess.getFactoryAccess().getItemtypeItemTypeParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleItemType();

            state._fsp--;

             after(grammarAccess.getFactoryAccess().getItemtypeItemTypeParserRuleCall_5_2_0()); 

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
    // $ANTLR end "rule__Factory__ItemtypeAssignment_5_2"


    // $ANTLR start "rule__Factory__ItemtypeAssignment_5_3_1"
    // InternalT2.g:2298:1: rule__Factory__ItemtypeAssignment_5_3_1 : ( ruleItemType ) ;
    public final void rule__Factory__ItemtypeAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:2302:1: ( ( ruleItemType ) )
            // InternalT2.g:2303:2: ( ruleItemType )
            {
            // InternalT2.g:2303:2: ( ruleItemType )
            // InternalT2.g:2304:3: ruleItemType
            {
             before(grammarAccess.getFactoryAccess().getItemtypeItemTypeParserRuleCall_5_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleItemType();

            state._fsp--;

             after(grammarAccess.getFactoryAccess().getItemtypeItemTypeParserRuleCall_5_3_1_0()); 

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
    // $ANTLR end "rule__Factory__ItemtypeAssignment_5_3_1"


    // $ANTLR start "rule__OverseasItem__NameAssignment_2"
    // InternalT2.g:2313:1: rule__OverseasItem__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__OverseasItem__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:2317:1: ( ( ruleEString ) )
            // InternalT2.g:2318:2: ( ruleEString )
            {
            // InternalT2.g:2318:2: ( ruleEString )
            // InternalT2.g:2319:3: ruleEString
            {
             before(grammarAccess.getOverseasItemAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOverseasItemAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__OverseasItem__NameAssignment_2"


    // $ANTLR start "rule__OverseasItem__OverseasmaterialAssignment_4_2"
    // InternalT2.g:2328:1: rule__OverseasItem__OverseasmaterialAssignment_4_2 : ( ruleOverseasMaterial ) ;
    public final void rule__OverseasItem__OverseasmaterialAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:2332:1: ( ( ruleOverseasMaterial ) )
            // InternalT2.g:2333:2: ( ruleOverseasMaterial )
            {
            // InternalT2.g:2333:2: ( ruleOverseasMaterial )
            // InternalT2.g:2334:3: ruleOverseasMaterial
            {
             before(grammarAccess.getOverseasItemAccess().getOverseasmaterialOverseasMaterialParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleOverseasMaterial();

            state._fsp--;

             after(grammarAccess.getOverseasItemAccess().getOverseasmaterialOverseasMaterialParserRuleCall_4_2_0()); 

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
    // $ANTLR end "rule__OverseasItem__OverseasmaterialAssignment_4_2"


    // $ANTLR start "rule__OverseasItem__OverseasmaterialAssignment_4_3_1"
    // InternalT2.g:2343:1: rule__OverseasItem__OverseasmaterialAssignment_4_3_1 : ( ruleOverseasMaterial ) ;
    public final void rule__OverseasItem__OverseasmaterialAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:2347:1: ( ( ruleOverseasMaterial ) )
            // InternalT2.g:2348:2: ( ruleOverseasMaterial )
            {
            // InternalT2.g:2348:2: ( ruleOverseasMaterial )
            // InternalT2.g:2349:3: ruleOverseasMaterial
            {
             before(grammarAccess.getOverseasItemAccess().getOverseasmaterialOverseasMaterialParserRuleCall_4_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOverseasMaterial();

            state._fsp--;

             after(grammarAccess.getOverseasItemAccess().getOverseasmaterialOverseasMaterialParserRuleCall_4_3_1_0()); 

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
    // $ANTLR end "rule__OverseasItem__OverseasmaterialAssignment_4_3_1"


    // $ANTLR start "rule__OverseasMaterial__NameAssignment_2"
    // InternalT2.g:2358:1: rule__OverseasMaterial__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__OverseasMaterial__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:2362:1: ( ( ruleEString ) )
            // InternalT2.g:2363:2: ( ruleEString )
            {
            // InternalT2.g:2363:2: ( ruleEString )
            // InternalT2.g:2364:3: ruleEString
            {
             before(grammarAccess.getOverseasMaterialAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOverseasMaterialAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__OverseasMaterial__NameAssignment_2"


    // $ANTLR start "rule__BasicItemType__NameAssignment_2"
    // InternalT2.g:2373:1: rule__BasicItemType__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__BasicItemType__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:2377:1: ( ( ruleEString ) )
            // InternalT2.g:2378:2: ( ruleEString )
            {
            // InternalT2.g:2378:2: ( ruleEString )
            // InternalT2.g:2379:3: ruleEString
            {
             before(grammarAccess.getBasicItemTypeAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBasicItemTypeAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__BasicItemType__NameAssignment_2"


    // $ANTLR start "rule__ComplexItemType__NameAssignment_2"
    // InternalT2.g:2388:1: rule__ComplexItemType__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__ComplexItemType__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:2392:1: ( ( ruleEString ) )
            // InternalT2.g:2393:2: ( ruleEString )
            {
            // InternalT2.g:2393:2: ( ruleEString )
            // InternalT2.g:2394:3: ruleEString
            {
             before(grammarAccess.getComplexItemTypeAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getComplexItemTypeAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__ComplexItemType__NameAssignment_2"


    // $ANTLR start "rule__ComplexItemType__OverseasitemAssignment_4_1"
    // InternalT2.g:2403:1: rule__ComplexItemType__OverseasitemAssignment_4_1 : ( ( ruleEString ) ) ;
    public final void rule__ComplexItemType__OverseasitemAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:2407:1: ( ( ( ruleEString ) ) )
            // InternalT2.g:2408:2: ( ( ruleEString ) )
            {
            // InternalT2.g:2408:2: ( ( ruleEString ) )
            // InternalT2.g:2409:3: ( ruleEString )
            {
             before(grammarAccess.getComplexItemTypeAccess().getOverseasitemOverseasItemCrossReference_4_1_0()); 
            // InternalT2.g:2410:3: ( ruleEString )
            // InternalT2.g:2411:4: ruleEString
            {
             before(grammarAccess.getComplexItemTypeAccess().getOverseasitemOverseasItemEStringParserRuleCall_4_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getComplexItemTypeAccess().getOverseasitemOverseasItemEStringParserRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getComplexItemTypeAccess().getOverseasitemOverseasItemCrossReference_4_1_0()); 

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
    // $ANTLR end "rule__ComplexItemType__OverseasitemAssignment_4_1"


    // $ANTLR start "rule__ComplexItemType__OverseasmaterialAssignment_5_1"
    // InternalT2.g:2422:1: rule__ComplexItemType__OverseasmaterialAssignment_5_1 : ( ( ruleEString ) ) ;
    public final void rule__ComplexItemType__OverseasmaterialAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:2426:1: ( ( ( ruleEString ) ) )
            // InternalT2.g:2427:2: ( ( ruleEString ) )
            {
            // InternalT2.g:2427:2: ( ( ruleEString ) )
            // InternalT2.g:2428:3: ( ruleEString )
            {
             before(grammarAccess.getComplexItemTypeAccess().getOverseasmaterialOverseasMaterialCrossReference_5_1_0()); 
            // InternalT2.g:2429:3: ( ruleEString )
            // InternalT2.g:2430:4: ruleEString
            {
             before(grammarAccess.getComplexItemTypeAccess().getOverseasmaterialOverseasMaterialEStringParserRuleCall_5_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getComplexItemTypeAccess().getOverseasmaterialOverseasMaterialEStringParserRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getComplexItemTypeAccess().getOverseasmaterialOverseasMaterialCrossReference_5_1_0()); 

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
    // $ANTLR end "rule__ComplexItemType__OverseasmaterialAssignment_5_1"


    // $ANTLR start "rule__ComplexItemType__ComponentAssignment_6_2"
    // InternalT2.g:2441:1: rule__ComplexItemType__ComponentAssignment_6_2 : ( ruleComponent ) ;
    public final void rule__ComplexItemType__ComponentAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:2445:1: ( ( ruleComponent ) )
            // InternalT2.g:2446:2: ( ruleComponent )
            {
            // InternalT2.g:2446:2: ( ruleComponent )
            // InternalT2.g:2447:3: ruleComponent
            {
             before(grammarAccess.getComplexItemTypeAccess().getComponentComponentParserRuleCall_6_2_0()); 
            pushFollow(FOLLOW_2);
            ruleComponent();

            state._fsp--;

             after(grammarAccess.getComplexItemTypeAccess().getComponentComponentParserRuleCall_6_2_0()); 

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
    // $ANTLR end "rule__ComplexItemType__ComponentAssignment_6_2"


    // $ANTLR start "rule__ComplexItemType__ComponentAssignment_6_3_1"
    // InternalT2.g:2456:1: rule__ComplexItemType__ComponentAssignment_6_3_1 : ( ruleComponent ) ;
    public final void rule__ComplexItemType__ComponentAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:2460:1: ( ( ruleComponent ) )
            // InternalT2.g:2461:2: ( ruleComponent )
            {
            // InternalT2.g:2461:2: ( ruleComponent )
            // InternalT2.g:2462:3: ruleComponent
            {
             before(grammarAccess.getComplexItemTypeAccess().getComponentComponentParserRuleCall_6_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleComponent();

            state._fsp--;

             after(grammarAccess.getComplexItemTypeAccess().getComponentComponentParserRuleCall_6_3_1_0()); 

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
    // $ANTLR end "rule__ComplexItemType__ComponentAssignment_6_3_1"


    // $ANTLR start "rule__Component__ItemtypeAssignment_3_1"
    // InternalT2.g:2471:1: rule__Component__ItemtypeAssignment_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Component__ItemtypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:2475:1: ( ( ( ruleEString ) ) )
            // InternalT2.g:2476:2: ( ( ruleEString ) )
            {
            // InternalT2.g:2476:2: ( ( ruleEString ) )
            // InternalT2.g:2477:3: ( ruleEString )
            {
             before(grammarAccess.getComponentAccess().getItemtypeItemTypeCrossReference_3_1_0()); 
            // InternalT2.g:2478:3: ( ruleEString )
            // InternalT2.g:2479:4: ruleEString
            {
             before(grammarAccess.getComponentAccess().getItemtypeItemTypeEStringParserRuleCall_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getItemtypeItemTypeEStringParserRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getComponentAccess().getItemtypeItemTypeCrossReference_3_1_0()); 

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
    // $ANTLR end "rule__Component__ItemtypeAssignment_3_1"


    // $ANTLR start "rule__Component__OverseasitemAssignment_4_1"
    // InternalT2.g:2490:1: rule__Component__OverseasitemAssignment_4_1 : ( ( ruleEString ) ) ;
    public final void rule__Component__OverseasitemAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:2494:1: ( ( ( ruleEString ) ) )
            // InternalT2.g:2495:2: ( ( ruleEString ) )
            {
            // InternalT2.g:2495:2: ( ( ruleEString ) )
            // InternalT2.g:2496:3: ( ruleEString )
            {
             before(grammarAccess.getComponentAccess().getOverseasitemOverseasItemCrossReference_4_1_0()); 
            // InternalT2.g:2497:3: ( ruleEString )
            // InternalT2.g:2498:4: ruleEString
            {
             before(grammarAccess.getComponentAccess().getOverseasitemOverseasItemEStringParserRuleCall_4_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getOverseasitemOverseasItemEStringParserRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getComponentAccess().getOverseasitemOverseasItemCrossReference_4_1_0()); 

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
    // $ANTLR end "rule__Component__OverseasitemAssignment_4_1"


    // $ANTLR start "rule__Component__OverseasmaterialAssignment_5_1"
    // InternalT2.g:2509:1: rule__Component__OverseasmaterialAssignment_5_1 : ( ( ruleEString ) ) ;
    public final void rule__Component__OverseasmaterialAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:2513:1: ( ( ( ruleEString ) ) )
            // InternalT2.g:2514:2: ( ( ruleEString ) )
            {
            // InternalT2.g:2514:2: ( ( ruleEString ) )
            // InternalT2.g:2515:3: ( ruleEString )
            {
             before(grammarAccess.getComponentAccess().getOverseasmaterialOverseasMaterialCrossReference_5_1_0()); 
            // InternalT2.g:2516:3: ( ruleEString )
            // InternalT2.g:2517:4: ruleEString
            {
             before(grammarAccess.getComponentAccess().getOverseasmaterialOverseasMaterialEStringParserRuleCall_5_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getOverseasmaterialOverseasMaterialEStringParserRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getComponentAccess().getOverseasmaterialOverseasMaterialCrossReference_5_1_0()); 

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
    // $ANTLR end "rule__Component__OverseasmaterialAssignment_5_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000016000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000042000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000446000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000056000L});

}