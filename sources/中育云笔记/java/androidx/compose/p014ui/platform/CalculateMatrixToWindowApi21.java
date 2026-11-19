package androidx.compose.p014ui.platform;

import android.graphics.Matrix;
import android.view.View;
import androidx.compose.p014ui.graphics.AndroidMatrixConversions_androidKt;
import kotlin.jvm.internal.AbstractC9972n;

/* loaded from: classes2.dex */
final class CalculateMatrixToWindowApi21 implements CalculateMatrixToWindow {
    private final int[] tmpLocation;
    private final float[] tmpMatrix;

    public /* synthetic */ CalculateMatrixToWindowApi21(float[] fArr, AbstractC9972n abstractC9972n) {
        this(fArr);
    }

    /* renamed from: preConcat-tU-YjHk, reason: not valid java name */
    private final void m32640preConcattUYjHk(float[] fArr, Matrix matrix) {
        AndroidMatrixConversions_androidKt.m30749setFromtUYjHk(this.tmpMatrix, matrix);
        AndroidComposeView_androidKt.m32635preTransformJiSxe2E(fArr, this.tmpMatrix);
    }

    /* renamed from: preTranslate-3XD1CNM, reason: not valid java name */
    private final void m32641preTranslate3XD1CNM(float[] fArr, float f10, float f11) {
        AndroidComposeView_androidKt.m32636preTranslatecG2Xzmc(fArr, f10, f11, this.tmpMatrix);
    }

    /* renamed from: transformMatrixToWindow-EL8BTi8, reason: not valid java name */
    private final void m32642transformMatrixToWindowEL8BTi8(View view, float[] fArr) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            m32642transformMatrixToWindowEL8BTi8((View) parent, fArr);
            m32641preTranslate3XD1CNM(fArr, -view.getScrollX(), -view.getScrollY());
            m32641preTranslate3XD1CNM(fArr, view.getLeft(), view.getTop());
        } else {
            view.getLocationInWindow(this.tmpLocation);
            m32641preTranslate3XD1CNM(fArr, -view.getScrollX(), -view.getScrollY());
            m32641preTranslate3XD1CNM(fArr, r0[0], r0[1]);
        }
        Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            return;
        }
        m32640preConcattUYjHk(fArr, matrix);
    }

    @Override // androidx.compose.p014ui.platform.CalculateMatrixToWindow
    /* renamed from: calculateMatrixToWindow-EL8BTi8 */
    public void mo32639calculateMatrixToWindowEL8BTi8(View view, float[] fArr) {
        androidx.compose.p014ui.graphics.Matrix.m31117resetimpl(fArr);
        m32642transformMatrixToWindowEL8BTi8(view, fArr);
    }

    private CalculateMatrixToWindowApi21(float[] fArr) {
        this.tmpMatrix = fArr;
        this.tmpLocation = new int[2];
    }
}
