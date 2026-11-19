package p209p1;

import android.os.SystemClock;

/* renamed from: p1.f */
/* loaded from: classes4.dex */
public class C9317f {

    /* renamed from: a */
    public long f16155a;

    /* renamed from: b */
    public long f16156b;

    /* renamed from: c */
    public long f16157c;

    /* renamed from: d */
    public long f16158d;

    /* renamed from: e */
    public long f16159e;

    /* renamed from: a */
    public synchronized void m15196a(long j9) {
        try {
            if (this.f16155a == 0) {
                long jM15198c = m15198c();
                this.f16155a = jM15198c;
                this.f16157c = jM15198c;
            }
            this.f16156b += j9;
            this.f16159e += j9;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: b */
    public synchronized void m15197b() {
        this.f16158d = m15198c();
    }

    /* renamed from: c */
    public long m15198c() {
        return SystemClock.uptimeMillis();
    }
}
