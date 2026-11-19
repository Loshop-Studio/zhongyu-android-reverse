package com.google.android.material.transition.platform;

/* loaded from: classes.dex */
class FadeModeEvaluators {

    /* renamed from: IN */
    private static final FadeModeEvaluator f7404IN = new FadeModeEvaluator() { // from class: com.google.android.material.transition.platform.FadeModeEvaluators.1
        @Override // com.google.android.material.transition.platform.FadeModeEvaluator
        public FadeModeResult evaluate(float f4, float f5, float f6) {
            return FadeModeResult.endOnTop(255, TransitionUtils.lerp(0, 255, f5, f6, f4));
        }
    };
    private static final FadeModeEvaluator OUT = new FadeModeEvaluator() { // from class: com.google.android.material.transition.platform.FadeModeEvaluators.2
        @Override // com.google.android.material.transition.platform.FadeModeEvaluator
        public FadeModeResult evaluate(float f4, float f5, float f6) {
            return FadeModeResult.startOnTop(TransitionUtils.lerp(255, 0, f5, f6, f4), 255);
        }
    };
    private static final FadeModeEvaluator CROSS = new FadeModeEvaluator() { // from class: com.google.android.material.transition.platform.FadeModeEvaluators.3
        @Override // com.google.android.material.transition.platform.FadeModeEvaluator
        public FadeModeResult evaluate(float f4, float f5, float f6) {
            return FadeModeResult.startOnTop(TransitionUtils.lerp(255, 0, f5, f6, f4), TransitionUtils.lerp(0, 255, f5, f6, f4));
        }
    };
    private static final FadeModeEvaluator THROUGH = new FadeModeEvaluator() { // from class: com.google.android.material.transition.platform.FadeModeEvaluators.4
        @Override // com.google.android.material.transition.platform.FadeModeEvaluator
        public FadeModeResult evaluate(float f4, float f5, float f6) {
            float f7 = ((f6 - f5) * 0.35f) + f5;
            return FadeModeResult.startOnTop(TransitionUtils.lerp(255, 0, f5, f7, f4), TransitionUtils.lerp(0, 255, f7, f6, f4));
        }
    };

    private FadeModeEvaluators() {
    }

    static FadeModeEvaluator get(int i4, boolean z3) {
        if (i4 == 0) {
            return z3 ? f7404IN : OUT;
        }
        if (i4 == 1) {
            return z3 ? OUT : f7404IN;
        }
        if (i4 == 2) {
            return CROSS;
        }
        if (i4 == 3) {
            return THROUGH;
        }
        throw new IllegalArgumentException("Invalid fade mode: " + i4);
    }
}
