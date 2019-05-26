
package l.s.yamsaferapp.Accommodations;

import java.util.HashMap;
import java.util.Map;

public class Tax {

    private String code;
    private String type;
    private String name;
    private String amountType;
    private Double amount;
    private Integer percentAmount;
    private Boolean isIncluded;
    private Object dependsOn;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAmountType() {
        return amountType;
    }

    public void setAmountType(String amountType) {
        this.amountType = amountType;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Integer getPercentAmount() {
        return percentAmount;
    }

    public void setPercentAmount(Integer percentAmount) {
        this.percentAmount = percentAmount;
    }

    public Boolean getIsIncluded() {
        return isIncluded;
    }

    public void setIsIncluded(Boolean isIncluded) {
        this.isIncluded = isIncluded;
    }

    public Object getDependsOn() {
        return dependsOn;
    }

    public void setDependsOn(Object dependsOn) {
        this.dependsOn = dependsOn;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
