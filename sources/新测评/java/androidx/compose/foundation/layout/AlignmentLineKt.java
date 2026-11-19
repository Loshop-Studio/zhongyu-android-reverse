package androidx.compose.foundation.layout;

import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.layout.AlignmentLine;
import androidx.compose.p013ui.layout.HorizontalAlignmentLine;
import androidx.compose.p013ui.layout.Measurable;
import androidx.compose.p013ui.layout.MeasureResult;
import androidx.compose.p013ui.layout.MeasureScope;
import androidx.compose.p013ui.layout.Placeable;
import androidx.compose.p013ui.platform.InspectableValueKt;
import androidx.compose.p013ui.platform.InspectorInfo;
import androidx.compose.p013ui.unit.C3127Dp;
import androidx.compose.p013ui.unit.Constraints;
import androidx.compose.p013ui.unit.TextUnit;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

@Metadata(m13557d1 = {"\u0000@\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u001a>\u0010\u0005\u001a\u00020\u0006*\u00020\u00072\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a2\u0010\u0012\u001a\u00020\u0013*\u00020\u00132\u0006\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a2\u0010\u0012\u001a\u00020\u0013*\u00020\u00132\u0006\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00162\b\b\u0002\u0010\u000b\u001a\u00020\u0016H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a*\u0010\u0019\u001a\u00020\u0013*\u00020\u00132\b\b\u0002\u0010\u001a\u001a\u00020\n2\b\b\u0002\u0010\u001b\u001a\u00020\nH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a*\u0010\u0019\u001a\u00020\u0013*\u00020\u00132\b\b\u0002\u0010\u001a\u001a\u00020\u00162\b\b\u0002\u0010\u001b\u001a\u00020\u0016H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001f\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006 "}, m13558d2 = {"horizontal", "", "Landroidx/compose/ui/layout/AlignmentLine;", "getHorizontal", "(Landroidx/compose/ui/layout/AlignmentLine;)Z", "alignmentLineOffsetMeasure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "alignmentLine", "before", "Landroidx/compose/ui/unit/Dp;", "after", "measurable", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "alignmentLineOffsetMeasure-tjqqzMA", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/AlignmentLine;FFLandroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "paddingFrom", "Landroidx/compose/ui/Modifier;", "paddingFrom-4j6BHR0", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/layout/AlignmentLine;FF)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/unit/TextUnit;", "paddingFrom-Y_r0B1c", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/layout/AlignmentLine;JJ)Landroidx/compose/ui/Modifier;", "paddingFromBaseline", "top", "bottom", "paddingFromBaseline-VpY3zN4", "(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;", "paddingFromBaseline-wCyjxdI", "(Landroidx/compose/ui/Modifier;JJ)Landroidx/compose/ui/Modifier;", "foundation-layout_release"}, m13559k = 2, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nAlignmentLine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlignmentLine.kt\nandroidx/compose/foundation/layout/AlignmentLineKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 TextUnit.kt\nandroidx/compose/ui/unit/TextUnitKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,364:1\n110#2:365\n110#2:366\n97#3:367\n97#3:368\n97#3:372\n97#3:373\n247#4:369\n247#4:370\n1#5:371\n*S KotlinDebug\n*F\n+ 1 AlignmentLine.kt\nandroidx/compose/foundation/layout/AlignmentLineKt\n*L\n75#1:365\n119#1:366\n146#1:367\n153#1:368\n323#1:372\n328#1:373\n181#1:369\n184#1:370\n*E\n"})
/* loaded from: classes.dex */
public final class AlignmentLineKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: alignmentLineOffsetMeasure-tjqqzMA, reason: not valid java name */
    public static final MeasureResult m17531alignmentLineOffsetMeasuretjqqzMA(MeasureScope measureScope, final AlignmentLine alignmentLine, final float f10, float f11, Measurable measurable, long j10) {
        final Placeable placeableMo22324measureBRTryo0 = measurable.mo22324measureBRTryo0(getHorizontal(alignmentLine) ? Constraints.m23504copyZbe2FdA$default(j10, 0, 0, 0, 0, 11, null) : Constraints.m23504copyZbe2FdA$default(j10, 0, 0, 0, 0, 14, null));
        int i10 = placeableMo22324measureBRTryo0.get(alignmentLine);
        if (i10 == Integer.MIN_VALUE) {
            i10 = 0;
        }
        int height = getHorizontal(alignmentLine) ? placeableMo22324measureBRTryo0.getHeight() : placeableMo22324measureBRTryo0.getWidth();
        int iM23513getMaxHeightimpl = (getHorizontal(alignmentLine) ? Constraints.m23513getMaxHeightimpl(j10) : Constraints.m23514getMaxWidthimpl(j10)) - height;
        final int iCoerceIn = RangesKt.coerceIn((!Float.isNaN(f10) ? measureScope.mo17326roundToPx0680j_4(f10) : 0) - i10, 0, iM23513getMaxHeightimpl);
        final int iCoerceIn2 = RangesKt.coerceIn(((!Float.isNaN(f11) ? measureScope.mo17326roundToPx0680j_4(f11) : 0) - height) + i10, 0, iM23513getMaxHeightimpl - iCoerceIn);
        final int width = getHorizontal(alignmentLine) ? placeableMo22324measureBRTryo0.getWidth() : Math.max(placeableMo22324measureBRTryo0.getWidth() + iCoerceIn + iCoerceIn2, Constraints.m23516getMinWidthimpl(j10));
        final int iMax = getHorizontal(alignmentLine) ? Math.max(placeableMo22324measureBRTryo0.getHeight() + iCoerceIn + iCoerceIn2, Constraints.m23515getMinHeightimpl(j10)) : placeableMo22324measureBRTryo0.getHeight();
        return MeasureScope.layout$default(measureScope, width, iMax, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.layout.AlignmentLineKt$alignmentLineOffsetMeasure$1
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
                int width2;
                if (AlignmentLineKt.getHorizontal(alignmentLine)) {
                    width2 = 0;
                } else {
                    width2 = !C3127Dp.m23566equalsimpl0(f10, C3127Dp.INSTANCE.m23581getUnspecifiedD9Ej5fM()) ? iCoerceIn : (width - iCoerceIn2) - placeableMo22324measureBRTryo0.getWidth();
                }
                Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo22324measureBRTryo0, width2, AlignmentLineKt.getHorizontal(alignmentLine) ? !C3127Dp.m23566equalsimpl0(f10, C3127Dp.INSTANCE.m23581getUnspecifiedD9Ej5fM()) ? iCoerceIn : (iMax - iCoerceIn2) - placeableMo22324measureBRTryo0.getHeight() : 0, 0.0f, 4, null);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getHorizontal(AlignmentLine alignmentLine) {
        return alignmentLine instanceof HorizontalAlignmentLine;
    }

    @Stable
    /* renamed from: paddingFrom-4j6BHR0, reason: not valid java name */
    public static final Modifier m17532paddingFrom4j6BHR0(Modifier modifier, final AlignmentLine alignmentLine, final float f10, final float f11) {
        return modifier.then(new AlignmentLineOffsetDpElement(alignmentLine, f10, f11, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.AlignmentLineKt$paddingFrom-4j6BHR0$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("paddingFrom");
                inspectorInfo.getProperties().set("alignmentLine", alignmentLine);
                inspectorInfo.getProperties().set("before", C3127Dp.m23559boximpl(f10));
                inspectorInfo.getProperties().set("after", C3127Dp.m23559boximpl(f11));
            }
        } : InspectableValueKt.getNoInspectorInfo(), null));
    }

    /* renamed from: paddingFrom-4j6BHR0$default, reason: not valid java name */
    public static /* synthetic */ Modifier m17533paddingFrom4j6BHR0$default(Modifier modifier, AlignmentLine alignmentLine, float f10, float f11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f10 = C3127Dp.INSTANCE.m23581getUnspecifiedD9Ej5fM();
        }
        if ((i10 & 4) != 0) {
            f11 = C3127Dp.INSTANCE.m23581getUnspecifiedD9Ej5fM();
        }
        return m17532paddingFrom4j6BHR0(modifier, alignmentLine, f10, f11);
    }

    @Stable
    /* renamed from: paddingFrom-Y_r0B1c, reason: not valid java name */
    public static final Modifier m17534paddingFromY_r0B1c(Modifier modifier, final AlignmentLine alignmentLine, long j10, long j11) {
        AlignmentLine alignmentLine2;
        final long j12;
        final long j13;
        Function1<InspectorInfo, Unit> noInspectorInfo;
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            j12 = j10;
            j13 = j11;
            noInspectorInfo = new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.AlignmentLineKt$paddingFrom-Y_r0B1c$$inlined$debugInspectorInfo$1
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
                    inspectorInfo.setName("paddingFrom");
                    inspectorInfo.getProperties().set("alignmentLine", alignmentLine);
                    inspectorInfo.getProperties().set("before", TextUnit.m23745boximpl(j12));
                    inspectorInfo.getProperties().set("after", TextUnit.m23745boximpl(j13));
                }
            };
            alignmentLine2 = alignmentLine;
        } else {
            alignmentLine2 = alignmentLine;
            j12 = j10;
            j13 = j11;
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return modifier.then(new AlignmentLineOffsetTextUnitElement(alignmentLine2, j12, j13, noInspectorInfo, null));
    }

    /* renamed from: paddingFrom-Y_r0B1c$default, reason: not valid java name */
    public static /* synthetic */ Modifier m17535paddingFromY_r0B1c$default(Modifier modifier, AlignmentLine alignmentLine, long j10, long j11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = TextUnit.INSTANCE.m23766getUnspecifiedXSAIIZE();
        }
        long j12 = j10;
        if ((i10 & 4) != 0) {
            j11 = TextUnit.INSTANCE.m23766getUnspecifiedXSAIIZE();
        }
        return m17534paddingFromY_r0B1c(modifier, alignmentLine, j12, j11);
    }

    @Stable
    /* renamed from: paddingFromBaseline-VpY3zN4, reason: not valid java name */
    public static final Modifier m17536paddingFromBaselineVpY3zN4(Modifier modifier, float f10, float f11) {
        return modifier.then(!Float.isNaN(f10) ? m17533paddingFrom4j6BHR0$default(Modifier.INSTANCE, androidx.compose.p013ui.layout.AlignmentLineKt.getFirstBaseline(), f10, 0.0f, 4, null) : Modifier.INSTANCE).then(!Float.isNaN(f11) ? m17533paddingFrom4j6BHR0$default(Modifier.INSTANCE, androidx.compose.p013ui.layout.AlignmentLineKt.getLastBaseline(), 0.0f, f11, 2, null) : Modifier.INSTANCE);
    }

    /* renamed from: paddingFromBaseline-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ Modifier m17537paddingFromBaselineVpY3zN4$default(Modifier modifier, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = C3127Dp.INSTANCE.m23581getUnspecifiedD9Ej5fM();
        }
        if ((i10 & 2) != 0) {
            f11 = C3127Dp.INSTANCE.m23581getUnspecifiedD9Ej5fM();
        }
        return m17536paddingFromBaselineVpY3zN4(modifier, f10, f11);
    }

    @Stable
    /* renamed from: paddingFromBaseline-wCyjxdI, reason: not valid java name */
    public static final Modifier m17538paddingFromBaselinewCyjxdI(Modifier modifier, long j10, long j11) {
        return modifier.then(TextUnit.m23753getRawTypeimpl(j10) == 0 ? Modifier.INSTANCE : m17535paddingFromY_r0B1c$default(Modifier.INSTANCE, androidx.compose.p013ui.layout.AlignmentLineKt.getFirstBaseline(), j10, 0L, 4, null)).then(TextUnit.m23753getRawTypeimpl(j11) == 0 ? Modifier.INSTANCE : m17535paddingFromY_r0B1c$default(Modifier.INSTANCE, androidx.compose.p013ui.layout.AlignmentLineKt.getLastBaseline(), 0L, j11, 2, null));
    }

    /* renamed from: paddingFromBaseline-wCyjxdI$default, reason: not valid java name */
    public static /* synthetic */ Modifier m17539paddingFromBaselinewCyjxdI$default(Modifier modifier, long j10, long j11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = TextUnit.INSTANCE.m23766getUnspecifiedXSAIIZE();
        }
        if ((i10 & 2) != 0) {
            j11 = TextUnit.INSTANCE.m23766getUnspecifiedXSAIIZE();
        }
        return m17538paddingFromBaselinewCyjxdI(modifier, j10, j11);
    }
}
