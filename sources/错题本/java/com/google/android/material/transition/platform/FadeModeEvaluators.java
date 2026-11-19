package com.google.android.material.transition.platform;

import android.support.v4.media.AbstractC0037f;
import androidx.annotation.RequiresApi;

@RequiresApi(21)
/* loaded from: classes2.dex */
class FadeModeEvaluators {

    /* renamed from: IN */
    private static final FadeModeEvaluator f2948IN = new FadeModeEvaluator() { // from class: com.google.android.material.transition.platform.FadeModeEvaluators.1
        @Override // com.google.android.material.transition.platform.FadeModeEvaluator
        public FadeModeResult evaluate(float f, float f7, float f8, float f9) {
            return FadeModeResult.endOnTop(255, TransitionUtils.lerp(0, 255, f7, f8, f));
        }
    };
    private static final FadeModeEvaluator OUT = new FadeModeEvaluator() { // from class: com.google.android.material.transition.platform.FadeModeEvaluators.2
        @Override // com.google.android.material.transition.platform.FadeModeEvaluator
        public FadeModeResult evaluate(float f, float f7, float f8, float f9) {
            return FadeModeResult.startOnTop(TransitionUtils.lerp(255, 0, f7, f8, f), 255);
        }
    };
    private static final FadeModeEvaluator CROSS = new FadeModeEvaluator() { // from class: com.google.android.material.transition.platform.FadeModeEvaluators.3
        @Override // com.google.android.material.transition.platform.FadeModeEvaluator
        public FadeModeResult evaluate(float f, float f7, float f8, float f9) {
            return FadeModeResult.startOnTop(TransitionUtils.lerp(255, 0, f7, f8, f), TransitionUtils.lerp(0, 255, f7, f8, f));
        }
    };
    private static final FadeModeEvaluator THROUGH = new FadeModeEvaluator() { // from class: com.google.android.material.transition.platform.FadeModeEvaluators.4
        @Override // com.google.android.material.transition.platform.FadeModeEvaluator
        public FadeModeResult evaluate(float f, float f7, float f8, float f9) {
            float fM77b = AbstractC0037f.m77b(f8, f7, f9, f7);
            return FadeModeResult.startOnTop(TransitionUtils.lerp(255, 0, f7, fM77b, f), TransitionUtils.lerp(0, 255, fM77b, f8, f));
        }
    };

    private FadeModeEvaluators() {
    }

    public static FadeModeEvaluator get(int i, boolean z8) {
        if (i == 0) {
            return z8 ? f2948IN : OUT;
        }
        if (i == 1) {
            return z8 ? OUT : f2948IN;
        }
        if (i == 2) {
            return CROSS;
        }
        if (i == 3) {
            return THROUGH;
        }
        throw new IllegalArgumentException(AbstractC0037f.m81f(i, "Invalid fade mode: "));
    }
}
