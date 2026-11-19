package androidx.compose.foundation.draganddrop;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.p014ui.node.ModifierNodeElement;
import androidx.compose.p014ui.platform.InspectorInfo;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9544p;

@ExperimentalFoundationApi
/* loaded from: classes.dex */
final class LegacyDragAndDropSourceWithDefaultShadowElement extends ModifierNodeElement<LegacyDragSourceNodeWithDefaultPainter> {
    private final InterfaceC9544p dragAndDropSourceHandler;

    public LegacyDragAndDropSourceWithDefaultShadowElement(InterfaceC9544p interfaceC9544p) {
        this.dragAndDropSourceHandler = interfaceC9544p;
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LegacyDragAndDropSourceWithDefaultShadowElement) {
            return AbstractC9979u.m20289b(this.dragAndDropSourceHandler, ((LegacyDragAndDropSourceWithDefaultShadowElement) obj).dragAndDropSourceHandler);
        }
        return false;
    }

    public final InterfaceC9544p getDragAndDropSourceHandler() {
        return this.dragAndDropSourceHandler;
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public int hashCode() {
        return this.dragAndDropSourceHandler.hashCode();
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("dragSourceWithDefaultPainter");
        inspectorInfo.getProperties().set("dragAndDropSourceHandler", this.dragAndDropSourceHandler);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public LegacyDragSourceNodeWithDefaultPainter create() {
        return new LegacyDragSourceNodeWithDefaultPainter(this.dragAndDropSourceHandler);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void update(LegacyDragSourceNodeWithDefaultPainter legacyDragSourceNodeWithDefaultPainter) {
        legacyDragSourceNodeWithDefaultPainter.setDragAndDropSourceHandler(this.dragAndDropSourceHandler);
    }
}
