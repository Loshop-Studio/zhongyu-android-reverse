package androidx.cardview.widget;

import android.graphics.drawable.Drawable;

/* renamed from: androidx.cardview.widget.e */
/* loaded from: classes.dex */
class C0246e extends Drawable {

    /* renamed from: a */
    private static final double f1279a = Math.cos(Math.toRadians(45.0d));

    /* renamed from: a */
    static float m1084a(float f4, float f5, boolean z3) {
        return z3 ? (float) (f4 + ((1.0d - f1279a) * f5)) : f4;
    }

    /* renamed from: b */
    static float m1085b(float f4, float f5, boolean z3) {
        return z3 ? (float) ((f4 * 1.5f) + ((1.0d - f1279a) * f5)) : f4 * 1.5f;
    }
}
