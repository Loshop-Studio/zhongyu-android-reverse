package androidx.compose.p014ui.platform;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.p014ui.graphics.AndroidMatrixConversions_androidKt;

@RequiresApi(29)
/* loaded from: classes2.dex */
final class CalculateMatrixToWindowApi29 implements CalculateMatrixToWindow {
    private final Matrix tmpMatrix = new Matrix();
    private final int[] tmpPosition = new int[2];

    @Override // androidx.compose.p014ui.platform.CalculateMatrixToWindow
    @DoNotInline
    /* renamed from: calculateMatrixToWindow-EL8BTi8 */
    public void mo32639calculateMatrixToWindowEL8BTi8(View view, float[] fArr) {
        this.tmpMatrix.reset();
        view.transformMatrixToGlobal(this.tmpMatrix);
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            view = parent;
            parent = view.getParent();
        }
        view.getLocationOnScreen(this.tmpPosition);
        int[] iArr = this.tmpPosition;
        int i10 = iArr[0];
        int i11 = iArr[1];
        view.getLocationInWindow(iArr);
        int[] iArr2 = this.tmpPosition;
        this.tmpMatrix.postTranslate(iArr2[0] - i10, iArr2[1] - i11);
        AndroidMatrixConversions_androidKt.m30749setFromtUYjHk(fArr, this.tmpMatrix);
    }
}
