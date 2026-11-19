package com.google.android.material.transition;

/* loaded from: classes3.dex */
class FadeModeEvaluators {

    /* renamed from: IN */
    private static final FadeModeEvaluator f3582IN = new FadeModeEvaluator() { // from class: com.google.android.material.transition.FadeModeEvaluators.1
        @Override // com.google.android.material.transition.FadeModeEvaluator
        public FadeModeResult evaluate(float f6, float f7, float f8, float f9) {
            return FadeModeResult.endOnTop(255, TransitionUtils.lerp(0, 255, f7, f8, f6));
        }
    };
    private static final FadeModeEvaluator OUT = new FadeModeEvaluator() { // from class: com.google.android.material.transition.FadeModeEvaluators.2
        @Override // com.google.android.material.transition.FadeModeEvaluator
        public FadeModeResult evaluate(float f6, float f7, float f8, float f9) {
            return FadeModeResult.startOnTop(TransitionUtils.lerp(255, 0, f7, f8, f6), 255);
        }
    };
    private static final FadeModeEvaluator CROSS = new FadeModeEvaluator() { // from class: com.google.android.material.transition.FadeModeEvaluators.3
        @Override // com.google.android.material.transition.FadeModeEvaluator
        public FadeModeResult evaluate(float f6, float f7, float f8, float f9) {
            return FadeModeResult.startOnTop(TransitionUtils.lerp(255, 0, f7, f8, f6), TransitionUtils.lerp(0, 255, f7, f8, f6));
        }
    };
    private static final FadeModeEvaluator THROUGH = new FadeModeEvaluator() { // from class: com.google.android.material.transition.FadeModeEvaluators.4
        @Override // com.google.android.material.transition.FadeModeEvaluator
        public FadeModeResult evaluate(float f6, float f7, float f8, float f9) {
            float f10 = ((f8 - f7) * f9) + f7;
            return FadeModeResult.startOnTop(TransitionUtils.lerp(255, 0, f7, f10, f6), TransitionUtils.lerp(0, 255, f10, f8, f6));
        }
    };

    private FadeModeEvaluators() {
    }

    public static FadeModeEvaluator get(int i6, boolean z6) {
        if (i6 == 0) {
            return z6 ? f3582IN : OUT;
        }
        if (i6 == 1) {
            return z6 ? OUT : f3582IN;
        }
        if (i6 == 2) {
            return CROSS;
        }
        if (i6 == 3) {
            return THROUGH;
        }
        throw new IllegalArgumentException("Invalid fade mode: " + i6);
    }
}
