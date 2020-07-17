package com.unicommerce.model;



public class WsShippingProvider {
    
    private Integer packetNumber;

   
    private String  code;

    
    private String  trackingNumber;

    /**
     * @return the packetNumber
     */
    public Integer getPacketNumber() {
        return packetNumber;
    }

    /**
     * @param packetNumber the packetNumber to set
     */
    public void setPacketNumber(Integer packetNumber) {
        this.packetNumber = packetNumber;
    }

    /**
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return the trackingNumber
     */
    public String getTrackingNumber() {
        return trackingNumber;
    }

    /**
     * @param trackingNumber the trackingNumber to set
     */
    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }
}
