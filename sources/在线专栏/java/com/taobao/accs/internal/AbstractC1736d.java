package com.taobao.accs.internal;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.text.TextUtils;
import com.taobao.accs.AccsClientConfig;
import com.taobao.accs.base.IBaseService;
import com.taobao.accs.common.Constants;
import com.taobao.accs.net.AbstractC1745b;
import com.taobao.accs.net.C1766w;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.UtilityImpl;
import com.taobao.accs.utl.Utils;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.taobao.accs.internal.d */
/* loaded from: classes.dex */
public abstract class AbstractC1736d implements IBaseService {

    /* renamed from: a */
    protected static ConcurrentHashMap<String, AbstractC1745b> f7627a = new ConcurrentHashMap<>(2);

    /* renamed from: b */
    private Context f7628b;

    /* renamed from: c */
    private Service f7629c;

    public AbstractC1736d(Service service) {
        this.f7629c = service;
        this.f7628b = service.getApplicationContext();
    }

    /* renamed from: a */
    private void m5970a(boolean z3) {
        for (String str : AccsClientConfig.tags()) {
            try {
                if (!AccsClientConfig.getConfigByTag(str).getDisableChannel()) {
                    m5969a(this.f7628b, str, z3);
                }
            } catch (Throwable th) {
                ALog.m6095w("ElectionServiceImpl", "tryStartAllConnections " + str, th, new Object[0]);
            }
        }
    }

    /* renamed from: b */
    private void m5971b(Intent intent) {
        try {
            String stringExtra = intent.getStringExtra(Constants.KEY_PACKAGE_NAME);
            String stringExtra2 = intent.getStringExtra(Constants.KEY_APP_KEY);
            String stringExtra3 = intent.getStringExtra(Constants.KEY_TTID);
            String stringExtra4 = intent.getStringExtra("app_sercet");
            String stringExtra5 = intent.getStringExtra(Constants.KEY_CONFIG_TAG);
            int intExtra = intent.getIntExtra(Constants.KEY_MODE, 0);
            ALog.m6093i("ElectionServiceImpl", "handleStartCommand", Constants.KEY_CONFIG_TAG, stringExtra5, "appkey", stringExtra2, "appSecret", stringExtra4, Constants.KEY_TTID, stringExtra3, "pkg", stringExtra);
            if (TextUtils.isEmpty(stringExtra) || TextUtils.isEmpty(stringExtra2) || !stringExtra.equals(this.f7628b.getPackageName())) {
                return;
            }
            Utils.setMode(intExtra);
            AbstractC1745b abstractC1745bM5969a = m5969a(this.f7628b, stringExtra5, false);
            if (abstractC1745bM5969a != null) {
                abstractC1745bM5969a.f7654a = stringExtra3;
            } else {
                ALog.m6092e("ElectionServiceImpl", "handleStartCommand start action, no connection", Constants.KEY_CONFIG_TAG, stringExtra5);
            }
            UtilityImpl.m6126e(this.f7628b, stringExtra2);
        } catch (Throwable th) {
            ALog.m6091e("ElectionServiceImpl", "handleStartCommand", th, new Object[0]);
        }
    }

    /* renamed from: a */
    public abstract int mo5968a(Intent intent);

    @Override // com.taobao.accs.base.IBaseService
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // com.taobao.accs.base.IBaseService
    public void onCreate() {
        ALog.m6093i("ElectionServiceImpl", "onCreate,", Constants.KEY_SDK_VERSION, Integer.valueOf(Constants.SDK_VERSION_CODE));
    }

    @Override // com.taobao.accs.base.IBaseService
    public void onDestroy() {
        ALog.m6092e("ElectionServiceImpl", "Service onDestroy", new Object[0]);
        this.f7628b = null;
        this.f7629c = null;
    }

    @Override // com.taobao.accs.base.IBaseService
    public int onStartCommand(Intent intent, int i4, int i5) {
        if (intent == null) {
            return 2;
        }
        String action = intent.getAction();
        ALog.m6093i("ElectionServiceImpl", "onStartCommand begin", "action", action);
        if (TextUtils.equals(action, Constants.ACTION_START_SERVICE)) {
            m5971b(intent);
        } else if (TextUtils.isEmpty(action)) {
            m5970a(true);
        } else {
            m5970a(false);
        }
        return mo5968a(intent);
    }

    @Override // com.taobao.accs.base.IBaseService
    public boolean onUnbind(Intent intent) {
        return false;
    }

    /* renamed from: a */
    protected static AbstractC1745b m5969a(Context context, String str, boolean z3) {
        AbstractC1745b c1766w = null;
        try {
        } catch (Throwable th) {
            th = th;
        }
        if (TextUtils.isEmpty(str)) {
            ALog.m6096w("ElectionServiceImpl", "getConnection configTag null or env invalid", "conns.size", Integer.valueOf(f7627a.size()));
            if (f7627a.size() > 0) {
                return f7627a.elements().nextElement();
            }
            return null;
        }
        ALog.m6093i("ElectionServiceImpl", "getConnection", Constants.KEY_CONFIG_TAG, str, "start", Boolean.valueOf(z3));
        AccsClientConfig configByTag = AccsClientConfig.getConfigByTag(str);
        if (configByTag != null && configByTag.getDisableChannel()) {
            ALog.m6092e("ElectionServiceImpl", "getConnection channel disabled!", Constants.KEY_CONFIG_TAG, str);
            return null;
        }
        int mode = Utils.getMode();
        String str2 = str + "|" + mode;
        AbstractC1745b abstractC1745b = f7627a.get(str2);
        if (abstractC1745b != null) {
            return abstractC1745b;
        }
        try {
            AccsClientConfig.mEnv = mode;
            c1766w = new C1766w(context, 0, str);
            if (z3) {
                c1766w.mo5989a();
            }
            if (f7627a.size() < 10) {
                f7627a.put(str2, c1766w);
            } else {
                ALog.m6092e("ElectionServiceImpl", "getConnection fail as exist too many conns!!!", new Object[0]);
            }
        } catch (Throwable th2) {
            th = th2;
            c1766w = abstractC1745b;
            ALog.m6091e("ElectionServiceImpl", "getConnection", th, new Object[0]);
            return c1766w;
        }
        return c1766w;
    }
}
