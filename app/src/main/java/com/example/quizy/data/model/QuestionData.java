package com.example.quizy.data.model;

public class QuestionData {
    private String question;
    private String[] variants;
    private String answer;

    public String getQuestion() {
        return question;
    }

    public String[] getVariants() {
        return variants;
    }



    public String getAnswer() {
        return answer;
    }

    public QuestionData(String question,
                        String variant1,
                        String variant2,
                        String variant3,
                        String variant4,
                        String answer) {

        this.question = question;
        this.variants = new String[]{variant1, variant2, variant3, variant4};
        this.answer = answer;


    }
}
