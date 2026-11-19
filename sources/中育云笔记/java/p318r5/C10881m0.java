package p318r5;

import android.content.Context;

/* renamed from: r5.m0 */
/* loaded from: classes5.dex */
public final class C10881m0 {

    /* renamed from: b */
    public static C10881m0 f26261b;

    /* renamed from: c */
    public static final Object f26262c = new Object();

    /* renamed from: a */
    public Context f26263a;

    /* renamed from: a */
    public static C10881m0 m23547a() {
        if (f26261b == null) {
            m23548d();
        }
        return f26261b;
    }

    /* renamed from: d */
    public static synchronized void m23548d() {
        if (f26261b == null) {
            f26261b = new C10881m0();
        }
    }

    /* renamed from: b */
    public void m23549b(Context context) {
        synchronized (f26262c) {
            try {
                if (this.f26263a != null) {
                    AbstractC10861f1.m23441m("hmsSdk", "DataManager already initialized.");
                    return;
                }
                this.f26263a = context;
                C10908z0.m23741e().m23746d().m23632b(this.f26263a);
                C10908z0.m23741e().m23746d().m23651u(context.getPackageName());
                C10848b0.m23347c().m23350d(context);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: c */
    public void m23550c(String str) {
        AbstractC10861f1.m23430b("hmsSdk", "HiAnalyticsDataManager.setAppid(String appid) is execute.");
        Context context = this.f26263a;
        if (context == null) {
            AbstractC10861f1.m23440l("hmsSdk", "sdk is not init");
        } else {
            C10908z0.m23741e().m23746d().m23649s(AbstractC10883n.m23562a("appID", str, "[a-zA-Z0-9_][a-zA-Z0-9. _-]{0,255}", context.getPackageName()));
        }
    }
}
