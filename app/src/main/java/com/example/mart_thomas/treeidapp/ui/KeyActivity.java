package com.example.mart_thomas.treeidapp.ui;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mart_thomas.treeidapp.R;
import com.example.mart_thomas.treeidapp.model.Key;
import com.example.mart_thomas.treeidapp.model.Page;

import java.util.Stack;

public class KeyActivity extends AppCompatActivity {

    private Key key;
    private ImageView keyImageView;
    private TextView keyTextView;
    private Button trueButton;
    private Button falseButton;
    private Button backButton;
    public Stack<Integer> pageStack = new Stack<Integer>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_key);
        keyImageView = (ImageView) findViewById(R.id.imageView);
        keyTextView = (TextView) findViewById(R.id.pageText);
        trueButton = (Button) findViewById(R.id.trueButton);
        falseButton = (Button) findViewById(R.id.falseButton);
        backButton = (Button) findViewById(R.id.backButton);
        key = new Key();
        loadPage(0);
    }

    private void loadPage(int pageNo) {
        pageStack.push(pageNo);
        final int pageNumber = pageNo;
        final Page page = key.getPage(pageNo);
        if (page.isFinalPage()){
            startFinalPageActivity(pageNo);
            return;
        }

        Drawable image = ContextCompat.getDrawable(this, page.getImageID());
        keyImageView.setImageDrawable(image);

        String pageText = getString(page.getTextID());
        keyTextView.setText(pageText);

        trueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int nextPage = page.getTrueSelect().getNextPage();
                loadPage(nextPage-1);
            }
        });

        falseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int nextPage = page.getFalseSelect().getNextPage();
                loadPage(nextPage-1);

            }
        });

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pageStack.pop();
                if (pageNumber == 0){
                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(intent);
                } else {
                    loadPage(pageStack.pop());
                }

            }
        });
    }


    private void startFinalPageActivity(int pageNo) {
        Intent intent = new Intent(getApplicationContext(), FinalPageActivity.class);
        intent.putExtra("pageNumber", pageNo);
        startActivity(intent);
    }
}
