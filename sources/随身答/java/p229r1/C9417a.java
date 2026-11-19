package p229r1;

import java.util.concurrent.atomic.AtomicLong;

/* renamed from: r1.a */
/* loaded from: classes4.dex */
public class C9417a {

    /* renamed from: a */
    public final long f16417a;

    /* renamed from: b */
    public final long f16418b;

    /* renamed from: c */
    public final AtomicLong f16419c;

    public C9417a(long j9, long j10) {
        this(j9, j10, 0L);
    }

    /* renamed from: a */
    public C9417a m15510a() {
        return new C9417a(this.f16417a, this.f16418b, this.f16419c.get());
    }

    /* renamed from: b */
    public long m15511b() {
        return this.f16418b;
    }

    /* renamed from: c */
    public long m15512c() {
        return this.f16419c.get();
    }

    /* renamed from: d */
    public long m15513d() {
        return this.f16417a + this.f16419c.get();
    }

    /* renamed from: e */
    public long m15514e() {
        return (this.f16417a + this.f16418b) - 1;
    }

    /* renamed from: f */
    public long m15515f() {
        return this.f16417a;
    }

    /* renamed from: g */
    public void m15516g(long j9) {
        this.f16419c.addAndGet(j9);
    }

    /* renamed from: h */
    public void m15517h() {
        this.f16419c.set(0L);
    }

    public String toString() {
        return "[" + this.f16417a + ", " + m15514e() + ")-current:" + this.f16419c;
    }

    public C9417a(long j9, long j10, long j11) {
        if (j9 < 0 || ((j10 < 0 && j10 != -1) || j11 < 0)) {
            throw new IllegalArgumentException();
        }
        this.f16417a = j9;
        this.f16418b = j10;
        this.f16419c = new AtomicLong(j11);
    }
}
