package com.example.introtoviews;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button hiButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_layout);

        hiButton = (Button) findViewById(R.id.hi_btn);

        hiButton.setText(R.string.btn_name);
        hiButton.setTextColor(Color.BLUE);


    }
}
