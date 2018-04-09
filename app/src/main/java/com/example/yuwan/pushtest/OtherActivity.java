package com.example.yuwan.pushtest;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

/**
 * Created by YuWan on 2018/4/8.
 */

public class OtherActivity extends Activity {
    private TextView myTextView = null;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.other);
        Intent intent=getIntent();
        if (intent == null)
            return;
        Uri uri = intent.getData();
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        //String value=intent.getStringExtra("testIntent");
        String value = uri.getQueryParameter("testIntent");
        myTextView=(TextView)findViewById(R.id.myTextView);
        myTextView.setText(value);

        /*Intent intent1 = new Intent(Intent.ACTION_VIEW);
        intent1.setData(Uri.parse("push://com.example.yuwan.pushtest.otheractivity?testIntent=test"));
        intent1.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        String intentUri = intent1.toUri(Intent.URI_INTENT_SCHEME);
        Log.d("intentUri", intentUri);*/
    }
}
