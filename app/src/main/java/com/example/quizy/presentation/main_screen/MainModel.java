package com.example.quizy.presentation.main_screen;

import com.example.quizy.data.model.CategoryType;
import com.example.quizy.data.model.QuestionData;
import com.example.quizy.domain.AppController;

import java.util.List;

public class MainModel implements  MainContract.Model{

    private AppController appController = AppController.getInstance();

    @Override
    public List<QuestionData> getQuestionByCategory() {
        return appController.getQuestionListByItsCategory();
    }
}
