package kotlin;

/* renamed from: kotlin.d */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class AbstractC6767d {
    /* renamed from: a */
    public static /* synthetic */ long m7925a(long j6, long j7) {
        if (j7 < 0) {
            return (j6 ^ Long.MIN_VALUE) < (j7 ^ Long.MIN_VALUE) ? 0L : 1L;
        }
        if (j6 >= 0) {
            return j6 / j7;
        }
        long j8 = ((j6 >>> 1) / j7) << 1;
        return j8 + (((j6 - (j8 * j7)) ^ Long.MIN_VALUE) < (j7 ^ Long.MIN_VALUE) ? 0 : 1);
    }
}
