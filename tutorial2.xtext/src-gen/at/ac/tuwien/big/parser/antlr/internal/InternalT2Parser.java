package at.ac.tuwien.big.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import at.ac.tuwien.big.services.T2GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalT2Parser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Factory'", "'{'", "'overseasitem'", "','", "'}'", "'itemtype'", "'OverseasItem'", "'overseasmaterial'", "'OverseasMaterial'", "'BasicItemType'", "'ComplexItemType'", "'component'", "'Component'"
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

        public InternalT2Parser(TokenStream input, T2GrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Factory";
       	}

       	@Override
       	protected T2GrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleFactory"
    // InternalT2.g:64:1: entryRuleFactory returns [EObject current=null] : iv_ruleFactory= ruleFactory EOF ;
    public final EObject entryRuleFactory() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFactory = null;


        try {
            // InternalT2.g:64:48: (iv_ruleFactory= ruleFactory EOF )
            // InternalT2.g:65:2: iv_ruleFactory= ruleFactory EOF
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
    // InternalT2.g:71:1: ruleFactory returns [EObject current=null] : ( () otherlv_1= 'Factory' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'overseasitem' otherlv_5= '{' ( (lv_overseasitem_6_0= ruleOverseasItem ) ) (otherlv_7= ',' ( (lv_overseasitem_8_0= ruleOverseasItem ) ) )* otherlv_9= '}' )? (otherlv_10= 'itemtype' otherlv_11= '{' ( (lv_itemtype_12_0= ruleItemType ) ) (otherlv_13= ',' ( (lv_itemtype_14_0= ruleItemType ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) ;
    public final EObject ruleFactory() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_overseasitem_6_0 = null;

        EObject lv_overseasitem_8_0 = null;

        EObject lv_itemtype_12_0 = null;

        EObject lv_itemtype_14_0 = null;



        	enterRule();

        try {
            // InternalT2.g:77:2: ( ( () otherlv_1= 'Factory' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'overseasitem' otherlv_5= '{' ( (lv_overseasitem_6_0= ruleOverseasItem ) ) (otherlv_7= ',' ( (lv_overseasitem_8_0= ruleOverseasItem ) ) )* otherlv_9= '}' )? (otherlv_10= 'itemtype' otherlv_11= '{' ( (lv_itemtype_12_0= ruleItemType ) ) (otherlv_13= ',' ( (lv_itemtype_14_0= ruleItemType ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) )
            // InternalT2.g:78:2: ( () otherlv_1= 'Factory' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'overseasitem' otherlv_5= '{' ( (lv_overseasitem_6_0= ruleOverseasItem ) ) (otherlv_7= ',' ( (lv_overseasitem_8_0= ruleOverseasItem ) ) )* otherlv_9= '}' )? (otherlv_10= 'itemtype' otherlv_11= '{' ( (lv_itemtype_12_0= ruleItemType ) ) (otherlv_13= ',' ( (lv_itemtype_14_0= ruleItemType ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            {
            // InternalT2.g:78:2: ( () otherlv_1= 'Factory' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'overseasitem' otherlv_5= '{' ( (lv_overseasitem_6_0= ruleOverseasItem ) ) (otherlv_7= ',' ( (lv_overseasitem_8_0= ruleOverseasItem ) ) )* otherlv_9= '}' )? (otherlv_10= 'itemtype' otherlv_11= '{' ( (lv_itemtype_12_0= ruleItemType ) ) (otherlv_13= ',' ( (lv_itemtype_14_0= ruleItemType ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            // InternalT2.g:79:3: () otherlv_1= 'Factory' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'overseasitem' otherlv_5= '{' ( (lv_overseasitem_6_0= ruleOverseasItem ) ) (otherlv_7= ',' ( (lv_overseasitem_8_0= ruleOverseasItem ) ) )* otherlv_9= '}' )? (otherlv_10= 'itemtype' otherlv_11= '{' ( (lv_itemtype_12_0= ruleItemType ) ) (otherlv_13= ',' ( (lv_itemtype_14_0= ruleItemType ) ) )* otherlv_15= '}' )? otherlv_16= '}'
            {
            // InternalT2.g:79:3: ()
            // InternalT2.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFactoryAccess().getFactoryAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getFactoryAccess().getFactoryKeyword_1());
            		
            // InternalT2.g:90:3: ( (lv_name_2_0= ruleEString ) )
            // InternalT2.g:91:4: (lv_name_2_0= ruleEString )
            {
            // InternalT2.g:91:4: (lv_name_2_0= ruleEString )
            // InternalT2.g:92:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFactoryAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFactoryRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"at.ac.tuwien.big.T2.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getFactoryAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalT2.g:113:3: (otherlv_4= 'overseasitem' otherlv_5= '{' ( (lv_overseasitem_6_0= ruleOverseasItem ) ) (otherlv_7= ',' ( (lv_overseasitem_8_0= ruleOverseasItem ) ) )* otherlv_9= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalT2.g:114:4: otherlv_4= 'overseasitem' otherlv_5= '{' ( (lv_overseasitem_6_0= ruleOverseasItem ) ) (otherlv_7= ',' ( (lv_overseasitem_8_0= ruleOverseasItem ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getFactoryAccess().getOverseasitemKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_6); 

                    				newLeafNode(otherlv_5, grammarAccess.getFactoryAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalT2.g:122:4: ( (lv_overseasitem_6_0= ruleOverseasItem ) )
                    // InternalT2.g:123:5: (lv_overseasitem_6_0= ruleOverseasItem )
                    {
                    // InternalT2.g:123:5: (lv_overseasitem_6_0= ruleOverseasItem )
                    // InternalT2.g:124:6: lv_overseasitem_6_0= ruleOverseasItem
                    {

                    						newCompositeNode(grammarAccess.getFactoryAccess().getOverseasitemOverseasItemParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_overseasitem_6_0=ruleOverseasItem();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFactoryRule());
                    						}
                    						add(
                    							current,
                    							"overseasitem",
                    							lv_overseasitem_6_0,
                    							"at.ac.tuwien.big.T2.OverseasItem");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalT2.g:141:4: (otherlv_7= ',' ( (lv_overseasitem_8_0= ruleOverseasItem ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalT2.g:142:5: otherlv_7= ',' ( (lv_overseasitem_8_0= ruleOverseasItem ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_6); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getFactoryAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalT2.g:146:5: ( (lv_overseasitem_8_0= ruleOverseasItem ) )
                    	    // InternalT2.g:147:6: (lv_overseasitem_8_0= ruleOverseasItem )
                    	    {
                    	    // InternalT2.g:147:6: (lv_overseasitem_8_0= ruleOverseasItem )
                    	    // InternalT2.g:148:7: lv_overseasitem_8_0= ruleOverseasItem
                    	    {

                    	    							newCompositeNode(grammarAccess.getFactoryAccess().getOverseasitemOverseasItemParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_overseasitem_8_0=ruleOverseasItem();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getFactoryRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"overseasitem",
                    	    								lv_overseasitem_8_0,
                    	    								"at.ac.tuwien.big.T2.OverseasItem");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_9, grammarAccess.getFactoryAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalT2.g:171:3: (otherlv_10= 'itemtype' otherlv_11= '{' ( (lv_itemtype_12_0= ruleItemType ) ) (otherlv_13= ',' ( (lv_itemtype_14_0= ruleItemType ) ) )* otherlv_15= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalT2.g:172:4: otherlv_10= 'itemtype' otherlv_11= '{' ( (lv_itemtype_12_0= ruleItemType ) ) (otherlv_13= ',' ( (lv_itemtype_14_0= ruleItemType ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,16,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getFactoryAccess().getItemtypeKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_9); 

                    				newLeafNode(otherlv_11, grammarAccess.getFactoryAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalT2.g:180:4: ( (lv_itemtype_12_0= ruleItemType ) )
                    // InternalT2.g:181:5: (lv_itemtype_12_0= ruleItemType )
                    {
                    // InternalT2.g:181:5: (lv_itemtype_12_0= ruleItemType )
                    // InternalT2.g:182:6: lv_itemtype_12_0= ruleItemType
                    {

                    						newCompositeNode(grammarAccess.getFactoryAccess().getItemtypeItemTypeParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_itemtype_12_0=ruleItemType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFactoryRule());
                    						}
                    						add(
                    							current,
                    							"itemtype",
                    							lv_itemtype_12_0,
                    							"at.ac.tuwien.big.T2.ItemType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalT2.g:199:4: (otherlv_13= ',' ( (lv_itemtype_14_0= ruleItemType ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==14) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalT2.g:200:5: otherlv_13= ',' ( (lv_itemtype_14_0= ruleItemType ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_9); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getFactoryAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalT2.g:204:5: ( (lv_itemtype_14_0= ruleItemType ) )
                    	    // InternalT2.g:205:6: (lv_itemtype_14_0= ruleItemType )
                    	    {
                    	    // InternalT2.g:205:6: (lv_itemtype_14_0= ruleItemType )
                    	    // InternalT2.g:206:7: lv_itemtype_14_0= ruleItemType
                    	    {

                    	    							newCompositeNode(grammarAccess.getFactoryAccess().getItemtypeItemTypeParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_itemtype_14_0=ruleItemType();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getFactoryRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"itemtype",
                    	    								lv_itemtype_14_0,
                    	    								"at.ac.tuwien.big.T2.ItemType");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,15,FOLLOW_10); 

                    				newLeafNode(otherlv_15, grammarAccess.getFactoryAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_16=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getFactoryAccess().getRightCurlyBracketKeyword_6());
            		

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
    // InternalT2.g:237:1: entryRuleItemType returns [EObject current=null] : iv_ruleItemType= ruleItemType EOF ;
    public final EObject entryRuleItemType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItemType = null;


        try {
            // InternalT2.g:237:49: (iv_ruleItemType= ruleItemType EOF )
            // InternalT2.g:238:2: iv_ruleItemType= ruleItemType EOF
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
    // InternalT2.g:244:1: ruleItemType returns [EObject current=null] : (this_BasicItemType_0= ruleBasicItemType | this_ComplexItemType_1= ruleComplexItemType ) ;
    public final EObject ruleItemType() throws RecognitionException {
        EObject current = null;

        EObject this_BasicItemType_0 = null;

        EObject this_ComplexItemType_1 = null;



        	enterRule();

        try {
            // InternalT2.g:250:2: ( (this_BasicItemType_0= ruleBasicItemType | this_ComplexItemType_1= ruleComplexItemType ) )
            // InternalT2.g:251:2: (this_BasicItemType_0= ruleBasicItemType | this_ComplexItemType_1= ruleComplexItemType )
            {
            // InternalT2.g:251:2: (this_BasicItemType_0= ruleBasicItemType | this_ComplexItemType_1= ruleComplexItemType )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            else if ( (LA5_0==21) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalT2.g:252:3: this_BasicItemType_0= ruleBasicItemType
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
                    // InternalT2.g:261:3: this_ComplexItemType_1= ruleComplexItemType
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


    // $ANTLR start "entryRuleOverseasItem"
    // InternalT2.g:273:1: entryRuleOverseasItem returns [EObject current=null] : iv_ruleOverseasItem= ruleOverseasItem EOF ;
    public final EObject entryRuleOverseasItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOverseasItem = null;


        try {
            // InternalT2.g:273:53: (iv_ruleOverseasItem= ruleOverseasItem EOF )
            // InternalT2.g:274:2: iv_ruleOverseasItem= ruleOverseasItem EOF
            {
             newCompositeNode(grammarAccess.getOverseasItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOverseasItem=ruleOverseasItem();

            state._fsp--;

             current =iv_ruleOverseasItem; 
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
    // $ANTLR end "entryRuleOverseasItem"


    // $ANTLR start "ruleOverseasItem"
    // InternalT2.g:280:1: ruleOverseasItem returns [EObject current=null] : ( () otherlv_1= 'OverseasItem' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'overseasmaterial' otherlv_5= '{' ( (lv_overseasmaterial_6_0= ruleOverseasMaterial ) ) (otherlv_7= ',' ( (lv_overseasmaterial_8_0= ruleOverseasMaterial ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) ;
    public final EObject ruleOverseasItem() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_overseasmaterial_6_0 = null;

        EObject lv_overseasmaterial_8_0 = null;



        	enterRule();

        try {
            // InternalT2.g:286:2: ( ( () otherlv_1= 'OverseasItem' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'overseasmaterial' otherlv_5= '{' ( (lv_overseasmaterial_6_0= ruleOverseasMaterial ) ) (otherlv_7= ',' ( (lv_overseasmaterial_8_0= ruleOverseasMaterial ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) )
            // InternalT2.g:287:2: ( () otherlv_1= 'OverseasItem' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'overseasmaterial' otherlv_5= '{' ( (lv_overseasmaterial_6_0= ruleOverseasMaterial ) ) (otherlv_7= ',' ( (lv_overseasmaterial_8_0= ruleOverseasMaterial ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            {
            // InternalT2.g:287:2: ( () otherlv_1= 'OverseasItem' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'overseasmaterial' otherlv_5= '{' ( (lv_overseasmaterial_6_0= ruleOverseasMaterial ) ) (otherlv_7= ',' ( (lv_overseasmaterial_8_0= ruleOverseasMaterial ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            // InternalT2.g:288:3: () otherlv_1= 'OverseasItem' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'overseasmaterial' otherlv_5= '{' ( (lv_overseasmaterial_6_0= ruleOverseasMaterial ) ) (otherlv_7= ',' ( (lv_overseasmaterial_8_0= ruleOverseasMaterial ) ) )* otherlv_9= '}' )? otherlv_10= '}'
            {
            // InternalT2.g:288:3: ()
            // InternalT2.g:289:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOverseasItemAccess().getOverseasItemAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getOverseasItemAccess().getOverseasItemKeyword_1());
            		
            // InternalT2.g:299:3: ( (lv_name_2_0= ruleEString ) )
            // InternalT2.g:300:4: (lv_name_2_0= ruleEString )
            {
            // InternalT2.g:300:4: (lv_name_2_0= ruleEString )
            // InternalT2.g:301:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getOverseasItemAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOverseasItemRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"at.ac.tuwien.big.T2.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getOverseasItemAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalT2.g:322:3: (otherlv_4= 'overseasmaterial' otherlv_5= '{' ( (lv_overseasmaterial_6_0= ruleOverseasMaterial ) ) (otherlv_7= ',' ( (lv_overseasmaterial_8_0= ruleOverseasMaterial ) ) )* otherlv_9= '}' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalT2.g:323:4: otherlv_4= 'overseasmaterial' otherlv_5= '{' ( (lv_overseasmaterial_6_0= ruleOverseasMaterial ) ) (otherlv_7= ',' ( (lv_overseasmaterial_8_0= ruleOverseasMaterial ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getOverseasItemAccess().getOverseasmaterialKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_12); 

                    				newLeafNode(otherlv_5, grammarAccess.getOverseasItemAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalT2.g:331:4: ( (lv_overseasmaterial_6_0= ruleOverseasMaterial ) )
                    // InternalT2.g:332:5: (lv_overseasmaterial_6_0= ruleOverseasMaterial )
                    {
                    // InternalT2.g:332:5: (lv_overseasmaterial_6_0= ruleOverseasMaterial )
                    // InternalT2.g:333:6: lv_overseasmaterial_6_0= ruleOverseasMaterial
                    {

                    						newCompositeNode(grammarAccess.getOverseasItemAccess().getOverseasmaterialOverseasMaterialParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_overseasmaterial_6_0=ruleOverseasMaterial();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOverseasItemRule());
                    						}
                    						add(
                    							current,
                    							"overseasmaterial",
                    							lv_overseasmaterial_6_0,
                    							"at.ac.tuwien.big.T2.OverseasMaterial");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalT2.g:350:4: (otherlv_7= ',' ( (lv_overseasmaterial_8_0= ruleOverseasMaterial ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==14) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalT2.g:351:5: otherlv_7= ',' ( (lv_overseasmaterial_8_0= ruleOverseasMaterial ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_12); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getOverseasItemAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalT2.g:355:5: ( (lv_overseasmaterial_8_0= ruleOverseasMaterial ) )
                    	    // InternalT2.g:356:6: (lv_overseasmaterial_8_0= ruleOverseasMaterial )
                    	    {
                    	    // InternalT2.g:356:6: (lv_overseasmaterial_8_0= ruleOverseasMaterial )
                    	    // InternalT2.g:357:7: lv_overseasmaterial_8_0= ruleOverseasMaterial
                    	    {

                    	    							newCompositeNode(grammarAccess.getOverseasItemAccess().getOverseasmaterialOverseasMaterialParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_overseasmaterial_8_0=ruleOverseasMaterial();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getOverseasItemRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"overseasmaterial",
                    	    								lv_overseasmaterial_8_0,
                    	    								"at.ac.tuwien.big.T2.OverseasMaterial");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FOLLOW_10); 

                    				newLeafNode(otherlv_9, grammarAccess.getOverseasItemAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getOverseasItemAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleOverseasItem"


    // $ANTLR start "entryRuleEString"
    // InternalT2.g:388:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalT2.g:388:47: (iv_ruleEString= ruleEString EOF )
            // InternalT2.g:389:2: iv_ruleEString= ruleEString EOF
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
    // InternalT2.g:395:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalT2.g:401:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalT2.g:402:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalT2.g:402:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    // InternalT2.g:403:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalT2.g:411:3: this_ID_1= RULE_ID
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


    // $ANTLR start "entryRuleOverseasMaterial"
    // InternalT2.g:422:1: entryRuleOverseasMaterial returns [EObject current=null] : iv_ruleOverseasMaterial= ruleOverseasMaterial EOF ;
    public final EObject entryRuleOverseasMaterial() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOverseasMaterial = null;


        try {
            // InternalT2.g:422:57: (iv_ruleOverseasMaterial= ruleOverseasMaterial EOF )
            // InternalT2.g:423:2: iv_ruleOverseasMaterial= ruleOverseasMaterial EOF
            {
             newCompositeNode(grammarAccess.getOverseasMaterialRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOverseasMaterial=ruleOverseasMaterial();

            state._fsp--;

             current =iv_ruleOverseasMaterial; 
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
    // $ANTLR end "entryRuleOverseasMaterial"


    // $ANTLR start "ruleOverseasMaterial"
    // InternalT2.g:429:1: ruleOverseasMaterial returns [EObject current=null] : ( () otherlv_1= 'OverseasMaterial' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleOverseasMaterial() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalT2.g:435:2: ( ( () otherlv_1= 'OverseasMaterial' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalT2.g:436:2: ( () otherlv_1= 'OverseasMaterial' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalT2.g:436:2: ( () otherlv_1= 'OverseasMaterial' ( (lv_name_2_0= ruleEString ) ) )
            // InternalT2.g:437:3: () otherlv_1= 'OverseasMaterial' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalT2.g:437:3: ()
            // InternalT2.g:438:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOverseasMaterialAccess().getOverseasMaterialAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getOverseasMaterialAccess().getOverseasMaterialKeyword_1());
            		
            // InternalT2.g:448:3: ( (lv_name_2_0= ruleEString ) )
            // InternalT2.g:449:4: (lv_name_2_0= ruleEString )
            {
            // InternalT2.g:449:4: (lv_name_2_0= ruleEString )
            // InternalT2.g:450:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getOverseasMaterialAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOverseasMaterialRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"at.ac.tuwien.big.T2.EString");
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
    // $ANTLR end "ruleOverseasMaterial"


    // $ANTLR start "entryRuleBasicItemType"
    // InternalT2.g:471:1: entryRuleBasicItemType returns [EObject current=null] : iv_ruleBasicItemType= ruleBasicItemType EOF ;
    public final EObject entryRuleBasicItemType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicItemType = null;


        try {
            // InternalT2.g:471:54: (iv_ruleBasicItemType= ruleBasicItemType EOF )
            // InternalT2.g:472:2: iv_ruleBasicItemType= ruleBasicItemType EOF
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
    // InternalT2.g:478:1: ruleBasicItemType returns [EObject current=null] : ( () otherlv_1= 'BasicItemType' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleBasicItemType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalT2.g:484:2: ( ( () otherlv_1= 'BasicItemType' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalT2.g:485:2: ( () otherlv_1= 'BasicItemType' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalT2.g:485:2: ( () otherlv_1= 'BasicItemType' ( (lv_name_2_0= ruleEString ) ) )
            // InternalT2.g:486:3: () otherlv_1= 'BasicItemType' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalT2.g:486:3: ()
            // InternalT2.g:487:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBasicItemTypeAccess().getBasicItemTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getBasicItemTypeAccess().getBasicItemTypeKeyword_1());
            		
            // InternalT2.g:497:3: ( (lv_name_2_0= ruleEString ) )
            // InternalT2.g:498:4: (lv_name_2_0= ruleEString )
            {
            // InternalT2.g:498:4: (lv_name_2_0= ruleEString )
            // InternalT2.g:499:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getBasicItemTypeAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBasicItemTypeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"at.ac.tuwien.big.T2.EString");
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
    // $ANTLR end "ruleBasicItemType"


    // $ANTLR start "entryRuleComplexItemType"
    // InternalT2.g:520:1: entryRuleComplexItemType returns [EObject current=null] : iv_ruleComplexItemType= ruleComplexItemType EOF ;
    public final EObject entryRuleComplexItemType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplexItemType = null;


        try {
            // InternalT2.g:520:56: (iv_ruleComplexItemType= ruleComplexItemType EOF )
            // InternalT2.g:521:2: iv_ruleComplexItemType= ruleComplexItemType EOF
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
    // InternalT2.g:527:1: ruleComplexItemType returns [EObject current=null] : ( () otherlv_1= 'ComplexItemType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'overseasitem' ( ( ruleEString ) ) )? (otherlv_6= 'overseasmaterial' ( ( ruleEString ) ) )? (otherlv_8= 'component' otherlv_9= '{' ( (lv_component_10_0= ruleComponent ) ) (otherlv_11= ',' ( (lv_component_12_0= ruleComponent ) ) )* otherlv_13= '}' )? otherlv_14= '}' ) ;
    public final EObject ruleComplexItemType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_component_10_0 = null;

        EObject lv_component_12_0 = null;



        	enterRule();

        try {
            // InternalT2.g:533:2: ( ( () otherlv_1= 'ComplexItemType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'overseasitem' ( ( ruleEString ) ) )? (otherlv_6= 'overseasmaterial' ( ( ruleEString ) ) )? (otherlv_8= 'component' otherlv_9= '{' ( (lv_component_10_0= ruleComponent ) ) (otherlv_11= ',' ( (lv_component_12_0= ruleComponent ) ) )* otherlv_13= '}' )? otherlv_14= '}' ) )
            // InternalT2.g:534:2: ( () otherlv_1= 'ComplexItemType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'overseasitem' ( ( ruleEString ) ) )? (otherlv_6= 'overseasmaterial' ( ( ruleEString ) ) )? (otherlv_8= 'component' otherlv_9= '{' ( (lv_component_10_0= ruleComponent ) ) (otherlv_11= ',' ( (lv_component_12_0= ruleComponent ) ) )* otherlv_13= '}' )? otherlv_14= '}' )
            {
            // InternalT2.g:534:2: ( () otherlv_1= 'ComplexItemType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'overseasitem' ( ( ruleEString ) ) )? (otherlv_6= 'overseasmaterial' ( ( ruleEString ) ) )? (otherlv_8= 'component' otherlv_9= '{' ( (lv_component_10_0= ruleComponent ) ) (otherlv_11= ',' ( (lv_component_12_0= ruleComponent ) ) )* otherlv_13= '}' )? otherlv_14= '}' )
            // InternalT2.g:535:3: () otherlv_1= 'ComplexItemType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'overseasitem' ( ( ruleEString ) ) )? (otherlv_6= 'overseasmaterial' ( ( ruleEString ) ) )? (otherlv_8= 'component' otherlv_9= '{' ( (lv_component_10_0= ruleComponent ) ) (otherlv_11= ',' ( (lv_component_12_0= ruleComponent ) ) )* otherlv_13= '}' )? otherlv_14= '}'
            {
            // InternalT2.g:535:3: ()
            // InternalT2.g:536:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getComplexItemTypeAccess().getComplexItemTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getComplexItemTypeAccess().getComplexItemTypeKeyword_1());
            		
            // InternalT2.g:546:3: ( (lv_name_2_0= ruleEString ) )
            // InternalT2.g:547:4: (lv_name_2_0= ruleEString )
            {
            // InternalT2.g:547:4: (lv_name_2_0= ruleEString )
            // InternalT2.g:548:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getComplexItemTypeAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComplexItemTypeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"at.ac.tuwien.big.T2.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getComplexItemTypeAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalT2.g:569:3: (otherlv_4= 'overseasitem' ( ( ruleEString ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==13) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalT2.g:570:4: otherlv_4= 'overseasitem' ( ( ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getComplexItemTypeAccess().getOverseasitemKeyword_4_0());
                    			
                    // InternalT2.g:574:4: ( ( ruleEString ) )
                    // InternalT2.g:575:5: ( ruleEString )
                    {
                    // InternalT2.g:575:5: ( ruleEString )
                    // InternalT2.g:576:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getComplexItemTypeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getComplexItemTypeAccess().getOverseasitemOverseasItemCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalT2.g:591:3: (otherlv_6= 'overseasmaterial' ( ( ruleEString ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==18) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalT2.g:592:4: otherlv_6= 'overseasmaterial' ( ( ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,18,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getComplexItemTypeAccess().getOverseasmaterialKeyword_5_0());
                    			
                    // InternalT2.g:596:4: ( ( ruleEString ) )
                    // InternalT2.g:597:5: ( ruleEString )
                    {
                    // InternalT2.g:597:5: ( ruleEString )
                    // InternalT2.g:598:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getComplexItemTypeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getComplexItemTypeAccess().getOverseasmaterialOverseasMaterialCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalT2.g:613:3: (otherlv_8= 'component' otherlv_9= '{' ( (lv_component_10_0= ruleComponent ) ) (otherlv_11= ',' ( (lv_component_12_0= ruleComponent ) ) )* otherlv_13= '}' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==22) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalT2.g:614:4: otherlv_8= 'component' otherlv_9= '{' ( (lv_component_10_0= ruleComponent ) ) (otherlv_11= ',' ( (lv_component_12_0= ruleComponent ) ) )* otherlv_13= '}'
                    {
                    otherlv_8=(Token)match(input,22,FOLLOW_4); 

                    				newLeafNode(otherlv_8, grammarAccess.getComplexItemTypeAccess().getComponentKeyword_6_0());
                    			
                    otherlv_9=(Token)match(input,12,FOLLOW_16); 

                    				newLeafNode(otherlv_9, grammarAccess.getComplexItemTypeAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalT2.g:622:4: ( (lv_component_10_0= ruleComponent ) )
                    // InternalT2.g:623:5: (lv_component_10_0= ruleComponent )
                    {
                    // InternalT2.g:623:5: (lv_component_10_0= ruleComponent )
                    // InternalT2.g:624:6: lv_component_10_0= ruleComponent
                    {

                    						newCompositeNode(grammarAccess.getComplexItemTypeAccess().getComponentComponentParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_component_10_0=ruleComponent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComplexItemTypeRule());
                    						}
                    						add(
                    							current,
                    							"component",
                    							lv_component_10_0,
                    							"at.ac.tuwien.big.T2.Component");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalT2.g:641:4: (otherlv_11= ',' ( (lv_component_12_0= ruleComponent ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==14) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalT2.g:642:5: otherlv_11= ',' ( (lv_component_12_0= ruleComponent ) )
                    	    {
                    	    otherlv_11=(Token)match(input,14,FOLLOW_16); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getComplexItemTypeAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalT2.g:646:5: ( (lv_component_12_0= ruleComponent ) )
                    	    // InternalT2.g:647:6: (lv_component_12_0= ruleComponent )
                    	    {
                    	    // InternalT2.g:647:6: (lv_component_12_0= ruleComponent )
                    	    // InternalT2.g:648:7: lv_component_12_0= ruleComponent
                    	    {

                    	    							newCompositeNode(grammarAccess.getComplexItemTypeAccess().getComponentComponentParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_component_12_0=ruleComponent();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getComplexItemTypeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"component",
                    	    								lv_component_12_0,
                    	    								"at.ac.tuwien.big.T2.Component");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,15,FOLLOW_10); 

                    				newLeafNode(otherlv_13, grammarAccess.getComplexItemTypeAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_14=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getComplexItemTypeAccess().getRightCurlyBracketKeyword_7());
            		

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
    // InternalT2.g:679:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // InternalT2.g:679:50: (iv_ruleComponent= ruleComponent EOF )
            // InternalT2.g:680:2: iv_ruleComponent= ruleComponent EOF
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
    // InternalT2.g:686:1: ruleComponent returns [EObject current=null] : ( () otherlv_1= 'Component' otherlv_2= '{' (otherlv_3= 'itemtype' ( ( ruleEString ) ) )? (otherlv_5= 'overseasitem' ( ( ruleEString ) ) )? (otherlv_7= 'overseasmaterial' ( ( ruleEString ) ) )? otherlv_9= '}' ) ;
    public final EObject ruleComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;


        	enterRule();

        try {
            // InternalT2.g:692:2: ( ( () otherlv_1= 'Component' otherlv_2= '{' (otherlv_3= 'itemtype' ( ( ruleEString ) ) )? (otherlv_5= 'overseasitem' ( ( ruleEString ) ) )? (otherlv_7= 'overseasmaterial' ( ( ruleEString ) ) )? otherlv_9= '}' ) )
            // InternalT2.g:693:2: ( () otherlv_1= 'Component' otherlv_2= '{' (otherlv_3= 'itemtype' ( ( ruleEString ) ) )? (otherlv_5= 'overseasitem' ( ( ruleEString ) ) )? (otherlv_7= 'overseasmaterial' ( ( ruleEString ) ) )? otherlv_9= '}' )
            {
            // InternalT2.g:693:2: ( () otherlv_1= 'Component' otherlv_2= '{' (otherlv_3= 'itemtype' ( ( ruleEString ) ) )? (otherlv_5= 'overseasitem' ( ( ruleEString ) ) )? (otherlv_7= 'overseasmaterial' ( ( ruleEString ) ) )? otherlv_9= '}' )
            // InternalT2.g:694:3: () otherlv_1= 'Component' otherlv_2= '{' (otherlv_3= 'itemtype' ( ( ruleEString ) ) )? (otherlv_5= 'overseasitem' ( ( ruleEString ) ) )? (otherlv_7= 'overseasmaterial' ( ( ruleEString ) ) )? otherlv_9= '}'
            {
            // InternalT2.g:694:3: ()
            // InternalT2.g:695:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getComponentAccess().getComponentAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getComponentAccess().getComponentKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalT2.g:709:3: (otherlv_3= 'itemtype' ( ( ruleEString ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==16) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalT2.g:710:4: otherlv_3= 'itemtype' ( ( ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getComponentAccess().getItemtypeKeyword_3_0());
                    			
                    // InternalT2.g:714:4: ( ( ruleEString ) )
                    // InternalT2.g:715:5: ( ruleEString )
                    {
                    // InternalT2.g:715:5: ( ruleEString )
                    // InternalT2.g:716:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getComponentRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getComponentAccess().getItemtypeItemTypeCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalT2.g:731:3: (otherlv_5= 'overseasitem' ( ( ruleEString ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==13) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalT2.g:732:4: otherlv_5= 'overseasitem' ( ( ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getComponentAccess().getOverseasitemKeyword_4_0());
                    			
                    // InternalT2.g:736:4: ( ( ruleEString ) )
                    // InternalT2.g:737:5: ( ruleEString )
                    {
                    // InternalT2.g:737:5: ( ruleEString )
                    // InternalT2.g:738:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getComponentRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getComponentAccess().getOverseasitemOverseasItemCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalT2.g:753:3: (otherlv_7= 'overseasmaterial' ( ( ruleEString ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==18) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalT2.g:754:4: otherlv_7= 'overseasmaterial' ( ( ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,18,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getComponentAccess().getOverseasmaterialKeyword_5_0());
                    			
                    // InternalT2.g:758:4: ( ( ruleEString ) )
                    // InternalT2.g:759:5: ( ruleEString )
                    {
                    // InternalT2.g:759:5: ( ruleEString )
                    // InternalT2.g:760:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getComponentRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getComponentAccess().getOverseasmaterialOverseasMaterialCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_6());
            		

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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000001A000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000000044A000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000448000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000408000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000000005A000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000000004A000L});

}