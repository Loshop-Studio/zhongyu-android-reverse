package com.tencent.bugly.proguard;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* renamed from: com.tencent.bugly.proguard.aq */
/* loaded from: classes5.dex */
public final class C7784aq extends BroadcastReceiver {

    /* renamed from: d */
    private static C7784aq f13766d;

    /* renamed from: b */
    private Context f13768b;

    /* renamed from: c */
    private String f13769c;

    /* renamed from: e */
    private boolean f13770e = true;

    /* renamed from: a */
    private IntentFilter f13767a = new IntentFilter();

    /* renamed from: com.tencent.bugly.proguard.aq$a */
    public class a implements Runnable {

        /* renamed from: c */
        public final /* synthetic */ C7784aq f13771c;

        public a(C7784aq c7784aq) {
            this.f13771c = c7784aq;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                C7779al.m10612a(C7784aq.f13766d.getClass(), "Register broadcast receiver of Bugly.", new Object[0]);
                synchronized (this.f13771c) {
                    C7784aq.this.f13768b.registerReceiver(C7784aq.f13766d, C7784aq.this.f13767a, "com.tencent.bugly.BuglyBroadcastReceiver.permission", null);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        try {
            m10687a(context, intent);
        } catch (Throwable th) {
            if (C7779al.m10614a(th)) {
                return;
            }
            th.printStackTrace();
        }
    }

    /* renamed from: a */
    public static synchronized C7784aq m10686a() {
        try {
            if (f13766d == null) {
                f13766d = new C7784aq();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f13766d;
    }

    /* renamed from: b */
    public final synchronized void m10692b(Context context) {
        try {
            C7779al.m10612a(C7784aq.class, "Unregister broadcast receiver of Bugly.", new Object[0]);
            context.unregisterReceiver(this);
            this.f13768b = context;
        } catch (Throwable th) {
            if (C7779al.m10614a(th)) {
                return;
            }
            th.printStackTrace();
        }
    }

    /* renamed from: a */
    public final synchronized void m10691a(String str) {
        try {
            if (!this.f13767a.hasAction(str)) {
                this.f13767a.addAction(str);
            }
            C7779al.m10617c("add action %s", str);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: a */
    public final synchronized void m10690a(Context context) {
        this.f13768b = context;
        C7783ap.m10664a(new a(this));
    }

    /* renamed from: a */
    private synchronized boolean m10687a(Context context, Intent intent) {
        if (context != null && intent != null) {
            if (intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                if (this.f13770e) {
                    this.f13770e = false;
                    return true;
                }
                String strM10522c = C7769ab.m10522c(this.f13768b);
                C7779al.m10617c("is Connect BC ".concat(String.valueOf(strM10522c)), new Object[0]);
                C7779al.m10613a("network %s changed to %s", this.f13769c, String.valueOf(strM10522c));
                if (strM10522c == null) {
                    this.f13769c = null;
                    return true;
                }
                String str = this.f13769c;
                this.f13769c = strM10522c;
                long jCurrentTimeMillis = System.currentTimeMillis();
                C7770ac c7770acM10542a = C7770ac.m10542a();
                C7776ai c7776aiM10578a = C7776ai.m10578a();
                C7768aa c7768aaM10478a = C7768aa.m10478a(context);
                if (c7770acM10542a != null && c7776aiM10578a != null && c7768aaM10478a != null) {
                    if (!strM10522c.equals(str) && jCurrentTimeMillis - c7776aiM10578a.m10589a(C7787at.f13797a) > 30000) {
                        C7779al.m10613a("try to upload crash on network changed.", new Object[0]);
                        C7787at c7787atM10736a = C7787at.m10736a();
                        if (c7787atM10736a != null) {
                            c7787atM10736a.m10740a(0L);
                        }
                        C7779al.m10613a("try to upload userinfo on network changed.", new Object[0]);
                        C7833s.f14097b.m10944b();
                    }
                    return true;
                }
                C7779al.m10618d("not inited BC not work", new Object[0]);
                return true;
            }
        }
        return false;
    }
}
