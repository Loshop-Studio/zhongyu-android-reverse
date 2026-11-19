package androidx.compose.p013ui.platform;

import android.view.ViewGroup;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.geometry.Rect;
import androidx.compose.p013ui.graphics.RectHelper_androidKt;
import androidx.compose.p013ui.layout.LayoutCoordinates;
import androidx.compose.p013ui.layout.LayoutCoordinatesKt;
import androidx.compose.p013ui.relocation.BringIntoViewModifierNode;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;
import p300x7.InterfaceC10559a;

/* loaded from: classes2.dex */
final class BringIntoViewOnScreenResponderNode extends Modifier.Node implements BringIntoViewModifierNode {
    private ViewGroup view;

    public BringIntoViewOnScreenResponderNode(ViewGroup viewGroup) {
        this.view = viewGroup;
    }

    @Override // androidx.compose.p013ui.relocation.BringIntoViewModifierNode
    public Object bringIntoView(LayoutCoordinates layoutCoordinates, InterfaceC10559a interfaceC10559a, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        long jPositionInRoot = LayoutCoordinatesKt.positionInRoot(layoutCoordinates);
        Rect rect = (Rect) interfaceC10559a.invoke();
        Rect rectM24072translatek4lQ0M = rect != null ? rect.m24072translatek4lQ0M(jPositionInRoot) : null;
        if (rectM24072translatek4lQ0M != null) {
            this.view.requestRectangleOnScreen(RectHelper_androidKt.toAndroidRect(rectM24072translatek4lQ0M), false);
        }
        return C8736p.f16368a;
    }

    public final ViewGroup getView() {
        return this.view;
    }

    public final void setView(ViewGroup viewGroup) {
        this.view = viewGroup;
    }
}
