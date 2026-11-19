package com.taobao.accs.client;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.net.ConnectivityManager;
import android.text.TextUtils;
import com.taobao.accs.ILoginInfo;
import com.taobao.accs.base.AccsAbstractDataListener;
import com.taobao.accs.common.ThreadPoolExecutorFactory;
import com.taobao.accs.utl.ALog;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.android.agoo.common.AgooConstants;

/* loaded from: classes5.dex */
public class GlobalClientInfo {
    public static final String AGOO_SERVICE_ID = "agooSend";

    /* renamed from: a */
    public static Context f12903a;

    /* renamed from: b */
    public static String f12904b;

    /* renamed from: c */
    private static volatile GlobalClientInfo f12905c;

    /* renamed from: h */
    private static final Map<String, String> f12906h;

    /* renamed from: d */
    private ConcurrentHashMap<String, ILoginInfo> f12907d;

    /* renamed from: e */
    private ActivityManager f12908e;

    /* renamed from: f */
    private ConnectivityManager f12909f;

    /* renamed from: g */
    private PackageInfo f12910g;

    /* renamed from: i */
    private final Map<String, AccsAbstractDataListener> f12911i = new ConcurrentHashMap();

    static {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        f12906h = concurrentHashMap;
        concurrentHashMap.put(AGOO_SERVICE_ID, "org.android.agoo.accs.AgooService");
        concurrentHashMap.put(AgooConstants.AGOO_SERVICE_AGOOACK, "org.android.agoo.accs.AgooService");
        concurrentHashMap.put("agooTokenReport", "org.android.agoo.accs.AgooService");
    }

    private GlobalClientInfo(Context context) {
        if (context == null) {
            throw new RuntimeException("Context is null!!");
        }
        if (f12903a == null) {
            f12903a = context.getApplicationContext();
        }
        ThreadPoolExecutorFactory.execute(new RunnableC7615d(this));
    }

    public static Context getContext() {
        return f12903a;
    }

    public static GlobalClientInfo getInstance(Context context) {
        if (f12905c == null) {
            synchronized (GlobalClientInfo.class) {
                try {
                    if (f12905c == null) {
                        f12905c = new GlobalClientInfo(context);
                    }
                } finally {
                }
            }
        }
        return f12905c;
    }

    public void clearLoginInfoImpl() {
        this.f12907d = null;
    }

    public ActivityManager getActivityManager() {
        if (this.f12908e == null) {
            this.f12908e = (ActivityManager) f12903a.getSystemService(AgooConstants.OPEN_ACTIIVTY_NAME);
        }
        return this.f12908e;
    }

    public ConnectivityManager getConnectivityManager() {
        if (this.f12909f == null) {
            this.f12909f = (ConnectivityManager) f12903a.getSystemService("connectivity");
        }
        return this.f12909f;
    }

    public AccsAbstractDataListener getListener(String str) {
        return this.f12911i.get(str);
    }

    public String getNick(String str) {
        ILoginInfo iLoginInfo;
        ConcurrentHashMap<String, ILoginInfo> concurrentHashMap = this.f12907d;
        if (concurrentHashMap == null || (iLoginInfo = concurrentHashMap.get(str)) == null) {
            return null;
        }
        return iLoginInfo.getNick();
    }

    public PackageInfo getPackageInfo() {
        try {
            if (this.f12910g == null) {
                this.f12910g = f12903a.getPackageManager().getPackageInfo(f12903a.getPackageName(), 0);
            }
        } catch (Throwable th) {
            ALog.m10117e("GlobalClientInfo", "getPackageInfo", th, new Object[0]);
        }
        return this.f12910g;
    }

    public String getService(String str) {
        return f12906h.get(str);
    }

    public String getSid(String str) {
        ILoginInfo iLoginInfo;
        ConcurrentHashMap<String, ILoginInfo> concurrentHashMap = this.f12907d;
        if (concurrentHashMap == null || (iLoginInfo = concurrentHashMap.get(str)) == null) {
            return null;
        }
        return iLoginInfo.getSid();
    }

    public String getUserId(String str) {
        ILoginInfo iLoginInfo;
        ConcurrentHashMap<String, ILoginInfo> concurrentHashMap = this.f12907d;
        if (concurrentHashMap == null || (iLoginInfo = concurrentHashMap.get(str)) == null) {
            return null;
        }
        return iLoginInfo.getUserId();
    }

    public void registerListener(String str, AccsAbstractDataListener accsAbstractDataListener) {
        if (TextUtils.isEmpty(str) || accsAbstractDataListener == null) {
            return;
        }
        this.f12911i.put(str, accsAbstractDataListener);
    }

    public void registerService(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        f12906h.put(str, str2);
    }

    public void setLoginInfoImpl(String str, ILoginInfo iLoginInfo) {
        if (this.f12907d == null) {
            this.f12907d = new ConcurrentHashMap<>(1);
        }
        if (iLoginInfo != null) {
            this.f12907d.put(str, iLoginInfo);
        }
    }

    public void unRegisterService(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        f12906h.remove(str);
    }

    public void unregisterListener(String str) {
        this.f12911i.remove(str);
    }
}
