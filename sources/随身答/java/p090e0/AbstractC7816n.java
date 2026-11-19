package p090e0;

/* renamed from: e0.n */
/* loaded from: classes3.dex */
public abstract class AbstractC7816n {
    /* renamed from: a */
    public static long m12199a(int i9, int i10) {
        return m12200b((i10 & 4294967295L) | (i9 << 32));
    }

    /* renamed from: c */
    public static final int m12201c(long j9) {
        return (int) (j9 >> 32);
    }

    /* renamed from: d */
    public static final int m12202d(long j9) {
        return (int) (j9 & 4294967295L);
    }

    /* renamed from: b */
    public static long m12200b(long j9) {
        return j9;
    }
}
