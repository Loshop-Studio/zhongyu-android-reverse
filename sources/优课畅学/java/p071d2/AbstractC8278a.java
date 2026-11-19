package p071d2;

import android.graphics.Rect;

/* renamed from: d2.a */
/* loaded from: classes4.dex */
public abstract class AbstractC8278a {
    /* renamed from: a */
    public static float m13430a(float f10, float f11, float f12, float f13) {
        return (f12 - f10) / (f13 - f11);
    }

    /* renamed from: b */
    public static float m13431b(Rect rect) {
        return rect.width() / rect.height();
    }

    /* renamed from: c */
    public static float m13432c(float f10, float f11, float f12, float f13) {
        return ((f12 - f10) / f13) + f11;
    }

    /* renamed from: d */
    public static float m13433d(float f10, float f11, float f12) {
        return (f11 - f10) / f12;
    }

    /* renamed from: e */
    public static float m13434e(float f10, float f11, float f12, float f13) {
        return f11 - (f13 * (f12 - f10));
    }

    /* renamed from: f */
    public static float m13435f(float f10, float f11, float f12, float f13) {
        return (f13 * (f12 - f11)) + f10;
    }

    /* renamed from: g */
    public static float m13436g(float f10, float f11, float f12, float f13) {
        return f12 - ((f11 - f10) / f13);
    }

    /* renamed from: h */
    public static float m13437h(float f10, float f11, float f12) {
        return f12 * (f11 - f10);
    }
}
