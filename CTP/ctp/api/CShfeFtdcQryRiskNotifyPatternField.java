/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.api;

public class CShfeFtdcQryRiskNotifyPatternField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public CShfeFtdcQryRiskNotifyPatternField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(CShfeFtdcQryRiskNotifyPatternField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpJNI.delete_CShfeFtdcQryRiskNotifyPatternField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    ctpJNI.CShfeFtdcQryRiskNotifyPatternField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ctpJNI.CShfeFtdcQryRiskNotifyPatternField_BrokerID_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    ctpJNI.CShfeFtdcQryRiskNotifyPatternField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return ctpJNI.CShfeFtdcQryRiskNotifyPatternField_UserID_get(swigCPtr, this);
  }

  public void setReserve(String value) {
    ctpJNI.CShfeFtdcQryRiskNotifyPatternField_Reserve_set(swigCPtr, this, value);
  }

  public String getReserve() {
    return ctpJNI.CShfeFtdcQryRiskNotifyPatternField_Reserve_get(swigCPtr, this);
  }

  public CShfeFtdcQryRiskNotifyPatternField() {
    this(ctpJNI.new_CShfeFtdcQryRiskNotifyPatternField(), true);
  }

}