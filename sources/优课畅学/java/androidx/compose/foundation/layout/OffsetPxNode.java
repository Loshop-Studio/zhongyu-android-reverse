package androidx.compose.foundation.layout;

import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.layout.Measurable;
import androidx.compose.p013ui.layout.MeasureResult;
import androidx.compose.p013ui.layout.MeasureScope;
import androidx.compose.p013ui.layout.Placeable;
import androidx.compose.p013ui.node.LayoutModifierNode;
import androidx.compose.p013ui.node.LayoutModifierNodeKt;
import androidx.compose.p013ui.unit.IntOffset;
import p123h7.C8736p;
import p300x7.InterfaceC10570l;

/* loaded from: classes.dex */
final class OffsetPxNode extends Modifier.Node implements LayoutModifierNode {
    private InterfaceC10570l offset;
    private boolean rtlAware;
    private final boolean shouldAutoInvalidate;

    public OffsetPxNode(InterfaceC10570l interfaceC10570l, boolean z10) {
        this.offset = interfaceC10570l;
        this.rtlAware = z10;
    }

    public final InterfaceC10570l getOffset() {
        return this.offset;
    }

    public final boolean getRtlAware() {
        return this.rtlAware;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    @Override // androidx.compose.p013ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo20167measure3p2s80s(final MeasureScope measureScope, Measurable measurable, long j10) {
        final Placeable placeableMo25627measureBRTryo0 = measurable.mo25627measureBRTryo0(j10);
        return MeasureScope.layout$default(measureScope, placeableMo25627measureBRTryo0.getWidth(), placeableMo25627measureBRTryo0.getHeight(), null, new InterfaceC10570l() { // from class: androidx.compose.foundation.layout.OffsetPxNode$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Placeable.PlacementScope) obj);
                return C8736p.f16368a;
            }

            public final void invoke(Placeable.PlacementScope placementScope) {
                long jM27036unboximpl = ((IntOffset) this.this$0.getOffset().invoke(measureScope)).m27036unboximpl();
                if (this.this$0.getRtlAware()) {
                    Placeable.PlacementScope.placeRelativeWithLayer$default(placementScope, placeableMo25627measureBRTryo0, IntOffset.m27027getXimpl(jM27036unboximpl), IntOffset.m27028getYimpl(jM27036unboximpl), 0.0f, (InterfaceC10570l) null, 12, (Object) null);
                } else {
                    Placeable.PlacementScope.placeWithLayer$default(placementScope, placeableMo25627measureBRTryo0, IntOffset.m27027getXimpl(jM27036unboximpl), IntOffset.m27028getYimpl(jM27036unboximpl), 0.0f, (InterfaceC10570l) null, 12, (Object) null);
                }
            }
        }, 4, null);
    }

    public final void setOffset(InterfaceC10570l interfaceC10570l) {
        this.offset = interfaceC10570l;
    }

    public final void setRtlAware(boolean z10) {
        this.rtlAware = z10;
    }

    public final void update(InterfaceC10570l interfaceC10570l, boolean z10) {
        if (this.offset != interfaceC10570l || this.rtlAware != z10) {
            LayoutModifierNodeKt.invalidatePlacement(this);
        }
        this.offset = interfaceC10570l;
        this.rtlAware = z10;
    }
}
