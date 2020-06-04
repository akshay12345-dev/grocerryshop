package com.example.grocerrymodel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {
    EditText ee1,ee2;
    Button bb1,bb2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);
        ee1=(EditText)findViewById (R.id.e1);
        ee2=(EditText)findViewById (R.id.e2);
        bb1=(Button)findViewById (R.id.b1);
        bb2=(Button)findViewById (R.id.b2);
        bb2.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(MainActivity.this,SignUp.class);
                startActivity (i1);
            }
        });
    }
}
