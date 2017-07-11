package com.example.only;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static java.lang.Integer.getInteger;
import static java.lang.Long.getLong;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText mEditTextNumber;
    private EditText mEditTextPassword;
    private Button mButtonLogin;
    private Button mButtonRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        mButtonLogin.setOnClickListener(this);
        mButtonRegister.setOnClickListener(this);


    }

        //初始化
    public void init() {
        mEditTextNumber = (EditText) findViewById(R.id.number);
        mEditTextPassword = (EditText) findViewById(R.id.password);
        mButtonLogin = (Button) findViewById(R.id.but_login);
        mButtonRegister = (Button) findViewById(R.id.but_register);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            //判断用户名密码是否正确，正确登录成功，错误登录失败
            case R.id.login:{
                    Long number = 0L;
                    String password = null;
                    number = Long.parseLong(mEditTextNumber.getText().toString());
                    Log.d("number=====", number + "");
                    password = mEditTextPassword.getText().toString();
                    Log.d("password=====", password);
                    if (number == 12345678912L && password.equals("abc123")) {
                        Toast.makeText(MainActivity.this, "登录成功", Toast.LENGTH_SHORT).show();
                        Intent i = new Intent(MainActivity.this, AddFriendActivity.class);
                        startActivity(i);
                        finish();
                    } else {
                        Toast.makeText(MainActivity.this, "登录失败", Toast.LENGTH_SHORT).show();
                    }

                }
            //点击注册按钮，跳注册页面
            case R.id.but_register:{
                Intent i = new Intent(MainActivity.this, RegisterActivity.class);
                startActivity(i);
                finish();

            }
        }
    }
}