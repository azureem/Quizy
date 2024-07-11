package com.example.quizy.presentation.main_screen;

import com.example.quizy.data.model.QuestionData;

import java.util.List;

public interface MainContract {



    interface Model{
        List <QuestionData> getQuestionByCategory();
    }



    interface View{
    void clearOldStates(int pos);
    void nextBtnState(boolean b);
    void showSelectedIndex(int index);
    void showResult(int total, int correct, int wrong);
    void describeQuestion(QuestionData data);
    void showingCurrentQuestionCount(int count);
    void finishDialog(int total, int correct, int wrong);

    void unFinished(int total, int correct, int wrong);
    }




    interface Presenter{
    void clickVariant(int pos);
    void clickNextButton();

    void unfinishedTest();
    void clickFinishBtn();
    }
}
