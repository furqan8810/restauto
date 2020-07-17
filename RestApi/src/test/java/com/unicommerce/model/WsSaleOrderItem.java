package com.unicommerce.model;

import java.math.BigDecimal;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class WsSaleOrderItem {



	    private String                   itemSku;

	    private String                   itemName;

	    private String                   channelProductId;

	    private String                   channelSaleOrderItemCode;


	    private String                   shippingMethodCode;


	    private String                   code;

	    private boolean                  giftWrap;

	    private String                   giftMessage;


	    private BigDecimal               totalPrice;


	    private BigDecimal               sellingPrice;


	    private BigDecimal               prepaidAmount         = BigDecimal.ZERO;


	    private BigDecimal               discount              = BigDecimal.ZERO;


	    private BigDecimal               shippingCharges       = BigDecimal.ZERO;


	    private BigDecimal               shippingMethodCharges = BigDecimal.ZERO;


	    private BigDecimal               cashOnDeliveryCharges = BigDecimal.ZERO;


	    private BigDecimal               giftWrapCharges       = BigDecimal.ZERO;


	    private String                   voucherCode;


	    private BigDecimal               voucherValue          = BigDecimal.ZERO;


	    private BigDecimal               storeCredit           = BigDecimal.ZERO;


	    private BigDecimal               channelTransferPrice  = BigDecimal.ZERO;

	    private BigDecimal               transferPrice         = BigDecimal.ZERO;

	    private int                      packetNumber;
	    private boolean                  onHold;
	    private String                   facilityCode;


	    private String                   combinationIdentifier;

	    private Boolean                  requiresCustomization;


	    private WsAddressRef             shippingAddress;


	    //private List<WsCustomFieldValue> customFieldValues;

	    private List<String>             itemDetailFields;

	    public WsSaleOrderItem() {
	        super();
	    }

	    public String getItemSku() {
	        return itemSku;
	    }

	    public void setItemSku(String itemSku) {
	        this.itemSku = itemSku;
	    }

	    public String getItemName() {
	        return itemName;
	    }

	    public void setItemName(String itemName) {
	        this.itemName = itemName;
	    }

	    public String getChannelProductId() {
	        return channelProductId;
	    }

	    public void setChannelProductId(String channelProductId) {
	        this.channelProductId = channelProductId;
	    }

	    public String getChannelSaleOrderItemCode() {
	        return channelSaleOrderItemCode;
	    }

	    public void setChannelSaleOrderItemCode(String channelSaleOrderItemCode) {
	        this.channelSaleOrderItemCode = channelSaleOrderItemCode;
	    }

	    public String getShippingMethodCode() {
	        return shippingMethodCode;
	    }

	    public void setShippingMethodCode(String shippingMethodCode) {
	        this.shippingMethodCode = shippingMethodCode;
	    }

	    public String getCode() {
	        return code;
	    }

	    public void setCode(String code) {
	        this.code = code;
	    }

	    public boolean isGiftWrap() {
	        return giftWrap;
	    }

	    public void setGiftWrap(boolean giftWrap) {
	        this.giftWrap = giftWrap;
	    }

	    public String getGiftMessage() {
	        return giftMessage;
	    }

	    public void setGiftMessage(String giftMessage) {
	        this.giftMessage = giftMessage;
	    }

	    public BigDecimal getTotalPrice() {
	        return totalPrice;
	    }

	    public void setTotalPrice(BigDecimal totalPrice) {
	        this.totalPrice = totalPrice;
	    }

	    public BigDecimal getSellingPrice() {
	        return sellingPrice;
	    }

	    public void setSellingPrice(BigDecimal sellingPrice) {
	        this.sellingPrice = sellingPrice;
	    }

	    public BigDecimal getPrepaidAmount() {
	        return prepaidAmount;
	    }

	    public void setPrepaidAmount(BigDecimal prepaidAmount) {
	        this.prepaidAmount = prepaidAmount;
	    }

	    public BigDecimal getDiscount() {
	        return discount;
	    }

	    public void setDiscount(BigDecimal discount) {
	        this.discount = discount;
	    }

	    public BigDecimal getShippingCharges() {
	        return shippingCharges;
	    }

	    public void setShippingCharges(BigDecimal shippingCharges) {
	        this.shippingCharges = shippingCharges;
	    }

	    public BigDecimal getShippingMethodCharges() {
	        return shippingMethodCharges;
	    }

	    public void setShippingMethodCharges(BigDecimal shippingMethodCharges) {
	        this.shippingMethodCharges = shippingMethodCharges;
	    }

	    public BigDecimal getCashOnDeliveryCharges() {
	        return cashOnDeliveryCharges;
	    }

	    public void setCashOnDeliveryCharges(BigDecimal cashOnDeliveryCharges) {
	        this.cashOnDeliveryCharges = cashOnDeliveryCharges;
	    }

	    public BigDecimal getGiftWrapCharges() {
	        return giftWrapCharges;
	    }

	    public void setGiftWrapCharges(BigDecimal giftWrapCharges) {
	        this.giftWrapCharges = giftWrapCharges;
	    }

	    public String getVoucherCode() {
	        return voucherCode;
	    }

	    public void setVoucherCode(String voucherCode) {
	        this.voucherCode = voucherCode;
	    }

	    public BigDecimal getVoucherValue() {
	        return voucherValue;
	    }

	    public void setVoucherValue(BigDecimal voucherValue) {
	        this.voucherValue = voucherValue;
	    }

	    public BigDecimal getStoreCredit() {
	        return storeCredit;
	    }

	    public void setStoreCredit(BigDecimal storeCredit) {
	        this.storeCredit = storeCredit;
	    }

	    public BigDecimal getChannelTransferPrice() {
	        return channelTransferPrice;
	    }

	    public void setChannelTransferPrice(BigDecimal channelTransferPrice) {
	        this.channelTransferPrice = channelTransferPrice;
	    }

	    public BigDecimal getTransferPrice() {
	        return transferPrice;
	    }

	    public void setTransferPrice(BigDecimal transferPrice) {
	        this.transferPrice = transferPrice;
	    }

	    public int getPacketNumber() {
	        return packetNumber;
	    }

	    public void setPacketNumber(int packetNumber) {
	        this.packetNumber = packetNumber;
	    }

	    public boolean isOnHold() {
	        return onHold;
	    }

	    public void setOnHold(boolean onHold) {
	        this.onHold = onHold;
	    }

	    public String getFacilityCode() {
	        return facilityCode;
	    }

	    public void setFacilityCode(String facilityCode) {
	        this.facilityCode = facilityCode;
	    }

	    public String getCombinationIdentifier() {
	        return combinationIdentifier;
	    }

	    public void setCombinationIdentifier(String combinationIdentifier) {
	        this.combinationIdentifier = combinationIdentifier;
	    }

	    public Boolean getRequiresCustomization() {
	        return requiresCustomization;
	    }

	    public void setRequiresCustomization(Boolean requiresCustomization) {
	        this.requiresCustomization = requiresCustomization;
	    }

	    public WsAddressRef getShippingAddress() {
	        return shippingAddress;
	    }

	    public void setShippingAddress(WsAddressRef shippingAddress) {
	        this.shippingAddress = shippingAddress;
	    }
	    @Override
	    public String toString() {
	    	// TODO Auto-generated method stub
	    	return "{" +
	    			"itemName:'" + this.itemName + "'," +
	    			"itemSku:'" + this.itemSku + "',"+
	    			"shippingMethodCode:'" + this.shippingMethodCode + "',"+
	    			"sellingPrice:'" + this.sellingPrice + "',"+
	    			"shippingCharges:'" + this.shippingCharges + "',"+
	    			"totalPrice:'" + this.totalPrice + "',"+
	    			"shippingMethodCharges:'" + this.shippingMethodCharges + "',"+
	    			"shippingAddress:'" + this.shippingAddress + "',"+
	    			"facilityCode:'" + this.facilityCode + "',"+
	    			"code:'" + this.code + "',"+
	    			"packetNumber:'" + this.packetNumber + "'";
	    }



}
