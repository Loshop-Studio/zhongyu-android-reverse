package p055f2;

import android.graphics.Rect;

/* renamed from: f2.a */
/* loaded from: classes3.dex */
public abstract class AbstractC6296a {
    /* renamed from: a */
    public static float m6446a(float f6, float f7, float f8, float f9) {
        return (f8 - f6) / (f9 - f7);
    }

    /* renamed from: b */
    public static float m6447b(Rect rect) {
        return rect.width() / rect.height();
    }

    /* renamed from: c */
    public static float m6448c(float f6, float f7, float f8, float f9) {
        return ((f8 - f6) / f9) + f7;
    }

    /* renamed from: d */
    public static float m6449d(float f6, float f7, float f8) {
        return (f7 - f6) / f8;
    }

    /* renamed from: e */
    public static float m6450e(float f6, float f7, float f8, float f9) {
        return f7 - (f9 * (f8 - f6));
    }

    /* renamed from: f */
    public static float m6451f(float f6, float f7, float f8, float f9) {
        return (f9 * (f8 - f7)) + f6;
    }

    /* renamed from: g */
    public static float m6452g(float f6, float f7, float f8, float f9) {
        return f8 - ((f7 - f6) / f9);
    }

    /* renamed from: h */
    public static float m6453h(float f6, float f7, float f8) {
        return f8 * (f7 - f6);
    }
}
