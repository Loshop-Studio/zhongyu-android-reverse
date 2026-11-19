package com.canhub.cropper;

import android.graphics.RectF;
import android.view.ScaleGestureDetector;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: com.canhub.cropper.b0 */
/* loaded from: classes2.dex */
public final class C3426b0 extends ScaleGestureDetector.SimpleOnScaleGestureListener {

    /* renamed from: a */
    public final /* synthetic */ CropOverlayView f2558a;

    public C3426b0(CropOverlayView cropOverlayView) {
        this.f2558a = cropOverlayView;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector detector) {
        AbstractC5830k.m5330g(detector, "detector");
        CropOverlayView cropOverlayView = this.f2558a;
        C3432e0 c3432e0 = cropOverlayView.f2511g;
        C3432e0 c3432e02 = cropOverlayView.f2511g;
        RectF rectFM2462g = c3432e0.m2462g();
        float focusX = detector.getFocusX();
        float focusY = detector.getFocusY();
        float f = 2;
        float currentSpanY = detector.getCurrentSpanY() / f;
        float currentSpanX = detector.getCurrentSpanX() / f;
        float f7 = focusY - currentSpanY;
        float f8 = focusX - currentSpanX;
        float f9 = focusX + currentSpanX;
        float f10 = focusY + currentSpanY;
        if (f8 >= f9 || f7 > f10 || f8 < 0.0f || f9 > c3432e02.m2458c() || f7 < 0.0f || f10 > c3432e02.m2457b()) {
            return true;
        }
        rectFM2462g.set(f8, f7, f9, f10);
        c3432e02.f2579a.set(rectFM2462g);
        cropOverlayView.invalidate();
        return true;
    }
}
