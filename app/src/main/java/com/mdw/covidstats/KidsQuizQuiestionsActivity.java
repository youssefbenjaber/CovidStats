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
import java.util.Random;

public class KidsQuizQuiestionsActivity extends AppCompatActivity {
    Button answer1k, answer2k,  retraitk;

    TextView scorek,questionk;

    private Questionsk mQuestionsk = new Questionsk();

    private String mAnswerk;
    private int mScorek = 0;
    private int mQuestionskLength = mQuestionsk.mQuestionsk.length;
    ArrayList<ClipData.Item> questionsList;
    int currentQuestion = 0;
    Random r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kidsquiz_questions);

        r = new Random();

        answer1k= (Button) findViewById(R.id.answer1k);
        answer2k= (Button) findViewById(R.id.answer2k);
        retraitk= (Button) findViewById(R.id.retraitk);

        scorek= (TextView) findViewById(R.id.scorek);
        questionk= (TextView) findViewById(R.id.questionk);

        scorek.setText("Score : " + mScorek);
        updateQuestion(r.nextInt(mQuestionskLength));


        answer1k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(answer1k.getText() == mAnswerk){
                    mScorek++;
                    scorek.setText("Score : " + mScorek);
                    updateQuestion(r.nextInt(mQuestionskLength));
                }else {
                    gameOver();
                }
            }
        });
        answer2k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(answer2k.getText() == mAnswerk){
                    mScorek++;
                    scorek.setText("Score : " + mScorek);
                    updateQuestion(r.nextInt(mQuestionskLength));
                }else {
                    gameOver();
                }
            }
        });
        retraitk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                gameOver();

            }
        });
    }
    private void updateQuestion(int num){
        questionk.setText(mQuestionsk.getQuestionk(num));
        answer1k.setText(mQuestionsk.getChoice1k(num));
        answer2k.setText(mQuestionsk.getChoice2k(num));

        mAnswerk = mQuestionsk.getCorrectAnswerk(num);

    }
    protected void gameOver(){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(KidsQuizQuiestionsActivity.this);
        alertDialogBuilder
                .setMessage("Game Over! Your score is " + mScorek + " points.")
                .setCancelable(false)
                .setPositiveButton("NEW GAME",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                startActivity(new Intent(getApplicationContext(), KidsQuizQuiestionsActivity.class));
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