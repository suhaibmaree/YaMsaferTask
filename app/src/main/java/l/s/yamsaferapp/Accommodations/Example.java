
package l.s.yamsaferapp.Accommodations;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Example {

    private List<Accommodation> accommodations = null;
    private List<Bundle> bundles = null;
    private List<Object> conditionalAmenities = null;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public List<Accommodation> getAccommodations() {
        return accommodations;
    }

    public void setAccommodations(List<Accommodation> accommodations) {
        this.accommodations = accommodations;
    }

    public List<Bundle> getBundles() {
        return bundles;
    }

    public void setBundles(List<Bundle> bundles) {
        this.bundles = bundles;
    }

    public List<Object> getConditionalAmenities() {
        return conditionalAmenities;
    }

    public void setConditionalAmenities(List<Object> conditionalAmenities) {
        this.conditionalAmenities = conditionalAmenities;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
