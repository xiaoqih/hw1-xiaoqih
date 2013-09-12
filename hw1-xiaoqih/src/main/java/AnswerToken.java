

/* First created by JCasGen Wed Sep 11 23:09:37 EDT 2013 */

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Wed Sep 11 23:15:18 EDT 2013
 * XML source: C:/Users/xiaoqi/workspace_11791/hw1-xiaoqih/src/main/resources/AnswerTokenDescriptor.xml
 * @generated */
public class AnswerToken extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(AnswerToken.class);
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
  protected AnswerToken() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public AnswerToken(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public AnswerToken(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public AnswerToken(JCas jcas, int begin, int end) {
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
  //* Feature: correctness

  /** getter for correctness - gets 1-answer is correct
0-answer is not correct
   * @generated */
  public boolean getCorrectness() {
    if (AnswerToken_Type.featOkTst && ((AnswerToken_Type)jcasType).casFeat_correctness == null)
      jcasType.jcas.throwFeatMissing("correctness", "AnswerToken");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((AnswerToken_Type)jcasType).casFeatCode_correctness);}
    
  /** setter for correctness - sets 1-answer is correct
0-answer is not correct 
   * @generated */
  public void setCorrectness(boolean v) {
    if (AnswerToken_Type.featOkTst && ((AnswerToken_Type)jcasType).casFeat_correctness == null)
      jcasType.jcas.throwFeatMissing("correctness", "AnswerToken");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((AnswerToken_Type)jcasType).casFeatCode_correctness, v);}    
   
    
  //*--------------*
  //* Feature: rank

  /** getter for rank - gets the rank of this answer
   * @generated */
  public short getRank() {
    if (AnswerToken_Type.featOkTst && ((AnswerToken_Type)jcasType).casFeat_rank == null)
      jcasType.jcas.throwFeatMissing("rank", "AnswerToken");
    return jcasType.ll_cas.ll_getShortValue(addr, ((AnswerToken_Type)jcasType).casFeatCode_rank);}
    
  /** setter for rank - sets the rank of this answer 
   * @generated */
  public void setRank(short v) {
    if (AnswerToken_Type.featOkTst && ((AnswerToken_Type)jcasType).casFeat_rank == null)
      jcasType.jcas.throwFeatMissing("rank", "AnswerToken");
    jcasType.ll_cas.ll_setShortValue(addr, ((AnswerToken_Type)jcasType).casFeatCode_rank, v);}    
   
    
  //*--------------*
  //* Feature: answerId

  /** getter for answerId - gets 
   * @generated */
  public int getAnswerId() {
    if (AnswerToken_Type.featOkTst && ((AnswerToken_Type)jcasType).casFeat_answerId == null)
      jcasType.jcas.throwFeatMissing("answerId", "AnswerToken");
    return jcasType.ll_cas.ll_getIntValue(addr, ((AnswerToken_Type)jcasType).casFeatCode_answerId);}
    
  /** setter for answerId - sets  
   * @generated */
  public void setAnswerId(int v) {
    if (AnswerToken_Type.featOkTst && ((AnswerToken_Type)jcasType).casFeat_answerId == null)
      jcasType.jcas.throwFeatMissing("answerId", "AnswerToken");
    jcasType.ll_cas.ll_setIntValue(addr, ((AnswerToken_Type)jcasType).casFeatCode_answerId, v);}    
  }

    