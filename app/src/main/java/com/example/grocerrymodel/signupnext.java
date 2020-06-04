package com.example.grocerrymodel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class signupnext extends AppCompatActivity implements View.OnClickListener{
    EditText eee6,eee7,eee8,eee9,eee10;
    TextView bbb2,bbb3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_signupnext);
        eee6=(EditText)findViewById (R.id.et6);
        eee7=(EditText)findViewById (R.id.et7);
        eee8=(EditText)findViewById (R.id.et8);
        eee9=(EditText)findViewById (R.id.et9);
        eee10=(EditText)findViewById (R.id.et10);
        bbb2=(TextView) findViewById (R.id.reg);
        bbb3=(TextView)findViewById (R.id.ll1);
        bbb2.setOnClickListener (this);
        bbb3.setOnClickListener (this);

    }
    public void onClick(View v)
    {
        if(v==bbb3)
        {
            Intent i4=new Intent (signupnext.this,MainActivity.class);
            startActivity (i4);
        }
    }
}
