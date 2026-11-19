package p152t;

import android.graphics.Color;

/* renamed from: t.d */
/* loaded from: classes.dex */
public final class C3385d {

    /* renamed from: a */
    private static final ThreadLocal<double[]> f11898a = new ThreadLocal<>();

    /* renamed from: a */
    private static int m10300a(int i4, int i5) {
        return 255 - (((255 - i5) * (255 - i4)) / 255);
    }

    /* renamed from: b */
    public static int m10301b(int i4, int i5) {
        int iAlpha = Color.alpha(i5);
        int iAlpha2 = Color.alpha(i4);
        int iM10300a = m10300a(iAlpha2, iAlpha);
        return Color.argb(iM10300a, m10302c(Color.red(i4), iAlpha2, Color.red(i5), iAlpha, iM10300a), m10302c(Color.green(i4), iAlpha2, Color.green(i5), iAlpha, iM10300a), m10302c(Color.blue(i4), iAlpha2, Color.blue(i5), iAlpha, iM10300a));
    }

    /* renamed from: c */
    private static int m10302c(int i4, int i5, int i6, int i7, int i8) {
        if (i8 == 0) {
            return 0;
        }
        return (((i4 * 255) * i5) + ((i6 * i7) * (255 - i5))) / (i8 * 255);
    }

    /* renamed from: d */
    public static int m10303d(int i4, int i5) {
        if (i5 < 0 || i5 > 255) {
            throw new IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (i4 & 16777215) | (i5 << 24);
    }
}
