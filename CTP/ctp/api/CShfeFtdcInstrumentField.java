/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.api;

public class CShfeFtdcInstrumentField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public CShfeFtdcInstrumentField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(CShfeFtdcInstrumentField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpJNI.delete_CShfeFtdcInstrumentField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setInstrumentID(String value) {
    ctpJNI.CShfeFtdcInstrumentField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return ctpJNI.CShfeFtdcInstrumentField_InstrumentID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    ctpJNI.CShfeFtdcInstrumentField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return ctpJNI.CShfeFtdcInstrumentField_ExchangeID_get(swigCPtr, this);
  }

  public void setInstrumentName(String value) {
    ctpJNI.CShfeFtdcInstrumentField_InstrumentName_set(swigCPtr, this, value);
  }

  public String getInstrumentName() {
    return ctpJNI.CShfeFtdcInstrumentField_InstrumentName_get(swigCPtr, this);
  }

  public void setExchangeInstID(String value) {
    ctpJNI.CShfeFtdcInstrumentField_ExchangeInstID_set(swigCPtr, this, value);
  }

  public String getExchangeInstID() {
    return ctpJNI.CShfeFtdcInstrumentField_ExchangeInstID_get(swigCPtr, this);
  }

  public void setProductID(String value) {
    ctpJNI.CShfeFtdcInstrumentField_ProductID_set(swigCPtr, this, value);
  }

  public String getProductID() {
    return ctpJNI.CShfeFtdcInstrumentField_ProductID_get(swigCPtr, this);
  }

  public void setProductClass(char value) {
    ctpJNI.CShfeFtdcInstrumentField_ProductClass_set(swigCPtr, this, value);
  }

  public char getProductClass() {
    return ctpJNI.CShfeFtdcInstrumentField_ProductClass_get(swigCPtr, this);
  }

  public void setDeliveryYear(int value) {
    ctpJNI.CShfeFtdcInstrumentField_DeliveryYear_set(swigCPtr, this, value);
  }

  public int getDeliveryYear() {
    return ctpJNI.CShfeFtdcInstrumentField_DeliveryYear_get(swigCPtr, this);
  }

  public void setDeliveryMonth(int value) {
    ctpJNI.CShfeFtdcInstrumentField_DeliveryMonth_set(swigCPtr, this, value);
  }

  public int getDeliveryMonth() {
    return ctpJNI.CShfeFtdcInstrumentField_DeliveryMonth_get(swigCPtr, this);
  }

  public void setMaxMarketOrderVolume(int value) {
    ctpJNI.CShfeFtdcInstrumentField_MaxMarketOrderVolume_set(swigCPtr, this, value);
  }

  public int getMaxMarketOrderVolume() {
    return ctpJNI.CShfeFtdcInstrumentField_MaxMarketOrderVolume_get(swigCPtr, this);
  }

  public void setMinMarketOrderVolume(int value) {
    ctpJNI.CShfeFtdcInstrumentField_MinMarketOrderVolume_set(swigCPtr, this, value);
  }

  public int getMinMarketOrderVolume() {
    return ctpJNI.CShfeFtdcInstrumentField_MinMarketOrderVolume_get(swigCPtr, this);
  }

  public void setMaxLimitOrderVolume(int value) {
    ctpJNI.CShfeFtdcInstrumentField_MaxLimitOrderVolume_set(swigCPtr, this, value);
  }

  public int getMaxLimitOrderVolume() {
    return ctpJNI.CShfeFtdcInstrumentField_MaxLimitOrderVolume_get(swigCPtr, this);
  }

  public void setMinLimitOrderVolume(int value) {
    ctpJNI.CShfeFtdcInstrumentField_MinLimitOrderVolume_set(swigCPtr, this, value);
  }

  public int getMinLimitOrderVolume() {
    return ctpJNI.CShfeFtdcInstrumentField_MinLimitOrderVolume_get(swigCPtr, this);
  }

  public void setVolumeMultiple(int value) {
    ctpJNI.CShfeFtdcInstrumentField_VolumeMultiple_set(swigCPtr, this, value);
  }

  public int getVolumeMultiple() {
    return ctpJNI.CShfeFtdcInstrumentField_VolumeMultiple_get(swigCPtr, this);
  }

  public void setPriceTick(double value) {
    ctpJNI.CShfeFtdcInstrumentField_PriceTick_set(swigCPtr, this, value);
  }

  public double getPriceTick() {
    return ctpJNI.CShfeFtdcInstrumentField_PriceTick_get(swigCPtr, this);
  }

  public void setCreateDate(String value) {
    ctpJNI.CShfeFtdcInstrumentField_CreateDate_set(swigCPtr, this, value);
  }

  public String getCreateDate() {
    return ctpJNI.CShfeFtdcInstrumentField_CreateDate_get(swigCPtr, this);
  }

  public void setOpenDate(String value) {
    ctpJNI.CShfeFtdcInstrumentField_OpenDate_set(swigCPtr, this, value);
  }

  public String getOpenDate() {
    return ctpJNI.CShfeFtdcInstrumentField_OpenDate_get(swigCPtr, this);
  }

  public void setExpireDate(String value) {
    ctpJNI.CShfeFtdcInstrumentField_ExpireDate_set(swigCPtr, this, value);
  }

  public String getExpireDate() {
    return ctpJNI.CShfeFtdcInstrumentField_ExpireDate_get(swigCPtr, this);
  }

  public void setStartDelivDate(String value) {
    ctpJNI.CShfeFtdcInstrumentField_StartDelivDate_set(swigCPtr, this, value);
  }

  public String getStartDelivDate() {
    return ctpJNI.CShfeFtdcInstrumentField_StartDelivDate_get(swigCPtr, this);
  }

  public void setEndDelivDate(String value) {
    ctpJNI.CShfeFtdcInstrumentField_EndDelivDate_set(swigCPtr, this, value);
  }

  public String getEndDelivDate() {
    return ctpJNI.CShfeFtdcInstrumentField_EndDelivDate_get(swigCPtr, this);
  }

  public void setInstLifePhase(char value) {
    ctpJNI.CShfeFtdcInstrumentField_InstLifePhase_set(swigCPtr, this, value);
  }

  public char getInstLifePhase() {
    return ctpJNI.CShfeFtdcInstrumentField_InstLifePhase_get(swigCPtr, this);
  }

  public void setIsTrading(int value) {
    ctpJNI.CShfeFtdcInstrumentField_IsTrading_set(swigCPtr, this, value);
  }

  public int getIsTrading() {
    return ctpJNI.CShfeFtdcInstrumentField_IsTrading_get(swigCPtr, this);
  }

  public void setPositionType(char value) {
    ctpJNI.CShfeFtdcInstrumentField_PositionType_set(swigCPtr, this, value);
  }

  public char getPositionType() {
    return ctpJNI.CShfeFtdcInstrumentField_PositionType_get(swigCPtr, this);
  }

  public void setPositionDateType(char value) {
    ctpJNI.CShfeFtdcInstrumentField_PositionDateType_set(swigCPtr, this, value);
  }

  public char getPositionDateType() {
    return ctpJNI.CShfeFtdcInstrumentField_PositionDateType_get(swigCPtr, this);
  }

  public void setLongMarginRatio(double value) {
    ctpJNI.CShfeFtdcInstrumentField_LongMarginRatio_set(swigCPtr, this, value);
  }

  public double getLongMarginRatio() {
    return ctpJNI.CShfeFtdcInstrumentField_LongMarginRatio_get(swigCPtr, this);
  }

  public void setShortMarginRatio(double value) {
    ctpJNI.CShfeFtdcInstrumentField_ShortMarginRatio_set(swigCPtr, this, value);
  }

  public double getShortMarginRatio() {
    return ctpJNI.CShfeFtdcInstrumentField_ShortMarginRatio_get(swigCPtr, this);
  }

  public CShfeFtdcInstrumentField() {
    this(ctpJNI.new_CShfeFtdcInstrumentField(), true);
  }

}