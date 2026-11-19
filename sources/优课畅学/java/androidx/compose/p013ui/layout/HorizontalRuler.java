package androidx.compose.p013ui.layout;

import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class HorizontalRuler extends Ruler {
    public static final int $stable = 0;

    public HorizontalRuler() {
        super(null);
    }

    @Override // androidx.compose.p013ui.layout.Ruler
    public float calculateCoordinate$ui_release(float f10, LayoutCoordinates layoutCoordinates, LayoutCoordinates layoutCoordinates2) {
        return Float.intBitsToFloat((int) (layoutCoordinates2.mo25636localPositionOfR5De75A(layoutCoordinates, Offset.m24027constructorimpl((Float.floatToRawIntBits(((int) (layoutCoordinates.mo25635getSizeYbymL2g() >> 32)) / 2.0f) << 32) | (Float.floatToRawIntBits(f10) & 4294967295L))) & 4294967295L));
    }
}
