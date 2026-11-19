package com.tencent.bugly.proguard;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.work.WorkRequest;

/* renamed from: com.tencent.bugly.proguard.aq */
/* loaded from: classes4.dex */
public final class C6419aq extends BroadcastReceiver {

    /* renamed from: d */
    private static C6419aq f5324d;

    /* renamed from: b */
    private Context f5326b;

    /* renamed from: c */
    private String f5327c;

    /* renamed from: e */
    private boolean f5328e = true;

    /* renamed from: a */
    private IntentFilter f5325a = new IntentFilter();

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        try {
            m4997a(context, intent);
        } catch (Throwable th) {
            if (C6414al.m4924a(th)) {
                return;
            }
            th.printStackTrace();
        }
    }

    /* renamed from: a */
    public static synchronized C6419aq m4996a() {
        try {
            if (f5324d == null) {
                f5324d = new C6419aq();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f5324d;
    }

    /* renamed from: b */
    public final synchronized void m5002b(Context context) {
        try {
            C6414al.m4922a(C6419aq.class, "Unregister broadcast receiver of Bugly.", new Object[0]);
            context.unregisterReceiver(this);
            this.f5326b = context;
        } catch (Throwable th) {
            if (C6414al.m4924a(th)) {
                return;
            }
            th.printStackTrace();
        }
    }

    /* renamed from: a */
    public final synchronized void m5001a(String str) {
        try {
            if (!this.f5325a.hasAction(str)) {
                this.f5325a.addAction(str);
            }
            C6414al.m4927c("add action %s", str);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: a */
    public final synchronized void m5000a(Context context) {
        this.f5326b = context;
        C6418ap.m4974a(new Runnable() { // from class: com.tencent.bugly.proguard.aq.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    C6414al.m4922a(C6419aq.f5324d.getClass(), "Register broadcast receiver of Bugly.", new Object[0]);
                    synchronized (this) {
                        C6419aq.this.f5326b.registerReceiver(C6419aq.f5324d, C6419aq.this.f5325a, "com.tencent.bugly.BuglyBroadcastReceiver.permission", null);
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        });
    }

    /* renamed from: a */
    private synchronized boolean m4997a(Context context, Intent intent) {
        if (context != null && intent != null) {
            if (intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                if (this.f5328e) {
                    this.f5328e = false;
                    return true;
                }
                String strM4832c = C6404ab.m4832c(this.f5326b);
                C6414al.m4927c("is Connect BC ".concat(String.valueOf(strM4832c)), new Object[0]);
                C6414al.m4923a("network %s changed to %s", this.f5327c, String.valueOf(strM4832c));
                if (strM4832c == null) {
                    this.f5327c = null;
                    return true;
                }
                String str = this.f5327c;
                this.f5327c = strM4832c;
                long jCurrentTimeMillis = System.currentTimeMillis();
                C6405ac c6405acM4852a = C6405ac.m4852a();
                C6411ai c6411aiM4888a = C6411ai.m4888a();
                C6403aa c6403aaM4788a = C6403aa.m4788a(context);
                if (c6405acM4852a != null && c6411aiM4888a != null && c6403aaM4788a != null) {
                    if (!strM4832c.equals(str) && jCurrentTimeMillis - c6411aiM4888a.m4899a(C6422at.f5355a) > WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS) {
                        C6414al.m4923a("try to upload crash on network changed.", new Object[0]);
                        C6422at c6422atM5046a = C6422at.m5046a();
                        if (c6422atM5046a != null) {
                            c6422atM5046a.m5050a(0L);
                        }
                        C6414al.m4923a("try to upload userinfo on network changed.", new Object[0]);
                        C6468s.f5655b.m5254b();
                    }
                    return true;
                }
                C6414al.m4928d("not inited BC not work", new Object[0]);
                return true;
            }
        }
        return false;
    }
}
