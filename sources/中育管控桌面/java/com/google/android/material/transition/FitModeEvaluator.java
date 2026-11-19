package com.google.android.material.transition;

import android.graphics.RectF;

/* loaded from: classes3.dex */
interface FitModeEvaluator {
    void applyMask(RectF rectF, float f6, FitModeResult fitModeResult);

    FitModeResult evaluate(float f6, float f7, float f8, float f9, float f10, float f11, float f12);

    boolean shouldMaskStartBounds(FitModeResult fitModeResult);
}
