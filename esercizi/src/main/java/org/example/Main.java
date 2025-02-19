package org.example;

import org.example.adapter.Autentication;
import org.example.adapter.UserAmazon;
import org.example.adapter.UserAmazonGoogle;

public class Main {
    public static void main(String[] args) {
        UserAmazon userAmazon = new UserAmazon();
        userAmazon.setIdAmazon("1");
        userAmazon.setUsername("Mario");
        userAmazon.setAmazonEmail("m@email.it");

        // non posso usare il servizio
        //Autentication.autenticate(userAmazon);

        UserAmazonGoogle userAmazonGoogle = new UserAmazonGoogle(userAmazon);


        Autentication.autenticate(userAmazonGoogle);

    }
}