package edu.wgu.d387_sample_code.il8n;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/") //http:localhost:8080
public class WelcomeController {

    @GetMapping( "/english")
    public Message english(){
        EnglishThread englishThread = new EnglishThread();
        Thread thread = new Thread(englishThread);
        thread.start();
        try {
            Thread.sleep(25);
            Message message = new Message(englishThread.getMessage());

            return message;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @GetMapping( "/french")
    public Message french() {
        FrenchThread frenchThread = new FrenchThread();
        Thread thread = new Thread(frenchThread);
        thread.start();
        try {
            Thread.sleep(25);
            Message message = new Message(frenchThread.getMessage());

            return message;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}





