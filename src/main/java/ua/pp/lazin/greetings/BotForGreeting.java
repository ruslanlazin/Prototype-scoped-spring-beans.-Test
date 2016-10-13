package ua.pp.lazin.greetings;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
@Scope("prototype")
public class BotForGreeting {


    private String botName;

    public BotForGreeting() {

        this.botName = new Random().ints(7L, 'A', 'Z' + 1).collect(StringBuilder::new,
                StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }

    public String greet(String name) {
        return "Hello " + name + "!   I'm prototype scoped spring bean. My name is  " + botName;
    }
}


