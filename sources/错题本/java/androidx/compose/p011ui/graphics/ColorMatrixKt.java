package androidx.compose.p011ui.graphics;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m5109d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u001a3\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H\u0082\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\n"}, m5110d2 = {"dot", "", "m1", "Landroidx/compose/ui/graphics/ColorMatrix;", "row", "", "m2", "column", "dot-Me4OoYI", "([FI[FI)F", "ui-graphics_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nColorMatrix.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ColorMatrix.kt\nandroidx/compose/ui/graphics/ColorMatrixKt\n+ 2 ColorMatrix.kt\nandroidx/compose/ui/graphics/ColorMatrix\n*L\n1#1,375:1\n88#2:376\n88#2:377\n88#2:378\n88#2:379\n*S KotlinDebug\n*F\n+ 1 ColorMatrix.kt\nandroidx/compose/ui/graphics/ColorMatrixKt\n*L\n370#1:376\n371#1:377\n372#1:378\n373#1:379\n*E\n"})
/* loaded from: classes.dex */
public final class ColorMatrixKt {
    /* renamed from: dot-Me4OoYI, reason: not valid java name */
    private static final float m10762dotMe4OoYI(float[] fArr, int i, float[] fArr2, int i8) {
        int i9 = i * 5;
        return (fArr[i9 + 3] * fArr2[15 + i8]) + (fArr[i9 + 2] * fArr2[10 + i8]) + (fArr[i9 + 1] * fArr2[5 + i8]) + (fArr[i9] * fArr2[i8]);
    }
}
