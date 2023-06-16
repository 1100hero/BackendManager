package org.backendmanager.startapplication.domain;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.backendmanager.startapplication.enums.CategoryEnum;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.ArrayList;

@Entity @Document("Questions")
@Getter @Setter @NoArgsConstructor
public class Question {

    @Id
    @Field("_id")
    private String id;
    @Field("_category")
    private CategoryEnum category;
    @Field("_questions")
    private String question;
    @Field("_options") @ElementCollection
    private ArrayList<String> optionList;
    @Field("_correctAnswer")
    private String answer;
    @Field("_explanation")
    private String explanation;

    public Question(CategoryEnum category, String question, ArrayList<String> optionList, String answer, String explanation) {
        this.category = category;
        this.question = question;
        this.optionList = optionList;
        this.answer = answer;
        this.explanation = explanation;
    }
}
