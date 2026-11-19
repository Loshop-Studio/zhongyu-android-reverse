package p262n8;

import android.graphics.Rect;

/* renamed from: n8.a */
/* loaded from: classes5.dex */
public abstract class AbstractC10327a {
    /* renamed from: a */
    public static float m21562a(float f10, float f11, float f12, float f13) {
        return (f12 - f10) / (f13 - f11);
    }

    /* renamed from: b */
    public static float m21563b(Rect rect) {
        return rect.width() / rect.height();
    }

    /* renamed from: c */
    public static float m21564c(float f10, float f11, float f12, float f13) {
        return ((f12 - f10) / f13) + f11;
    }

    /* renamed from: d */
    public static float m21565d(float f10, float f11, float f12) {
        return (f11 - f10) / f12;
    }

    /* renamed from: e */
    public static float m21566e(float f10, float f11, float f12, float f13) {
        return f11 - (f13 * (f12 - f10));
    }

    /* renamed from: f */
    public static float m21567f(float f10, float f11, float f12, float f13) {
        return (f13 * (f12 - f11)) + f10;
    }

    /* renamed from: g */
    public static float m21568g(float f10, float f11, float f12, float f13) {
        return f12 - ((f11 - f10) / f13);
    }

    /* renamed from: h */
    public static float m21569h(float f10, float f11, float f12) {
        return f12 * (f11 - f10);
    }
}
