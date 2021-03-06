/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.api;

public class CShfeFtdcDiscountField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public CShfeFtdcDiscountField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(CShfeFtdcDiscountField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpJNI.delete_CShfeFtdcDiscountField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    ctpJNI.CShfeFtdcDiscountField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ctpJNI.CShfeFtdcDiscountField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorRange(char value) {
    ctpJNI.CShfeFtdcDiscountField_InvestorRange_set(swigCPtr, this, value);
  }

  public char getInvestorRange() {
    return ctpJNI.CShfeFtdcDiscountField_InvestorRange_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    ctpJNI.CShfeFtdcDiscountField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return ctpJNI.CShfeFtdcDiscountField_InvestorID_get(swigCPtr, this);
  }

  public void setDiscount(double value) {
    ctpJNI.CShfeFtdcDiscountField_Discount_set(swigCPtr, this, value);
  }

  public double getDiscount() {
    return ctpJNI.CShfeFtdcDiscountField_Discount_get(swigCPtr, this);
  }

  public CShfeFtdcDiscountField() {
    this(ctpJNI.new_CShfeFtdcDiscountField(), true);
  }

}
