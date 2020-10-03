package com.example.trial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public Button button1, button2;
    String string1, string2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.btnone);
        button2 = findViewById(R.id.btntwo);

    }

    public void onClick(View view) {
        Intent intent;
        switch(view.getId()){
            case R.id.btnone :
                intent = new Intent(this, MainActivity2.class);
                string1 = "Hey";
                intent.putExtra("Value", string1);
                startActivity(intent);
                break;

            case R.id.btntwo :
                intent = new Intent(this, MainActivity2.class);
                string2 = "Hey Hey";
                intent.putExtra("Value", string2);
                startActivity(intent);
                break;
        }

    }
}