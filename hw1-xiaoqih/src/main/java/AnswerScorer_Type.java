
/* First created by JCasGen Wed Sep 11 23:11:09 EDT 2013 */

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
 * Updated by JCasGen Wed Sep 11 23:15:18 EDT 2013
 * @generated */
public class AnswerScorer_Type extends Annotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (AnswerScorer_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = AnswerScorer_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new AnswerScorer(addr, AnswerScorer_Type.this);
  			   AnswerScorer_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new AnswerScorer(addr, AnswerScorer_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = AnswerScorer.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("AnswerScorer");



  /** @generated */
  final Feature casFeat_score;
  /** @generated */
  final int     casFeatCode_score;
  /** @generated */ 
  public float getScore(int addr) {
        if (featOkTst && casFeat_score == null)
      jcas.throwFeatMissing("score", "AnswerScorer");
    return ll_cas.ll_getFloatValue(addr, casFeatCode_score);
  }
  /** @generated */    
  public void setScore(int addr, float v) {
        if (featOkTst && casFeat_score == null)
      jcas.throwFeatMissing("score", "AnswerScorer");
    ll_cas.ll_setFloatValue(addr, casFeatCode_score, v);}
    
  
 
  /** @generated */
  final Feature casFeat_answerId;
  /** @generated */
  final int     casFeatCode_answerId;
  /** @generated */ 
  public int getAnswerId(int addr) {
        if (featOkTst && casFeat_answerId == null)
      jcas.throwFeatMissing("answerId", "AnswerScorer");
    return ll_cas.ll_getIntValue(addr, casFeatCode_answerId);
  }
  /** @generated */    
  public void setAnswerId(int addr, int v) {
        if (featOkTst && casFeat_answerId == null)
      jcas.throwFeatMissing("answerId", "AnswerScorer");
    ll_cas.ll_setIntValue(addr, casFeatCode_answerId, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public AnswerScorer_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_score = jcas.getRequiredFeatureDE(casType, "score", "uima.cas.Float", featOkTst);
    casFeatCode_score  = (null == casFeat_score) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_score).getCode();

 
    casFeat_answerId = jcas.getRequiredFeatureDE(casType, "answerId", "uima.cas.Integer", featOkTst);
    casFeatCode_answerId  = (null == casFeat_answerId) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_answerId).getCode();

  }
}



    