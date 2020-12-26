package com.mdw.covidstats;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;


    public class ChoiceActivity extends AppCompatActivity {
        Button btn_1, btn_2;

        @Override

        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_choice);
            btn_1 = findViewById(R.id.btn_1);
            btn_1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View V) {
                    startActivity(new Intent(getApplicationContext(), QuizQuestionsActivity.class));
                }
            });


        }
    }