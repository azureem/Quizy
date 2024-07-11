package com.example.quizy.presentation.category_screen;

import com.example.quizy.data.model.CategoryType;
import com.example.quizy.domain.AppController;

public class CategoryModel implements CategoryContract.Model {
   private AppController controller = AppController.getInstance();

   @Override
   public void setSelectCategory(CategoryType category) {
    controller.setSelectCategory(category);
   }
}
