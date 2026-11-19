package p023c0;

/* renamed from: c0.o */
/* loaded from: classes3.dex */
public abstract class AbstractC4470o {
    /* renamed from: a */
    public static long m1549a(int i6, int i7) {
        return m1550b((i7 & 4294967295L) | (i6 << 32));
    }

    /* renamed from: c */
    public static final int m1551c(long j6) {
        return (int) (j6 >> 32);
    }

    /* renamed from: d */
    public static final int m1552d(long j6) {
        return (int) (j6 & 4294967295L);
    }

    /* renamed from: b */
    public static long m1550b(long j6) {
        return j6;
    }
}
