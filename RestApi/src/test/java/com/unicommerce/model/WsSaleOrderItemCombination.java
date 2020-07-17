package com.unicommerce.model;



public class WsSaleOrderItemCombination {
	   public WsSaleOrderItemCombination() {
	    }

	    public WsSaleOrderItemCombination(String combinationIdentifier, String combinationDescription) {
	        this.combinationIdentifier = combinationIdentifier;
	        this.combinationDescription = combinationDescription;
	    }

	    
	    private String combinationIdentifier;

	    
	    private String combinationDescription;

	    /**
	     * @return the combinationIdentifier
	     */
	    public String getCombinationIdentifier() {
	        return combinationIdentifier;
	    }

	    /**
	     * @param combinationIdentifier the combinationIdentifier to set
	     */
	    public void setCombinationIdentifier(String combinationIdentifier) {
	        this.combinationIdentifier = combinationIdentifier;
	    }

	    /**
	     * @return the combinationDescription
	     */
	    public String getCombinationDescription() {
	        return combinationDescription;
	    }

	    /**
	     * @param combinationDescription the combinationDescription to set
	     */
	    public void setCombinationDescription(String combinationDescription) {
	        this.combinationDescription = combinationDescription;
	    }

}
