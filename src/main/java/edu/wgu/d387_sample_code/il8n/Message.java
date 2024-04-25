package edu.wgu.d387_sample_code.il8n;

import org.springframework.stereotype.Service;

public class Message {

    private String greeting;

    public Message(String greeting) {
        this.greeting = greeting;
    }

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }
}
