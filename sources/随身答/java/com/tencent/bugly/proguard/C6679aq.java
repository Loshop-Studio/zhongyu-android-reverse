package com.tencent.bugly.proguard;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.work.WorkRequest;

/* renamed from: com.tencent.bugly.proguard.aq */
/* loaded from: classes4.dex */
public final class C6679aq extends BroadcastReceiver {

    /* renamed from: d */
    private static C6679aq f5901d;

    /* renamed from: b */
    private Context f5903b;

    /* renamed from: c */
    private String f5904c;

    /* renamed from: e */
    private boolean f5905e = true;

    /* renamed from: a */
    private IntentFilter f5902a = new IntentFilter();

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        try {
            m5176a(context, intent);
        } catch (Throwable th) {
            if (C6674al.m5103a(th)) {
                return;
            }
            th.printStackTrace();
        }
    }

    /* renamed from: a */
    public static synchronized C6679aq m5175a() {
        try {
            if (f5901d == null) {
                f5901d = new C6679aq();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f5901d;
    }

    /* renamed from: b */
    public final synchronized void m5181b(Context context) {
        try {
            C6674al.m5101a(C6679aq.class, "Unregister broadcast receiver of Bugly.", new Object[0]);
            context.unregisterReceiver(this);
            this.f5903b = context;
        } catch (Throwable th) {
            if (C6674al.m5103a(th)) {
                return;
            }
            th.printStackTrace();
        }
    }

    /* renamed from: a */
    public final synchronized void m5180a(String str) {
        try {
            if (!this.f5902a.hasAction(str)) {
                this.f5902a.addAction(str);
            }
            C6674al.m5106c("add action %s", str);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: a */
    public final synchronized void m5179a(Context context) {
        this.f5903b = context;
        C6678ap.m5153a(new Runnable() { // from class: com.tencent.bugly.proguard.aq.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    C6674al.m5101a(C6679aq.f5901d.getClass(), "Register broadcast receiver of Bugly.", new Object[0]);
                    synchronized (this) {
                        C6679aq.this.f5903b.registerReceiver(C6679aq.f5901d, C6679aq.this.f5902a, "com.tencent.bugly.BuglyBroadcastReceiver.permission", null);
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        });
    }

    /* renamed from: a */
    private synchronized boolean m5176a(Context context, Intent intent) {
        if (context != null && intent != null) {
            if (intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                if (this.f5905e) {
                    this.f5905e = false;
                    return true;
                }
                String strM5011c = C6664ab.m5011c(this.f5903b);
                C6674al.m5106c("is Connect BC ".concat(String.valueOf(strM5011c)), new Object[0]);
                C6674al.m5102a("network %s changed to %s", this.f5904c, String.valueOf(strM5011c));
                if (strM5011c == null) {
                    this.f5904c = null;
                    return true;
                }
                String str = this.f5904c;
                this.f5904c = strM5011c;
                long jCurrentTimeMillis = System.currentTimeMillis();
                C6665ac c6665acM5031a = C6665ac.m5031a();
                C6671ai c6671aiM5067a = C6671ai.m5067a();
                C6663aa c6663aaM4967a = C6663aa.m4967a(context);
                if (c6665acM5031a != null && c6671aiM5067a != null && c6663aaM4967a != null) {
                    if (!strM5011c.equals(str) && jCurrentTimeMillis - c6671aiM5067a.m5078a(C6682at.f5932a) > WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS) {
                        C6674al.m5102a("try to upload crash on network changed.", new Object[0]);
                        C6682at c6682atM5225a = C6682at.m5225a();
                        if (c6682atM5225a != null) {
                            c6682atM5225a.m5229a(0L);
                        }
                        C6674al.m5102a("try to upload userinfo on network changed.", new Object[0]);
                        C6728s.f6232b.m5433b();
                    }
                    return true;
                }
                C6674al.m5107d("not inited BC not work", new Object[0]);
                return true;
            }
        }
        return false;
    }
}
