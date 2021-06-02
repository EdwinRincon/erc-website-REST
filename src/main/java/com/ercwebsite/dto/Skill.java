package com.ercwebsite.dto;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.util.Assert;

@Document(collection = "skills")
public class Skill {

    @Id
    private String _id;

    private String name, description, image, website;

    public Skill() {
    }

    public Skill(String _id, String name, String description, String image, String website) {
        this._id = _id;
        this.name = name;
        this.description = description;
        this.image = image;
        this.website = website;
    }

    public Skill(String name, String description, String image, String website) {

        Assert.hasText(name, "Street must not be null or empty");
        Assert.hasText(description, "Description must not be null or empty");
        Assert.hasText(image, "Image must not be null or empty");
        Assert.hasText(website, "Website must not be null or empty");

        this.name = name;
        this.description = description;
        this.image = image;
        this.website = website;
    }

    public String get_id() {
        return _id;
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    @Override
    public String toString() {
        return "Skill{" +
                "_id='" + _id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", image='" + image + '\'' +
                ", website='" + website + '\'' +
                '}';
    }
}
