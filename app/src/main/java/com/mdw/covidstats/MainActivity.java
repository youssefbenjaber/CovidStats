package com.mdw.covidstats;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

public class MainActivity extends AppCompatActivity {
Button btn_start;
EditText et_name;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
et_name = findViewById(R.id.et_name);
        btn_start = findViewById(R.id.btn_start);
        btn_start.setOnClickListener(new View.OnClickListener(){
          @Override
            public void onClick(View V){
              if(et_name.getText().toString().isEmpty()){
Toast.makeText(MainActivity.this,"please enter your name",Toast.LENGTH_SHORT).show();  }else{
                  startActivity(new Intent(getApplicationContext(),ChoiceActivity.class));
              }

          }
        });


    }


}