package p211jd;

/* renamed from: jd.c */
/* loaded from: classes6.dex */
public abstract class AbstractC9719c extends AbstractC9718b {
    /* renamed from: a */
    public static int m19279a(int i10) {
        return Integer.signum(i10);
    }

    /* renamed from: b */
    public static int m19280b(long j10) {
        return Long.signum(j10);
    }

    /* renamed from: c */
    public static int m19281c(double d10) {
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
    public static int m19282d(float f10) {
        if (Float.isNaN(f10)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(f10);
    }

    /* renamed from: e */
    public static long m19283e(double d10) {
        if (Double.isNaN(d10)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(d10);
    }

    /* renamed from: f */
    public static long m19284f(float f10) {
        return m19283e(f10);
    }
}
