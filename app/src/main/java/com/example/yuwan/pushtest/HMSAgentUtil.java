package com.example.yuwan.pushtest;

import android.app.Activity;
import android.util.Log;

import com.huawei.android.hms.agent.HMSAgent;
import com.huawei.android.hms.agent.common.handler.ConnectHandler;
import com.huawei.android.hms.agent.push.handler.GetTokenHandler;

/**
 * Created by YuWan on 2018/4/8.
 */

public class HMSAgentUtil {
    public static void connect(Activity act) {
        HMSAgent.connect(act, new ConnectHandler(){
            @Override
            public void onConnect(int rst) {
                Log.i(util.LOG_TAG, "HMS connect end:" + rst);
            }
        });
    }

    public static void getToken(){
        Log.i(util.LOG_TAG, "getToken:begin");
        HMSAgent.Push.getToken(new GetTokenHandler() {
            @Override
            public void onResult(int rst) {
                Log.i(util.LOG_TAG,"get token:end" + rst);
            }
        });
    }
}
