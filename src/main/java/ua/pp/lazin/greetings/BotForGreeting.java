package ua.pp.lazin.greetings;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class BotForGreeting {


    private String botName;

    public BotForGreeting() {

        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder botName = new StringBuilder("");
        for (int i = 0; i < 7; i++) {
            botName = botName.append(alphabet.charAt((int) (Math.random() * alphabet.length())));
        }
        this.botName = botName.toString();
    }

    public String greet(String name) {
        return "Hello " + name + "!   I'm prototype scoped spring bean. My name is  " + botName;
    }
}


