package androidx.compose.foundation.relocation;

import android.view.View;
import androidx.compose.p006ui.geometry.Rect;
import androidx.compose.p006ui.layout.LayoutCoordinates;
import androidx.compose.p006ui.layout.LayoutCoordinatesKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m5174d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J)\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\nH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, m5175d2 = {"Landroidx/compose/foundation/relocation/AndroidBringIntoViewParent;", "Landroidx/compose/foundation/relocation/BringIntoViewParent;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "bringChildIntoView", "", "childCoordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "boundsProvider", "Lkotlin/Function0;", "Landroidx/compose/ui/geometry/Rect;", "(Landroidx/compose/ui/layout/LayoutCoordinates;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "foundation_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
final class AndroidBringIntoViewParent implements BringIntoViewParent {
    private final View view;

    public AndroidBringIntoViewParent(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.view = view;
    }

    @Override // androidx.compose.foundation.relocation.BringIntoViewParent
    public Object bringChildIntoView(LayoutCoordinates layoutCoordinates, Function0<Rect> function0, Continuation<? super Unit> continuation) {
        Rect rectM8982translatek4lQ0M;
        long jPositionInRoot = LayoutCoordinatesKt.positionInRoot(layoutCoordinates);
        Rect rectInvoke = function0.invoke();
        if (rectInvoke == null || (rectM8982translatek4lQ0M = rectInvoke.m8982translatek4lQ0M(jPositionInRoot)) == null) {
            return Unit.INSTANCE;
        }
        this.view.requestRectangleOnScreen(BringIntoViewResponder_androidKt.toRect(rectM8982translatek4lQ0M), false);
        return Unit.INSTANCE;
    }
}
