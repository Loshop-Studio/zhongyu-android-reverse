package androidx.compose.p006ui.viewinterop;

import android.view.View;
import androidx.compose.p006ui.geometry.Offset;
import androidx.compose.p006ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.p006ui.layout.LayoutCoordinatesKt;
import androidx.compose.p006ui.node.LayoutNode;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.math.MathKt__MathJVMKt;

@Metadata(m5174d1 = {"\u0000(\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\u0002ø\u0001\u0000¢\u0006\u0002\u0010\u0005\u001a\u0014\u0010\u0006\u001a\u00020\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002\u001a\f\u0010\u000b\u001a\u00020\f*\u00020\u0001H\u0002\u001a\f\u0010\r\u001a\u00020\f*\u00020\fH\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, m5175d2 = {"Unmeasured", "", "toNestedScrollSource", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "type", "(I)I", "layoutAccordingTo", "", "Landroid/view/View;", "layoutNode", "Landroidx/compose/ui/node/LayoutNode;", "toComposeOffset", "", "toComposeVelocity", "ui_release"}, m5176k = 2, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class AndroidViewHolder_androidKt {
    private static final int Unmeasured = Integer.MIN_VALUE;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void layoutAccordingTo(View view, LayoutNode layoutNode) {
        long jPositionInRoot = LayoutCoordinatesKt.positionInRoot(layoutNode.getCoordinates());
        int iRoundToInt = MathKt__MathJVMKt.roundToInt(Offset.m8945getXimpl(jPositionInRoot));
        int iRoundToInt2 = MathKt__MathJVMKt.roundToInt(Offset.m8946getYimpl(jPositionInRoot));
        view.layout(iRoundToInt, iRoundToInt2, view.getMeasuredWidth() + iRoundToInt, view.getMeasuredHeight() + iRoundToInt2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float toComposeOffset(int i4) {
        return i4 * (-1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float toComposeVelocity(float f4) {
        return f4 * (-1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int toNestedScrollSource(int i4) {
        return i4 == 0 ? NestedScrollSource.INSTANCE.m10392getDragWNlRxjI() : NestedScrollSource.INSTANCE.m10393getFlingWNlRxjI();
    }
}
