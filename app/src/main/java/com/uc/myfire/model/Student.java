package com.uc.myfire.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Student implements Parcelable {

    private String uid;
    private String email;
    private String password;
    private String name;
    private String nim;
    private String gender;
    private String age;
    private String address;

    public Student(){}

    public Student(String uid, String email, String password, String name, String nim, String gender, String age, String address) {
        this.uid = uid;
        this.email = email;
        this.password = password;
        this.name = name;
        this.nim = nim;
        this.gender = gender;
        this.age = age;
        this.address = address;
    }

    protected Student(Parcel in) {
        uid = in.readString();
        email = in.readString();
        password = in.readString();
        name = in.readString();
        nim = in.readString();
        gender = in.readString();
        age = in.readString();
        address = in.readString();
    }

    public static final Creator<Student> CREATOR = new Creator<Student>() {
        @Override
        public com.uc.myfire.model.Student createFromParcel(Parcel in) {
            return new com.uc.myfire.model.Student(in);
        }

        @Override
        public com.uc.myfire.model.Student[] newArray(int size) {
            return new com.uc.myfire.model.Student[size];
        }
    };

    public String getUid() {
        return uid;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getNim() {
        return nim;
    }

    public String getGender() {
        return gender;
    }

    public String getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }



    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(uid);
        dest.writeString(email);
        dest.writeString(password);
        dest.writeString(name);
        dest.writeString(nim);
        dest.writeString(gender);
        dest.writeString(age);
        dest.writeString(address);
    }
}
