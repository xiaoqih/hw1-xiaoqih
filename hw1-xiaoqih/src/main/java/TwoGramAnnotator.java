

/* First created by JCasGen Wed Sep 11 23:21:12 EDT 2013 */

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Wed Sep 11 23:21:12 EDT 2013
 * XML source: C:/Users/xiaoqi/workspace_11791/hw1-xiaoqih/src/main/resources/TwoGramAnnotatorDescriptor.xml
 * @generated */
public class TwoGramAnnotator extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(TwoGramAnnotator.class);
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
  protected TwoGramAnnotator() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public TwoGramAnnotator(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public TwoGramAnnotator(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public TwoGramAnnotator(JCas jcas, int begin, int end) {
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
  //* Feature: confidence

  /** getter for confidence - gets 
   * @generated */
  public float getConfidence() {
    if (TwoGramAnnotator_Type.featOkTst && ((TwoGramAnnotator_Type)jcasType).casFeat_confidence == null)
      jcasType.jcas.throwFeatMissing("confidence", "TwoGramAnnotator");
    return jcasType.ll_cas.ll_getFloatValue(addr, ((TwoGramAnnotator_Type)jcasType).casFeatCode_confidence);}
    
  /** setter for confidence - sets  
   * @generated */
  public void setConfidence(float v) {
    if (TwoGramAnnotator_Type.featOkTst && ((TwoGramAnnotator_Type)jcasType).casFeat_confidence == null)
      jcasType.jcas.throwFeatMissing("confidence", "TwoGramAnnotator");
    jcasType.ll_cas.ll_setFloatValue(addr, ((TwoGramAnnotator_Type)jcasType).casFeatCode_confidence, v);}    
  }

    