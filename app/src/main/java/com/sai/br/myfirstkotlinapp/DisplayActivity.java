package com.sai.br.myfirstkotlinapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatTextView;

public class DisplayActivity extends AppCompatActivity {
    private static final String EXTRA_USER = "user";

    public static Intent newInstnace(Context context, User user){
        Intent intent = new Intent(context, DisplayActivity.class);
        intent.putExtra(EXTRA_USER, user);
        return intent;
    }

    private AppCompatTextView mWelcomeMessage;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        mWelcomeMessage = (AppCompatTextView) findViewById(R.id.welcomeMessage);

        if(getIntent().hasExtra(EXTRA_USER)) {
            User user = (User) getIntent().getSerializableExtra(EXTRA_USER);
            mWelcomeMessage.setText(getString(R.string.welcome_message, user.getFirstName() +"  "+ user.getLastName()));
        }
    }
}
