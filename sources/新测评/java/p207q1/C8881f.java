package p207q1;

import android.os.SystemClock;

/* renamed from: q1.f */
/* loaded from: classes2.dex */
public class C8881f {

    /* renamed from: a */
    public long f15122a;

    /* renamed from: b */
    public long f15123b;

    /* renamed from: c */
    public long f15124c;

    /* renamed from: d */
    public long f15125d;

    /* renamed from: e */
    public long f15126e;

    /* renamed from: a */
    public synchronized void m14919a(long j10) {
        try {
            if (this.f15122a == 0) {
                long jM14921c = m14921c();
                this.f15122a = jM14921c;
                this.f15124c = jM14921c;
            }
            this.f15123b += j10;
            this.f15126e += j10;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: b */
    public synchronized void m14920b() {
        this.f15125d = m14921c();
    }

    /* renamed from: c */
    public long m14921c() {
        return SystemClock.uptimeMillis();
    }
}
