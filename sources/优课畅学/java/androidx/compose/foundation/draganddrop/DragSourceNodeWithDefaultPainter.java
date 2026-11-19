package androidx.compose.foundation.draganddrop;

import androidx.compose.p013ui.draw.DrawModifierKt;
import androidx.compose.p013ui.graphics.drawscope.DrawScope;
import androidx.compose.p013ui.node.DelegatingNode;
import p123h7.C8736p;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

/* loaded from: classes.dex */
final class DragSourceNodeWithDefaultPainter extends DelegatingNode {
    private final CacheDrawScopeDragShadowCallback cacheDrawScopeDragShadowCallback;
    private final DragAndDropSourceNode dragAndDropModifierNode;

    public DragSourceNodeWithDefaultPainter(InterfaceC10574p interfaceC10574p, InterfaceC10570l interfaceC10570l) {
        CacheDrawScopeDragShadowCallback cacheDrawScopeDragShadowCallback = new CacheDrawScopeDragShadowCallback();
        delegate(DrawModifierKt.CacheDrawModifierNode(new C1222xadf00624(cacheDrawScopeDragShadowCallback)));
        this.cacheDrawScopeDragShadowCallback = cacheDrawScopeDragShadowCallback;
        this.dragAndDropModifierNode = (DragAndDropSourceNode) delegate(new DragAndDropSourceNode(new InterfaceC10570l() { // from class: androidx.compose.foundation.draganddrop.DragSourceNodeWithDefaultPainter$dragAndDropModifierNode$1
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((DrawScope) obj);
                return C8736p.f16368a;
            }

            public final void invoke(DrawScope drawScope) {
                this.this$0.cacheDrawScopeDragShadowCallback.drawDragShadow(drawScope);
            }
        }, interfaceC10574p, interfaceC10570l));
    }

    public final InterfaceC10574p getDetectDragStart() {
        return this.dragAndDropModifierNode.getDetectDragStart();
    }

    public final InterfaceC10570l getTransferData() {
        return this.dragAndDropModifierNode.getTransferData();
    }

    public final void setDetectDragStart(InterfaceC10574p interfaceC10574p) {
        this.dragAndDropModifierNode.setDetectDragStart(interfaceC10574p);
    }

    public final void setTransferData(InterfaceC10570l interfaceC10570l) {
        this.dragAndDropModifierNode.setTransferData(interfaceC10570l);
    }
}
