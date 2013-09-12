
/* First created by JCasGen Wed Sep 11 23:09:37 EDT 2013 */

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
 * Updated by JCasGen Wed Sep 11 23:37:48 EDT 2013
 * @generated */
public class QuestionToken_Type extends Annotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (QuestionToken_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = QuestionToken_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new QuestionToken(addr, QuestionToken_Type.this);
  			   QuestionToken_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new QuestionToken(addr, QuestionToken_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = QuestionToken.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("QuestionToken");



  /** @generated */
  final Feature casFeat_questionId;
  /** @generated */
  final int     casFeatCode_questionId;
  /** @generated */ 
  public int getQuestionId(int addr) {
        if (featOkTst && casFeat_questionId == null)
      jcas.throwFeatMissing("questionId", "QuestionToken");
    return ll_cas.ll_getIntValue(addr, casFeatCode_questionId);
  }
  /** @generated */    
  public void setQuestionId(int addr, int v) {
        if (featOkTst && casFeat_questionId == null)
      jcas.throwFeatMissing("questionId", "QuestionToken");
    ll_cas.ll_setIntValue(addr, casFeatCode_questionId, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public QuestionToken_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_questionId = jcas.getRequiredFeatureDE(casType, "questionId", "uima.cas.Integer", featOkTst);
    casFeatCode_questionId  = (null == casFeat_questionId) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_questionId).getCode();

  }
}



    