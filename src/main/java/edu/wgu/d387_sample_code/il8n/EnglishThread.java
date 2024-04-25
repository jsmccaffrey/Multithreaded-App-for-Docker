package edu.wgu.d387_sample_code.il8n;

import java.util.Locale;
import java.util.ResourceBundle;

public class EnglishThread implements Runnable{

    private String message;

    @Override
    public void run() {

        // Load the English American resource bundle
        ResourceBundle bundle = ResourceBundle.getBundle("Messages", new Locale("en", "US"));

        // Retrieve the welcome message from the bundle
        String welcomeMessage = bundle.getString("welcome_message");
        // String welcomeMessage = "ABC";

        // Set the greeting message
        this.message = welcomeMessage;
    }

    public String getMessage() {
        return message;
    }
}

