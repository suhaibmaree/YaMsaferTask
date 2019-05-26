
package l.s.yamsaferapp.Accommodations;

import java.util.HashMap;
import java.util.Map;

public class NightlyRate {

    private Double nightRate;
    private Double nightPromotionRate;
    private Double nightRateBeforeTax;
    private Integer nightDate;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Double getNightRate() {
        return nightRate;
    }

    public void setNightRate(Double nightRate) {
        this.nightRate = nightRate;
    }

    public Double getNightPromotionRate() {
        return nightPromotionRate;
    }

    public void setNightPromotionRate(Double nightPromotionRate) {
        this.nightPromotionRate = nightPromotionRate;
    }

    public Double getNightRateBeforeTax() {
        return nightRateBeforeTax;
    }

    public void setNightRateBeforeTax(Double nightRateBeforeTax) {
        this.nightRateBeforeTax = nightRateBeforeTax;
    }

    public Integer getNightDate() {
        return nightDate;
    }

    public void setNightDate(Integer nightDate) {
        this.nightDate = nightDate;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
