package org.backendmanager.startapplication.record;

import org.backendmanager.startapplication.enums.CategoryEnum;

import java.util.ArrayList;

public record NewQuestionRequest(CategoryEnum category, String question, ArrayList<String> optionList, String answer, String explanation) {
}
