package com.tencent.bugly.proguard;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.blankj.utilcode.util.RunnableC3379a0;

/* renamed from: com.tencent.bugly.proguard.aq */
/* loaded from: classes3.dex */
public final class C4060aq extends BroadcastReceiver {

    /* renamed from: d */
    private static C4060aq f3547d;

    /* renamed from: b */
    private Context f3549b;

    /* renamed from: c */
    private String f3550c;

    /* renamed from: e */
    private boolean f3551e = true;

    /* renamed from: a */
    private IntentFilter f3548a = new IntentFilter();

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        try {
            m3095a(context, intent);
        } catch (Throwable th) {
            if (C4055al.m3022a(th)) {
                return;
            }
            th.printStackTrace();
        }
    }

    /* renamed from: a */
    public static synchronized C4060aq m3094a() {
        try {
            if (f3547d == null) {
                f3547d = new C4060aq();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f3547d;
    }

    /* renamed from: b */
    public final synchronized void m3100b(Context context) {
        try {
            C4055al.m3020a(C4060aq.class, "Unregister broadcast receiver of Bugly.", new Object[0]);
            context.unregisterReceiver(this);
            this.f3549b = context;
        } catch (Throwable th) {
            if (C4055al.m3022a(th)) {
                return;
            }
            th.printStackTrace();
        }
    }

    /* renamed from: a */
    public final synchronized void m3099a(String str) {
        try {
            if (!this.f3548a.hasAction(str)) {
                this.f3548a.addAction(str);
            }
            C4055al.m3025c("add action %s", str);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: a */
    public final synchronized void m3098a(Context context) {
        this.f3549b = context;
        C4059ap.m3072a(new RunnableC3379a0(2, this, false, this));
    }

    /* renamed from: a */
    private synchronized boolean m3095a(Context context, Intent intent) {
        if (context != null && intent != null) {
            if (intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                if (this.f3551e) {
                    this.f3551e = false;
                    return true;
                }
                String strM2932c = C4045ab.m2932c(this.f3549b);
                C4055al.m3025c("is Connect BC ".concat(String.valueOf(strM2932c)), new Object[0]);
                C4055al.m3021a("network %s changed to %s", this.f3550c, String.valueOf(strM2932c));
                if (strM2932c == null) {
                    this.f3550c = null;
                    return true;
                }
                String str = this.f3550c;
                this.f3550c = strM2932c;
                long jCurrentTimeMillis = System.currentTimeMillis();
                C4046ac c4046acM2951a = C4046ac.m2951a();
                C4052ai c4052aiM2986a = C4052ai.m2986a();
                C4044aa c4044aaM2888a = C4044aa.m2888a(context);
                if (c4046acM2951a != null && c4052aiM2986a != null && c4044aaM2888a != null) {
                    if (!strM2932c.equals(str) && jCurrentTimeMillis - c4052aiM2986a.m2997a(C4063at.f3571a) > 30000) {
                        C4055al.m3021a("try to upload crash on network changed.", new Object[0]);
                        C4063at c4063atM3143a = C4063at.m3143a();
                        if (c4063atM3143a != null) {
                            c4063atM3143a.m3147a(0L);
                        }
                        C4055al.m3021a("try to upload userinfo on network changed.", new Object[0]);
                        C4135s.f3877b.m3351b();
                    }
                    return true;
                }
                C4055al.m3026d("not inited BC not work", new Object[0]);
                return true;
            }
        }
        return false;
    }
}
