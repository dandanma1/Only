package com.example.only;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddFriendActivity extends AppCompatActivity {
    private EditText et_friend_number;
    private Button but_sure;
    private Button but_cancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_friend);
        init();
        hasAddFriendSuccess();

    }
/**
 * 确认添加朋友身份是否成功
 */
    private void hasAddFriendSuccess() {
        but_sure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Long friendNumber =0L;
                friendNumber =  Long.parseLong(et_friend_number.getText().toString());
                Log.d("number=====",et_friend_number+"");
                if (friendNumber == 11223344551L){
                    Toast.makeText(AddFriendActivity.this,"添加好友成功",Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(AddFriendActivity.this, TalkingActivity.class);
                    startActivity(i);
                    finish();
                }else {
                    Toast.makeText(AddFriendActivity.this,"没有这个手机号",Toast.LENGTH_SHORT).show();
                }

            }
        });

        but_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(AddFriendActivity.this, "请添加好友", Toast.LENGTH_SHORT).show();
            }
        });

    }

    private void init() {
        et_friend_number = (EditText) findViewById(R.id.et_phone);
        but_sure = (Button) findViewById(R.id.but_sure);
        but_cancel = (Button) findViewById(R.id.but_cancel);
    }

}
