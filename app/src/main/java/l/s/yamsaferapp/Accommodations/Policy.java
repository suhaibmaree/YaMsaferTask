
package l.s.yamsaferapp.Accommodations;

import java.util.HashMap;
import java.util.Map;

public class Policy {

    private String from;
    private String to;
    private Integer amount;
    private Boolean isNoshow;
    private Boolean nonRefundable;
    private String type;
    private String time;
    private Integer hours;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Boolean getIsNoshow() {
        return isNoshow;
    }

    public void setIsNoshow(Boolean isNoshow) {
        this.isNoshow = isNoshow;
    }

    public Boolean getNonRefundable() {
        return nonRefundable;
    }

    public void setNonRefundable(Boolean nonRefundable) {
        this.nonRefundable = nonRefundable;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
