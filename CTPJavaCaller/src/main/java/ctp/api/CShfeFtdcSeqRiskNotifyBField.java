/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.api;

public class CShfeFtdcSeqRiskNotifyBField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public CShfeFtdcSeqRiskNotifyBField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(CShfeFtdcSeqRiskNotifyBField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpJNI.delete_CShfeFtdcSeqRiskNotifyBField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setUniqSequenceNo(int value) {
    ctpJNI.CShfeFtdcSeqRiskNotifyBField_UniqSequenceNo_set(swigCPtr, this, value);
  }

  public int getUniqSequenceNo() {
    return ctpJNI.CShfeFtdcSeqRiskNotifyBField_UniqSequenceNo_get(swigCPtr, this);
  }

  public void setSequenceNo(int value) {
    ctpJNI.CShfeFtdcSeqRiskNotifyBField_SequenceNo_set(swigCPtr, this, value);
  }

  public int getSequenceNo() {
    return ctpJNI.CShfeFtdcSeqRiskNotifyBField_SequenceNo_get(swigCPtr, this);
  }

  public void setEventDate(String value) {
    ctpJNI.CShfeFtdcSeqRiskNotifyBField_EventDate_set(swigCPtr, this, value);
  }

  public String getEventDate() {
    return ctpJNI.CShfeFtdcSeqRiskNotifyBField_EventDate_get(swigCPtr, this);
  }

  public void setEventTime(String value) {
    ctpJNI.CShfeFtdcSeqRiskNotifyBField_EventTime_set(swigCPtr, this, value);
  }

  public String getEventTime() {
    return ctpJNI.CShfeFtdcSeqRiskNotifyBField_EventTime_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    ctpJNI.CShfeFtdcSeqRiskNotifyBField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ctpJNI.CShfeFtdcSeqRiskNotifyBField_BrokerID_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    ctpJNI.CShfeFtdcSeqRiskNotifyBField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return ctpJNI.CShfeFtdcSeqRiskNotifyBField_UserID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    ctpJNI.CShfeFtdcSeqRiskNotifyBField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return ctpJNI.CShfeFtdcSeqRiskNotifyBField_InvestorID_get(swigCPtr, this);
  }

  public void setNotifyClass(char value) {
    ctpJNI.CShfeFtdcSeqRiskNotifyBField_NotifyClass_set(swigCPtr, this, value);
  }

  public char getNotifyClass() {
    return ctpJNI.CShfeFtdcSeqRiskNotifyBField_NotifyClass_get(swigCPtr, this);
  }

  public void setNotifyMethod(char value) {
    ctpJNI.CShfeFtdcSeqRiskNotifyBField_NotifyMethod_set(swigCPtr, this, value);
  }

  public char getNotifyMethod() {
    return ctpJNI.CShfeFtdcSeqRiskNotifyBField_NotifyMethod_get(swigCPtr, this);
  }

  public void setNotifyStatus(char value) {
    ctpJNI.CShfeFtdcSeqRiskNotifyBField_NotifyStatus_set(swigCPtr, this, value);
  }

  public char getNotifyStatus() {
    return ctpJNI.CShfeFtdcSeqRiskNotifyBField_NotifyStatus_get(swigCPtr, this);
  }

  public void setMessage(String value) {
    ctpJNI.CShfeFtdcSeqRiskNotifyBField_Message_set(swigCPtr, this, value);
  }

  public String getMessage() {
    return ctpJNI.CShfeFtdcSeqRiskNotifyBField_Message_get(swigCPtr, this);
  }

  public void setReserve(String value) {
    ctpJNI.CShfeFtdcSeqRiskNotifyBField_Reserve_set(swigCPtr, this, value);
  }

  public String getReserve() {
    return ctpJNI.CShfeFtdcSeqRiskNotifyBField_Reserve_get(swigCPtr, this);
  }

  public CShfeFtdcSeqRiskNotifyBField() {
    this(ctpJNI.new_CShfeFtdcSeqRiskNotifyBField(), true);
  }

}
