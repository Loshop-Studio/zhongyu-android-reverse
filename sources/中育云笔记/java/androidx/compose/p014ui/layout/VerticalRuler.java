package androidx.compose.p014ui.layout;

import androidx.compose.p014ui.geometry.Offset;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class VerticalRuler extends Ruler {
    public static final int $stable = 0;

    public VerticalRuler() {
        super(null);
    }

    @Override // androidx.compose.p014ui.layout.Ruler
    public float calculateCoordinate$ui_release(float f10, LayoutCoordinates layoutCoordinates, LayoutCoordinates layoutCoordinates2) {
        float fMo32237getSizeYbymL2g = ((int) (layoutCoordinates.mo32237getSizeYbymL2g() & 4294967295L)) / 2.0f;
        return Float.intBitsToFloat((int) (layoutCoordinates2.mo32238localPositionOfR5De75A(layoutCoordinates, Offset.m30629constructorimpl((Float.floatToRawIntBits(fMo32237getSizeYbymL2g) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32))) >> 32));
    }
}
