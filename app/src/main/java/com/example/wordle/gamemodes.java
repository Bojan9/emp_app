package com.example.wordle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class gamemodes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.izberi_gamemode);

        Button dolzina5 = (Button)findViewById(R.id.dolzina5);
        dolzina5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent1 = new Intent(gamemodes.this, gamemode5.class);
                startActivity(intent1);
            }
        });
    }
}