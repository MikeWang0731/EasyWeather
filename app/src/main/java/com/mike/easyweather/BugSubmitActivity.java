package com.mike.easyweather;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;

/*
    BugSubmitActivity.java is designed for bug submit page.
 */

public class BugSubmitActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bug_submit);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final EditText bugSubmitInput = findViewById(R.id.bugSubmitInput);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Submit Successfully", Snackbar.LENGTH_LONG).show();
                bugSubmitInput.setText("");
            }
        });

        findViewById(R.id.backToInfo2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BugSubmitActivity.this, InfoActivity.class);
                startActivity(intent);
            }
        });
    }

}
