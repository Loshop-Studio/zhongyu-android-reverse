package com.taobao.accs.data;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.Messenger;
import android.text.TextUtils;
import com.taobao.accs.common.Constants;
import com.taobao.accs.common.ThreadPoolExecutorFactory;
import com.taobao.accs.utl.ALog;

/* loaded from: classes5.dex */
public class MsgDistributeService extends Service {

    /* renamed from: a */
    private Messenger f12972a = new Messenger(new HandlerC7628i(this));

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f12972a.getBinder();
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
    public int onStartCommand(Intent intent, int i10, int i11) {
        try {
            ALog.m10119i("MsgDistributeService", "onStartCommand", "action", intent.getAction());
            if (TextUtils.isEmpty(intent.getAction()) || !TextUtils.equals(intent.getAction(), Constants.ACTION_SEND)) {
                ALog.m10119i("MsgDistributeService", "onStartCommand distribute message", new Object[0]);
                C7626g.m9961a(getApplicationContext(), intent);
            } else {
                if (getPackageName().equals(intent.getStringExtra(Constants.KEY_PACKAGE_NAME))) {
                    ThreadPoolExecutorFactory.getScheduledExecutor().execute(new RunnableC7629j(this, intent));
                }
            }
            return 2;
        } catch (Throwable th) {
            ALog.m10117e("MsgDistributeService", "onStartCommand", th, new Object[0]);
            return 2;
        }
    }
}
