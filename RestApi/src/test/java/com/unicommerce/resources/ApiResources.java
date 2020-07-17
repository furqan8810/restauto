package com.unicommerce.resources;

public enum  ApiResources {

   getSaleOrderApi("/services/rest/v1/oms/saleorder/get"),
    createSaleOrderApi("/services/rest/v1/oms/saleOrder/create"),
    getItemTypeDetailApi("/services/rest/v1/product/itemType/searchBySku");
    private String resource;
   ApiResources(String resource)
   {
this.resource=resource;
   }
public String getResource()
{
    return resource;
}
}
