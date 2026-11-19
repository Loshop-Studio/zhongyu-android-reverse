package androidx.compose.material3;

import androidx.compose.p014ui.layout.LayoutModifier;
import androidx.compose.p014ui.layout.Measurable;
import androidx.compose.p014ui.layout.MeasureResult;
import androidx.compose.p014ui.layout.MeasureScope;
import androidx.compose.p014ui.layout.Placeable;
import androidx.compose.p014ui.platform.InspectorValueInfo;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;

/* loaded from: classes2.dex */
final class VisibleModifier extends InspectorValueInfo implements LayoutModifier {
    private final boolean visible;

    public VisibleModifier(boolean z10, InterfaceC9540l interfaceC9540l) {
        super(interfaceC9540l);
        this.visible = z10;
    }

    public boolean equals(Object obj) {
        VisibleModifier visibleModifier = obj instanceof VisibleModifier ? (VisibleModifier) obj : null;
        return visibleModifier != null && this.visible == visibleModifier.visible;
    }

    public final boolean getVisible() {
        return this.visible;
    }

    public int hashCode() {
        return Boolean.hashCode(this.visible);
    }

    @Override // androidx.compose.p014ui.layout.LayoutModifier
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo27378measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j10) {
        final Placeable placeableMo32229measureBRTryo0 = measurable.mo32229measureBRTryo0(j10);
        return !this.visible ? MeasureScope.layout$default(measureScope, 0, 0, null, new InterfaceC9540l() { // from class: androidx.compose.material3.VisibleModifier$measure$1
            public final void invoke(Placeable.PlacementScope placementScope) {
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Placeable.PlacementScope) obj);
                return C10786q.f26013a;
            }
        }, 4, null) : MeasureScope.layout$default(measureScope, placeableMo32229measureBRTryo0.getWidth(), placeableMo32229measureBRTryo0.getHeight(), null, new InterfaceC9540l() { // from class: androidx.compose.material3.VisibleModifier$measure$2
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Placeable.PlacementScope) obj);
                return C10786q.f26013a;
            }

            public final void invoke(Placeable.PlacementScope placementScope) {
                Placeable.PlacementScope.place$default(placementScope, placeableMo32229measureBRTryo0, 0, 0, 0.0f, 4, null);
            }
        }, 4, null);
    }
}
