package com.sai.br.myfirstkotlinapp;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.AppCompatEditText;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    AppCompatEditText mFirstName;
    AppCompatEditText mLastName;
    AppCompatEditText mEmailName;
    AppCompatButton mSubmitButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mFirstName = (AppCompatEditText) findViewById(R.id.firstName);
        mLastName = (AppCompatEditText) findViewById(R.id.lastName);
        mEmailName = (AppCompatEditText) findViewById(R.id.email);

        mSubmitButton = (AppCompatButton) findViewById(R.id.submit);

        mSubmitButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.submit) {
            User user = new User();
            user.setFirstName(mFirstName.getEditableText().toString());
            user.setLastName(mLastName.getEditableText().toString());
            user.setEmail(mEmailName.getEditableText().toString());
            startDisplatActivity(user);
        }
    }

    private void startDisplatActivity(User user){
        startActivity(DisplayActivity.newInstnace(this, user));
    }
}
