package kotlin;

/* renamed from: kotlin.d */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class AbstractC8365d {
    /* renamed from: a */
    public static /* synthetic */ long m13458a(long j9, long j10) {
        if (j10 < 0) {
            return (j9 ^ Long.MIN_VALUE) < (j10 ^ Long.MIN_VALUE) ? 0L : 1L;
        }
        if (j9 >= 0) {
            return j9 / j10;
        }
        long j11 = ((j9 >>> 1) / j10) << 1;
        return j11 + (((j9 - (j11 * j10)) ^ Long.MIN_VALUE) < (j10 ^ Long.MIN_VALUE) ? 0 : 1);
    }
}
