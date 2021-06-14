package com.cognizant.m2challenge.controller;

import com.cognizant.m2challenge.models.Definition;
import com.cognizant.m2challenge.models.Quote;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class QuotesController {

    List<Quote> quoteList = new ArrayList<>(
            Arrays.asList(
                    new Quote( 1,"Ronald Reagan", "We must reject the idea that every time a law's broken, society is guilty rather than the lawbreaker. It is time to restore the American precept that each individual is accountable for his actions."),
                    new Quote( 2,"Ronald Reagan", "Peace is not absence of conflict, it is the ability to handle conflict by peaceful means."),
                    new Quote(3,"Arnold H. Glasow", "Success isn't a result of spontaneous combustion. You must set yourself on fire."),
                    new Quote( 4,"Arnold H. Glasow", "An idea not coupled with action will never get any bigger than the brain cell it occupied."),
                    new Quote( 5,"Gene Wilder", "I never used to believe in fate. I used to think you make your own life, and then you call it fate."),
                    new Quote(6,"America Ferrera", "My siblings are my best friends."),
                    new Quote( 7,"Buddha", "Do not dwell in the past, do not dream of the future, concentrate the mind on the present moment."),
                    new Quote( 8,"Bob Marley", "Open your eyes, look within. Are you satisfied with the life you're living?"),
                    new Quote(9,"Steve Jobs", "Sometimes life hits you in the head with a brick. Don't lose faith."),
                    new Quote( 10,"Walter Hagen", "You're only here for a short visit. Don't hurry, don't worry. And be sure to smell the flowers along the way."),
                    new Quote( 11,"Eric Butterworth", "Don't go through life, grow through life."),
                    new Quote(12,"Charles Darwin", "A man who dares to waste one hour of time has not discovered the value of life.")
            )
    );



    @RequestMapping(value="/quote", method= RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public Quote getAllQuotes() {
        int random = (int)(Math.random() * ( 10 - 0 + 1 ) + 0 );
        return quoteList.get(random);

    }


}
