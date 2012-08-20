/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.api;

public class CShfeFtdcTransferFutureToBankReqField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public CShfeFtdcTransferFutureToBankReqField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(CShfeFtdcTransferFutureToBankReqField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpJNI.delete_CShfeFtdcTransferFutureToBankReqField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setFutureAccount(String value) {
    ctpJNI.CShfeFtdcTransferFutureToBankReqField_FutureAccount_set(swigCPtr, this, value);
  }

  public String getFutureAccount() {
    return ctpJNI.CShfeFtdcTransferFutureToBankReqField_FutureAccount_get(swigCPtr, this);
  }

  public void setFuturePwdFlag(char value) {
    ctpJNI.CShfeFtdcTransferFutureToBankReqField_FuturePwdFlag_set(swigCPtr, this, value);
  }

  public char getFuturePwdFlag() {
    return ctpJNI.CShfeFtdcTransferFutureToBankReqField_FuturePwdFlag_get(swigCPtr, this);
  }

  public void setFutureAccPwd(String value) {
    ctpJNI.CShfeFtdcTransferFutureToBankReqField_FutureAccPwd_set(swigCPtr, this, value);
  }

  public String getFutureAccPwd() {
    return ctpJNI.CShfeFtdcTransferFutureToBankReqField_FutureAccPwd_get(swigCPtr, this);
  }

  public void setTradeAmt(double value) {
    ctpJNI.CShfeFtdcTransferFutureToBankReqField_TradeAmt_set(swigCPtr, this, value);
  }

  public double getTradeAmt() {
    return ctpJNI.CShfeFtdcTransferFutureToBankReqField_TradeAmt_get(swigCPtr, this);
  }

  public void setCustFee(double value) {
    ctpJNI.CShfeFtdcTransferFutureToBankReqField_CustFee_set(swigCPtr, this, value);
  }

  public double getCustFee() {
    return ctpJNI.CShfeFtdcTransferFutureToBankReqField_CustFee_get(swigCPtr, this);
  }

  public void setCurrencyCode(String value) {
    ctpJNI.CShfeFtdcTransferFutureToBankReqField_CurrencyCode_set(swigCPtr, this, value);
  }

  public String getCurrencyCode() {
    return ctpJNI.CShfeFtdcTransferFutureToBankReqField_CurrencyCode_get(swigCPtr, this);
  }

  public CShfeFtdcTransferFutureToBankReqField() {
    this(ctpJNI.new_CShfeFtdcTransferFutureToBankReqField(), true);
  }

}