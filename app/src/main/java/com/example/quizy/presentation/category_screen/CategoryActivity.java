package com.example.quizy.presentation.category_screen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.airbnb.lottie.LottieAnimationView;
import com.example.quizy.R;
import com.example.quizy.data.model.CategoryType;
import com.example.quizy.presentation.info_screen.InfoActivity;
import com.example.quizy.presentation.main_screen.MainActivity;
import com.example.quizy.presentation.main_screen.MainPresenter;

public class CategoryActivity extends AppCompatActivity implements CategoryContract.View{
    private CategoryContract.Presenter presenter;
    private AppCompatButton infosBtn;
    LottieAnimationView infoAnim;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        presenter = new CategoryPresenter(this);
        clickedCategory();
        Window window = getWindow();
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.setStatusBarColor(Color.parseColor("#1F2544"));

        this.getWindow().setNavigationBarColor(Color.parseColor("#1F2544"));

    }

    private  void clickedCategory(){
        findViewById(R.id.javaCategory).setOnClickListener(v->{
            presenter.setSelectCategory(CategoryType.JAVA);
        });


        findViewById(R.id.androidCategory).setOnClickListener(v->{
            presenter.setSelectCategory(CategoryType.ANDROID);
        });


        findViewById(R.id.englishCategory).setOnClickListener(v->{
            presenter.setSelectCategory(CategoryType.GEOGRAPHY);
        });

        findViewById(R.id.historyCategory).setOnClickListener(v->{
            presenter.setSelectCategory(CategoryType.HISTORY);
        });


        infoAnim =  findViewById(R.id.info_anim);
        infoAnim.playAnimation();

                infoAnim.setOnClickListener(v->{
            Intent intent = new Intent(CategoryActivity.this, InfoActivity.class);
            startActivity(intent);
        });
    }
    @Override
    public void openQuestionActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
   }
}