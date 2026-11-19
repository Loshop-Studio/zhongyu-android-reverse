package com.google.android.material.transition.platform;

import androidx.annotation.RequiresApi;

@RequiresApi(21)
/* loaded from: classes3.dex */
class FadeModeEvaluators {

    /* renamed from: IN */
    private static final FadeModeEvaluator f4449IN = new FadeModeEvaluator() { // from class: com.google.android.material.transition.platform.FadeModeEvaluators.1
        @Override // com.google.android.material.transition.platform.FadeModeEvaluator
        public FadeModeResult evaluate(float f10, float f11, float f12, float f13) {
            return FadeModeResult.endOnTop(255, TransitionUtils.lerp(0, 255, f11, f12, f10));
        }
    };
    private static final FadeModeEvaluator OUT = new FadeModeEvaluator() { // from class: com.google.android.material.transition.platform.FadeModeEvaluators.2
        @Override // com.google.android.material.transition.platform.FadeModeEvaluator
        public FadeModeResult evaluate(float f10, float f11, float f12, float f13) {
            return FadeModeResult.startOnTop(TransitionUtils.lerp(255, 0, f11, f12, f10), 255);
        }
    };
    private static final FadeModeEvaluator CROSS = new FadeModeEvaluator() { // from class: com.google.android.material.transition.platform.FadeModeEvaluators.3
        @Override // com.google.android.material.transition.platform.FadeModeEvaluator
        public FadeModeResult evaluate(float f10, float f11, float f12, float f13) {
            return FadeModeResult.startOnTop(TransitionUtils.lerp(255, 0, f11, f12, f10), TransitionUtils.lerp(0, 255, f11, f12, f10));
        }
    };
    private static final FadeModeEvaluator THROUGH = new FadeModeEvaluator() { // from class: com.google.android.material.transition.platform.FadeModeEvaluators.4
        @Override // com.google.android.material.transition.platform.FadeModeEvaluator
        public FadeModeResult evaluate(float f10, float f11, float f12, float f13) {
            float f14 = ((f12 - f11) * f13) + f11;
            return FadeModeResult.startOnTop(TransitionUtils.lerp(255, 0, f11, f14, f10), TransitionUtils.lerp(0, 255, f14, f12, f10));
        }
    };

    private FadeModeEvaluators() {
    }

    public static FadeModeEvaluator get(int i10, boolean z9) {
        if (i10 == 0) {
            return z9 ? f4449IN : OUT;
        }
        if (i10 == 1) {
            return z9 ? OUT : f4449IN;
        }
        if (i10 == 2) {
            return CROSS;
        }
        if (i10 == 3) {
            return THROUGH;
        }
        throw new IllegalArgumentException("Invalid fade mode: " + i10);
    }
}
