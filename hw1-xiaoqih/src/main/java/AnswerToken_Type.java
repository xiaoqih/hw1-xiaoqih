
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
 * Updated by JCasGen Wed Sep 11 23:15:18 EDT 2013
 * @generated */
public class AnswerToken_Type extends Annotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (AnswerToken_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = AnswerToken_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new AnswerToken(addr, AnswerToken_Type.this);
  			   AnswerToken_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new AnswerToken(addr, AnswerToken_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = AnswerToken.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("AnswerToken");



  /** @generated */
  final Feature casFeat_correctness;
  /** @generated */
  final int     casFeatCode_correctness;
  /** @generated */ 
  public boolean getCorrectness(int addr) {
        if (featOkTst && casFeat_correctness == null)
      jcas.throwFeatMissing("correctness", "AnswerToken");
    return ll_cas.ll_getBooleanValue(addr, casFeatCode_correctness);
  }
  /** @generated */    
  public void setCorrectness(int addr, boolean v) {
        if (featOkTst && casFeat_correctness == null)
      jcas.throwFeatMissing("correctness", "AnswerToken");
    ll_cas.ll_setBooleanValue(addr, casFeatCode_correctness, v);}
    
  
 
  /** @generated */
  final Feature casFeat_rank;
  /** @generated */
  final int     casFeatCode_rank;
  /** @generated */ 
  public short getRank(int addr) {
        if (featOkTst && casFeat_rank == null)
      jcas.throwFeatMissing("rank", "AnswerToken");
    return ll_cas.ll_getShortValue(addr, casFeatCode_rank);
  }
  /** @generated */    
  public void setRank(int addr, short v) {
        if (featOkTst && casFeat_rank == null)
      jcas.throwFeatMissing("rank", "AnswerToken");
    ll_cas.ll_setShortValue(addr, casFeatCode_rank, v);}
    
  
 
  /** @generated */
  final Feature casFeat_answerId;
  /** @generated */
  final int     casFeatCode_answerId;
  /** @generated */ 
  public int getAnswerId(int addr) {
        if (featOkTst && casFeat_answerId == null)
      jcas.throwFeatMissing("answerId", "AnswerToken");
    return ll_cas.ll_getIntValue(addr, casFeatCode_answerId);
  }
  /** @generated */    
  public void setAnswerId(int addr, int v) {
        if (featOkTst && casFeat_answerId == null)
      jcas.throwFeatMissing("answerId", "AnswerToken");
    ll_cas.ll_setIntValue(addr, casFeatCode_answerId, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public AnswerToken_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_correctness = jcas.getRequiredFeatureDE(casType, "correctness", "uima.cas.Boolean", featOkTst);
    casFeatCode_correctness  = (null == casFeat_correctness) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_correctness).getCode();

 
    casFeat_rank = jcas.getRequiredFeatureDE(casType, "rank", "uima.cas.Short", featOkTst);
    casFeatCode_rank  = (null == casFeat_rank) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_rank).getCode();

 
    casFeat_answerId = jcas.getRequiredFeatureDE(casType, "answerId", "uima.cas.Integer", featOkTst);
    casFeatCode_answerId  = (null == casFeat_answerId) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_answerId).getCode();

  }
}



    