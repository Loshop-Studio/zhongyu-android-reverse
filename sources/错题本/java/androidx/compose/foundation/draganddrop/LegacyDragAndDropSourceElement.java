package androidx.compose.foundation.draganddrop;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.p011ui.node.ModifierNodeElement;
import androidx.compose.p011ui.platform.InspectorInfo;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

@ExperimentalFoundationApi
@Metadata(m5109d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0083\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BI\u0012\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u0012'\u0010\f\u001a#\b\u0001\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\b¢\u0006\u0002\b\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0015\u001a\u00020\u0005*\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0017\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J1\u0010\u0019\u001a#\b\u0001\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\b¢\u0006\u0002\b\u0006HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJV\u0010\u001b\u001a\u00020\u00002\u0019\b\u0002\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u00062)\b\u0002\u0010\f\u001a#\b\u0001\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\b¢\u0006\u0002\b\u0006HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b%\u0010&R(\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b(\u0010\u0018R8\u0010\f\u001a#\b\u0001\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\b¢\u0006\u0002\b\u00068\u0006¢\u0006\f\n\u0004\b\f\u0010)\u001a\u0004\b*\u0010\u001a¨\u0006+"}, m5110d2 = {"Landroidx/compose/foundation/draganddrop/LegacyDragAndDropSourceElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/draganddrop/LegacyDragAndDropSourceNode;", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Ld6/s;", "Lkotlin/ExtensionFunctionType;", "drawDragDecoration", "Lkotlin/Function2;", "Landroidx/compose/foundation/draganddrop/DragAndDropSourceScope;", "Lh6/c;", "", "dragAndDropSourceHandler", "<init>", "(Lr6/c;Lr6/e;)V", "create", "()Landroidx/compose/foundation/draganddrop/LegacyDragAndDropSourceNode;", "node", "update", "(Landroidx/compose/foundation/draganddrop/LegacyDragAndDropSourceNode;)V", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "component1", "()Lr6/c;", "component2", "()Lr6/e;", "copy", "(Lr6/c;Lr6/e;)Landroidx/compose/foundation/draganddrop/LegacyDragAndDropSourceElement;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lr6/c;", "getDrawDragDecoration", "Lr6/e;", "getDragAndDropSourceHandler", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
final /* data */ class LegacyDragAndDropSourceElement extends ModifierNodeElement<LegacyDragAndDropSourceNode> {

    @NotNull
    private final InterfaceC6473e dragAndDropSourceHandler;

    @NotNull
    private final InterfaceC6471c drawDragDecoration;

    public LegacyDragAndDropSourceElement(@NotNull InterfaceC6471c interfaceC6471c, @NotNull InterfaceC6473e interfaceC6473e) {
        this.drawDragDecoration = interfaceC6471c;
        this.dragAndDropSourceHandler = interfaceC6473e;
    }

    public static /* synthetic */ LegacyDragAndDropSourceElement copy$default(LegacyDragAndDropSourceElement legacyDragAndDropSourceElement, InterfaceC6471c interfaceC6471c, InterfaceC6473e interfaceC6473e, int i, Object obj) {
        if ((i & 1) != 0) {
            interfaceC6471c = legacyDragAndDropSourceElement.drawDragDecoration;
        }
        if ((i & 2) != 0) {
            interfaceC6473e = legacyDragAndDropSourceElement.dragAndDropSourceHandler;
        }
        return legacyDragAndDropSourceElement.copy(interfaceC6471c, interfaceC6473e);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final InterfaceC6471c getDrawDragDecoration() {
        return this.drawDragDecoration;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final InterfaceC6473e getDragAndDropSourceHandler() {
        return this.dragAndDropSourceHandler;
    }

    @NotNull
    public final LegacyDragAndDropSourceElement copy(@NotNull InterfaceC6471c drawDragDecoration, @NotNull InterfaceC6473e dragAndDropSourceHandler) {
        return new LegacyDragAndDropSourceElement(drawDragDecoration, dragAndDropSourceHandler);
    }

    @Override // androidx.compose.p011ui.node.ModifierNodeElement
    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LegacyDragAndDropSourceElement)) {
            return false;
        }
        LegacyDragAndDropSourceElement legacyDragAndDropSourceElement = (LegacyDragAndDropSourceElement) other;
        return AbstractC5830k.m5325b(this.drawDragDecoration, legacyDragAndDropSourceElement.drawDragDecoration) && AbstractC5830k.m5325b(this.dragAndDropSourceHandler, legacyDragAndDropSourceElement.dragAndDropSourceHandler);
    }

    @NotNull
    public final InterfaceC6473e getDragAndDropSourceHandler() {
        return this.dragAndDropSourceHandler;
    }

    @NotNull
    public final InterfaceC6471c getDrawDragDecoration() {
        return this.drawDragDecoration;
    }

    @Override // androidx.compose.p011ui.node.ModifierNodeElement
    public int hashCode() {
        return this.dragAndDropSourceHandler.hashCode() + (this.drawDragDecoration.hashCode() * 31);
    }

    @Override // androidx.compose.p011ui.node.ModifierNodeElement
    public void inspectableProperties(@NotNull InspectorInfo inspectorInfo) {
        inspectorInfo.setName("dragSource");
        inspectorInfo.getProperties().set("drawDragDecoration", this.drawDragDecoration);
        inspectorInfo.getProperties().set("dragAndDropSourceHandler", this.dragAndDropSourceHandler);
    }

    @NotNull
    public String toString() {
        return "LegacyDragAndDropSourceElement(drawDragDecoration=" + this.drawDragDecoration + ", dragAndDropSourceHandler=" + this.dragAndDropSourceHandler + ')';
    }

    @Override // androidx.compose.p011ui.node.ModifierNodeElement
    @NotNull
    public LegacyDragAndDropSourceNode create() {
        return new LegacyDragAndDropSourceNode(this.drawDragDecoration, this.dragAndDropSourceHandler);
    }

    @Override // androidx.compose.p011ui.node.ModifierNodeElement
    public void update(@NotNull LegacyDragAndDropSourceNode node) {
        node.setDrawDragDecoration(this.drawDragDecoration);
        node.setDragAndDropSourceHandler(this.dragAndDropSourceHandler);
    }
}
