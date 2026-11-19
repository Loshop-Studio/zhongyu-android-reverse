package androidx.compose.foundation.draganddrop;

import androidx.compose.p014ui.draw.DrawModifierKt;
import androidx.compose.p014ui.graphics.drawscope.DrawScope;
import androidx.compose.p014ui.node.DelegatingNode;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;

/* loaded from: classes.dex */
final class DragSourceNodeWithDefaultPainter extends DelegatingNode {
    private final CacheDrawScopeDragShadowCallback cacheDrawScopeDragShadowCallback;
    private final DragAndDropSourceNode dragAndDropModifierNode;

    public DragSourceNodeWithDefaultPainter(InterfaceC9544p interfaceC9544p, InterfaceC9540l interfaceC9540l) {
        CacheDrawScopeDragShadowCallback cacheDrawScopeDragShadowCallback = new CacheDrawScopeDragShadowCallback();
        delegate(DrawModifierKt.CacheDrawModifierNode(new C1252xadf00624(cacheDrawScopeDragShadowCallback)));
        this.cacheDrawScopeDragShadowCallback = cacheDrawScopeDragShadowCallback;
        this.dragAndDropModifierNode = (DragAndDropSourceNode) delegate(new DragAndDropSourceNode(new InterfaceC9540l() { // from class: androidx.compose.foundation.draganddrop.DragSourceNodeWithDefaultPainter$dragAndDropModifierNode$1
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((DrawScope) obj);
                return C10786q.f26013a;
            }

            public final void invoke(DrawScope drawScope) {
                this.this$0.cacheDrawScopeDragShadowCallback.drawDragShadow(drawScope);
            }
        }, interfaceC9544p, interfaceC9540l));
    }

    public final InterfaceC9544p getDetectDragStart() {
        return this.dragAndDropModifierNode.getDetectDragStart();
    }

    public final InterfaceC9540l getTransferData() {
        return this.dragAndDropModifierNode.getTransferData();
    }

    public final void setDetectDragStart(InterfaceC9544p interfaceC9544p) {
        this.dragAndDropModifierNode.setDetectDragStart(interfaceC9544p);
    }

    public final void setTransferData(InterfaceC9540l interfaceC9540l) {
        this.dragAndDropModifierNode.setTransferData(interfaceC9540l);
    }
}
