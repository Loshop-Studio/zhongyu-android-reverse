package androidx.compose.animation.core;

import kotlin.Metadata;

@Metadata(m13557d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0000\"\u0011\u0010\u0000\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0011\u0010\u0004\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0003\"\u0011\u0010\u0006\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0003\"\u0011\u0010\b\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0003\"\u000e\u0010\n\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, m13558d2 = {"FastOutLinearInEasing", "Landroidx/compose/animation/core/Easing;", "getFastOutLinearInEasing", "()Landroidx/compose/animation/core/Easing;", "FastOutSlowInEasing", "getFastOutSlowInEasing", "LinearEasing", "getLinearEasing", "LinearOutSlowInEasing", "getLinearOutSlowInEasing", "OneUlpAt1", "", "animation-core_release"}, m13559k = 2, m13560mv = {1, 9, 0}, m13562xi = 48)
/* loaded from: classes.dex */
public final class EasingKt {
    private static final float OneUlpAt1 = 1.1920929E-7f;
    private static final Easing FastOutSlowInEasing = new CubicBezierEasing(0.4f, 0.0f, 0.2f, 1.0f);
    private static final Easing LinearOutSlowInEasing = new CubicBezierEasing(0.0f, 0.0f, 0.2f, 1.0f);
    private static final Easing FastOutLinearInEasing = new CubicBezierEasing(0.4f, 0.0f, 1.0f, 1.0f);
    private static final Easing LinearEasing = new Easing() { // from class: androidx.compose.animation.core.g
        @Override // androidx.compose.animation.core.Easing
        public final float transform(float f10) {
            return EasingKt.LinearEasing$lambda$0(f10);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final float LinearEasing$lambda$0(float f10) {
        return f10;
    }

    public static final Easing getFastOutLinearInEasing() {
        return FastOutLinearInEasing;
    }

    public static final Easing getFastOutSlowInEasing() {
        return FastOutSlowInEasing;
    }

    public static final Easing getLinearEasing() {
        return LinearEasing;
    }

    public static final Easing getLinearOutSlowInEasing() {
        return LinearOutSlowInEasing;
    }
}
