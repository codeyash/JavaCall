/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.api;

public class CShfeFtdcQryFrontStatusField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public CShfeFtdcQryFrontStatusField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(CShfeFtdcQryFrontStatusField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpJNI.delete_CShfeFtdcQryFrontStatusField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setFrontID(int value) {
    ctpJNI.CShfeFtdcQryFrontStatusField_FrontID_set(swigCPtr, this, value);
  }

  public int getFrontID() {
    return ctpJNI.CShfeFtdcQryFrontStatusField_FrontID_get(swigCPtr, this);
  }

  public CShfeFtdcQryFrontStatusField() {
    this(ctpJNI.new_CShfeFtdcQryFrontStatusField(), true);
  }

}