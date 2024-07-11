package com.example.quizy.presentation;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.Animation;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.DialogFragment;

import com.airbnb.lottie.LottieAnimationView;
import com.example.quizy.R;


public class MyDialog extends DialogFragment {
        private SelectEventListener listener;
        LottieAnimationView anim;

        @Nullable
        @Override
        public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            return inflater.inflate(R.layout.dialog_screen, container);
        }

        @Override
        public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
            super.onViewCreated(view, savedInstanceState);





            AppCompatButton yes = view.findViewById(R.id.yes_answer);
            AppCompatButton no = view.findViewById(R.id.no_answer);
            yes.setOnClickListener(v -> {
                listener.clickFinish();
                dismiss();
            });
            no.setOnClickListener(v -> {

                dismiss();
            });

        }

        @Override
            public void onStart() {
                super.onStart();
                this.getDialog().getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                Window window = getDialog().getWindow();
                window.setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                window.setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            }

        public void setEventListener(SelectEventListener listener) {
            this.listener = listener;
        }
}
