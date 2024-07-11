package com.example.quizy.presentation.category_screen;

import com.example.quizy.data.model.CategoryType;

public class CategoryPresenter implements  CategoryContract.Presenter{
    private CategoryContract.View view;
    private CategoryContract.Model model;


   CategoryPresenter(CategoryContract.View view){
       this.view = view;
       model = new CategoryModel();
   }

    @Override
    public void setSelectCategory(CategoryType category) {
       model.setSelectCategory(category);
        view.openQuestionActivity();
    }
}
