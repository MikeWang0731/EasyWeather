package com.mike.easyweather;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
/*
    InfoActivity.java is designed for info activity which to show information about me and my project.
 */
public class InfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        findViewById(R.id.aboutMe).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(InfoActivity.this, AboutMeActivity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.bugSubmit).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(InfoActivity.this, BugSubmitActivity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.contactMe).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(InfoActivity.this, ContactMeActivity.class);
                startActivity(intent);
            }
        });
    }
}
