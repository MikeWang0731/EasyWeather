package com.mike.easyweather;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
/*
    ContactMeActivity.java is designed for contact me page.
 */
public class ContactMeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_me);

        final EditText contactMeInput = findViewById(R.id.contactMeInput);

        findViewById(R.id.backToInfo3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contactMeInput.setText("");
                Intent intent = new Intent(ContactMeActivity.this, InfoActivity.class);
                startActivity(intent);
            }
        });
    }
}
