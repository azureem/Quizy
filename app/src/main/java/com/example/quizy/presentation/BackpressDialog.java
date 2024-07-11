package com.example.quizy.presentation;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.DialogFragment;

import com.example.quizy.R;

public class BackpressDialog extends DialogFragment {

   private Runnable finishListener;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.back_press, container);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        AppCompatButton cancel = view.findViewById(R.id.back_no_answer);
        AppCompatButton finish =  view.findViewById(R.id.back_yes_answer);


        cancel.setOnClickListener(v->{
            dismiss();
        });

        finish.setOnClickListener(v->{
           finishListener.run();
        });
    }
    @Override
    public void onResume() {
        super.onResume();
        if (getDialog() != null) {
            getDialog().getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            getDialog().getWindow().setBackgroundDrawableResource(android.R.color.transparent);
            getDialog().setCancelable(false);
        }
    }

    public void setFinishListener(Runnable block) {
        this.finishListener = block;
    }

}
