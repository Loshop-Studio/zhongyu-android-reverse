package kotlin;

/* renamed from: kotlin.d */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC3922d {
    /* renamed from: a */
    public static /* synthetic */ long m5199a(long j4, long j5) {
        if (j5 < 0) {
            return (j4 ^ Long.MIN_VALUE) < (j5 ^ Long.MIN_VALUE) ? j4 : j4 - j5;
        }
        if (j4 >= 0) {
            return j4 % j5;
        }
        long j6 = j4 - ((((j4 >>> 1) / j5) << 1) * j5);
        if ((j6 ^ Long.MIN_VALUE) < (j5 ^ Long.MIN_VALUE)) {
            j5 = 0;
        }
        return j6 - j5;
    }
}
