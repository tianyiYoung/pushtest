package com.example.yuwan.pushtest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    private Button myButton = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myButton = (Button)findViewById(R.id.myButton);
        myButton.setOnClickListener((android.view.View.OnClickListener) new MyButtonListener());

        HMSAgentUtil.connect(this);
        HMSAgentUtil.getToken();
    }

    class MyButtonListener implements View.OnClickListener {
        public void onClick(View v){
            // 生成一个Intent对象
            Intent intent=new Intent();
            intent.putExtra("testIntent", "123");
            intent.setClass(MainActivity.this, OtherActivity.class); //设置跳转的Activity
            MainActivity.this.startActivity(intent);
        }
    }
}
