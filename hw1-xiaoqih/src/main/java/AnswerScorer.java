

/* First created by JCasGen Wed Sep 11 23:11:09 EDT 2013 */

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Wed Sep 11 23:15:18 EDT 2013
 * XML source: C:/Users/xiaoqi/workspace_11791/hw1-xiaoqih/src/main/resources/AnswerScorerDescriptor.xml
 * @generated */
public class AnswerScorer extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(AnswerScorer.class);
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
  protected AnswerScorer() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public AnswerScorer(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public AnswerScorer(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public AnswerScorer(JCas jcas, int begin, int end) {
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
  //* Feature: score

  /** getter for score - gets 
   * @generated */
  public float getScore() {
    if (AnswerScorer_Type.featOkTst && ((AnswerScorer_Type)jcasType).casFeat_score == null)
      jcasType.jcas.throwFeatMissing("score", "AnswerScorer");
    return jcasType.ll_cas.ll_getFloatValue(addr, ((AnswerScorer_Type)jcasType).casFeatCode_score);}
    
  /** setter for score - sets  
   * @generated */
  public void setScore(float v) {
    if (AnswerScorer_Type.featOkTst && ((AnswerScorer_Type)jcasType).casFeat_score == null)
      jcasType.jcas.throwFeatMissing("score", "AnswerScorer");
    jcasType.ll_cas.ll_setFloatValue(addr, ((AnswerScorer_Type)jcasType).casFeatCode_score, v);}    
   
    
  //*--------------*
  //* Feature: answerId

  /** getter for answerId - gets 
   * @generated */
  public int getAnswerId() {
    if (AnswerScorer_Type.featOkTst && ((AnswerScorer_Type)jcasType).casFeat_answerId == null)
      jcasType.jcas.throwFeatMissing("answerId", "AnswerScorer");
    return jcasType.ll_cas.ll_getIntValue(addr, ((AnswerScorer_Type)jcasType).casFeatCode_answerId);}
    
  /** setter for answerId - sets  
   * @generated */
  public void setAnswerId(int v) {
    if (AnswerScorer_Type.featOkTst && ((AnswerScorer_Type)jcasType).casFeat_answerId == null)
      jcasType.jcas.throwFeatMissing("answerId", "AnswerScorer");
    jcasType.ll_cas.ll_setIntValue(addr, ((AnswerScorer_Type)jcasType).casFeatCode_answerId, v);}    
  }

    