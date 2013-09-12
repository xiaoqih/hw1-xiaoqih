

/* First created by JCasGen Wed Sep 11 23:09:37 EDT 2013 */

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Wed Sep 11 23:37:48 EDT 2013
 * XML source: C:/Users/xiaoqi/workspace_11791/hw1-xiaoqih/src/main/resources/QuestionTokenDescriptor.xml
 * @generated */
public class QuestionToken extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(QuestionToken.class);
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
  protected QuestionToken() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public QuestionToken(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public QuestionToken(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public QuestionToken(JCas jcas, int begin, int end) {
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
  //* Feature: questionId

  /** getter for questionId - gets 
   * @generated */
  public int getQuestionId() {
    if (QuestionToken_Type.featOkTst && ((QuestionToken_Type)jcasType).casFeat_questionId == null)
      jcasType.jcas.throwFeatMissing("questionId", "QuestionToken");
    return jcasType.ll_cas.ll_getIntValue(addr, ((QuestionToken_Type)jcasType).casFeatCode_questionId);}
    
  /** setter for questionId - sets  
   * @generated */
  public void setQuestionId(int v) {
    if (QuestionToken_Type.featOkTst && ((QuestionToken_Type)jcasType).casFeat_questionId == null)
      jcasType.jcas.throwFeatMissing("questionId", "QuestionToken");
    jcasType.ll_cas.ll_setIntValue(addr, ((QuestionToken_Type)jcasType).casFeatCode_questionId, v);}    
  }

    