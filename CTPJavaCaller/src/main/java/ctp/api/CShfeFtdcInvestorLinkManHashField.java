/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.api;

public class CShfeFtdcInvestorLinkManHashField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public CShfeFtdcInvestorLinkManHashField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(CShfeFtdcInvestorLinkManHashField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpJNI.delete_CShfeFtdcInvestorLinkManHashField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setMD5(String value) {
    ctpJNI.CShfeFtdcInvestorLinkManHashField_MD5_set(swigCPtr, this, value);
  }

  public String getMD5() {
    return ctpJNI.CShfeFtdcInvestorLinkManHashField_MD5_get(swigCPtr, this);
  }

  public void setInvestorIDBeg(String value) {
    ctpJNI.CShfeFtdcInvestorLinkManHashField_InvestorIDBeg_set(swigCPtr, this, value);
  }

  public String getInvestorIDBeg() {
    return ctpJNI.CShfeFtdcInvestorLinkManHashField_InvestorIDBeg_get(swigCPtr, this);
  }

  public void setInvestorIDEnd(String value) {
    ctpJNI.CShfeFtdcInvestorLinkManHashField_InvestorIDEnd_set(swigCPtr, this, value);
  }

  public String getInvestorIDEnd() {
    return ctpJNI.CShfeFtdcInvestorLinkManHashField_InvestorIDEnd_get(swigCPtr, this);
  }

  public CShfeFtdcInvestorLinkManHashField() {
    this(ctpJNI.new_CShfeFtdcInvestorLinkManHashField(), true);
  }

}