package androidx.compose.foundation;

import android.content.Context;
import android.os.Build;
import androidx.compose.p006ui.Modifier;
import androidx.compose.p006ui.layout.LayoutModifierKt;
import androidx.compose.p006ui.layout.Measurable;
import androidx.compose.p006ui.layout.MeasureResult;
import androidx.compose.p006ui.layout.MeasureScope;
import androidx.compose.p006ui.layout.Placeable;
import androidx.compose.p006ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p006ui.unit.C1700Dp;
import androidx.compose.p006ui.unit.Constraints;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m5174d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\r\u0010\u0002\u001a\u00020\u0003H\u0001¢\u0006\u0002\u0010\u0004\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m5175d2 = {"StretchOverscrollNonClippingLayer", "Landroidx/compose/ui/Modifier;", "rememberOverscrollEffect", "Landroidx/compose/foundation/OverscrollEffect;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/OverscrollEffect;", "foundation_release"}, m5176k = 2, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nAndroidOverscroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidOverscroll.kt\nandroidx/compose/foundation/AndroidOverscrollKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,589:1\n76#2:590\n76#2:591\n50#3:592\n49#3:593\n1114#4,6:594\n*S KotlinDebug\n*F\n+ 1 AndroidOverscroll.kt\nandroidx/compose/foundation/AndroidOverscrollKt\n*L\n64#1:590\n65#1:591\n67#1:592\n67#1:593\n67#1:594,6\n*E\n"})
/* loaded from: classes.dex */
public final class AndroidOverscrollKt {
    private static final Modifier StretchOverscrollNonClippingLayer;

    static {
        StretchOverscrollNonClippingLayer = Build.VERSION.SDK_INT >= 31 ? LayoutModifierKt.layout(LayoutModifierKt.layout(Modifier.INSTANCE, new Function3<MeasureScope, Measurable, Constraints, MeasureResult>() { // from class: androidx.compose.foundation.AndroidOverscrollKt$StretchOverscrollNonClippingLayer$1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ MeasureResult invoke(MeasureScope measureScope, Measurable measurable, Constraints constraints) {
                return m7065invoke3p2s80s(measureScope, measurable, constraints.getValue());
            }

            /* renamed from: invoke-3p2s80s, reason: not valid java name */
            public final MeasureResult m7065invoke3p2s80s(MeasureScope layout, Measurable measurable, long j4) {
                Intrinsics.checkNotNullParameter(layout, "$this$layout");
                Intrinsics.checkNotNullParameter(measurable, "measurable");
                final Placeable placeableMo10585measureBRTryo0 = measurable.mo10585measureBRTryo0(j4);
                final int iMo7200roundToPx0680j_4 = layout.mo7200roundToPx0680j_4(C1700Dp.m11525constructorimpl(ClipScrollableContainerKt.getMaxSupportedElevation() * 2));
                return MeasureScope.CC.m634p(layout, placeableMo10585measureBRTryo0.getMeasuredWidth() - iMo7200roundToPx0680j_4, placeableMo10585measureBRTryo0.getMeasuredHeight() - iMo7200roundToPx0680j_4, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.AndroidOverscrollKt$StretchOverscrollNonClippingLayer$1.1
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
                    public final void invoke2(Placeable.PlacementScope layout2) {
                        Intrinsics.checkNotNullParameter(layout2, "$this$layout");
                        Placeable placeable = placeableMo10585measureBRTryo0;
                        Placeable.PlacementScope.placeWithLayer$default(layout2, placeable, ((-iMo7200roundToPx0680j_4) / 2) - ((placeable.getWidth() - placeableMo10585measureBRTryo0.getMeasuredWidth()) / 2), ((-iMo7200roundToPx0680j_4) / 2) - ((placeableMo10585measureBRTryo0.getHeight() - placeableMo10585measureBRTryo0.getMeasuredHeight()) / 2), 0.0f, null, 12, null);
                    }
                }, 4, null);
            }
        }), new Function3<MeasureScope, Measurable, Constraints, MeasureResult>() { // from class: androidx.compose.foundation.AndroidOverscrollKt$StretchOverscrollNonClippingLayer$2
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ MeasureResult invoke(MeasureScope measureScope, Measurable measurable, Constraints constraints) {
                return m7066invoke3p2s80s(measureScope, measurable, constraints.getValue());
            }

            /* renamed from: invoke-3p2s80s, reason: not valid java name */
            public final MeasureResult m7066invoke3p2s80s(MeasureScope layout, Measurable measurable, long j4) {
                Intrinsics.checkNotNullParameter(layout, "$this$layout");
                Intrinsics.checkNotNullParameter(measurable, "measurable");
                final Placeable placeableMo10585measureBRTryo0 = measurable.mo10585measureBRTryo0(j4);
                final int iMo7200roundToPx0680j_4 = layout.mo7200roundToPx0680j_4(C1700Dp.m11525constructorimpl(ClipScrollableContainerKt.getMaxSupportedElevation() * 2));
                return MeasureScope.CC.m634p(layout, placeableMo10585measureBRTryo0.getWidth() + iMo7200roundToPx0680j_4, placeableMo10585measureBRTryo0.getHeight() + iMo7200roundToPx0680j_4, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.AndroidOverscrollKt$StretchOverscrollNonClippingLayer$2.1
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
                    public final void invoke2(Placeable.PlacementScope layout2) {
                        Intrinsics.checkNotNullParameter(layout2, "$this$layout");
                        Placeable placeable = placeableMo10585measureBRTryo0;
                        int i4 = iMo7200roundToPx0680j_4;
                        Placeable.PlacementScope.place$default(layout2, placeable, i4 / 2, i4 / 2, 0.0f, 4, null);
                    }
                }, 4, null);
            }
        }) : Modifier.INSTANCE;
    }

    @Composable
    public static final OverscrollEffect rememberOverscrollEffect(Composer composer, int i4) {
        OverscrollEffect overscrollEffect;
        composer.startReplaceableGroup(-81138291);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-81138291, i4, -1, "androidx.compose.foundation.rememberOverscrollEffect (AndroidOverscroll.kt:62)");
        }
        Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        OverscrollConfiguration overscrollConfiguration = (OverscrollConfiguration) composer.consume(OverscrollConfigurationKt.getLocalOverscrollConfiguration());
        if (overscrollConfiguration != null) {
            composer.startReplaceableGroup(511388516);
            boolean zChanged = composer.changed(context) | composer.changed(overscrollConfiguration);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new AndroidEdgeEffectOverscrollEffect(context, overscrollConfiguration);
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceableGroup();
            overscrollEffect = (OverscrollEffect) objRememberedValue;
        } else {
            overscrollEffect = NoOpOverscrollEffect.INSTANCE;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return overscrollEffect;
    }
}
