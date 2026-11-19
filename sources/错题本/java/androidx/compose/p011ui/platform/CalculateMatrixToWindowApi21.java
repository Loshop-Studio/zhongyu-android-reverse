package androidx.compose.p011ui.platform;

import android.graphics.Matrix;
import android.view.View;
import androidx.compose.p011ui.graphics.AndroidMatrixConversions_androidKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u0015\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\f\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0002ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\u0011\u001a\u00020\t*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0002ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J&\u0010\u0017\u001a\u00020\t*\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\"\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0003\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001e"}, m5110d2 = {"Landroidx/compose/ui/platform/CalculateMatrixToWindowApi21;", "Landroidx/compose/ui/platform/CalculateMatrixToWindow;", "Landroidx/compose/ui/graphics/Matrix;", "tmpMatrix", "<init>", "([FLkotlin/jvm/internal/e;)V", "Landroid/view/View;", "view", "matrix", "Ld6/s;", "transformMatrixToWindow-EL8BTi8", "(Landroid/view/View;[F)V", "transformMatrixToWindow", "Landroid/graphics/Matrix;", "other", "preConcat-tU-YjHk", "([FLandroid/graphics/Matrix;)V", "preConcat", "", "x", "y", "preTranslate-3XD1CNM", "([FFF)V", "preTranslate", "calculateMatrixToWindow-EL8BTi8", "calculateMatrixToWindow", "[F", "", "tmpLocation", "[I", "ui_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
final class CalculateMatrixToWindowApi21 implements CalculateMatrixToWindow {

    @NotNull
    private final int[] tmpLocation;

    @NotNull
    private final float[] tmpMatrix;

    public /* synthetic */ CalculateMatrixToWindowApi21(float[] fArr, AbstractC5824e abstractC5824e) {
        this(fArr);
    }

    /* renamed from: preConcat-tU-YjHk, reason: not valid java name */
    private final void m12444preConcattUYjHk(float[] fArr, Matrix matrix) {
        AndroidMatrixConversions_androidKt.m10553setFromtUYjHk(this.tmpMatrix, matrix);
        AndroidComposeView_androidKt.m12439preTransformJiSxe2E(fArr, this.tmpMatrix);
    }

    /* renamed from: preTranslate-3XD1CNM, reason: not valid java name */
    private final void m12445preTranslate3XD1CNM(float[] fArr, float f, float f7) {
        AndroidComposeView_androidKt.m12440preTranslatecG2Xzmc(fArr, f, f7, this.tmpMatrix);
    }

    /* renamed from: transformMatrixToWindow-EL8BTi8, reason: not valid java name */
    private final void m12446transformMatrixToWindowEL8BTi8(View view, float[] matrix) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            m12446transformMatrixToWindowEL8BTi8((View) parent, matrix);
            m12445preTranslate3XD1CNM(matrix, -view.getScrollX(), -view.getScrollY());
            m12445preTranslate3XD1CNM(matrix, view.getLeft(), view.getTop());
        } else {
            view.getLocationInWindow(this.tmpLocation);
            m12445preTranslate3XD1CNM(matrix, -view.getScrollX(), -view.getScrollY());
            m12445preTranslate3XD1CNM(matrix, r0[0], r0[1]);
        }
        Matrix matrix2 = view.getMatrix();
        if (matrix2.isIdentity()) {
            return;
        }
        m12444preConcattUYjHk(matrix, matrix2);
    }

    @Override // androidx.compose.p011ui.platform.CalculateMatrixToWindow
    /* renamed from: calculateMatrixToWindow-EL8BTi8 */
    public void mo12443calculateMatrixToWindowEL8BTi8(@NotNull View view, @NotNull float[] matrix) {
        androidx.compose.p011ui.graphics.Matrix.m10921resetimpl(matrix);
        m12446transformMatrixToWindowEL8BTi8(view, matrix);
    }

    private CalculateMatrixToWindowApi21(float[] fArr) {
        this.tmpMatrix = fArr;
        this.tmpLocation = new int[2];
    }
}
