package com.taobao.accs.data;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.Messenger;
import android.text.TextUtils;
import com.taobao.accs.common.Constants;
import com.taobao.accs.common.ThreadPoolExecutorFactory;
import com.taobao.accs.utl.ALog;

/* loaded from: classes.dex */
public class MsgDistributeService extends Service {

    /* renamed from: a */
    private Messenger f7574a = new Messenger(new HandlerC1731i(this));

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f7574a.getBinder();
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i4, int i5) {
        try {
            ALog.m6093i("MsgDistributeService", "onStartCommand", "action", intent.getAction());
            if (TextUtils.isEmpty(intent.getAction()) || !TextUtils.equals(intent.getAction(), Constants.ACTION_SEND)) {
                ALog.m6093i("MsgDistributeService", "onStartCommand distribute message", new Object[0]);
                C1729g.m5935a(getApplicationContext(), intent);
            } else if (getPackageName().equals(intent.getStringExtra(Constants.KEY_PACKAGE_NAME))) {
                ThreadPoolExecutorFactory.getScheduledExecutor().execute(new RunnableC1732j(this, intent));
            }
        } catch (Throwable th) {
            ALog.m6091e("MsgDistributeService", "onStartCommand", th, new Object[0]);
        }
        return 2;
    }
}
