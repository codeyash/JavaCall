/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.api;

public class CThostFtdcMarketDataAveragePriceField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public CThostFtdcMarketDataAveragePriceField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(CThostFtdcMarketDataAveragePriceField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpJNI.delete_CThostFtdcMarketDataAveragePriceField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setAveragePrice(double value) {
    ctpJNI.CThostFtdcMarketDataAveragePriceField_AveragePrice_set(swigCPtr, this, value);
  }

  public double getAveragePrice() {
    return ctpJNI.CThostFtdcMarketDataAveragePriceField_AveragePrice_get(swigCPtr, this);
  }

  public CThostFtdcMarketDataAveragePriceField() {
    this(ctpJNI.new_CThostFtdcMarketDataAveragePriceField(), true);
  }

}