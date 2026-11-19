package androidx.compose.p013ui.layout;

import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class VerticalRuler extends Ruler {
    public static final int $stable = 0;

    public VerticalRuler() {
        super(null);
    }

    @Override // androidx.compose.p013ui.layout.Ruler
    public float calculateCoordinate$ui_release(float f10, LayoutCoordinates layoutCoordinates, LayoutCoordinates layoutCoordinates2) {
        float fMo25635getSizeYbymL2g = ((int) (layoutCoordinates.mo25635getSizeYbymL2g() & 4294967295L)) / 2.0f;
        return Float.intBitsToFloat((int) (layoutCoordinates2.mo25636localPositionOfR5De75A(layoutCoordinates, Offset.m24027constructorimpl((Float.floatToRawIntBits(fMo25635getSizeYbymL2g) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32))) >> 32));
    }
}
