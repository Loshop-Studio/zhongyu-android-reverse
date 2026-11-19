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

@Metadata(m5109d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B_\u0012\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u0012'\u0010\f\u001a#\b\u0001\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\b¢\u0006\u0002\b\u0006\u0012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0018\u001a\u00020\u0005*\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001a\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ1\u0010\u001c\u001a#\b\u0001\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\b¢\u0006\u0002\b\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u001e\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0003HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJn\u0010\u001f\u001a\u00020\u00002\u0019\b\u0002\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u00062)\b\u0002\u0010\f\u001a#\b\u0001\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\b¢\u0006\u0002\b\u00062\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0003HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b)\u0010*R(\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010\u001bR8\u0010\f\u001a#\b\u0001\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\b¢\u0006\u0002\b\u00068\u0006¢\u0006\f\n\u0004\b\f\u0010-\u001a\u0004\b.\u0010\u001dR%\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00038\u0006¢\u0006\f\n\u0004\b\u000f\u0010+\u001a\u0004\b/\u0010\u001b¨\u00060"}, m5110d2 = {"Landroidx/compose/foundation/draganddrop/DragAndDropSourceElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/draganddrop/DragAndDropSourceNode;", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Ld6/s;", "Lkotlin/ExtensionFunctionType;", "drawDragDecoration", "Lkotlin/Function2;", "Landroidx/compose/foundation/draganddrop/DragAndDropStartDetectorScope;", "Lh6/c;", "", "detectDragStart", "Landroidx/compose/ui/geometry/Offset;", "Landroidx/compose/ui/draganddrop/DragAndDropTransferData;", "transferData", "<init>", "(Lr6/c;Lr6/e;Lr6/c;)V", "create", "()Landroidx/compose/foundation/draganddrop/DragAndDropSourceNode;", "node", "update", "(Landroidx/compose/foundation/draganddrop/DragAndDropSourceNode;)V", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "component1", "()Lr6/c;", "component2", "()Lr6/e;", "component3", "copy", "(Lr6/c;Lr6/e;Lr6/c;)Landroidx/compose/foundation/draganddrop/DragAndDropSourceElement;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lr6/c;", "getDrawDragDecoration", "Lr6/e;", "getDetectDragStart", "getTransferData", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
final /* data */ class DragAndDropSourceElement extends ModifierNodeElement<DragAndDropSourceNode> {

    @NotNull
    private final InterfaceC6473e detectDragStart;

    @NotNull
    private final InterfaceC6471c drawDragDecoration;

    @NotNull
    private final InterfaceC6471c transferData;

    public DragAndDropSourceElement(@NotNull InterfaceC6471c interfaceC6471c, @NotNull InterfaceC6473e interfaceC6473e, @NotNull InterfaceC6471c interfaceC6471c2) {
        this.drawDragDecoration = interfaceC6471c;
        this.detectDragStart = interfaceC6473e;
        this.transferData = interfaceC6471c2;
    }

    public static /* synthetic */ DragAndDropSourceElement copy$default(DragAndDropSourceElement dragAndDropSourceElement, InterfaceC6471c interfaceC6471c, InterfaceC6473e interfaceC6473e, InterfaceC6471c interfaceC6471c2, int i, Object obj) {
        if ((i & 1) != 0) {
            interfaceC6471c = dragAndDropSourceElement.drawDragDecoration;
        }
        if ((i & 2) != 0) {
            interfaceC6473e = dragAndDropSourceElement.detectDragStart;
        }
        if ((i & 4) != 0) {
            interfaceC6471c2 = dragAndDropSourceElement.transferData;
        }
        return dragAndDropSourceElement.copy(interfaceC6471c, interfaceC6473e, interfaceC6471c2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final InterfaceC6471c getDrawDragDecoration() {
        return this.drawDragDecoration;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final InterfaceC6473e getDetectDragStart() {
        return this.detectDragStart;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final InterfaceC6471c getTransferData() {
        return this.transferData;
    }

    @NotNull
    public final DragAndDropSourceElement copy(@NotNull InterfaceC6471c drawDragDecoration, @NotNull InterfaceC6473e detectDragStart, @NotNull InterfaceC6471c transferData) {
        return new DragAndDropSourceElement(drawDragDecoration, detectDragStart, transferData);
    }

    @Override // androidx.compose.p011ui.node.ModifierNodeElement
    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DragAndDropSourceElement)) {
            return false;
        }
        DragAndDropSourceElement dragAndDropSourceElement = (DragAndDropSourceElement) other;
        return AbstractC5830k.m5325b(this.drawDragDecoration, dragAndDropSourceElement.drawDragDecoration) && AbstractC5830k.m5325b(this.detectDragStart, dragAndDropSourceElement.detectDragStart) && AbstractC5830k.m5325b(this.transferData, dragAndDropSourceElement.transferData);
    }

    @NotNull
    public final InterfaceC6473e getDetectDragStart() {
        return this.detectDragStart;
    }

    @NotNull
    public final InterfaceC6471c getDrawDragDecoration() {
        return this.drawDragDecoration;
    }

    @NotNull
    public final InterfaceC6471c getTransferData() {
        return this.transferData;
    }

    @Override // androidx.compose.p011ui.node.ModifierNodeElement
    public int hashCode() {
        return this.transferData.hashCode() + ((this.detectDragStart.hashCode() + (this.drawDragDecoration.hashCode() * 31)) * 31);
    }

    @Override // androidx.compose.p011ui.node.ModifierNodeElement
    public void inspectableProperties(@NotNull InspectorInfo inspectorInfo) {
        inspectorInfo.setName("dragSource");
        inspectorInfo.getProperties().set("drawDragDecoration", this.drawDragDecoration);
        inspectorInfo.getProperties().set("detectDragStart", this.detectDragStart);
        inspectorInfo.getProperties().set("transferData", this.transferData);
    }

    @NotNull
    public String toString() {
        return "DragAndDropSourceElement(drawDragDecoration=" + this.drawDragDecoration + ", detectDragStart=" + this.detectDragStart + ", transferData=" + this.transferData + ')';
    }

    @Override // androidx.compose.p011ui.node.ModifierNodeElement
    @NotNull
    public DragAndDropSourceNode create() {
        return new DragAndDropSourceNode(this.drawDragDecoration, this.detectDragStart, this.transferData);
    }

    @Override // androidx.compose.p011ui.node.ModifierNodeElement
    public void update(@NotNull DragAndDropSourceNode node) {
        node.setDrawDragDecoration(this.drawDragDecoration);
        node.setDetectDragStart(this.detectDragStart);
        node.setTransferData(this.transferData);
    }
}
