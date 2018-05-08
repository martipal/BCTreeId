package com.example.mart_thomas.treeidapp.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.mart_thomas.treeidapp.R;

public class MainActivity extends AppCompatActivity {

    private Button startButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startButton = (Button) findViewById(R.id.startButton);
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                beginKey();

            }
        });
    }

    private void beginKey() {
        Intent intent = new Intent(getApplicationContext(), KeyActivity.class);
        startActivity(intent);





    }
}
