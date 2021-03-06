/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.api;

public class CShfeFtdcParkedOrderActionField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public CShfeFtdcParkedOrderActionField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(CShfeFtdcParkedOrderActionField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpJNI.delete_CShfeFtdcParkedOrderActionField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    ctpJNI.CShfeFtdcParkedOrderActionField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ctpJNI.CShfeFtdcParkedOrderActionField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    ctpJNI.CShfeFtdcParkedOrderActionField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return ctpJNI.CShfeFtdcParkedOrderActionField_InvestorID_get(swigCPtr, this);
  }

  public void setOrderActionRef(int value) {
    ctpJNI.CShfeFtdcParkedOrderActionField_OrderActionRef_set(swigCPtr, this, value);
  }

  public int getOrderActionRef() {
    return ctpJNI.CShfeFtdcParkedOrderActionField_OrderActionRef_get(swigCPtr, this);
  }

  public void setOrderRef(String value) {
    ctpJNI.CShfeFtdcParkedOrderActionField_OrderRef_set(swigCPtr, this, value);
  }

  public String getOrderRef() {
    return ctpJNI.CShfeFtdcParkedOrderActionField_OrderRef_get(swigCPtr, this);
  }

  public void setRequestID(int value) {
    ctpJNI.CShfeFtdcParkedOrderActionField_RequestID_set(swigCPtr, this, value);
  }

  public int getRequestID() {
    return ctpJNI.CShfeFtdcParkedOrderActionField_RequestID_get(swigCPtr, this);
  }

  public void setFrontID(int value) {
    ctpJNI.CShfeFtdcParkedOrderActionField_FrontID_set(swigCPtr, this, value);
  }

  public int getFrontID() {
    return ctpJNI.CShfeFtdcParkedOrderActionField_FrontID_get(swigCPtr, this);
  }

  public void setSessionID(int value) {
    ctpJNI.CShfeFtdcParkedOrderActionField_SessionID_set(swigCPtr, this, value);
  }

  public int getSessionID() {
    return ctpJNI.CShfeFtdcParkedOrderActionField_SessionID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    ctpJNI.CShfeFtdcParkedOrderActionField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return ctpJNI.CShfeFtdcParkedOrderActionField_ExchangeID_get(swigCPtr, this);
  }

  public void setOrderSysID(String value) {
    ctpJNI.CShfeFtdcParkedOrderActionField_OrderSysID_set(swigCPtr, this, value);
  }

  public String getOrderSysID() {
    return ctpJNI.CShfeFtdcParkedOrderActionField_OrderSysID_get(swigCPtr, this);
  }

  public void setActionFlag(char value) {
    ctpJNI.CShfeFtdcParkedOrderActionField_ActionFlag_set(swigCPtr, this, value);
  }

  public char getActionFlag() {
    return ctpJNI.CShfeFtdcParkedOrderActionField_ActionFlag_get(swigCPtr, this);
  }

  public void setLimitPrice(double value) {
    ctpJNI.CShfeFtdcParkedOrderActionField_LimitPrice_set(swigCPtr, this, value);
  }

  public double getLimitPrice() {
    return ctpJNI.CShfeFtdcParkedOrderActionField_LimitPrice_get(swigCPtr, this);
  }

  public void setVolumeChange(int value) {
    ctpJNI.CShfeFtdcParkedOrderActionField_VolumeChange_set(swigCPtr, this, value);
  }

  public int getVolumeChange() {
    return ctpJNI.CShfeFtdcParkedOrderActionField_VolumeChange_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    ctpJNI.CShfeFtdcParkedOrderActionField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return ctpJNI.CShfeFtdcParkedOrderActionField_UserID_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    ctpJNI.CShfeFtdcParkedOrderActionField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return ctpJNI.CShfeFtdcParkedOrderActionField_InstrumentID_get(swigCPtr, this);
  }

  public void setParkedOrderActionID(String value) {
    ctpJNI.CShfeFtdcParkedOrderActionField_ParkedOrderActionID_set(swigCPtr, this, value);
  }

  public String getParkedOrderActionID() {
    return ctpJNI.CShfeFtdcParkedOrderActionField_ParkedOrderActionID_get(swigCPtr, this);
  }

  public void setUserType(char value) {
    ctpJNI.CShfeFtdcParkedOrderActionField_UserType_set(swigCPtr, this, value);
  }

  public char getUserType() {
    return ctpJNI.CShfeFtdcParkedOrderActionField_UserType_get(swigCPtr, this);
  }

  public void setStatus(char value) {
    ctpJNI.CShfeFtdcParkedOrderActionField_Status_set(swigCPtr, this, value);
  }

  public char getStatus() {
    return ctpJNI.CShfeFtdcParkedOrderActionField_Status_get(swigCPtr, this);
  }

  public void setErrorID(int value) {
    ctpJNI.CShfeFtdcParkedOrderActionField_ErrorID_set(swigCPtr, this, value);
  }

  public int getErrorID() {
    return ctpJNI.CShfeFtdcParkedOrderActionField_ErrorID_get(swigCPtr, this);
  }

  public void setErrorMsg(String value) {
    ctpJNI.CShfeFtdcParkedOrderActionField_ErrorMsg_set(swigCPtr, this, value);
  }

  public String getErrorMsg() {
    return ctpJNI.CShfeFtdcParkedOrderActionField_ErrorMsg_get(swigCPtr, this);
  }

  public CShfeFtdcParkedOrderActionField() {
    this(ctpJNI.new_CShfeFtdcParkedOrderActionField(), true);
  }

}
