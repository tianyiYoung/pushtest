package com.example.yuwan.pushtest;

import android.app.Application;

import com.huawei.android.hms.agent.HMSAgent;

/**
 * Created by YuWan on 2018/4/8.
 */

public class MyApplication extends Application {
    @Override
    public void onCreate(){
        super.onCreate();
        HMSAgent.init(this);
    }
}
