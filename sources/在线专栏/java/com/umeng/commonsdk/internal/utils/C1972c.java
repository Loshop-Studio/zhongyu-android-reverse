package com.umeng.commonsdk.internal.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.commonsdk.internal.C1965a;
import com.umeng.commonsdk.internal.C1966b;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.statistics.common.ULog;
import org.json.JSONObject;

/* renamed from: com.umeng.commonsdk.internal.utils.c */
/* loaded from: classes.dex */
public class C1972c {

    /* renamed from: a */
    private static final String f9233a = "BatteryUtils";

    /* renamed from: b */
    private static boolean f9234b = false;

    /* renamed from: c */
    private static Context f9235c;

    /* renamed from: d */
    private BroadcastReceiver f9236d;

    /* renamed from: com.umeng.commonsdk.internal.utils.c$a */
    private static class a {

        /* renamed from: a */
        private static final C1972c f9238a = new C1972c();

        private a() {
        }
    }

    /* renamed from: a */
    public static C1972c m7462a(Context context) {
        if (f9235c == null && context != null) {
            f9235c = context.getApplicationContext();
        }
        return a.f9238a;
    }

    /* renamed from: b */
    public synchronized void m7465b() {
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.BATTERY_CHANGED");
            f9235c.registerReceiver(this.f9236d, intentFilter);
            f9234b = true;
        } catch (Throwable th) {
            UMCrashManager.reportCrash(f9235c, th);
        }
    }

    /* renamed from: c */
    public synchronized void m7466c() {
        try {
            f9235c.unregisterReceiver(this.f9236d);
            f9234b = false;
        } catch (Throwable th) {
            UMCrashManager.reportCrash(f9235c, th);
        }
    }

    private C1972c() {
        this.f9236d = new BroadcastReceiver() { // from class: com.umeng.commonsdk.internal.utils.c.1
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
                        int intExtra = intent.getIntExtra("status", 0);
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
                        ULog.m7609i(C1972c.f9233a, jSONObject.toString());
                        UMWorkDispatch.sendEvent(context, C1965a.f9175h, C1966b.m7392a(C1972c.f9235c).m7393a(), jSONObject.toString());
                        C1972c.this.m7466c();
                    }
                } catch (Throwable th) {
                    UMCrashManager.reportCrash(C1972c.f9235c, th);
                }
            }
        };
    }

    /* renamed from: a */
    public synchronized boolean m7464a() {
        return f9234b;
    }
}
