

/* First created by JCasGen Wed Sep 11 23:29:13 EDT 2013 */

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.AnnotationBase;
import org.apache.uima.jcas.cas.FSList;
import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Wed Sep 11 23:29:13 EDT 2013
 * XML source: C:/Users/xiaoqi/workspace_11791/hw1-xiaoqih/src/main/resources/TokenAnnonatorDescriptor.xml
 * @generated */
public class TokenAnnotator extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(TokenAnnotator.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated  */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected TokenAnnotator() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public TokenAnnotator(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public TokenAnnotator(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public TokenAnnotator(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: token

  /** getter for token - gets the token of a sentence
   * @generated */
  public AnnotationBase getToken() {
    if (TokenAnnotator_Type.featOkTst && ((TokenAnnotator_Type)jcasType).casFeat_token == null)
      jcasType.jcas.throwFeatMissing("token", "TokenAnnotator");
    return (AnnotationBase)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((TokenAnnotator_Type)jcasType).casFeatCode_token)));}
    
  /** setter for token - sets the token of a sentence 
   * @generated */
  public void setToken(AnnotationBase v) {
    if (TokenAnnotator_Type.featOkTst && ((TokenAnnotator_Type)jcasType).casFeat_token == null)
      jcasType.jcas.throwFeatMissing("token", "TokenAnnotator");
    jcasType.ll_cas.ll_setRefValue(addr, ((TokenAnnotator_Type)jcasType).casFeatCode_token, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: tokenlist

  /** getter for tokenlist - gets tokenlist
   * @generated */
  public FSList getTokenlist() {
    if (TokenAnnotator_Type.featOkTst && ((TokenAnnotator_Type)jcasType).casFeat_tokenlist == null)
      jcasType.jcas.throwFeatMissing("tokenlist", "TokenAnnotator");
    return (FSList)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((TokenAnnotator_Type)jcasType).casFeatCode_tokenlist)));}
    
  /** setter for tokenlist - sets tokenlist 
   * @generated */
  public void setTokenlist(FSList v) {
    if (TokenAnnotator_Type.featOkTst && ((TokenAnnotator_Type)jcasType).casFeat_tokenlist == null)
      jcasType.jcas.throwFeatMissing("tokenlist", "TokenAnnotator");
    jcasType.ll_cas.ll_setRefValue(addr, ((TokenAnnotator_Type)jcasType).casFeatCode_tokenlist, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    