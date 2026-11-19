package androidx.compose.foundation;

import androidx.compose.p014ui.geometry.Rect;
import androidx.compose.p014ui.graphics.Outline;
import androidx.compose.p014ui.graphics.Shape;
import androidx.compose.p014ui.unit.Density;
import androidx.compose.p014ui.unit.LayoutDirection;

/* loaded from: classes.dex */
final class VerticalScrollableClipShape implements Shape {
    public static final VerticalScrollableClipShape INSTANCE = new VerticalScrollableClipShape();

    private VerticalScrollableClipShape() {
    }

    @Override // androidx.compose.p014ui.graphics.Shape
    /* renamed from: createOutline-Pq9zytI */
    public Outline mo27009createOutlinePq9zytI(long j10, LayoutDirection layoutDirection, Density density) {
        float fMo27093roundToPx0680j_4 = density.mo27093roundToPx0680j_4(ClipScrollableContainerKt.getMaxSupportedElevation());
        return new Outline.Rectangle(new Rect(-fMo27093roundToPx0680j_4, 0.0f, Float.intBitsToFloat((int) (j10 >> 32)) + fMo27093roundToPx0680j_4, Float.intBitsToFloat((int) (j10 & 4294967295L))));
    }
}
