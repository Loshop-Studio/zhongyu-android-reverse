package com.canhub.cropper;

import android.graphics.RectF;

/* renamed from: com.canhub.cropper.e0 */
/* loaded from: classes2.dex */
public final class C3432e0 {

    /* renamed from: c */
    public float f2581c;

    /* renamed from: d */
    public float f2582d;

    /* renamed from: e */
    public float f2583e;

    /* renamed from: f */
    public float f2584f;

    /* renamed from: g */
    public float f2585g;

    /* renamed from: h */
    public float f2586h;

    /* renamed from: i */
    public float f2587i;

    /* renamed from: j */
    public float f2588j;

    /* renamed from: a */
    public final RectF f2579a = new RectF();

    /* renamed from: b */
    public final RectF f2580b = new RectF();

    /* renamed from: k */
    public float f2589k = 1.0f;

    /* renamed from: l */
    public float f2590l = 1.0f;

    /* renamed from: a */
    public static float m2455a(float f, float f7, float f8, float f9) {
        return Math.max(Math.abs(f - f8), Math.abs(f7 - f9));
    }

    /* renamed from: h */
    public static boolean m2456h(float f, float f7, float f8, float f9, float f10, float f11) {
        return f > f8 && f < f10 && f7 > f9 && f7 < f11;
    }

    /* renamed from: b */
    public final float m2457b() {
        float f = this.f2584f;
        float f7 = this.f2588j / this.f2590l;
        return f > f7 ? f7 : f;
    }

    /* renamed from: c */
    public final float m2458c() {
        float f = this.f2583e;
        float f7 = this.f2587i / this.f2589k;
        return f > f7 ? f7 : f;
    }

    /* renamed from: d */
    public final float m2459d() {
        float f = this.f2582d;
        float f7 = this.f2586h / this.f2590l;
        return f < f7 ? f7 : f;
    }

    /* renamed from: e */
    public final float m2460e() {
        float f = this.f2581c;
        float f7 = this.f2585g / this.f2589k;
        return f < f7 ? f7 : f;
    }

    /* renamed from: f */
    public final CropWindowMoveHandler$Type m2461f(float f, float f7, boolean z8) {
        RectF rectF = this.f2579a;
        float f8 = 6;
        float fWidth = rectF.width() / f8;
        float f9 = rectF.left;
        float f10 = f9 + fWidth;
        float f11 = 5;
        float f12 = (fWidth * f11) + f9;
        float fHeight = rectF.height() / f8;
        float f13 = rectF.top;
        float f14 = f13 + fHeight;
        float f15 = (f11 * fHeight) + f13;
        if (f < f10) {
            return f7 < f14 ? CropWindowMoveHandler$Type.TOP_LEFT : f7 < f15 ? CropWindowMoveHandler$Type.LEFT : CropWindowMoveHandler$Type.BOTTOM_LEFT;
        }
        if (f >= f12) {
            return f7 < f14 ? CropWindowMoveHandler$Type.TOP_RIGHT : f7 < f15 ? CropWindowMoveHandler$Type.RIGHT : CropWindowMoveHandler$Type.BOTTOM_RIGHT;
        }
        if (f7 < f14) {
            return CropWindowMoveHandler$Type.TOP;
        }
        if (f7 >= f15) {
            return CropWindowMoveHandler$Type.BOTTOM;
        }
        if (z8) {
            return CropWindowMoveHandler$Type.CENTER;
        }
        return null;
    }

    /* renamed from: g */
    public final RectF m2462g() {
        RectF rectF = this.f2579a;
        RectF rectF2 = this.f2580b;
        rectF2.set(rectF);
        return rectF2;
    }
}
