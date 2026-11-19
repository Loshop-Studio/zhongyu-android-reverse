package p229s1;

import java.util.concurrent.atomic.AtomicLong;

/* renamed from: s1.a */
/* loaded from: classes4.dex */
public class C9124a {

    /* renamed from: a */
    public final long f15830a;

    /* renamed from: b */
    public final long f15831b;

    /* renamed from: c */
    public final AtomicLong f15832c;

    public C9124a(long j10, long j11) {
        this(j10, j11, 0L);
    }

    /* renamed from: a */
    public C9124a m15456a() {
        return new C9124a(this.f15830a, this.f15831b, this.f15832c.get());
    }

    /* renamed from: b */
    public long m15457b() {
        return this.f15831b;
    }

    /* renamed from: c */
    public long m15458c() {
        return this.f15832c.get();
    }

    /* renamed from: d */
    public long m15459d() {
        return this.f15830a + this.f15832c.get();
    }

    /* renamed from: e */
    public long m15460e() {
        return (this.f15830a + this.f15831b) - 1;
    }

    /* renamed from: f */
    public long m15461f() {
        return this.f15830a;
    }

    /* renamed from: g */
    public void m15462g(long j10) {
        this.f15832c.addAndGet(j10);
    }

    /* renamed from: h */
    public void m15463h() {
        this.f15832c.set(0L);
    }

    public String toString() {
        return "[" + this.f15830a + ", " + m15460e() + ")-current:" + this.f15832c;
    }

    public C9124a(long j10, long j11, long j12) {
        if (j10 < 0 || ((j11 < 0 && j11 != -1) || j12 < 0)) {
            throw new IllegalArgumentException();
        }
        this.f15830a = j10;
        this.f15831b = j11;
        this.f15832c = new AtomicLong(j12);
    }
}
