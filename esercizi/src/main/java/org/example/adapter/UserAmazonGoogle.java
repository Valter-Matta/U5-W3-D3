package org.example.adapter;

public class UserAmazonGoogle extends UserGoogle{
    private UserAmazon userAmazon;

    public UserAmazonGoogle(UserAmazon userAmazon) {
        this.userAmazon = userAmazon;
    }

    public String getIdGoogle() {
        return userAmazon.getIdAmazon();
    }

    public String getName() {
        return userAmazon.getUsername();
    }

    public String getEmail() {
        return userAmazon.getAmazonEmail();
    }

    public String getSurname() {
        return userAmazon.getLastName();
    }


}
