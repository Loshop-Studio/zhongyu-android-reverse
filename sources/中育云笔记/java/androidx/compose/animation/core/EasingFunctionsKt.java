package androidx.compose.animation.core;

/* loaded from: classes.dex */
public final class EasingFunctionsKt {
    private static final Easing Ease = new CubicBezierEasing(0.25f, 0.1f, 0.25f, 1.0f);
    private static final Easing EaseOut = new CubicBezierEasing(0.0f, 0.0f, 0.58f, 1.0f);
    private static final Easing EaseIn = new CubicBezierEasing(0.42f, 0.0f, 1.0f, 1.0f);
    private static final Easing EaseInOut = new CubicBezierEasing(0.42f, 0.0f, 0.58f, 1.0f);
    private static final Easing EaseInSine = new CubicBezierEasing(0.12f, 0.0f, 0.39f, 0.0f);
    private static final Easing EaseOutSine = new CubicBezierEasing(0.61f, 1.0f, 0.88f, 1.0f);
    private static final Easing EaseInOutSine = new CubicBezierEasing(0.37f, 0.0f, 0.63f, 1.0f);
    private static final Easing EaseInCubic = new CubicBezierEasing(0.32f, 0.0f, 0.67f, 0.0f);
    private static final Easing EaseOutCubic = new CubicBezierEasing(0.33f, 1.0f, 0.68f, 1.0f);
    private static final Easing EaseInOutCubic = new CubicBezierEasing(0.65f, 0.0f, 0.35f, 1.0f);
    private static final Easing EaseInQuint = new CubicBezierEasing(0.64f, 0.0f, 0.78f, 0.0f);
    private static final Easing EaseOutQuint = new CubicBezierEasing(0.22f, 1.0f, 0.36f, 1.0f);
    private static final Easing EaseInOutQuint = new CubicBezierEasing(0.83f, 0.0f, 0.17f, 1.0f);
    private static final Easing EaseInCirc = new CubicBezierEasing(0.55f, 0.0f, 1.0f, 0.45f);
    private static final Easing EaseOutCirc = new CubicBezierEasing(0.0f, 0.55f, 0.45f, 1.0f);
    private static final Easing EaseInOutCirc = new CubicBezierEasing(0.85f, 0.0f, 0.15f, 1.0f);
    private static final Easing EaseInQuad = new CubicBezierEasing(0.11f, 0.0f, 0.5f, 0.0f);
    private static final Easing EaseOutQuad = new CubicBezierEasing(0.5f, 1.0f, 0.89f, 1.0f);
    private static final Easing EaseInOutQuad = new CubicBezierEasing(0.45f, 0.0f, 0.55f, 1.0f);
    private static final Easing EaseInQuart = new CubicBezierEasing(0.5f, 0.0f, 0.75f, 0.0f);
    private static final Easing EaseOutQuart = new CubicBezierEasing(0.25f, 1.0f, 0.5f, 1.0f);
    private static final Easing EaseInOutQuart = new CubicBezierEasing(0.76f, 0.0f, 0.24f, 1.0f);
    private static final Easing EaseInExpo = new CubicBezierEasing(0.7f, 0.0f, 0.84f, 0.0f);
    private static final Easing EaseOutExpo = new CubicBezierEasing(0.16f, 1.0f, 0.3f, 1.0f);
    private static final Easing EaseInOutExpo = new CubicBezierEasing(0.87f, 0.0f, 0.13f, 1.0f);
    private static final Easing EaseInBack = new CubicBezierEasing(0.36f, 0.0f, 0.66f, -0.56f);
    private static final Easing EaseOutBack = new CubicBezierEasing(0.34f, 1.56f, 0.64f, 1.0f);
    private static final Easing EaseInOutBack = new CubicBezierEasing(0.68f, -0.6f, 0.32f, 1.6f);
    private static final Easing EaseInElastic = new Easing() { // from class: androidx.compose.animation.core.a
        @Override // androidx.compose.animation.core.Easing
        public final float transform(float f10) {
            return EasingFunctionsKt.EaseInElastic$lambda$0(f10);
        }
    };
    private static final Easing EaseOutElastic = new Easing() { // from class: androidx.compose.animation.core.b
        @Override // androidx.compose.animation.core.Easing
        public final float transform(float f10) {
            return EasingFunctionsKt.EaseOutElastic$lambda$1(f10);
        }
    };
    private static final Easing EaseInOutElastic = new Easing() { // from class: androidx.compose.animation.core.c
        @Override // androidx.compose.animation.core.Easing
        public final float transform(float f10) {
            return EasingFunctionsKt.EaseInOutElastic$lambda$2(f10);
        }
    };
    private static final Easing EaseOutBounce = new Easing() { // from class: androidx.compose.animation.core.d
        @Override // androidx.compose.animation.core.Easing
        public final float transform(float f10) {
            return EasingFunctionsKt.EaseOutBounce$lambda$3(f10);
        }
    };
    private static final Easing EaseInBounce = new Easing() { // from class: androidx.compose.animation.core.e
        @Override // androidx.compose.animation.core.Easing
        public final float transform(float f10) {
            return EasingFunctionsKt.EaseInBounce$lambda$4(f10);
        }
    };
    private static final Easing EaseInOutBounce = new Easing() { // from class: androidx.compose.animation.core.f
        @Override // androidx.compose.animation.core.Easing
        public final float transform(float f10) {
            return EasingFunctionsKt.EaseInOutBounce$lambda$5(f10);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final float EaseInBounce$lambda$4(float f10) {
        return 1 - EaseOutBounce.transform(1.0f - f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float EaseInElastic$lambda$0(float f10) {
        if (f10 == 0.0f) {
            return 0.0f;
        }
        if (f10 == 1.0f) {
            return 1.0f;
        }
        float f11 = f10 * 10.0f;
        return (float) ((-((float) Math.pow(2.0f, f11 - 10.0f))) * Math.sin((f11 - 10.75f) * 2.0943951023931953d));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float EaseInOutBounce$lambda$5(float f10) {
        return (((double) f10) < 0.5d ? 1 - EaseOutBounce.transform(1.0f - (f10 * 2.0f)) : 1 + EaseOutBounce.transform((f10 * 2.0f) - 1.0f)) / 2.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float EaseInOutElastic$lambda$2(float f10) {
        if (f10 == 0.0f) {
            return 0.0f;
        }
        if (f10 == 1.0f) {
            return 1.0f;
        }
        if (0.0f > f10 || f10 > 0.5f) {
            return ((float) ((((float) Math.pow(r8, ((-20.0f) * f10) + 10.0f)) * Math.sin(((f10 * 20.0f) - 11.125f) * 1.3962634015954636d)) / 2.0f)) + 1.0f;
        }
        float f11 = f10 * 20.0f;
        return (float) ((-(((float) Math.pow(r0, f11 - 10.0f)) * Math.sin((f11 - 11.125f) * 1.3962634015954636d))) / 2.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float EaseOutBounce$lambda$3(float f10) {
        if (f10 < 0.36363637f) {
            return 7.5625f * f10 * f10;
        }
        if (f10 < 0.72727275f) {
            float f11 = f10 - 0.54545456f;
            return (7.5625f * f11 * f11) + 0.75f;
        }
        if (f10 < 0.90909094f) {
            float f12 = f10 - 0.8181818f;
            return (7.5625f * f12 * f12) + 0.9375f;
        }
        float f13 = f10 - 0.95454544f;
        return (7.5625f * f13 * f13) + 0.984375f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float EaseOutElastic$lambda$1(float f10) {
        if (f10 == 0.0f) {
            return 0.0f;
        }
        if (f10 == 1.0f) {
            return 1.0f;
        }
        return (float) ((((float) Math.pow(2.0f, (-10.0f) * f10)) * Math.sin(((f10 * 10.0f) - 0.75f) * 2.0943951023931953d)) + 1.0f);
    }

    public static final Easing getEase() {
        return Ease;
    }

    public static final Easing getEaseIn() {
        return EaseIn;
    }

    public static final Easing getEaseInBack() {
        return EaseInBack;
    }

    public static final Easing getEaseInBounce() {
        return EaseInBounce;
    }

    public static final Easing getEaseInCirc() {
        return EaseInCirc;
    }

    public static final Easing getEaseInCubic() {
        return EaseInCubic;
    }

    public static final Easing getEaseInElastic() {
        return EaseInElastic;
    }

    public static final Easing getEaseInExpo() {
        return EaseInExpo;
    }

    public static final Easing getEaseInOut() {
        return EaseInOut;
    }

    public static final Easing getEaseInOutBack() {
        return EaseInOutBack;
    }

    public static final Easing getEaseInOutBounce() {
        return EaseInOutBounce;
    }

    public static final Easing getEaseInOutCirc() {
        return EaseInOutCirc;
    }

    public static final Easing getEaseInOutCubic() {
        return EaseInOutCubic;
    }

    public static final Easing getEaseInOutElastic() {
        return EaseInOutElastic;
    }

    public static final Easing getEaseInOutExpo() {
        return EaseInOutExpo;
    }

    public static final Easing getEaseInOutQuad() {
        return EaseInOutQuad;
    }

    public static final Easing getEaseInOutQuart() {
        return EaseInOutQuart;
    }

    public static final Easing getEaseInOutQuint() {
        return EaseInOutQuint;
    }

    public static final Easing getEaseInOutSine() {
        return EaseInOutSine;
    }

    public static final Easing getEaseInQuad() {
        return EaseInQuad;
    }

    public static final Easing getEaseInQuart() {
        return EaseInQuart;
    }

    public static final Easing getEaseInQuint() {
        return EaseInQuint;
    }

    public static final Easing getEaseInSine() {
        return EaseInSine;
    }

    public static final Easing getEaseOut() {
        return EaseOut;
    }

    public static final Easing getEaseOutBack() {
        return EaseOutBack;
    }

    public static final Easing getEaseOutBounce() {
        return EaseOutBounce;
    }

    public static final Easing getEaseOutCirc() {
        return EaseOutCirc;
    }

    public static final Easing getEaseOutCubic() {
        return EaseOutCubic;
    }

    public static final Easing getEaseOutElastic() {
        return EaseOutElastic;
    }

    public static final Easing getEaseOutExpo() {
        return EaseOutExpo;
    }

    public static final Easing getEaseOutQuad() {
        return EaseOutQuad;
    }

    public static final Easing getEaseOutQuart() {
        return EaseOutQuart;
    }

    public static final Easing getEaseOutQuint() {
        return EaseOutQuint;
    }

    public static final Easing getEaseOutSine() {
        return EaseOutSine;
    }
}
