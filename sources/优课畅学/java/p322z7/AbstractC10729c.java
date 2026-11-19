package p322z7;

/* renamed from: z7.c */
/* loaded from: classes5.dex */
public abstract class AbstractC10729c extends AbstractC10728b {
    /* renamed from: a */
    public static int m20032a(int i10) {
        return Integer.signum(i10);
    }

    /* renamed from: b */
    public static int m20033b(long j10) {
        return Long.signum(j10);
    }

    /* renamed from: c */
    public static int m20034c(double d10) {
        if (Double.isNaN(d10)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        if (d10 > 2.147483647E9d) {
            return Integer.MAX_VALUE;
        }
        if (d10 < -2.147483648E9d) {
            return Integer.MIN_VALUE;
        }
        return (int) Math.round(d10);
    }

    /* renamed from: d */
    public static int m20035d(float f10) {
        if (Float.isNaN(f10)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(f10);
    }

    /* renamed from: e */
    public static long m20036e(double d10) {
        if (Double.isNaN(d10)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(d10);
    }

    /* renamed from: f */
    public static long m20037f(float f10) {
        return m20036e(f10);
    }
}
