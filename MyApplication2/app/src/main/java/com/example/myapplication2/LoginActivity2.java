package com.example.myapplication2;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.EditText;

import androidx.annotation.Nullable;

public class LoginActivity2 extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //控制登录图标大小
        EditText editText1=(EditText) findViewById(R.id.et_user_name);
        Drawable drawable1=getResources().getDrawable(R.drawable.user_name_icon);
        drawable1.setBounds(0,0,48,48);
    }
}
