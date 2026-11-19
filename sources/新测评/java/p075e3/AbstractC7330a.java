package p075e3;

import android.graphics.Rect;

/* renamed from: e3.a */
/* loaded from: classes4.dex */
public abstract class AbstractC7330a {
    /* renamed from: a */
    public static float m11714a(float f10, float f11, float f12, float f13) {
        return (f12 - f10) / (f13 - f11);
    }

    /* renamed from: b */
    public static float m11715b(Rect rect) {
        return rect.width() / rect.height();
    }

    /* renamed from: c */
    public static float m11716c(float f10, float f11, float f12, float f13) {
        return ((f12 - f10) / f13) + f11;
    }

    /* renamed from: d */
    public static float m11717d(float f10, float f11, float f12) {
        return (f11 - f10) / f12;
    }

    /* renamed from: e */
    public static float m11718e(float f10, float f11, float f12, float f13) {
        return f11 - (f13 * (f12 - f10));
    }

    /* renamed from: f */
    public static float m11719f(float f10, float f11, float f12, float f13) {
        return (f13 * (f12 - f11)) + f10;
    }

    /* renamed from: g */
    public static float m11720g(float f10, float f11, float f12, float f13) {
        return f12 - ((f11 - f10) / f13);
    }

    /* renamed from: h */
    public static float m11721h(float f10, float f11, float f12) {
        return f12 * (f11 - f10);
    }
}
