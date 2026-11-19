package androidx.constraintlayout.compose;

import androidx.compose.p012ui.layout.Measurable;
import androidx.compose.p012ui.layout.MeasurePolicy;
import androidx.compose.p012ui.layout.MeasureResult;
import androidx.compose.p012ui.layout.MeasureScope;
import androidx.compose.p012ui.layout.Placeable;
import androidx.compose.p012ui.unit.IntSize;
import androidx.compose.runtime.MutableState;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

@Metadata(m13412d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0004\b\b\u0010\t"}, m13413d2 = {"<anonymous>", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurables", "", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;"}, m13414k = 3, m13415mv = {1, 8, 0}, m13417xi = 176)
/* loaded from: classes2.dex */
public final class ConstraintLayoutKt$ConstraintLayout$measurePolicy$1$1 implements MeasurePolicy {
    final /* synthetic */ ConstraintSetForInlineDsl $constraintSet;
    final /* synthetic */ MutableState<Unit> $contentTracker;
    final /* synthetic */ Measurer2 $measurer;
    final /* synthetic */ int $optimizationLevel;
    final /* synthetic */ MutableState<Boolean> $remeasureRequesterState;

    public ConstraintLayoutKt$ConstraintLayout$measurePolicy$1$1(MutableState<Unit> mutableState, Measurer2 measurer2, ConstraintSetForInlineDsl constraintSetForInlineDsl, int i9, MutableState<Boolean> mutableState2) {
        this.$contentTracker = mutableState;
        this.$measurer = measurer2;
        this.$constraintSet = constraintSetForInlineDsl;
        this.$optimizationLevel = i9;
        this.$remeasureRequesterState = mutableState2;
    }

    @Override // androidx.compose.p012ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo17421measure3p2s80s(MeasureScope measureScope, final List<? extends Measurable> list, long j9) {
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.$contentTracker.getValue();
        long jM24395performMeasureDjhGOtQ = this.$measurer.m24395performMeasureDjhGOtQ(j9, measureScope.getLayoutDirection(), this.$constraintSet, list, linkedHashMap, this.$optimizationLevel);
        this.$remeasureRequesterState.getValue();
        int iM24165getWidthimpl = IntSize.m24165getWidthimpl(jM24395performMeasureDjhGOtQ);
        int iM24164getHeightimpl = IntSize.m24164getHeightimpl(jM24395performMeasureDjhGOtQ);
        final Measurer2 measurer2 = this.$measurer;
        return MeasureScope.layout$default(measureScope, iM24165getWidthimpl, iM24164getHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.constraintlayout.compose.ConstraintLayoutKt$ConstraintLayout$measurePolicy$1$1.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Placeable.PlacementScope placementScope) {
                measurer2.performLayout(placementScope, list, linkedHashMap);
            }
        }, 4, null);
    }
}
