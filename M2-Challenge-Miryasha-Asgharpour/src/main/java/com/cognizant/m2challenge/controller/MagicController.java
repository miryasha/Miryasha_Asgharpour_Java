package com.cognizant.m2challenge.controller;

import com.cognizant.m2challenge.models.Answer;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class MagicController {

    List<Answer> magicList = new ArrayList<>(
            Arrays.asList(
                    new Answer( 1,null,"magic 8 ball affirms Reply hazy, try again"),
                    new Answer( 2,null,"magic 8 ball answers My reply is no."),
                    new Answer(3,null,"magic 8 ball says Very doubtful."),
                    new Answer( 4,null,"magic 8 ball affirms Reply hazy, try again"),
                    new Answer( 5,null,"magic 8 ball answers My reply is yes."),
                    new Answer(6,null,"magic 8 ball says Yes, definitely."),
                    new Answer(7,null,"magic 8 ball says You may rely on it."),
                    new Answer( 8,null,"magic 8 ball answers Outlook good."),
                    new Answer(9,null,"magic 8 ball says It is decidedly so."),
                    new Answer(10,null,"magic 8 ball says As I see it, yes.")

            )
    );



    @RequestMapping(value="/magic", method= RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK)
    public Answer askMagic(@RequestBody Answer question ) {



        int random = (int)(Math.random() * ( 10 - 0 + 1 ) + 0 );

          magicList.get(random).setQuestion(question.getQuestion());
          return magicList.get(random);

    }

}
