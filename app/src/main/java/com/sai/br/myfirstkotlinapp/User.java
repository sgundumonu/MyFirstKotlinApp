package com.sai.br.myfirstkotlinapp;


import java.io.Serializable;

public final class User implements Serializable{

    private String mFirstName;
    private String mLastName;
    private String mEmail;

    public String getFirstName() {
        return mFirstName;
    }

    public void setFirstName(String firstName) {
        mFirstName = firstName;
    }

    public String getLastName() {
        return mLastName;
    }

    public void setLastName(String lastName) {
        mLastName = lastName;
    }

    public String getEmail() {
        return mEmail;
    }

    public void setEmail(String email) {
        mEmail = email;
    }
}
