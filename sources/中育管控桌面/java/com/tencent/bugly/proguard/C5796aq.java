package com.tencent.bugly.proguard;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.work.WorkRequest;

/* renamed from: com.tencent.bugly.proguard.aq */
/* loaded from: classes3.dex */
public final class C5796aq extends BroadcastReceiver {

    /* renamed from: d */
    private static C5796aq f4045d;

    /* renamed from: b */
    private Context f4047b;

    /* renamed from: c */
    private String f4048c;

    /* renamed from: e */
    private boolean f4049e = true;

    /* renamed from: a */
    private IntentFilter f4046a = new IntentFilter();

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        try {
            m4002a(context, intent);
        } catch (Throwable th) {
            if (C5791al.m3929a(th)) {
                return;
            }
            th.printStackTrace();
        }
    }

    /* renamed from: a */
    public static synchronized C5796aq m4001a() {
        try {
            if (f4045d == null) {
                f4045d = new C5796aq();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f4045d;
    }

    /* renamed from: b */
    public final synchronized void m4007b(Context context) {
        try {
            C5791al.m3927a(C5796aq.class, "Unregister broadcast receiver of Bugly.", new Object[0]);
            context.unregisterReceiver(this);
            this.f4047b = context;
        } catch (Throwable th) {
            if (C5791al.m3929a(th)) {
                return;
            }
            th.printStackTrace();
        }
    }

    /* renamed from: a */
    public final synchronized void m4006a(String str) {
        try {
            if (!this.f4046a.hasAction(str)) {
                this.f4046a.addAction(str);
            }
            C5791al.m3932c("add action %s", str);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: a */
    public final synchronized void m4005a(Context context) {
        this.f4047b = context;
        C5795ap.m3979a(new Runnable() { // from class: com.tencent.bugly.proguard.aq.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    C5791al.m3927a(C5796aq.f4045d.getClass(), "Register broadcast receiver of Bugly.", new Object[0]);
                    synchronized (this) {
                        C5796aq.this.f4047b.registerReceiver(C5796aq.f4045d, C5796aq.this.f4046a, "com.tencent.bugly.BuglyBroadcastReceiver.permission", null);
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        });
    }

    /* renamed from: a */
    private synchronized boolean m4002a(Context context, Intent intent) {
        if (context != null && intent != null) {
            if (intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                if (this.f4049e) {
                    this.f4049e = false;
                    return true;
                }
                String strM3837c = C5781ab.m3837c(this.f4047b);
                C5791al.m3932c("is Connect BC ".concat(String.valueOf(strM3837c)), new Object[0]);
                C5791al.m3928a("network %s changed to %s", this.f4048c, String.valueOf(strM3837c));
                if (strM3837c == null) {
                    this.f4048c = null;
                    return true;
                }
                String str = this.f4048c;
                this.f4048c = strM3837c;
                long jCurrentTimeMillis = System.currentTimeMillis();
                C5782ac c5782acM3857a = C5782ac.m3857a();
                C5788ai c5788aiM3893a = C5788ai.m3893a();
                C5780aa c5780aaM3793a = C5780aa.m3793a(context);
                if (c5782acM3857a != null && c5788aiM3893a != null && c5780aaM3793a != null) {
                    if (!strM3837c.equals(str) && jCurrentTimeMillis - c5788aiM3893a.m3904a(C5799at.f4076a) > WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS) {
                        C5791al.m3928a("try to upload crash on network changed.", new Object[0]);
                        C5799at c5799atM4051a = C5799at.m4051a();
                        if (c5799atM4051a != null) {
                            c5799atM4051a.m4055a(0L);
                        }
                        C5791al.m3928a("try to upload userinfo on network changed.", new Object[0]);
                        C5845s.f4376b.m4259b();
                    }
                    return true;
                }
                C5791al.m3933d("not inited BC not work", new Object[0]);
                return true;
            }
        }
        return false;
    }
}
