package com.alibaba.sdk.android.push.huawei;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import com.alibaba.sdk.android.push.register.ThirdPushManager;
import com.huawei.hms.push.RemoteMessage;
import com.taobao.accs.utl.ALog;
import p344t5.AbstractServiceC11227a;

/* loaded from: classes3.dex */
public class HuaweiPushMessageService extends AbstractServiceC11227a {
    private static final String TAG = "MPS:HuaWeiPushMessageService";

    @Override // p344t5.AbstractServiceC11227a, android.app.Service
    public IBinder onBind(Intent intent) {
        return super.onBind(intent);
    }

    @Override // p344t5.AbstractServiceC11227a
    public void onDeletedMessages() {
        super.onDeletedMessages();
    }

    @Override // p344t5.AbstractServiceC11227a, android.app.Service
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // p344t5.AbstractServiceC11227a
    public void onMessageReceived(RemoteMessage remoteMessage) {
        super.onMessageReceived(remoteMessage);
        try {
            String strM8662k = remoteMessage.m8662k();
            ALog.m10119i(TAG, "onPushMsg", "content", strM8662k);
            ThirdPushManager.onPushMsg(this, ThirdPushManager.ThirdPushReportKeyword.HUAWEI.thirdMsgKeyword, strM8662k);
        } catch (Throwable th) {
            ALog.m10117e(TAG, "onPushMsg", th, new Object[0]);
        }
    }

    @Override // p344t5.AbstractServiceC11227a
    public void onMessageSent(String str) {
        super.onMessageSent(str);
    }

    @Override // p344t5.AbstractServiceC11227a
    public void onNewToken(String str) {
        super.onNewToken(str);
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            ALog.m10119i(TAG, "onToken", "token", str);
            ThirdPushManager.reportToken(this, ThirdPushManager.ThirdPushReportKeyword.HUAWEI.thirdTokenKeyword, str, BuildConfig.HW_VERSION);
        } catch (Throwable th) {
            ALog.m10117e(TAG, "onToken", th, new Object[0]);
        }
    }

    @Override // p344t5.AbstractServiceC11227a
    public void onSendError(String str, Exception exc) {
        super.onSendError(str, exc);
    }

    @Override // p344t5.AbstractServiceC11227a, android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        return super.onStartCommand(intent, i10, i11);
    }

    @Override // p344t5.AbstractServiceC11227a
    public void onTokenError(Exception exc) {
        super.onTokenError(exc);
        ALog.m10117e(TAG, "onTokenError", exc, new Object[0]);
    }

    @Override // p344t5.AbstractServiceC11227a
    public void onTokenError(Exception exc, Bundle bundle) {
        super.onTokenError(exc, bundle);
        ALog.m10117e(TAG, "onTokenError", exc, new Object[0]);
    }

    @Override // p344t5.AbstractServiceC11227a
    public void onNewToken(String str, Bundle bundle) {
        super.onNewToken(str, bundle);
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            ALog.m10119i(TAG, "onToken", "token", str);
            ThirdPushManager.reportToken(this, ThirdPushManager.ThirdPushReportKeyword.HUAWEI.thirdTokenKeyword, str, BuildConfig.HW_VERSION);
        } catch (Throwable th) {
            ALog.m10117e(TAG, "onToken", th, new Object[0]);
        }
    }
}
