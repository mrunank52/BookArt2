package com.viniciusjr7.bookart;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {


    EditText emailid,password;
    TextView logmob,regmob,regemailid;
    Button loginbut;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        emailid=(EditText)findViewById(R.id.emailid);
        logmob=(TextView)findViewById(R.id.emailid);
        regmob=(TextView)findViewById(R.id.emailid);
        regemailid=(TextView) findViewById(R.id.emailid);
        loginbut=(Button)findViewById(R.id.loginbut);
    }


    public void mobilelogin(View view) {

    }

    public void mobreg(View view) {
    }

    public void emailreg(View view) {

    }

    public void logclick(View view){
        Intent intent =new Intent(this,home.class);
        startActivity(intent);
    }
}


}