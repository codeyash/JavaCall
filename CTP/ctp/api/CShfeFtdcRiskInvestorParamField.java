/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.api;

public class CShfeFtdcRiskInvestorParamField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public CShfeFtdcRiskInvestorParamField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(CShfeFtdcRiskInvestorParamField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpJNI.delete_CShfeFtdcRiskInvestorParamField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setParamID(int value) {
    ctpJNI.CShfeFtdcRiskInvestorParamField_ParamID_set(swigCPtr, this, value);
  }

  public int getParamID() {
    return ctpJNI.CShfeFtdcRiskInvestorParamField_ParamID_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    ctpJNI.CShfeFtdcRiskInvestorParamField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ctpJNI.CShfeFtdcRiskInvestorParamField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    ctpJNI.CShfeFtdcRiskInvestorParamField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return ctpJNI.CShfeFtdcRiskInvestorParamField_InvestorID_get(swigCPtr, this);
  }

  public void setParamValue(String value) {
    ctpJNI.CShfeFtdcRiskInvestorParamField_ParamValue_set(swigCPtr, this, value);
  }

  public String getParamValue() {
    return ctpJNI.CShfeFtdcRiskInvestorParamField_ParamValue_get(swigCPtr, this);
  }

  public CShfeFtdcRiskInvestorParamField() {
    this(ctpJNI.new_CShfeFtdcRiskInvestorParamField(), true);
  }

}