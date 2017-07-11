package com.example.only;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener{
    private EditText mEditTextNumber;
    private EditText mEditTextPassword;
    private Button mButtonRegister;
    private Button mButtonCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        init();
        mButtonRegister.setOnClickListener(this);
        mButtonCancel.setOnClickListener(this);


    }

    //初始化
    public void init() {
        mEditTextNumber = (EditText) findViewById(R.id.number);
        mEditTextPassword = (EditText) findViewById(R.id.password);
        mButtonRegister = (Button) findViewById(R.id.but_login);
        mButtonCancel = (Button) findViewById(R.id.but_cancel);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
/*            //判断用户名密码是否正确，正确登录成功，错误登录失败
            case R.id.login:{
                Long number = 0L;
                String password = null;
                String strNumber =mEditTextNumber.getText().toString();
                number = Long.parseLong(strNumber);

                password = mEditTextPassword.getText().toString();
                int lengthNumber = strNumber.length();
//判断用户名、密码大小、类型、服务端代码存储
                //http://blog.csdn.net/jdsjlzx/article/details/41441147
                if (lengthNumber == 11 && 4<=password.length()) {
                    Toast.makeText(RegisterActivity.this, "注册成功", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(RegisterActivity.this, AddFriendActivity.class);
                    startActivity(i);
                    finish();
                } else {
                    Toast.makeText(RegisterActivity.this, "注册失败", Toast.LENGTH_SHORT).show();
                }

            }
            //点击注册按钮，跳注册页面
            case R.id.but_register:{
                Intent i = new Intent(MainActivity.this, RegisterActivity.class);
                startActivity(i);
                finish();

            }*/
        }
    }
}