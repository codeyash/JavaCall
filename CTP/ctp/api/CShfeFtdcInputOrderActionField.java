/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.api;

public class CShfeFtdcInputOrderActionField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public CShfeFtdcInputOrderActionField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(CShfeFtdcInputOrderActionField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpJNI.delete_CShfeFtdcInputOrderActionField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    ctpJNI.CShfeFtdcInputOrderActionField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ctpJNI.CShfeFtdcInputOrderActionField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    ctpJNI.CShfeFtdcInputOrderActionField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return ctpJNI.CShfeFtdcInputOrderActionField_InvestorID_get(swigCPtr, this);
  }

  public void setOrderActionRef(int value) {
    ctpJNI.CShfeFtdcInputOrderActionField_OrderActionRef_set(swigCPtr, this, value);
  }

  public int getOrderActionRef() {
    return ctpJNI.CShfeFtdcInputOrderActionField_OrderActionRef_get(swigCPtr, this);
  }

  public void setOrderRef(String value) {
    ctpJNI.CShfeFtdcInputOrderActionField_OrderRef_set(swigCPtr, this, value);
  }

  public String getOrderRef() {
    return ctpJNI.CShfeFtdcInputOrderActionField_OrderRef_get(swigCPtr, this);
  }

  public void setRequestID(int value) {
    ctpJNI.CShfeFtdcInputOrderActionField_RequestID_set(swigCPtr, this, value);
  }

  public int getRequestID() {
    return ctpJNI.CShfeFtdcInputOrderActionField_RequestID_get(swigCPtr, this);
  }

  public void setFrontID(int value) {
    ctpJNI.CShfeFtdcInputOrderActionField_FrontID_set(swigCPtr, this, value);
  }

  public int getFrontID() {
    return ctpJNI.CShfeFtdcInputOrderActionField_FrontID_get(swigCPtr, this);
  }

  public void setSessionID(int value) {
    ctpJNI.CShfeFtdcInputOrderActionField_SessionID_set(swigCPtr, this, value);
  }

  public int getSessionID() {
    return ctpJNI.CShfeFtdcInputOrderActionField_SessionID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    ctpJNI.CShfeFtdcInputOrderActionField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return ctpJNI.CShfeFtdcInputOrderActionField_ExchangeID_get(swigCPtr, this);
  }

  public void setOrderSysID(String value) {
    ctpJNI.CShfeFtdcInputOrderActionField_OrderSysID_set(swigCPtr, this, value);
  }

  public String getOrderSysID() {
    return ctpJNI.CShfeFtdcInputOrderActionField_OrderSysID_get(swigCPtr, this);
  }

  public void setActionFlag(char value) {
    ctpJNI.CShfeFtdcInputOrderActionField_ActionFlag_set(swigCPtr, this, value);
  }

  public char getActionFlag() {
    return ctpJNI.CShfeFtdcInputOrderActionField_ActionFlag_get(swigCPtr, this);
  }

  public void setLimitPrice(double value) {
    ctpJNI.CShfeFtdcInputOrderActionField_LimitPrice_set(swigCPtr, this, value);
  }

  public double getLimitPrice() {
    return ctpJNI.CShfeFtdcInputOrderActionField_LimitPrice_get(swigCPtr, this);
  }

  public void setVolumeChange(int value) {
    ctpJNI.CShfeFtdcInputOrderActionField_VolumeChange_set(swigCPtr, this, value);
  }

  public int getVolumeChange() {
    return ctpJNI.CShfeFtdcInputOrderActionField_VolumeChange_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    ctpJNI.CShfeFtdcInputOrderActionField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return ctpJNI.CShfeFtdcInputOrderActionField_UserID_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    ctpJNI.CShfeFtdcInputOrderActionField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return ctpJNI.CShfeFtdcInputOrderActionField_InstrumentID_get(swigCPtr, this);
  }

  public CShfeFtdcInputOrderActionField() {
    this(ctpJNI.new_CShfeFtdcInputOrderActionField(), true);
  }

}