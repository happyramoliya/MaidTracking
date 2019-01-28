package com.example.shreeji.maidtracking.Activity_Files;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.shreeji.maidtracking.R;

public class Login_activity extends AppCompatActivity {
    TextView loginbtn,registerbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_activity);

        loginbtn=(TextView)findViewById(R.id.login);
        registerbtn=(TextView)findViewById(R.id.register);
        registerbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Login_activity.this, RegisterActivity.class);
                startActivity(i);
            }
        });


    }
}
