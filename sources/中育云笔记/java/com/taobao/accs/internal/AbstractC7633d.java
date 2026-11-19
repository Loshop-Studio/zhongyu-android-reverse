package com.taobao.accs.internal;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.text.TextUtils;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.taobao.accs.AccsClientConfig;
import com.taobao.accs.base.IBaseService;
import com.taobao.accs.common.Constants;
import com.taobao.accs.net.AbstractC7642b;
import com.taobao.accs.net.C7663w;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.UtilityImpl;
import com.taobao.accs.utl.Utils;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.taobao.accs.internal.d */
/* loaded from: classes5.dex */
public abstract class AbstractC7633d implements IBaseService {

    /* renamed from: a */
    protected static ConcurrentHashMap<String, AbstractC7642b> f13025a = new ConcurrentHashMap<>(2);

    /* renamed from: b */
    private Context f13026b;

    /* renamed from: c */
    private Service f13027c;

    public AbstractC7633d(Service service) {
        this.f13027c = service;
        this.f13026b = service.getApplicationContext();
    }

    /* renamed from: a */
    private void m9996a(boolean z10) {
        for (String str : AccsClientConfig.tags()) {
            try {
                if (!AccsClientConfig.getConfigByTag(str).getDisableChannel()) {
                    m9995a(this.f13026b, str, z10);
                }
            } catch (Throwable th) {
                ALog.m10121w("ElectionServiceImpl", "tryStartAllConnections " + str, th, new Object[0]);
            }
        }
    }

    /* renamed from: b */
    private void m9997b(Intent intent) {
        try {
            String stringExtra = intent.getStringExtra(Constants.KEY_PACKAGE_NAME);
            String stringExtra2 = intent.getStringExtra(Constants.KEY_APP_KEY);
            String stringExtra3 = intent.getStringExtra(Constants.KEY_TTID);
            String stringExtra4 = intent.getStringExtra("app_sercet");
            String stringExtra5 = intent.getStringExtra(Constants.KEY_CONFIG_TAG);
            int intExtra = intent.getIntExtra(Constants.KEY_MODE, 0);
            ALog.m10119i("ElectionServiceImpl", "handleStartCommand", Constants.KEY_CONFIG_TAG, stringExtra5, "appkey", stringExtra2, "appSecret", stringExtra4, Constants.KEY_TTID, stringExtra3, "pkg", stringExtra);
            if (TextUtils.isEmpty(stringExtra) || TextUtils.isEmpty(stringExtra2) || !stringExtra.equals(this.f13026b.getPackageName())) {
                return;
            }
            Utils.setMode(intExtra);
            AbstractC7642b abstractC7642bM9995a = m9995a(this.f13026b, stringExtra5, false);
            if (abstractC7642bM9995a != null) {
                abstractC7642bM9995a.f13052a = stringExtra3;
            } else {
                ALog.m10118e("ElectionServiceImpl", "handleStartCommand start action, no connection", Constants.KEY_CONFIG_TAG, stringExtra5);
            }
            UtilityImpl.m10152e(this.f13026b, stringExtra2);
        } catch (Throwable th) {
            ALog.m10117e("ElectionServiceImpl", "handleStartCommand", th, new Object[0]);
        }
    }

    /* renamed from: a */
    public abstract int mo9994a(Intent intent);

    @Override // com.taobao.accs.base.IBaseService
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // com.taobao.accs.base.IBaseService
    public void onCreate() {
        ALog.m10119i("ElectionServiceImpl", "onCreate,", Constants.KEY_SDK_VERSION, Integer.valueOf(Constants.SDK_VERSION_CODE));
    }

    @Override // com.taobao.accs.base.IBaseService
    public void onDestroy() {
        ALog.m10118e("ElectionServiceImpl", "Service onDestroy", new Object[0]);
        this.f13026b = null;
        this.f13027c = null;
    }

    @Override // com.taobao.accs.base.IBaseService
    public int onStartCommand(Intent intent, int i10, int i11) {
        if (intent == null) {
            return 2;
        }
        String action = intent.getAction();
        ALog.m10119i("ElectionServiceImpl", "onStartCommand begin", "action", action);
        if (TextUtils.equals(action, Constants.ACTION_START_SERVICE)) {
            m9997b(intent);
        } else if (TextUtils.isEmpty(action)) {
            m9996a(true);
        } else {
            m9996a(false);
        }
        return mo9994a(intent);
    }

    @Override // com.taobao.accs.base.IBaseService
    public boolean onUnbind(Intent intent) {
        return false;
    }

    /* renamed from: a */
    public static AbstractC7642b m9995a(Context context, String str, boolean z10) {
        AbstractC7642b abstractC7642b = null;
        try {
            if (!TextUtils.isEmpty(str)) {
                ALog.m10119i("ElectionServiceImpl", "getConnection", Constants.KEY_CONFIG_TAG, str, "start", Boolean.valueOf(z10));
                AccsClientConfig configByTag = AccsClientConfig.getConfigByTag(str);
                if (configByTag != null && configByTag.getDisableChannel()) {
                    ALog.m10118e("ElectionServiceImpl", "getConnection channel disabled!", Constants.KEY_CONFIG_TAG, str);
                    return null;
                }
                int mode = Utils.getMode();
                String str2 = str + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + mode;
                AbstractC7642b abstractC7642b2 = f13025a.get(str2);
                if (abstractC7642b2 != null) {
                    return abstractC7642b2;
                }
                try {
                    AccsClientConfig.mEnv = mode;
                    C7663w c7663w = new C7663w(context, 0, str);
                    if (z10) {
                        c7663w.mo10015a();
                    }
                    if (f13025a.size() < 10) {
                        f13025a.put(str2, c7663w);
                        return c7663w;
                    }
                    ALog.m10118e("ElectionServiceImpl", "getConnection fail as exist too many conns!!!", new Object[0]);
                    return c7663w;
                } catch (Throwable th) {
                    th = th;
                    abstractC7642b = abstractC7642b2;
                    ALog.m10117e("ElectionServiceImpl", "getConnection", th, new Object[0]);
                    return abstractC7642b;
                }
            }
            ALog.m10122w("ElectionServiceImpl", "getConnection configTag null or env invalid", "conns.size", Integer.valueOf(f13025a.size()));
            if (f13025a.size() > 0) {
                return f13025a.elements().nextElement();
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
