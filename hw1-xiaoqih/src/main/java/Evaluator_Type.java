
/* First created by JCasGen Wed Sep 11 23:21:12 EDT 2013 */

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** 
 * Updated by JCasGen Wed Sep 11 23:21:12 EDT 2013
 * @generated */
public class Evaluator_Type extends Annotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Evaluator_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Evaluator_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Evaluator(addr, Evaluator_Type.this);
  			   Evaluator_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Evaluator(addr, Evaluator_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Evaluator.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("Evaluator");
 
  /** @generated */
  final Feature casFeat_answerSort;
  /** @generated */
  final int     casFeatCode_answerSort;
  /** @generated */ 
  public int getAnswerSort(int addr) {
        if (featOkTst && casFeat_answerSort == null)
      jcas.throwFeatMissing("answerSort", "Evaluator");
    return ll_cas.ll_getRefValue(addr, casFeatCode_answerSort);
  }
  /** @generated */    
  public void setAnswerSort(int addr, int v) {
        if (featOkTst && casFeat_answerSort == null)
      jcas.throwFeatMissing("answerSort", "Evaluator");
    ll_cas.ll_setRefValue(addr, casFeatCode_answerSort, v);}
    
   /** @generated */
  public int getAnswerSort(int addr, int i) {
        if (featOkTst && casFeat_answerSort == null)
      jcas.throwFeatMissing("answerSort", "Evaluator");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getIntArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_answerSort), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_answerSort), i);
	return ll_cas.ll_getIntArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_answerSort), i);
  }
   
  /** @generated */ 
  public void setAnswerSort(int addr, int i, int v) {
        if (featOkTst && casFeat_answerSort == null)
      jcas.throwFeatMissing("answerSort", "Evaluator");
    if (lowLevelTypeChecks)
      ll_cas.ll_setIntArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_answerSort), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_answerSort), i);
    ll_cas.ll_setIntArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_answerSort), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_precision;
  /** @generated */
  final int     casFeatCode_precision;
  /** @generated */ 
  public float getPrecision(int addr) {
        if (featOkTst && casFeat_precision == null)
      jcas.throwFeatMissing("precision", "Evaluator");
    return ll_cas.ll_getFloatValue(addr, casFeatCode_precision);
  }
  /** @generated */    
  public void setPrecision(int addr, float v) {
        if (featOkTst && casFeat_precision == null)
      jcas.throwFeatMissing("precision", "Evaluator");
    ll_cas.ll_setFloatValue(addr, casFeatCode_precision, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public Evaluator_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_answerSort = jcas.getRequiredFeatureDE(casType, "answerSort", "uima.cas.IntegerArray", featOkTst);
    casFeatCode_answerSort  = (null == casFeat_answerSort) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_answerSort).getCode();

 
    casFeat_precision = jcas.getRequiredFeatureDE(casType, "precision", "uima.cas.Float", featOkTst);
    casFeatCode_precision  = (null == casFeat_precision) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_precision).getCode();

  }
}



    