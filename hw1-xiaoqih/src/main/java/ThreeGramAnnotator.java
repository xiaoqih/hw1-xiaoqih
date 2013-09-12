

/* First created by JCasGen Wed Sep 11 23:21:12 EDT 2013 */

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Wed Sep 11 23:21:12 EDT 2013
 * XML source: C:/Users/xiaoqi/workspace_11791/hw1-xiaoqih/src/main/resources/ThreeGramAnnotatorDescriptor.xml
 * @generated */
public class ThreeGramAnnotator extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(ThreeGramAnnotator.class);
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
  protected ThreeGramAnnotator() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public ThreeGramAnnotator(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public ThreeGramAnnotator(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public ThreeGramAnnotator(JCas jcas, int begin, int end) {
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
    if (ThreeGramAnnotator_Type.featOkTst && ((ThreeGramAnnotator_Type)jcasType).casFeat_confidence == null)
      jcasType.jcas.throwFeatMissing("confidence", "ThreeGramAnnotator");
    return jcasType.ll_cas.ll_getFloatValue(addr, ((ThreeGramAnnotator_Type)jcasType).casFeatCode_confidence);}
    
  /** setter for confidence - sets  
   * @generated */
  public void setConfidence(float v) {
    if (ThreeGramAnnotator_Type.featOkTst && ((ThreeGramAnnotator_Type)jcasType).casFeat_confidence == null)
      jcasType.jcas.throwFeatMissing("confidence", "ThreeGramAnnotator");
    jcasType.ll_cas.ll_setFloatValue(addr, ((ThreeGramAnnotator_Type)jcasType).casFeatCode_confidence, v);}    
  }

    