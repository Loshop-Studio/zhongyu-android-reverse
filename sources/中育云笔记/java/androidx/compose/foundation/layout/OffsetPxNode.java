package androidx.compose.foundation.layout;

import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.layout.Measurable;
import androidx.compose.p014ui.layout.MeasureResult;
import androidx.compose.p014ui.layout.MeasureScope;
import androidx.compose.p014ui.layout.Placeable;
import androidx.compose.p014ui.node.LayoutModifierNode;
import androidx.compose.p014ui.node.LayoutModifierNodeKt;
import androidx.compose.p014ui.unit.IntOffset;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;

/* loaded from: classes.dex */
final class OffsetPxNode extends Modifier.Node implements LayoutModifierNode {
    private InterfaceC9540l offset;
    private boolean rtlAware;
    private final boolean shouldAutoInvalidate;

    public OffsetPxNode(InterfaceC9540l interfaceC9540l, boolean z10) {
        this.offset = interfaceC9540l;
        this.rtlAware = z10;
    }

    public final InterfaceC9540l getOffset() {
        return this.offset;
    }

    public final boolean getRtlAware() {
        return this.rtlAware;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    @Override // androidx.compose.p014ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo26769measure3p2s80s(final MeasureScope measureScope, Measurable measurable, long j10) {
        final Placeable placeableMo32229measureBRTryo0 = measurable.mo32229measureBRTryo0(j10);
        return MeasureScope.layout$default(measureScope, placeableMo32229measureBRTryo0.getWidth(), placeableMo32229measureBRTryo0.getHeight(), null, new InterfaceC9540l() { // from class: androidx.compose.foundation.layout.OffsetPxNode$measure$1
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
                long jM33638unboximpl = ((IntOffset) this.this$0.getOffset().invoke(measureScope)).m33638unboximpl();
                if (this.this$0.getRtlAware()) {
                    Placeable.PlacementScope.placeRelativeWithLayer$default(placementScope, placeableMo32229measureBRTryo0, IntOffset.m33629getXimpl(jM33638unboximpl), IntOffset.m33630getYimpl(jM33638unboximpl), 0.0f, (InterfaceC9540l) null, 12, (Object) null);
                } else {
                    Placeable.PlacementScope.placeWithLayer$default(placementScope, placeableMo32229measureBRTryo0, IntOffset.m33629getXimpl(jM33638unboximpl), IntOffset.m33630getYimpl(jM33638unboximpl), 0.0f, (InterfaceC9540l) null, 12, (Object) null);
                }
            }
        }, 4, null);
    }

    public final void setOffset(InterfaceC9540l interfaceC9540l) {
        this.offset = interfaceC9540l;
    }

    public final void setRtlAware(boolean z10) {
        this.rtlAware = z10;
    }

    public final void update(InterfaceC9540l interfaceC9540l, boolean z10) {
        if (this.offset != interfaceC9540l || this.rtlAware != z10) {
            LayoutModifierNodeKt.invalidatePlacement(this);
        }
        this.offset = interfaceC9540l;
        this.rtlAware = z10;
    }
}
