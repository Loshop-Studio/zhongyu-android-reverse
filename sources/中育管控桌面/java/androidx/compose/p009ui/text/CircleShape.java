package androidx.compose.p009ui.text;

import androidx.compose.p009ui.geometry.CornerRadius;
import androidx.compose.p009ui.geometry.RoundRectKt;
import androidx.compose.p009ui.geometry.Size;
import androidx.compose.p009ui.geometry.SizeKt;
import androidx.compose.p009ui.graphics.Outline;
import androidx.compose.p009ui.graphics.Shape;
import androidx.compose.p009ui.unit.Density;
import androidx.compose.p009ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m7879d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\r"}, m7880d2 = {"Landroidx/compose/ui/text/CircleShape;", "Landroidx/compose/ui/graphics/Shape;", "()V", "createOutline", "Landroidx/compose/ui/graphics/Outline;", "size", "Landroidx/compose/ui/geometry/Size;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "density", "Landroidx/compose/ui/unit/Density;", "createOutline-Pq9zytI", "(JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;)Landroidx/compose/ui/graphics/Outline;", "ui-text_release"}, m7881k = 1, m7882mv = {1, 9, 0}, m7884xi = 48)
@SourceDebugExtension({"SMAP\nBullet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Bullet.kt\nandroidx/compose/ui/text/CircleShape\n+ 2 CornerRadius.kt\nandroidx/compose/ui/geometry/CornerRadiusKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,122:1\n33#2:123\n53#3,3:124\n*S KotlinDebug\n*F\n+ 1 Bullet.kt\nandroidx/compose/ui/text/CircleShape\n*L\n110#1:123\n110#1:124,3\n*E\n"})
/* loaded from: classes2.dex */
final class CircleShape implements Shape {
    public static final CircleShape INSTANCE = new CircleShape();

    private CircleShape() {
    }

    @Override // androidx.compose.p009ui.graphics.Shape
    /* renamed from: createOutline-Pq9zytI */
    public Outline mo10169createOutlinePq9zytI(long size, LayoutDirection layoutDirection, Density density) {
        long jM13612constructorimpl = CornerRadius.m13612constructorimpl((Float.floatToRawIntBits(r12) & 4294967295L) | (Float.floatToRawIntBits(Size.m13726getMinDimensionimpl(size) / 2.0f) << 32));
        return new Outline.Rounded(RoundRectKt.m13710RoundRectZAM2FJo(SizeKt.m13748toRectuvyYCjk(size), jM13612constructorimpl, jM13612constructorimpl, jM13612constructorimpl, jM13612constructorimpl));
    }
}
