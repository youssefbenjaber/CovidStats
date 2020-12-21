package com.mdw.covidstats;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class QuizQuestionsActivity extends AppCompatActivity {
    Button answer1, answer2, answer3, retreat;

    TextView score,question;

    private Questions mQuestions = new Questions();

    private String mAnswer;
    private int mScore = 0;
    private int mQuestionsLength = mQuestions.mQuestions.length;
ArrayList<ClipData.Item> questionsList;
int currentQuestion = 0;
    Random r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_questions);

        r = new Random();

        answer1= (Button) findViewById(R.id.answer1);
        answer2= (Button) findViewById(R.id.answer2);
        answer3= (Button) findViewById(R.id.answer3);
        retreat= (Button) findViewById(R.id.retreat);

        score= (TextView) findViewById(R.id.score);
        question= (TextView) findViewById(R.id.question);

        score.setText("Score : " + mScore);
        updateQuestion(r.nextInt(mQuestionsLength));


        answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
if(answer1.getText() == mAnswer){
    mScore++;
    score.setText("Score : " + mScore);
    updateQuestion(r.nextInt(mQuestionsLength));
}else {
    gameOver();
}
            }
        });
        answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(answer2.getText() == mAnswer){
                    mScore++;
                    score.setText("Score : " + mScore);
                    updateQuestion(r.nextInt(mQuestionsLength));
                }else {
                    gameOver();
                }
            }
        });
        answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(answer3.getText() == mAnswer){
                    mScore++;
                    score.setText("Score : " + mScore);
                    updateQuestion(r.nextInt(mQuestionsLength));
                }else {
                    gameOver();
                }
            }
        });
        retreat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    gameOver();

            }
        });
    }
    private void updateQuestion(int num){
        question.setText(mQuestions.getQuestion(num));
        answer1.setText(mQuestions.getChoice1(num));
        answer2.setText(mQuestions.getChoice2(num));
        answer3.setText(mQuestions.getChoice3(num));

        mAnswer = mQuestions.getCorrectAnswer(num);

    }
    protected void gameOver(){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(QuizQuestionsActivity.this);
        alertDialogBuilder
                .setMessage("Game Over! Your score is " + mScore + " points.")
                .setCancelable(false)
                .setPositiveButton("NEW GAME",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                startActivity(new Intent(getApplicationContext(),QuizQuestionsActivity.class));
                           finish();
                            }
                        })
                .setNegativeButton("EXIT",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                startActivity(new Intent(getApplicationContext(),MainActivity.class));
                                finish();
                            }
                        });
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }
}