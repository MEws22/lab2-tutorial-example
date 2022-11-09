package org.xtext.example.ide.contentassist.antlr.internal;

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
import org.xtext.example.services.TutorialGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTutorialParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'E'", "'e'", "'WOOD'", "'STEEL'", "'GOLD'", "'COPPER'", "'factory'", "'{'", "'}'", "'CylinderShape'", "'l'", "':'", "'cm'", "'r'", "'BlockShape'", "'w'", "'h'", "'basicItemType'", "'('", "')'", "'shape'", "'markers'", "'color'", "'g'", "'b'", "'complexItemType'", "'components'", "'connections'", "'<->'", "'-'", "'.'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalTutorialParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTutorialParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTutorialParser.tokenNames; }
    public String getGrammarFileName() { return "InternalTutorial.g"; }


    	private TutorialGrammarAccess grammarAccess;

    	public void setGrammarAccess(TutorialGrammarAccess grammarAccess) {
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
    // InternalTutorial.g:53:1: entryRuleFactory : ruleFactory EOF ;
    public final void entryRuleFactory() throws RecognitionException {
        try {
            // InternalTutorial.g:54:1: ( ruleFactory EOF )
            // InternalTutorial.g:55:1: ruleFactory EOF
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
    // InternalTutorial.g:62:1: ruleFactory : ( ( rule__Factory__Group__0 ) ) ;
    public final void ruleFactory() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:66:2: ( ( ( rule__Factory__Group__0 ) ) )
            // InternalTutorial.g:67:2: ( ( rule__Factory__Group__0 ) )
            {
            // InternalTutorial.g:67:2: ( ( rule__Factory__Group__0 ) )
            // InternalTutorial.g:68:3: ( rule__Factory__Group__0 )
            {
             before(grammarAccess.getFactoryAccess().getGroup()); 
            // InternalTutorial.g:69:3: ( rule__Factory__Group__0 )
            // InternalTutorial.g:69:4: rule__Factory__Group__0
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
    // InternalTutorial.g:78:1: entryRuleItemType : ruleItemType EOF ;
    public final void entryRuleItemType() throws RecognitionException {
        try {
            // InternalTutorial.g:79:1: ( ruleItemType EOF )
            // InternalTutorial.g:80:1: ruleItemType EOF
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
    // InternalTutorial.g:87:1: ruleItemType : ( ( rule__ItemType__Alternatives ) ) ;
    public final void ruleItemType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:91:2: ( ( ( rule__ItemType__Alternatives ) ) )
            // InternalTutorial.g:92:2: ( ( rule__ItemType__Alternatives ) )
            {
            // InternalTutorial.g:92:2: ( ( rule__ItemType__Alternatives ) )
            // InternalTutorial.g:93:3: ( rule__ItemType__Alternatives )
            {
             before(grammarAccess.getItemTypeAccess().getAlternatives()); 
            // InternalTutorial.g:94:3: ( rule__ItemType__Alternatives )
            // InternalTutorial.g:94:4: rule__ItemType__Alternatives
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


    // $ANTLR start "entryRuleShape"
    // InternalTutorial.g:103:1: entryRuleShape : ruleShape EOF ;
    public final void entryRuleShape() throws RecognitionException {
        try {
            // InternalTutorial.g:104:1: ( ruleShape EOF )
            // InternalTutorial.g:105:1: ruleShape EOF
            {
             before(grammarAccess.getShapeRule()); 
            pushFollow(FOLLOW_1);
            ruleShape();

            state._fsp--;

             after(grammarAccess.getShapeRule()); 
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
    // $ANTLR end "entryRuleShape"


    // $ANTLR start "ruleShape"
    // InternalTutorial.g:112:1: ruleShape : ( ( rule__Shape__Alternatives ) ) ;
    public final void ruleShape() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:116:2: ( ( ( rule__Shape__Alternatives ) ) )
            // InternalTutorial.g:117:2: ( ( rule__Shape__Alternatives ) )
            {
            // InternalTutorial.g:117:2: ( ( rule__Shape__Alternatives ) )
            // InternalTutorial.g:118:3: ( rule__Shape__Alternatives )
            {
             before(grammarAccess.getShapeAccess().getAlternatives()); 
            // InternalTutorial.g:119:3: ( rule__Shape__Alternatives )
            // InternalTutorial.g:119:4: rule__Shape__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Shape__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getShapeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleShape"


    // $ANTLR start "entryRuleCylinderShape"
    // InternalTutorial.g:128:1: entryRuleCylinderShape : ruleCylinderShape EOF ;
    public final void entryRuleCylinderShape() throws RecognitionException {
        try {
            // InternalTutorial.g:129:1: ( ruleCylinderShape EOF )
            // InternalTutorial.g:130:1: ruleCylinderShape EOF
            {
             before(grammarAccess.getCylinderShapeRule()); 
            pushFollow(FOLLOW_1);
            ruleCylinderShape();

            state._fsp--;

             after(grammarAccess.getCylinderShapeRule()); 
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
    // $ANTLR end "entryRuleCylinderShape"


    // $ANTLR start "ruleCylinderShape"
    // InternalTutorial.g:137:1: ruleCylinderShape : ( ( rule__CylinderShape__Group__0 ) ) ;
    public final void ruleCylinderShape() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:141:2: ( ( ( rule__CylinderShape__Group__0 ) ) )
            // InternalTutorial.g:142:2: ( ( rule__CylinderShape__Group__0 ) )
            {
            // InternalTutorial.g:142:2: ( ( rule__CylinderShape__Group__0 ) )
            // InternalTutorial.g:143:3: ( rule__CylinderShape__Group__0 )
            {
             before(grammarAccess.getCylinderShapeAccess().getGroup()); 
            // InternalTutorial.g:144:3: ( rule__CylinderShape__Group__0 )
            // InternalTutorial.g:144:4: rule__CylinderShape__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CylinderShape__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCylinderShapeAccess().getGroup()); 

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
    // $ANTLR end "ruleCylinderShape"


    // $ANTLR start "entryRuleBlockShape"
    // InternalTutorial.g:153:1: entryRuleBlockShape : ruleBlockShape EOF ;
    public final void entryRuleBlockShape() throws RecognitionException {
        try {
            // InternalTutorial.g:154:1: ( ruleBlockShape EOF )
            // InternalTutorial.g:155:1: ruleBlockShape EOF
            {
             before(grammarAccess.getBlockShapeRule()); 
            pushFollow(FOLLOW_1);
            ruleBlockShape();

            state._fsp--;

             after(grammarAccess.getBlockShapeRule()); 
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
    // $ANTLR end "entryRuleBlockShape"


    // $ANTLR start "ruleBlockShape"
    // InternalTutorial.g:162:1: ruleBlockShape : ( ( rule__BlockShape__Group__0 ) ) ;
    public final void ruleBlockShape() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:166:2: ( ( ( rule__BlockShape__Group__0 ) ) )
            // InternalTutorial.g:167:2: ( ( rule__BlockShape__Group__0 ) )
            {
            // InternalTutorial.g:167:2: ( ( rule__BlockShape__Group__0 ) )
            // InternalTutorial.g:168:3: ( rule__BlockShape__Group__0 )
            {
             before(grammarAccess.getBlockShapeAccess().getGroup()); 
            // InternalTutorial.g:169:3: ( rule__BlockShape__Group__0 )
            // InternalTutorial.g:169:4: rule__BlockShape__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BlockShape__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBlockShapeAccess().getGroup()); 

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
    // $ANTLR end "ruleBlockShape"


    // $ANTLR start "entryRuleBasicItemType"
    // InternalTutorial.g:178:1: entryRuleBasicItemType : ruleBasicItemType EOF ;
    public final void entryRuleBasicItemType() throws RecognitionException {
        try {
            // InternalTutorial.g:179:1: ( ruleBasicItemType EOF )
            // InternalTutorial.g:180:1: ruleBasicItemType EOF
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
    // InternalTutorial.g:187:1: ruleBasicItemType : ( ( rule__BasicItemType__Group__0 ) ) ;
    public final void ruleBasicItemType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:191:2: ( ( ( rule__BasicItemType__Group__0 ) ) )
            // InternalTutorial.g:192:2: ( ( rule__BasicItemType__Group__0 ) )
            {
            // InternalTutorial.g:192:2: ( ( rule__BasicItemType__Group__0 ) )
            // InternalTutorial.g:193:3: ( rule__BasicItemType__Group__0 )
            {
             before(grammarAccess.getBasicItemTypeAccess().getGroup()); 
            // InternalTutorial.g:194:3: ( rule__BasicItemType__Group__0 )
            // InternalTutorial.g:194:4: rule__BasicItemType__Group__0
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


    // $ANTLR start "entryRuleColor"
    // InternalTutorial.g:203:1: entryRuleColor : ruleColor EOF ;
    public final void entryRuleColor() throws RecognitionException {
        try {
            // InternalTutorial.g:204:1: ( ruleColor EOF )
            // InternalTutorial.g:205:1: ruleColor EOF
            {
             before(grammarAccess.getColorRule()); 
            pushFollow(FOLLOW_1);
            ruleColor();

            state._fsp--;

             after(grammarAccess.getColorRule()); 
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
    // $ANTLR end "entryRuleColor"


    // $ANTLR start "ruleColor"
    // InternalTutorial.g:212:1: ruleColor : ( ( rule__Color__Group__0 ) ) ;
    public final void ruleColor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:216:2: ( ( ( rule__Color__Group__0 ) ) )
            // InternalTutorial.g:217:2: ( ( rule__Color__Group__0 ) )
            {
            // InternalTutorial.g:217:2: ( ( rule__Color__Group__0 ) )
            // InternalTutorial.g:218:3: ( rule__Color__Group__0 )
            {
             before(grammarAccess.getColorAccess().getGroup()); 
            // InternalTutorial.g:219:3: ( rule__Color__Group__0 )
            // InternalTutorial.g:219:4: rule__Color__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Color__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getColorAccess().getGroup()); 

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
    // $ANTLR end "ruleColor"


    // $ANTLR start "entryRuleMarker"
    // InternalTutorial.g:228:1: entryRuleMarker : ruleMarker EOF ;
    public final void entryRuleMarker() throws RecognitionException {
        try {
            // InternalTutorial.g:229:1: ( ruleMarker EOF )
            // InternalTutorial.g:230:1: ruleMarker EOF
            {
             before(grammarAccess.getMarkerRule()); 
            pushFollow(FOLLOW_1);
            ruleMarker();

            state._fsp--;

             after(grammarAccess.getMarkerRule()); 
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
    // $ANTLR end "entryRuleMarker"


    // $ANTLR start "ruleMarker"
    // InternalTutorial.g:237:1: ruleMarker : ( ( rule__Marker__NameAssignment ) ) ;
    public final void ruleMarker() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:241:2: ( ( ( rule__Marker__NameAssignment ) ) )
            // InternalTutorial.g:242:2: ( ( rule__Marker__NameAssignment ) )
            {
            // InternalTutorial.g:242:2: ( ( rule__Marker__NameAssignment ) )
            // InternalTutorial.g:243:3: ( rule__Marker__NameAssignment )
            {
             before(grammarAccess.getMarkerAccess().getNameAssignment()); 
            // InternalTutorial.g:244:3: ( rule__Marker__NameAssignment )
            // InternalTutorial.g:244:4: rule__Marker__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Marker__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getMarkerAccess().getNameAssignment()); 

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
    // $ANTLR end "ruleMarker"


    // $ANTLR start "entryRuleComplexItemType"
    // InternalTutorial.g:253:1: entryRuleComplexItemType : ruleComplexItemType EOF ;
    public final void entryRuleComplexItemType() throws RecognitionException {
        try {
            // InternalTutorial.g:254:1: ( ruleComplexItemType EOF )
            // InternalTutorial.g:255:1: ruleComplexItemType EOF
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
    // InternalTutorial.g:262:1: ruleComplexItemType : ( ( rule__ComplexItemType__Group__0 ) ) ;
    public final void ruleComplexItemType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:266:2: ( ( ( rule__ComplexItemType__Group__0 ) ) )
            // InternalTutorial.g:267:2: ( ( rule__ComplexItemType__Group__0 ) )
            {
            // InternalTutorial.g:267:2: ( ( rule__ComplexItemType__Group__0 ) )
            // InternalTutorial.g:268:3: ( rule__ComplexItemType__Group__0 )
            {
             before(grammarAccess.getComplexItemTypeAccess().getGroup()); 
            // InternalTutorial.g:269:3: ( rule__ComplexItemType__Group__0 )
            // InternalTutorial.g:269:4: rule__ComplexItemType__Group__0
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
    // InternalTutorial.g:278:1: entryRuleComponent : ruleComponent EOF ;
    public final void entryRuleComponent() throws RecognitionException {
        try {
            // InternalTutorial.g:279:1: ( ruleComponent EOF )
            // InternalTutorial.g:280:1: ruleComponent EOF
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
    // InternalTutorial.g:287:1: ruleComponent : ( ( rule__Component__Group__0 ) ) ;
    public final void ruleComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:291:2: ( ( ( rule__Component__Group__0 ) ) )
            // InternalTutorial.g:292:2: ( ( rule__Component__Group__0 ) )
            {
            // InternalTutorial.g:292:2: ( ( rule__Component__Group__0 ) )
            // InternalTutorial.g:293:3: ( rule__Component__Group__0 )
            {
             before(grammarAccess.getComponentAccess().getGroup()); 
            // InternalTutorial.g:294:3: ( rule__Component__Group__0 )
            // InternalTutorial.g:294:4: rule__Component__Group__0
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


    // $ANTLR start "entryRuleItemConnection"
    // InternalTutorial.g:303:1: entryRuleItemConnection : ruleItemConnection EOF ;
    public final void entryRuleItemConnection() throws RecognitionException {
        try {
            // InternalTutorial.g:304:1: ( ruleItemConnection EOF )
            // InternalTutorial.g:305:1: ruleItemConnection EOF
            {
             before(grammarAccess.getItemConnectionRule()); 
            pushFollow(FOLLOW_1);
            ruleItemConnection();

            state._fsp--;

             after(grammarAccess.getItemConnectionRule()); 
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
    // $ANTLR end "entryRuleItemConnection"


    // $ANTLR start "ruleItemConnection"
    // InternalTutorial.g:312:1: ruleItemConnection : ( ( rule__ItemConnection__Group__0 ) ) ;
    public final void ruleItemConnection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:316:2: ( ( ( rule__ItemConnection__Group__0 ) ) )
            // InternalTutorial.g:317:2: ( ( rule__ItemConnection__Group__0 ) )
            {
            // InternalTutorial.g:317:2: ( ( rule__ItemConnection__Group__0 ) )
            // InternalTutorial.g:318:3: ( rule__ItemConnection__Group__0 )
            {
             before(grammarAccess.getItemConnectionAccess().getGroup()); 
            // InternalTutorial.g:319:3: ( rule__ItemConnection__Group__0 )
            // InternalTutorial.g:319:4: rule__ItemConnection__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ItemConnection__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getItemConnectionAccess().getGroup()); 

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
    // $ANTLR end "ruleItemConnection"


    // $ANTLR start "entryRuleEString"
    // InternalTutorial.g:328:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalTutorial.g:329:1: ( ruleEString EOF )
            // InternalTutorial.g:330:1: ruleEString EOF
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
    // InternalTutorial.g:337:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:341:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalTutorial.g:342:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalTutorial.g:342:2: ( ( rule__EString__Alternatives ) )
            // InternalTutorial.g:343:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalTutorial.g:344:3: ( rule__EString__Alternatives )
            // InternalTutorial.g:344:4: rule__EString__Alternatives
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


    // $ANTLR start "entryRuleEDouble"
    // InternalTutorial.g:353:1: entryRuleEDouble : ruleEDouble EOF ;
    public final void entryRuleEDouble() throws RecognitionException {
        try {
            // InternalTutorial.g:354:1: ( ruleEDouble EOF )
            // InternalTutorial.g:355:1: ruleEDouble EOF
            {
             before(grammarAccess.getEDoubleRule()); 
            pushFollow(FOLLOW_1);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getEDoubleRule()); 
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
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // InternalTutorial.g:362:1: ruleEDouble : ( ( rule__EDouble__Group__0 ) ) ;
    public final void ruleEDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:366:2: ( ( ( rule__EDouble__Group__0 ) ) )
            // InternalTutorial.g:367:2: ( ( rule__EDouble__Group__0 ) )
            {
            // InternalTutorial.g:367:2: ( ( rule__EDouble__Group__0 ) )
            // InternalTutorial.g:368:3: ( rule__EDouble__Group__0 )
            {
             before(grammarAccess.getEDoubleAccess().getGroup()); 
            // InternalTutorial.g:369:3: ( rule__EDouble__Group__0 )
            // InternalTutorial.g:369:4: rule__EDouble__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEDoubleAccess().getGroup()); 

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
    // $ANTLR end "ruleEDouble"


    // $ANTLR start "entryRuleEInt"
    // InternalTutorial.g:378:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalTutorial.g:379:1: ( ruleEInt EOF )
            // InternalTutorial.g:380:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalTutorial.g:387:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:391:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalTutorial.g:392:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalTutorial.g:392:2: ( ( rule__EInt__Group__0 ) )
            // InternalTutorial.g:393:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalTutorial.g:394:3: ( rule__EInt__Group__0 )
            // InternalTutorial.g:394:4: rule__EInt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "ruleMaterial"
    // InternalTutorial.g:403:1: ruleMaterial : ( ( rule__Material__Alternatives ) ) ;
    public final void ruleMaterial() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:407:1: ( ( ( rule__Material__Alternatives ) ) )
            // InternalTutorial.g:408:2: ( ( rule__Material__Alternatives ) )
            {
            // InternalTutorial.g:408:2: ( ( rule__Material__Alternatives ) )
            // InternalTutorial.g:409:3: ( rule__Material__Alternatives )
            {
             before(grammarAccess.getMaterialAccess().getAlternatives()); 
            // InternalTutorial.g:410:3: ( rule__Material__Alternatives )
            // InternalTutorial.g:410:4: rule__Material__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Material__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMaterialAccess().getAlternatives()); 

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
    // $ANTLR end "ruleMaterial"


    // $ANTLR start "rule__ItemType__Alternatives"
    // InternalTutorial.g:418:1: rule__ItemType__Alternatives : ( ( ruleBasicItemType ) | ( ruleComplexItemType ) );
    public final void rule__ItemType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:422:1: ( ( ruleBasicItemType ) | ( ruleComplexItemType ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==28) ) {
                alt1=1;
            }
            else if ( (LA1_0==36) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalTutorial.g:423:2: ( ruleBasicItemType )
                    {
                    // InternalTutorial.g:423:2: ( ruleBasicItemType )
                    // InternalTutorial.g:424:3: ruleBasicItemType
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
                    // InternalTutorial.g:429:2: ( ruleComplexItemType )
                    {
                    // InternalTutorial.g:429:2: ( ruleComplexItemType )
                    // InternalTutorial.g:430:3: ruleComplexItemType
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


    // $ANTLR start "rule__Shape__Alternatives"
    // InternalTutorial.g:439:1: rule__Shape__Alternatives : ( ( ruleCylinderShape ) | ( ruleBlockShape ) );
    public final void rule__Shape__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:443:1: ( ( ruleCylinderShape ) | ( ruleBlockShape ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==20) ) {
                alt2=1;
            }
            else if ( (LA2_0==25) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalTutorial.g:444:2: ( ruleCylinderShape )
                    {
                    // InternalTutorial.g:444:2: ( ruleCylinderShape )
                    // InternalTutorial.g:445:3: ruleCylinderShape
                    {
                     before(grammarAccess.getShapeAccess().getCylinderShapeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleCylinderShape();

                    state._fsp--;

                     after(grammarAccess.getShapeAccess().getCylinderShapeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTutorial.g:450:2: ( ruleBlockShape )
                    {
                    // InternalTutorial.g:450:2: ( ruleBlockShape )
                    // InternalTutorial.g:451:3: ruleBlockShape
                    {
                     before(grammarAccess.getShapeAccess().getBlockShapeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleBlockShape();

                    state._fsp--;

                     after(grammarAccess.getShapeAccess().getBlockShapeParserRuleCall_1()); 

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
    // $ANTLR end "rule__Shape__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalTutorial.g:460:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:464:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalTutorial.g:465:2: ( RULE_STRING )
                    {
                    // InternalTutorial.g:465:2: ( RULE_STRING )
                    // InternalTutorial.g:466:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTutorial.g:471:2: ( RULE_ID )
                    {
                    // InternalTutorial.g:471:2: ( RULE_ID )
                    // InternalTutorial.g:472:3: RULE_ID
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


    // $ANTLR start "rule__EDouble__Alternatives_4_0"
    // InternalTutorial.g:481:1: rule__EDouble__Alternatives_4_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EDouble__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:485:1: ( ( 'E' ) | ( 'e' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==11) ) {
                alt4=1;
            }
            else if ( (LA4_0==12) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalTutorial.g:486:2: ( 'E' )
                    {
                    // InternalTutorial.g:486:2: ( 'E' )
                    // InternalTutorial.g:487:3: 'E'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTutorial.g:492:2: ( 'e' )
                    {
                    // InternalTutorial.g:492:2: ( 'e' )
                    // InternalTutorial.g:493:3: 'e'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_4_0_1()); 

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
    // $ANTLR end "rule__EDouble__Alternatives_4_0"


    // $ANTLR start "rule__Material__Alternatives"
    // InternalTutorial.g:502:1: rule__Material__Alternatives : ( ( ( 'WOOD' ) ) | ( ( 'STEEL' ) ) | ( ( 'GOLD' ) ) | ( ( 'COPPER' ) ) );
    public final void rule__Material__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:506:1: ( ( ( 'WOOD' ) ) | ( ( 'STEEL' ) ) | ( ( 'GOLD' ) ) | ( ( 'COPPER' ) ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt5=1;
                }
                break;
            case 14:
                {
                alt5=2;
                }
                break;
            case 15:
                {
                alt5=3;
                }
                break;
            case 16:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalTutorial.g:507:2: ( ( 'WOOD' ) )
                    {
                    // InternalTutorial.g:507:2: ( ( 'WOOD' ) )
                    // InternalTutorial.g:508:3: ( 'WOOD' )
                    {
                     before(grammarAccess.getMaterialAccess().getWOODEnumLiteralDeclaration_0()); 
                    // InternalTutorial.g:509:3: ( 'WOOD' )
                    // InternalTutorial.g:509:4: 'WOOD'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getMaterialAccess().getWOODEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTutorial.g:513:2: ( ( 'STEEL' ) )
                    {
                    // InternalTutorial.g:513:2: ( ( 'STEEL' ) )
                    // InternalTutorial.g:514:3: ( 'STEEL' )
                    {
                     before(grammarAccess.getMaterialAccess().getSTEELEnumLiteralDeclaration_1()); 
                    // InternalTutorial.g:515:3: ( 'STEEL' )
                    // InternalTutorial.g:515:4: 'STEEL'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getMaterialAccess().getSTEELEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTutorial.g:519:2: ( ( 'GOLD' ) )
                    {
                    // InternalTutorial.g:519:2: ( ( 'GOLD' ) )
                    // InternalTutorial.g:520:3: ( 'GOLD' )
                    {
                     before(grammarAccess.getMaterialAccess().getGOLDEnumLiteralDeclaration_2()); 
                    // InternalTutorial.g:521:3: ( 'GOLD' )
                    // InternalTutorial.g:521:4: 'GOLD'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getMaterialAccess().getGOLDEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalTutorial.g:525:2: ( ( 'COPPER' ) )
                    {
                    // InternalTutorial.g:525:2: ( ( 'COPPER' ) )
                    // InternalTutorial.g:526:3: ( 'COPPER' )
                    {
                     before(grammarAccess.getMaterialAccess().getCOPPEREnumLiteralDeclaration_3()); 
                    // InternalTutorial.g:527:3: ( 'COPPER' )
                    // InternalTutorial.g:527:4: 'COPPER'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getMaterialAccess().getCOPPEREnumLiteralDeclaration_3()); 

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
    // $ANTLR end "rule__Material__Alternatives"


    // $ANTLR start "rule__Factory__Group__0"
    // InternalTutorial.g:535:1: rule__Factory__Group__0 : rule__Factory__Group__0__Impl rule__Factory__Group__1 ;
    public final void rule__Factory__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:539:1: ( rule__Factory__Group__0__Impl rule__Factory__Group__1 )
            // InternalTutorial.g:540:2: rule__Factory__Group__0__Impl rule__Factory__Group__1
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
    // InternalTutorial.g:547:1: rule__Factory__Group__0__Impl : ( 'factory' ) ;
    public final void rule__Factory__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:551:1: ( ( 'factory' ) )
            // InternalTutorial.g:552:1: ( 'factory' )
            {
            // InternalTutorial.g:552:1: ( 'factory' )
            // InternalTutorial.g:553:2: 'factory'
            {
             before(grammarAccess.getFactoryAccess().getFactoryKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getFactoryAccess().getFactoryKeyword_0()); 

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
    // $ANTLR end "rule__Factory__Group__0__Impl"


    // $ANTLR start "rule__Factory__Group__1"
    // InternalTutorial.g:562:1: rule__Factory__Group__1 : rule__Factory__Group__1__Impl rule__Factory__Group__2 ;
    public final void rule__Factory__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:566:1: ( rule__Factory__Group__1__Impl rule__Factory__Group__2 )
            // InternalTutorial.g:567:2: rule__Factory__Group__1__Impl rule__Factory__Group__2
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
    // InternalTutorial.g:574:1: rule__Factory__Group__1__Impl : ( ( rule__Factory__NameAssignment_1 ) ) ;
    public final void rule__Factory__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:578:1: ( ( ( rule__Factory__NameAssignment_1 ) ) )
            // InternalTutorial.g:579:1: ( ( rule__Factory__NameAssignment_1 ) )
            {
            // InternalTutorial.g:579:1: ( ( rule__Factory__NameAssignment_1 ) )
            // InternalTutorial.g:580:2: ( rule__Factory__NameAssignment_1 )
            {
             before(grammarAccess.getFactoryAccess().getNameAssignment_1()); 
            // InternalTutorial.g:581:2: ( rule__Factory__NameAssignment_1 )
            // InternalTutorial.g:581:3: rule__Factory__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Factory__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFactoryAccess().getNameAssignment_1()); 

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
    // InternalTutorial.g:589:1: rule__Factory__Group__2 : rule__Factory__Group__2__Impl rule__Factory__Group__3 ;
    public final void rule__Factory__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:593:1: ( rule__Factory__Group__2__Impl rule__Factory__Group__3 )
            // InternalTutorial.g:594:2: rule__Factory__Group__2__Impl rule__Factory__Group__3
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
    // InternalTutorial.g:601:1: rule__Factory__Group__2__Impl : ( '{' ) ;
    public final void rule__Factory__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:605:1: ( ( '{' ) )
            // InternalTutorial.g:606:1: ( '{' )
            {
            // InternalTutorial.g:606:1: ( '{' )
            // InternalTutorial.g:607:2: '{'
            {
             before(grammarAccess.getFactoryAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getFactoryAccess().getLeftCurlyBracketKeyword_2()); 

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
    // InternalTutorial.g:616:1: rule__Factory__Group__3 : rule__Factory__Group__3__Impl rule__Factory__Group__4 ;
    public final void rule__Factory__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:620:1: ( rule__Factory__Group__3__Impl rule__Factory__Group__4 )
            // InternalTutorial.g:621:2: rule__Factory__Group__3__Impl rule__Factory__Group__4
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
    // InternalTutorial.g:628:1: rule__Factory__Group__3__Impl : ( ( ( rule__Factory__ItemTypesAssignment_3 ) ) ( ( rule__Factory__ItemTypesAssignment_3 )* ) ) ;
    public final void rule__Factory__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:632:1: ( ( ( ( rule__Factory__ItemTypesAssignment_3 ) ) ( ( rule__Factory__ItemTypesAssignment_3 )* ) ) )
            // InternalTutorial.g:633:1: ( ( ( rule__Factory__ItemTypesAssignment_3 ) ) ( ( rule__Factory__ItemTypesAssignment_3 )* ) )
            {
            // InternalTutorial.g:633:1: ( ( ( rule__Factory__ItemTypesAssignment_3 ) ) ( ( rule__Factory__ItemTypesAssignment_3 )* ) )
            // InternalTutorial.g:634:2: ( ( rule__Factory__ItemTypesAssignment_3 ) ) ( ( rule__Factory__ItemTypesAssignment_3 )* )
            {
            // InternalTutorial.g:634:2: ( ( rule__Factory__ItemTypesAssignment_3 ) )
            // InternalTutorial.g:635:3: ( rule__Factory__ItemTypesAssignment_3 )
            {
             before(grammarAccess.getFactoryAccess().getItemTypesAssignment_3()); 
            // InternalTutorial.g:636:3: ( rule__Factory__ItemTypesAssignment_3 )
            // InternalTutorial.g:636:4: rule__Factory__ItemTypesAssignment_3
            {
            pushFollow(FOLLOW_7);
            rule__Factory__ItemTypesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getFactoryAccess().getItemTypesAssignment_3()); 

            }

            // InternalTutorial.g:639:2: ( ( rule__Factory__ItemTypesAssignment_3 )* )
            // InternalTutorial.g:640:3: ( rule__Factory__ItemTypesAssignment_3 )*
            {
             before(grammarAccess.getFactoryAccess().getItemTypesAssignment_3()); 
            // InternalTutorial.g:641:3: ( rule__Factory__ItemTypesAssignment_3 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==28||LA6_0==36) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalTutorial.g:641:4: rule__Factory__ItemTypesAssignment_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Factory__ItemTypesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getFactoryAccess().getItemTypesAssignment_3()); 

            }


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
    // InternalTutorial.g:650:1: rule__Factory__Group__4 : rule__Factory__Group__4__Impl ;
    public final void rule__Factory__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:654:1: ( rule__Factory__Group__4__Impl )
            // InternalTutorial.g:655:2: rule__Factory__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Factory__Group__4__Impl();

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
    // InternalTutorial.g:661:1: rule__Factory__Group__4__Impl : ( '}' ) ;
    public final void rule__Factory__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:665:1: ( ( '}' ) )
            // InternalTutorial.g:666:1: ( '}' )
            {
            // InternalTutorial.g:666:1: ( '}' )
            // InternalTutorial.g:667:2: '}'
            {
             before(grammarAccess.getFactoryAccess().getRightCurlyBracketKeyword_4()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getFactoryAccess().getRightCurlyBracketKeyword_4()); 

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


    // $ANTLR start "rule__CylinderShape__Group__0"
    // InternalTutorial.g:677:1: rule__CylinderShape__Group__0 : rule__CylinderShape__Group__0__Impl rule__CylinderShape__Group__1 ;
    public final void rule__CylinderShape__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:681:1: ( rule__CylinderShape__Group__0__Impl rule__CylinderShape__Group__1 )
            // InternalTutorial.g:682:2: rule__CylinderShape__Group__0__Impl rule__CylinderShape__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__CylinderShape__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CylinderShape__Group__1();

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
    // $ANTLR end "rule__CylinderShape__Group__0"


    // $ANTLR start "rule__CylinderShape__Group__0__Impl"
    // InternalTutorial.g:689:1: rule__CylinderShape__Group__0__Impl : ( 'CylinderShape' ) ;
    public final void rule__CylinderShape__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:693:1: ( ( 'CylinderShape' ) )
            // InternalTutorial.g:694:1: ( 'CylinderShape' )
            {
            // InternalTutorial.g:694:1: ( 'CylinderShape' )
            // InternalTutorial.g:695:2: 'CylinderShape'
            {
             before(grammarAccess.getCylinderShapeAccess().getCylinderShapeKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getCylinderShapeAccess().getCylinderShapeKeyword_0()); 

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
    // $ANTLR end "rule__CylinderShape__Group__0__Impl"


    // $ANTLR start "rule__CylinderShape__Group__1"
    // InternalTutorial.g:704:1: rule__CylinderShape__Group__1 : rule__CylinderShape__Group__1__Impl rule__CylinderShape__Group__2 ;
    public final void rule__CylinderShape__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:708:1: ( rule__CylinderShape__Group__1__Impl rule__CylinderShape__Group__2 )
            // InternalTutorial.g:709:2: rule__CylinderShape__Group__1__Impl rule__CylinderShape__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__CylinderShape__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CylinderShape__Group__2();

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
    // $ANTLR end "rule__CylinderShape__Group__1"


    // $ANTLR start "rule__CylinderShape__Group__1__Impl"
    // InternalTutorial.g:716:1: rule__CylinderShape__Group__1__Impl : ( '{' ) ;
    public final void rule__CylinderShape__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:720:1: ( ( '{' ) )
            // InternalTutorial.g:721:1: ( '{' )
            {
            // InternalTutorial.g:721:1: ( '{' )
            // InternalTutorial.g:722:2: '{'
            {
             before(grammarAccess.getCylinderShapeAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getCylinderShapeAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__CylinderShape__Group__1__Impl"


    // $ANTLR start "rule__CylinderShape__Group__2"
    // InternalTutorial.g:731:1: rule__CylinderShape__Group__2 : rule__CylinderShape__Group__2__Impl rule__CylinderShape__Group__3 ;
    public final void rule__CylinderShape__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:735:1: ( rule__CylinderShape__Group__2__Impl rule__CylinderShape__Group__3 )
            // InternalTutorial.g:736:2: rule__CylinderShape__Group__2__Impl rule__CylinderShape__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__CylinderShape__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CylinderShape__Group__3();

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
    // $ANTLR end "rule__CylinderShape__Group__2"


    // $ANTLR start "rule__CylinderShape__Group__2__Impl"
    // InternalTutorial.g:743:1: rule__CylinderShape__Group__2__Impl : ( 'l' ) ;
    public final void rule__CylinderShape__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:747:1: ( ( 'l' ) )
            // InternalTutorial.g:748:1: ( 'l' )
            {
            // InternalTutorial.g:748:1: ( 'l' )
            // InternalTutorial.g:749:2: 'l'
            {
             before(grammarAccess.getCylinderShapeAccess().getLKeyword_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getCylinderShapeAccess().getLKeyword_2()); 

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
    // $ANTLR end "rule__CylinderShape__Group__2__Impl"


    // $ANTLR start "rule__CylinderShape__Group__3"
    // InternalTutorial.g:758:1: rule__CylinderShape__Group__3 : rule__CylinderShape__Group__3__Impl rule__CylinderShape__Group__4 ;
    public final void rule__CylinderShape__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:762:1: ( rule__CylinderShape__Group__3__Impl rule__CylinderShape__Group__4 )
            // InternalTutorial.g:763:2: rule__CylinderShape__Group__3__Impl rule__CylinderShape__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__CylinderShape__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CylinderShape__Group__4();

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
    // $ANTLR end "rule__CylinderShape__Group__3"


    // $ANTLR start "rule__CylinderShape__Group__3__Impl"
    // InternalTutorial.g:770:1: rule__CylinderShape__Group__3__Impl : ( ':' ) ;
    public final void rule__CylinderShape__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:774:1: ( ( ':' ) )
            // InternalTutorial.g:775:1: ( ':' )
            {
            // InternalTutorial.g:775:1: ( ':' )
            // InternalTutorial.g:776:2: ':'
            {
             before(grammarAccess.getCylinderShapeAccess().getColonKeyword_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getCylinderShapeAccess().getColonKeyword_3()); 

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
    // $ANTLR end "rule__CylinderShape__Group__3__Impl"


    // $ANTLR start "rule__CylinderShape__Group__4"
    // InternalTutorial.g:785:1: rule__CylinderShape__Group__4 : rule__CylinderShape__Group__4__Impl rule__CylinderShape__Group__5 ;
    public final void rule__CylinderShape__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:789:1: ( rule__CylinderShape__Group__4__Impl rule__CylinderShape__Group__5 )
            // InternalTutorial.g:790:2: rule__CylinderShape__Group__4__Impl rule__CylinderShape__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__CylinderShape__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CylinderShape__Group__5();

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
    // $ANTLR end "rule__CylinderShape__Group__4"


    // $ANTLR start "rule__CylinderShape__Group__4__Impl"
    // InternalTutorial.g:797:1: rule__CylinderShape__Group__4__Impl : ( ( rule__CylinderShape__LengthAssignment_4 ) ) ;
    public final void rule__CylinderShape__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:801:1: ( ( ( rule__CylinderShape__LengthAssignment_4 ) ) )
            // InternalTutorial.g:802:1: ( ( rule__CylinderShape__LengthAssignment_4 ) )
            {
            // InternalTutorial.g:802:1: ( ( rule__CylinderShape__LengthAssignment_4 ) )
            // InternalTutorial.g:803:2: ( rule__CylinderShape__LengthAssignment_4 )
            {
             before(grammarAccess.getCylinderShapeAccess().getLengthAssignment_4()); 
            // InternalTutorial.g:804:2: ( rule__CylinderShape__LengthAssignment_4 )
            // InternalTutorial.g:804:3: rule__CylinderShape__LengthAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__CylinderShape__LengthAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getCylinderShapeAccess().getLengthAssignment_4()); 

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
    // $ANTLR end "rule__CylinderShape__Group__4__Impl"


    // $ANTLR start "rule__CylinderShape__Group__5"
    // InternalTutorial.g:812:1: rule__CylinderShape__Group__5 : rule__CylinderShape__Group__5__Impl rule__CylinderShape__Group__6 ;
    public final void rule__CylinderShape__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:816:1: ( rule__CylinderShape__Group__5__Impl rule__CylinderShape__Group__6 )
            // InternalTutorial.g:817:2: rule__CylinderShape__Group__5__Impl rule__CylinderShape__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__CylinderShape__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CylinderShape__Group__6();

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
    // $ANTLR end "rule__CylinderShape__Group__5"


    // $ANTLR start "rule__CylinderShape__Group__5__Impl"
    // InternalTutorial.g:824:1: rule__CylinderShape__Group__5__Impl : ( 'cm' ) ;
    public final void rule__CylinderShape__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:828:1: ( ( 'cm' ) )
            // InternalTutorial.g:829:1: ( 'cm' )
            {
            // InternalTutorial.g:829:1: ( 'cm' )
            // InternalTutorial.g:830:2: 'cm'
            {
             before(grammarAccess.getCylinderShapeAccess().getCmKeyword_5()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getCylinderShapeAccess().getCmKeyword_5()); 

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
    // $ANTLR end "rule__CylinderShape__Group__5__Impl"


    // $ANTLR start "rule__CylinderShape__Group__6"
    // InternalTutorial.g:839:1: rule__CylinderShape__Group__6 : rule__CylinderShape__Group__6__Impl rule__CylinderShape__Group__7 ;
    public final void rule__CylinderShape__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:843:1: ( rule__CylinderShape__Group__6__Impl rule__CylinderShape__Group__7 )
            // InternalTutorial.g:844:2: rule__CylinderShape__Group__6__Impl rule__CylinderShape__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__CylinderShape__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CylinderShape__Group__7();

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
    // $ANTLR end "rule__CylinderShape__Group__6"


    // $ANTLR start "rule__CylinderShape__Group__6__Impl"
    // InternalTutorial.g:851:1: rule__CylinderShape__Group__6__Impl : ( 'r' ) ;
    public final void rule__CylinderShape__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:855:1: ( ( 'r' ) )
            // InternalTutorial.g:856:1: ( 'r' )
            {
            // InternalTutorial.g:856:1: ( 'r' )
            // InternalTutorial.g:857:2: 'r'
            {
             before(grammarAccess.getCylinderShapeAccess().getRKeyword_6()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getCylinderShapeAccess().getRKeyword_6()); 

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
    // $ANTLR end "rule__CylinderShape__Group__6__Impl"


    // $ANTLR start "rule__CylinderShape__Group__7"
    // InternalTutorial.g:866:1: rule__CylinderShape__Group__7 : rule__CylinderShape__Group__7__Impl rule__CylinderShape__Group__8 ;
    public final void rule__CylinderShape__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:870:1: ( rule__CylinderShape__Group__7__Impl rule__CylinderShape__Group__8 )
            // InternalTutorial.g:871:2: rule__CylinderShape__Group__7__Impl rule__CylinderShape__Group__8
            {
            pushFollow(FOLLOW_10);
            rule__CylinderShape__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CylinderShape__Group__8();

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
    // $ANTLR end "rule__CylinderShape__Group__7"


    // $ANTLR start "rule__CylinderShape__Group__7__Impl"
    // InternalTutorial.g:878:1: rule__CylinderShape__Group__7__Impl : ( ':' ) ;
    public final void rule__CylinderShape__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:882:1: ( ( ':' ) )
            // InternalTutorial.g:883:1: ( ':' )
            {
            // InternalTutorial.g:883:1: ( ':' )
            // InternalTutorial.g:884:2: ':'
            {
             before(grammarAccess.getCylinderShapeAccess().getColonKeyword_7()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getCylinderShapeAccess().getColonKeyword_7()); 

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
    // $ANTLR end "rule__CylinderShape__Group__7__Impl"


    // $ANTLR start "rule__CylinderShape__Group__8"
    // InternalTutorial.g:893:1: rule__CylinderShape__Group__8 : rule__CylinderShape__Group__8__Impl rule__CylinderShape__Group__9 ;
    public final void rule__CylinderShape__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:897:1: ( rule__CylinderShape__Group__8__Impl rule__CylinderShape__Group__9 )
            // InternalTutorial.g:898:2: rule__CylinderShape__Group__8__Impl rule__CylinderShape__Group__9
            {
            pushFollow(FOLLOW_11);
            rule__CylinderShape__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CylinderShape__Group__9();

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
    // $ANTLR end "rule__CylinderShape__Group__8"


    // $ANTLR start "rule__CylinderShape__Group__8__Impl"
    // InternalTutorial.g:905:1: rule__CylinderShape__Group__8__Impl : ( ( rule__CylinderShape__RadiusAssignment_8 ) ) ;
    public final void rule__CylinderShape__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:909:1: ( ( ( rule__CylinderShape__RadiusAssignment_8 ) ) )
            // InternalTutorial.g:910:1: ( ( rule__CylinderShape__RadiusAssignment_8 ) )
            {
            // InternalTutorial.g:910:1: ( ( rule__CylinderShape__RadiusAssignment_8 ) )
            // InternalTutorial.g:911:2: ( rule__CylinderShape__RadiusAssignment_8 )
            {
             before(grammarAccess.getCylinderShapeAccess().getRadiusAssignment_8()); 
            // InternalTutorial.g:912:2: ( rule__CylinderShape__RadiusAssignment_8 )
            // InternalTutorial.g:912:3: rule__CylinderShape__RadiusAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__CylinderShape__RadiusAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getCylinderShapeAccess().getRadiusAssignment_8()); 

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
    // $ANTLR end "rule__CylinderShape__Group__8__Impl"


    // $ANTLR start "rule__CylinderShape__Group__9"
    // InternalTutorial.g:920:1: rule__CylinderShape__Group__9 : rule__CylinderShape__Group__9__Impl rule__CylinderShape__Group__10 ;
    public final void rule__CylinderShape__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:924:1: ( rule__CylinderShape__Group__9__Impl rule__CylinderShape__Group__10 )
            // InternalTutorial.g:925:2: rule__CylinderShape__Group__9__Impl rule__CylinderShape__Group__10
            {
            pushFollow(FOLLOW_6);
            rule__CylinderShape__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CylinderShape__Group__10();

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
    // $ANTLR end "rule__CylinderShape__Group__9"


    // $ANTLR start "rule__CylinderShape__Group__9__Impl"
    // InternalTutorial.g:932:1: rule__CylinderShape__Group__9__Impl : ( 'cm' ) ;
    public final void rule__CylinderShape__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:936:1: ( ( 'cm' ) )
            // InternalTutorial.g:937:1: ( 'cm' )
            {
            // InternalTutorial.g:937:1: ( 'cm' )
            // InternalTutorial.g:938:2: 'cm'
            {
             before(grammarAccess.getCylinderShapeAccess().getCmKeyword_9()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getCylinderShapeAccess().getCmKeyword_9()); 

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
    // $ANTLR end "rule__CylinderShape__Group__9__Impl"


    // $ANTLR start "rule__CylinderShape__Group__10"
    // InternalTutorial.g:947:1: rule__CylinderShape__Group__10 : rule__CylinderShape__Group__10__Impl ;
    public final void rule__CylinderShape__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:951:1: ( rule__CylinderShape__Group__10__Impl )
            // InternalTutorial.g:952:2: rule__CylinderShape__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CylinderShape__Group__10__Impl();

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
    // $ANTLR end "rule__CylinderShape__Group__10"


    // $ANTLR start "rule__CylinderShape__Group__10__Impl"
    // InternalTutorial.g:958:1: rule__CylinderShape__Group__10__Impl : ( '}' ) ;
    public final void rule__CylinderShape__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:962:1: ( ( '}' ) )
            // InternalTutorial.g:963:1: ( '}' )
            {
            // InternalTutorial.g:963:1: ( '}' )
            // InternalTutorial.g:964:2: '}'
            {
             before(grammarAccess.getCylinderShapeAccess().getRightCurlyBracketKeyword_10()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getCylinderShapeAccess().getRightCurlyBracketKeyword_10()); 

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
    // $ANTLR end "rule__CylinderShape__Group__10__Impl"


    // $ANTLR start "rule__BlockShape__Group__0"
    // InternalTutorial.g:974:1: rule__BlockShape__Group__0 : rule__BlockShape__Group__0__Impl rule__BlockShape__Group__1 ;
    public final void rule__BlockShape__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:978:1: ( rule__BlockShape__Group__0__Impl rule__BlockShape__Group__1 )
            // InternalTutorial.g:979:2: rule__BlockShape__Group__0__Impl rule__BlockShape__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__BlockShape__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BlockShape__Group__1();

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
    // $ANTLR end "rule__BlockShape__Group__0"


    // $ANTLR start "rule__BlockShape__Group__0__Impl"
    // InternalTutorial.g:986:1: rule__BlockShape__Group__0__Impl : ( 'BlockShape' ) ;
    public final void rule__BlockShape__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:990:1: ( ( 'BlockShape' ) )
            // InternalTutorial.g:991:1: ( 'BlockShape' )
            {
            // InternalTutorial.g:991:1: ( 'BlockShape' )
            // InternalTutorial.g:992:2: 'BlockShape'
            {
             before(grammarAccess.getBlockShapeAccess().getBlockShapeKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getBlockShapeAccess().getBlockShapeKeyword_0()); 

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
    // $ANTLR end "rule__BlockShape__Group__0__Impl"


    // $ANTLR start "rule__BlockShape__Group__1"
    // InternalTutorial.g:1001:1: rule__BlockShape__Group__1 : rule__BlockShape__Group__1__Impl rule__BlockShape__Group__2 ;
    public final void rule__BlockShape__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1005:1: ( rule__BlockShape__Group__1__Impl rule__BlockShape__Group__2 )
            // InternalTutorial.g:1006:2: rule__BlockShape__Group__1__Impl rule__BlockShape__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__BlockShape__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BlockShape__Group__2();

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
    // $ANTLR end "rule__BlockShape__Group__1"


    // $ANTLR start "rule__BlockShape__Group__1__Impl"
    // InternalTutorial.g:1013:1: rule__BlockShape__Group__1__Impl : ( '{' ) ;
    public final void rule__BlockShape__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1017:1: ( ( '{' ) )
            // InternalTutorial.g:1018:1: ( '{' )
            {
            // InternalTutorial.g:1018:1: ( '{' )
            // InternalTutorial.g:1019:2: '{'
            {
             before(grammarAccess.getBlockShapeAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getBlockShapeAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__BlockShape__Group__1__Impl"


    // $ANTLR start "rule__BlockShape__Group__2"
    // InternalTutorial.g:1028:1: rule__BlockShape__Group__2 : rule__BlockShape__Group__2__Impl rule__BlockShape__Group__3 ;
    public final void rule__BlockShape__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1032:1: ( rule__BlockShape__Group__2__Impl rule__BlockShape__Group__3 )
            // InternalTutorial.g:1033:2: rule__BlockShape__Group__2__Impl rule__BlockShape__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__BlockShape__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BlockShape__Group__3();

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
    // $ANTLR end "rule__BlockShape__Group__2"


    // $ANTLR start "rule__BlockShape__Group__2__Impl"
    // InternalTutorial.g:1040:1: rule__BlockShape__Group__2__Impl : ( 'l' ) ;
    public final void rule__BlockShape__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1044:1: ( ( 'l' ) )
            // InternalTutorial.g:1045:1: ( 'l' )
            {
            // InternalTutorial.g:1045:1: ( 'l' )
            // InternalTutorial.g:1046:2: 'l'
            {
             before(grammarAccess.getBlockShapeAccess().getLKeyword_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getBlockShapeAccess().getLKeyword_2()); 

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
    // $ANTLR end "rule__BlockShape__Group__2__Impl"


    // $ANTLR start "rule__BlockShape__Group__3"
    // InternalTutorial.g:1055:1: rule__BlockShape__Group__3 : rule__BlockShape__Group__3__Impl rule__BlockShape__Group__4 ;
    public final void rule__BlockShape__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1059:1: ( rule__BlockShape__Group__3__Impl rule__BlockShape__Group__4 )
            // InternalTutorial.g:1060:2: rule__BlockShape__Group__3__Impl rule__BlockShape__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__BlockShape__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BlockShape__Group__4();

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
    // $ANTLR end "rule__BlockShape__Group__3"


    // $ANTLR start "rule__BlockShape__Group__3__Impl"
    // InternalTutorial.g:1067:1: rule__BlockShape__Group__3__Impl : ( ':' ) ;
    public final void rule__BlockShape__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1071:1: ( ( ':' ) )
            // InternalTutorial.g:1072:1: ( ':' )
            {
            // InternalTutorial.g:1072:1: ( ':' )
            // InternalTutorial.g:1073:2: ':'
            {
             before(grammarAccess.getBlockShapeAccess().getColonKeyword_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getBlockShapeAccess().getColonKeyword_3()); 

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
    // $ANTLR end "rule__BlockShape__Group__3__Impl"


    // $ANTLR start "rule__BlockShape__Group__4"
    // InternalTutorial.g:1082:1: rule__BlockShape__Group__4 : rule__BlockShape__Group__4__Impl rule__BlockShape__Group__5 ;
    public final void rule__BlockShape__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1086:1: ( rule__BlockShape__Group__4__Impl rule__BlockShape__Group__5 )
            // InternalTutorial.g:1087:2: rule__BlockShape__Group__4__Impl rule__BlockShape__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__BlockShape__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BlockShape__Group__5();

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
    // $ANTLR end "rule__BlockShape__Group__4"


    // $ANTLR start "rule__BlockShape__Group__4__Impl"
    // InternalTutorial.g:1094:1: rule__BlockShape__Group__4__Impl : ( ( rule__BlockShape__LengthAssignment_4 ) ) ;
    public final void rule__BlockShape__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1098:1: ( ( ( rule__BlockShape__LengthAssignment_4 ) ) )
            // InternalTutorial.g:1099:1: ( ( rule__BlockShape__LengthAssignment_4 ) )
            {
            // InternalTutorial.g:1099:1: ( ( rule__BlockShape__LengthAssignment_4 ) )
            // InternalTutorial.g:1100:2: ( rule__BlockShape__LengthAssignment_4 )
            {
             before(grammarAccess.getBlockShapeAccess().getLengthAssignment_4()); 
            // InternalTutorial.g:1101:2: ( rule__BlockShape__LengthAssignment_4 )
            // InternalTutorial.g:1101:3: rule__BlockShape__LengthAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__BlockShape__LengthAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getBlockShapeAccess().getLengthAssignment_4()); 

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
    // $ANTLR end "rule__BlockShape__Group__4__Impl"


    // $ANTLR start "rule__BlockShape__Group__5"
    // InternalTutorial.g:1109:1: rule__BlockShape__Group__5 : rule__BlockShape__Group__5__Impl rule__BlockShape__Group__6 ;
    public final void rule__BlockShape__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1113:1: ( rule__BlockShape__Group__5__Impl rule__BlockShape__Group__6 )
            // InternalTutorial.g:1114:2: rule__BlockShape__Group__5__Impl rule__BlockShape__Group__6
            {
            pushFollow(FOLLOW_13);
            rule__BlockShape__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BlockShape__Group__6();

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
    // $ANTLR end "rule__BlockShape__Group__5"


    // $ANTLR start "rule__BlockShape__Group__5__Impl"
    // InternalTutorial.g:1121:1: rule__BlockShape__Group__5__Impl : ( 'cm' ) ;
    public final void rule__BlockShape__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1125:1: ( ( 'cm' ) )
            // InternalTutorial.g:1126:1: ( 'cm' )
            {
            // InternalTutorial.g:1126:1: ( 'cm' )
            // InternalTutorial.g:1127:2: 'cm'
            {
             before(grammarAccess.getBlockShapeAccess().getCmKeyword_5()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getBlockShapeAccess().getCmKeyword_5()); 

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
    // $ANTLR end "rule__BlockShape__Group__5__Impl"


    // $ANTLR start "rule__BlockShape__Group__6"
    // InternalTutorial.g:1136:1: rule__BlockShape__Group__6 : rule__BlockShape__Group__6__Impl rule__BlockShape__Group__7 ;
    public final void rule__BlockShape__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1140:1: ( rule__BlockShape__Group__6__Impl rule__BlockShape__Group__7 )
            // InternalTutorial.g:1141:2: rule__BlockShape__Group__6__Impl rule__BlockShape__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__BlockShape__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BlockShape__Group__7();

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
    // $ANTLR end "rule__BlockShape__Group__6"


    // $ANTLR start "rule__BlockShape__Group__6__Impl"
    // InternalTutorial.g:1148:1: rule__BlockShape__Group__6__Impl : ( 'w' ) ;
    public final void rule__BlockShape__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1152:1: ( ( 'w' ) )
            // InternalTutorial.g:1153:1: ( 'w' )
            {
            // InternalTutorial.g:1153:1: ( 'w' )
            // InternalTutorial.g:1154:2: 'w'
            {
             before(grammarAccess.getBlockShapeAccess().getWKeyword_6()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getBlockShapeAccess().getWKeyword_6()); 

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
    // $ANTLR end "rule__BlockShape__Group__6__Impl"


    // $ANTLR start "rule__BlockShape__Group__7"
    // InternalTutorial.g:1163:1: rule__BlockShape__Group__7 : rule__BlockShape__Group__7__Impl rule__BlockShape__Group__8 ;
    public final void rule__BlockShape__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1167:1: ( rule__BlockShape__Group__7__Impl rule__BlockShape__Group__8 )
            // InternalTutorial.g:1168:2: rule__BlockShape__Group__7__Impl rule__BlockShape__Group__8
            {
            pushFollow(FOLLOW_10);
            rule__BlockShape__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BlockShape__Group__8();

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
    // $ANTLR end "rule__BlockShape__Group__7"


    // $ANTLR start "rule__BlockShape__Group__7__Impl"
    // InternalTutorial.g:1175:1: rule__BlockShape__Group__7__Impl : ( ':' ) ;
    public final void rule__BlockShape__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1179:1: ( ( ':' ) )
            // InternalTutorial.g:1180:1: ( ':' )
            {
            // InternalTutorial.g:1180:1: ( ':' )
            // InternalTutorial.g:1181:2: ':'
            {
             before(grammarAccess.getBlockShapeAccess().getColonKeyword_7()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getBlockShapeAccess().getColonKeyword_7()); 

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
    // $ANTLR end "rule__BlockShape__Group__7__Impl"


    // $ANTLR start "rule__BlockShape__Group__8"
    // InternalTutorial.g:1190:1: rule__BlockShape__Group__8 : rule__BlockShape__Group__8__Impl rule__BlockShape__Group__9 ;
    public final void rule__BlockShape__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1194:1: ( rule__BlockShape__Group__8__Impl rule__BlockShape__Group__9 )
            // InternalTutorial.g:1195:2: rule__BlockShape__Group__8__Impl rule__BlockShape__Group__9
            {
            pushFollow(FOLLOW_11);
            rule__BlockShape__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BlockShape__Group__9();

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
    // $ANTLR end "rule__BlockShape__Group__8"


    // $ANTLR start "rule__BlockShape__Group__8__Impl"
    // InternalTutorial.g:1202:1: rule__BlockShape__Group__8__Impl : ( ( rule__BlockShape__WidthAssignment_8 ) ) ;
    public final void rule__BlockShape__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1206:1: ( ( ( rule__BlockShape__WidthAssignment_8 ) ) )
            // InternalTutorial.g:1207:1: ( ( rule__BlockShape__WidthAssignment_8 ) )
            {
            // InternalTutorial.g:1207:1: ( ( rule__BlockShape__WidthAssignment_8 ) )
            // InternalTutorial.g:1208:2: ( rule__BlockShape__WidthAssignment_8 )
            {
             before(grammarAccess.getBlockShapeAccess().getWidthAssignment_8()); 
            // InternalTutorial.g:1209:2: ( rule__BlockShape__WidthAssignment_8 )
            // InternalTutorial.g:1209:3: rule__BlockShape__WidthAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__BlockShape__WidthAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getBlockShapeAccess().getWidthAssignment_8()); 

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
    // $ANTLR end "rule__BlockShape__Group__8__Impl"


    // $ANTLR start "rule__BlockShape__Group__9"
    // InternalTutorial.g:1217:1: rule__BlockShape__Group__9 : rule__BlockShape__Group__9__Impl rule__BlockShape__Group__10 ;
    public final void rule__BlockShape__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1221:1: ( rule__BlockShape__Group__9__Impl rule__BlockShape__Group__10 )
            // InternalTutorial.g:1222:2: rule__BlockShape__Group__9__Impl rule__BlockShape__Group__10
            {
            pushFollow(FOLLOW_14);
            rule__BlockShape__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BlockShape__Group__10();

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
    // $ANTLR end "rule__BlockShape__Group__9"


    // $ANTLR start "rule__BlockShape__Group__9__Impl"
    // InternalTutorial.g:1229:1: rule__BlockShape__Group__9__Impl : ( 'cm' ) ;
    public final void rule__BlockShape__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1233:1: ( ( 'cm' ) )
            // InternalTutorial.g:1234:1: ( 'cm' )
            {
            // InternalTutorial.g:1234:1: ( 'cm' )
            // InternalTutorial.g:1235:2: 'cm'
            {
             before(grammarAccess.getBlockShapeAccess().getCmKeyword_9()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getBlockShapeAccess().getCmKeyword_9()); 

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
    // $ANTLR end "rule__BlockShape__Group__9__Impl"


    // $ANTLR start "rule__BlockShape__Group__10"
    // InternalTutorial.g:1244:1: rule__BlockShape__Group__10 : rule__BlockShape__Group__10__Impl rule__BlockShape__Group__11 ;
    public final void rule__BlockShape__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1248:1: ( rule__BlockShape__Group__10__Impl rule__BlockShape__Group__11 )
            // InternalTutorial.g:1249:2: rule__BlockShape__Group__10__Impl rule__BlockShape__Group__11
            {
            pushFollow(FOLLOW_9);
            rule__BlockShape__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BlockShape__Group__11();

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
    // $ANTLR end "rule__BlockShape__Group__10"


    // $ANTLR start "rule__BlockShape__Group__10__Impl"
    // InternalTutorial.g:1256:1: rule__BlockShape__Group__10__Impl : ( 'h' ) ;
    public final void rule__BlockShape__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1260:1: ( ( 'h' ) )
            // InternalTutorial.g:1261:1: ( 'h' )
            {
            // InternalTutorial.g:1261:1: ( 'h' )
            // InternalTutorial.g:1262:2: 'h'
            {
             before(grammarAccess.getBlockShapeAccess().getHKeyword_10()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getBlockShapeAccess().getHKeyword_10()); 

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
    // $ANTLR end "rule__BlockShape__Group__10__Impl"


    // $ANTLR start "rule__BlockShape__Group__11"
    // InternalTutorial.g:1271:1: rule__BlockShape__Group__11 : rule__BlockShape__Group__11__Impl rule__BlockShape__Group__12 ;
    public final void rule__BlockShape__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1275:1: ( rule__BlockShape__Group__11__Impl rule__BlockShape__Group__12 )
            // InternalTutorial.g:1276:2: rule__BlockShape__Group__11__Impl rule__BlockShape__Group__12
            {
            pushFollow(FOLLOW_10);
            rule__BlockShape__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BlockShape__Group__12();

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
    // $ANTLR end "rule__BlockShape__Group__11"


    // $ANTLR start "rule__BlockShape__Group__11__Impl"
    // InternalTutorial.g:1283:1: rule__BlockShape__Group__11__Impl : ( ':' ) ;
    public final void rule__BlockShape__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1287:1: ( ( ':' ) )
            // InternalTutorial.g:1288:1: ( ':' )
            {
            // InternalTutorial.g:1288:1: ( ':' )
            // InternalTutorial.g:1289:2: ':'
            {
             before(grammarAccess.getBlockShapeAccess().getColonKeyword_11()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getBlockShapeAccess().getColonKeyword_11()); 

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
    // $ANTLR end "rule__BlockShape__Group__11__Impl"


    // $ANTLR start "rule__BlockShape__Group__12"
    // InternalTutorial.g:1298:1: rule__BlockShape__Group__12 : rule__BlockShape__Group__12__Impl rule__BlockShape__Group__13 ;
    public final void rule__BlockShape__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1302:1: ( rule__BlockShape__Group__12__Impl rule__BlockShape__Group__13 )
            // InternalTutorial.g:1303:2: rule__BlockShape__Group__12__Impl rule__BlockShape__Group__13
            {
            pushFollow(FOLLOW_11);
            rule__BlockShape__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BlockShape__Group__13();

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
    // $ANTLR end "rule__BlockShape__Group__12"


    // $ANTLR start "rule__BlockShape__Group__12__Impl"
    // InternalTutorial.g:1310:1: rule__BlockShape__Group__12__Impl : ( ( rule__BlockShape__HeigthAssignment_12 ) ) ;
    public final void rule__BlockShape__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1314:1: ( ( ( rule__BlockShape__HeigthAssignment_12 ) ) )
            // InternalTutorial.g:1315:1: ( ( rule__BlockShape__HeigthAssignment_12 ) )
            {
            // InternalTutorial.g:1315:1: ( ( rule__BlockShape__HeigthAssignment_12 ) )
            // InternalTutorial.g:1316:2: ( rule__BlockShape__HeigthAssignment_12 )
            {
             before(grammarAccess.getBlockShapeAccess().getHeigthAssignment_12()); 
            // InternalTutorial.g:1317:2: ( rule__BlockShape__HeigthAssignment_12 )
            // InternalTutorial.g:1317:3: rule__BlockShape__HeigthAssignment_12
            {
            pushFollow(FOLLOW_2);
            rule__BlockShape__HeigthAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getBlockShapeAccess().getHeigthAssignment_12()); 

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
    // $ANTLR end "rule__BlockShape__Group__12__Impl"


    // $ANTLR start "rule__BlockShape__Group__13"
    // InternalTutorial.g:1325:1: rule__BlockShape__Group__13 : rule__BlockShape__Group__13__Impl rule__BlockShape__Group__14 ;
    public final void rule__BlockShape__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1329:1: ( rule__BlockShape__Group__13__Impl rule__BlockShape__Group__14 )
            // InternalTutorial.g:1330:2: rule__BlockShape__Group__13__Impl rule__BlockShape__Group__14
            {
            pushFollow(FOLLOW_6);
            rule__BlockShape__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BlockShape__Group__14();

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
    // $ANTLR end "rule__BlockShape__Group__13"


    // $ANTLR start "rule__BlockShape__Group__13__Impl"
    // InternalTutorial.g:1337:1: rule__BlockShape__Group__13__Impl : ( 'cm' ) ;
    public final void rule__BlockShape__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1341:1: ( ( 'cm' ) )
            // InternalTutorial.g:1342:1: ( 'cm' )
            {
            // InternalTutorial.g:1342:1: ( 'cm' )
            // InternalTutorial.g:1343:2: 'cm'
            {
             before(grammarAccess.getBlockShapeAccess().getCmKeyword_13()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getBlockShapeAccess().getCmKeyword_13()); 

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
    // $ANTLR end "rule__BlockShape__Group__13__Impl"


    // $ANTLR start "rule__BlockShape__Group__14"
    // InternalTutorial.g:1352:1: rule__BlockShape__Group__14 : rule__BlockShape__Group__14__Impl ;
    public final void rule__BlockShape__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1356:1: ( rule__BlockShape__Group__14__Impl )
            // InternalTutorial.g:1357:2: rule__BlockShape__Group__14__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BlockShape__Group__14__Impl();

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
    // $ANTLR end "rule__BlockShape__Group__14"


    // $ANTLR start "rule__BlockShape__Group__14__Impl"
    // InternalTutorial.g:1363:1: rule__BlockShape__Group__14__Impl : ( '}' ) ;
    public final void rule__BlockShape__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1367:1: ( ( '}' ) )
            // InternalTutorial.g:1368:1: ( '}' )
            {
            // InternalTutorial.g:1368:1: ( '}' )
            // InternalTutorial.g:1369:2: '}'
            {
             before(grammarAccess.getBlockShapeAccess().getRightCurlyBracketKeyword_14()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getBlockShapeAccess().getRightCurlyBracketKeyword_14()); 

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
    // $ANTLR end "rule__BlockShape__Group__14__Impl"


    // $ANTLR start "rule__BasicItemType__Group__0"
    // InternalTutorial.g:1379:1: rule__BasicItemType__Group__0 : rule__BasicItemType__Group__0__Impl rule__BasicItemType__Group__1 ;
    public final void rule__BasicItemType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1383:1: ( rule__BasicItemType__Group__0__Impl rule__BasicItemType__Group__1 )
            // InternalTutorial.g:1384:2: rule__BasicItemType__Group__0__Impl rule__BasicItemType__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalTutorial.g:1391:1: rule__BasicItemType__Group__0__Impl : ( 'basicItemType' ) ;
    public final void rule__BasicItemType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1395:1: ( ( 'basicItemType' ) )
            // InternalTutorial.g:1396:1: ( 'basicItemType' )
            {
            // InternalTutorial.g:1396:1: ( 'basicItemType' )
            // InternalTutorial.g:1397:2: 'basicItemType'
            {
             before(grammarAccess.getBasicItemTypeAccess().getBasicItemTypeKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getBasicItemTypeAccess().getBasicItemTypeKeyword_0()); 

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
    // $ANTLR end "rule__BasicItemType__Group__0__Impl"


    // $ANTLR start "rule__BasicItemType__Group__1"
    // InternalTutorial.g:1406:1: rule__BasicItemType__Group__1 : rule__BasicItemType__Group__1__Impl rule__BasicItemType__Group__2 ;
    public final void rule__BasicItemType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1410:1: ( rule__BasicItemType__Group__1__Impl rule__BasicItemType__Group__2 )
            // InternalTutorial.g:1411:2: rule__BasicItemType__Group__1__Impl rule__BasicItemType__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalTutorial.g:1418:1: rule__BasicItemType__Group__1__Impl : ( ( rule__BasicItemType__NameAssignment_1 ) ) ;
    public final void rule__BasicItemType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1422:1: ( ( ( rule__BasicItemType__NameAssignment_1 ) ) )
            // InternalTutorial.g:1423:1: ( ( rule__BasicItemType__NameAssignment_1 ) )
            {
            // InternalTutorial.g:1423:1: ( ( rule__BasicItemType__NameAssignment_1 ) )
            // InternalTutorial.g:1424:2: ( rule__BasicItemType__NameAssignment_1 )
            {
             before(grammarAccess.getBasicItemTypeAccess().getNameAssignment_1()); 
            // InternalTutorial.g:1425:2: ( rule__BasicItemType__NameAssignment_1 )
            // InternalTutorial.g:1425:3: rule__BasicItemType__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__BasicItemType__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBasicItemTypeAccess().getNameAssignment_1()); 

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
    // InternalTutorial.g:1433:1: rule__BasicItemType__Group__2 : rule__BasicItemType__Group__2__Impl rule__BasicItemType__Group__3 ;
    public final void rule__BasicItemType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1437:1: ( rule__BasicItemType__Group__2__Impl rule__BasicItemType__Group__3 )
            // InternalTutorial.g:1438:2: rule__BasicItemType__Group__2__Impl rule__BasicItemType__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__BasicItemType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BasicItemType__Group__3();

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
    // InternalTutorial.g:1445:1: rule__BasicItemType__Group__2__Impl : ( '(' ) ;
    public final void rule__BasicItemType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1449:1: ( ( '(' ) )
            // InternalTutorial.g:1450:1: ( '(' )
            {
            // InternalTutorial.g:1450:1: ( '(' )
            // InternalTutorial.g:1451:2: '('
            {
             before(grammarAccess.getBasicItemTypeAccess().getLeftParenthesisKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getBasicItemTypeAccess().getLeftParenthesisKeyword_2()); 

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


    // $ANTLR start "rule__BasicItemType__Group__3"
    // InternalTutorial.g:1460:1: rule__BasicItemType__Group__3 : rule__BasicItemType__Group__3__Impl rule__BasicItemType__Group__4 ;
    public final void rule__BasicItemType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1464:1: ( rule__BasicItemType__Group__3__Impl rule__BasicItemType__Group__4 )
            // InternalTutorial.g:1465:2: rule__BasicItemType__Group__3__Impl rule__BasicItemType__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__BasicItemType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BasicItemType__Group__4();

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
    // $ANTLR end "rule__BasicItemType__Group__3"


    // $ANTLR start "rule__BasicItemType__Group__3__Impl"
    // InternalTutorial.g:1472:1: rule__BasicItemType__Group__3__Impl : ( ( rule__BasicItemType__MaterialAssignment_3 ) ) ;
    public final void rule__BasicItemType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1476:1: ( ( ( rule__BasicItemType__MaterialAssignment_3 ) ) )
            // InternalTutorial.g:1477:1: ( ( rule__BasicItemType__MaterialAssignment_3 ) )
            {
            // InternalTutorial.g:1477:1: ( ( rule__BasicItemType__MaterialAssignment_3 ) )
            // InternalTutorial.g:1478:2: ( rule__BasicItemType__MaterialAssignment_3 )
            {
             before(grammarAccess.getBasicItemTypeAccess().getMaterialAssignment_3()); 
            // InternalTutorial.g:1479:2: ( rule__BasicItemType__MaterialAssignment_3 )
            // InternalTutorial.g:1479:3: rule__BasicItemType__MaterialAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__BasicItemType__MaterialAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getBasicItemTypeAccess().getMaterialAssignment_3()); 

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
    // $ANTLR end "rule__BasicItemType__Group__3__Impl"


    // $ANTLR start "rule__BasicItemType__Group__4"
    // InternalTutorial.g:1487:1: rule__BasicItemType__Group__4 : rule__BasicItemType__Group__4__Impl rule__BasicItemType__Group__5 ;
    public final void rule__BasicItemType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1491:1: ( rule__BasicItemType__Group__4__Impl rule__BasicItemType__Group__5 )
            // InternalTutorial.g:1492:2: rule__BasicItemType__Group__4__Impl rule__BasicItemType__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__BasicItemType__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BasicItemType__Group__5();

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
    // $ANTLR end "rule__BasicItemType__Group__4"


    // $ANTLR start "rule__BasicItemType__Group__4__Impl"
    // InternalTutorial.g:1499:1: rule__BasicItemType__Group__4__Impl : ( ')' ) ;
    public final void rule__BasicItemType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1503:1: ( ( ')' ) )
            // InternalTutorial.g:1504:1: ( ')' )
            {
            // InternalTutorial.g:1504:1: ( ')' )
            // InternalTutorial.g:1505:2: ')'
            {
             before(grammarAccess.getBasicItemTypeAccess().getRightParenthesisKeyword_4()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getBasicItemTypeAccess().getRightParenthesisKeyword_4()); 

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
    // $ANTLR end "rule__BasicItemType__Group__4__Impl"


    // $ANTLR start "rule__BasicItemType__Group__5"
    // InternalTutorial.g:1514:1: rule__BasicItemType__Group__5 : rule__BasicItemType__Group__5__Impl rule__BasicItemType__Group__6 ;
    public final void rule__BasicItemType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1518:1: ( rule__BasicItemType__Group__5__Impl rule__BasicItemType__Group__6 )
            // InternalTutorial.g:1519:2: rule__BasicItemType__Group__5__Impl rule__BasicItemType__Group__6
            {
            pushFollow(FOLLOW_18);
            rule__BasicItemType__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BasicItemType__Group__6();

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
    // $ANTLR end "rule__BasicItemType__Group__5"


    // $ANTLR start "rule__BasicItemType__Group__5__Impl"
    // InternalTutorial.g:1526:1: rule__BasicItemType__Group__5__Impl : ( '{' ) ;
    public final void rule__BasicItemType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1530:1: ( ( '{' ) )
            // InternalTutorial.g:1531:1: ( '{' )
            {
            // InternalTutorial.g:1531:1: ( '{' )
            // InternalTutorial.g:1532:2: '{'
            {
             before(grammarAccess.getBasicItemTypeAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getBasicItemTypeAccess().getLeftCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__BasicItemType__Group__5__Impl"


    // $ANTLR start "rule__BasicItemType__Group__6"
    // InternalTutorial.g:1541:1: rule__BasicItemType__Group__6 : rule__BasicItemType__Group__6__Impl rule__BasicItemType__Group__7 ;
    public final void rule__BasicItemType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1545:1: ( rule__BasicItemType__Group__6__Impl rule__BasicItemType__Group__7 )
            // InternalTutorial.g:1546:2: rule__BasicItemType__Group__6__Impl rule__BasicItemType__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__BasicItemType__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BasicItemType__Group__7();

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
    // $ANTLR end "rule__BasicItemType__Group__6"


    // $ANTLR start "rule__BasicItemType__Group__6__Impl"
    // InternalTutorial.g:1553:1: rule__BasicItemType__Group__6__Impl : ( 'shape' ) ;
    public final void rule__BasicItemType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1557:1: ( ( 'shape' ) )
            // InternalTutorial.g:1558:1: ( 'shape' )
            {
            // InternalTutorial.g:1558:1: ( 'shape' )
            // InternalTutorial.g:1559:2: 'shape'
            {
             before(grammarAccess.getBasicItemTypeAccess().getShapeKeyword_6()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getBasicItemTypeAccess().getShapeKeyword_6()); 

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
    // $ANTLR end "rule__BasicItemType__Group__6__Impl"


    // $ANTLR start "rule__BasicItemType__Group__7"
    // InternalTutorial.g:1568:1: rule__BasicItemType__Group__7 : rule__BasicItemType__Group__7__Impl rule__BasicItemType__Group__8 ;
    public final void rule__BasicItemType__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1572:1: ( rule__BasicItemType__Group__7__Impl rule__BasicItemType__Group__8 )
            // InternalTutorial.g:1573:2: rule__BasicItemType__Group__7__Impl rule__BasicItemType__Group__8
            {
            pushFollow(FOLLOW_19);
            rule__BasicItemType__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BasicItemType__Group__8();

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
    // $ANTLR end "rule__BasicItemType__Group__7"


    // $ANTLR start "rule__BasicItemType__Group__7__Impl"
    // InternalTutorial.g:1580:1: rule__BasicItemType__Group__7__Impl : ( ':' ) ;
    public final void rule__BasicItemType__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1584:1: ( ( ':' ) )
            // InternalTutorial.g:1585:1: ( ':' )
            {
            // InternalTutorial.g:1585:1: ( ':' )
            // InternalTutorial.g:1586:2: ':'
            {
             before(grammarAccess.getBasicItemTypeAccess().getColonKeyword_7()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getBasicItemTypeAccess().getColonKeyword_7()); 

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
    // $ANTLR end "rule__BasicItemType__Group__7__Impl"


    // $ANTLR start "rule__BasicItemType__Group__8"
    // InternalTutorial.g:1595:1: rule__BasicItemType__Group__8 : rule__BasicItemType__Group__8__Impl rule__BasicItemType__Group__9 ;
    public final void rule__BasicItemType__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1599:1: ( rule__BasicItemType__Group__8__Impl rule__BasicItemType__Group__9 )
            // InternalTutorial.g:1600:2: rule__BasicItemType__Group__8__Impl rule__BasicItemType__Group__9
            {
            pushFollow(FOLLOW_20);
            rule__BasicItemType__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BasicItemType__Group__9();

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
    // $ANTLR end "rule__BasicItemType__Group__8"


    // $ANTLR start "rule__BasicItemType__Group__8__Impl"
    // InternalTutorial.g:1607:1: rule__BasicItemType__Group__8__Impl : ( ( rule__BasicItemType__ShapeAssignment_8 ) ) ;
    public final void rule__BasicItemType__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1611:1: ( ( ( rule__BasicItemType__ShapeAssignment_8 ) ) )
            // InternalTutorial.g:1612:1: ( ( rule__BasicItemType__ShapeAssignment_8 ) )
            {
            // InternalTutorial.g:1612:1: ( ( rule__BasicItemType__ShapeAssignment_8 ) )
            // InternalTutorial.g:1613:2: ( rule__BasicItemType__ShapeAssignment_8 )
            {
             before(grammarAccess.getBasicItemTypeAccess().getShapeAssignment_8()); 
            // InternalTutorial.g:1614:2: ( rule__BasicItemType__ShapeAssignment_8 )
            // InternalTutorial.g:1614:3: rule__BasicItemType__ShapeAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__BasicItemType__ShapeAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getBasicItemTypeAccess().getShapeAssignment_8()); 

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
    // $ANTLR end "rule__BasicItemType__Group__8__Impl"


    // $ANTLR start "rule__BasicItemType__Group__9"
    // InternalTutorial.g:1622:1: rule__BasicItemType__Group__9 : rule__BasicItemType__Group__9__Impl rule__BasicItemType__Group__10 ;
    public final void rule__BasicItemType__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1626:1: ( rule__BasicItemType__Group__9__Impl rule__BasicItemType__Group__10 )
            // InternalTutorial.g:1627:2: rule__BasicItemType__Group__9__Impl rule__BasicItemType__Group__10
            {
            pushFollow(FOLLOW_21);
            rule__BasicItemType__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BasicItemType__Group__10();

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
    // $ANTLR end "rule__BasicItemType__Group__9"


    // $ANTLR start "rule__BasicItemType__Group__9__Impl"
    // InternalTutorial.g:1634:1: rule__BasicItemType__Group__9__Impl : ( ( rule__BasicItemType__ColorAssignment_9 ) ) ;
    public final void rule__BasicItemType__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1638:1: ( ( ( rule__BasicItemType__ColorAssignment_9 ) ) )
            // InternalTutorial.g:1639:1: ( ( rule__BasicItemType__ColorAssignment_9 ) )
            {
            // InternalTutorial.g:1639:1: ( ( rule__BasicItemType__ColorAssignment_9 ) )
            // InternalTutorial.g:1640:2: ( rule__BasicItemType__ColorAssignment_9 )
            {
             before(grammarAccess.getBasicItemTypeAccess().getColorAssignment_9()); 
            // InternalTutorial.g:1641:2: ( rule__BasicItemType__ColorAssignment_9 )
            // InternalTutorial.g:1641:3: rule__BasicItemType__ColorAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__BasicItemType__ColorAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getBasicItemTypeAccess().getColorAssignment_9()); 

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
    // $ANTLR end "rule__BasicItemType__Group__9__Impl"


    // $ANTLR start "rule__BasicItemType__Group__10"
    // InternalTutorial.g:1649:1: rule__BasicItemType__Group__10 : rule__BasicItemType__Group__10__Impl rule__BasicItemType__Group__11 ;
    public final void rule__BasicItemType__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1653:1: ( rule__BasicItemType__Group__10__Impl rule__BasicItemType__Group__11 )
            // InternalTutorial.g:1654:2: rule__BasicItemType__Group__10__Impl rule__BasicItemType__Group__11
            {
            pushFollow(FOLLOW_21);
            rule__BasicItemType__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BasicItemType__Group__11();

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
    // $ANTLR end "rule__BasicItemType__Group__10"


    // $ANTLR start "rule__BasicItemType__Group__10__Impl"
    // InternalTutorial.g:1661:1: rule__BasicItemType__Group__10__Impl : ( ( rule__BasicItemType__Group_10__0 )? ) ;
    public final void rule__BasicItemType__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1665:1: ( ( ( rule__BasicItemType__Group_10__0 )? ) )
            // InternalTutorial.g:1666:1: ( ( rule__BasicItemType__Group_10__0 )? )
            {
            // InternalTutorial.g:1666:1: ( ( rule__BasicItemType__Group_10__0 )? )
            // InternalTutorial.g:1667:2: ( rule__BasicItemType__Group_10__0 )?
            {
             before(grammarAccess.getBasicItemTypeAccess().getGroup_10()); 
            // InternalTutorial.g:1668:2: ( rule__BasicItemType__Group_10__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==32) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalTutorial.g:1668:3: rule__BasicItemType__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BasicItemType__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBasicItemTypeAccess().getGroup_10()); 

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
    // $ANTLR end "rule__BasicItemType__Group__10__Impl"


    // $ANTLR start "rule__BasicItemType__Group__11"
    // InternalTutorial.g:1676:1: rule__BasicItemType__Group__11 : rule__BasicItemType__Group__11__Impl ;
    public final void rule__BasicItemType__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1680:1: ( rule__BasicItemType__Group__11__Impl )
            // InternalTutorial.g:1681:2: rule__BasicItemType__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BasicItemType__Group__11__Impl();

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
    // $ANTLR end "rule__BasicItemType__Group__11"


    // $ANTLR start "rule__BasicItemType__Group__11__Impl"
    // InternalTutorial.g:1687:1: rule__BasicItemType__Group__11__Impl : ( '}' ) ;
    public final void rule__BasicItemType__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1691:1: ( ( '}' ) )
            // InternalTutorial.g:1692:1: ( '}' )
            {
            // InternalTutorial.g:1692:1: ( '}' )
            // InternalTutorial.g:1693:2: '}'
            {
             before(grammarAccess.getBasicItemTypeAccess().getRightCurlyBracketKeyword_11()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getBasicItemTypeAccess().getRightCurlyBracketKeyword_11()); 

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
    // $ANTLR end "rule__BasicItemType__Group__11__Impl"


    // $ANTLR start "rule__BasicItemType__Group_10__0"
    // InternalTutorial.g:1703:1: rule__BasicItemType__Group_10__0 : rule__BasicItemType__Group_10__0__Impl rule__BasicItemType__Group_10__1 ;
    public final void rule__BasicItemType__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1707:1: ( rule__BasicItemType__Group_10__0__Impl rule__BasicItemType__Group_10__1 )
            // InternalTutorial.g:1708:2: rule__BasicItemType__Group_10__0__Impl rule__BasicItemType__Group_10__1
            {
            pushFollow(FOLLOW_9);
            rule__BasicItemType__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BasicItemType__Group_10__1();

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
    // $ANTLR end "rule__BasicItemType__Group_10__0"


    // $ANTLR start "rule__BasicItemType__Group_10__0__Impl"
    // InternalTutorial.g:1715:1: rule__BasicItemType__Group_10__0__Impl : ( 'markers' ) ;
    public final void rule__BasicItemType__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1719:1: ( ( 'markers' ) )
            // InternalTutorial.g:1720:1: ( 'markers' )
            {
            // InternalTutorial.g:1720:1: ( 'markers' )
            // InternalTutorial.g:1721:2: 'markers'
            {
             before(grammarAccess.getBasicItemTypeAccess().getMarkersKeyword_10_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getBasicItemTypeAccess().getMarkersKeyword_10_0()); 

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
    // $ANTLR end "rule__BasicItemType__Group_10__0__Impl"


    // $ANTLR start "rule__BasicItemType__Group_10__1"
    // InternalTutorial.g:1730:1: rule__BasicItemType__Group_10__1 : rule__BasicItemType__Group_10__1__Impl rule__BasicItemType__Group_10__2 ;
    public final void rule__BasicItemType__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1734:1: ( rule__BasicItemType__Group_10__1__Impl rule__BasicItemType__Group_10__2 )
            // InternalTutorial.g:1735:2: rule__BasicItemType__Group_10__1__Impl rule__BasicItemType__Group_10__2
            {
            pushFollow(FOLLOW_4);
            rule__BasicItemType__Group_10__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BasicItemType__Group_10__2();

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
    // $ANTLR end "rule__BasicItemType__Group_10__1"


    // $ANTLR start "rule__BasicItemType__Group_10__1__Impl"
    // InternalTutorial.g:1742:1: rule__BasicItemType__Group_10__1__Impl : ( ':' ) ;
    public final void rule__BasicItemType__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1746:1: ( ( ':' ) )
            // InternalTutorial.g:1747:1: ( ':' )
            {
            // InternalTutorial.g:1747:1: ( ':' )
            // InternalTutorial.g:1748:2: ':'
            {
             before(grammarAccess.getBasicItemTypeAccess().getColonKeyword_10_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getBasicItemTypeAccess().getColonKeyword_10_1()); 

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
    // $ANTLR end "rule__BasicItemType__Group_10__1__Impl"


    // $ANTLR start "rule__BasicItemType__Group_10__2"
    // InternalTutorial.g:1757:1: rule__BasicItemType__Group_10__2 : rule__BasicItemType__Group_10__2__Impl rule__BasicItemType__Group_10__3 ;
    public final void rule__BasicItemType__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1761:1: ( rule__BasicItemType__Group_10__2__Impl rule__BasicItemType__Group_10__3 )
            // InternalTutorial.g:1762:2: rule__BasicItemType__Group_10__2__Impl rule__BasicItemType__Group_10__3
            {
            pushFollow(FOLLOW_3);
            rule__BasicItemType__Group_10__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BasicItemType__Group_10__3();

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
    // $ANTLR end "rule__BasicItemType__Group_10__2"


    // $ANTLR start "rule__BasicItemType__Group_10__2__Impl"
    // InternalTutorial.g:1769:1: rule__BasicItemType__Group_10__2__Impl : ( '{' ) ;
    public final void rule__BasicItemType__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1773:1: ( ( '{' ) )
            // InternalTutorial.g:1774:1: ( '{' )
            {
            // InternalTutorial.g:1774:1: ( '{' )
            // InternalTutorial.g:1775:2: '{'
            {
             before(grammarAccess.getBasicItemTypeAccess().getLeftCurlyBracketKeyword_10_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getBasicItemTypeAccess().getLeftCurlyBracketKeyword_10_2()); 

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
    // $ANTLR end "rule__BasicItemType__Group_10__2__Impl"


    // $ANTLR start "rule__BasicItemType__Group_10__3"
    // InternalTutorial.g:1784:1: rule__BasicItemType__Group_10__3 : rule__BasicItemType__Group_10__3__Impl rule__BasicItemType__Group_10__4 ;
    public final void rule__BasicItemType__Group_10__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1788:1: ( rule__BasicItemType__Group_10__3__Impl rule__BasicItemType__Group_10__4 )
            // InternalTutorial.g:1789:2: rule__BasicItemType__Group_10__3__Impl rule__BasicItemType__Group_10__4
            {
            pushFollow(FOLLOW_6);
            rule__BasicItemType__Group_10__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BasicItemType__Group_10__4();

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
    // $ANTLR end "rule__BasicItemType__Group_10__3"


    // $ANTLR start "rule__BasicItemType__Group_10__3__Impl"
    // InternalTutorial.g:1796:1: rule__BasicItemType__Group_10__3__Impl : ( ( ( rule__BasicItemType__MarkersAssignment_10_3 ) ) ( ( rule__BasicItemType__MarkersAssignment_10_3 )* ) ) ;
    public final void rule__BasicItemType__Group_10__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1800:1: ( ( ( ( rule__BasicItemType__MarkersAssignment_10_3 ) ) ( ( rule__BasicItemType__MarkersAssignment_10_3 )* ) ) )
            // InternalTutorial.g:1801:1: ( ( ( rule__BasicItemType__MarkersAssignment_10_3 ) ) ( ( rule__BasicItemType__MarkersAssignment_10_3 )* ) )
            {
            // InternalTutorial.g:1801:1: ( ( ( rule__BasicItemType__MarkersAssignment_10_3 ) ) ( ( rule__BasicItemType__MarkersAssignment_10_3 )* ) )
            // InternalTutorial.g:1802:2: ( ( rule__BasicItemType__MarkersAssignment_10_3 ) ) ( ( rule__BasicItemType__MarkersAssignment_10_3 )* )
            {
            // InternalTutorial.g:1802:2: ( ( rule__BasicItemType__MarkersAssignment_10_3 ) )
            // InternalTutorial.g:1803:3: ( rule__BasicItemType__MarkersAssignment_10_3 )
            {
             before(grammarAccess.getBasicItemTypeAccess().getMarkersAssignment_10_3()); 
            // InternalTutorial.g:1804:3: ( rule__BasicItemType__MarkersAssignment_10_3 )
            // InternalTutorial.g:1804:4: rule__BasicItemType__MarkersAssignment_10_3
            {
            pushFollow(FOLLOW_22);
            rule__BasicItemType__MarkersAssignment_10_3();

            state._fsp--;


            }

             after(grammarAccess.getBasicItemTypeAccess().getMarkersAssignment_10_3()); 

            }

            // InternalTutorial.g:1807:2: ( ( rule__BasicItemType__MarkersAssignment_10_3 )* )
            // InternalTutorial.g:1808:3: ( rule__BasicItemType__MarkersAssignment_10_3 )*
            {
             before(grammarAccess.getBasicItemTypeAccess().getMarkersAssignment_10_3()); 
            // InternalTutorial.g:1809:3: ( rule__BasicItemType__MarkersAssignment_10_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalTutorial.g:1809:4: rule__BasicItemType__MarkersAssignment_10_3
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__BasicItemType__MarkersAssignment_10_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getBasicItemTypeAccess().getMarkersAssignment_10_3()); 

            }


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
    // $ANTLR end "rule__BasicItemType__Group_10__3__Impl"


    // $ANTLR start "rule__BasicItemType__Group_10__4"
    // InternalTutorial.g:1818:1: rule__BasicItemType__Group_10__4 : rule__BasicItemType__Group_10__4__Impl ;
    public final void rule__BasicItemType__Group_10__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1822:1: ( rule__BasicItemType__Group_10__4__Impl )
            // InternalTutorial.g:1823:2: rule__BasicItemType__Group_10__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BasicItemType__Group_10__4__Impl();

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
    // $ANTLR end "rule__BasicItemType__Group_10__4"


    // $ANTLR start "rule__BasicItemType__Group_10__4__Impl"
    // InternalTutorial.g:1829:1: rule__BasicItemType__Group_10__4__Impl : ( '}' ) ;
    public final void rule__BasicItemType__Group_10__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1833:1: ( ( '}' ) )
            // InternalTutorial.g:1834:1: ( '}' )
            {
            // InternalTutorial.g:1834:1: ( '}' )
            // InternalTutorial.g:1835:2: '}'
            {
             before(grammarAccess.getBasicItemTypeAccess().getRightCurlyBracketKeyword_10_4()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getBasicItemTypeAccess().getRightCurlyBracketKeyword_10_4()); 

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
    // $ANTLR end "rule__BasicItemType__Group_10__4__Impl"


    // $ANTLR start "rule__Color__Group__0"
    // InternalTutorial.g:1845:1: rule__Color__Group__0 : rule__Color__Group__0__Impl rule__Color__Group__1 ;
    public final void rule__Color__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1849:1: ( rule__Color__Group__0__Impl rule__Color__Group__1 )
            // InternalTutorial.g:1850:2: rule__Color__Group__0__Impl rule__Color__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__Color__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Color__Group__1();

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
    // $ANTLR end "rule__Color__Group__0"


    // $ANTLR start "rule__Color__Group__0__Impl"
    // InternalTutorial.g:1857:1: rule__Color__Group__0__Impl : ( 'color' ) ;
    public final void rule__Color__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1861:1: ( ( 'color' ) )
            // InternalTutorial.g:1862:1: ( 'color' )
            {
            // InternalTutorial.g:1862:1: ( 'color' )
            // InternalTutorial.g:1863:2: 'color'
            {
             before(grammarAccess.getColorAccess().getColorKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getColorAccess().getColorKeyword_0()); 

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
    // $ANTLR end "rule__Color__Group__0__Impl"


    // $ANTLR start "rule__Color__Group__1"
    // InternalTutorial.g:1872:1: rule__Color__Group__1 : rule__Color__Group__1__Impl rule__Color__Group__2 ;
    public final void rule__Color__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1876:1: ( rule__Color__Group__1__Impl rule__Color__Group__2 )
            // InternalTutorial.g:1877:2: rule__Color__Group__1__Impl rule__Color__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Color__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Color__Group__2();

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
    // $ANTLR end "rule__Color__Group__1"


    // $ANTLR start "rule__Color__Group__1__Impl"
    // InternalTutorial.g:1884:1: rule__Color__Group__1__Impl : ( ( rule__Color__NameAssignment_1 ) ) ;
    public final void rule__Color__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1888:1: ( ( ( rule__Color__NameAssignment_1 ) ) )
            // InternalTutorial.g:1889:1: ( ( rule__Color__NameAssignment_1 ) )
            {
            // InternalTutorial.g:1889:1: ( ( rule__Color__NameAssignment_1 ) )
            // InternalTutorial.g:1890:2: ( rule__Color__NameAssignment_1 )
            {
             before(grammarAccess.getColorAccess().getNameAssignment_1()); 
            // InternalTutorial.g:1891:2: ( rule__Color__NameAssignment_1 )
            // InternalTutorial.g:1891:3: rule__Color__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Color__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getColorAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Color__Group__1__Impl"


    // $ANTLR start "rule__Color__Group__2"
    // InternalTutorial.g:1899:1: rule__Color__Group__2 : rule__Color__Group__2__Impl rule__Color__Group__3 ;
    public final void rule__Color__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1903:1: ( rule__Color__Group__2__Impl rule__Color__Group__3 )
            // InternalTutorial.g:1904:2: rule__Color__Group__2__Impl rule__Color__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Color__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Color__Group__3();

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
    // $ANTLR end "rule__Color__Group__2"


    // $ANTLR start "rule__Color__Group__2__Impl"
    // InternalTutorial.g:1911:1: rule__Color__Group__2__Impl : ( ':' ) ;
    public final void rule__Color__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1915:1: ( ( ':' ) )
            // InternalTutorial.g:1916:1: ( ':' )
            {
            // InternalTutorial.g:1916:1: ( ':' )
            // InternalTutorial.g:1917:2: ':'
            {
             before(grammarAccess.getColorAccess().getColonKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getColorAccess().getColonKeyword_2()); 

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
    // $ANTLR end "rule__Color__Group__2__Impl"


    // $ANTLR start "rule__Color__Group__3"
    // InternalTutorial.g:1926:1: rule__Color__Group__3 : rule__Color__Group__3__Impl rule__Color__Group__4 ;
    public final void rule__Color__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1930:1: ( rule__Color__Group__3__Impl rule__Color__Group__4 )
            // InternalTutorial.g:1931:2: rule__Color__Group__3__Impl rule__Color__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__Color__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Color__Group__4();

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
    // $ANTLR end "rule__Color__Group__3"


    // $ANTLR start "rule__Color__Group__3__Impl"
    // InternalTutorial.g:1938:1: rule__Color__Group__3__Impl : ( '{' ) ;
    public final void rule__Color__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1942:1: ( ( '{' ) )
            // InternalTutorial.g:1943:1: ( '{' )
            {
            // InternalTutorial.g:1943:1: ( '{' )
            // InternalTutorial.g:1944:2: '{'
            {
             before(grammarAccess.getColorAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getColorAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Color__Group__3__Impl"


    // $ANTLR start "rule__Color__Group__4"
    // InternalTutorial.g:1953:1: rule__Color__Group__4 : rule__Color__Group__4__Impl rule__Color__Group__5 ;
    public final void rule__Color__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1957:1: ( rule__Color__Group__4__Impl rule__Color__Group__5 )
            // InternalTutorial.g:1958:2: rule__Color__Group__4__Impl rule__Color__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__Color__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Color__Group__5();

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
    // $ANTLR end "rule__Color__Group__4"


    // $ANTLR start "rule__Color__Group__4__Impl"
    // InternalTutorial.g:1965:1: rule__Color__Group__4__Impl : ( 'r' ) ;
    public final void rule__Color__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1969:1: ( ( 'r' ) )
            // InternalTutorial.g:1970:1: ( 'r' )
            {
            // InternalTutorial.g:1970:1: ( 'r' )
            // InternalTutorial.g:1971:2: 'r'
            {
             before(grammarAccess.getColorAccess().getRKeyword_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getColorAccess().getRKeyword_4()); 

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
    // $ANTLR end "rule__Color__Group__4__Impl"


    // $ANTLR start "rule__Color__Group__5"
    // InternalTutorial.g:1980:1: rule__Color__Group__5 : rule__Color__Group__5__Impl rule__Color__Group__6 ;
    public final void rule__Color__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1984:1: ( rule__Color__Group__5__Impl rule__Color__Group__6 )
            // InternalTutorial.g:1985:2: rule__Color__Group__5__Impl rule__Color__Group__6
            {
            pushFollow(FOLLOW_24);
            rule__Color__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Color__Group__6();

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
    // $ANTLR end "rule__Color__Group__5"


    // $ANTLR start "rule__Color__Group__5__Impl"
    // InternalTutorial.g:1992:1: rule__Color__Group__5__Impl : ( ':' ) ;
    public final void rule__Color__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1996:1: ( ( ':' ) )
            // InternalTutorial.g:1997:1: ( ':' )
            {
            // InternalTutorial.g:1997:1: ( ':' )
            // InternalTutorial.g:1998:2: ':'
            {
             before(grammarAccess.getColorAccess().getColonKeyword_5()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getColorAccess().getColonKeyword_5()); 

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
    // $ANTLR end "rule__Color__Group__5__Impl"


    // $ANTLR start "rule__Color__Group__6"
    // InternalTutorial.g:2007:1: rule__Color__Group__6 : rule__Color__Group__6__Impl rule__Color__Group__7 ;
    public final void rule__Color__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2011:1: ( rule__Color__Group__6__Impl rule__Color__Group__7 )
            // InternalTutorial.g:2012:2: rule__Color__Group__6__Impl rule__Color__Group__7
            {
            pushFollow(FOLLOW_25);
            rule__Color__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Color__Group__7();

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
    // $ANTLR end "rule__Color__Group__6"


    // $ANTLR start "rule__Color__Group__6__Impl"
    // InternalTutorial.g:2019:1: rule__Color__Group__6__Impl : ( ( rule__Color__RedAssignment_6 ) ) ;
    public final void rule__Color__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2023:1: ( ( ( rule__Color__RedAssignment_6 ) ) )
            // InternalTutorial.g:2024:1: ( ( rule__Color__RedAssignment_6 ) )
            {
            // InternalTutorial.g:2024:1: ( ( rule__Color__RedAssignment_6 ) )
            // InternalTutorial.g:2025:2: ( rule__Color__RedAssignment_6 )
            {
             before(grammarAccess.getColorAccess().getRedAssignment_6()); 
            // InternalTutorial.g:2026:2: ( rule__Color__RedAssignment_6 )
            // InternalTutorial.g:2026:3: rule__Color__RedAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Color__RedAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getColorAccess().getRedAssignment_6()); 

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
    // $ANTLR end "rule__Color__Group__6__Impl"


    // $ANTLR start "rule__Color__Group__7"
    // InternalTutorial.g:2034:1: rule__Color__Group__7 : rule__Color__Group__7__Impl rule__Color__Group__8 ;
    public final void rule__Color__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2038:1: ( rule__Color__Group__7__Impl rule__Color__Group__8 )
            // InternalTutorial.g:2039:2: rule__Color__Group__7__Impl rule__Color__Group__8
            {
            pushFollow(FOLLOW_9);
            rule__Color__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Color__Group__8();

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
    // $ANTLR end "rule__Color__Group__7"


    // $ANTLR start "rule__Color__Group__7__Impl"
    // InternalTutorial.g:2046:1: rule__Color__Group__7__Impl : ( 'g' ) ;
    public final void rule__Color__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2050:1: ( ( 'g' ) )
            // InternalTutorial.g:2051:1: ( 'g' )
            {
            // InternalTutorial.g:2051:1: ( 'g' )
            // InternalTutorial.g:2052:2: 'g'
            {
             before(grammarAccess.getColorAccess().getGKeyword_7()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getColorAccess().getGKeyword_7()); 

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
    // $ANTLR end "rule__Color__Group__7__Impl"


    // $ANTLR start "rule__Color__Group__8"
    // InternalTutorial.g:2061:1: rule__Color__Group__8 : rule__Color__Group__8__Impl rule__Color__Group__9 ;
    public final void rule__Color__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2065:1: ( rule__Color__Group__8__Impl rule__Color__Group__9 )
            // InternalTutorial.g:2066:2: rule__Color__Group__8__Impl rule__Color__Group__9
            {
            pushFollow(FOLLOW_24);
            rule__Color__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Color__Group__9();

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
    // $ANTLR end "rule__Color__Group__8"


    // $ANTLR start "rule__Color__Group__8__Impl"
    // InternalTutorial.g:2073:1: rule__Color__Group__8__Impl : ( ':' ) ;
    public final void rule__Color__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2077:1: ( ( ':' ) )
            // InternalTutorial.g:2078:1: ( ':' )
            {
            // InternalTutorial.g:2078:1: ( ':' )
            // InternalTutorial.g:2079:2: ':'
            {
             before(grammarAccess.getColorAccess().getColonKeyword_8()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getColorAccess().getColonKeyword_8()); 

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
    // $ANTLR end "rule__Color__Group__8__Impl"


    // $ANTLR start "rule__Color__Group__9"
    // InternalTutorial.g:2088:1: rule__Color__Group__9 : rule__Color__Group__9__Impl rule__Color__Group__10 ;
    public final void rule__Color__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2092:1: ( rule__Color__Group__9__Impl rule__Color__Group__10 )
            // InternalTutorial.g:2093:2: rule__Color__Group__9__Impl rule__Color__Group__10
            {
            pushFollow(FOLLOW_26);
            rule__Color__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Color__Group__10();

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
    // $ANTLR end "rule__Color__Group__9"


    // $ANTLR start "rule__Color__Group__9__Impl"
    // InternalTutorial.g:2100:1: rule__Color__Group__9__Impl : ( ( rule__Color__GreenAssignment_9 ) ) ;
    public final void rule__Color__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2104:1: ( ( ( rule__Color__GreenAssignment_9 ) ) )
            // InternalTutorial.g:2105:1: ( ( rule__Color__GreenAssignment_9 ) )
            {
            // InternalTutorial.g:2105:1: ( ( rule__Color__GreenAssignment_9 ) )
            // InternalTutorial.g:2106:2: ( rule__Color__GreenAssignment_9 )
            {
             before(grammarAccess.getColorAccess().getGreenAssignment_9()); 
            // InternalTutorial.g:2107:2: ( rule__Color__GreenAssignment_9 )
            // InternalTutorial.g:2107:3: rule__Color__GreenAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Color__GreenAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getColorAccess().getGreenAssignment_9()); 

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
    // $ANTLR end "rule__Color__Group__9__Impl"


    // $ANTLR start "rule__Color__Group__10"
    // InternalTutorial.g:2115:1: rule__Color__Group__10 : rule__Color__Group__10__Impl rule__Color__Group__11 ;
    public final void rule__Color__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2119:1: ( rule__Color__Group__10__Impl rule__Color__Group__11 )
            // InternalTutorial.g:2120:2: rule__Color__Group__10__Impl rule__Color__Group__11
            {
            pushFollow(FOLLOW_9);
            rule__Color__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Color__Group__11();

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
    // $ANTLR end "rule__Color__Group__10"


    // $ANTLR start "rule__Color__Group__10__Impl"
    // InternalTutorial.g:2127:1: rule__Color__Group__10__Impl : ( 'b' ) ;
    public final void rule__Color__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2131:1: ( ( 'b' ) )
            // InternalTutorial.g:2132:1: ( 'b' )
            {
            // InternalTutorial.g:2132:1: ( 'b' )
            // InternalTutorial.g:2133:2: 'b'
            {
             before(grammarAccess.getColorAccess().getBKeyword_10()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getColorAccess().getBKeyword_10()); 

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
    // $ANTLR end "rule__Color__Group__10__Impl"


    // $ANTLR start "rule__Color__Group__11"
    // InternalTutorial.g:2142:1: rule__Color__Group__11 : rule__Color__Group__11__Impl rule__Color__Group__12 ;
    public final void rule__Color__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2146:1: ( rule__Color__Group__11__Impl rule__Color__Group__12 )
            // InternalTutorial.g:2147:2: rule__Color__Group__11__Impl rule__Color__Group__12
            {
            pushFollow(FOLLOW_24);
            rule__Color__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Color__Group__12();

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
    // $ANTLR end "rule__Color__Group__11"


    // $ANTLR start "rule__Color__Group__11__Impl"
    // InternalTutorial.g:2154:1: rule__Color__Group__11__Impl : ( ':' ) ;
    public final void rule__Color__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2158:1: ( ( ':' ) )
            // InternalTutorial.g:2159:1: ( ':' )
            {
            // InternalTutorial.g:2159:1: ( ':' )
            // InternalTutorial.g:2160:2: ':'
            {
             before(grammarAccess.getColorAccess().getColonKeyword_11()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getColorAccess().getColonKeyword_11()); 

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
    // $ANTLR end "rule__Color__Group__11__Impl"


    // $ANTLR start "rule__Color__Group__12"
    // InternalTutorial.g:2169:1: rule__Color__Group__12 : rule__Color__Group__12__Impl rule__Color__Group__13 ;
    public final void rule__Color__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2173:1: ( rule__Color__Group__12__Impl rule__Color__Group__13 )
            // InternalTutorial.g:2174:2: rule__Color__Group__12__Impl rule__Color__Group__13
            {
            pushFollow(FOLLOW_6);
            rule__Color__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Color__Group__13();

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
    // $ANTLR end "rule__Color__Group__12"


    // $ANTLR start "rule__Color__Group__12__Impl"
    // InternalTutorial.g:2181:1: rule__Color__Group__12__Impl : ( ( rule__Color__BlueAssignment_12 ) ) ;
    public final void rule__Color__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2185:1: ( ( ( rule__Color__BlueAssignment_12 ) ) )
            // InternalTutorial.g:2186:1: ( ( rule__Color__BlueAssignment_12 ) )
            {
            // InternalTutorial.g:2186:1: ( ( rule__Color__BlueAssignment_12 ) )
            // InternalTutorial.g:2187:2: ( rule__Color__BlueAssignment_12 )
            {
             before(grammarAccess.getColorAccess().getBlueAssignment_12()); 
            // InternalTutorial.g:2188:2: ( rule__Color__BlueAssignment_12 )
            // InternalTutorial.g:2188:3: rule__Color__BlueAssignment_12
            {
            pushFollow(FOLLOW_2);
            rule__Color__BlueAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getColorAccess().getBlueAssignment_12()); 

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
    // $ANTLR end "rule__Color__Group__12__Impl"


    // $ANTLR start "rule__Color__Group__13"
    // InternalTutorial.g:2196:1: rule__Color__Group__13 : rule__Color__Group__13__Impl ;
    public final void rule__Color__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2200:1: ( rule__Color__Group__13__Impl )
            // InternalTutorial.g:2201:2: rule__Color__Group__13__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Color__Group__13__Impl();

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
    // $ANTLR end "rule__Color__Group__13"


    // $ANTLR start "rule__Color__Group__13__Impl"
    // InternalTutorial.g:2207:1: rule__Color__Group__13__Impl : ( '}' ) ;
    public final void rule__Color__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2211:1: ( ( '}' ) )
            // InternalTutorial.g:2212:1: ( '}' )
            {
            // InternalTutorial.g:2212:1: ( '}' )
            // InternalTutorial.g:2213:2: '}'
            {
             before(grammarAccess.getColorAccess().getRightCurlyBracketKeyword_13()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getColorAccess().getRightCurlyBracketKeyword_13()); 

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
    // $ANTLR end "rule__Color__Group__13__Impl"


    // $ANTLR start "rule__ComplexItemType__Group__0"
    // InternalTutorial.g:2223:1: rule__ComplexItemType__Group__0 : rule__ComplexItemType__Group__0__Impl rule__ComplexItemType__Group__1 ;
    public final void rule__ComplexItemType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2227:1: ( rule__ComplexItemType__Group__0__Impl rule__ComplexItemType__Group__1 )
            // InternalTutorial.g:2228:2: rule__ComplexItemType__Group__0__Impl rule__ComplexItemType__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalTutorial.g:2235:1: rule__ComplexItemType__Group__0__Impl : ( 'complexItemType' ) ;
    public final void rule__ComplexItemType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2239:1: ( ( 'complexItemType' ) )
            // InternalTutorial.g:2240:1: ( 'complexItemType' )
            {
            // InternalTutorial.g:2240:1: ( 'complexItemType' )
            // InternalTutorial.g:2241:2: 'complexItemType'
            {
             before(grammarAccess.getComplexItemTypeAccess().getComplexItemTypeKeyword_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getComplexItemTypeAccess().getComplexItemTypeKeyword_0()); 

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
    // $ANTLR end "rule__ComplexItemType__Group__0__Impl"


    // $ANTLR start "rule__ComplexItemType__Group__1"
    // InternalTutorial.g:2250:1: rule__ComplexItemType__Group__1 : rule__ComplexItemType__Group__1__Impl rule__ComplexItemType__Group__2 ;
    public final void rule__ComplexItemType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2254:1: ( rule__ComplexItemType__Group__1__Impl rule__ComplexItemType__Group__2 )
            // InternalTutorial.g:2255:2: rule__ComplexItemType__Group__1__Impl rule__ComplexItemType__Group__2
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
    // InternalTutorial.g:2262:1: rule__ComplexItemType__Group__1__Impl : ( ( rule__ComplexItemType__NameAssignment_1 ) ) ;
    public final void rule__ComplexItemType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2266:1: ( ( ( rule__ComplexItemType__NameAssignment_1 ) ) )
            // InternalTutorial.g:2267:1: ( ( rule__ComplexItemType__NameAssignment_1 ) )
            {
            // InternalTutorial.g:2267:1: ( ( rule__ComplexItemType__NameAssignment_1 ) )
            // InternalTutorial.g:2268:2: ( rule__ComplexItemType__NameAssignment_1 )
            {
             before(grammarAccess.getComplexItemTypeAccess().getNameAssignment_1()); 
            // InternalTutorial.g:2269:2: ( rule__ComplexItemType__NameAssignment_1 )
            // InternalTutorial.g:2269:3: rule__ComplexItemType__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ComplexItemType__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getComplexItemTypeAccess().getNameAssignment_1()); 

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
    // InternalTutorial.g:2277:1: rule__ComplexItemType__Group__2 : rule__ComplexItemType__Group__2__Impl rule__ComplexItemType__Group__3 ;
    public final void rule__ComplexItemType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2281:1: ( rule__ComplexItemType__Group__2__Impl rule__ComplexItemType__Group__3 )
            // InternalTutorial.g:2282:2: rule__ComplexItemType__Group__2__Impl rule__ComplexItemType__Group__3
            {
            pushFollow(FOLLOW_27);
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
    // InternalTutorial.g:2289:1: rule__ComplexItemType__Group__2__Impl : ( '{' ) ;
    public final void rule__ComplexItemType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2293:1: ( ( '{' ) )
            // InternalTutorial.g:2294:1: ( '{' )
            {
            // InternalTutorial.g:2294:1: ( '{' )
            // InternalTutorial.g:2295:2: '{'
            {
             before(grammarAccess.getComplexItemTypeAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getComplexItemTypeAccess().getLeftCurlyBracketKeyword_2()); 

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
    // InternalTutorial.g:2304:1: rule__ComplexItemType__Group__3 : rule__ComplexItemType__Group__3__Impl rule__ComplexItemType__Group__4 ;
    public final void rule__ComplexItemType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2308:1: ( rule__ComplexItemType__Group__3__Impl rule__ComplexItemType__Group__4 )
            // InternalTutorial.g:2309:2: rule__ComplexItemType__Group__3__Impl rule__ComplexItemType__Group__4
            {
            pushFollow(FOLLOW_9);
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
    // InternalTutorial.g:2316:1: rule__ComplexItemType__Group__3__Impl : ( 'components' ) ;
    public final void rule__ComplexItemType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2320:1: ( ( 'components' ) )
            // InternalTutorial.g:2321:1: ( 'components' )
            {
            // InternalTutorial.g:2321:1: ( 'components' )
            // InternalTutorial.g:2322:2: 'components'
            {
             before(grammarAccess.getComplexItemTypeAccess().getComponentsKeyword_3()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getComplexItemTypeAccess().getComponentsKeyword_3()); 

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
    // InternalTutorial.g:2331:1: rule__ComplexItemType__Group__4 : rule__ComplexItemType__Group__4__Impl rule__ComplexItemType__Group__5 ;
    public final void rule__ComplexItemType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2335:1: ( rule__ComplexItemType__Group__4__Impl rule__ComplexItemType__Group__5 )
            // InternalTutorial.g:2336:2: rule__ComplexItemType__Group__4__Impl rule__ComplexItemType__Group__5
            {
            pushFollow(FOLLOW_4);
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
    // InternalTutorial.g:2343:1: rule__ComplexItemType__Group__4__Impl : ( ':' ) ;
    public final void rule__ComplexItemType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2347:1: ( ( ':' ) )
            // InternalTutorial.g:2348:1: ( ':' )
            {
            // InternalTutorial.g:2348:1: ( ':' )
            // InternalTutorial.g:2349:2: ':'
            {
             before(grammarAccess.getComplexItemTypeAccess().getColonKeyword_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getComplexItemTypeAccess().getColonKeyword_4()); 

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
    // InternalTutorial.g:2358:1: rule__ComplexItemType__Group__5 : rule__ComplexItemType__Group__5__Impl rule__ComplexItemType__Group__6 ;
    public final void rule__ComplexItemType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2362:1: ( rule__ComplexItemType__Group__5__Impl rule__ComplexItemType__Group__6 )
            // InternalTutorial.g:2363:2: rule__ComplexItemType__Group__5__Impl rule__ComplexItemType__Group__6
            {
            pushFollow(FOLLOW_3);
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
    // InternalTutorial.g:2370:1: rule__ComplexItemType__Group__5__Impl : ( '{' ) ;
    public final void rule__ComplexItemType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2374:1: ( ( '{' ) )
            // InternalTutorial.g:2375:1: ( '{' )
            {
            // InternalTutorial.g:2375:1: ( '{' )
            // InternalTutorial.g:2376:2: '{'
            {
             before(grammarAccess.getComplexItemTypeAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getComplexItemTypeAccess().getLeftCurlyBracketKeyword_5()); 

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
    // InternalTutorial.g:2385:1: rule__ComplexItemType__Group__6 : rule__ComplexItemType__Group__6__Impl rule__ComplexItemType__Group__7 ;
    public final void rule__ComplexItemType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2389:1: ( rule__ComplexItemType__Group__6__Impl rule__ComplexItemType__Group__7 )
            // InternalTutorial.g:2390:2: rule__ComplexItemType__Group__6__Impl rule__ComplexItemType__Group__7
            {
            pushFollow(FOLLOW_3);
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
    // InternalTutorial.g:2397:1: rule__ComplexItemType__Group__6__Impl : ( ( rule__ComplexItemType__ComponentsAssignment_6 ) ) ;
    public final void rule__ComplexItemType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2401:1: ( ( ( rule__ComplexItemType__ComponentsAssignment_6 ) ) )
            // InternalTutorial.g:2402:1: ( ( rule__ComplexItemType__ComponentsAssignment_6 ) )
            {
            // InternalTutorial.g:2402:1: ( ( rule__ComplexItemType__ComponentsAssignment_6 ) )
            // InternalTutorial.g:2403:2: ( rule__ComplexItemType__ComponentsAssignment_6 )
            {
             before(grammarAccess.getComplexItemTypeAccess().getComponentsAssignment_6()); 
            // InternalTutorial.g:2404:2: ( rule__ComplexItemType__ComponentsAssignment_6 )
            // InternalTutorial.g:2404:3: rule__ComplexItemType__ComponentsAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__ComplexItemType__ComponentsAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getComplexItemTypeAccess().getComponentsAssignment_6()); 

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
    // InternalTutorial.g:2412:1: rule__ComplexItemType__Group__7 : rule__ComplexItemType__Group__7__Impl rule__ComplexItemType__Group__8 ;
    public final void rule__ComplexItemType__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2416:1: ( rule__ComplexItemType__Group__7__Impl rule__ComplexItemType__Group__8 )
            // InternalTutorial.g:2417:2: rule__ComplexItemType__Group__7__Impl rule__ComplexItemType__Group__8
            {
            pushFollow(FOLLOW_6);
            rule__ComplexItemType__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexItemType__Group__8();

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
    // InternalTutorial.g:2424:1: rule__ComplexItemType__Group__7__Impl : ( ( ( rule__ComplexItemType__ComponentsAssignment_7 ) ) ( ( rule__ComplexItemType__ComponentsAssignment_7 )* ) ) ;
    public final void rule__ComplexItemType__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2428:1: ( ( ( ( rule__ComplexItemType__ComponentsAssignment_7 ) ) ( ( rule__ComplexItemType__ComponentsAssignment_7 )* ) ) )
            // InternalTutorial.g:2429:1: ( ( ( rule__ComplexItemType__ComponentsAssignment_7 ) ) ( ( rule__ComplexItemType__ComponentsAssignment_7 )* ) )
            {
            // InternalTutorial.g:2429:1: ( ( ( rule__ComplexItemType__ComponentsAssignment_7 ) ) ( ( rule__ComplexItemType__ComponentsAssignment_7 )* ) )
            // InternalTutorial.g:2430:2: ( ( rule__ComplexItemType__ComponentsAssignment_7 ) ) ( ( rule__ComplexItemType__ComponentsAssignment_7 )* )
            {
            // InternalTutorial.g:2430:2: ( ( rule__ComplexItemType__ComponentsAssignment_7 ) )
            // InternalTutorial.g:2431:3: ( rule__ComplexItemType__ComponentsAssignment_7 )
            {
             before(grammarAccess.getComplexItemTypeAccess().getComponentsAssignment_7()); 
            // InternalTutorial.g:2432:3: ( rule__ComplexItemType__ComponentsAssignment_7 )
            // InternalTutorial.g:2432:4: rule__ComplexItemType__ComponentsAssignment_7
            {
            pushFollow(FOLLOW_22);
            rule__ComplexItemType__ComponentsAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getComplexItemTypeAccess().getComponentsAssignment_7()); 

            }

            // InternalTutorial.g:2435:2: ( ( rule__ComplexItemType__ComponentsAssignment_7 )* )
            // InternalTutorial.g:2436:3: ( rule__ComplexItemType__ComponentsAssignment_7 )*
            {
             before(grammarAccess.getComplexItemTypeAccess().getComponentsAssignment_7()); 
            // InternalTutorial.g:2437:3: ( rule__ComplexItemType__ComponentsAssignment_7 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalTutorial.g:2437:4: rule__ComplexItemType__ComponentsAssignment_7
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__ComplexItemType__ComponentsAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getComplexItemTypeAccess().getComponentsAssignment_7()); 

            }


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


    // $ANTLR start "rule__ComplexItemType__Group__8"
    // InternalTutorial.g:2446:1: rule__ComplexItemType__Group__8 : rule__ComplexItemType__Group__8__Impl rule__ComplexItemType__Group__9 ;
    public final void rule__ComplexItemType__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2450:1: ( rule__ComplexItemType__Group__8__Impl rule__ComplexItemType__Group__9 )
            // InternalTutorial.g:2451:2: rule__ComplexItemType__Group__8__Impl rule__ComplexItemType__Group__9
            {
            pushFollow(FOLLOW_28);
            rule__ComplexItemType__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexItemType__Group__9();

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
    // $ANTLR end "rule__ComplexItemType__Group__8"


    // $ANTLR start "rule__ComplexItemType__Group__8__Impl"
    // InternalTutorial.g:2458:1: rule__ComplexItemType__Group__8__Impl : ( '}' ) ;
    public final void rule__ComplexItemType__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2462:1: ( ( '}' ) )
            // InternalTutorial.g:2463:1: ( '}' )
            {
            // InternalTutorial.g:2463:1: ( '}' )
            // InternalTutorial.g:2464:2: '}'
            {
             before(grammarAccess.getComplexItemTypeAccess().getRightCurlyBracketKeyword_8()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getComplexItemTypeAccess().getRightCurlyBracketKeyword_8()); 

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
    // $ANTLR end "rule__ComplexItemType__Group__8__Impl"


    // $ANTLR start "rule__ComplexItemType__Group__9"
    // InternalTutorial.g:2473:1: rule__ComplexItemType__Group__9 : rule__ComplexItemType__Group__9__Impl rule__ComplexItemType__Group__10 ;
    public final void rule__ComplexItemType__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2477:1: ( rule__ComplexItemType__Group__9__Impl rule__ComplexItemType__Group__10 )
            // InternalTutorial.g:2478:2: rule__ComplexItemType__Group__9__Impl rule__ComplexItemType__Group__10
            {
            pushFollow(FOLLOW_9);
            rule__ComplexItemType__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexItemType__Group__10();

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
    // $ANTLR end "rule__ComplexItemType__Group__9"


    // $ANTLR start "rule__ComplexItemType__Group__9__Impl"
    // InternalTutorial.g:2485:1: rule__ComplexItemType__Group__9__Impl : ( 'connections' ) ;
    public final void rule__ComplexItemType__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2489:1: ( ( 'connections' ) )
            // InternalTutorial.g:2490:1: ( 'connections' )
            {
            // InternalTutorial.g:2490:1: ( 'connections' )
            // InternalTutorial.g:2491:2: 'connections'
            {
             before(grammarAccess.getComplexItemTypeAccess().getConnectionsKeyword_9()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getComplexItemTypeAccess().getConnectionsKeyword_9()); 

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
    // $ANTLR end "rule__ComplexItemType__Group__9__Impl"


    // $ANTLR start "rule__ComplexItemType__Group__10"
    // InternalTutorial.g:2500:1: rule__ComplexItemType__Group__10 : rule__ComplexItemType__Group__10__Impl rule__ComplexItemType__Group__11 ;
    public final void rule__ComplexItemType__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2504:1: ( rule__ComplexItemType__Group__10__Impl rule__ComplexItemType__Group__11 )
            // InternalTutorial.g:2505:2: rule__ComplexItemType__Group__10__Impl rule__ComplexItemType__Group__11
            {
            pushFollow(FOLLOW_4);
            rule__ComplexItemType__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexItemType__Group__11();

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
    // $ANTLR end "rule__ComplexItemType__Group__10"


    // $ANTLR start "rule__ComplexItemType__Group__10__Impl"
    // InternalTutorial.g:2512:1: rule__ComplexItemType__Group__10__Impl : ( ':' ) ;
    public final void rule__ComplexItemType__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2516:1: ( ( ':' ) )
            // InternalTutorial.g:2517:1: ( ':' )
            {
            // InternalTutorial.g:2517:1: ( ':' )
            // InternalTutorial.g:2518:2: ':'
            {
             before(grammarAccess.getComplexItemTypeAccess().getColonKeyword_10()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getComplexItemTypeAccess().getColonKeyword_10()); 

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
    // $ANTLR end "rule__ComplexItemType__Group__10__Impl"


    // $ANTLR start "rule__ComplexItemType__Group__11"
    // InternalTutorial.g:2527:1: rule__ComplexItemType__Group__11 : rule__ComplexItemType__Group__11__Impl rule__ComplexItemType__Group__12 ;
    public final void rule__ComplexItemType__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2531:1: ( rule__ComplexItemType__Group__11__Impl rule__ComplexItemType__Group__12 )
            // InternalTutorial.g:2532:2: rule__ComplexItemType__Group__11__Impl rule__ComplexItemType__Group__12
            {
            pushFollow(FOLLOW_3);
            rule__ComplexItemType__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexItemType__Group__12();

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
    // $ANTLR end "rule__ComplexItemType__Group__11"


    // $ANTLR start "rule__ComplexItemType__Group__11__Impl"
    // InternalTutorial.g:2539:1: rule__ComplexItemType__Group__11__Impl : ( '{' ) ;
    public final void rule__ComplexItemType__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2543:1: ( ( '{' ) )
            // InternalTutorial.g:2544:1: ( '{' )
            {
            // InternalTutorial.g:2544:1: ( '{' )
            // InternalTutorial.g:2545:2: '{'
            {
             before(grammarAccess.getComplexItemTypeAccess().getLeftCurlyBracketKeyword_11()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getComplexItemTypeAccess().getLeftCurlyBracketKeyword_11()); 

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
    // $ANTLR end "rule__ComplexItemType__Group__11__Impl"


    // $ANTLR start "rule__ComplexItemType__Group__12"
    // InternalTutorial.g:2554:1: rule__ComplexItemType__Group__12 : rule__ComplexItemType__Group__12__Impl rule__ComplexItemType__Group__13 ;
    public final void rule__ComplexItemType__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2558:1: ( rule__ComplexItemType__Group__12__Impl rule__ComplexItemType__Group__13 )
            // InternalTutorial.g:2559:2: rule__ComplexItemType__Group__12__Impl rule__ComplexItemType__Group__13
            {
            pushFollow(FOLLOW_6);
            rule__ComplexItemType__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexItemType__Group__13();

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
    // $ANTLR end "rule__ComplexItemType__Group__12"


    // $ANTLR start "rule__ComplexItemType__Group__12__Impl"
    // InternalTutorial.g:2566:1: rule__ComplexItemType__Group__12__Impl : ( ( ( rule__ComplexItemType__ItemConnectionsAssignment_12 ) ) ( ( rule__ComplexItemType__ItemConnectionsAssignment_12 )* ) ) ;
    public final void rule__ComplexItemType__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2570:1: ( ( ( ( rule__ComplexItemType__ItemConnectionsAssignment_12 ) ) ( ( rule__ComplexItemType__ItemConnectionsAssignment_12 )* ) ) )
            // InternalTutorial.g:2571:1: ( ( ( rule__ComplexItemType__ItemConnectionsAssignment_12 ) ) ( ( rule__ComplexItemType__ItemConnectionsAssignment_12 )* ) )
            {
            // InternalTutorial.g:2571:1: ( ( ( rule__ComplexItemType__ItemConnectionsAssignment_12 ) ) ( ( rule__ComplexItemType__ItemConnectionsAssignment_12 )* ) )
            // InternalTutorial.g:2572:2: ( ( rule__ComplexItemType__ItemConnectionsAssignment_12 ) ) ( ( rule__ComplexItemType__ItemConnectionsAssignment_12 )* )
            {
            // InternalTutorial.g:2572:2: ( ( rule__ComplexItemType__ItemConnectionsAssignment_12 ) )
            // InternalTutorial.g:2573:3: ( rule__ComplexItemType__ItemConnectionsAssignment_12 )
            {
             before(grammarAccess.getComplexItemTypeAccess().getItemConnectionsAssignment_12()); 
            // InternalTutorial.g:2574:3: ( rule__ComplexItemType__ItemConnectionsAssignment_12 )
            // InternalTutorial.g:2574:4: rule__ComplexItemType__ItemConnectionsAssignment_12
            {
            pushFollow(FOLLOW_22);
            rule__ComplexItemType__ItemConnectionsAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getComplexItemTypeAccess().getItemConnectionsAssignment_12()); 

            }

            // InternalTutorial.g:2577:2: ( ( rule__ComplexItemType__ItemConnectionsAssignment_12 )* )
            // InternalTutorial.g:2578:3: ( rule__ComplexItemType__ItemConnectionsAssignment_12 )*
            {
             before(grammarAccess.getComplexItemTypeAccess().getItemConnectionsAssignment_12()); 
            // InternalTutorial.g:2579:3: ( rule__ComplexItemType__ItemConnectionsAssignment_12 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalTutorial.g:2579:4: rule__ComplexItemType__ItemConnectionsAssignment_12
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__ComplexItemType__ItemConnectionsAssignment_12();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getComplexItemTypeAccess().getItemConnectionsAssignment_12()); 

            }


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
    // $ANTLR end "rule__ComplexItemType__Group__12__Impl"


    // $ANTLR start "rule__ComplexItemType__Group__13"
    // InternalTutorial.g:2588:1: rule__ComplexItemType__Group__13 : rule__ComplexItemType__Group__13__Impl rule__ComplexItemType__Group__14 ;
    public final void rule__ComplexItemType__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2592:1: ( rule__ComplexItemType__Group__13__Impl rule__ComplexItemType__Group__14 )
            // InternalTutorial.g:2593:2: rule__ComplexItemType__Group__13__Impl rule__ComplexItemType__Group__14
            {
            pushFollow(FOLLOW_6);
            rule__ComplexItemType__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexItemType__Group__14();

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
    // $ANTLR end "rule__ComplexItemType__Group__13"


    // $ANTLR start "rule__ComplexItemType__Group__13__Impl"
    // InternalTutorial.g:2600:1: rule__ComplexItemType__Group__13__Impl : ( '}' ) ;
    public final void rule__ComplexItemType__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2604:1: ( ( '}' ) )
            // InternalTutorial.g:2605:1: ( '}' )
            {
            // InternalTutorial.g:2605:1: ( '}' )
            // InternalTutorial.g:2606:2: '}'
            {
             before(grammarAccess.getComplexItemTypeAccess().getRightCurlyBracketKeyword_13()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getComplexItemTypeAccess().getRightCurlyBracketKeyword_13()); 

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
    // $ANTLR end "rule__ComplexItemType__Group__13__Impl"


    // $ANTLR start "rule__ComplexItemType__Group__14"
    // InternalTutorial.g:2615:1: rule__ComplexItemType__Group__14 : rule__ComplexItemType__Group__14__Impl ;
    public final void rule__ComplexItemType__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2619:1: ( rule__ComplexItemType__Group__14__Impl )
            // InternalTutorial.g:2620:2: rule__ComplexItemType__Group__14__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComplexItemType__Group__14__Impl();

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
    // $ANTLR end "rule__ComplexItemType__Group__14"


    // $ANTLR start "rule__ComplexItemType__Group__14__Impl"
    // InternalTutorial.g:2626:1: rule__ComplexItemType__Group__14__Impl : ( '}' ) ;
    public final void rule__ComplexItemType__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2630:1: ( ( '}' ) )
            // InternalTutorial.g:2631:1: ( '}' )
            {
            // InternalTutorial.g:2631:1: ( '}' )
            // InternalTutorial.g:2632:2: '}'
            {
             before(grammarAccess.getComplexItemTypeAccess().getRightCurlyBracketKeyword_14()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getComplexItemTypeAccess().getRightCurlyBracketKeyword_14()); 

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
    // $ANTLR end "rule__ComplexItemType__Group__14__Impl"


    // $ANTLR start "rule__Component__Group__0"
    // InternalTutorial.g:2642:1: rule__Component__Group__0 : rule__Component__Group__0__Impl rule__Component__Group__1 ;
    public final void rule__Component__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2646:1: ( rule__Component__Group__0__Impl rule__Component__Group__1 )
            // InternalTutorial.g:2647:2: rule__Component__Group__0__Impl rule__Component__Group__1
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
    // InternalTutorial.g:2654:1: rule__Component__Group__0__Impl : ( ( rule__Component__NameAssignment_0 ) ) ;
    public final void rule__Component__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2658:1: ( ( ( rule__Component__NameAssignment_0 ) ) )
            // InternalTutorial.g:2659:1: ( ( rule__Component__NameAssignment_0 ) )
            {
            // InternalTutorial.g:2659:1: ( ( rule__Component__NameAssignment_0 ) )
            // InternalTutorial.g:2660:2: ( rule__Component__NameAssignment_0 )
            {
             before(grammarAccess.getComponentAccess().getNameAssignment_0()); 
            // InternalTutorial.g:2661:2: ( rule__Component__NameAssignment_0 )
            // InternalTutorial.g:2661:3: rule__Component__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Component__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__Component__Group__0__Impl"


    // $ANTLR start "rule__Component__Group__1"
    // InternalTutorial.g:2669:1: rule__Component__Group__1 : rule__Component__Group__1__Impl rule__Component__Group__2 ;
    public final void rule__Component__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2673:1: ( rule__Component__Group__1__Impl rule__Component__Group__2 )
            // InternalTutorial.g:2674:2: rule__Component__Group__1__Impl rule__Component__Group__2
            {
            pushFollow(FOLLOW_3);
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
    // InternalTutorial.g:2681:1: rule__Component__Group__1__Impl : ( '(' ) ;
    public final void rule__Component__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2685:1: ( ( '(' ) )
            // InternalTutorial.g:2686:1: ( '(' )
            {
            // InternalTutorial.g:2686:1: ( '(' )
            // InternalTutorial.g:2687:2: '('
            {
             before(grammarAccess.getComponentAccess().getLeftParenthesisKeyword_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getLeftParenthesisKeyword_1()); 

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
    // InternalTutorial.g:2696:1: rule__Component__Group__2 : rule__Component__Group__2__Impl rule__Component__Group__3 ;
    public final void rule__Component__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2700:1: ( rule__Component__Group__2__Impl rule__Component__Group__3 )
            // InternalTutorial.g:2701:2: rule__Component__Group__2__Impl rule__Component__Group__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalTutorial.g:2708:1: rule__Component__Group__2__Impl : ( ( rule__Component__ItemTypeAssignment_2 ) ) ;
    public final void rule__Component__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2712:1: ( ( ( rule__Component__ItemTypeAssignment_2 ) ) )
            // InternalTutorial.g:2713:1: ( ( rule__Component__ItemTypeAssignment_2 ) )
            {
            // InternalTutorial.g:2713:1: ( ( rule__Component__ItemTypeAssignment_2 ) )
            // InternalTutorial.g:2714:2: ( rule__Component__ItemTypeAssignment_2 )
            {
             before(grammarAccess.getComponentAccess().getItemTypeAssignment_2()); 
            // InternalTutorial.g:2715:2: ( rule__Component__ItemTypeAssignment_2 )
            // InternalTutorial.g:2715:3: rule__Component__ItemTypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Component__ItemTypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getItemTypeAssignment_2()); 

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
    // InternalTutorial.g:2723:1: rule__Component__Group__3 : rule__Component__Group__3__Impl ;
    public final void rule__Component__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2727:1: ( rule__Component__Group__3__Impl )
            // InternalTutorial.g:2728:2: rule__Component__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group__3__Impl();

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
    // InternalTutorial.g:2734:1: rule__Component__Group__3__Impl : ( ')' ) ;
    public final void rule__Component__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2738:1: ( ( ')' ) )
            // InternalTutorial.g:2739:1: ( ')' )
            {
            // InternalTutorial.g:2739:1: ( ')' )
            // InternalTutorial.g:2740:2: ')'
            {
             before(grammarAccess.getComponentAccess().getRightParenthesisKeyword_3()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getRightParenthesisKeyword_3()); 

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


    // $ANTLR start "rule__ItemConnection__Group__0"
    // InternalTutorial.g:2750:1: rule__ItemConnection__Group__0 : rule__ItemConnection__Group__0__Impl rule__ItemConnection__Group__1 ;
    public final void rule__ItemConnection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2754:1: ( rule__ItemConnection__Group__0__Impl rule__ItemConnection__Group__1 )
            // InternalTutorial.g:2755:2: rule__ItemConnection__Group__0__Impl rule__ItemConnection__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__ItemConnection__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ItemConnection__Group__1();

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
    // $ANTLR end "rule__ItemConnection__Group__0"


    // $ANTLR start "rule__ItemConnection__Group__0__Impl"
    // InternalTutorial.g:2762:1: rule__ItemConnection__Group__0__Impl : ( ( rule__ItemConnection__ComponentAAssignment_0 ) ) ;
    public final void rule__ItemConnection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2766:1: ( ( ( rule__ItemConnection__ComponentAAssignment_0 ) ) )
            // InternalTutorial.g:2767:1: ( ( rule__ItemConnection__ComponentAAssignment_0 ) )
            {
            // InternalTutorial.g:2767:1: ( ( rule__ItemConnection__ComponentAAssignment_0 ) )
            // InternalTutorial.g:2768:2: ( rule__ItemConnection__ComponentAAssignment_0 )
            {
             before(grammarAccess.getItemConnectionAccess().getComponentAAssignment_0()); 
            // InternalTutorial.g:2769:2: ( rule__ItemConnection__ComponentAAssignment_0 )
            // InternalTutorial.g:2769:3: rule__ItemConnection__ComponentAAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ItemConnection__ComponentAAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getItemConnectionAccess().getComponentAAssignment_0()); 

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
    // $ANTLR end "rule__ItemConnection__Group__0__Impl"


    // $ANTLR start "rule__ItemConnection__Group__1"
    // InternalTutorial.g:2777:1: rule__ItemConnection__Group__1 : rule__ItemConnection__Group__1__Impl rule__ItemConnection__Group__2 ;
    public final void rule__ItemConnection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2781:1: ( rule__ItemConnection__Group__1__Impl rule__ItemConnection__Group__2 )
            // InternalTutorial.g:2782:2: rule__ItemConnection__Group__1__Impl rule__ItemConnection__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__ItemConnection__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ItemConnection__Group__2();

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
    // $ANTLR end "rule__ItemConnection__Group__1"


    // $ANTLR start "rule__ItemConnection__Group__1__Impl"
    // InternalTutorial.g:2789:1: rule__ItemConnection__Group__1__Impl : ( '(' ) ;
    public final void rule__ItemConnection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2793:1: ( ( '(' ) )
            // InternalTutorial.g:2794:1: ( '(' )
            {
            // InternalTutorial.g:2794:1: ( '(' )
            // InternalTutorial.g:2795:2: '('
            {
             before(grammarAccess.getItemConnectionAccess().getLeftParenthesisKeyword_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getItemConnectionAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__ItemConnection__Group__1__Impl"


    // $ANTLR start "rule__ItemConnection__Group__2"
    // InternalTutorial.g:2804:1: rule__ItemConnection__Group__2 : rule__ItemConnection__Group__2__Impl rule__ItemConnection__Group__3 ;
    public final void rule__ItemConnection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2808:1: ( rule__ItemConnection__Group__2__Impl rule__ItemConnection__Group__3 )
            // InternalTutorial.g:2809:2: rule__ItemConnection__Group__2__Impl rule__ItemConnection__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__ItemConnection__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ItemConnection__Group__3();

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
    // $ANTLR end "rule__ItemConnection__Group__2"


    // $ANTLR start "rule__ItemConnection__Group__2__Impl"
    // InternalTutorial.g:2816:1: rule__ItemConnection__Group__2__Impl : ( ( rule__ItemConnection__MarkerAAssignment_2 ) ) ;
    public final void rule__ItemConnection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2820:1: ( ( ( rule__ItemConnection__MarkerAAssignment_2 ) ) )
            // InternalTutorial.g:2821:1: ( ( rule__ItemConnection__MarkerAAssignment_2 ) )
            {
            // InternalTutorial.g:2821:1: ( ( rule__ItemConnection__MarkerAAssignment_2 ) )
            // InternalTutorial.g:2822:2: ( rule__ItemConnection__MarkerAAssignment_2 )
            {
             before(grammarAccess.getItemConnectionAccess().getMarkerAAssignment_2()); 
            // InternalTutorial.g:2823:2: ( rule__ItemConnection__MarkerAAssignment_2 )
            // InternalTutorial.g:2823:3: rule__ItemConnection__MarkerAAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ItemConnection__MarkerAAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getItemConnectionAccess().getMarkerAAssignment_2()); 

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
    // $ANTLR end "rule__ItemConnection__Group__2__Impl"


    // $ANTLR start "rule__ItemConnection__Group__3"
    // InternalTutorial.g:2831:1: rule__ItemConnection__Group__3 : rule__ItemConnection__Group__3__Impl rule__ItemConnection__Group__4 ;
    public final void rule__ItemConnection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2835:1: ( rule__ItemConnection__Group__3__Impl rule__ItemConnection__Group__4 )
            // InternalTutorial.g:2836:2: rule__ItemConnection__Group__3__Impl rule__ItemConnection__Group__4
            {
            pushFollow(FOLLOW_29);
            rule__ItemConnection__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ItemConnection__Group__4();

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
    // $ANTLR end "rule__ItemConnection__Group__3"


    // $ANTLR start "rule__ItemConnection__Group__3__Impl"
    // InternalTutorial.g:2843:1: rule__ItemConnection__Group__3__Impl : ( ')' ) ;
    public final void rule__ItemConnection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2847:1: ( ( ')' ) )
            // InternalTutorial.g:2848:1: ( ')' )
            {
            // InternalTutorial.g:2848:1: ( ')' )
            // InternalTutorial.g:2849:2: ')'
            {
             before(grammarAccess.getItemConnectionAccess().getRightParenthesisKeyword_3()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getItemConnectionAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__ItemConnection__Group__3__Impl"


    // $ANTLR start "rule__ItemConnection__Group__4"
    // InternalTutorial.g:2858:1: rule__ItemConnection__Group__4 : rule__ItemConnection__Group__4__Impl rule__ItemConnection__Group__5 ;
    public final void rule__ItemConnection__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2862:1: ( rule__ItemConnection__Group__4__Impl rule__ItemConnection__Group__5 )
            // InternalTutorial.g:2863:2: rule__ItemConnection__Group__4__Impl rule__ItemConnection__Group__5
            {
            pushFollow(FOLLOW_3);
            rule__ItemConnection__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ItemConnection__Group__5();

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
    // $ANTLR end "rule__ItemConnection__Group__4"


    // $ANTLR start "rule__ItemConnection__Group__4__Impl"
    // InternalTutorial.g:2870:1: rule__ItemConnection__Group__4__Impl : ( '<->' ) ;
    public final void rule__ItemConnection__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2874:1: ( ( '<->' ) )
            // InternalTutorial.g:2875:1: ( '<->' )
            {
            // InternalTutorial.g:2875:1: ( '<->' )
            // InternalTutorial.g:2876:2: '<->'
            {
             before(grammarAccess.getItemConnectionAccess().getLessThanSignHyphenMinusGreaterThanSignKeyword_4()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getItemConnectionAccess().getLessThanSignHyphenMinusGreaterThanSignKeyword_4()); 

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
    // $ANTLR end "rule__ItemConnection__Group__4__Impl"


    // $ANTLR start "rule__ItemConnection__Group__5"
    // InternalTutorial.g:2885:1: rule__ItemConnection__Group__5 : rule__ItemConnection__Group__5__Impl rule__ItemConnection__Group__6 ;
    public final void rule__ItemConnection__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2889:1: ( rule__ItemConnection__Group__5__Impl rule__ItemConnection__Group__6 )
            // InternalTutorial.g:2890:2: rule__ItemConnection__Group__5__Impl rule__ItemConnection__Group__6
            {
            pushFollow(FOLLOW_15);
            rule__ItemConnection__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ItemConnection__Group__6();

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
    // $ANTLR end "rule__ItemConnection__Group__5"


    // $ANTLR start "rule__ItemConnection__Group__5__Impl"
    // InternalTutorial.g:2897:1: rule__ItemConnection__Group__5__Impl : ( ( rule__ItemConnection__ComponentBAssignment_5 ) ) ;
    public final void rule__ItemConnection__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2901:1: ( ( ( rule__ItemConnection__ComponentBAssignment_5 ) ) )
            // InternalTutorial.g:2902:1: ( ( rule__ItemConnection__ComponentBAssignment_5 ) )
            {
            // InternalTutorial.g:2902:1: ( ( rule__ItemConnection__ComponentBAssignment_5 ) )
            // InternalTutorial.g:2903:2: ( rule__ItemConnection__ComponentBAssignment_5 )
            {
             before(grammarAccess.getItemConnectionAccess().getComponentBAssignment_5()); 
            // InternalTutorial.g:2904:2: ( rule__ItemConnection__ComponentBAssignment_5 )
            // InternalTutorial.g:2904:3: rule__ItemConnection__ComponentBAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__ItemConnection__ComponentBAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getItemConnectionAccess().getComponentBAssignment_5()); 

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
    // $ANTLR end "rule__ItemConnection__Group__5__Impl"


    // $ANTLR start "rule__ItemConnection__Group__6"
    // InternalTutorial.g:2912:1: rule__ItemConnection__Group__6 : rule__ItemConnection__Group__6__Impl rule__ItemConnection__Group__7 ;
    public final void rule__ItemConnection__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2916:1: ( rule__ItemConnection__Group__6__Impl rule__ItemConnection__Group__7 )
            // InternalTutorial.g:2917:2: rule__ItemConnection__Group__6__Impl rule__ItemConnection__Group__7
            {
            pushFollow(FOLLOW_23);
            rule__ItemConnection__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ItemConnection__Group__7();

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
    // $ANTLR end "rule__ItemConnection__Group__6"


    // $ANTLR start "rule__ItemConnection__Group__6__Impl"
    // InternalTutorial.g:2924:1: rule__ItemConnection__Group__6__Impl : ( '(' ) ;
    public final void rule__ItemConnection__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2928:1: ( ( '(' ) )
            // InternalTutorial.g:2929:1: ( '(' )
            {
            // InternalTutorial.g:2929:1: ( '(' )
            // InternalTutorial.g:2930:2: '('
            {
             before(grammarAccess.getItemConnectionAccess().getLeftParenthesisKeyword_6()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getItemConnectionAccess().getLeftParenthesisKeyword_6()); 

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
    // $ANTLR end "rule__ItemConnection__Group__6__Impl"


    // $ANTLR start "rule__ItemConnection__Group__7"
    // InternalTutorial.g:2939:1: rule__ItemConnection__Group__7 : rule__ItemConnection__Group__7__Impl rule__ItemConnection__Group__8 ;
    public final void rule__ItemConnection__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2943:1: ( rule__ItemConnection__Group__7__Impl rule__ItemConnection__Group__8 )
            // InternalTutorial.g:2944:2: rule__ItemConnection__Group__7__Impl rule__ItemConnection__Group__8
            {
            pushFollow(FOLLOW_17);
            rule__ItemConnection__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ItemConnection__Group__8();

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
    // $ANTLR end "rule__ItemConnection__Group__7"


    // $ANTLR start "rule__ItemConnection__Group__7__Impl"
    // InternalTutorial.g:2951:1: rule__ItemConnection__Group__7__Impl : ( ( rule__ItemConnection__MarkerBAssignment_7 ) ) ;
    public final void rule__ItemConnection__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2955:1: ( ( ( rule__ItemConnection__MarkerBAssignment_7 ) ) )
            // InternalTutorial.g:2956:1: ( ( rule__ItemConnection__MarkerBAssignment_7 ) )
            {
            // InternalTutorial.g:2956:1: ( ( rule__ItemConnection__MarkerBAssignment_7 ) )
            // InternalTutorial.g:2957:2: ( rule__ItemConnection__MarkerBAssignment_7 )
            {
             before(grammarAccess.getItemConnectionAccess().getMarkerBAssignment_7()); 
            // InternalTutorial.g:2958:2: ( rule__ItemConnection__MarkerBAssignment_7 )
            // InternalTutorial.g:2958:3: rule__ItemConnection__MarkerBAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__ItemConnection__MarkerBAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getItemConnectionAccess().getMarkerBAssignment_7()); 

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
    // $ANTLR end "rule__ItemConnection__Group__7__Impl"


    // $ANTLR start "rule__ItemConnection__Group__8"
    // InternalTutorial.g:2966:1: rule__ItemConnection__Group__8 : rule__ItemConnection__Group__8__Impl ;
    public final void rule__ItemConnection__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2970:1: ( rule__ItemConnection__Group__8__Impl )
            // InternalTutorial.g:2971:2: rule__ItemConnection__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ItemConnection__Group__8__Impl();

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
    // $ANTLR end "rule__ItemConnection__Group__8"


    // $ANTLR start "rule__ItemConnection__Group__8__Impl"
    // InternalTutorial.g:2977:1: rule__ItemConnection__Group__8__Impl : ( ')' ) ;
    public final void rule__ItemConnection__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2981:1: ( ( ')' ) )
            // InternalTutorial.g:2982:1: ( ')' )
            {
            // InternalTutorial.g:2982:1: ( ')' )
            // InternalTutorial.g:2983:2: ')'
            {
             before(grammarAccess.getItemConnectionAccess().getRightParenthesisKeyword_8()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getItemConnectionAccess().getRightParenthesisKeyword_8()); 

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
    // $ANTLR end "rule__ItemConnection__Group__8__Impl"


    // $ANTLR start "rule__EDouble__Group__0"
    // InternalTutorial.g:2993:1: rule__EDouble__Group__0 : rule__EDouble__Group__0__Impl rule__EDouble__Group__1 ;
    public final void rule__EDouble__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2997:1: ( rule__EDouble__Group__0__Impl rule__EDouble__Group__1 )
            // InternalTutorial.g:2998:2: rule__EDouble__Group__0__Impl rule__EDouble__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__EDouble__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__1();

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
    // $ANTLR end "rule__EDouble__Group__0"


    // $ANTLR start "rule__EDouble__Group__0__Impl"
    // InternalTutorial.g:3005:1: rule__EDouble__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:3009:1: ( ( ( '-' )? ) )
            // InternalTutorial.g:3010:1: ( ( '-' )? )
            {
            // InternalTutorial.g:3010:1: ( ( '-' )? )
            // InternalTutorial.g:3011:2: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 
            // InternalTutorial.g:3012:2: ( '-' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==40) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalTutorial.g:3012:3: '-'
                    {
                    match(input,40,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 

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
    // $ANTLR end "rule__EDouble__Group__0__Impl"


    // $ANTLR start "rule__EDouble__Group__1"
    // InternalTutorial.g:3020:1: rule__EDouble__Group__1 : rule__EDouble__Group__1__Impl rule__EDouble__Group__2 ;
    public final void rule__EDouble__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:3024:1: ( rule__EDouble__Group__1__Impl rule__EDouble__Group__2 )
            // InternalTutorial.g:3025:2: rule__EDouble__Group__1__Impl rule__EDouble__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__EDouble__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__2();

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
    // $ANTLR end "rule__EDouble__Group__1"


    // $ANTLR start "rule__EDouble__Group__1__Impl"
    // InternalTutorial.g:3032:1: rule__EDouble__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EDouble__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:3036:1: ( ( ( RULE_INT )? ) )
            // InternalTutorial.g:3037:1: ( ( RULE_INT )? )
            {
            // InternalTutorial.g:3037:1: ( ( RULE_INT )? )
            // InternalTutorial.g:3038:2: ( RULE_INT )?
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 
            // InternalTutorial.g:3039:2: ( RULE_INT )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_INT) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalTutorial.g:3039:3: RULE_INT
                    {
                    match(input,RULE_INT,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EDouble__Group__1__Impl"


    // $ANTLR start "rule__EDouble__Group__2"
    // InternalTutorial.g:3047:1: rule__EDouble__Group__2 : rule__EDouble__Group__2__Impl rule__EDouble__Group__3 ;
    public final void rule__EDouble__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:3051:1: ( rule__EDouble__Group__2__Impl rule__EDouble__Group__3 )
            // InternalTutorial.g:3052:2: rule__EDouble__Group__2__Impl rule__EDouble__Group__3
            {
            pushFollow(FOLLOW_30);
            rule__EDouble__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__3();

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
    // $ANTLR end "rule__EDouble__Group__2"


    // $ANTLR start "rule__EDouble__Group__2__Impl"
    // InternalTutorial.g:3059:1: rule__EDouble__Group__2__Impl : ( '.' ) ;
    public final void rule__EDouble__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:3063:1: ( ( '.' ) )
            // InternalTutorial.g:3064:1: ( '.' )
            {
            // InternalTutorial.g:3064:1: ( '.' )
            // InternalTutorial.g:3065:2: '.'
            {
             before(grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 

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
    // $ANTLR end "rule__EDouble__Group__2__Impl"


    // $ANTLR start "rule__EDouble__Group__3"
    // InternalTutorial.g:3074:1: rule__EDouble__Group__3 : rule__EDouble__Group__3__Impl rule__EDouble__Group__4 ;
    public final void rule__EDouble__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:3078:1: ( rule__EDouble__Group__3__Impl rule__EDouble__Group__4 )
            // InternalTutorial.g:3079:2: rule__EDouble__Group__3__Impl rule__EDouble__Group__4
            {
            pushFollow(FOLLOW_31);
            rule__EDouble__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__4();

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
    // $ANTLR end "rule__EDouble__Group__3"


    // $ANTLR start "rule__EDouble__Group__3__Impl"
    // InternalTutorial.g:3086:1: rule__EDouble__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:3090:1: ( ( RULE_INT ) )
            // InternalTutorial.g:3091:1: ( RULE_INT )
            {
            // InternalTutorial.g:3091:1: ( RULE_INT )
            // InternalTutorial.g:3092:2: RULE_INT
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3()); 

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
    // $ANTLR end "rule__EDouble__Group__3__Impl"


    // $ANTLR start "rule__EDouble__Group__4"
    // InternalTutorial.g:3101:1: rule__EDouble__Group__4 : rule__EDouble__Group__4__Impl ;
    public final void rule__EDouble__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:3105:1: ( rule__EDouble__Group__4__Impl )
            // InternalTutorial.g:3106:2: rule__EDouble__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Group__4__Impl();

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
    // $ANTLR end "rule__EDouble__Group__4"


    // $ANTLR start "rule__EDouble__Group__4__Impl"
    // InternalTutorial.g:3112:1: rule__EDouble__Group__4__Impl : ( ( rule__EDouble__Group_4__0 )? ) ;
    public final void rule__EDouble__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:3116:1: ( ( ( rule__EDouble__Group_4__0 )? ) )
            // InternalTutorial.g:3117:1: ( ( rule__EDouble__Group_4__0 )? )
            {
            // InternalTutorial.g:3117:1: ( ( rule__EDouble__Group_4__0 )? )
            // InternalTutorial.g:3118:2: ( rule__EDouble__Group_4__0 )?
            {
             before(grammarAccess.getEDoubleAccess().getGroup_4()); 
            // InternalTutorial.g:3119:2: ( rule__EDouble__Group_4__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=11 && LA13_0<=12)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalTutorial.g:3119:3: rule__EDouble__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EDouble__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getGroup_4()); 

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
    // $ANTLR end "rule__EDouble__Group__4__Impl"


    // $ANTLR start "rule__EDouble__Group_4__0"
    // InternalTutorial.g:3128:1: rule__EDouble__Group_4__0 : rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 ;
    public final void rule__EDouble__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:3132:1: ( rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 )
            // InternalTutorial.g:3133:2: rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1
            {
            pushFollow(FOLLOW_24);
            rule__EDouble__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group_4__1();

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
    // $ANTLR end "rule__EDouble__Group_4__0"


    // $ANTLR start "rule__EDouble__Group_4__0__Impl"
    // InternalTutorial.g:3140:1: rule__EDouble__Group_4__0__Impl : ( ( rule__EDouble__Alternatives_4_0 ) ) ;
    public final void rule__EDouble__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:3144:1: ( ( ( rule__EDouble__Alternatives_4_0 ) ) )
            // InternalTutorial.g:3145:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            {
            // InternalTutorial.g:3145:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            // InternalTutorial.g:3146:2: ( rule__EDouble__Alternatives_4_0 )
            {
             before(grammarAccess.getEDoubleAccess().getAlternatives_4_0()); 
            // InternalTutorial.g:3147:2: ( rule__EDouble__Alternatives_4_0 )
            // InternalTutorial.g:3147:3: rule__EDouble__Alternatives_4_0
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Alternatives_4_0();

            state._fsp--;


            }

             after(grammarAccess.getEDoubleAccess().getAlternatives_4_0()); 

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
    // $ANTLR end "rule__EDouble__Group_4__0__Impl"


    // $ANTLR start "rule__EDouble__Group_4__1"
    // InternalTutorial.g:3155:1: rule__EDouble__Group_4__1 : rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 ;
    public final void rule__EDouble__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:3159:1: ( rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 )
            // InternalTutorial.g:3160:2: rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2
            {
            pushFollow(FOLLOW_24);
            rule__EDouble__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group_4__2();

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
    // $ANTLR end "rule__EDouble__Group_4__1"


    // $ANTLR start "rule__EDouble__Group_4__1__Impl"
    // InternalTutorial.g:3167:1: rule__EDouble__Group_4__1__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:3171:1: ( ( ( '-' )? ) )
            // InternalTutorial.g:3172:1: ( ( '-' )? )
            {
            // InternalTutorial.g:3172:1: ( ( '-' )? )
            // InternalTutorial.g:3173:2: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 
            // InternalTutorial.g:3174:2: ( '-' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==40) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalTutorial.g:3174:3: '-'
                    {
                    match(input,40,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 

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
    // $ANTLR end "rule__EDouble__Group_4__1__Impl"


    // $ANTLR start "rule__EDouble__Group_4__2"
    // InternalTutorial.g:3182:1: rule__EDouble__Group_4__2 : rule__EDouble__Group_4__2__Impl ;
    public final void rule__EDouble__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:3186:1: ( rule__EDouble__Group_4__2__Impl )
            // InternalTutorial.g:3187:2: rule__EDouble__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Group_4__2__Impl();

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
    // $ANTLR end "rule__EDouble__Group_4__2"


    // $ANTLR start "rule__EDouble__Group_4__2__Impl"
    // InternalTutorial.g:3193:1: rule__EDouble__Group_4__2__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:3197:1: ( ( RULE_INT ) )
            // InternalTutorial.g:3198:1: ( RULE_INT )
            {
            // InternalTutorial.g:3198:1: ( RULE_INT )
            // InternalTutorial.g:3199:2: RULE_INT
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2()); 

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
    // $ANTLR end "rule__EDouble__Group_4__2__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalTutorial.g:3209:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:3213:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalTutorial.g:3214:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EInt__Group__1();

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
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // InternalTutorial.g:3221:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:3225:1: ( ( ( '-' )? ) )
            // InternalTutorial.g:3226:1: ( ( '-' )? )
            {
            // InternalTutorial.g:3226:1: ( ( '-' )? )
            // InternalTutorial.g:3227:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalTutorial.g:3228:2: ( '-' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==40) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalTutorial.g:3228:3: '-'
                    {
                    match(input,40,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

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
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // InternalTutorial.g:3236:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:3240:1: ( rule__EInt__Group__1__Impl )
            // InternalTutorial.g:3241:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__1__Impl();

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
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // InternalTutorial.g:3247:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:3251:1: ( ( RULE_INT ) )
            // InternalTutorial.g:3252:1: ( RULE_INT )
            {
            // InternalTutorial.g:3252:1: ( RULE_INT )
            // InternalTutorial.g:3253:2: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__Factory__NameAssignment_1"
    // InternalTutorial.g:3263:1: rule__Factory__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Factory__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:3267:1: ( ( RULE_ID ) )
            // InternalTutorial.g:3268:2: ( RULE_ID )
            {
            // InternalTutorial.g:3268:2: ( RULE_ID )
            // InternalTutorial.g:3269:3: RULE_ID
            {
             before(grammarAccess.getFactoryAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFactoryAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Factory__NameAssignment_1"


    // $ANTLR start "rule__Factory__ItemTypesAssignment_3"
    // InternalTutorial.g:3278:1: rule__Factory__ItemTypesAssignment_3 : ( ruleItemType ) ;
    public final void rule__Factory__ItemTypesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:3282:1: ( ( ruleItemType ) )
            // InternalTutorial.g:3283:2: ( ruleItemType )
            {
            // InternalTutorial.g:3283:2: ( ruleItemType )
            // InternalTutorial.g:3284:3: ruleItemType
            {
             before(grammarAccess.getFactoryAccess().getItemTypesItemTypeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleItemType();

            state._fsp--;

             after(grammarAccess.getFactoryAccess().getItemTypesItemTypeParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Factory__ItemTypesAssignment_3"


    // $ANTLR start "rule__CylinderShape__LengthAssignment_4"
    // InternalTutorial.g:3293:1: rule__CylinderShape__LengthAssignment_4 : ( ruleEDouble ) ;
    public final void rule__CylinderShape__LengthAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:3297:1: ( ( ruleEDouble ) )
            // InternalTutorial.g:3298:2: ( ruleEDouble )
            {
            // InternalTutorial.g:3298:2: ( ruleEDouble )
            // InternalTutorial.g:3299:3: ruleEDouble
            {
             before(grammarAccess.getCylinderShapeAccess().getLengthEDoubleParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getCylinderShapeAccess().getLengthEDoubleParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__CylinderShape__LengthAssignment_4"


    // $ANTLR start "rule__CylinderShape__RadiusAssignment_8"
    // InternalTutorial.g:3308:1: rule__CylinderShape__RadiusAssignment_8 : ( ruleEDouble ) ;
    public final void rule__CylinderShape__RadiusAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:3312:1: ( ( ruleEDouble ) )
            // InternalTutorial.g:3313:2: ( ruleEDouble )
            {
            // InternalTutorial.g:3313:2: ( ruleEDouble )
            // InternalTutorial.g:3314:3: ruleEDouble
            {
             before(grammarAccess.getCylinderShapeAccess().getRadiusEDoubleParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getCylinderShapeAccess().getRadiusEDoubleParserRuleCall_8_0()); 

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
    // $ANTLR end "rule__CylinderShape__RadiusAssignment_8"


    // $ANTLR start "rule__BlockShape__LengthAssignment_4"
    // InternalTutorial.g:3323:1: rule__BlockShape__LengthAssignment_4 : ( ruleEDouble ) ;
    public final void rule__BlockShape__LengthAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:3327:1: ( ( ruleEDouble ) )
            // InternalTutorial.g:3328:2: ( ruleEDouble )
            {
            // InternalTutorial.g:3328:2: ( ruleEDouble )
            // InternalTutorial.g:3329:3: ruleEDouble
            {
             before(grammarAccess.getBlockShapeAccess().getLengthEDoubleParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getBlockShapeAccess().getLengthEDoubleParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__BlockShape__LengthAssignment_4"


    // $ANTLR start "rule__BlockShape__WidthAssignment_8"
    // InternalTutorial.g:3338:1: rule__BlockShape__WidthAssignment_8 : ( ruleEDouble ) ;
    public final void rule__BlockShape__WidthAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:3342:1: ( ( ruleEDouble ) )
            // InternalTutorial.g:3343:2: ( ruleEDouble )
            {
            // InternalTutorial.g:3343:2: ( ruleEDouble )
            // InternalTutorial.g:3344:3: ruleEDouble
            {
             before(grammarAccess.getBlockShapeAccess().getWidthEDoubleParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getBlockShapeAccess().getWidthEDoubleParserRuleCall_8_0()); 

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
    // $ANTLR end "rule__BlockShape__WidthAssignment_8"


    // $ANTLR start "rule__BlockShape__HeigthAssignment_12"
    // InternalTutorial.g:3353:1: rule__BlockShape__HeigthAssignment_12 : ( ruleEDouble ) ;
    public final void rule__BlockShape__HeigthAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:3357:1: ( ( ruleEDouble ) )
            // InternalTutorial.g:3358:2: ( ruleEDouble )
            {
            // InternalTutorial.g:3358:2: ( ruleEDouble )
            // InternalTutorial.g:3359:3: ruleEDouble
            {
             before(grammarAccess.getBlockShapeAccess().getHeigthEDoubleParserRuleCall_12_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getBlockShapeAccess().getHeigthEDoubleParserRuleCall_12_0()); 

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
    // $ANTLR end "rule__BlockShape__HeigthAssignment_12"


    // $ANTLR start "rule__BasicItemType__NameAssignment_1"
    // InternalTutorial.g:3368:1: rule__BasicItemType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__BasicItemType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:3372:1: ( ( RULE_ID ) )
            // InternalTutorial.g:3373:2: ( RULE_ID )
            {
            // InternalTutorial.g:3373:2: ( RULE_ID )
            // InternalTutorial.g:3374:3: RULE_ID
            {
             before(grammarAccess.getBasicItemTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBasicItemTypeAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__BasicItemType__NameAssignment_1"


    // $ANTLR start "rule__BasicItemType__MaterialAssignment_3"
    // InternalTutorial.g:3383:1: rule__BasicItemType__MaterialAssignment_3 : ( ruleMaterial ) ;
    public final void rule__BasicItemType__MaterialAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:3387:1: ( ( ruleMaterial ) )
            // InternalTutorial.g:3388:2: ( ruleMaterial )
            {
            // InternalTutorial.g:3388:2: ( ruleMaterial )
            // InternalTutorial.g:3389:3: ruleMaterial
            {
             before(grammarAccess.getBasicItemTypeAccess().getMaterialMaterialEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleMaterial();

            state._fsp--;

             after(grammarAccess.getBasicItemTypeAccess().getMaterialMaterialEnumRuleCall_3_0()); 

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
    // $ANTLR end "rule__BasicItemType__MaterialAssignment_3"


    // $ANTLR start "rule__BasicItemType__ShapeAssignment_8"
    // InternalTutorial.g:3398:1: rule__BasicItemType__ShapeAssignment_8 : ( ruleShape ) ;
    public final void rule__BasicItemType__ShapeAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:3402:1: ( ( ruleShape ) )
            // InternalTutorial.g:3403:2: ( ruleShape )
            {
            // InternalTutorial.g:3403:2: ( ruleShape )
            // InternalTutorial.g:3404:3: ruleShape
            {
             before(grammarAccess.getBasicItemTypeAccess().getShapeShapeParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleShape();

            state._fsp--;

             after(grammarAccess.getBasicItemTypeAccess().getShapeShapeParserRuleCall_8_0()); 

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
    // $ANTLR end "rule__BasicItemType__ShapeAssignment_8"


    // $ANTLR start "rule__BasicItemType__ColorAssignment_9"
    // InternalTutorial.g:3413:1: rule__BasicItemType__ColorAssignment_9 : ( ruleColor ) ;
    public final void rule__BasicItemType__ColorAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:3417:1: ( ( ruleColor ) )
            // InternalTutorial.g:3418:2: ( ruleColor )
            {
            // InternalTutorial.g:3418:2: ( ruleColor )
            // InternalTutorial.g:3419:3: ruleColor
            {
             before(grammarAccess.getBasicItemTypeAccess().getColorColorParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleColor();

            state._fsp--;

             after(grammarAccess.getBasicItemTypeAccess().getColorColorParserRuleCall_9_0()); 

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
    // $ANTLR end "rule__BasicItemType__ColorAssignment_9"


    // $ANTLR start "rule__BasicItemType__MarkersAssignment_10_3"
    // InternalTutorial.g:3428:1: rule__BasicItemType__MarkersAssignment_10_3 : ( ruleMarker ) ;
    public final void rule__BasicItemType__MarkersAssignment_10_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:3432:1: ( ( ruleMarker ) )
            // InternalTutorial.g:3433:2: ( ruleMarker )
            {
            // InternalTutorial.g:3433:2: ( ruleMarker )
            // InternalTutorial.g:3434:3: ruleMarker
            {
             before(grammarAccess.getBasicItemTypeAccess().getMarkersMarkerParserRuleCall_10_3_0()); 
            pushFollow(FOLLOW_2);
            ruleMarker();

            state._fsp--;

             after(grammarAccess.getBasicItemTypeAccess().getMarkersMarkerParserRuleCall_10_3_0()); 

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
    // $ANTLR end "rule__BasicItemType__MarkersAssignment_10_3"


    // $ANTLR start "rule__Color__NameAssignment_1"
    // InternalTutorial.g:3443:1: rule__Color__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Color__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:3447:1: ( ( ruleEString ) )
            // InternalTutorial.g:3448:2: ( ruleEString )
            {
            // InternalTutorial.g:3448:2: ( ruleEString )
            // InternalTutorial.g:3449:3: ruleEString
            {
             before(grammarAccess.getColorAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getColorAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Color__NameAssignment_1"


    // $ANTLR start "rule__Color__RedAssignment_6"
    // InternalTutorial.g:3458:1: rule__Color__RedAssignment_6 : ( ruleEInt ) ;
    public final void rule__Color__RedAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:3462:1: ( ( ruleEInt ) )
            // InternalTutorial.g:3463:2: ( ruleEInt )
            {
            // InternalTutorial.g:3463:2: ( ruleEInt )
            // InternalTutorial.g:3464:3: ruleEInt
            {
             before(grammarAccess.getColorAccess().getRedEIntParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getColorAccess().getRedEIntParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__Color__RedAssignment_6"


    // $ANTLR start "rule__Color__GreenAssignment_9"
    // InternalTutorial.g:3473:1: rule__Color__GreenAssignment_9 : ( ruleEInt ) ;
    public final void rule__Color__GreenAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:3477:1: ( ( ruleEInt ) )
            // InternalTutorial.g:3478:2: ( ruleEInt )
            {
            // InternalTutorial.g:3478:2: ( ruleEInt )
            // InternalTutorial.g:3479:3: ruleEInt
            {
             before(grammarAccess.getColorAccess().getGreenEIntParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getColorAccess().getGreenEIntParserRuleCall_9_0()); 

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
    // $ANTLR end "rule__Color__GreenAssignment_9"


    // $ANTLR start "rule__Color__BlueAssignment_12"
    // InternalTutorial.g:3488:1: rule__Color__BlueAssignment_12 : ( ruleEInt ) ;
    public final void rule__Color__BlueAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:3492:1: ( ( ruleEInt ) )
            // InternalTutorial.g:3493:2: ( ruleEInt )
            {
            // InternalTutorial.g:3493:2: ( ruleEInt )
            // InternalTutorial.g:3494:3: ruleEInt
            {
             before(grammarAccess.getColorAccess().getBlueEIntParserRuleCall_12_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getColorAccess().getBlueEIntParserRuleCall_12_0()); 

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
    // $ANTLR end "rule__Color__BlueAssignment_12"


    // $ANTLR start "rule__Marker__NameAssignment"
    // InternalTutorial.g:3503:1: rule__Marker__NameAssignment : ( RULE_ID ) ;
    public final void rule__Marker__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:3507:1: ( ( RULE_ID ) )
            // InternalTutorial.g:3508:2: ( RULE_ID )
            {
            // InternalTutorial.g:3508:2: ( RULE_ID )
            // InternalTutorial.g:3509:3: RULE_ID
            {
             before(grammarAccess.getMarkerAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMarkerAccess().getNameIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Marker__NameAssignment"


    // $ANTLR start "rule__ComplexItemType__NameAssignment_1"
    // InternalTutorial.g:3518:1: rule__ComplexItemType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ComplexItemType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:3522:1: ( ( RULE_ID ) )
            // InternalTutorial.g:3523:2: ( RULE_ID )
            {
            // InternalTutorial.g:3523:2: ( RULE_ID )
            // InternalTutorial.g:3524:3: RULE_ID
            {
             before(grammarAccess.getComplexItemTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getComplexItemTypeAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__ComplexItemType__NameAssignment_1"


    // $ANTLR start "rule__ComplexItemType__ComponentsAssignment_6"
    // InternalTutorial.g:3533:1: rule__ComplexItemType__ComponentsAssignment_6 : ( ruleComponent ) ;
    public final void rule__ComplexItemType__ComponentsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:3537:1: ( ( ruleComponent ) )
            // InternalTutorial.g:3538:2: ( ruleComponent )
            {
            // InternalTutorial.g:3538:2: ( ruleComponent )
            // InternalTutorial.g:3539:3: ruleComponent
            {
             before(grammarAccess.getComplexItemTypeAccess().getComponentsComponentParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleComponent();

            state._fsp--;

             after(grammarAccess.getComplexItemTypeAccess().getComponentsComponentParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__ComplexItemType__ComponentsAssignment_6"


    // $ANTLR start "rule__ComplexItemType__ComponentsAssignment_7"
    // InternalTutorial.g:3548:1: rule__ComplexItemType__ComponentsAssignment_7 : ( ruleComponent ) ;
    public final void rule__ComplexItemType__ComponentsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:3552:1: ( ( ruleComponent ) )
            // InternalTutorial.g:3553:2: ( ruleComponent )
            {
            // InternalTutorial.g:3553:2: ( ruleComponent )
            // InternalTutorial.g:3554:3: ruleComponent
            {
             before(grammarAccess.getComplexItemTypeAccess().getComponentsComponentParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleComponent();

            state._fsp--;

             after(grammarAccess.getComplexItemTypeAccess().getComponentsComponentParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__ComplexItemType__ComponentsAssignment_7"


    // $ANTLR start "rule__ComplexItemType__ItemConnectionsAssignment_12"
    // InternalTutorial.g:3563:1: rule__ComplexItemType__ItemConnectionsAssignment_12 : ( ruleItemConnection ) ;
    public final void rule__ComplexItemType__ItemConnectionsAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:3567:1: ( ( ruleItemConnection ) )
            // InternalTutorial.g:3568:2: ( ruleItemConnection )
            {
            // InternalTutorial.g:3568:2: ( ruleItemConnection )
            // InternalTutorial.g:3569:3: ruleItemConnection
            {
             before(grammarAccess.getComplexItemTypeAccess().getItemConnectionsItemConnectionParserRuleCall_12_0()); 
            pushFollow(FOLLOW_2);
            ruleItemConnection();

            state._fsp--;

             after(grammarAccess.getComplexItemTypeAccess().getItemConnectionsItemConnectionParserRuleCall_12_0()); 

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
    // $ANTLR end "rule__ComplexItemType__ItemConnectionsAssignment_12"


    // $ANTLR start "rule__Component__NameAssignment_0"
    // InternalTutorial.g:3578:1: rule__Component__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Component__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:3582:1: ( ( RULE_ID ) )
            // InternalTutorial.g:3583:2: ( RULE_ID )
            {
            // InternalTutorial.g:3583:2: ( RULE_ID )
            // InternalTutorial.g:3584:3: RULE_ID
            {
             before(grammarAccess.getComponentAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Component__NameAssignment_0"


    // $ANTLR start "rule__Component__ItemTypeAssignment_2"
    // InternalTutorial.g:3593:1: rule__Component__ItemTypeAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Component__ItemTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:3597:1: ( ( ( RULE_ID ) ) )
            // InternalTutorial.g:3598:2: ( ( RULE_ID ) )
            {
            // InternalTutorial.g:3598:2: ( ( RULE_ID ) )
            // InternalTutorial.g:3599:3: ( RULE_ID )
            {
             before(grammarAccess.getComponentAccess().getItemTypeBasicItemTypeCrossReference_2_0()); 
            // InternalTutorial.g:3600:3: ( RULE_ID )
            // InternalTutorial.g:3601:4: RULE_ID
            {
             before(grammarAccess.getComponentAccess().getItemTypeBasicItemTypeIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getItemTypeBasicItemTypeIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getComponentAccess().getItemTypeBasicItemTypeCrossReference_2_0()); 

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
    // $ANTLR end "rule__Component__ItemTypeAssignment_2"


    // $ANTLR start "rule__ItemConnection__ComponentAAssignment_0"
    // InternalTutorial.g:3612:1: rule__ItemConnection__ComponentAAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__ItemConnection__ComponentAAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:3616:1: ( ( ( RULE_ID ) ) )
            // InternalTutorial.g:3617:2: ( ( RULE_ID ) )
            {
            // InternalTutorial.g:3617:2: ( ( RULE_ID ) )
            // InternalTutorial.g:3618:3: ( RULE_ID )
            {
             before(grammarAccess.getItemConnectionAccess().getComponentAComponentCrossReference_0_0()); 
            // InternalTutorial.g:3619:3: ( RULE_ID )
            // InternalTutorial.g:3620:4: RULE_ID
            {
             before(grammarAccess.getItemConnectionAccess().getComponentAComponentIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getItemConnectionAccess().getComponentAComponentIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getItemConnectionAccess().getComponentAComponentCrossReference_0_0()); 

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
    // $ANTLR end "rule__ItemConnection__ComponentAAssignment_0"


    // $ANTLR start "rule__ItemConnection__MarkerAAssignment_2"
    // InternalTutorial.g:3631:1: rule__ItemConnection__MarkerAAssignment_2 : ( ( ruleEString ) ) ;
    public final void rule__ItemConnection__MarkerAAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:3635:1: ( ( ( ruleEString ) ) )
            // InternalTutorial.g:3636:2: ( ( ruleEString ) )
            {
            // InternalTutorial.g:3636:2: ( ( ruleEString ) )
            // InternalTutorial.g:3637:3: ( ruleEString )
            {
             before(grammarAccess.getItemConnectionAccess().getMarkerAMarkerCrossReference_2_0()); 
            // InternalTutorial.g:3638:3: ( ruleEString )
            // InternalTutorial.g:3639:4: ruleEString
            {
             before(grammarAccess.getItemConnectionAccess().getMarkerAMarkerEStringParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getItemConnectionAccess().getMarkerAMarkerEStringParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getItemConnectionAccess().getMarkerAMarkerCrossReference_2_0()); 

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
    // $ANTLR end "rule__ItemConnection__MarkerAAssignment_2"


    // $ANTLR start "rule__ItemConnection__ComponentBAssignment_5"
    // InternalTutorial.g:3650:1: rule__ItemConnection__ComponentBAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__ItemConnection__ComponentBAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:3654:1: ( ( ( RULE_ID ) ) )
            // InternalTutorial.g:3655:2: ( ( RULE_ID ) )
            {
            // InternalTutorial.g:3655:2: ( ( RULE_ID ) )
            // InternalTutorial.g:3656:3: ( RULE_ID )
            {
             before(grammarAccess.getItemConnectionAccess().getComponentBComponentCrossReference_5_0()); 
            // InternalTutorial.g:3657:3: ( RULE_ID )
            // InternalTutorial.g:3658:4: RULE_ID
            {
             before(grammarAccess.getItemConnectionAccess().getComponentBComponentIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getItemConnectionAccess().getComponentBComponentIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getItemConnectionAccess().getComponentBComponentCrossReference_5_0()); 

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
    // $ANTLR end "rule__ItemConnection__ComponentBAssignment_5"


    // $ANTLR start "rule__ItemConnection__MarkerBAssignment_7"
    // InternalTutorial.g:3669:1: rule__ItemConnection__MarkerBAssignment_7 : ( ( ruleEString ) ) ;
    public final void rule__ItemConnection__MarkerBAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:3673:1: ( ( ( ruleEString ) ) )
            // InternalTutorial.g:3674:2: ( ( ruleEString ) )
            {
            // InternalTutorial.g:3674:2: ( ( ruleEString ) )
            // InternalTutorial.g:3675:3: ( ruleEString )
            {
             before(grammarAccess.getItemConnectionAccess().getMarkerBMarkerCrossReference_7_0()); 
            // InternalTutorial.g:3676:3: ( ruleEString )
            // InternalTutorial.g:3677:4: ruleEString
            {
             before(grammarAccess.getItemConnectionAccess().getMarkerBMarkerEStringParserRuleCall_7_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getItemConnectionAccess().getMarkerBMarkerEStringParserRuleCall_7_0_1()); 

            }

             after(grammarAccess.getItemConnectionAccess().getMarkerBMarkerCrossReference_7_0()); 

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
    // $ANTLR end "rule__ItemConnection__MarkerBAssignment_7"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000001010000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000001010000002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000030000000040L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000000001E000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002100000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000100080000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000010000000040L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000001800L});

}