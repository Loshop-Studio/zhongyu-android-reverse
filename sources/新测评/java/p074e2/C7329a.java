package p074e2;

import android.content.Context;

/* renamed from: e2.a */
/* loaded from: classes4.dex */
public class C7329a {

    /* renamed from: c */
    public static final C7329a f11894c = new C7329a();

    /* renamed from: a */
    public Context f11895a = null;

    /* renamed from: b */
    public long f11896b = 0;

    /* renamed from: b */
    public static C7329a m11708b() {
        return f11894c;
    }

    /* renamed from: a */
    public long m11709a() {
        return System.currentTimeMillis() + this.f11896b;
    }

    /* renamed from: c */
    public String m11710c() {
        return "" + m11709a();
    }

    /* renamed from: d */
    public void m11711d(long j10) {
        this.f11896b = j10 - System.currentTimeMillis();
    }

    /* renamed from: e */
    public synchronized void m11712e(Context context) {
        try {
            if (this.f11895a == null) {
                if (context == null) {
                    return;
                }
                if (context.getApplicationContext() != null) {
                    this.f11895a = context.getApplicationContext();
                } else {
                    this.f11895a = context;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: f */
    public Context m11713f() {
        return this.f11895a;
    }
}
