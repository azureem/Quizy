package com.example.quizy.presentation.main_screen;

import com.example.quizy.data.model.QuestionData;

import java.util.List;

public class MainPresenter implements MainContract.Presenter {
    private MainContract.Model model;
    private MainContract.View view;
    private int selectedIndex = -1;
    private List<QuestionData> questionList;
    private int currentPos = 0;
    private int correctCount = 0;
    private  int total=0;
    private int wrongCount = 0;


    public MainPresenter(MainContract.View view) {
        this.view = view;
        model = new MainModel();
        loadQuestionData();
        loadQuestionByPos();
    }

    private  void loadQuestionData(){

        this.questionList = model.getQuestionByCategory();
    }

    private void  loadQuestionByPos(){
     view.describeQuestion(questionList.get(currentPos));
        view.showingCurrentQuestionCount(currentPos);

    }


    @Override
    public void clickVariant(int pos) {
        if (pos == this.selectedIndex) return;
        if (selectedIndex > -1) view.clearOldStates(selectedIndex);
        selectedIndex = pos;
        view.nextBtnState(true);
        view.showSelectedIndex(pos);

    }


    @Override
    public void clickNextButton() {
        QuestionData currentQuestion = questionList.get(currentPos);
        if (currentQuestion.getAnswer().equals(currentQuestion.getVariants()[selectedIndex])) {
            this.correctCount++;
        } else wrongCount++;

        view.clearOldStates(selectedIndex);
        view.nextBtnState(false);
        currentPos++;
        total = correctCount + wrongCount;
        view.finishDialog(total, correctCount, wrongCount);
        if (currentPos == questionList.size()) {
            view.showResult(total, correctCount, wrongCount);
        }
        else {
            view.showingCurrentQuestionCount(currentPos);
            view.describeQuestion(questionList.get(currentPos));

        }
        selectedIndex = -1;
    }

    @Override
    public void unfinishedTest() {
        QuestionData currentQuestion = questionList.get(currentPos);
        if (currentQuestion.getAnswer().equals(currentQuestion.getVariants()[selectedIndex])) {
            this.correctCount++;
        } else wrongCount++;

        view.clearOldStates(selectedIndex);
        view.nextBtnState(false);
        currentPos++;
        total = correctCount + wrongCount;
    }

    @Override
    public void clickFinishBtn() {
    view.finishDialog(total, correctCount, wrongCount);
    }
}
