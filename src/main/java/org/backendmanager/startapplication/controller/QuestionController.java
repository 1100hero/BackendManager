package org.backendmanager.startapplication.controller;

import org.backendmanager.startapplication.domain.Question;
import org.backendmanager.startapplication.record.NewQuestionRequest;
import org.backendmanager.startapplication.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/question")
@CrossOrigin
public class QuestionController {

    @Autowired
    private QuestionRepository questionRepository;

    @PostMapping("/insert")
    public ResponseEntity<Question> addQuestionToDB(@RequestBody NewQuestionRequest questionRequest){
        questionRepository.save(new Question(questionRequest.category(), questionRequest.question(),
                questionRequest.optionList(), questionRequest.answer()));
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
