package com.example.quizy.presentation.splash_screen;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

import com.example.quizy.R;
import com.example.quizy.presentation.category_screen.CategoryActivity;
import com.example.quizy.presentation.main_screen.MainPresenter;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Window window = getWindow();
        this.getWindow().setNavigationBarColor(Color.parseColor("#1F2544"));
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.setStatusBarColor(Color.parseColor("#1F2544"));

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
            openMenuScreen();
        } else {
            Handler handler = new Handler(getMainLooper());
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    openMenuScreen();
                }
            }, 3_000);
        }

    }

    private void openMenuScreen() {
        Intent intent = new Intent(SplashActivity.this, CategoryActivity.class);
        startActivity(intent);
        finish();
    }
}
