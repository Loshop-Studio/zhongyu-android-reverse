package kotlin;

/* renamed from: kotlin.c */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class AbstractC7920c {
    /* renamed from: a */
    public static /* synthetic */ long m13568a(long j10, long j11) {
        if (j11 < 0) {
            return (j10 ^ Long.MIN_VALUE) < (j11 ^ Long.MIN_VALUE) ? j10 : j10 - j11;
        }
        if (j10 >= 0) {
            return j10 % j11;
        }
        long j12 = j10 - ((((j10 >>> 1) / j11) << 1) * j11);
        if ((j12 ^ Long.MIN_VALUE) < (j11 ^ Long.MIN_VALUE)) {
            j11 = 0;
        }
        return j12 - j11;
    }
}
