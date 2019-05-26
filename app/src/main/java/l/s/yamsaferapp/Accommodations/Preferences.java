
package l.s.yamsaferapp.Accommodations;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Preferences {

    private List<Object> beds = null;
    private List<Object> smoking = null;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public List<Object> getBeds() {
        return beds;
    }

    public void setBeds(List<Object> beds) {
        this.beds = beds;
    }

    public List<Object> getSmoking() {
        return smoking;
    }

    public void setSmoking(List<Object> smoking) {
        this.smoking = smoking;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
