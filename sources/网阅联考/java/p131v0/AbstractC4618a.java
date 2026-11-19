package p131v0;

import android.graphics.Rect;

/* renamed from: v0.a */
/* loaded from: classes2.dex */
public abstract class AbstractC4618a {
    /* renamed from: a */
    public static float m6388a(float f4, float f5, float f6, float f7) {
        return (f6 - f4) / (f7 - f5);
    }

    /* renamed from: b */
    public static float m6389b(Rect rect) {
        return rect.width() / rect.height();
    }

    /* renamed from: c */
    public static float m6390c(float f4, float f5, float f6, float f7) {
        return ((f6 - f4) / f7) + f5;
    }

    /* renamed from: d */
    public static float m6391d(float f4, float f5, float f6) {
        return (f5 - f4) / f6;
    }

    /* renamed from: e */
    public static float m6392e(float f4, float f5, float f6, float f7) {
        return f5 - (f7 * (f6 - f4));
    }

    /* renamed from: f */
    public static float m6393f(float f4, float f5, float f6, float f7) {
        return (f7 * (f6 - f5)) + f4;
    }

    /* renamed from: g */
    public static float m6394g(float f4, float f5, float f6, float f7) {
        return f6 - ((f5 - f4) / f7);
    }

    /* renamed from: h */
    public static float m6395h(float f4, float f5, float f6) {
        return f6 * (f5 - f4);
    }
}
