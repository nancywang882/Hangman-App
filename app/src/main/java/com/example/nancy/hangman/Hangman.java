package com.example.nancy.hangman;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.view.View.OnClickListener;

public class Hangman extends AppCompatActivity implements OnClickListener{
    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.playBtn) {
            Intent playIntent = new Intent(this, DisplayMessageActivity.class);
            this.startActivity(playIntent);
        }
    }
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hangman);
        Button playBtn = (Button)findViewById(R.id.playBtn);
        playBtn.setOnClickListener(this);
    }
    }





