package kotlin;

/* renamed from: kotlin.c */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class AbstractC6704c {
    /* renamed from: a */
    public static /* synthetic */ long m7890a(long j6, long j7) {
        if (j7 < 0) {
            return (j6 ^ Long.MIN_VALUE) < (j7 ^ Long.MIN_VALUE) ? j6 : j6 - j7;
        }
        if (j6 >= 0) {
            return j6 % j7;
        }
        long j8 = j6 - ((((j6 >>> 1) / j7) << 1) * j7);
        if ((j8 ^ Long.MIN_VALUE) < (j7 ^ Long.MIN_VALUE)) {
            j7 = 0;
        }
        return j8 - j7;
    }
}
