package androidx.compose.foundation.layout;

import androidx.compose.p014ui.layout.LayoutModifier;
import androidx.compose.p014ui.layout.Measurable;
import androidx.compose.p014ui.layout.MeasureResult;
import androidx.compose.p014ui.layout.MeasureScope;
import androidx.compose.p014ui.layout.Placeable;
import androidx.compose.p014ui.modifier.ModifierLocalConsumer;
import androidx.compose.p014ui.modifier.ModifierLocalProvider;
import androidx.compose.p014ui.modifier.ModifierLocalReadScope;
import androidx.compose.p014ui.modifier.ProvidableModifierLocal;
import androidx.compose.p014ui.unit.ConstraintsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class InsetsPaddingModifier implements LayoutModifier, ModifierLocalConsumer, ModifierLocalProvider<WindowInsets> {
    public static final int $stable = 0;
    private final MutableState consumedInsets$delegate;
    private final WindowInsets insets;
    private final MutableState unconsumedInsets$delegate;

    public InsetsPaddingModifier(WindowInsets windowInsets) {
        this.insets = windowInsets;
        this.unconsumedInsets$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(windowInsets, null, 2, null);
        this.consumedInsets$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(windowInsets, null, 2, null);
    }

    private final WindowInsets getConsumedInsets() {
        return (WindowInsets) this.consumedInsets$delegate.getValue();
    }

    private final WindowInsets getUnconsumedInsets() {
        return (WindowInsets) this.unconsumedInsets$delegate.getValue();
    }

    private final void setConsumedInsets(WindowInsets windowInsets) {
        this.consumedInsets$delegate.setValue(windowInsets);
    }

    private final void setUnconsumedInsets(WindowInsets windowInsets) {
        this.unconsumedInsets$delegate.setValue(windowInsets);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof InsetsPaddingModifier) {
            return AbstractC9979u.m20289b(((InsetsPaddingModifier) obj).insets, this.insets);
        }
        return false;
    }

    @Override // androidx.compose.p014ui.modifier.ModifierLocalProvider
    public ProvidableModifierLocal<WindowInsets> getKey() {
        return WindowInsetsPaddingKt.getModifierLocalConsumedWindowInsets();
    }

    public int hashCode() {
        return this.insets.hashCode();
    }

    @Override // androidx.compose.p014ui.layout.LayoutModifier
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo27378measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j10) {
        final int left = getUnconsumedInsets().getLeft(measureScope, measureScope.getLayoutDirection());
        final int top2 = getUnconsumedInsets().getTop(measureScope);
        int right = getUnconsumedInsets().getRight(measureScope, measureScope.getLayoutDirection()) + left;
        int bottom = getUnconsumedInsets().getBottom(measureScope) + top2;
        final Placeable placeableMo32229measureBRTryo0 = measurable.mo32229measureBRTryo0(ConstraintsKt.m33473offsetNN6EwU(j10, -right, -bottom));
        return MeasureScope.layout$default(measureScope, ConstraintsKt.m33471constrainWidthK40F9xA(j10, placeableMo32229measureBRTryo0.getWidth() + right), ConstraintsKt.m33470constrainHeightK40F9xA(j10, placeableMo32229measureBRTryo0.getHeight() + bottom), null, new InterfaceC9540l() { // from class: androidx.compose.foundation.layout.InsetsPaddingModifier$measure$1
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
                Placeable.PlacementScope.place$default(placementScope, placeableMo32229measureBRTryo0, left, top2, 0.0f, 4, null);
            }
        }, 4, null);
    }

    @Override // androidx.compose.p014ui.modifier.ModifierLocalConsumer
    public void onModifierLocalsUpdated(ModifierLocalReadScope modifierLocalReadScope) {
        WindowInsets windowInsets = (WindowInsets) modifierLocalReadScope.getCurrent(WindowInsetsPaddingKt.getModifierLocalConsumedWindowInsets());
        setUnconsumedInsets(WindowInsetsKt.exclude(this.insets, windowInsets));
        setConsumedInsets(WindowInsetsKt.union(windowInsets, this.insets));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.p014ui.modifier.ModifierLocalProvider
    public WindowInsets getValue() {
        return getConsumedInsets();
    }
}
