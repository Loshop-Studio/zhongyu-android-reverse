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

/* loaded from: classes.dex */
public class GlobalClientInfo {
    public static final String AGOO_SERVICE_ID = "agooSend";

    /* renamed from: a */
    public static Context f7505a;

    /* renamed from: b */
    public static String f7506b;

    /* renamed from: c */
    private static volatile GlobalClientInfo f7507c;

    /* renamed from: h */
    private static final Map<String, String> f7508h;

    /* renamed from: d */
    private ConcurrentHashMap<String, ILoginInfo> f7509d;

    /* renamed from: e */
    private ActivityManager f7510e;

    /* renamed from: f */
    private ConnectivityManager f7511f;

    /* renamed from: g */
    private PackageInfo f7512g;

    /* renamed from: i */
    private final Map<String, AccsAbstractDataListener> f7513i = new ConcurrentHashMap();

    static {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        f7508h = concurrentHashMap;
        concurrentHashMap.put(AGOO_SERVICE_ID, "org.android.agoo.accs.AgooService");
        concurrentHashMap.put(AgooConstants.AGOO_SERVICE_AGOOACK, "org.android.agoo.accs.AgooService");
        concurrentHashMap.put("agooTokenReport", "org.android.agoo.accs.AgooService");
    }

    private GlobalClientInfo(Context context) {
        if (context == null) {
            throw new RuntimeException("Context is null!!");
        }
        if (f7505a == null) {
            f7505a = context.getApplicationContext();
        }
        ThreadPoolExecutorFactory.execute(new RunnableC1718d(this));
    }

    public static Context getContext() {
        return f7505a;
    }

    public static GlobalClientInfo getInstance(Context context) {
        if (f7507c == null) {
            synchronized (GlobalClientInfo.class) {
                if (f7507c == null) {
                    f7507c = new GlobalClientInfo(context);
                }
            }
        }
        return f7507c;
    }

    public void clearLoginInfoImpl() {
        this.f7509d = null;
    }

    public ActivityManager getActivityManager() {
        if (this.f7510e == null) {
            this.f7510e = (ActivityManager) f7505a.getSystemService(AgooConstants.OPEN_ACTIIVTY_NAME);
        }
        return this.f7510e;
    }

    public ConnectivityManager getConnectivityManager() {
        if (this.f7511f == null) {
            this.f7511f = (ConnectivityManager) f7505a.getSystemService("connectivity");
        }
        return this.f7511f;
    }

    public AccsAbstractDataListener getListener(String str) {
        return this.f7513i.get(str);
    }

    public String getNick(String str) {
        ILoginInfo iLoginInfo;
        ConcurrentHashMap<String, ILoginInfo> concurrentHashMap = this.f7509d;
        if (concurrentHashMap == null || (iLoginInfo = concurrentHashMap.get(str)) == null) {
            return null;
        }
        return iLoginInfo.getNick();
    }

    public PackageInfo getPackageInfo() {
        try {
            if (this.f7512g == null) {
                this.f7512g = f7505a.getPackageManager().getPackageInfo(f7505a.getPackageName(), 0);
            }
        } catch (Throwable th) {
            ALog.m6091e("GlobalClientInfo", "getPackageInfo", th, new Object[0]);
        }
        return this.f7512g;
    }

    public String getService(String str) {
        return f7508h.get(str);
    }

    public String getSid(String str) {
        ILoginInfo iLoginInfo;
        ConcurrentHashMap<String, ILoginInfo> concurrentHashMap = this.f7509d;
        if (concurrentHashMap == null || (iLoginInfo = concurrentHashMap.get(str)) == null) {
            return null;
        }
        return iLoginInfo.getSid();
    }

    public String getUserId(String str) {
        ILoginInfo iLoginInfo;
        ConcurrentHashMap<String, ILoginInfo> concurrentHashMap = this.f7509d;
        if (concurrentHashMap == null || (iLoginInfo = concurrentHashMap.get(str)) == null) {
            return null;
        }
        return iLoginInfo.getUserId();
    }

    public void registerListener(String str, AccsAbstractDataListener accsAbstractDataListener) {
        if (TextUtils.isEmpty(str) || accsAbstractDataListener == null) {
            return;
        }
        this.f7513i.put(str, accsAbstractDataListener);
    }

    public void registerService(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        f7508h.put(str, str2);
    }

    public void setLoginInfoImpl(String str, ILoginInfo iLoginInfo) {
        if (this.f7509d == null) {
            this.f7509d = new ConcurrentHashMap<>(1);
        }
        if (iLoginInfo != null) {
            this.f7509d.put(str, iLoginInfo);
        }
    }

    public void unRegisterService(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        f7508h.remove(str);
    }

    public void unregisterListener(String str) {
        this.f7513i.remove(str);
    }
}
