/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.api;

public class CShfeFtdcContractBankField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public CShfeFtdcContractBankField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(CShfeFtdcContractBankField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpJNI.delete_CShfeFtdcContractBankField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    ctpJNI.CShfeFtdcContractBankField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ctpJNI.CShfeFtdcContractBankField_BrokerID_get(swigCPtr, this);
  }

  public void setBankID(String value) {
    ctpJNI.CShfeFtdcContractBankField_BankID_set(swigCPtr, this, value);
  }

  public String getBankID() {
    return ctpJNI.CShfeFtdcContractBankField_BankID_get(swigCPtr, this);
  }

  public void setBankBrchID(String value) {
    ctpJNI.CShfeFtdcContractBankField_BankBrchID_set(swigCPtr, this, value);
  }

  public String getBankBrchID() {
    return ctpJNI.CShfeFtdcContractBankField_BankBrchID_get(swigCPtr, this);
  }

  public void setBankName(String value) {
    ctpJNI.CShfeFtdcContractBankField_BankName_set(swigCPtr, this, value);
  }

  public String getBankName() {
    return ctpJNI.CShfeFtdcContractBankField_BankName_get(swigCPtr, this);
  }

  public CShfeFtdcContractBankField() {
    this(ctpJNI.new_CShfeFtdcContractBankField(), true);
  }

}
