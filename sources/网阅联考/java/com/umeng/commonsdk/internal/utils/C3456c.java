package com.umeng.commonsdk.internal.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.core.app.NotificationCompat;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.commonsdk.internal.C3449a;
import com.umeng.commonsdk.internal.C3450b;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.statistics.common.ULog;
import org.json.JSONObject;

/* renamed from: com.umeng.commonsdk.internal.utils.c */
/* loaded from: classes2.dex */
public class C3456c {

    /* renamed from: a */
    private static final String f2641a = "BatteryUtils";

    /* renamed from: b */
    private static boolean f2642b = false;

    /* renamed from: c */
    private static Context f2643c;

    /* renamed from: d */
    private BroadcastReceiver f2644d;

    /* renamed from: com.umeng.commonsdk.internal.utils.c$a */
    public static class a {

        /* renamed from: a */
        private static final C3456c f2646a = new C3456c();

        private a() {
        }
    }

    /* renamed from: a */
    public static C3456c m3539a(Context context) {
        if (f2643c == null && context != null) {
            f2643c = context.getApplicationContext();
        }
        return a.f2646a;
    }

    /* renamed from: b */
    public synchronized void m3542b() {
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.BATTERY_CHANGED");
            f2643c.registerReceiver(this.f2644d, intentFilter);
            f2642b = true;
        } catch (Throwable th) {
            UMCrashManager.reportCrash(f2643c, th);
        }
    }

    /* renamed from: c */
    public synchronized void m3543c() {
        try {
            f2643c.unregisterReceiver(this.f2644d);
            f2642b = false;
        } catch (Throwable th) {
            UMCrashManager.reportCrash(f2643c, th);
        }
    }

    private C3456c() {
        this.f2644d = new BroadcastReceiver() { // from class: com.umeng.commonsdk.internal.utils.c.1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                try {
                    if (intent.getAction().equals("android.intent.action.BATTERY_CHANGED")) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("le", intent.getIntExtra("level", 0));
                        } catch (Exception unused) {
                        }
                        try {
                            jSONObject.put("vol", intent.getIntExtra("voltage", 0));
                        } catch (Exception unused2) {
                        }
                        try {
                            jSONObject.put("temp", intent.getIntExtra("temperature", 0));
                            jSONObject.put("ts", System.currentTimeMillis());
                        } catch (Exception unused3) {
                        }
                        int intExtra = intent.getIntExtra(NotificationCompat.CATEGORY_STATUS, 0);
                        int i4 = -1;
                        int i5 = 2;
                        if (intExtra != 1) {
                            if (intExtra == 2) {
                                i4 = 1;
                            } else if (intExtra == 4) {
                                i4 = 0;
                            } else if (intExtra == 5) {
                                i4 = 2;
                            }
                        }
                        try {
                            jSONObject.put("st", i4);
                        } catch (Exception unused4) {
                        }
                        int intExtra2 = intent.getIntExtra("plugged", 0);
                        if (intExtra2 == 1) {
                            i5 = 1;
                        } else if (intExtra2 != 2) {
                            i5 = 0;
                        }
                        try {
                            jSONObject.put("ct", i5);
                            jSONObject.put("ts", System.currentTimeMillis());
                        } catch (Exception unused5) {
                        }
                        ULog.m3686i(C3456c.f2641a, jSONObject.toString());
                        UMWorkDispatch.sendEvent(context, C3449a.f2583h, C3450b.m3469a(C3456c.f2643c).m3470a(), jSONObject.toString());
                        C3456c.this.m3543c();
                    }
                } catch (Throwable th) {
                    UMCrashManager.reportCrash(C3456c.f2643c, th);
                }
            }
        };
    }

    /* renamed from: a */
    public synchronized boolean m3541a() {
        return f2642b;
    }
}
