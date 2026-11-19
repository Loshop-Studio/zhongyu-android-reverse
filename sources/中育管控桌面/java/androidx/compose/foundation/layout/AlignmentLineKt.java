package androidx.compose.foundation.layout;

import androidx.compose.p009ui.Modifier;
import androidx.compose.p009ui.layout.AlignmentLine;
import androidx.compose.p009ui.layout.HorizontalAlignmentLine;
import androidx.compose.p009ui.layout.Measurable;
import androidx.compose.p009ui.layout.MeasureResult;
import androidx.compose.p009ui.layout.MeasureScope;
import androidx.compose.p009ui.layout.Placeable;
import androidx.compose.p009ui.platform.InspectableValueKt;
import androidx.compose.p009ui.platform.InspectorInfo;
import androidx.compose.p009ui.unit.C2452Dp;
import androidx.compose.p009ui.unit.Constraints;
import androidx.compose.p009ui.unit.TextUnit;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

@Metadata(m7879d1 = {"\u0000@\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u001a>\u0010\u0005\u001a\u00020\u0006*\u00020\u00072\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a2\u0010\u0012\u001a\u00020\u0013*\u00020\u00132\u0006\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a2\u0010\u0012\u001a\u00020\u0013*\u00020\u00132\u0006\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00162\b\b\u0002\u0010\u000b\u001a\u00020\u0016H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a*\u0010\u0019\u001a\u00020\u0013*\u00020\u00132\b\b\u0002\u0010\u001a\u001a\u00020\n2\b\b\u0002\u0010\u001b\u001a\u00020\nH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a*\u0010\u0019\u001a\u00020\u0013*\u00020\u00132\b\b\u0002\u0010\u001a\u001a\u00020\u00162\b\b\u0002\u0010\u001b\u001a\u00020\u0016H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001f\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006 "}, m7880d2 = {"horizontal", "", "Landroidx/compose/ui/layout/AlignmentLine;", "getHorizontal", "(Landroidx/compose/ui/layout/AlignmentLine;)Z", "alignmentLineOffsetMeasure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "alignmentLine", "before", "Landroidx/compose/ui/unit/Dp;", "after", "measurable", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "alignmentLineOffsetMeasure-tjqqzMA", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/AlignmentLine;FFLandroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "paddingFrom", "Landroidx/compose/ui/Modifier;", "paddingFrom-4j6BHR0", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/layout/AlignmentLine;FF)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/unit/TextUnit;", "paddingFrom-Y_r0B1c", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/layout/AlignmentLine;JJ)Landroidx/compose/ui/Modifier;", "paddingFromBaseline", "top", "bottom", "paddingFromBaseline-VpY3zN4", "(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;", "paddingFromBaseline-wCyjxdI", "(Landroidx/compose/ui/Modifier;JJ)Landroidx/compose/ui/Modifier;", "foundation-layout_release"}, m7881k = 2, m7882mv = {1, 9, 0}, m7884xi = 48)
@SourceDebugExtension({"SMAP\nAlignmentLine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlignmentLine.kt\nandroidx/compose/foundation/layout/AlignmentLineKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 TextUnit.kt\nandroidx/compose/ui/unit/TextUnitKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,364:1\n110#2:365\n110#2:366\n97#3:367\n97#3:368\n97#3:372\n97#3:373\n247#4:369\n247#4:370\n1#5:371\n*S KotlinDebug\n*F\n+ 1 AlignmentLine.kt\nandroidx/compose/foundation/layout/AlignmentLineKt\n*L\n75#1:365\n119#1:366\n146#1:367\n153#1:368\n323#1:372\n328#1:373\n181#1:369\n184#1:370\n*E\n"})
/* loaded from: classes.dex */
public final class AlignmentLineKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: alignmentLineOffsetMeasure-tjqqzMA, reason: not valid java name */
    public static final MeasureResult m10454alignmentLineOffsetMeasuretjqqzMA(MeasureScope measureScope, final AlignmentLine alignmentLine, final float f6, float f7, Measurable measurable, long j6) {
        final Placeable placeableMo15247measureBRTryo0 = measurable.mo15247measureBRTryo0(getHorizontal(alignmentLine) ? Constraints.m16427copyZbe2FdA$default(j6, 0, 0, 0, 0, 11, null) : Constraints.m16427copyZbe2FdA$default(j6, 0, 0, 0, 0, 14, null));
        int i6 = placeableMo15247measureBRTryo0.get(alignmentLine);
        if (i6 == Integer.MIN_VALUE) {
            i6 = 0;
        }
        int height = getHorizontal(alignmentLine) ? placeableMo15247measureBRTryo0.getHeight() : placeableMo15247measureBRTryo0.getWidth();
        int iM16436getMaxHeightimpl = (getHorizontal(alignmentLine) ? Constraints.m16436getMaxHeightimpl(j6) : Constraints.m16437getMaxWidthimpl(j6)) - height;
        final int iCoerceIn = RangesKt.coerceIn((!Float.isNaN(f6) ? measureScope.mo10249roundToPx0680j_4(f6) : 0) - i6, 0, iM16436getMaxHeightimpl);
        final int iCoerceIn2 = RangesKt.coerceIn(((!Float.isNaN(f7) ? measureScope.mo10249roundToPx0680j_4(f7) : 0) - height) + i6, 0, iM16436getMaxHeightimpl - iCoerceIn);
        final int width = getHorizontal(alignmentLine) ? placeableMo15247measureBRTryo0.getWidth() : Math.max(placeableMo15247measureBRTryo0.getWidth() + iCoerceIn + iCoerceIn2, Constraints.m16439getMinWidthimpl(j6));
        final int iMax = getHorizontal(alignmentLine) ? Math.max(placeableMo15247measureBRTryo0.getHeight() + iCoerceIn + iCoerceIn2, Constraints.m16438getMinHeightimpl(j6)) : placeableMo15247measureBRTryo0.getHeight();
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
                    width2 = !C2452Dp.m16489equalsimpl0(f6, C2452Dp.INSTANCE.m16504getUnspecifiedD9Ej5fM()) ? iCoerceIn : (width - iCoerceIn2) - placeableMo15247measureBRTryo0.getWidth();
                }
                Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo15247measureBRTryo0, width2, AlignmentLineKt.getHorizontal(alignmentLine) ? !C2452Dp.m16489equalsimpl0(f6, C2452Dp.INSTANCE.m16504getUnspecifiedD9Ej5fM()) ? iCoerceIn : (iMax - iCoerceIn2) - placeableMo15247measureBRTryo0.getHeight() : 0, 0.0f, 4, null);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getHorizontal(AlignmentLine alignmentLine) {
        return alignmentLine instanceof HorizontalAlignmentLine;
    }

    @Stable
    /* renamed from: paddingFrom-4j6BHR0, reason: not valid java name */
    public static final Modifier m10455paddingFrom4j6BHR0(Modifier modifier, final AlignmentLine alignmentLine, final float f6, final float f7) {
        return modifier.then(new AlignmentLineOffsetDpElement(alignmentLine, f6, f7, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.AlignmentLineKt$paddingFrom-4j6BHR0$$inlined$debugInspectorInfo$1
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
                inspectorInfo.getProperties().set("before", C2452Dp.m16482boximpl(f6));
                inspectorInfo.getProperties().set("after", C2452Dp.m16482boximpl(f7));
            }
        } : InspectableValueKt.getNoInspectorInfo(), null));
    }

    /* renamed from: paddingFrom-4j6BHR0$default, reason: not valid java name */
    public static /* synthetic */ Modifier m10456paddingFrom4j6BHR0$default(Modifier modifier, AlignmentLine alignmentLine, float f6, float f7, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            f6 = C2452Dp.INSTANCE.m16504getUnspecifiedD9Ej5fM();
        }
        if ((i6 & 4) != 0) {
            f7 = C2452Dp.INSTANCE.m16504getUnspecifiedD9Ej5fM();
        }
        return m10455paddingFrom4j6BHR0(modifier, alignmentLine, f6, f7);
    }

    @Stable
    /* renamed from: paddingFrom-Y_r0B1c, reason: not valid java name */
    public static final Modifier m10457paddingFromY_r0B1c(Modifier modifier, final AlignmentLine alignmentLine, long j6, long j7) {
        AlignmentLine alignmentLine2;
        final long j8;
        final long j9;
        Function1<InspectorInfo, Unit> noInspectorInfo;
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            j8 = j6;
            j9 = j7;
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
                    inspectorInfo.getProperties().set("before", TextUnit.m16668boximpl(j8));
                    inspectorInfo.getProperties().set("after", TextUnit.m16668boximpl(j9));
                }
            };
            alignmentLine2 = alignmentLine;
        } else {
            alignmentLine2 = alignmentLine;
            j8 = j6;
            j9 = j7;
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return modifier.then(new AlignmentLineOffsetTextUnitElement(alignmentLine2, j8, j9, noInspectorInfo, null));
    }

    /* renamed from: paddingFrom-Y_r0B1c$default, reason: not valid java name */
    public static /* synthetic */ Modifier m10458paddingFromY_r0B1c$default(Modifier modifier, AlignmentLine alignmentLine, long j6, long j7, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            j6 = TextUnit.INSTANCE.m16689getUnspecifiedXSAIIZE();
        }
        long j8 = j6;
        if ((i6 & 4) != 0) {
            j7 = TextUnit.INSTANCE.m16689getUnspecifiedXSAIIZE();
        }
        return m10457paddingFromY_r0B1c(modifier, alignmentLine, j8, j7);
    }

    @Stable
    /* renamed from: paddingFromBaseline-VpY3zN4, reason: not valid java name */
    public static final Modifier m10459paddingFromBaselineVpY3zN4(Modifier modifier, float f6, float f7) {
        return modifier.then(!Float.isNaN(f6) ? m10456paddingFrom4j6BHR0$default(Modifier.INSTANCE, androidx.compose.p009ui.layout.AlignmentLineKt.getFirstBaseline(), f6, 0.0f, 4, null) : Modifier.INSTANCE).then(!Float.isNaN(f7) ? m10456paddingFrom4j6BHR0$default(Modifier.INSTANCE, androidx.compose.p009ui.layout.AlignmentLineKt.getLastBaseline(), 0.0f, f7, 2, null) : Modifier.INSTANCE);
    }

    /* renamed from: paddingFromBaseline-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ Modifier m10460paddingFromBaselineVpY3zN4$default(Modifier modifier, float f6, float f7, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            f6 = C2452Dp.INSTANCE.m16504getUnspecifiedD9Ej5fM();
        }
        if ((i6 & 2) != 0) {
            f7 = C2452Dp.INSTANCE.m16504getUnspecifiedD9Ej5fM();
        }
        return m10459paddingFromBaselineVpY3zN4(modifier, f6, f7);
    }

    @Stable
    /* renamed from: paddingFromBaseline-wCyjxdI, reason: not valid java name */
    public static final Modifier m10461paddingFromBaselinewCyjxdI(Modifier modifier, long j6, long j7) {
        return modifier.then(TextUnit.m16676getRawTypeimpl(j6) == 0 ? Modifier.INSTANCE : m10458paddingFromY_r0B1c$default(Modifier.INSTANCE, androidx.compose.p009ui.layout.AlignmentLineKt.getFirstBaseline(), j6, 0L, 4, null)).then(TextUnit.m16676getRawTypeimpl(j7) == 0 ? Modifier.INSTANCE : m10458paddingFromY_r0B1c$default(Modifier.INSTANCE, androidx.compose.p009ui.layout.AlignmentLineKt.getLastBaseline(), 0L, j7, 2, null));
    }

    /* renamed from: paddingFromBaseline-wCyjxdI$default, reason: not valid java name */
    public static /* synthetic */ Modifier m10462paddingFromBaselinewCyjxdI$default(Modifier modifier, long j6, long j7, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            j6 = TextUnit.INSTANCE.m16689getUnspecifiedXSAIIZE();
        }
        if ((i6 & 2) != 0) {
            j7 = TextUnit.INSTANCE.m16689getUnspecifiedXSAIIZE();
        }
        return m10461paddingFromBaselinewCyjxdI(modifier, j6, j7);
    }
}
