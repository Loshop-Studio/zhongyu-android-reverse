package androidx.compose.p014ui.graphics;

import androidx.compose.p014ui.node.ModifierNodeElement;
import androidx.compose.p014ui.platform.InspectorInfo;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;

/* loaded from: classes2.dex */
final class BlockGraphicsLayerElement extends ModifierNodeElement<BlockGraphicsLayerModifier> {
    private final InterfaceC9540l block;

    public BlockGraphicsLayerElement(InterfaceC9540l interfaceC9540l) {
        this.block = interfaceC9540l;
    }

    public static /* synthetic */ BlockGraphicsLayerElement copy$default(BlockGraphicsLayerElement blockGraphicsLayerElement, InterfaceC9540l interfaceC9540l, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC9540l = blockGraphicsLayerElement.block;
        }
        return blockGraphicsLayerElement.copy(interfaceC9540l);
    }

    public final InterfaceC9540l component1() {
        return this.block;
    }

    public final BlockGraphicsLayerElement copy(InterfaceC9540l interfaceC9540l) {
        return new BlockGraphicsLayerElement(interfaceC9540l);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BlockGraphicsLayerElement) && AbstractC9979u.m20289b(this.block, ((BlockGraphicsLayerElement) obj).block);
    }

    public final InterfaceC9540l getBlock() {
        return this.block;
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public int hashCode() {
        return this.block.hashCode();
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("graphicsLayer");
        inspectorInfo.getProperties().set("block", this.block);
    }

    public String toString() {
        return "BlockGraphicsLayerElement(block=" + this.block + ')';
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public BlockGraphicsLayerModifier create() {
        return new BlockGraphicsLayerModifier(this.block);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void update(BlockGraphicsLayerModifier blockGraphicsLayerModifier) {
        blockGraphicsLayerModifier.setLayerBlock(this.block);
        blockGraphicsLayerModifier.invalidateLayerBlock();
    }
}
