package androidx.compose.p014ui.platform;

import android.view.ViewGroup;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.geometry.Rect;
import androidx.compose.p014ui.graphics.RectHelper_androidKt;
import androidx.compose.p014ui.layout.LayoutCoordinates;
import androidx.compose.p014ui.layout.LayoutCoordinatesKt;
import androidx.compose.p014ui.relocation.BringIntoViewModifierNode;
import p181hd.InterfaceC9529a;
import p309qc.C10786q;
import vc.InterfaceC11588c;

/* loaded from: classes2.dex */
final class BringIntoViewOnScreenResponderNode extends Modifier.Node implements BringIntoViewModifierNode {
    private ViewGroup view;

    public BringIntoViewOnScreenResponderNode(ViewGroup viewGroup) {
        this.view = viewGroup;
    }

    @Override // androidx.compose.p014ui.relocation.BringIntoViewModifierNode
    public Object bringIntoView(LayoutCoordinates layoutCoordinates, InterfaceC9529a interfaceC9529a, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        long jPositionInRoot = LayoutCoordinatesKt.positionInRoot(layoutCoordinates);
        Rect rect = (Rect) interfaceC9529a.invoke();
        Rect rectM30674translatek4lQ0M = rect != null ? rect.m30674translatek4lQ0M(jPositionInRoot) : null;
        if (rectM30674translatek4lQ0M != null) {
            this.view.requestRectangleOnScreen(RectHelper_androidKt.toAndroidRect(rectM30674translatek4lQ0M), false);
        }
        return C10786q.f26013a;
    }

    public final ViewGroup getView() {
        return this.view;
    }

    public final void setView(ViewGroup viewGroup) {
        this.view = viewGroup;
    }
}
