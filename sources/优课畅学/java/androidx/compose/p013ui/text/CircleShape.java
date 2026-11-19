package androidx.compose.p013ui.text;

import androidx.compose.p013ui.geometry.CornerRadius;
import androidx.compose.p013ui.geometry.RoundRectKt;
import androidx.compose.p013ui.geometry.Size;
import androidx.compose.p013ui.geometry.SizeKt;
import androidx.compose.p013ui.graphics.Outline;
import androidx.compose.p013ui.graphics.Shape;
import androidx.compose.p013ui.unit.Density;
import androidx.compose.p013ui.unit.LayoutDirection;

/* loaded from: classes2.dex */
final class CircleShape implements Shape {
    public static final CircleShape INSTANCE = new CircleShape();

    private CircleShape() {
    }

    @Override // androidx.compose.p013ui.graphics.Shape
    /* renamed from: createOutline-Pq9zytI */
    public Outline mo20407createOutlinePq9zytI(long j10, LayoutDirection layoutDirection, Density density) {
        long jM23989constructorimpl = CornerRadius.m23989constructorimpl((Float.floatToRawIntBits(r12) & 4294967295L) | (Float.floatToRawIntBits(Size.m24103getMinDimensionimpl(j10) / 2.0f) << 32));
        return new Outline.Rounded(RoundRectKt.m24087RoundRectZAM2FJo(SizeKt.m24125toRectuvyYCjk(j10), jM23989constructorimpl, jM23989constructorimpl, jM23989constructorimpl, jM23989constructorimpl));
    }
}
