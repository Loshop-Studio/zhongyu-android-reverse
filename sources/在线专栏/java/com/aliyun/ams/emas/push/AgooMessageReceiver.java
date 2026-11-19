package com.aliyun.ams.emas.push;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.taobao.accs.utl.ALog;

/* loaded from: classes.dex */
public abstract class AgooMessageReceiver extends BroadcastReceiver implements InterfaceC1194b, InterfaceC1195c {
    public static final String EXTRA_MAP = "extraMap";
    public static final String MESSAGE_ID = "messageId";
    public static final String NOTIFICATION_GROUP = "group";
    public static final String NOTIFICATION_ID = "notificationId";
    public static final String NOTIFICATION_OPENED_ACTION = "com.alibaba.push2.action.NOTIFICATION_OPENED";
    public static final String NOTIFICATION_OPEN_TYPE = "notificationOpenType";
    public static final String NOTIFICATION_REMOVED_ACTION = "com.alibaba.push2.action.NOTIFICATION_REMOVED";
    public static final String SUMMARY = "summary";
    public static final String TAG = "MPS:AgooMessageReceiver";
    public static final String TITLE = "title";

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        ALog.m6090d(TAG, "AgooMessageReceiver onReceive begin...intent=" + intent, new Object[0]);
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            return;
        }
        try {
            if (TextUtils.equals("com.alibaba.sdk.android.push.RECEIVE", action)) {
                C1198f.m5379b(context, intent, this, this);
            } else if (TextUtils.equals(NOTIFICATION_OPENED_ACTION, action)) {
                C1198f.m5378a(context, intent, this);
            } else if (TextUtils.equals(NOTIFICATION_REMOVED_ACTION, action)) {
                C1198f.m5382e(context, intent, this);
            }
        } catch (Throwable th) {
            ALog.m6091e(TAG, "handle action error:", th, new Object[0]);
        }
    }
}
