package androidx.compose.p014ui.viewinterop;

import android.view.View;
import androidx.compose.p014ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.p014ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.p014ui.layout.LayoutCoordinatesKt;
import androidx.compose.p014ui.node.LayoutNode;

/* loaded from: classes2.dex */
public final class AndroidViewHolder_androidKt {
    private static final AndroidViewHolder_androidKt$NoOpScrollConnection$1 NoOpScrollConnection = new NestedScrollConnection() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder_androidKt$NoOpScrollConnection$1
    };
    private static final int Unmeasured = Integer.MIN_VALUE;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void layoutAccordingTo(View view, LayoutNode layoutNode) {
        long jPositionInRoot = LayoutCoordinatesKt.positionInRoot(layoutNode.getCoordinates());
        int iRound = Math.round(Float.intBitsToFloat((int) (jPositionInRoot >> 32)));
        int iRound2 = Math.round(Float.intBitsToFloat((int) (jPositionInRoot & 4294967295L)));
        view.layout(iRound, iRound2, view.getMeasuredWidth() + iRound, view.getMeasuredHeight() + iRound2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float toComposeOffset(int i10) {
        return i10 * (-1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float toComposeVelocity(float f10) {
        return f10 * (-1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int toNestedScrollSource(int i10) {
        return i10 == 0 ? NestedScrollSource.Companion.m31996getUserInputWNlRxjI() : NestedScrollSource.Companion.m31995getSideEffectWNlRxjI();
    }
}
