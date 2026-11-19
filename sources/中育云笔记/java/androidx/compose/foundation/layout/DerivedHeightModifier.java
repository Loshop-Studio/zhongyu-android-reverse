package androidx.compose.foundation.layout;

import androidx.compose.p014ui.layout.LayoutModifier;
import androidx.compose.p014ui.layout.Measurable;
import androidx.compose.p014ui.layout.MeasureResult;
import androidx.compose.p014ui.layout.MeasureScope;
import androidx.compose.p014ui.layout.Placeable;
import androidx.compose.p014ui.modifier.ModifierLocalConsumer;
import androidx.compose.p014ui.modifier.ModifierLocalReadScope;
import androidx.compose.p014ui.platform.InspectorValueInfo;
import androidx.compose.p014ui.unit.Constraints;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;

@Stable
/* loaded from: classes.dex */
final class DerivedHeightModifier extends InspectorValueInfo implements LayoutModifier, ModifierLocalConsumer {
    private final InterfaceC9544p heightCalc;
    private final WindowInsets insets;
    private final MutableState unconsumedInsets$delegate;

    public DerivedHeightModifier(WindowInsets windowInsets, InterfaceC9540l interfaceC9540l, InterfaceC9544p interfaceC9544p) {
        super(interfaceC9540l);
        this.insets = windowInsets;
        this.heightCalc = interfaceC9544p;
        this.unconsumedInsets$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(windowInsets, null, 2, null);
    }

    private final WindowInsets getUnconsumedInsets() {
        return (WindowInsets) this.unconsumedInsets$delegate.getValue();
    }

    private final void setUnconsumedInsets(WindowInsets windowInsets) {
        this.unconsumedInsets$delegate.setValue(windowInsets);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DerivedHeightModifier)) {
            return false;
        }
        DerivedHeightModifier derivedHeightModifier = (DerivedHeightModifier) obj;
        return AbstractC9979u.m20289b(this.insets, derivedHeightModifier.insets) && this.heightCalc == derivedHeightModifier.heightCalc;
    }

    public int hashCode() {
        return (this.insets.hashCode() * 31) + this.heightCalc.hashCode();
    }

    @Override // androidx.compose.p014ui.layout.LayoutModifier
    /* renamed from: measure-3p2s80s, reason: not valid java name */
    public MeasureResult mo27378measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j10) {
        int iIntValue = ((Number) this.heightCalc.invoke(getUnconsumedInsets(), measureScope)).intValue();
        if (iIntValue == 0) {
            return MeasureScope.layout$default(measureScope, 0, 0, null, new InterfaceC9540l() { // from class: androidx.compose.foundation.layout.DerivedHeightModifier$measure$1
                public final void invoke(Placeable.PlacementScope placementScope) {
                }

                @Override // p181hd.InterfaceC9540l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Placeable.PlacementScope) obj);
                    return C10786q.f26013a;
                }
            }, 4, null);
        }
        final Placeable placeableMo32229measureBRTryo0 = measurable.mo32229measureBRTryo0(Constraints.m33444copyZbe2FdA$default(j10, 0, 0, iIntValue, iIntValue, 3, null));
        return MeasureScope.layout$default(measureScope, placeableMo32229measureBRTryo0.getWidth(), iIntValue, null, new InterfaceC9540l() { // from class: androidx.compose.foundation.layout.DerivedHeightModifier$measure$2
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Placeable.PlacementScope) obj);
                return C10786q.f26013a;
            }

            public final void invoke(Placeable.PlacementScope placementScope) {
                Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo32229measureBRTryo0, 0, 0, 0.0f, 4, null);
            }
        }, 4, null);
    }

    @Override // androidx.compose.p014ui.modifier.ModifierLocalConsumer
    public void onModifierLocalsUpdated(ModifierLocalReadScope modifierLocalReadScope) {
        setUnconsumedInsets(WindowInsetsKt.exclude(this.insets, (WindowInsets) modifierLocalReadScope.getCurrent(WindowInsetsPaddingKt.getModifierLocalConsumedWindowInsets())));
    }
}
