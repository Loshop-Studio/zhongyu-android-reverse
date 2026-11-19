package com.canhub.cropper;

import android.graphics.RectF;
import android.support.v4.media.AbstractC0037f;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.ImageView;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: com.canhub.cropper.r */
/* loaded from: classes2.dex */
public final class AnimationAnimationListenerC3447r extends Animation implements Animation.AnimationListener {

    /* renamed from: a */
    public final ImageView f2617a;

    /* renamed from: b */
    public final CropOverlayView f2618b;

    /* renamed from: c */
    public final float[] f2619c;

    /* renamed from: d */
    public final float[] f2620d;

    /* renamed from: e */
    public final RectF f2621e;

    /* renamed from: f */
    public final RectF f2622f;

    /* renamed from: g */
    public final float[] f2623g;

    /* renamed from: h */
    public final float[] f2624h;

    public AnimationAnimationListenerC3447r(ImageView imageView, CropOverlayView cropOverlayView) {
        AbstractC5830k.m5330g(imageView, "imageView");
        AbstractC5830k.m5330g(cropOverlayView, "cropOverlayView");
        this.f2617a = imageView;
        this.f2618b = cropOverlayView;
        this.f2619c = new float[8];
        this.f2620d = new float[8];
        this.f2621e = new RectF();
        this.f2622f = new RectF();
        this.f2623g = new float[9];
        this.f2624h = new float[9];
        setDuration(300L);
        setFillAfter(true);
        setInterpolator(new AccelerateDecelerateInterpolator());
        setAnimationListener(this);
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation t8) {
        AbstractC5830k.m5330g(t8, "t");
        RectF rectF = new RectF();
        RectF rectF2 = this.f2621e;
        float f7 = rectF2.left;
        RectF rectF3 = this.f2622f;
        rectF.left = AbstractC0037f.m77b(rectF3.left, f7, f, f7);
        float f8 = rectF2.top;
        rectF.top = AbstractC0037f.m77b(rectF3.top, f8, f, f8);
        float f9 = rectF2.right;
        rectF.right = AbstractC0037f.m77b(rectF3.right, f9, f, f9);
        float f10 = rectF2.bottom;
        rectF.bottom = AbstractC0037f.m77b(rectF3.bottom, f10, f, f10);
        float[] fArr = new float[8];
        for (int i = 0; i < 8; i++) {
            float f11 = this.f2619c[i];
            fArr[i] = AbstractC0037f.m77b(this.f2620d[i], f11, f, f11);
        }
        CropOverlayView cropOverlayView = this.f2618b;
        cropOverlayView.setCropWindowRect(rectF);
        ImageView imageView = this.f2617a;
        cropOverlayView.m2453h(fArr, imageView.getWidth(), imageView.getHeight());
        cropOverlayView.invalidate();
        float[] fArr2 = new float[9];
        for (int i8 = 0; i8 < 9; i8++) {
            float f12 = this.f2623g[i8];
            fArr2[i8] = AbstractC0037f.m77b(this.f2624h[i8], f12, f, f12);
        }
        imageView.getImageMatrix().setValues(fArr2);
        imageView.invalidate();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        AbstractC5830k.m5330g(animation, "animation");
        this.f2617a.clearAnimation();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        AbstractC5830k.m5330g(animation, "animation");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        AbstractC5830k.m5330g(animation, "animation");
    }
}
