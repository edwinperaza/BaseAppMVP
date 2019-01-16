package cl.moriahdp.BaseApplicationMVP.home.modelObject;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;


public class HomeModelObject implements Serializable {


    @SerializedName("title")
    @Expose
    private String title;

    @SerializedName("description")
    @Expose
    private String description;


    @SerializedName("video_url")
    @Expose
    private String videoUrl;

    @SerializedName("image_url")
    @Expose
    private String imageUrl;

    @SerializedName("date")
    @Expose
    private String date;

    public HomeModelObject() {

    }

    public HomeModelObject(String title, String description, String videoUrl,
                           String imageUrl, String date) {
        this.title = title;
        this.description = description;
        this.videoUrl = videoUrl;
        this.imageUrl = imageUrl;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getDate() {
        return date;
    }
}
