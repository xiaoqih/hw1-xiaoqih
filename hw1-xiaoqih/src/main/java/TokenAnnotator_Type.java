
/* First created by JCasGen Wed Sep 11 23:29:13 EDT 2013 */

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
 * Updated by JCasGen Wed Sep 11 23:29:13 EDT 2013
 * @generated */
public class TokenAnnotator_Type extends Annotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (TokenAnnotator_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = TokenAnnotator_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new TokenAnnotator(addr, TokenAnnotator_Type.this);
  			   TokenAnnotator_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new TokenAnnotator(addr, TokenAnnotator_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = TokenAnnotator.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("TokenAnnotator");
 
  /** @generated */
  final Feature casFeat_token;
  /** @generated */
  final int     casFeatCode_token;
  /** @generated */ 
  public int getToken(int addr) {
        if (featOkTst && casFeat_token == null)
      jcas.throwFeatMissing("token", "TokenAnnotator");
    return ll_cas.ll_getRefValue(addr, casFeatCode_token);
  }
  /** @generated */    
  public void setToken(int addr, int v) {
        if (featOkTst && casFeat_token == null)
      jcas.throwFeatMissing("token", "TokenAnnotator");
    ll_cas.ll_setRefValue(addr, casFeatCode_token, v);}
    
  
 
  /** @generated */
  final Feature casFeat_tokenlist;
  /** @generated */
  final int     casFeatCode_tokenlist;
  /** @generated */ 
  public int getTokenlist(int addr) {
        if (featOkTst && casFeat_tokenlist == null)
      jcas.throwFeatMissing("tokenlist", "TokenAnnotator");
    return ll_cas.ll_getRefValue(addr, casFeatCode_tokenlist);
  }
  /** @generated */    
  public void setTokenlist(int addr, int v) {
        if (featOkTst && casFeat_tokenlist == null)
      jcas.throwFeatMissing("tokenlist", "TokenAnnotator");
    ll_cas.ll_setRefValue(addr, casFeatCode_tokenlist, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public TokenAnnotator_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_token = jcas.getRequiredFeatureDE(casType, "token", "uima.cas.AnnotationBase", featOkTst);
    casFeatCode_token  = (null == casFeat_token) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_token).getCode();

 
    casFeat_tokenlist = jcas.getRequiredFeatureDE(casType, "tokenlist", "uima.cas.FSList", featOkTst);
    casFeatCode_tokenlist  = (null == casFeat_tokenlist) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_tokenlist).getCode();

  }
}



    