package com.art.entity;

import java.io.Serializable;

/**
 * Created by user on 16.02.2017.
 */
public class AutoEntity implements Serializable {

    private int autoId;
    private String autoTitle;
    private String description;
    private String imageLink;
    private int userId;

    public AutoEntity() {
    }

    public AutoEntity(int autoId, String autoTitle, String description, String imageLink, int userId) {
        this.autoId = autoId;
        this.autoTitle = autoTitle;
        this.description = description;
        this.imageLink = imageLink;
        this.userId = userId;
    }

    public String getImageLink() {
        return imageLink;
    }

    public void setImageLink(String imageLink) {
        this.imageLink = imageLink;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getAutoId() {
        return autoId;
    }

    public void setAutoId(int autoId) {
        this.autoId = autoId;
    }

    public String getAutoTitle() {
        return autoTitle;
    }

    public void setAutoTitle(String autoTitle) {
        this.autoTitle = autoTitle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AutoEntity that = (AutoEntity) o;

        if (autoId != that.autoId) return false;
        if (!autoTitle.equals(that.autoTitle)) return false;
        return description != null ? description.equals(that.description) : that.description == null;

    }

    public int hashCode() {
        int result = autoId;
        result = 31 * result + autoTitle.hashCode();
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }


    public String toString() {
        return "AutoEntity{" +
                "autoId=" + autoId +
                ", autoTitle='" + autoTitle + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
