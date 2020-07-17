package com.unicommerce.model;



public class WsAddressRef {
    
    private String referenceId;

    /**
     * 
     */
    public WsAddressRef() {
    }

    public WsAddressRef(String referenceId) {
        this.referenceId = referenceId;
    }

    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }

    public String getReferenceId() {
        return referenceId;
    }
    @Override
    public String toString() {
    	// TODO Auto-generated method stub
    	return "referenceId:'" + this.referenceId + "'";
    			}
}
