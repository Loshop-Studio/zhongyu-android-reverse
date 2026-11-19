package androidx.compose.p011ui.graphics;

import android.graphics.Matrix;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001c\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001c\u0010\u0006\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0000ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\t"}, m5110d2 = {"Landroidx/compose/ui/graphics/Matrix;", "Landroid/graphics/Matrix;", "matrix", "Ld6/s;", "setFrom-tU-YjHk", "([FLandroid/graphics/Matrix;)V", "setFrom", "setFrom-EL8BTi8", "(Landroid/graphics/Matrix;[F)V", "ui-graphics_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class AndroidMatrixConversions_androidKt {
    /* renamed from: setFrom-EL8BTi8, reason: not valid java name */
    public static final void m10552setFromEL8BTi8(@NotNull Matrix matrix, @NotNull float[] fArr) {
        float f = fArr[0];
        float f7 = fArr[1];
        float f8 = fArr[2];
        float f9 = fArr[3];
        float f10 = fArr[4];
        float f11 = fArr[5];
        float f12 = fArr[6];
        float f13 = fArr[7];
        float f14 = fArr[8];
        float f15 = fArr[12];
        float f16 = fArr[13];
        float f17 = fArr[15];
        fArr[0] = f;
        fArr[1] = f10;
        fArr[2] = f15;
        fArr[3] = f7;
        fArr[4] = f11;
        fArr[5] = f16;
        fArr[6] = f9;
        fArr[7] = f13;
        fArr[8] = f17;
        matrix.setValues(fArr);
        fArr[0] = f;
        fArr[1] = f7;
        fArr[2] = f8;
        fArr[3] = f9;
        fArr[4] = f10;
        fArr[5] = f11;
        fArr[6] = f12;
        fArr[7] = f13;
        fArr[8] = f14;
    }

    /* renamed from: setFrom-tU-YjHk, reason: not valid java name */
    public static final void m10553setFromtUYjHk(@NotNull float[] fArr, @NotNull Matrix matrix) {
        matrix.getValues(fArr);
        float f = fArr[0];
        float f7 = fArr[1];
        float f8 = fArr[2];
        float f9 = fArr[3];
        float f10 = fArr[4];
        float f11 = fArr[5];
        float f12 = fArr[6];
        float f13 = fArr[7];
        float f14 = fArr[8];
        fArr[0] = f;
        fArr[1] = f9;
        fArr[2] = 0.0f;
        fArr[3] = f12;
        fArr[4] = f7;
        fArr[5] = f10;
        fArr[6] = 0.0f;
        fArr[7] = f13;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = f8;
        fArr[13] = f11;
        fArr[14] = 0.0f;
        fArr[15] = f14;
    }
}
