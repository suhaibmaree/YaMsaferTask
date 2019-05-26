
package l.s.yamsaferapp.Accommodations;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Accommodation implements Parcelable {

    private Integer id;
    private String name;
    private String description;
    private String coverImage;
    private List<String> images = null;
    private Integer allotment;
    private List<Rate> rates = null;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCoverImage() {
        return coverImage;
    }

    public void setCoverImage(String coverImage) {
        this.coverImage = coverImage;
    }

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }

    public Integer getAllotment() {
        return allotment;
    }

    public void setAllotment(Integer allotment) {
        this.allotment = allotment;
    }

    public List<Rate> getRates() {
        return rates;
    }

    public void setRates(List<Rate> rates) {
        this.rates = rates;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {

    }
}
