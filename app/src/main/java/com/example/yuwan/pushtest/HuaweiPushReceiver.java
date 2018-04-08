package com.example.yuwan.pushtest;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;

import com.huawei.hms.support.api.push.PushReceiver;

/**
 * Created by YuWan on 2018/4/8.
 */

public class HuaweiPushReceiver extends PushReceiver {
    @Override
    public void onToken(Context context, String token, Bundle extras){
        Log.i(util.LOG_TAG, "onToken: token is " + token);
        util.HClient(token);
    }
    @Override
    public boolean onPushMsg(Context context,byte[] msg,Bundle bundle){
        try{
            String content = new String(msg,"UTF-8");
            Log.i(util.LOG_TAG,"收到PUSH透传消息，消息内容为：" + content);
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }
    /*@Override
    public void onEvent(Context context,Event event,Bundle extras){

    }
    @Override
    public void onPushState(Context context,boolean pushState){

    }*/
}

