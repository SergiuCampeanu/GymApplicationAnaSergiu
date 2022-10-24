package com.example.gymapplicationanasergiu;

public class GymTraining {
    private int id;
    private String name;
    private String shortDesc;
    private String longDesk;
    private String imageURL;

    public GymTraining(int id, String name, String shortDesc, String longDesk, String imageURL) {
        this.id = id;
        this.name = name;
        this.shortDesc = shortDesc;
        this.longDesk = longDesk;
        this.imageURL = imageURL;
    }

    public GymTraining() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortDesc() {
        return shortDesc;
    }

    public void setShortDesc(String shortDesc) {
        this.shortDesc = shortDesc;
    }

    public String getLongDesk() {
        return longDesk;
    }

    public void setLongDesk(String longDesk) {
        this.longDesk = longDesk;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    @Override
    public String toString() {
        return "GymTraining{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", shortDesc='" + shortDesc + '\'' +
                ", longDesk='" + longDesk + '\'' +
                ", imageURL='" + imageURL + '\'' +
                '}';
    }
}

