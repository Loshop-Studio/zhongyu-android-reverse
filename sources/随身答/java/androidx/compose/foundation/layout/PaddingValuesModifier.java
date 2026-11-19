package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.internal.InlineClassHelperKt;
import androidx.compose.p012ui.Modifier;
import androidx.compose.p012ui.layout.Measurable;
import androidx.compose.p012ui.layout.MeasureResult;
import androidx.compose.p012ui.layout.MeasureScope;
import androidx.compose.p012ui.layout.Placeable;
import androidx.compose.p012ui.node.LayoutModifierNode;
import androidx.compose.p012ui.unit.C3115Dp;
import androidx.compose.p012ui.unit.ConstraintsKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13412d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J&\u0010\t\u001a\u00020\n*\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0012"}, m13413d2 = {"Landroidx/compose/foundation/layout/PaddingValuesModifier;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "paddingValues", "Landroidx/compose/foundation/layout/PaddingValues;", "(Landroidx/compose/foundation/layout/PaddingValues;)V", "getPaddingValues", "()Landroidx/compose/foundation/layout/PaddingValues;", "setPaddingValues", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurable", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "foundation-layout_release"}, m13414k = 1, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nPadding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingValuesModifier\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/foundation/layout/internal/InlineClassHelperKt\n*L\n1#1,472:1\n113#2:473\n113#2:474\n113#2:475\n113#2:476\n92#3,5:477\n*S KotlinDebug\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingValuesModifier\n*L\n451#1:473\n452#1:474\n453#1:475\n454#1:476\n450#1:477,5\n*E\n"})
/* loaded from: classes.dex */
final class PaddingValuesModifier extends Modifier.Node implements LayoutModifierNode {
    private PaddingValues paddingValues;

    public PaddingValuesModifier(PaddingValues paddingValues) {
        this.paddingValues = paddingValues;
    }

    public final PaddingValues getPaddingValues() {
        return this.paddingValues;
    }

    @Override // androidx.compose.p012ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo17449measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j9) {
        float fMo18064calculateLeftPaddingu2uoSUM = this.paddingValues.mo18064calculateLeftPaddingu2uoSUM(measureScope.getLayoutDirection());
        float top2 = this.paddingValues.getTop();
        float fMo18065calculateRightPaddingu2uoSUM = this.paddingValues.mo18065calculateRightPaddingu2uoSUM(measureScope.getLayoutDirection());
        float bottom = this.paddingValues.getBottom();
        float f10 = 0;
        if (!((C3115Dp.m23993compareTo0680j_4(bottom, C3115Dp.m23994constructorimpl(f10)) >= 0) & (C3115Dp.m23993compareTo0680j_4(fMo18064calculateLeftPaddingu2uoSUM, C3115Dp.m23994constructorimpl(f10)) >= 0) & (C3115Dp.m23993compareTo0680j_4(top2, C3115Dp.m23994constructorimpl(f10)) >= 0) & (C3115Dp.m23993compareTo0680j_4(fMo18065calculateRightPaddingu2uoSUM, C3115Dp.m23994constructorimpl(f10)) >= 0))) {
            InlineClassHelperKt.throwIllegalArgumentException("Padding must be non-negative");
        }
        final int iMo17759roundToPx0680j_4 = measureScope.mo17759roundToPx0680j_4(fMo18064calculateLeftPaddingu2uoSUM);
        int iMo17759roundToPx0680j_42 = measureScope.mo17759roundToPx0680j_4(fMo18065calculateRightPaddingu2uoSUM) + iMo17759roundToPx0680j_4;
        final int iMo17759roundToPx0680j_43 = measureScope.mo17759roundToPx0680j_4(top2);
        int iMo17759roundToPx0680j_44 = measureScope.mo17759roundToPx0680j_4(bottom) + iMo17759roundToPx0680j_43;
        final Placeable placeableMo22757measureBRTryo0 = measurable.mo22757measureBRTryo0(ConstraintsKt.m23966offsetNN6EwU(j9, -iMo17759roundToPx0680j_42, -iMo17759roundToPx0680j_44));
        return MeasureScope.layout$default(measureScope, ConstraintsKt.m23964constrainWidthK40F9xA(j9, placeableMo22757measureBRTryo0.getWidth() + iMo17759roundToPx0680j_42), ConstraintsKt.m23963constrainHeightK40F9xA(j9, placeableMo22757measureBRTryo0.getHeight() + iMo17759roundToPx0680j_44), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.layout.PaddingValuesModifier$measure$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                Placeable.PlacementScope.place$default(placementScope, placeableMo22757measureBRTryo0, iMo17759roundToPx0680j_4, iMo17759roundToPx0680j_43, 0.0f, 4, null);
            }
        }, 4, null);
    }

    public final void setPaddingValues(PaddingValues paddingValues) {
        this.paddingValues = paddingValues;
    }
}
