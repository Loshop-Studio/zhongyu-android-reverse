package kotlin;

/* renamed from: kotlin.c */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class AbstractC8302c {
    /* renamed from: a */
    public static /* synthetic */ long m13423a(long j9, long j10) {
        if (j10 < 0) {
            return (j9 ^ Long.MIN_VALUE) < (j10 ^ Long.MIN_VALUE) ? j9 : j9 - j10;
        }
        if (j9 >= 0) {
            return j9 % j10;
        }
        long j11 = j9 - ((((j9 >>> 1) / j10) << 1) * j10);
        if ((j11 ^ Long.MIN_VALUE) < (j10 ^ Long.MIN_VALUE)) {
            j10 = 0;
        }
        return j11 - j10;
    }
}
