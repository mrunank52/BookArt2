package com.viniciusjr7.bookart;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText etpassword,etemailid;
    Button bulogin;
    TextView tvreg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        etemailid=(EditText)findViewById(R.id.etemailid);

        tvreg=(TextView)findViewById(R.id.tvreg);
        bulogin=(Button) findViewById(R.id.bulogin);
        etpassword=(EditText) findViewById(R.id.etpassword);

    }


    public void logclick(View view) {
        Intent intent= new Intent(this,home.class);
        startActivity(intent);

    }

    public void regclick(View view) {
        Intent intent=new Intent(this,register.class);
        startActivity(intent);
    }
}
