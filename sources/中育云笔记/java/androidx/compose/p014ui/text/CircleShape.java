package androidx.compose.p014ui.text;

import androidx.compose.p014ui.geometry.CornerRadius;
import androidx.compose.p014ui.geometry.RoundRectKt;
import androidx.compose.p014ui.geometry.Size;
import androidx.compose.p014ui.geometry.SizeKt;
import androidx.compose.p014ui.graphics.Outline;
import androidx.compose.p014ui.graphics.Shape;
import androidx.compose.p014ui.unit.Density;
import androidx.compose.p014ui.unit.LayoutDirection;

/* loaded from: classes2.dex */
final class CircleShape implements Shape {
    public static final CircleShape INSTANCE = new CircleShape();

    private CircleShape() {
    }

    @Override // androidx.compose.p014ui.graphics.Shape
    /* renamed from: createOutline-Pq9zytI */
    public Outline mo27009createOutlinePq9zytI(long j10, LayoutDirection layoutDirection, Density density) {
        long jM30591constructorimpl = CornerRadius.m30591constructorimpl((Float.floatToRawIntBits(r12) & 4294967295L) | (Float.floatToRawIntBits(Size.m30705getMinDimensionimpl(j10) / 2.0f) << 32));
        return new Outline.Rounded(RoundRectKt.m30689RoundRectZAM2FJo(SizeKt.m30727toRectuvyYCjk(j10), jM30591constructorimpl, jM30591constructorimpl, jM30591constructorimpl, jM30591constructorimpl));
    }
}
