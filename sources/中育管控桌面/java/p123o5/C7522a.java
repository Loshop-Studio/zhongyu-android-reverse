package p123o5;

/* renamed from: o5.a */
/* loaded from: classes4.dex */
public final class C7522a {

    /* renamed from: a */
    public final int f9712a;

    /* renamed from: b */
    public long f9713b;

    /* renamed from: c */
    public long f9714c;

    public C7522a(int i6) {
        this.f9712a = i6;
    }

    /* renamed from: c */
    public static /* synthetic */ void m8683c(C7522a c7522a, long j6, long j7, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            j6 = 0;
        }
        if ((i6 & 2) != 0) {
            j7 = 0;
        }
        c7522a.m8685b(j6, j7);
    }

    /* renamed from: a */
    public final synchronized long m8684a() {
        return this.f9713b - this.f9714c;
    }

    /* renamed from: b */
    public final synchronized void m8685b(long j6, long j7) {
        try {
            if (j6 < 0) {
                throw new IllegalStateException("Check failed.");
            }
            if (j7 < 0) {
                throw new IllegalStateException("Check failed.");
            }
            long j8 = this.f9713b + j6;
            this.f9713b = j8;
            long j9 = this.f9714c + j7;
            this.f9714c = j9;
            if (j9 > j8) {
                throw new IllegalStateException("Check failed.");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public String toString() {
        return "WindowCounter(streamId=" + this.f9712a + ", total=" + this.f9713b + ", acknowledged=" + this.f9714c + ", unacknowledged=" + m8684a() + ')';
    }
}
