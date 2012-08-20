/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.api;

public class CShfeFtdcTransferBankToFutureReqField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public CShfeFtdcTransferBankToFutureReqField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(CShfeFtdcTransferBankToFutureReqField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpJNI.delete_CShfeFtdcTransferBankToFutureReqField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setFutureAccount(String value) {
    ctpJNI.CShfeFtdcTransferBankToFutureReqField_FutureAccount_set(swigCPtr, this, value);
  }

  public String getFutureAccount() {
    return ctpJNI.CShfeFtdcTransferBankToFutureReqField_FutureAccount_get(swigCPtr, this);
  }

  public void setFuturePwdFlag(char value) {
    ctpJNI.CShfeFtdcTransferBankToFutureReqField_FuturePwdFlag_set(swigCPtr, this, value);
  }

  public char getFuturePwdFlag() {
    return ctpJNI.CShfeFtdcTransferBankToFutureReqField_FuturePwdFlag_get(swigCPtr, this);
  }

  public void setFutureAccPwd(String value) {
    ctpJNI.CShfeFtdcTransferBankToFutureReqField_FutureAccPwd_set(swigCPtr, this, value);
  }

  public String getFutureAccPwd() {
    return ctpJNI.CShfeFtdcTransferBankToFutureReqField_FutureAccPwd_get(swigCPtr, this);
  }

  public void setTradeAmt(double value) {
    ctpJNI.CShfeFtdcTransferBankToFutureReqField_TradeAmt_set(swigCPtr, this, value);
  }

  public double getTradeAmt() {
    return ctpJNI.CShfeFtdcTransferBankToFutureReqField_TradeAmt_get(swigCPtr, this);
  }

  public void setCustFee(double value) {
    ctpJNI.CShfeFtdcTransferBankToFutureReqField_CustFee_set(swigCPtr, this, value);
  }

  public double getCustFee() {
    return ctpJNI.CShfeFtdcTransferBankToFutureReqField_CustFee_get(swigCPtr, this);
  }

  public void setCurrencyCode(String value) {
    ctpJNI.CShfeFtdcTransferBankToFutureReqField_CurrencyCode_set(swigCPtr, this, value);
  }

  public String getCurrencyCode() {
    return ctpJNI.CShfeFtdcTransferBankToFutureReqField_CurrencyCode_get(swigCPtr, this);
  }

  public CShfeFtdcTransferBankToFutureReqField() {
    this(ctpJNI.new_CShfeFtdcTransferBankToFutureReqField(), true);
  }

}