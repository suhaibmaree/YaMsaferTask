
package l.s.yamsaferapp.Accommodations;

import java.util.HashMap;
import java.util.Map;

public class SupplierAttributes {

    private String adults;
    private String children;
    private Integer extraBeds;
    private String paymentMode;
    private String childrenAges;
    private String allocationDetails;
    private String leadingPassengersCount;
    private String key;
    private String bedType;
    private Integer chargeableRate;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getAdults() {
        return adults;
    }

    public void setAdults(String adults) {
        this.adults = adults;
    }

    public String getChildren() {
        return children;
    }

    public void setChildren(String children) {
        this.children = children;
    }

    public Integer getExtraBeds() {
        return extraBeds;
    }

    public void setExtraBeds(Integer extraBeds) {
        this.extraBeds = extraBeds;
    }

    public String getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }

    public String getChildrenAges() {
        return childrenAges;
    }

    public void setChildrenAges(String childrenAges) {
        this.childrenAges = childrenAges;
    }

    public String getAllocationDetails() {
        return allocationDetails;
    }

    public void setAllocationDetails(String allocationDetails) {
        this.allocationDetails = allocationDetails;
    }

    public String getLeadingPassengersCount() {
        return leadingPassengersCount;
    }

    public void setLeadingPassengersCount(String leadingPassengersCount) {
        this.leadingPassengersCount = leadingPassengersCount;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getBedType() {
        return bedType;
    }

    public void setBedType(String bedType) {
        this.bedType = bedType;
    }

    public Integer getChargeableRate() {
        return chargeableRate;
    }

    public void setChargeableRate(Integer chargeableRate) {
        this.chargeableRate = chargeableRate;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
