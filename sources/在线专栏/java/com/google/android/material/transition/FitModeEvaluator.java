package com.google.android.material.transition;

import android.graphics.RectF;

/* loaded from: classes.dex */
interface FitModeEvaluator {
    void applyMask(RectF rectF, float f4, FitModeResult fitModeResult);

    FitModeResult evaluate(float f4, float f5, float f6, float f7, float f8, float f9, float f10);

    boolean shouldMaskStartBounds(FitModeResult fitModeResult);
}
