

/* First created by JCasGen Wed Sep 11 23:21:12 EDT 2013 */

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.IntegerArray;
import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Wed Sep 11 23:21:12 EDT 2013
 * XML source: C:/Users/xiaoqi/workspace_11791/hw1-xiaoqih/src/main/resources/EvaluatorDescriptor.xml
 * @generated */
public class Evaluator extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Evaluator.class);
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
  protected Evaluator() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Evaluator(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Evaluator(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Evaluator(JCas jcas, int begin, int end) {
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
  //* Feature: answerSort

  /** getter for answerSort - gets sort answers accoding to the scores
   * @generated */
  public IntegerArray getAnswerSort() {
    if (Evaluator_Type.featOkTst && ((Evaluator_Type)jcasType).casFeat_answerSort == null)
      jcasType.jcas.throwFeatMissing("answerSort", "Evaluator");
    return (IntegerArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Evaluator_Type)jcasType).casFeatCode_answerSort)));}
    
  /** setter for answerSort - sets sort answers accoding to the scores 
   * @generated */
  public void setAnswerSort(IntegerArray v) {
    if (Evaluator_Type.featOkTst && ((Evaluator_Type)jcasType).casFeat_answerSort == null)
      jcasType.jcas.throwFeatMissing("answerSort", "Evaluator");
    jcasType.ll_cas.ll_setRefValue(addr, ((Evaluator_Type)jcasType).casFeatCode_answerSort, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for answerSort - gets an indexed value - sort answers accoding to the scores
   * @generated */
  public int getAnswerSort(int i) {
    if (Evaluator_Type.featOkTst && ((Evaluator_Type)jcasType).casFeat_answerSort == null)
      jcasType.jcas.throwFeatMissing("answerSort", "Evaluator");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Evaluator_Type)jcasType).casFeatCode_answerSort), i);
    return jcasType.ll_cas.ll_getIntArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Evaluator_Type)jcasType).casFeatCode_answerSort), i);}

  /** indexed setter for answerSort - sets an indexed value - sort answers accoding to the scores
   * @generated */
  public void setAnswerSort(int i, int v) { 
    if (Evaluator_Type.featOkTst && ((Evaluator_Type)jcasType).casFeat_answerSort == null)
      jcasType.jcas.throwFeatMissing("answerSort", "Evaluator");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Evaluator_Type)jcasType).casFeatCode_answerSort), i);
    jcasType.ll_cas.ll_setIntArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Evaluator_Type)jcasType).casFeatCode_answerSort), i, v);}
   
    
  //*--------------*
  //* Feature: precision

  /** getter for precision - gets 
   * @generated */
  public float getPrecision() {
    if (Evaluator_Type.featOkTst && ((Evaluator_Type)jcasType).casFeat_precision == null)
      jcasType.jcas.throwFeatMissing("precision", "Evaluator");
    return jcasType.ll_cas.ll_getFloatValue(addr, ((Evaluator_Type)jcasType).casFeatCode_precision);}
    
  /** setter for precision - sets  
   * @generated */
  public void setPrecision(float v) {
    if (Evaluator_Type.featOkTst && ((Evaluator_Type)jcasType).casFeat_precision == null)
      jcasType.jcas.throwFeatMissing("precision", "Evaluator");
    jcasType.ll_cas.ll_setFloatValue(addr, ((Evaluator_Type)jcasType).casFeatCode_precision, v);}    
  }

    