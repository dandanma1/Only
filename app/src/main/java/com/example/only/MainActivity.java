package com.example.only;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static java.lang.Integer.getInteger;
import static java.lang.Long.getLong;

public class MainActivity extends AppCompatActivity {
    private EditText et_number;
    private EditText et_password;
    private Button but_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        but_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Long number =0L;
                String password = null;
                number = getLong (et_number.getText().toString());
                password = et_number.getText().toString();
                if (number == 12345678912L && password.equals("abc123")){
                    Toast.makeText(MainActivity.this,"登录成功",Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(MainActivity.this,"登录失败",Toast.LENGTH_SHORT).show();
                }
            }
        });



    }
/**
 * 判断用户名密码是否正确，正确登录成功，错误登录失败
 //* @param  number
 //* @param  password
 *
    private void login(long number, String password) {
        number = getLong (et_number.getText().toString());
        password = et_number.getText().toString();
        if (number == 12345678912L && password.equals("abc123"));

    }*/

    //初始化
    public void init(){
        et_number = (EditText) findViewById(R.id.number);
        et_password = (EditText) findViewById(R.id.password);
        but_login = (Button) findViewById(R.id.login);
    }

}
