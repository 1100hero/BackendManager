package org.backendmanager.startapplication.record;

import org.backendmanager.startapplication.enums.Category;

import java.util.ArrayList;

public record NewQuestionRequest(Category category, String question, ArrayList<String> optionList, String answer, String explanation) {
}
