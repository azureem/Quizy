package com.example.quizy.presentation.main_screen;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.quizy.R;
import com.example.quizy.data.model.QuestionData;
import com.example.quizy.presentation.BackpressDialog;
import com.example.quizy.presentation.MyDialog;
import com.example.quizy.presentation.SelectEventListener;
import com.example.quizy.presentation.category_screen.CategoryActivity;
import com.example.quizy.presentation.result_screen.BadResultActivity;
import com.example.quizy.presentation.result_screen.ResultActivity;
import com.example.quizy.presentation.result_screen.UnsolvedScreen;
import com.example.quizy.presentation.result_screen.WinnerScreen;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity implements MainContract.View {
    private MainContract.Presenter presenter;
    private TextView textQuestion;
    private List<ViewGroup> groupsVariant;
    private List<ImageView> images;
    private List<TextView> texts;
    private Button btnNext;
    private Button btnFinish;
    private Button infoBtn;
    int j = 1;
    private TextView questionHolder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.getWindow().setNavigationBarColor(Color.parseColor("#1F2544"));
        loadViews();
        presenter = new MainPresenter(this);
        Window window = getWindow();
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.setStatusBarColor(Color.parseColor("#1F2544"));
    }


    private void loadViews() {
        questionHolder = findViewById(R.id.question_position_holder);
        textQuestion = findViewById(R.id.text_question);
        btnNext = findViewById(R.id.btn_next);
        btnFinish = findViewById(R.id.btn_finish);
        infoBtn = findViewById(R.id.info_btn);

        images = new ArrayList<>();
        images.add(findViewById(R.id.image_variant_1));
        images.add(findViewById(R.id.image_variant_2));
        images.add(findViewById(R.id.image_variant_3));
        images.add(findViewById(R.id.image_variant_4));

        texts = new ArrayList<>();
        texts.add(findViewById(R.id.text_variant_1));
        texts.add(findViewById(R.id.text_variant_2));
        texts.add(findViewById(R.id.text_variant_3));
        texts.add(findViewById(R.id.text_variant_4));

        groupsVariant = new ArrayList<>();
        groupsVariant.add(findViewById(R.id.variant1));
        groupsVariant.add(findViewById(R.id.variant2));
        groupsVariant.add(findViewById(R.id.variant3));
        groupsVariant.add(findViewById(R.id.variant4));

        for (int i = 0; i < groupsVariant.size(); i++) {
            int index = i;
            groupsVariant.get(i).setOnClickListener(v -> {
                presenter.clickVariant(index);
            });
        }
        btnNext.setOnClickListener(v -> presenter.clickNextButton());
        btnFinish.setOnClickListener(v -> presenter.clickFinishBtn());
    }


    @Override
    public void clearOldStates(int pos) {
        images.get(pos).setImageResource(R.drawable.ic_unchecked);
    }


    @Override
    public void nextBtnState(boolean b) {
        btnNext.setEnabled(b);
    }


    @Override
    public void showSelectedIndex(int index) {
        images.get(index).setImageResource(R.drawable.baseline_circle_24);
    }

    @Override
    public void showResult(int total, int correct, int wrong) {
        if (correct >= 10) {
            Intent intent = new Intent(this, ResultActivity.class);
            intent.putExtra("total", total);
            intent.putExtra("correct", correct);
            intent.putExtra("wrong", wrong);
            startActivity(intent);
            finish();
        } else {
            Intent intent = new Intent(this, BadResultActivity.class);
            intent.putExtra("total", total);
            intent.putExtra("correct", correct);
            intent.putExtra("wrong", wrong);
            startActivity(intent);
            finish();
        }

    }
    @Override
    public void unFinished(int total, int correct, int wrong) {
        int bad = total - correct;
        int good = total - wrong;
        if (correct > wrong && correct!=total) {
            Intent intent = new Intent(this, ResultActivity.class);
            intent.putExtra("total", total);
            intent.putExtra("correct", correct);
            intent.putExtra("wrong", wrong);
            startActivity(intent);
            finish();


        } else if (correct == 0 && wrong == 0){
            Intent intent = new Intent(this, UnsolvedScreen.class);
            intent.putExtra("total", total);
            intent.putExtra("correct", correct);
            intent.putExtra("wrong", wrong);
            startActivity(intent);
            finish();
        } else if (total == correct && wrong ==0) {
            Intent intent = new Intent(this, WinnerScreen.class);
            intent.putExtra("total", total);
            intent.putExtra("correct", correct);
            intent.putExtra("wrong", wrong);
            startActivity(intent);
            finish();
        } else {
            Intent intent = new Intent(this, BadResultActivity.class);
            intent.putExtra("total", total);
            intent.putExtra("correct", correct);
            intent.putExtra("wrong", wrong);
            startActivity(intent);
            finish();
        }
    }

    @Override
    public void describeQuestion(QuestionData data) {

        textQuestion.setText(data.getQuestion());
        for (int i = 0; i < texts.size(); i++) {
            texts.get(i).setText(data.getVariants()[i]);

        }
    }

    @Override
    public void showingCurrentQuestionCount(int count) {
        questionHolder.setText(String.valueOf(count + 1 + " / 15"));
    }

    //    @Override
//    public void finishDialog() {
//        AlertDialog.Builder builder = new AlertDialog.Builder(this);
//        builder.setTitle("Exit Game")
//                .setMessage("Are you sure you want to leave the game?")
//                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
//                    public void onClick(DialogInterface dialog, int id) {
//
//                        finish();
//                    }
//                })
//                .setNegativeButton("No", new DialogInterface.OnClickListener() {
//                    public void onClick(DialogInterface dialog, int id) {
//
//                        dialog.dismiss();
//                    }
//                });
//        builder.setCancelable(false);
//        AlertDialog dialog = builder.create();
//        dialog.show();
//
//    }
    @Override
    public void finishDialog(int total, int correct, int wrong) {
        findViewById(R.id.btn_finish).setOnClickListener(v -> {
            MyDialog dialog = new MyDialog();

            dialog.setEventListener(new SelectEventListener() {
                @Override
                public void clickFinish() {
                    unFinished(total, correct, wrong);
                    dialog.dismiss();

                }
            });
            dialog.show(getSupportFragmentManager(), "");
        });


    }



    private void moving(int total, int correct, int wrong){
        Intent intent = new Intent(this, CategoryActivity.class);
        startActivity(intent);
    }
    @Override
    public void onBackPressed() {

        BackpressDialog dialog = new BackpressDialog();
        dialog.setFinishListener(() -> {
            startActivity(new Intent(this, CategoryActivity.class));
            finish();
            dialog.dismiss();
        });
        dialog.show(getSupportFragmentManager(), null);
        // Call this to perform the default back press action (exit)
    }


}
