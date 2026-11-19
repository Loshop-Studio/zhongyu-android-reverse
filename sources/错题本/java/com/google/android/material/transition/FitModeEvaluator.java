package com.google.android.material.transition;

import android.graphics.RectF;

/* loaded from: classes2.dex */
interface FitModeEvaluator {
    void applyMask(RectF rectF, float f, FitModeResult fitModeResult);

    FitModeResult evaluate(float f, float f7, float f8, float f9, float f10, float f11, float f12);

    boolean shouldMaskStartBounds(FitModeResult fitModeResult);
}
