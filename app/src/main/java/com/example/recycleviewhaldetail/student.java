package com.example.recycleviewhaldetail;
import android.os.Parcel;
import android.os.Parcelable;


import androidx.annotation.NonNull;

public class student  implements Parcelable {
    String name;
    String nim;

    String detail;

    int image;

    public student() {
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public student(String name, String nim, String detail,  int image) {
        this.name = name;
        this.nim = nim;
        this.detail = detail;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    protected student(Parcel in) {
        name = in.readString();
        nim = in.readString();
        detail = in.readString();
        image = in.readInt();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(nim);
        dest.writeString(detail);
        dest.writeInt(image);
    }


    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<student> CREATOR = new Creator <student>() {
        @Override
        public student createFromParcel(Parcel in) {
            return new student(in);
        }

        @Override
        public student[] newArray(int size) {
            return new student[size];
        }


    };
}

