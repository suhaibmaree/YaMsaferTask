
package l.s.yamsaferapp.Accommodations;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Bundle {

    private String id;
    private List<String> values = null;
    private String paymentType;
    private Integer score;
    private Double totalDealPrice;
    private Integer taxesType;
    private String capacity;
    private String dealType;
    private String dealName;
    private Boolean isWalletDiscountApplied;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<String> getValues() {
        return values;
    }

    public void setValues(List<String> values) {
        this.values = values;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Double getTotalDealPrice() {
        return totalDealPrice;
    }

    public void setTotalDealPrice(Double totalDealPrice) {
        this.totalDealPrice = totalDealPrice;
    }

    public Integer getTaxesType() {
        return taxesType;
    }

    public void setTaxesType(Integer taxesType) {
        this.taxesType = taxesType;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public String getDealType() {
        return dealType;
    }

    public void setDealType(String dealType) {
        this.dealType = dealType;
    }

    public String getDealName() {
        return dealName;
    }

    public void setDealName(String dealName) {
        this.dealName = dealName;
    }

    public Boolean getIsWalletDiscountApplied() {
        return isWalletDiscountApplied;
    }

    public void setIsWalletDiscountApplied(Boolean isWalletDiscountApplied) {
        this.isWalletDiscountApplied = isWalletDiscountApplied;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
