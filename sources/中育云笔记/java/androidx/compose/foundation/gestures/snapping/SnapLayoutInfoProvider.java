package androidx.compose.foundation.gestures.snapping;

/* loaded from: classes.dex */
public interface SnapLayoutInfoProvider {
    default float calculateApproachOffset(float f10, float f11) {
        return f11;
    }

    float calculateSnapOffset(float f10);
}
