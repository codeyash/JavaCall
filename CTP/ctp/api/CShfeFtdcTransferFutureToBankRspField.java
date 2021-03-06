/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.api;

public class CShfeFtdcTransferFutureToBankRspField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public CShfeFtdcTransferFutureToBankRspField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(CShfeFtdcTransferFutureToBankRspField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpJNI.delete_CShfeFtdcTransferFutureToBankRspField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setRetCode(String value) {
    ctpJNI.CShfeFtdcTransferFutureToBankRspField_RetCode_set(swigCPtr, this, value);
  }

  public String getRetCode() {
    return ctpJNI.CShfeFtdcTransferFutureToBankRspField_RetCode_get(swigCPtr, this);
  }

  public void setRetInfo(String value) {
    ctpJNI.CShfeFtdcTransferFutureToBankRspField_RetInfo_set(swigCPtr, this, value);
  }

  public String getRetInfo() {
    return ctpJNI.CShfeFtdcTransferFutureToBankRspField_RetInfo_get(swigCPtr, this);
  }

  public void setFutureAccount(String value) {
    ctpJNI.CShfeFtdcTransferFutureToBankRspField_FutureAccount_set(swigCPtr, this, value);
  }

  public String getFutureAccount() {
    return ctpJNI.CShfeFtdcTransferFutureToBankRspField_FutureAccount_get(swigCPtr, this);
  }

  public void setTradeAmt(double value) {
    ctpJNI.CShfeFtdcTransferFutureToBankRspField_TradeAmt_set(swigCPtr, this, value);
  }

  public double getTradeAmt() {
    return ctpJNI.CShfeFtdcTransferFutureToBankRspField_TradeAmt_get(swigCPtr, this);
  }

  public void setCustFee(double value) {
    ctpJNI.CShfeFtdcTransferFutureToBankRspField_CustFee_set(swigCPtr, this, value);
  }

  public double getCustFee() {
    return ctpJNI.CShfeFtdcTransferFutureToBankRspField_CustFee_get(swigCPtr, this);
  }

  public void setCurrencyCode(String value) {
    ctpJNI.CShfeFtdcTransferFutureToBankRspField_CurrencyCode_set(swigCPtr, this, value);
  }

  public String getCurrencyCode() {
    return ctpJNI.CShfeFtdcTransferFutureToBankRspField_CurrencyCode_get(swigCPtr, this);
  }

  public CShfeFtdcTransferFutureToBankRspField() {
    this(ctpJNI.new_CShfeFtdcTransferFutureToBankRspField(), true);
  }

}
