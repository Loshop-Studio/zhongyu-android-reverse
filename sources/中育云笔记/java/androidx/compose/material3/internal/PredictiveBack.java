package androidx.compose.material3.internal;

import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class PredictiveBack {
    public static final int $stable = 0;
    public static final PredictiveBack INSTANCE = new PredictiveBack();

    private PredictiveBack() {
    }

    public final float transform$material3_release(float f10) {
        return PredictiveBack_androidKt.PredictiveBackEasing.transform(f10);
    }
}
