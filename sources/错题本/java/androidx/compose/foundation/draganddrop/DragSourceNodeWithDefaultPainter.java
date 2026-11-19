package androidx.compose.foundation.draganddrop;

import androidx.compose.p011ui.draw.DrawModifierKt;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.node.DelegatingNode;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5832m;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import org.jetbrains.annotations.NotNull;
import p045d6.C5443s;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0002\u0018\u00002\u00020\u0001BF\u0012'\u0010\b\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002¢\u0006\u0002\b\u0007\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\t¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014Rm\u0010\b\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002¢\u0006\u0002\b\u00072'\u0010\u0015\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002¢\u0006\u0002\b\u00078F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019*\u0004\b\u001a\u0010\u001bRG\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\t2\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f*\u0004\b \u0010\u001b¨\u0006!"}, m5110d2 = {"Landroidx/compose/foundation/draganddrop/DragSourceNodeWithDefaultPainter;", "Landroidx/compose/ui/node/DelegatingNode;", "Lkotlin/Function2;", "Landroidx/compose/foundation/draganddrop/DragAndDropStartDetectorScope;", "Lh6/c;", "Ld6/s;", "", "Lkotlin/ExtensionFunctionType;", "detectDragStart", "Lkotlin/Function1;", "Landroidx/compose/ui/geometry/Offset;", "Landroidx/compose/ui/draganddrop/DragAndDropTransferData;", "transferData", "<init>", "(Lr6/e;Lr6/c;)V", "Landroidx/compose/foundation/draganddrop/CacheDrawScopeDragShadowCallback;", "cacheDrawScopeDragShadowCallback", "Landroidx/compose/foundation/draganddrop/CacheDrawScopeDragShadowCallback;", "Landroidx/compose/foundation/draganddrop/DragAndDropSourceNode;", "dragAndDropModifierNode", "Landroidx/compose/foundation/draganddrop/DragAndDropSourceNode;", "<set-?>", "getDetectDragStart", "()Lr6/e;", "setDetectDragStart", "(Lr6/e;)V", "getDetectDragStart$delegate", "(Landroidx/compose/foundation/draganddrop/DragSourceNodeWithDefaultPainter;)Ljava/lang/Object;", "getTransferData", "()Lr6/c;", "setTransferData", "(Lr6/c;)V", "getTransferData$delegate", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
final class DragSourceNodeWithDefaultPainter extends DelegatingNode {

    @NotNull
    private final CacheDrawScopeDragShadowCallback cacheDrawScopeDragShadowCallback;

    @NotNull
    private final DragAndDropSourceNode dragAndDropModifierNode;

    public DragSourceNodeWithDefaultPainter(@NotNull InterfaceC6473e interfaceC6473e, @NotNull InterfaceC6471c interfaceC6471c) {
        CacheDrawScopeDragShadowCallback cacheDrawScopeDragShadowCallback = new CacheDrawScopeDragShadowCallback();
        delegate(DrawModifierKt.CacheDrawModifierNode(new C0810xadf00624(cacheDrawScopeDragShadowCallback)));
        this.cacheDrawScopeDragShadowCallback = cacheDrawScopeDragShadowCallback;
        this.dragAndDropModifierNode = (DragAndDropSourceNode) delegate(new DragAndDropSourceNode(new InterfaceC6471c() { // from class: androidx.compose.foundation.draganddrop.DragSourceNodeWithDefaultPainter$dragAndDropModifierNode$1
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((DrawScope) obj);
                return C5443s.f8405a;
            }

            public final void invoke(DrawScope drawScope) {
                this.this$0.cacheDrawScopeDragShadowCallback.drawDragShadow(drawScope);
            }
        }, interfaceC6473e, interfaceC6471c));
    }

    private static Object getDetectDragStart$delegate(DragSourceNodeWithDefaultPainter dragSourceNodeWithDefaultPainter) {
        MutablePropertyReference0Impl mutablePropertyReference0Impl = new MutablePropertyReference0Impl(dragSourceNodeWithDefaultPainter.dragAndDropModifierNode, DragAndDropSourceNode.class, "detectDragStart", "getDetectDragStart()Lkotlin/jvm/functions/Function2;", 0);
        AbstractC5832m.f9223a.getClass();
        return mutablePropertyReference0Impl;
    }

    private static Object getTransferData$delegate(DragSourceNodeWithDefaultPainter dragSourceNodeWithDefaultPainter) {
        MutablePropertyReference0Impl mutablePropertyReference0Impl = new MutablePropertyReference0Impl(dragSourceNodeWithDefaultPainter.dragAndDropModifierNode, DragAndDropSourceNode.class, "transferData", "getTransferData()Lkotlin/jvm/functions/Function1;", 0);
        AbstractC5832m.f9223a.getClass();
        return mutablePropertyReference0Impl;
    }

    @NotNull
    public final InterfaceC6473e getDetectDragStart() {
        return this.dragAndDropModifierNode.getDetectDragStart();
    }

    @NotNull
    public final InterfaceC6471c getTransferData() {
        return this.dragAndDropModifierNode.getTransferData();
    }

    public final void setDetectDragStart(@NotNull InterfaceC6473e interfaceC6473e) {
        this.dragAndDropModifierNode.setDetectDragStart(interfaceC6473e);
    }

    public final void setTransferData(@NotNull InterfaceC6471c interfaceC6471c) {
        this.dragAndDropModifierNode.setTransferData(interfaceC6471c);
    }
}
