package com.aliyun.ams.emas.push;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.Messenger;
import android.text.TextUtils;
import com.taobao.accs.utl.ALog;
import org.json.JSONException;

/* loaded from: classes.dex */
public abstract class AgooMessageIntentService extends Service implements InterfaceC1194b, InterfaceC1195c {
    private static final String TAG = "MPS:AliyunMessageIntentService";
    private Messenger messenger = new Messenger(new HandlerC1197e(this));

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.messenger.getBinder();
    }

    protected void onHandleIntent(Intent intent) throws JSONException {
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            ALog.m6092e(TAG, "Action is null, return.", new Object[0]);
            return;
        }
        ALog.m6090d(TAG, "AgooMessageIntentService onHandleIntent action: " + action, new Object[0]);
        if ("com.alibaba.sdk.android.push.RECEIVE".equals(action)) {
            C1198f.m5379b(getApplicationContext(), intent, this, this);
            return;
        }
        if (AgooMessageReceiver.NOTIFICATION_OPENED_ACTION.equals(action)) {
            C1198f.m5378a(getApplicationContext(), intent, this);
        } else if (AgooMessageReceiver.NOTIFICATION_REMOVED_ACTION.equals(action)) {
            C1198f.m5382e(getApplicationContext(), intent, this);
        } else {
            ALog.m6092e(TAG, "Invalid action", new Object[0]);
        }
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i4, int i5) {
        onHandleIntent(intent);
        return 2;
    }
}
