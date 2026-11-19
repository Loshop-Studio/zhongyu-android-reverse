package p000a.p031h.p035d;

import android.graphics.Color;

/* renamed from: a.h.d.a */
/* loaded from: classes.dex */
public final class C0202a {
    static {
        new ThreadLocal();
    }

    /* renamed from: a */
    public static int m755a(int i, int i2) {
        int iAlpha = Color.alpha(i2);
        int iAlpha2 = Color.alpha(i);
        int i3 = 255 - (((255 - iAlpha2) * (255 - iAlpha)) / 255);
        return Color.argb(i3, m756b(Color.red(i), iAlpha2, Color.red(i2), iAlpha, i3), m756b(Color.green(i), iAlpha2, Color.green(i2), iAlpha, i3), m756b(Color.blue(i), iAlpha2, Color.blue(i2), iAlpha, i3));
    }

    /* renamed from: b */
    public static int m756b(int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            return 0;
        }
        return (((255 - i2) * (i3 * i4)) + ((i * 255) * i2)) / (i5 * 255);
    }

    /* renamed from: c */
    public static int m757c(int i, int i2) {
        if (i2 < 0 || i2 > 255) {
            throw new IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (i & 16777215) | (i2 << 24);
    }
}
