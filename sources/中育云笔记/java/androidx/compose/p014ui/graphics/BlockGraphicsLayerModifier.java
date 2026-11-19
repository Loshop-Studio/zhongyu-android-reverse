package androidx.compose.p014ui.graphics;

import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.layout.Measurable;
import androidx.compose.p014ui.layout.MeasureResult;
import androidx.compose.p014ui.layout.MeasureScope;
import androidx.compose.p014ui.layout.Placeable;
import androidx.compose.p014ui.node.DelegatableNodeKt;
import androidx.compose.p014ui.node.LayoutModifierNode;
import androidx.compose.p014ui.node.NodeCoordinator;
import androidx.compose.p014ui.node.NodeKind;
import androidx.compose.runtime.internal.StabilityInferred;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class BlockGraphicsLayerModifier extends Modifier.Node implements LayoutModifierNode {
    public static final int $stable = 8;
    private InterfaceC9540l layerBlock;

    public BlockGraphicsLayerModifier(InterfaceC9540l interfaceC9540l) {
        this.layerBlock = interfaceC9540l;
    }

    public final InterfaceC9540l getLayerBlock() {
        return this.layerBlock;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    public final void invalidateLayerBlock() {
        NodeCoordinator wrapped$ui_release = DelegatableNodeKt.m32356requireCoordinator64DMado(this, NodeKind.m32510constructorimpl(2)).getWrapped$ui_release();
        if (wrapped$ui_release != null) {
            wrapped$ui_release.updateLayerBlock(this.layerBlock, true);
        }
    }

    @Override // androidx.compose.p014ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo26769measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j10) {
        final Placeable placeableMo32229measureBRTryo0 = measurable.mo32229measureBRTryo0(j10);
        return MeasureScope.layout$default(measureScope, placeableMo32229measureBRTryo0.getWidth(), placeableMo32229measureBRTryo0.getHeight(), null, new InterfaceC9540l() { // from class: androidx.compose.ui.graphics.BlockGraphicsLayerModifier$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Placeable.PlacementScope) obj);
                return C10786q.f26013a;
            }

            public final void invoke(Placeable.PlacementScope placementScope) {
                Placeable.PlacementScope.placeWithLayer$default(placementScope, placeableMo32229measureBRTryo0, 0, 0, 0.0f, this.getLayerBlock(), 4, (Object) null);
            }
        }, 4, null);
    }

    public final void setLayerBlock(InterfaceC9540l interfaceC9540l) {
        this.layerBlock = interfaceC9540l;
    }

    public String toString() {
        return "BlockGraphicsLayerModifier(block=" + this.layerBlock + ')';
    }
}
