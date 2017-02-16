package com.art.entity;

import java.io.Serializable;

/**
 * Created by user on 16.02.2017.
 */
public class AutoEntity implements Serializable {

    private int autoID;
    private String autoTitle;
    private String description;

    public AutoEntity() {
    }

    public AutoEntity(int autoID, String autoTitle, String description) {
        this.autoID = autoID;
        this.autoTitle = autoTitle;
        this.description = description;
    }

    public int getAutoID() {
        return autoID;
    }

    public void setAutoID(int autoID) {
        this.autoID = autoID;
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

        if (autoID != that.autoID) return false;
        if (!autoTitle.equals(that.autoTitle)) return false;
        return description != null ? description.equals(that.description) : that.description == null;

    }

    public int hashCode() {
        int result = autoID;
        result = 31 * result + autoTitle.hashCode();
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }


    public String toString() {
        return "AutoEntity{" +
                "autoID=" + autoID +
                ", autoTitle='" + autoTitle + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
