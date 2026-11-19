package p236r9;

/* renamed from: r9.a */
/* loaded from: classes5.dex */
public final class C9947a {

    /* renamed from: a */
    public final int f19923a;

    /* renamed from: b */
    public long f19924b;

    /* renamed from: c */
    public long f19925c;

    public C9947a(int i10) {
        this.f19923a = i10;
    }

    /* renamed from: c */
    public static /* synthetic */ void m18585c(C9947a c9947a, long j10, long j11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = 0;
        }
        if ((i10 & 2) != 0) {
            j11 = 0;
        }
        c9947a.m18587b(j10, j11);
    }

    /* renamed from: a */
    public final synchronized long m18586a() {
        return this.f19924b - this.f19925c;
    }

    /* renamed from: b */
    public final synchronized void m18587b(long j10, long j11) {
        try {
            if (j10 < 0) {
                throw new IllegalStateException("Check failed.");
            }
            if (j11 < 0) {
                throw new IllegalStateException("Check failed.");
            }
            long j12 = this.f19924b + j10;
            this.f19924b = j12;
            long j13 = this.f19925c + j11;
            this.f19925c = j13;
            if (j13 > j12) {
                throw new IllegalStateException("Check failed.");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public String toString() {
        return "WindowCounter(streamId=" + this.f19923a + ", total=" + this.f19924b + ", acknowledged=" + this.f19925c + ", unacknowledged=" + m18586a() + ')';
    }
}
