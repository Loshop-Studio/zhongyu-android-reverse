package p030c0;

/* renamed from: c0.o */
/* loaded from: classes3.dex */
public abstract class AbstractC5090o {
    /* renamed from: a */
    public static long m2691a(int i10, int i11) {
        return m2692b((i11 & 4294967295L) | (i10 << 32));
    }

    /* renamed from: c */
    public static final int m2693c(long j10) {
        return (int) (j10 >> 32);
    }

    /* renamed from: d */
    public static final int m2694d(long j10) {
        return (int) (j10 & 4294967295L);
    }

    /* renamed from: b */
    public static long m2692b(long j10) {
        return j10;
    }
}
