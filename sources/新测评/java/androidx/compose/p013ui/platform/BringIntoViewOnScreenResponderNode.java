package androidx.compose.p013ui.platform;

import android.view.ViewGroup;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.geometry.Rect;
import androidx.compose.p013ui.graphics.RectHelper_androidKt;
import androidx.compose.p013ui.layout.LayoutCoordinates;
import androidx.compose.p013ui.layout.LayoutCoordinatesKt;
import androidx.compose.p013ui.relocation.BringIntoViewModifierNode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;

@Metadata(m13557d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J&\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000eH\u0096@¢\u0006\u0002\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0011"}, m13558d2 = {"Landroidx/compose/ui/platform/BringIntoViewOnScreenResponderNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/relocation/BringIntoViewModifierNode;", "view", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "getView", "()Landroid/view/ViewGroup;", "setView", "bringIntoView", "", "childCoordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "boundsProvider", "Lkotlin/Function0;", "Landroidx/compose/ui/geometry/Rect;", "(Landroidx/compose/ui/layout/LayoutCoordinates;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ui_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
/* loaded from: classes2.dex */
final class BringIntoViewOnScreenResponderNode extends Modifier.Node implements BringIntoViewModifierNode {
    private ViewGroup view;

    public BringIntoViewOnScreenResponderNode(ViewGroup viewGroup) {
        this.view = viewGroup;
    }

    @Override // androidx.compose.p013ui.relocation.BringIntoViewModifierNode
    public Object bringIntoView(LayoutCoordinates layoutCoordinates, Function0<Rect> function0, Continuation<? super Unit> continuation) {
        long jPositionInRoot = LayoutCoordinatesKt.positionInRoot(layoutCoordinates);
        Rect rectInvoke = function0.invoke();
        Rect rectM20772translatek4lQ0M = rectInvoke != null ? rectInvoke.m20772translatek4lQ0M(jPositionInRoot) : null;
        if (rectM20772translatek4lQ0M != null) {
            this.view.requestRectangleOnScreen(RectHelper_androidKt.toAndroidRect(rectM20772translatek4lQ0M), false);
        }
        return Unit.INSTANCE;
    }

    public final ViewGroup getView() {
        return this.view;
    }

    public final void setView(ViewGroup viewGroup) {
        this.view = viewGroup;
    }
}
