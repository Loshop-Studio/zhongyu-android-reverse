package androidx.compose.foundation;

import androidx.compose.p014ui.geometry.Rect;
import androidx.compose.p014ui.graphics.Outline;
import androidx.compose.p014ui.graphics.Shape;
import androidx.compose.p014ui.unit.Density;
import androidx.compose.p014ui.unit.LayoutDirection;

/* loaded from: classes.dex */
final class HorizontalScrollableClipShape implements Shape {
    public static final HorizontalScrollableClipShape INSTANCE = new HorizontalScrollableClipShape();

    private HorizontalScrollableClipShape() {
    }

    @Override // androidx.compose.p014ui.graphics.Shape
    /* renamed from: createOutline-Pq9zytI, reason: not valid java name */
    public Outline mo27009createOutlinePq9zytI(long j10, LayoutDirection layoutDirection, Density density) {
        float fMo27093roundToPx0680j_4 = density.mo27093roundToPx0680j_4(ClipScrollableContainerKt.getMaxSupportedElevation());
        return new Outline.Rectangle(new Rect(0.0f, -fMo27093roundToPx0680j_4, Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)) + fMo27093roundToPx0680j_4));
    }
}
