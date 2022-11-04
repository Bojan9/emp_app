package com.example.wordle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class izberijazik extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.izberi_jazik1);

//        Button back = (Button)findViewById(R.id.button_back);
        ImageView ang = (ImageView)findViewById(R.id.btn_ang);
//        back.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View v){
//                Intent intent = new Intent(izberijazik.this, MainActivity.class);
//                startActivity(intent);
//            }
//        });

        ang.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent1 = new Intent(izberijazik.this, gamemodes.class);
                startActivity(intent1);
            }
        });
    }
}