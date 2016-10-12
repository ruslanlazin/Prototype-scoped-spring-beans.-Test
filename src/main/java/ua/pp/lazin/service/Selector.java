package ua.pp.lazin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ua.pp.lazin.greetings.BotForGreeting;

@Component
public class Selector {
    private Upcaser upcaser;
    private BotForGreeting firstBot;
    private BotForGreeting secondBot;
    private BotForGreeting thirdBot;
    private MyPrinter myPrinter;

    @Autowired
    public Selector(Upcaser upcaser, BotForGreeting firstBot, BotForGreeting secondBot, BotForGreeting thirdBot, MyPrinter myPrinter) {
        this.upcaser = upcaser;
        this.firstBot = firstBot;
        this.secondBot = secondBot;
        this.thirdBot = thirdBot;
        this.myPrinter = myPrinter;
    }


    public void prepareAndPrint(String name) {
        String uncasedName = upcaser.upcaseSentence(name);
        myPrinter.printSentence(firstBot.greet(uncasedName));
        myPrinter.printSentence(secondBot.greet(uncasedName));
        myPrinter.printSentence(thirdBot.greet(uncasedName));
    }
}
