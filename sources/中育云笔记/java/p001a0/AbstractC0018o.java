package p001a0;

/* renamed from: a0.o */
/* loaded from: classes3.dex */
public abstract class AbstractC0018o {
    /* renamed from: a */
    public static long m32a(int i10, int i11) {
        return m33b((i11 & 4294967295L) | (i10 << 32));
    }

    /* renamed from: c */
    public static final int m34c(long j10) {
        return (int) (j10 >> 32);
    }

    /* renamed from: d */
    public static final int m35d(long j10) {
        return (int) (j10 & 4294967295L);
    }

    /* renamed from: b */
    public static long m33b(long j10) {
        return j10;
    }
}
