package com.cognizant.m2challenge.controller;

import com.cognizant.m2challenge.models.Definition;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class WordController {



    List<Definition> wordDefinitionList = new ArrayList<>(
            Arrays.asList(
                    new Definition( 1,"computer", "An electronic device for storing and processing data, typically in binary form, according to instructions given to it in a variable program."),
                    new Definition( 2,"TDD", "Test-driven development"),
                    new Definition(3,"CPU", "Central processing unit."),
                    new Definition( 4,"word", "a single distinct meaningful element of speech or writing, used with others (or sometimes alone) to form a sentence and typically shown with a space on either side when written or printed."),
                    new Definition( 5,"money", "a current medium of exchange in the form of coins and banknotes; coins and banknotes collectively."),
                    new Definition(6,"game", "a form of play or sport, especially a competitive one played according to rules and decided by skill, strength, or luck."),
                    new Definition( 7,"time", "the indefinite continued progress of existence and events in the past, present, and future regarded as a whole."),
                    new Definition(8,"luck", "success or failure apparently brought by chance rather than through one's own actions."),
                    new Definition( 9,"sky", "the region of the atmosphere and outer space seen from the earth."),
                    new Definition( 10,"meaning", "what is meant by a word, text, concept, or action."),
                    new Definition(11,"sort", "arrange systematically in groups; separate according to type, class, etc..")
            )
    );





    @RequestMapping(value="/word", method= RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public Definition  getAllWords() {
        int random = (int)(Math.random() * ( 10 - 0 + 1 ) + 0 );
        return wordDefinitionList.get(random);

    }




}
