package edu.wgu.d387_sample_code.il8n;

import java.util.Locale;
import java.util.ResourceBundle;

public class FrenchThread implements Runnable{

    private String message;

    @Override
    public void run() {

        ResourceBundle bundle = ResourceBundle.getBundle("Messages", new Locale("fr", "CA"));

        String welcomeMessage = bundle.getString("welcome_message");
        // String welcomeMessage = "ABC";

        // Set the greeting message
        this.message = welcomeMessage;
    }

    public String getMessage() {
        return message;
    }
}