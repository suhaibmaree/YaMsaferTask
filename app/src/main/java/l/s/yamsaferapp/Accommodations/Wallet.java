
package l.s.yamsaferapp.Accommodations;

import java.util.HashMap;
import java.util.Map;

public class Wallet {

    private Boolean canUseWallet;
    private Double earnings;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Boolean getCanUseWallet() {
        return canUseWallet;
    }

    public void setCanUseWallet(Boolean canUseWallet) {
        this.canUseWallet = canUseWallet;
    }

    public Double getEarnings() {
        return earnings;
    }

    public void setEarnings(Double earnings) {
        this.earnings = earnings;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
