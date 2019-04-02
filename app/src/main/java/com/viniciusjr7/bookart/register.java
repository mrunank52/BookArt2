package com.viniciusjr7.bookart;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class register extends AppCompatActivity {
    EditText etname,etlastname,etmob,etpass,etmail,etconpass;
    Button butregist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        etname=(EditText)findViewById(R.id.etname);
        etlastname=(EditText)findViewById(R.id.etlastname);
    }

}
