package com.example.yuwan.pushtest.flyme;

import android.content.Context;
import android.util.Log;

import com.example.yuwan.pushtest.util;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.MzPushMessageReceiver;
import com.meizu.cloud.pushsdk.notification.PushNotificationBuilder;
import com.meizu.cloud.pushsdk.platform.message.PushSwitchStatus;
import com.meizu.cloud.pushsdk.platform.message.RegisterStatus;
import com.meizu.cloud.pushsdk.platform.message.SubAliasStatus;
import com.meizu.cloud.pushsdk.platform.message.SubTagsStatus;
import com.meizu.cloud.pushsdk.platform.message.UnRegisterStatus;

/**
 * Created by YuWan on 2018/4/13.
 */

public class FlyemePushReceiver extends MzPushMessageReceiver {
    @Override
    @Deprecated
    public void onRegister(Context context, String pushid) {
        //应用在接受返回的pushid
    }

    @Override
    public void onMessage(Context context, String s) {
        //接收服务器推送的消息
    }

    @Override
    @Deprecated
    public void onUnRegister(Context context, boolean b) {
        //调用PushManager.unRegister(context）方法后，会在此回调反注册状态
    }

    //设置通知栏小图标
    /*@Override
    public PushNotificationBuilder onUpdateNotificationBuilder(PushNotificationBuilder pushNotificationBuilder) {
        pushNotificationBuilder.setmStatusbarIcon(R.drawable.mz_push_notification_small_icon);
    }*/

    @Override
    public void onPushStatus(Context context,PushSwitchStatus pushSwitchStatus) {
        //检查通知栏和透传消息开关状态回调
    }

    @Override
    public void onRegisterStatus(Context context,RegisterStatus registerStatus) {
        Log.i(util.LOG_TAG, "onRegisterStatus " + registerStatus);
        //新版订阅回调
    }

    @Override
    public void onUnRegisterStatus(Context context,UnRegisterStatus unRegisterStatus) {
        Log.i(util.LOG_TAG,"onUnRegisterStatus "+unRegisterStatus);
        //新版反订阅回调
    }

    @Override
    public void onSubTagsStatus(Context context,SubTagsStatus subTagsStatus) {
        Log.i(util.LOG_TAG, "onSubTagsStatus " + subTagsStatus);
        //标签回调
    }

    @Override
    public void onSubAliasStatus(Context context,SubAliasStatus subAliasStatus) {
        Log.i(util.LOG_TAG, "onSubAliasStatus " + subAliasStatus);
        //别名回调
    }
    public void onNotificationArrived(Context context, String title, String content, String selfDefineContentString) {
        //通知栏消息到达回调
        DebugLogger.i(util.LOG_TAG,"onNotificationArrived title "+title + "content "+content + " selfDefineContentString "+selfDefineContentString);
    }

    public void onNotificationClicked(Context context, String title, String content, String selfDefineContentString) {
        //通知栏消息点击回调
        DebugLogger.i(util.LOG_TAG,"onNotificationClicked title "+title + "content "+content + " selfDefineContentString "+selfDefineContentString);
    }
    
    public void onNotificationDeleted(Context context, String title, String content, String selfDefineContentString) {
        //通知栏消息删除回调；flyme6以上不再回调
        DebugLogger.i(util.LOG_TAG,"onNotificationDeleted title "+title + "content "+content + " selfDefineContentString "+selfDefineContentString);
    }

}