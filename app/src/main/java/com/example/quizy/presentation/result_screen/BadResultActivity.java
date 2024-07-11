package com.example.quizy.presentation.result_screen;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import com.example.quizy.R;

public class BadResultActivity extends AppCompatActivity {
    @SuppressLint("MissingInflatedId")

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bad_result);
        this.getWindow().setNavigationBarColor(Color.parseColor("#1F2544"));
        Window window = getWindow();
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.setStatusBarColor(Color.parseColor("#1F2544"));
        int totalval = getIntent().getIntExtra("total", -1);
        TextView tv =findViewById(R.id.BadTotalGet);
        tv.setText(String.valueOf(totalval));

        int corVal = getIntent().getIntExtra("correct", -1);
        TextView tv2 = findViewById(R.id.BadCorrectGet);
        tv2.setText(String.valueOf(corVal));

        int wrVal = getIntent().getIntExtra("wrong", -1);
        TextView tv3 = findViewById(R.id.BadWrongGet);
        tv3.setText(String.valueOf(wrVal));

        findViewById(R.id.bad_back_result).setOnClickListener(v->{
            finish();
        });
    }
}