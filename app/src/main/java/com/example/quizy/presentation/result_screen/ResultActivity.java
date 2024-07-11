package com.example.quizy.presentation.result_screen;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import com.example.quizy.R;

import org.w3c.dom.Text;

public class ResultActivity extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        this.getWindow().setNavigationBarColor(Color.parseColor("#1F2544"));
        Window window = getWindow();
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.setStatusBarColor(Color.parseColor("#1F2544"));

        int totalval = getIntent().getIntExtra("total", -1);
        TextView tv =findViewById(R.id.totalGet);
        tv.setText(String.valueOf(totalval));

        int corVal = getIntent().getIntExtra("correct", -1);
        TextView tv2 = findViewById(R.id.correctGet);
        tv2.setText(String.valueOf(corVal));

        int wrVal = getIntent().getIntExtra("wrong", -1);
        TextView tv3 = findViewById(R.id.wrongGet);
        tv3.setText(String.valueOf(wrVal));

        findViewById(R.id.good_back_result).setOnClickListener(v->{
            finish();
        });
    }
}