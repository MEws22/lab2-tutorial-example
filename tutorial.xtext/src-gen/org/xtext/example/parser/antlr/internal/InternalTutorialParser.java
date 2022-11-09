package org.xtext.example.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.services.TutorialGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTutorialParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'factory'", "'{'", "'}'", "'CylinderShape'", "'l'", "':'", "'cm'", "'r'", "'BlockShape'", "'w'", "'h'", "'basicItemType'", "'('", "')'", "'shape'", "'markers'", "'color'", "'g'", "'b'", "'complexItemType'", "'components'", "'connections'", "'<->'", "'-'", "'.'", "'E'", "'e'", "'WOOD'", "'STEEL'", "'GOLD'", "'COPPER'"
    };
    public static final int RULE_STRING=5;
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
    public static final int RULE_ID=4;
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

        public InternalTutorialParser(TokenStream input, TutorialGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Factory";
       	}

       	@Override
       	protected TutorialGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleFactory"
    // InternalTutorial.g:65:1: entryRuleFactory returns [EObject current=null] : iv_ruleFactory= ruleFactory EOF ;
    public final EObject entryRuleFactory() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFactory = null;


        try {
            // InternalTutorial.g:65:48: (iv_ruleFactory= ruleFactory EOF )
            // InternalTutorial.g:66:2: iv_ruleFactory= ruleFactory EOF
            {
             newCompositeNode(grammarAccess.getFactoryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFactory=ruleFactory();

            state._fsp--;

             current =iv_ruleFactory; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFactory"


    // $ANTLR start "ruleFactory"
    // InternalTutorial.g:72:1: ruleFactory returns [EObject current=null] : (otherlv_0= 'factory' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_itemTypes_3_0= ruleItemType ) )+ otherlv_4= '}' ) ;
    public final EObject ruleFactory() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_itemTypes_3_0 = null;



        	enterRule();

        try {
            // InternalTutorial.g:78:2: ( (otherlv_0= 'factory' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_itemTypes_3_0= ruleItemType ) )+ otherlv_4= '}' ) )
            // InternalTutorial.g:79:2: (otherlv_0= 'factory' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_itemTypes_3_0= ruleItemType ) )+ otherlv_4= '}' )
            {
            // InternalTutorial.g:79:2: (otherlv_0= 'factory' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_itemTypes_3_0= ruleItemType ) )+ otherlv_4= '}' )
            // InternalTutorial.g:80:3: otherlv_0= 'factory' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_itemTypes_3_0= ruleItemType ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getFactoryAccess().getFactoryKeyword_0());
            		
            // InternalTutorial.g:84:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTutorial.g:85:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTutorial.g:85:4: (lv_name_1_0= RULE_ID )
            // InternalTutorial.g:86:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getFactoryAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFactoryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getFactoryAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalTutorial.g:106:3: ( (lv_itemTypes_3_0= ruleItemType ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==22||LA1_0==30) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalTutorial.g:107:4: (lv_itemTypes_3_0= ruleItemType )
            	    {
            	    // InternalTutorial.g:107:4: (lv_itemTypes_3_0= ruleItemType )
            	    // InternalTutorial.g:108:5: lv_itemTypes_3_0= ruleItemType
            	    {

            	    					newCompositeNode(grammarAccess.getFactoryAccess().getItemTypesItemTypeParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_itemTypes_3_0=ruleItemType();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFactoryRule());
            	    					}
            	    					add(
            	    						current,
            	    						"itemTypes",
            	    						lv_itemTypes_3_0,
            	    						"org.xtext.example.Tutorial.ItemType");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getFactoryAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleFactory"


    // $ANTLR start "entryRuleItemType"
    // InternalTutorial.g:133:1: entryRuleItemType returns [EObject current=null] : iv_ruleItemType= ruleItemType EOF ;
    public final EObject entryRuleItemType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItemType = null;


        try {
            // InternalTutorial.g:133:49: (iv_ruleItemType= ruleItemType EOF )
            // InternalTutorial.g:134:2: iv_ruleItemType= ruleItemType EOF
            {
             newCompositeNode(grammarAccess.getItemTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleItemType=ruleItemType();

            state._fsp--;

             current =iv_ruleItemType; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleItemType"


    // $ANTLR start "ruleItemType"
    // InternalTutorial.g:140:1: ruleItemType returns [EObject current=null] : (this_BasicItemType_0= ruleBasicItemType | this_ComplexItemType_1= ruleComplexItemType ) ;
    public final EObject ruleItemType() throws RecognitionException {
        EObject current = null;

        EObject this_BasicItemType_0 = null;

        EObject this_ComplexItemType_1 = null;



        	enterRule();

        try {
            // InternalTutorial.g:146:2: ( (this_BasicItemType_0= ruleBasicItemType | this_ComplexItemType_1= ruleComplexItemType ) )
            // InternalTutorial.g:147:2: (this_BasicItemType_0= ruleBasicItemType | this_ComplexItemType_1= ruleComplexItemType )
            {
            // InternalTutorial.g:147:2: (this_BasicItemType_0= ruleBasicItemType | this_ComplexItemType_1= ruleComplexItemType )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==22) ) {
                alt2=1;
            }
            else if ( (LA2_0==30) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalTutorial.g:148:3: this_BasicItemType_0= ruleBasicItemType
                    {

                    			newCompositeNode(grammarAccess.getItemTypeAccess().getBasicItemTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_BasicItemType_0=ruleBasicItemType();

                    state._fsp--;


                    			current = this_BasicItemType_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTutorial.g:157:3: this_ComplexItemType_1= ruleComplexItemType
                    {

                    			newCompositeNode(grammarAccess.getItemTypeAccess().getComplexItemTypeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ComplexItemType_1=ruleComplexItemType();

                    state._fsp--;


                    			current = this_ComplexItemType_1;
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
    // $ANTLR end "ruleItemType"


    // $ANTLR start "entryRuleShape"
    // InternalTutorial.g:169:1: entryRuleShape returns [EObject current=null] : iv_ruleShape= ruleShape EOF ;
    public final EObject entryRuleShape() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShape = null;


        try {
            // InternalTutorial.g:169:46: (iv_ruleShape= ruleShape EOF )
            // InternalTutorial.g:170:2: iv_ruleShape= ruleShape EOF
            {
             newCompositeNode(grammarAccess.getShapeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleShape=ruleShape();

            state._fsp--;

             current =iv_ruleShape; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleShape"


    // $ANTLR start "ruleShape"
    // InternalTutorial.g:176:1: ruleShape returns [EObject current=null] : (this_CylinderShape_0= ruleCylinderShape | this_BlockShape_1= ruleBlockShape ) ;
    public final EObject ruleShape() throws RecognitionException {
        EObject current = null;

        EObject this_CylinderShape_0 = null;

        EObject this_BlockShape_1 = null;



        	enterRule();

        try {
            // InternalTutorial.g:182:2: ( (this_CylinderShape_0= ruleCylinderShape | this_BlockShape_1= ruleBlockShape ) )
            // InternalTutorial.g:183:2: (this_CylinderShape_0= ruleCylinderShape | this_BlockShape_1= ruleBlockShape )
            {
            // InternalTutorial.g:183:2: (this_CylinderShape_0= ruleCylinderShape | this_BlockShape_1= ruleBlockShape )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            else if ( (LA3_0==19) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalTutorial.g:184:3: this_CylinderShape_0= ruleCylinderShape
                    {

                    			newCompositeNode(grammarAccess.getShapeAccess().getCylinderShapeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_CylinderShape_0=ruleCylinderShape();

                    state._fsp--;


                    			current = this_CylinderShape_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTutorial.g:193:3: this_BlockShape_1= ruleBlockShape
                    {

                    			newCompositeNode(grammarAccess.getShapeAccess().getBlockShapeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_BlockShape_1=ruleBlockShape();

                    state._fsp--;


                    			current = this_BlockShape_1;
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
    // $ANTLR end "ruleShape"


    // $ANTLR start "entryRuleCylinderShape"
    // InternalTutorial.g:205:1: entryRuleCylinderShape returns [EObject current=null] : iv_ruleCylinderShape= ruleCylinderShape EOF ;
    public final EObject entryRuleCylinderShape() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCylinderShape = null;


        try {
            // InternalTutorial.g:205:54: (iv_ruleCylinderShape= ruleCylinderShape EOF )
            // InternalTutorial.g:206:2: iv_ruleCylinderShape= ruleCylinderShape EOF
            {
             newCompositeNode(grammarAccess.getCylinderShapeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCylinderShape=ruleCylinderShape();

            state._fsp--;

             current =iv_ruleCylinderShape; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCylinderShape"


    // $ANTLR start "ruleCylinderShape"
    // InternalTutorial.g:212:1: ruleCylinderShape returns [EObject current=null] : (otherlv_0= 'CylinderShape' otherlv_1= '{' otherlv_2= 'l' otherlv_3= ':' ( (lv_length_4_0= ruleEDouble ) ) otherlv_5= 'cm' otherlv_6= 'r' otherlv_7= ':' ( (lv_radius_8_0= ruleEDouble ) ) otherlv_9= 'cm' otherlv_10= '}' ) ;
    public final EObject ruleCylinderShape() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_length_4_0 = null;

        AntlrDatatypeRuleToken lv_radius_8_0 = null;



        	enterRule();

        try {
            // InternalTutorial.g:218:2: ( (otherlv_0= 'CylinderShape' otherlv_1= '{' otherlv_2= 'l' otherlv_3= ':' ( (lv_length_4_0= ruleEDouble ) ) otherlv_5= 'cm' otherlv_6= 'r' otherlv_7= ':' ( (lv_radius_8_0= ruleEDouble ) ) otherlv_9= 'cm' otherlv_10= '}' ) )
            // InternalTutorial.g:219:2: (otherlv_0= 'CylinderShape' otherlv_1= '{' otherlv_2= 'l' otherlv_3= ':' ( (lv_length_4_0= ruleEDouble ) ) otherlv_5= 'cm' otherlv_6= 'r' otherlv_7= ':' ( (lv_radius_8_0= ruleEDouble ) ) otherlv_9= 'cm' otherlv_10= '}' )
            {
            // InternalTutorial.g:219:2: (otherlv_0= 'CylinderShape' otherlv_1= '{' otherlv_2= 'l' otherlv_3= ':' ( (lv_length_4_0= ruleEDouble ) ) otherlv_5= 'cm' otherlv_6= 'r' otherlv_7= ':' ( (lv_radius_8_0= ruleEDouble ) ) otherlv_9= 'cm' otherlv_10= '}' )
            // InternalTutorial.g:220:3: otherlv_0= 'CylinderShape' otherlv_1= '{' otherlv_2= 'l' otherlv_3= ':' ( (lv_length_4_0= ruleEDouble ) ) otherlv_5= 'cm' otherlv_6= 'r' otherlv_7= ':' ( (lv_radius_8_0= ruleEDouble ) ) otherlv_9= 'cm' otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getCylinderShapeAccess().getCylinderShapeKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getCylinderShapeAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getCylinderShapeAccess().getLKeyword_2());
            		
            otherlv_3=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getCylinderShapeAccess().getColonKeyword_3());
            		
            // InternalTutorial.g:236:3: ( (lv_length_4_0= ruleEDouble ) )
            // InternalTutorial.g:237:4: (lv_length_4_0= ruleEDouble )
            {
            // InternalTutorial.g:237:4: (lv_length_4_0= ruleEDouble )
            // InternalTutorial.g:238:5: lv_length_4_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getCylinderShapeAccess().getLengthEDoubleParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_10);
            lv_length_4_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCylinderShapeRule());
            					}
            					set(
            						current,
            						"length",
            						lv_length_4_0,
            						"org.xtext.example.Tutorial.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_5, grammarAccess.getCylinderShapeAccess().getCmKeyword_5());
            		
            otherlv_6=(Token)match(input,18,FOLLOW_8); 

            			newLeafNode(otherlv_6, grammarAccess.getCylinderShapeAccess().getRKeyword_6());
            		
            otherlv_7=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_7, grammarAccess.getCylinderShapeAccess().getColonKeyword_7());
            		
            // InternalTutorial.g:267:3: ( (lv_radius_8_0= ruleEDouble ) )
            // InternalTutorial.g:268:4: (lv_radius_8_0= ruleEDouble )
            {
            // InternalTutorial.g:268:4: (lv_radius_8_0= ruleEDouble )
            // InternalTutorial.g:269:5: lv_radius_8_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getCylinderShapeAccess().getRadiusEDoubleParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_10);
            lv_radius_8_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCylinderShapeRule());
            					}
            					set(
            						current,
            						"radius",
            						lv_radius_8_0,
            						"org.xtext.example.Tutorial.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,17,FOLLOW_12); 

            			newLeafNode(otherlv_9, grammarAccess.getCylinderShapeAccess().getCmKeyword_9());
            		
            otherlv_10=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getCylinderShapeAccess().getRightCurlyBracketKeyword_10());
            		

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
    // $ANTLR end "ruleCylinderShape"


    // $ANTLR start "entryRuleBlockShape"
    // InternalTutorial.g:298:1: entryRuleBlockShape returns [EObject current=null] : iv_ruleBlockShape= ruleBlockShape EOF ;
    public final EObject entryRuleBlockShape() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlockShape = null;


        try {
            // InternalTutorial.g:298:51: (iv_ruleBlockShape= ruleBlockShape EOF )
            // InternalTutorial.g:299:2: iv_ruleBlockShape= ruleBlockShape EOF
            {
             newCompositeNode(grammarAccess.getBlockShapeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBlockShape=ruleBlockShape();

            state._fsp--;

             current =iv_ruleBlockShape; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBlockShape"


    // $ANTLR start "ruleBlockShape"
    // InternalTutorial.g:305:1: ruleBlockShape returns [EObject current=null] : (otherlv_0= 'BlockShape' otherlv_1= '{' otherlv_2= 'l' otherlv_3= ':' ( (lv_length_4_0= ruleEDouble ) ) otherlv_5= 'cm' otherlv_6= 'w' otherlv_7= ':' ( (lv_width_8_0= ruleEDouble ) ) otherlv_9= 'cm' otherlv_10= 'h' otherlv_11= ':' ( (lv_heigth_12_0= ruleEDouble ) ) otherlv_13= 'cm' otherlv_14= '}' ) ;
    public final EObject ruleBlockShape() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_length_4_0 = null;

        AntlrDatatypeRuleToken lv_width_8_0 = null;

        AntlrDatatypeRuleToken lv_heigth_12_0 = null;



        	enterRule();

        try {
            // InternalTutorial.g:311:2: ( (otherlv_0= 'BlockShape' otherlv_1= '{' otherlv_2= 'l' otherlv_3= ':' ( (lv_length_4_0= ruleEDouble ) ) otherlv_5= 'cm' otherlv_6= 'w' otherlv_7= ':' ( (lv_width_8_0= ruleEDouble ) ) otherlv_9= 'cm' otherlv_10= 'h' otherlv_11= ':' ( (lv_heigth_12_0= ruleEDouble ) ) otherlv_13= 'cm' otherlv_14= '}' ) )
            // InternalTutorial.g:312:2: (otherlv_0= 'BlockShape' otherlv_1= '{' otherlv_2= 'l' otherlv_3= ':' ( (lv_length_4_0= ruleEDouble ) ) otherlv_5= 'cm' otherlv_6= 'w' otherlv_7= ':' ( (lv_width_8_0= ruleEDouble ) ) otherlv_9= 'cm' otherlv_10= 'h' otherlv_11= ':' ( (lv_heigth_12_0= ruleEDouble ) ) otherlv_13= 'cm' otherlv_14= '}' )
            {
            // InternalTutorial.g:312:2: (otherlv_0= 'BlockShape' otherlv_1= '{' otherlv_2= 'l' otherlv_3= ':' ( (lv_length_4_0= ruleEDouble ) ) otherlv_5= 'cm' otherlv_6= 'w' otherlv_7= ':' ( (lv_width_8_0= ruleEDouble ) ) otherlv_9= 'cm' otherlv_10= 'h' otherlv_11= ':' ( (lv_heigth_12_0= ruleEDouble ) ) otherlv_13= 'cm' otherlv_14= '}' )
            // InternalTutorial.g:313:3: otherlv_0= 'BlockShape' otherlv_1= '{' otherlv_2= 'l' otherlv_3= ':' ( (lv_length_4_0= ruleEDouble ) ) otherlv_5= 'cm' otherlv_6= 'w' otherlv_7= ':' ( (lv_width_8_0= ruleEDouble ) ) otherlv_9= 'cm' otherlv_10= 'h' otherlv_11= ':' ( (lv_heigth_12_0= ruleEDouble ) ) otherlv_13= 'cm' otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getBlockShapeAccess().getBlockShapeKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getBlockShapeAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getBlockShapeAccess().getLKeyword_2());
            		
            otherlv_3=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getBlockShapeAccess().getColonKeyword_3());
            		
            // InternalTutorial.g:329:3: ( (lv_length_4_0= ruleEDouble ) )
            // InternalTutorial.g:330:4: (lv_length_4_0= ruleEDouble )
            {
            // InternalTutorial.g:330:4: (lv_length_4_0= ruleEDouble )
            // InternalTutorial.g:331:5: lv_length_4_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getBlockShapeAccess().getLengthEDoubleParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_10);
            lv_length_4_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBlockShapeRule());
            					}
            					set(
            						current,
            						"length",
            						lv_length_4_0,
            						"org.xtext.example.Tutorial.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,17,FOLLOW_13); 

            			newLeafNode(otherlv_5, grammarAccess.getBlockShapeAccess().getCmKeyword_5());
            		
            otherlv_6=(Token)match(input,20,FOLLOW_8); 

            			newLeafNode(otherlv_6, grammarAccess.getBlockShapeAccess().getWKeyword_6());
            		
            otherlv_7=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_7, grammarAccess.getBlockShapeAccess().getColonKeyword_7());
            		
            // InternalTutorial.g:360:3: ( (lv_width_8_0= ruleEDouble ) )
            // InternalTutorial.g:361:4: (lv_width_8_0= ruleEDouble )
            {
            // InternalTutorial.g:361:4: (lv_width_8_0= ruleEDouble )
            // InternalTutorial.g:362:5: lv_width_8_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getBlockShapeAccess().getWidthEDoubleParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_10);
            lv_width_8_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBlockShapeRule());
            					}
            					set(
            						current,
            						"width",
            						lv_width_8_0,
            						"org.xtext.example.Tutorial.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,17,FOLLOW_14); 

            			newLeafNode(otherlv_9, grammarAccess.getBlockShapeAccess().getCmKeyword_9());
            		
            otherlv_10=(Token)match(input,21,FOLLOW_8); 

            			newLeafNode(otherlv_10, grammarAccess.getBlockShapeAccess().getHKeyword_10());
            		
            otherlv_11=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_11, grammarAccess.getBlockShapeAccess().getColonKeyword_11());
            		
            // InternalTutorial.g:391:3: ( (lv_heigth_12_0= ruleEDouble ) )
            // InternalTutorial.g:392:4: (lv_heigth_12_0= ruleEDouble )
            {
            // InternalTutorial.g:392:4: (lv_heigth_12_0= ruleEDouble )
            // InternalTutorial.g:393:5: lv_heigth_12_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getBlockShapeAccess().getHeigthEDoubleParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_10);
            lv_heigth_12_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBlockShapeRule());
            					}
            					set(
            						current,
            						"heigth",
            						lv_heigth_12_0,
            						"org.xtext.example.Tutorial.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_13=(Token)match(input,17,FOLLOW_12); 

            			newLeafNode(otherlv_13, grammarAccess.getBlockShapeAccess().getCmKeyword_13());
            		
            otherlv_14=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getBlockShapeAccess().getRightCurlyBracketKeyword_14());
            		

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
    // $ANTLR end "ruleBlockShape"


    // $ANTLR start "entryRuleBasicItemType"
    // InternalTutorial.g:422:1: entryRuleBasicItemType returns [EObject current=null] : iv_ruleBasicItemType= ruleBasicItemType EOF ;
    public final EObject entryRuleBasicItemType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicItemType = null;


        try {
            // InternalTutorial.g:422:54: (iv_ruleBasicItemType= ruleBasicItemType EOF )
            // InternalTutorial.g:423:2: iv_ruleBasicItemType= ruleBasicItemType EOF
            {
             newCompositeNode(grammarAccess.getBasicItemTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBasicItemType=ruleBasicItemType();

            state._fsp--;

             current =iv_ruleBasicItemType; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBasicItemType"


    // $ANTLR start "ruleBasicItemType"
    // InternalTutorial.g:429:1: ruleBasicItemType returns [EObject current=null] : (otherlv_0= 'basicItemType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_material_3_0= ruleMaterial ) ) otherlv_4= ')' otherlv_5= '{' otherlv_6= 'shape' otherlv_7= ':' ( (lv_shape_8_0= ruleShape ) ) ( (lv_color_9_0= ruleColor ) ) (otherlv_10= 'markers' otherlv_11= ':' otherlv_12= '{' ( (lv_markers_13_0= ruleMarker ) )+ otherlv_14= '}' )? otherlv_15= '}' ) ;
    public final EObject ruleBasicItemType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Enumerator lv_material_3_0 = null;

        EObject lv_shape_8_0 = null;

        EObject lv_color_9_0 = null;

        EObject lv_markers_13_0 = null;



        	enterRule();

        try {
            // InternalTutorial.g:435:2: ( (otherlv_0= 'basicItemType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_material_3_0= ruleMaterial ) ) otherlv_4= ')' otherlv_5= '{' otherlv_6= 'shape' otherlv_7= ':' ( (lv_shape_8_0= ruleShape ) ) ( (lv_color_9_0= ruleColor ) ) (otherlv_10= 'markers' otherlv_11= ':' otherlv_12= '{' ( (lv_markers_13_0= ruleMarker ) )+ otherlv_14= '}' )? otherlv_15= '}' ) )
            // InternalTutorial.g:436:2: (otherlv_0= 'basicItemType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_material_3_0= ruleMaterial ) ) otherlv_4= ')' otherlv_5= '{' otherlv_6= 'shape' otherlv_7= ':' ( (lv_shape_8_0= ruleShape ) ) ( (lv_color_9_0= ruleColor ) ) (otherlv_10= 'markers' otherlv_11= ':' otherlv_12= '{' ( (lv_markers_13_0= ruleMarker ) )+ otherlv_14= '}' )? otherlv_15= '}' )
            {
            // InternalTutorial.g:436:2: (otherlv_0= 'basicItemType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_material_3_0= ruleMaterial ) ) otherlv_4= ')' otherlv_5= '{' otherlv_6= 'shape' otherlv_7= ':' ( (lv_shape_8_0= ruleShape ) ) ( (lv_color_9_0= ruleColor ) ) (otherlv_10= 'markers' otherlv_11= ':' otherlv_12= '{' ( (lv_markers_13_0= ruleMarker ) )+ otherlv_14= '}' )? otherlv_15= '}' )
            // InternalTutorial.g:437:3: otherlv_0= 'basicItemType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_material_3_0= ruleMaterial ) ) otherlv_4= ')' otherlv_5= '{' otherlv_6= 'shape' otherlv_7= ':' ( (lv_shape_8_0= ruleShape ) ) ( (lv_color_9_0= ruleColor ) ) (otherlv_10= 'markers' otherlv_11= ':' otherlv_12= '{' ( (lv_markers_13_0= ruleMarker ) )+ otherlv_14= '}' )? otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getBasicItemTypeAccess().getBasicItemTypeKeyword_0());
            		
            // InternalTutorial.g:441:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTutorial.g:442:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTutorial.g:442:4: (lv_name_1_0= RULE_ID )
            // InternalTutorial.g:443:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_name_1_0, grammarAccess.getBasicItemTypeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBasicItemTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getBasicItemTypeAccess().getLeftParenthesisKeyword_2());
            		
            // InternalTutorial.g:463:3: ( (lv_material_3_0= ruleMaterial ) )
            // InternalTutorial.g:464:4: (lv_material_3_0= ruleMaterial )
            {
            // InternalTutorial.g:464:4: (lv_material_3_0= ruleMaterial )
            // InternalTutorial.g:465:5: lv_material_3_0= ruleMaterial
            {

            					newCompositeNode(grammarAccess.getBasicItemTypeAccess().getMaterialMaterialEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_17);
            lv_material_3_0=ruleMaterial();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBasicItemTypeRule());
            					}
            					set(
            						current,
            						"material",
            						lv_material_3_0,
            						"org.xtext.example.Tutorial.Material");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getBasicItemTypeAccess().getRightParenthesisKeyword_4());
            		
            otherlv_5=(Token)match(input,12,FOLLOW_18); 

            			newLeafNode(otherlv_5, grammarAccess.getBasicItemTypeAccess().getLeftCurlyBracketKeyword_5());
            		
            otherlv_6=(Token)match(input,25,FOLLOW_8); 

            			newLeafNode(otherlv_6, grammarAccess.getBasicItemTypeAccess().getShapeKeyword_6());
            		
            otherlv_7=(Token)match(input,16,FOLLOW_19); 

            			newLeafNode(otherlv_7, grammarAccess.getBasicItemTypeAccess().getColonKeyword_7());
            		
            // InternalTutorial.g:498:3: ( (lv_shape_8_0= ruleShape ) )
            // InternalTutorial.g:499:4: (lv_shape_8_0= ruleShape )
            {
            // InternalTutorial.g:499:4: (lv_shape_8_0= ruleShape )
            // InternalTutorial.g:500:5: lv_shape_8_0= ruleShape
            {

            					newCompositeNode(grammarAccess.getBasicItemTypeAccess().getShapeShapeParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_20);
            lv_shape_8_0=ruleShape();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBasicItemTypeRule());
            					}
            					set(
            						current,
            						"shape",
            						lv_shape_8_0,
            						"org.xtext.example.Tutorial.Shape");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTutorial.g:517:3: ( (lv_color_9_0= ruleColor ) )
            // InternalTutorial.g:518:4: (lv_color_9_0= ruleColor )
            {
            // InternalTutorial.g:518:4: (lv_color_9_0= ruleColor )
            // InternalTutorial.g:519:5: lv_color_9_0= ruleColor
            {

            					newCompositeNode(grammarAccess.getBasicItemTypeAccess().getColorColorParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_21);
            lv_color_9_0=ruleColor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBasicItemTypeRule());
            					}
            					set(
            						current,
            						"color",
            						lv_color_9_0,
            						"org.xtext.example.Tutorial.Color");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTutorial.g:536:3: (otherlv_10= 'markers' otherlv_11= ':' otherlv_12= '{' ( (lv_markers_13_0= ruleMarker ) )+ otherlv_14= '}' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==26) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalTutorial.g:537:4: otherlv_10= 'markers' otherlv_11= ':' otherlv_12= '{' ( (lv_markers_13_0= ruleMarker ) )+ otherlv_14= '}'
                    {
                    otherlv_10=(Token)match(input,26,FOLLOW_8); 

                    				newLeafNode(otherlv_10, grammarAccess.getBasicItemTypeAccess().getMarkersKeyword_10_0());
                    			
                    otherlv_11=(Token)match(input,16,FOLLOW_4); 

                    				newLeafNode(otherlv_11, grammarAccess.getBasicItemTypeAccess().getColonKeyword_10_1());
                    			
                    otherlv_12=(Token)match(input,12,FOLLOW_3); 

                    				newLeafNode(otherlv_12, grammarAccess.getBasicItemTypeAccess().getLeftCurlyBracketKeyword_10_2());
                    			
                    // InternalTutorial.g:549:4: ( (lv_markers_13_0= ruleMarker ) )+
                    int cnt4=0;
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==RULE_ID) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalTutorial.g:550:5: (lv_markers_13_0= ruleMarker )
                    	    {
                    	    // InternalTutorial.g:550:5: (lv_markers_13_0= ruleMarker )
                    	    // InternalTutorial.g:551:6: lv_markers_13_0= ruleMarker
                    	    {

                    	    						newCompositeNode(grammarAccess.getBasicItemTypeAccess().getMarkersMarkerParserRuleCall_10_3_0());
                    	    					
                    	    pushFollow(FOLLOW_22);
                    	    lv_markers_13_0=ruleMarker();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getBasicItemTypeRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"markers",
                    	    							lv_markers_13_0,
                    	    							"org.xtext.example.Tutorial.Marker");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt4 >= 1 ) break loop4;
                                EarlyExitException eee =
                                    new EarlyExitException(4, input);
                                throw eee;
                        }
                        cnt4++;
                    } while (true);

                    otherlv_14=(Token)match(input,13,FOLLOW_12); 

                    				newLeafNode(otherlv_14, grammarAccess.getBasicItemTypeAccess().getRightCurlyBracketKeyword_10_4());
                    			

                    }
                    break;

            }

            otherlv_15=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getBasicItemTypeAccess().getRightCurlyBracketKeyword_11());
            		

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
    // $ANTLR end "ruleBasicItemType"


    // $ANTLR start "entryRuleColor"
    // InternalTutorial.g:581:1: entryRuleColor returns [EObject current=null] : iv_ruleColor= ruleColor EOF ;
    public final EObject entryRuleColor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColor = null;


        try {
            // InternalTutorial.g:581:46: (iv_ruleColor= ruleColor EOF )
            // InternalTutorial.g:582:2: iv_ruleColor= ruleColor EOF
            {
             newCompositeNode(grammarAccess.getColorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColor=ruleColor();

            state._fsp--;

             current =iv_ruleColor; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleColor"


    // $ANTLR start "ruleColor"
    // InternalTutorial.g:588:1: ruleColor returns [EObject current=null] : (otherlv_0= 'color' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' otherlv_3= '{' otherlv_4= 'r' otherlv_5= ':' ( (lv_red_6_0= ruleEInt ) ) otherlv_7= 'g' otherlv_8= ':' ( (lv_green_9_0= ruleEInt ) ) otherlv_10= 'b' otherlv_11= ':' ( (lv_blue_12_0= ruleEInt ) ) otherlv_13= '}' ) ;
    public final EObject ruleColor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_red_6_0 = null;

        AntlrDatatypeRuleToken lv_green_9_0 = null;

        AntlrDatatypeRuleToken lv_blue_12_0 = null;



        	enterRule();

        try {
            // InternalTutorial.g:594:2: ( (otherlv_0= 'color' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' otherlv_3= '{' otherlv_4= 'r' otherlv_5= ':' ( (lv_red_6_0= ruleEInt ) ) otherlv_7= 'g' otherlv_8= ':' ( (lv_green_9_0= ruleEInt ) ) otherlv_10= 'b' otherlv_11= ':' ( (lv_blue_12_0= ruleEInt ) ) otherlv_13= '}' ) )
            // InternalTutorial.g:595:2: (otherlv_0= 'color' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' otherlv_3= '{' otherlv_4= 'r' otherlv_5= ':' ( (lv_red_6_0= ruleEInt ) ) otherlv_7= 'g' otherlv_8= ':' ( (lv_green_9_0= ruleEInt ) ) otherlv_10= 'b' otherlv_11= ':' ( (lv_blue_12_0= ruleEInt ) ) otherlv_13= '}' )
            {
            // InternalTutorial.g:595:2: (otherlv_0= 'color' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' otherlv_3= '{' otherlv_4= 'r' otherlv_5= ':' ( (lv_red_6_0= ruleEInt ) ) otherlv_7= 'g' otherlv_8= ':' ( (lv_green_9_0= ruleEInt ) ) otherlv_10= 'b' otherlv_11= ':' ( (lv_blue_12_0= ruleEInt ) ) otherlv_13= '}' )
            // InternalTutorial.g:596:3: otherlv_0= 'color' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' otherlv_3= '{' otherlv_4= 'r' otherlv_5= ':' ( (lv_red_6_0= ruleEInt ) ) otherlv_7= 'g' otherlv_8= ':' ( (lv_green_9_0= ruleEInt ) ) otherlv_10= 'b' otherlv_11= ':' ( (lv_blue_12_0= ruleEInt ) ) otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getColorAccess().getColorKeyword_0());
            		
            // InternalTutorial.g:600:3: ( (lv_name_1_0= ruleEString ) )
            // InternalTutorial.g:601:4: (lv_name_1_0= ruleEString )
            {
            // InternalTutorial.g:601:4: (lv_name_1_0= ruleEString )
            // InternalTutorial.g:602:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getColorAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_8);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getColorRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.Tutorial.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getColorAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getColorAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,18,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getColorAccess().getRKeyword_4());
            		
            otherlv_5=(Token)match(input,16,FOLLOW_24); 

            			newLeafNode(otherlv_5, grammarAccess.getColorAccess().getColonKeyword_5());
            		
            // InternalTutorial.g:635:3: ( (lv_red_6_0= ruleEInt ) )
            // InternalTutorial.g:636:4: (lv_red_6_0= ruleEInt )
            {
            // InternalTutorial.g:636:4: (lv_red_6_0= ruleEInt )
            // InternalTutorial.g:637:5: lv_red_6_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getColorAccess().getRedEIntParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_25);
            lv_red_6_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getColorRule());
            					}
            					set(
            						current,
            						"red",
            						lv_red_6_0,
            						"org.xtext.example.Tutorial.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,28,FOLLOW_8); 

            			newLeafNode(otherlv_7, grammarAccess.getColorAccess().getGKeyword_7());
            		
            otherlv_8=(Token)match(input,16,FOLLOW_24); 

            			newLeafNode(otherlv_8, grammarAccess.getColorAccess().getColonKeyword_8());
            		
            // InternalTutorial.g:662:3: ( (lv_green_9_0= ruleEInt ) )
            // InternalTutorial.g:663:4: (lv_green_9_0= ruleEInt )
            {
            // InternalTutorial.g:663:4: (lv_green_9_0= ruleEInt )
            // InternalTutorial.g:664:5: lv_green_9_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getColorAccess().getGreenEIntParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_26);
            lv_green_9_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getColorRule());
            					}
            					set(
            						current,
            						"green",
            						lv_green_9_0,
            						"org.xtext.example.Tutorial.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,29,FOLLOW_8); 

            			newLeafNode(otherlv_10, grammarAccess.getColorAccess().getBKeyword_10());
            		
            otherlv_11=(Token)match(input,16,FOLLOW_24); 

            			newLeafNode(otherlv_11, grammarAccess.getColorAccess().getColonKeyword_11());
            		
            // InternalTutorial.g:689:3: ( (lv_blue_12_0= ruleEInt ) )
            // InternalTutorial.g:690:4: (lv_blue_12_0= ruleEInt )
            {
            // InternalTutorial.g:690:4: (lv_blue_12_0= ruleEInt )
            // InternalTutorial.g:691:5: lv_blue_12_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getColorAccess().getBlueEIntParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_12);
            lv_blue_12_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getColorRule());
            					}
            					set(
            						current,
            						"blue",
            						lv_blue_12_0,
            						"org.xtext.example.Tutorial.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_13=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getColorAccess().getRightCurlyBracketKeyword_13());
            		

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
    // $ANTLR end "ruleColor"


    // $ANTLR start "entryRuleMarker"
    // InternalTutorial.g:716:1: entryRuleMarker returns [EObject current=null] : iv_ruleMarker= ruleMarker EOF ;
    public final EObject entryRuleMarker() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMarker = null;


        try {
            // InternalTutorial.g:716:47: (iv_ruleMarker= ruleMarker EOF )
            // InternalTutorial.g:717:2: iv_ruleMarker= ruleMarker EOF
            {
             newCompositeNode(grammarAccess.getMarkerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMarker=ruleMarker();

            state._fsp--;

             current =iv_ruleMarker; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMarker"


    // $ANTLR start "ruleMarker"
    // InternalTutorial.g:723:1: ruleMarker returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleMarker() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalTutorial.g:729:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalTutorial.g:730:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalTutorial.g:730:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalTutorial.g:731:3: (lv_name_0_0= RULE_ID )
            {
            // InternalTutorial.g:731:3: (lv_name_0_0= RULE_ID )
            // InternalTutorial.g:732:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getMarkerAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getMarkerRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

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
    // $ANTLR end "ruleMarker"


    // $ANTLR start "entryRuleComplexItemType"
    // InternalTutorial.g:751:1: entryRuleComplexItemType returns [EObject current=null] : iv_ruleComplexItemType= ruleComplexItemType EOF ;
    public final EObject entryRuleComplexItemType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplexItemType = null;


        try {
            // InternalTutorial.g:751:56: (iv_ruleComplexItemType= ruleComplexItemType EOF )
            // InternalTutorial.g:752:2: iv_ruleComplexItemType= ruleComplexItemType EOF
            {
             newCompositeNode(grammarAccess.getComplexItemTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComplexItemType=ruleComplexItemType();

            state._fsp--;

             current =iv_ruleComplexItemType; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleComplexItemType"


    // $ANTLR start "ruleComplexItemType"
    // InternalTutorial.g:758:1: ruleComplexItemType returns [EObject current=null] : (otherlv_0= 'complexItemType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'components' otherlv_4= ':' otherlv_5= '{' ( (lv_components_6_0= ruleComponent ) ) ( (lv_components_7_0= ruleComponent ) )+ otherlv_8= '}' otherlv_9= 'connections' otherlv_10= ':' otherlv_11= '{' ( (lv_itemConnections_12_0= ruleItemConnection ) )+ otherlv_13= '}' otherlv_14= '}' ) ;
    public final EObject ruleComplexItemType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        EObject lv_components_6_0 = null;

        EObject lv_components_7_0 = null;

        EObject lv_itemConnections_12_0 = null;



        	enterRule();

        try {
            // InternalTutorial.g:764:2: ( (otherlv_0= 'complexItemType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'components' otherlv_4= ':' otherlv_5= '{' ( (lv_components_6_0= ruleComponent ) ) ( (lv_components_7_0= ruleComponent ) )+ otherlv_8= '}' otherlv_9= 'connections' otherlv_10= ':' otherlv_11= '{' ( (lv_itemConnections_12_0= ruleItemConnection ) )+ otherlv_13= '}' otherlv_14= '}' ) )
            // InternalTutorial.g:765:2: (otherlv_0= 'complexItemType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'components' otherlv_4= ':' otherlv_5= '{' ( (lv_components_6_0= ruleComponent ) ) ( (lv_components_7_0= ruleComponent ) )+ otherlv_8= '}' otherlv_9= 'connections' otherlv_10= ':' otherlv_11= '{' ( (lv_itemConnections_12_0= ruleItemConnection ) )+ otherlv_13= '}' otherlv_14= '}' )
            {
            // InternalTutorial.g:765:2: (otherlv_0= 'complexItemType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'components' otherlv_4= ':' otherlv_5= '{' ( (lv_components_6_0= ruleComponent ) ) ( (lv_components_7_0= ruleComponent ) )+ otherlv_8= '}' otherlv_9= 'connections' otherlv_10= ':' otherlv_11= '{' ( (lv_itemConnections_12_0= ruleItemConnection ) )+ otherlv_13= '}' otherlv_14= '}' )
            // InternalTutorial.g:766:3: otherlv_0= 'complexItemType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'components' otherlv_4= ':' otherlv_5= '{' ( (lv_components_6_0= ruleComponent ) ) ( (lv_components_7_0= ruleComponent ) )+ otherlv_8= '}' otherlv_9= 'connections' otherlv_10= ':' otherlv_11= '{' ( (lv_itemConnections_12_0= ruleItemConnection ) )+ otherlv_13= '}' otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getComplexItemTypeAccess().getComplexItemTypeKeyword_0());
            		
            // InternalTutorial.g:770:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTutorial.g:771:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTutorial.g:771:4: (lv_name_1_0= RULE_ID )
            // InternalTutorial.g:772:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getComplexItemTypeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComplexItemTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_27); 

            			newLeafNode(otherlv_2, grammarAccess.getComplexItemTypeAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,31,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getComplexItemTypeAccess().getComponentsKeyword_3());
            		
            otherlv_4=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getComplexItemTypeAccess().getColonKeyword_4());
            		
            otherlv_5=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getComplexItemTypeAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalTutorial.g:804:3: ( (lv_components_6_0= ruleComponent ) )
            // InternalTutorial.g:805:4: (lv_components_6_0= ruleComponent )
            {
            // InternalTutorial.g:805:4: (lv_components_6_0= ruleComponent )
            // InternalTutorial.g:806:5: lv_components_6_0= ruleComponent
            {

            					newCompositeNode(grammarAccess.getComplexItemTypeAccess().getComponentsComponentParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_3);
            lv_components_6_0=ruleComponent();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComplexItemTypeRule());
            					}
            					add(
            						current,
            						"components",
            						lv_components_6_0,
            						"org.xtext.example.Tutorial.Component");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTutorial.g:823:3: ( (lv_components_7_0= ruleComponent ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalTutorial.g:824:4: (lv_components_7_0= ruleComponent )
            	    {
            	    // InternalTutorial.g:824:4: (lv_components_7_0= ruleComponent )
            	    // InternalTutorial.g:825:5: lv_components_7_0= ruleComponent
            	    {

            	    					newCompositeNode(grammarAccess.getComplexItemTypeAccess().getComponentsComponentParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_22);
            	    lv_components_7_0=ruleComponent();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getComplexItemTypeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"components",
            	    						lv_components_7_0,
            	    						"org.xtext.example.Tutorial.Component");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);

            otherlv_8=(Token)match(input,13,FOLLOW_28); 

            			newLeafNode(otherlv_8, grammarAccess.getComplexItemTypeAccess().getRightCurlyBracketKeyword_8());
            		
            otherlv_9=(Token)match(input,32,FOLLOW_8); 

            			newLeafNode(otherlv_9, grammarAccess.getComplexItemTypeAccess().getConnectionsKeyword_9());
            		
            otherlv_10=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_10, grammarAccess.getComplexItemTypeAccess().getColonKeyword_10());
            		
            otherlv_11=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_11, grammarAccess.getComplexItemTypeAccess().getLeftCurlyBracketKeyword_11());
            		
            // InternalTutorial.g:858:3: ( (lv_itemConnections_12_0= ruleItemConnection ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalTutorial.g:859:4: (lv_itemConnections_12_0= ruleItemConnection )
            	    {
            	    // InternalTutorial.g:859:4: (lv_itemConnections_12_0= ruleItemConnection )
            	    // InternalTutorial.g:860:5: lv_itemConnections_12_0= ruleItemConnection
            	    {

            	    					newCompositeNode(grammarAccess.getComplexItemTypeAccess().getItemConnectionsItemConnectionParserRuleCall_12_0());
            	    				
            	    pushFollow(FOLLOW_22);
            	    lv_itemConnections_12_0=ruleItemConnection();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getComplexItemTypeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"itemConnections",
            	    						lv_itemConnections_12_0,
            	    						"org.xtext.example.Tutorial.ItemConnection");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);

            otherlv_13=(Token)match(input,13,FOLLOW_12); 

            			newLeafNode(otherlv_13, grammarAccess.getComplexItemTypeAccess().getRightCurlyBracketKeyword_13());
            		
            otherlv_14=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getComplexItemTypeAccess().getRightCurlyBracketKeyword_14());
            		

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
    // $ANTLR end "ruleComplexItemType"


    // $ANTLR start "entryRuleComponent"
    // InternalTutorial.g:889:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // InternalTutorial.g:889:50: (iv_ruleComponent= ruleComponent EOF )
            // InternalTutorial.g:890:2: iv_ruleComponent= ruleComponent EOF
            {
             newCompositeNode(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponent=ruleComponent();

            state._fsp--;

             current =iv_ruleComponent; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // InternalTutorial.g:896:1: ruleComponent returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' ) ;
    public final EObject ruleComponent() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalTutorial.g:902:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' ) )
            // InternalTutorial.g:903:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' )
            {
            // InternalTutorial.g:903:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' )
            // InternalTutorial.g:904:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')'
            {
            // InternalTutorial.g:904:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalTutorial.g:905:4: (lv_name_0_0= RULE_ID )
            {
            // InternalTutorial.g:905:4: (lv_name_0_0= RULE_ID )
            // InternalTutorial.g:906:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_name_0_0, grammarAccess.getComponentAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getComponentAccess().getLeftParenthesisKeyword_1());
            		
            // InternalTutorial.g:926:3: ( (otherlv_2= RULE_ID ) )
            // InternalTutorial.g:927:4: (otherlv_2= RULE_ID )
            {
            // InternalTutorial.g:927:4: (otherlv_2= RULE_ID )
            // InternalTutorial.g:928:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(otherlv_2, grammarAccess.getComponentAccess().getItemTypeBasicItemTypeCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getComponentAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRuleItemConnection"
    // InternalTutorial.g:947:1: entryRuleItemConnection returns [EObject current=null] : iv_ruleItemConnection= ruleItemConnection EOF ;
    public final EObject entryRuleItemConnection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItemConnection = null;


        try {
            // InternalTutorial.g:947:55: (iv_ruleItemConnection= ruleItemConnection EOF )
            // InternalTutorial.g:948:2: iv_ruleItemConnection= ruleItemConnection EOF
            {
             newCompositeNode(grammarAccess.getItemConnectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleItemConnection=ruleItemConnection();

            state._fsp--;

             current =iv_ruleItemConnection; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleItemConnection"


    // $ANTLR start "ruleItemConnection"
    // InternalTutorial.g:954:1: ruleItemConnection returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( ruleEString ) ) otherlv_3= ')' otherlv_4= '<->' ( (otherlv_5= RULE_ID ) ) otherlv_6= '(' ( ( ruleEString ) ) otherlv_8= ')' ) ;
    public final EObject ruleItemConnection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalTutorial.g:960:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( ruleEString ) ) otherlv_3= ')' otherlv_4= '<->' ( (otherlv_5= RULE_ID ) ) otherlv_6= '(' ( ( ruleEString ) ) otherlv_8= ')' ) )
            // InternalTutorial.g:961:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( ruleEString ) ) otherlv_3= ')' otherlv_4= '<->' ( (otherlv_5= RULE_ID ) ) otherlv_6= '(' ( ( ruleEString ) ) otherlv_8= ')' )
            {
            // InternalTutorial.g:961:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( ruleEString ) ) otherlv_3= ')' otherlv_4= '<->' ( (otherlv_5= RULE_ID ) ) otherlv_6= '(' ( ( ruleEString ) ) otherlv_8= ')' )
            // InternalTutorial.g:962:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( ruleEString ) ) otherlv_3= ')' otherlv_4= '<->' ( (otherlv_5= RULE_ID ) ) otherlv_6= '(' ( ( ruleEString ) ) otherlv_8= ')'
            {
            // InternalTutorial.g:962:3: ( (otherlv_0= RULE_ID ) )
            // InternalTutorial.g:963:4: (otherlv_0= RULE_ID )
            {
            // InternalTutorial.g:963:4: (otherlv_0= RULE_ID )
            // InternalTutorial.g:964:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getItemConnectionRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(otherlv_0, grammarAccess.getItemConnectionAccess().getComponentAComponentCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getItemConnectionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalTutorial.g:979:3: ( ( ruleEString ) )
            // InternalTutorial.g:980:4: ( ruleEString )
            {
            // InternalTutorial.g:980:4: ( ruleEString )
            // InternalTutorial.g:981:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getItemConnectionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getItemConnectionAccess().getMarkerAMarkerCrossReference_2_0());
            				
            pushFollow(FOLLOW_17);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,24,FOLLOW_29); 

            			newLeafNode(otherlv_3, grammarAccess.getItemConnectionAccess().getRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getItemConnectionAccess().getLessThanSignHyphenMinusGreaterThanSignKeyword_4());
            		
            // InternalTutorial.g:1003:3: ( (otherlv_5= RULE_ID ) )
            // InternalTutorial.g:1004:4: (otherlv_5= RULE_ID )
            {
            // InternalTutorial.g:1004:4: (otherlv_5= RULE_ID )
            // InternalTutorial.g:1005:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getItemConnectionRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(otherlv_5, grammarAccess.getItemConnectionAccess().getComponentBComponentCrossReference_5_0());
            				

            }


            }

            otherlv_6=(Token)match(input,23,FOLLOW_23); 

            			newLeafNode(otherlv_6, grammarAccess.getItemConnectionAccess().getLeftParenthesisKeyword_6());
            		
            // InternalTutorial.g:1020:3: ( ( ruleEString ) )
            // InternalTutorial.g:1021:4: ( ruleEString )
            {
            // InternalTutorial.g:1021:4: ( ruleEString )
            // InternalTutorial.g:1022:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getItemConnectionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getItemConnectionAccess().getMarkerBMarkerCrossReference_7_0());
            				
            pushFollow(FOLLOW_17);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getItemConnectionAccess().getRightParenthesisKeyword_8());
            		

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
    // $ANTLR end "ruleItemConnection"


    // $ANTLR start "entryRuleEString"
    // InternalTutorial.g:1044:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalTutorial.g:1044:47: (iv_ruleEString= ruleEString EOF )
            // InternalTutorial.g:1045:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalTutorial.g:1051:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalTutorial.g:1057:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalTutorial.g:1058:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalTutorial.g:1058:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_ID) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalTutorial.g:1059:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalTutorial.g:1067:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEDouble"
    // InternalTutorial.g:1078:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // InternalTutorial.g:1078:47: (iv_ruleEDouble= ruleEDouble EOF )
            // InternalTutorial.g:1079:2: iv_ruleEDouble= ruleEDouble EOF
            {
             newCompositeNode(grammarAccess.getEDoubleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEDouble=ruleEDouble();

            state._fsp--;

             current =iv_ruleEDouble.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // InternalTutorial.g:1085:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalTutorial.g:1091:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalTutorial.g:1092:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalTutorial.g:1092:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalTutorial.g:1093:3: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalTutorial.g:1093:3: (kw= '-' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==34) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalTutorial.g:1094:4: kw= '-'
                    {
                    kw=(Token)match(input,34,FOLLOW_30); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalTutorial.g:1100:3: (this_INT_1= RULE_INT )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_INT) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalTutorial.g:1101:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_31); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,35,FOLLOW_32); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_33); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3());
            		
            // InternalTutorial.g:1121:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=36 && LA13_0<=37)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalTutorial.g:1122:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalTutorial.g:1122:4: (kw= 'E' | kw= 'e' )
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==36) ) {
                        alt11=1;
                    }
                    else if ( (LA11_0==37) ) {
                        alt11=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 0, input);

                        throw nvae;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalTutorial.g:1123:5: kw= 'E'
                            {
                            kw=(Token)match(input,36,FOLLOW_24); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalTutorial.g:1129:5: kw= 'e'
                            {
                            kw=(Token)match(input,37,FOLLOW_24); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalTutorial.g:1135:4: (kw= '-' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==34) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalTutorial.g:1136:5: kw= '-'
                            {
                            kw=(Token)match(input,34,FOLLOW_32); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1());
                            				

                            }
                            break;

                    }

                    this_INT_7=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_7);
                    			

                    				newLeafNode(this_INT_7, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2());
                    			

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
    // $ANTLR end "ruleEDouble"


    // $ANTLR start "entryRuleEInt"
    // InternalTutorial.g:1154:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalTutorial.g:1154:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalTutorial.g:1155:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalTutorial.g:1161:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalTutorial.g:1167:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalTutorial.g:1168:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalTutorial.g:1168:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalTutorial.g:1169:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalTutorial.g:1169:3: (kw= '-' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==34) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalTutorial.g:1170:4: kw= '-'
                    {
                    kw=(Token)match(input,34,FOLLOW_32); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "ruleMaterial"
    // InternalTutorial.g:1187:1: ruleMaterial returns [Enumerator current=null] : ( (enumLiteral_0= 'WOOD' ) | (enumLiteral_1= 'STEEL' ) | (enumLiteral_2= 'GOLD' ) | (enumLiteral_3= 'COPPER' ) ) ;
    public final Enumerator ruleMaterial() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalTutorial.g:1193:2: ( ( (enumLiteral_0= 'WOOD' ) | (enumLiteral_1= 'STEEL' ) | (enumLiteral_2= 'GOLD' ) | (enumLiteral_3= 'COPPER' ) ) )
            // InternalTutorial.g:1194:2: ( (enumLiteral_0= 'WOOD' ) | (enumLiteral_1= 'STEEL' ) | (enumLiteral_2= 'GOLD' ) | (enumLiteral_3= 'COPPER' ) )
            {
            // InternalTutorial.g:1194:2: ( (enumLiteral_0= 'WOOD' ) | (enumLiteral_1= 'STEEL' ) | (enumLiteral_2= 'GOLD' ) | (enumLiteral_3= 'COPPER' ) )
            int alt15=4;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt15=1;
                }
                break;
            case 39:
                {
                alt15=2;
                }
                break;
            case 40:
                {
                alt15=3;
                }
                break;
            case 41:
                {
                alt15=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalTutorial.g:1195:3: (enumLiteral_0= 'WOOD' )
                    {
                    // InternalTutorial.g:1195:3: (enumLiteral_0= 'WOOD' )
                    // InternalTutorial.g:1196:4: enumLiteral_0= 'WOOD'
                    {
                    enumLiteral_0=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getMaterialAccess().getWOODEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMaterialAccess().getWOODEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalTutorial.g:1203:3: (enumLiteral_1= 'STEEL' )
                    {
                    // InternalTutorial.g:1203:3: (enumLiteral_1= 'STEEL' )
                    // InternalTutorial.g:1204:4: enumLiteral_1= 'STEEL'
                    {
                    enumLiteral_1=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getMaterialAccess().getSTEELEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMaterialAccess().getSTEELEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalTutorial.g:1211:3: (enumLiteral_2= 'GOLD' )
                    {
                    // InternalTutorial.g:1211:3: (enumLiteral_2= 'GOLD' )
                    // InternalTutorial.g:1212:4: enumLiteral_2= 'GOLD'
                    {
                    enumLiteral_2=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getMaterialAccess().getGOLDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getMaterialAccess().getGOLDEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalTutorial.g:1219:3: (enumLiteral_3= 'COPPER' )
                    {
                    // InternalTutorial.g:1219:3: (enumLiteral_3= 'COPPER' )
                    // InternalTutorial.g:1220:4: enumLiteral_3= 'COPPER'
                    {
                    enumLiteral_3=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getMaterialAccess().getCOPPEREnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getMaterialAccess().getCOPPEREnumLiteralDeclaration_3());
                    			

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
    // $ANTLR end "ruleMaterial"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000040400000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000040402000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000C00000040L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000003C000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000084000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004002000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000400000040L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000800000040L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000003000000002L});

}