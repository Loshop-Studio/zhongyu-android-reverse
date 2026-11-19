package androidx.compose.material3;

import androidx.compose.p013ui.layout.LayoutModifier;
import androidx.compose.p013ui.layout.Measurable;
import androidx.compose.p013ui.layout.MeasureResult;
import androidx.compose.p013ui.layout.MeasureScope;
import androidx.compose.p013ui.layout.Placeable;
import androidx.compose.p013ui.platform.InspectorValueInfo;
import p123h7.C8736p;
import p300x7.InterfaceC10570l;

/* loaded from: classes2.dex */
final class VisibleModifier extends InspectorValueInfo implements LayoutModifier {
    private final boolean visible;

    public VisibleModifier(boolean z10, InterfaceC10570l interfaceC10570l) {
        super(interfaceC10570l);
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

    @Override // androidx.compose.p013ui.layout.LayoutModifier
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo20776measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j10) {
        final Placeable placeableMo25627measureBRTryo0 = measurable.mo25627measureBRTryo0(j10);
        return !this.visible ? MeasureScope.layout$default(measureScope, 0, 0, null, new InterfaceC10570l() { // from class: androidx.compose.material3.VisibleModifier$measure$1
            public final void invoke(Placeable.PlacementScope placementScope) {
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Placeable.PlacementScope) obj);
                return C8736p.f16368a;
            }
        }, 4, null) : MeasureScope.layout$default(measureScope, placeableMo25627measureBRTryo0.getWidth(), placeableMo25627measureBRTryo0.getHeight(), null, new InterfaceC10570l() { // from class: androidx.compose.material3.VisibleModifier$measure$2
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Placeable.PlacementScope) obj);
                return C8736p.f16368a;
            }

            public final void invoke(Placeable.PlacementScope placementScope) {
                Placeable.PlacementScope.place$default(placementScope, placeableMo25627measureBRTryo0, 0, 0, 0.0f, 4, null);
            }
        }, 4, null);
    }
}
