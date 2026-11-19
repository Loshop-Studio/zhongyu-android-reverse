package androidx.compose.foundation;

import androidx.compose.p014ui.unit.C3186Dp;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class MarqueeDefaults {
    public static final int $stable = 0;
    public static final MarqueeDefaults INSTANCE = new MarqueeDefaults();
    private static final int Iterations = 3;
    private static final int RepeatDelayMillis = 1200;
    private static final MarqueeSpacing Spacing = MarqueeSpacing.Companion.fractionOfContainer(0.33333334f);
    private static final float Velocity = C3186Dp.m33501constructorimpl(30);

    private MarqueeDefaults() {
    }

    public static /* synthetic */ void getIterations$annotations() {
    }

    public static /* synthetic */ void getRepeatDelayMillis$annotations() {
    }

    public final int getIterations() {
        return Iterations;
    }

    public final int getRepeatDelayMillis() {
        return RepeatDelayMillis;
    }

    public final MarqueeSpacing getSpacing() {
        return Spacing;
    }

    /* renamed from: getVelocity-D9Ej5fM, reason: not valid java name */
    public final float m27035getVelocityD9Ej5fM() {
        return Velocity;
    }
}
