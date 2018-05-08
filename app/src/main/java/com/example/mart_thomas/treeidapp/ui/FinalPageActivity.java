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

public class FinalPageActivity extends AppCompatActivity {

    private Key key;
    private TextView treeDescView;
    private TextView treeNameView;
    private ImageView treeImageView;
    private Button backButton;
    private Button startOverButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        key = new Key();
        Intent myIntent = getIntent();
        int intValue = myIntent.getIntExtra("pageNumber", 0);
        final Page page = key.getPage(intValue);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_page);


        treeDescView = (TextView) findViewById(R.id.descriptionTextView);
        String descText = getString(page.getDescID());
        treeDescView.setText(descText);

        treeNameView = (TextView) findViewById(R.id.treeNameTextView);
        String nameText = getString(page.getTextID());
        treeNameView.setText(nameText);

        treeImageView = (ImageView) findViewById(R.id.imageView2);
        Drawable image = ContextCompat.getDrawable(this, page.getImageID());
        treeImageView.setImageDrawable(image);

        backButton = (Button) findViewById(R.id.backButton);
        startOverButton = (Button) findViewById(R.id.startOverButton);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FinalPageActivity.super.onBackPressed();


            }
        });

        startOverButton.setOnClickListener(new View.OnClickListener() {
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
