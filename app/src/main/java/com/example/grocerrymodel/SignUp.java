package com.example.grocerrymodel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;

public class SignUp extends AppCompatActivity {
    EditText eee1,eee2,eee3,eee4,eee5;
    Button bbb1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_sign_up);
        eee1=(EditText)findViewById (R.id.et1);
        eee2=(EditText)findViewById (R.id.et2);
        eee3=(EditText)findViewById (R.id.et3);
        eee4=(EditText)findViewById (R.id.et4);
        eee5=(EditText)findViewById (R.id.et5);
        bbb1=(Button)findViewById (R.id.next);
        bbb1.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View view) {
                Intent i2=new Intent(SignUp.this,signupnext.class);
                startActivity (i2);
            }
        });
    }
}
