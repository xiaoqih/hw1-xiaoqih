

/* First created by JCasGen Wed Sep 11 23:28:13 EDT 2013 */

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Wed Sep 11 23:28:34 EDT 2013
 * XML source: C:/Users/xiaoqi/workspace_11791/hw1-xiaoqih/src/main/resources/inputData/TestElementAnnotatorDescriptor.xml
 * @generated */
public class TestElementAnnotator extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(TestElementAnnotator.class);
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
  protected TestElementAnnotator() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public TestElementAnnotator(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public TestElementAnnotator(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public TestElementAnnotator(JCas jcas, int begin, int end) {
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
     
}

    