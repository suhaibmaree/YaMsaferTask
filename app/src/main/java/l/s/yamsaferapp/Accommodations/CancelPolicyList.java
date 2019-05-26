
package l.s.yamsaferapp.Accommodations;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CancelPolicyList {

    private Integer supplier;
    private Boolean hasPenaltyStartdate;
    private Integer penaltyStartdate;
    private List<Policy> policies = null;
    private Boolean depositRequired;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Integer getSupplier() {
        return supplier;
    }

    public void setSupplier(Integer supplier) {
        this.supplier = supplier;
    }

    public Boolean getHasPenaltyStartdate() {
        return hasPenaltyStartdate;
    }

    public void setHasPenaltyStartdate(Boolean hasPenaltyStartdate) {
        this.hasPenaltyStartdate = hasPenaltyStartdate;
    }

    public Integer getPenaltyStartdate() {
        return penaltyStartdate;
    }

    public void setPenaltyStartdate(Integer penaltyStartdate) {
        this.penaltyStartdate = penaltyStartdate;
    }

    public List<Policy> getPolicies() {
        return policies;
    }

    public void setPolicies(List<Policy> policies) {
        this.policies = policies;
    }

    public Boolean getDepositRequired() {
        return depositRequired;
    }

    public void setDepositRequired(Boolean depositRequired) {
        this.depositRequired = depositRequired;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
