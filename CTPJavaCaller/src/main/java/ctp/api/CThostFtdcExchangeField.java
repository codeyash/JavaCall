/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.api;

public class CThostFtdcExchangeField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public CThostFtdcExchangeField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(CThostFtdcExchangeField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpJNI.delete_CThostFtdcExchangeField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setExchangeID(String value) {
    ctpJNI.CThostFtdcExchangeField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return ctpJNI.CThostFtdcExchangeField_ExchangeID_get(swigCPtr, this);
  }

  public void setExchangeName(String value) {
    ctpJNI.CThostFtdcExchangeField_ExchangeName_set(swigCPtr, this, value);
  }

  public String getExchangeName() {
    return ctpJNI.CThostFtdcExchangeField_ExchangeName_get(swigCPtr, this);
  }

  public void setExchangeProperty(char value) {
    ctpJNI.CThostFtdcExchangeField_ExchangeProperty_set(swigCPtr, this, value);
  }

  public char getExchangeProperty() {
    return ctpJNI.CThostFtdcExchangeField_ExchangeProperty_get(swigCPtr, this);
  }

  public CThostFtdcExchangeField() {
    this(ctpJNI.new_CThostFtdcExchangeField(), true);
  }

}
