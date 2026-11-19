package p439zc;

/* renamed from: zc.c */
/* loaded from: classes6.dex */
public abstract class AbstractC12039c {
    /* renamed from: a */
    public static final int m26663a(int i10, int i11, int i12) {
        return m26667e(m26667e(i10, i12) - m26667e(i11, i12), i12);
    }

    /* renamed from: b */
    public static final long m26664b(long j10, long j11, long j12) {
        return m26668f(m26668f(j10, j12) - m26668f(j11, j12), j12);
    }

    /* renamed from: c */
    public static final int m26665c(int i10, int i11, int i12) {
        if (i12 > 0) {
            if (i10 < i11) {
                return i11 - m26663a(i11, i10, i12);
            }
        } else {
            if (i12 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (i10 > i11) {
                return i11 + m26663a(i10, i11, -i12);
            }
        }
        return i11;
    }

    /* renamed from: d */
    public static final long m26666d(long j10, long j11, long j12) {
        if (j12 > 0) {
            return j10 >= j11 ? j11 : j11 - m26664b(j11, j10, j12);
        }
        if (j12 < 0) {
            return j10 <= j11 ? j11 : j11 + m26664b(j10, j11, -j12);
        }
        throw new IllegalArgumentException("Step is zero.");
    }

    /* renamed from: e */
    public static final int m26667e(int i10, int i11) {
        int i12 = i10 % i11;
        return i12 >= 0 ? i12 : i12 + i11;
    }

    /* renamed from: f */
    public static final long m26668f(long j10, long j11) {
        long j12 = j10 % j11;
        return j12 >= 0 ? j12 : j12 + j11;
    }
}
