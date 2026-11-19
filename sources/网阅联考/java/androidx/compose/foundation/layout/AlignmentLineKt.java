package androidx.compose.foundation.layout;

import androidx.compose.p006ui.Modifier;
import androidx.compose.p006ui.layout.AlignmentLine;
import androidx.compose.p006ui.layout.HorizontalAlignmentLine;
import androidx.compose.p006ui.layout.Measurable;
import androidx.compose.p006ui.layout.MeasureResult;
import androidx.compose.p006ui.layout.MeasureScope;
import androidx.compose.p006ui.layout.Placeable;
import androidx.compose.p006ui.platform.InspectableValueKt;
import androidx.compose.p006ui.platform.InspectorInfo;
import androidx.compose.p006ui.unit.C1700Dp;
import androidx.compose.p006ui.unit.Constraints;
import androidx.compose.p006ui.unit.TextUnit;
import androidx.compose.p006ui.unit.TextUnitKt;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;

@Metadata(m5174d1 = {"\u0000@\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u001aA\u0010\u0005\u001a\u00020\u0006*\u00020\u00072\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a5\u0010\u0012\u001a\u00020\u0013*\u00020\u00132\u0006\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001a5\u0010\u0012\u001a\u00020\u0013*\u00020\u00132\u0006\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00162\b\b\u0002\u0010\u000b\u001a\u00020\u0016H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u001a-\u0010\u0019\u001a\u00020\u0013*\u00020\u00132\b\b\u0002\u0010\u001a\u001a\u00020\n2\b\b\u0002\u0010\u001b\u001a\u00020\nH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001d\u001a-\u0010\u0019\u001a\u00020\u0013*\u00020\u00132\b\b\u0002\u0010\u001a\u001a\u00020\u00162\b\b\u0002\u0010\u001b\u001a\u00020\u0016H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u001f\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006 "}, m5175d2 = {"horizontal", "", "Landroidx/compose/ui/layout/AlignmentLine;", "getHorizontal", "(Landroidx/compose/ui/layout/AlignmentLine;)Z", "alignmentLineOffsetMeasure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "alignmentLine", "before", "Landroidx/compose/ui/unit/Dp;", "after", "measurable", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "alignmentLineOffsetMeasure-tjqqzMA", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/AlignmentLine;FFLandroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "paddingFrom", "Landroidx/compose/ui/Modifier;", "paddingFrom-4j6BHR0", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/layout/AlignmentLine;FF)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/unit/TextUnit;", "paddingFrom-Y_r0B1c", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/layout/AlignmentLine;JJ)Landroidx/compose/ui/Modifier;", "paddingFromBaseline", "top", "bottom", "paddingFromBaseline-VpY3zN4", "(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;", "paddingFromBaseline-wCyjxdI", "(Landroidx/compose/ui/Modifier;JJ)Landroidx/compose/ui/Modifier;", "foundation-layout_release"}, m5176k = 2, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nAlignmentLine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlignmentLine.kt\nandroidx/compose/foundation/layout/AlignmentLineKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,325:1\n135#2:326\n135#2:327\n*S KotlinDebug\n*F\n+ 1 AlignmentLine.kt\nandroidx/compose/foundation/layout/AlignmentLineKt\n*L\n75#1:326\n121#1:327\n*E\n"})
/* loaded from: classes.dex */
public final class AlignmentLineKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: alignmentLineOffsetMeasure-tjqqzMA, reason: not valid java name */
    public static final MeasureResult m7240alignmentLineOffsetMeasuretjqqzMA(MeasureScope measureScope, final AlignmentLine alignmentLine, final float f4, float f5, Measurable measurable, long j4) {
        final Placeable placeableMo10585measureBRTryo0 = measurable.mo10585measureBRTryo0(getHorizontal(alignmentLine) ? Constraints.m11484copyZbe2FdA$default(j4, 0, 0, 0, 0, 11, null) : Constraints.m11484copyZbe2FdA$default(j4, 0, 0, 0, 0, 14, null));
        int i4 = placeableMo10585measureBRTryo0.get(alignmentLine);
        if (i4 == Integer.MIN_VALUE) {
            i4 = 0;
        }
        int height = getHorizontal(alignmentLine) ? placeableMo10585measureBRTryo0.getHeight() : placeableMo10585measureBRTryo0.getWidth();
        int iM11492getMaxHeightimpl = getHorizontal(alignmentLine) ? Constraints.m11492getMaxHeightimpl(j4) : Constraints.m11493getMaxWidthimpl(j4);
        C1700Dp.Companion companion = C1700Dp.INSTANCE;
        int i5 = iM11492getMaxHeightimpl - height;
        final int iCoerceIn = RangesKt___RangesKt.coerceIn((!C1700Dp.m11530equalsimpl0(f4, companion.m11545getUnspecifiedD9Ej5fM()) ? measureScope.mo7200roundToPx0680j_4(f4) : 0) - i4, 0, i5);
        final int iCoerceIn2 = RangesKt___RangesKt.coerceIn(((!C1700Dp.m11530equalsimpl0(f5, companion.m11545getUnspecifiedD9Ej5fM()) ? measureScope.mo7200roundToPx0680j_4(f5) : 0) - height) + i4, 0, i5 - iCoerceIn);
        final int width = getHorizontal(alignmentLine) ? placeableMo10585measureBRTryo0.getWidth() : Math.max(placeableMo10585measureBRTryo0.getWidth() + iCoerceIn + iCoerceIn2, Constraints.m11495getMinWidthimpl(j4));
        final int iMax = getHorizontal(alignmentLine) ? Math.max(placeableMo10585measureBRTryo0.getHeight() + iCoerceIn + iCoerceIn2, Constraints.m11494getMinHeightimpl(j4)) : placeableMo10585measureBRTryo0.getHeight();
        return MeasureScope.CC.m634p(measureScope, width, iMax, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.layout.AlignmentLineKt$alignmentLineOffsetMeasure$1
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
            public final void invoke2(Placeable.PlacementScope layout) {
                int width2;
                Intrinsics.checkNotNullParameter(layout, "$this$layout");
                if (AlignmentLineKt.getHorizontal(alignmentLine)) {
                    width2 = 0;
                } else {
                    width2 = !C1700Dp.m11530equalsimpl0(f4, C1700Dp.INSTANCE.m11545getUnspecifiedD9Ej5fM()) ? iCoerceIn : (width - iCoerceIn2) - placeableMo10585measureBRTryo0.getWidth();
                }
                Placeable.PlacementScope.placeRelative$default(layout, placeableMo10585measureBRTryo0, width2, AlignmentLineKt.getHorizontal(alignmentLine) ? !C1700Dp.m11530equalsimpl0(f4, C1700Dp.INSTANCE.m11545getUnspecifiedD9Ej5fM()) ? iCoerceIn : (iMax - iCoerceIn2) - placeableMo10585measureBRTryo0.getHeight() : 0, 0.0f, 4, null);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getHorizontal(AlignmentLine alignmentLine) {
        return alignmentLine instanceof HorizontalAlignmentLine;
    }

    @Stable
    /* renamed from: paddingFrom-4j6BHR0, reason: not valid java name */
    public static final Modifier m7241paddingFrom4j6BHR0(Modifier paddingFrom, final AlignmentLine alignmentLine, final float f4, final float f5) {
        Intrinsics.checkNotNullParameter(paddingFrom, "$this$paddingFrom");
        Intrinsics.checkNotNullParameter(alignmentLine, "alignmentLine");
        return paddingFrom.then(new AlignmentLineOffset(alignmentLine, f4, f5, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.AlignmentLineKt$paddingFrom-4j6BHR0$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
                inspectorInfo.setName("paddingFrom");
                inspectorInfo.getProperties().set("alignmentLine", alignmentLine);
                inspectorInfo.getProperties().set("before", C1700Dp.m11523boximpl(f4));
                inspectorInfo.getProperties().set("after", C1700Dp.m11523boximpl(f5));
            }
        } : InspectableValueKt.getNoInspectorInfo(), null));
    }

    /* renamed from: paddingFrom-4j6BHR0$default, reason: not valid java name */
    public static /* synthetic */ Modifier m7242paddingFrom4j6BHR0$default(Modifier modifier, AlignmentLine alignmentLine, float f4, float f5, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            f4 = C1700Dp.INSTANCE.m11545getUnspecifiedD9Ej5fM();
        }
        if ((i4 & 4) != 0) {
            f5 = C1700Dp.INSTANCE.m11545getUnspecifiedD9Ej5fM();
        }
        return m7241paddingFrom4j6BHR0(modifier, alignmentLine, f4, f5);
    }

    @Stable
    /* renamed from: paddingFrom-Y_r0B1c, reason: not valid java name */
    public static final Modifier m7243paddingFromY_r0B1c(Modifier paddingFrom, final AlignmentLine alignmentLine, final long j4, final long j5) {
        Intrinsics.checkNotNullParameter(paddingFrom, "$this$paddingFrom");
        Intrinsics.checkNotNullParameter(alignmentLine, "alignmentLine");
        return paddingFrom.then(new AlignmentLineOffset(alignmentLine, j4, j5, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.AlignmentLineKt$paddingFrom-Y_r0B1c$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
                inspectorInfo.setName("paddingFrom");
                inspectorInfo.getProperties().set("alignmentLine", alignmentLine);
                inspectorInfo.getProperties().set("before", TextUnit.m11696boximpl(j4));
                inspectorInfo.getProperties().set("after", TextUnit.m11696boximpl(j5));
            }
        } : InspectableValueKt.getNoInspectorInfo(), null));
    }

    /* renamed from: paddingFrom-Y_r0B1c$default, reason: not valid java name */
    public static /* synthetic */ Modifier m7244paddingFromY_r0B1c$default(Modifier modifier, AlignmentLine alignmentLine, long j4, long j5, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            j4 = TextUnit.INSTANCE.m11717getUnspecifiedXSAIIZE();
        }
        long j6 = j4;
        if ((i4 & 4) != 0) {
            j5 = TextUnit.INSTANCE.m11717getUnspecifiedXSAIIZE();
        }
        return m7243paddingFromY_r0B1c(modifier, alignmentLine, j6, j5);
    }

    @Stable
    /* renamed from: paddingFromBaseline-VpY3zN4, reason: not valid java name */
    public static final Modifier m7245paddingFromBaselineVpY3zN4(Modifier paddingFromBaseline, float f4, float f5) {
        Intrinsics.checkNotNullParameter(paddingFromBaseline, "$this$paddingFromBaseline");
        C1700Dp.Companion companion = C1700Dp.INSTANCE;
        return paddingFromBaseline.then(!C1700Dp.m11530equalsimpl0(f4, companion.m11545getUnspecifiedD9Ej5fM()) ? m7242paddingFrom4j6BHR0$default(Modifier.INSTANCE, androidx.compose.p006ui.layout.AlignmentLineKt.getFirstBaseline(), f4, 0.0f, 4, null) : Modifier.INSTANCE).then(!C1700Dp.m11530equalsimpl0(f5, companion.m11545getUnspecifiedD9Ej5fM()) ? m7242paddingFrom4j6BHR0$default(Modifier.INSTANCE, androidx.compose.p006ui.layout.AlignmentLineKt.getLastBaseline(), 0.0f, f5, 2, null) : Modifier.INSTANCE);
    }

    /* renamed from: paddingFromBaseline-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ Modifier m7246paddingFromBaselineVpY3zN4$default(Modifier modifier, float f4, float f5, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            f4 = C1700Dp.INSTANCE.m11545getUnspecifiedD9Ej5fM();
        }
        if ((i4 & 2) != 0) {
            f5 = C1700Dp.INSTANCE.m11545getUnspecifiedD9Ej5fM();
        }
        return m7245paddingFromBaselineVpY3zN4(modifier, f4, f5);
    }

    @Stable
    /* renamed from: paddingFromBaseline-wCyjxdI, reason: not valid java name */
    public static final Modifier m7247paddingFromBaselinewCyjxdI(Modifier paddingFromBaseline, long j4, long j5) {
        Intrinsics.checkNotNullParameter(paddingFromBaseline, "$this$paddingFromBaseline");
        return paddingFromBaseline.then(!TextUnitKt.m11724isUnspecifiedR2X_6o(j4) ? m7244paddingFromY_r0B1c$default(Modifier.INSTANCE, androidx.compose.p006ui.layout.AlignmentLineKt.getFirstBaseline(), j4, 0L, 4, null) : Modifier.INSTANCE).then(!TextUnitKt.m11724isUnspecifiedR2X_6o(j5) ? m7244paddingFromY_r0B1c$default(Modifier.INSTANCE, androidx.compose.p006ui.layout.AlignmentLineKt.getLastBaseline(), 0L, j5, 2, null) : Modifier.INSTANCE);
    }

    /* renamed from: paddingFromBaseline-wCyjxdI$default, reason: not valid java name */
    public static /* synthetic */ Modifier m7248paddingFromBaselinewCyjxdI$default(Modifier modifier, long j4, long j5, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            j4 = TextUnit.INSTANCE.m11717getUnspecifiedXSAIIZE();
        }
        if ((i4 & 2) != 0) {
            j5 = TextUnit.INSTANCE.m11717getUnspecifiedXSAIIZE();
        }
        return m7247paddingFromBaselinewCyjxdI(modifier, j4, j5);
    }
}
