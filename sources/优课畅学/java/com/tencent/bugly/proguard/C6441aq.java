package com.tencent.bugly.proguard;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.work.WorkRequest;

/* renamed from: com.tencent.bugly.proguard.aq */
/* loaded from: classes4.dex */
public final class C6441aq extends BroadcastReceiver {

    /* renamed from: d */
    private static C6441aq f4667d;

    /* renamed from: b */
    private Context f4669b;

    /* renamed from: c */
    private String f4670c;

    /* renamed from: e */
    private boolean f4671e = true;

    /* renamed from: a */
    private IntentFilter f4668a = new IntentFilter();

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        try {
            m4357a(context, intent);
        } catch (Throwable th) {
            if (C6436al.m4284a(th)) {
                return;
            }
            th.printStackTrace();
        }
    }

    /* renamed from: a */
    public static synchronized C6441aq m4356a() {
        try {
            if (f4667d == null) {
                f4667d = new C6441aq();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f4667d;
    }

    /* renamed from: b */
    public final synchronized void m4362b(Context context) {
        try {
            C6436al.m4282a(C6441aq.class, "Unregister broadcast receiver of Bugly.", new Object[0]);
            context.unregisterReceiver(this);
            this.f4669b = context;
        } catch (Throwable th) {
            if (C6436al.m4284a(th)) {
                return;
            }
            th.printStackTrace();
        }
    }

    /* renamed from: a */
    public final synchronized void m4361a(String str) {
        try {
            if (!this.f4668a.hasAction(str)) {
                this.f4668a.addAction(str);
            }
            C6436al.m4287c("add action %s", str);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: a */
    public final synchronized void m4360a(Context context) {
        this.f4669b = context;
        C6440ap.m4334a(new Runnable() { // from class: com.tencent.bugly.proguard.aq.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    C6436al.m4282a(C6441aq.f4667d.getClass(), "Register broadcast receiver of Bugly.", new Object[0]);
                    synchronized (this) {
                        C6441aq.this.f4669b.registerReceiver(C6441aq.f4667d, C6441aq.this.f4668a, "com.tencent.bugly.BuglyBroadcastReceiver.permission", null);
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        });
    }

    /* renamed from: a */
    private synchronized boolean m4357a(Context context, Intent intent) {
        if (context != null && intent != null) {
            if (intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                if (this.f4671e) {
                    this.f4671e = false;
                    return true;
                }
                String strM4192c = C6426ab.m4192c(this.f4669b);
                C6436al.m4287c("is Connect BC ".concat(String.valueOf(strM4192c)), new Object[0]);
                C6436al.m4283a("network %s changed to %s", this.f4670c, String.valueOf(strM4192c));
                if (strM4192c == null) {
                    this.f4670c = null;
                    return true;
                }
                String str = this.f4670c;
                this.f4670c = strM4192c;
                long jCurrentTimeMillis = System.currentTimeMillis();
                C6427ac c6427acM4212a = C6427ac.m4212a();
                C6433ai c6433aiM4248a = C6433ai.m4248a();
                C6425aa c6425aaM4148a = C6425aa.m4148a(context);
                if (c6427acM4212a != null && c6433aiM4248a != null && c6425aaM4148a != null) {
                    if (!strM4192c.equals(str) && jCurrentTimeMillis - c6433aiM4248a.m4259a(C6444at.f4698a) > WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS) {
                        C6436al.m4283a("try to upload crash on network changed.", new Object[0]);
                        C6444at c6444atM4406a = C6444at.m4406a();
                        if (c6444atM4406a != null) {
                            c6444atM4406a.m4410a(0L);
                        }
                        C6436al.m4283a("try to upload userinfo on network changed.", new Object[0]);
                        C6490s.f4998b.m4614b();
                    }
                    return true;
                }
                C6436al.m4288d("not inited BC not work", new Object[0]);
                return true;
            }
        }
        return false;
    }
}
