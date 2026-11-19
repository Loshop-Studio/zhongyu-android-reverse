package androidx.compose.p013ui.platform;

import android.graphics.Matrix;
import android.view.View;
import androidx.compose.p013ui.graphics.AndroidMatrixConversions_androidKt;
import kotlin.jvm.internal.AbstractC9126n;

/* loaded from: classes2.dex */
final class CalculateMatrixToWindowApi21 implements CalculateMatrixToWindow {
    private final int[] tmpLocation;
    private final float[] tmpMatrix;

    public /* synthetic */ CalculateMatrixToWindowApi21(float[] fArr, AbstractC9126n abstractC9126n) {
        this(fArr);
    }

    /* renamed from: preConcat-tU-YjHk, reason: not valid java name */
    private final void m26038preConcattUYjHk(float[] fArr, Matrix matrix) {
        AndroidMatrixConversions_androidKt.m24147setFromtUYjHk(this.tmpMatrix, matrix);
        AndroidComposeView_androidKt.m26033preTransformJiSxe2E(fArr, this.tmpMatrix);
    }

    /* renamed from: preTranslate-3XD1CNM, reason: not valid java name */
    private final void m26039preTranslate3XD1CNM(float[] fArr, float f10, float f11) {
        AndroidComposeView_androidKt.m26034preTranslatecG2Xzmc(fArr, f10, f11, this.tmpMatrix);
    }

    /* renamed from: transformMatrixToWindow-EL8BTi8, reason: not valid java name */
    private final void m26040transformMatrixToWindowEL8BTi8(View view, float[] fArr) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            m26040transformMatrixToWindowEL8BTi8((View) parent, fArr);
            m26039preTranslate3XD1CNM(fArr, -view.getScrollX(), -view.getScrollY());
            m26039preTranslate3XD1CNM(fArr, view.getLeft(), view.getTop());
        } else {
            view.getLocationInWindow(this.tmpLocation);
            m26039preTranslate3XD1CNM(fArr, -view.getScrollX(), -view.getScrollY());
            m26039preTranslate3XD1CNM(fArr, r0[0], r0[1]);
        }
        Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            return;
        }
        m26038preConcattUYjHk(fArr, matrix);
    }

    @Override // androidx.compose.p013ui.platform.CalculateMatrixToWindow
    /* renamed from: calculateMatrixToWindow-EL8BTi8 */
    public void mo26037calculateMatrixToWindowEL8BTi8(View view, float[] fArr) {
        androidx.compose.p013ui.graphics.Matrix.m24515resetimpl(fArr);
        m26040transformMatrixToWindowEL8BTi8(view, fArr);
    }

    private CalculateMatrixToWindowApi21(float[] fArr) {
        this.tmpMatrix = fArr;
        this.tmpLocation = new int[2];
    }
}
