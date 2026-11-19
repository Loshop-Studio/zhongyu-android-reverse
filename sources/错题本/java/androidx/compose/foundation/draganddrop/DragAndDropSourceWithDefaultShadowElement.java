package androidx.compose.foundation.draganddrop;

import androidx.compose.p011ui.node.ModifierNodeElement;
import androidx.compose.p011ui.platform.InspectorInfo;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BF\u0012'\u0010\t\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003¢\u0006\u0002\b\b\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0016\u001a\u00020\u0006*\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J1\u0010\u0018\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003¢\u0006\u0002\b\bHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u001e\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\nHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJS\u0010\u001c\u001a\u00020\u00002)\b\u0002\u0010\t\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003¢\u0006\u0002\b\b2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\nHÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0007HÖ\u0003¢\u0006\u0004\b&\u0010'RC\u0010\t\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003¢\u0006\u0002\b\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010(\u001a\u0004\b)\u0010\u0019\"\u0004\b*\u0010+R0\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010,\u001a\u0004\b-\u0010\u001b\"\u0004\b.\u0010/¨\u00060"}, m5110d2 = {"Landroidx/compose/foundation/draganddrop/DragAndDropSourceWithDefaultShadowElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/draganddrop/DragSourceNodeWithDefaultPainter;", "Lkotlin/Function2;", "Landroidx/compose/foundation/draganddrop/DragAndDropStartDetectorScope;", "Lh6/c;", "Ld6/s;", "", "Lkotlin/ExtensionFunctionType;", "detectDragStart", "Lkotlin/Function1;", "Landroidx/compose/ui/geometry/Offset;", "Landroidx/compose/ui/draganddrop/DragAndDropTransferData;", "transferData", "<init>", "(Lr6/e;Lr6/c;)V", "create", "()Landroidx/compose/foundation/draganddrop/DragSourceNodeWithDefaultPainter;", "node", "update", "(Landroidx/compose/foundation/draganddrop/DragSourceNodeWithDefaultPainter;)V", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "component1", "()Lr6/e;", "component2", "()Lr6/c;", "copy", "(Lr6/e;Lr6/c;)Landroidx/compose/foundation/draganddrop/DragAndDropSourceWithDefaultShadowElement;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lr6/e;", "getDetectDragStart", "setDetectDragStart", "(Lr6/e;)V", "Lr6/c;", "getTransferData", "setTransferData", "(Lr6/c;)V", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
final /* data */ class DragAndDropSourceWithDefaultShadowElement extends ModifierNodeElement<DragSourceNodeWithDefaultPainter> {

    @NotNull
    private InterfaceC6473e detectDragStart;

    @NotNull
    private InterfaceC6471c transferData;

    public DragAndDropSourceWithDefaultShadowElement(@NotNull InterfaceC6473e interfaceC6473e, @NotNull InterfaceC6471c interfaceC6471c) {
        this.detectDragStart = interfaceC6473e;
        this.transferData = interfaceC6471c;
    }

    public static /* synthetic */ DragAndDropSourceWithDefaultShadowElement copy$default(DragAndDropSourceWithDefaultShadowElement dragAndDropSourceWithDefaultShadowElement, InterfaceC6473e interfaceC6473e, InterfaceC6471c interfaceC6471c, int i, Object obj) {
        if ((i & 1) != 0) {
            interfaceC6473e = dragAndDropSourceWithDefaultShadowElement.detectDragStart;
        }
        if ((i & 2) != 0) {
            interfaceC6471c = dragAndDropSourceWithDefaultShadowElement.transferData;
        }
        return dragAndDropSourceWithDefaultShadowElement.copy(interfaceC6473e, interfaceC6471c);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final InterfaceC6473e getDetectDragStart() {
        return this.detectDragStart;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final InterfaceC6471c getTransferData() {
        return this.transferData;
    }

    @NotNull
    public final DragAndDropSourceWithDefaultShadowElement copy(@NotNull InterfaceC6473e detectDragStart, @NotNull InterfaceC6471c transferData) {
        return new DragAndDropSourceWithDefaultShadowElement(detectDragStart, transferData);
    }

    @Override // androidx.compose.p011ui.node.ModifierNodeElement
    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DragAndDropSourceWithDefaultShadowElement)) {
            return false;
        }
        DragAndDropSourceWithDefaultShadowElement dragAndDropSourceWithDefaultShadowElement = (DragAndDropSourceWithDefaultShadowElement) other;
        return AbstractC5830k.m5325b(this.detectDragStart, dragAndDropSourceWithDefaultShadowElement.detectDragStart) && AbstractC5830k.m5325b(this.transferData, dragAndDropSourceWithDefaultShadowElement.transferData);
    }

    @NotNull
    public final InterfaceC6473e getDetectDragStart() {
        return this.detectDragStart;
    }

    @NotNull
    public final InterfaceC6471c getTransferData() {
        return this.transferData;
    }

    @Override // androidx.compose.p011ui.node.ModifierNodeElement
    public int hashCode() {
        return this.transferData.hashCode() + (this.detectDragStart.hashCode() * 31);
    }

    @Override // androidx.compose.p011ui.node.ModifierNodeElement
    public void inspectableProperties(@NotNull InspectorInfo inspectorInfo) {
        inspectorInfo.setName("dragSourceWithDefaultPainter");
        inspectorInfo.getProperties().set("detectDragStart", this.detectDragStart);
        inspectorInfo.getProperties().set("transferData", this.transferData);
    }

    public final void setDetectDragStart(@NotNull InterfaceC6473e interfaceC6473e) {
        this.detectDragStart = interfaceC6473e;
    }

    public final void setTransferData(@NotNull InterfaceC6471c interfaceC6471c) {
        this.transferData = interfaceC6471c;
    }

    @NotNull
    public String toString() {
        return "DragAndDropSourceWithDefaultShadowElement(detectDragStart=" + this.detectDragStart + ", transferData=" + this.transferData + ')';
    }

    @Override // androidx.compose.p011ui.node.ModifierNodeElement
    @NotNull
    public DragSourceNodeWithDefaultPainter create() {
        return new DragSourceNodeWithDefaultPainter(this.detectDragStart, this.transferData);
    }

    @Override // androidx.compose.p011ui.node.ModifierNodeElement
    public void update(@NotNull DragSourceNodeWithDefaultPainter node) {
        node.setDetectDragStart(this.detectDragStart);
        node.setTransferData(this.transferData);
    }
}
