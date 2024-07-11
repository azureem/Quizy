package com.example.quizy.presentation.category_screen;

import com.example.quizy.data.model.CategoryType;

public interface CategoryContract {

    interface Model{
    void setSelectCategory(CategoryType  category);
    }

    interface View{
        void openQuestionActivity();
    }

    interface Presenter{
    void setSelectCategory(CategoryType category);
    }
}
