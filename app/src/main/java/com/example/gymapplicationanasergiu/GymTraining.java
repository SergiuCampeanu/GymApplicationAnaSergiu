package com.example.gymapplicationanasergiu;

import android.os.Parcel;
import android.os.Parcelable;

public class GymTraining implements Parcelable {
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

    protected GymTraining(Parcel in) {
        id = in.readInt();
        name = in.readString();
        shortDesc = in.readString();
        longDesk = in.readString();
        imageURL = in.readString();
    }

    public static final Creator<GymTraining> CREATOR = new Creator<GymTraining>() {
        @Override
        public GymTraining createFromParcel(Parcel in) {
            return new GymTraining(in);
        }

        @Override
        public GymTraining[] newArray(int size) {
            return new GymTraining[size];
        }
    };

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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(id);
        parcel.writeString(name);
        parcel.writeString(shortDesc);
        parcel.writeString(longDesk);
        parcel.writeString(imageURL);
    }
}

