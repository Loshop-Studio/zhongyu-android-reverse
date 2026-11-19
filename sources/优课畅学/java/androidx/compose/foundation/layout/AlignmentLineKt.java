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
import androidx.compose.p013ui.unit.C3156Dp;
import androidx.compose.p013ui.unit.Constraints;
import androidx.compose.p013ui.unit.TextUnit;
import androidx.compose.runtime.Stable;
import p077d8.AbstractC8323h;
import p123h7.C8736p;
import p300x7.InterfaceC10570l;

/* loaded from: classes.dex */
public final class AlignmentLineKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: alignmentLineOffsetMeasure-tjqqzMA, reason: not valid java name */
    public static final MeasureResult m20706alignmentLineOffsetMeasuretjqqzMA(MeasureScope measureScope, final AlignmentLine alignmentLine, final float f10, float f11, Measurable measurable, long j10) {
        final Placeable placeableMo25627measureBRTryo0 = measurable.mo25627measureBRTryo0(getHorizontal(alignmentLine) ? Constraints.m26842copyZbe2FdA$default(j10, 0, 0, 0, 0, 11, null) : Constraints.m26842copyZbe2FdA$default(j10, 0, 0, 0, 0, 14, null));
        int i10 = placeableMo25627measureBRTryo0.get(alignmentLine);
        if (i10 == Integer.MIN_VALUE) {
            i10 = 0;
        }
        int height = getHorizontal(alignmentLine) ? placeableMo25627measureBRTryo0.getHeight() : placeableMo25627measureBRTryo0.getWidth();
        int iM26851getMaxHeightimpl = (getHorizontal(alignmentLine) ? Constraints.m26851getMaxHeightimpl(j10) : Constraints.m26852getMaxWidthimpl(j10)) - height;
        final int iM13518m = AbstractC8323h.m13518m((!Float.isNaN(f10) ? measureScope.mo20491roundToPx0680j_4(f10) : 0) - i10, 0, iM26851getMaxHeightimpl);
        final int iM13518m2 = AbstractC8323h.m13518m(((!Float.isNaN(f11) ? measureScope.mo20491roundToPx0680j_4(f11) : 0) - height) + i10, 0, iM26851getMaxHeightimpl - iM13518m);
        final int width = getHorizontal(alignmentLine) ? placeableMo25627measureBRTryo0.getWidth() : Math.max(placeableMo25627measureBRTryo0.getWidth() + iM13518m + iM13518m2, Constraints.m26854getMinWidthimpl(j10));
        final int iMax = getHorizontal(alignmentLine) ? Math.max(placeableMo25627measureBRTryo0.getHeight() + iM13518m + iM13518m2, Constraints.m26853getMinHeightimpl(j10)) : placeableMo25627measureBRTryo0.getHeight();
        return MeasureScope.layout$default(measureScope, width, iMax, null, new InterfaceC10570l() { // from class: androidx.compose.foundation.layout.AlignmentLineKt$alignmentLineOffsetMeasure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Placeable.PlacementScope) obj);
                return C8736p.f16368a;
            }

            public final void invoke(Placeable.PlacementScope placementScope) {
                int width2;
                if (AlignmentLineKt.getHorizontal(alignmentLine)) {
                    width2 = 0;
                } else {
                    width2 = !C3156Dp.m26904equalsimpl0(f10, C3156Dp.Companion.m26919getUnspecifiedD9Ej5fM()) ? iM13518m : (width - iM13518m2) - placeableMo25627measureBRTryo0.getWidth();
                }
                Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo25627measureBRTryo0, width2, AlignmentLineKt.getHorizontal(alignmentLine) ? !C3156Dp.m26904equalsimpl0(f10, C3156Dp.Companion.m26919getUnspecifiedD9Ej5fM()) ? iM13518m : (iMax - iM13518m2) - placeableMo25627measureBRTryo0.getHeight() : 0, 0.0f, 4, null);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getHorizontal(AlignmentLine alignmentLine) {
        return alignmentLine instanceof HorizontalAlignmentLine;
    }

    @Stable
    /* renamed from: paddingFrom-4j6BHR0, reason: not valid java name */
    public static final Modifier m20707paddingFrom4j6BHR0(Modifier modifier, final AlignmentLine alignmentLine, final float f10, final float f11) {
        return modifier.then(new AlignmentLineOffsetDpElement(alignmentLine, f10, f11, InspectableValueKt.isDebugInspectorInfoEnabled() ? new InterfaceC10570l() { // from class: androidx.compose.foundation.layout.AlignmentLineKt$paddingFrom-4j6BHR0$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return C8736p.f16368a;
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("paddingFrom");
                inspectorInfo.getProperties().set("alignmentLine", alignmentLine);
                inspectorInfo.getProperties().set("before", C3156Dp.m26897boximpl(f10));
                inspectorInfo.getProperties().set("after", C3156Dp.m26897boximpl(f11));
            }
        } : InspectableValueKt.getNoInspectorInfo(), null));
    }

    /* renamed from: paddingFrom-4j6BHR0$default, reason: not valid java name */
    public static /* synthetic */ Modifier m20708paddingFrom4j6BHR0$default(Modifier modifier, AlignmentLine alignmentLine, float f10, float f11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f10 = C3156Dp.Companion.m26919getUnspecifiedD9Ej5fM();
        }
        if ((i10 & 4) != 0) {
            f11 = C3156Dp.Companion.m26919getUnspecifiedD9Ej5fM();
        }
        return m20707paddingFrom4j6BHR0(modifier, alignmentLine, f10, f11);
    }

    @Stable
    /* renamed from: paddingFrom-Y_r0B1c, reason: not valid java name */
    public static final Modifier m20709paddingFromY_r0B1c(Modifier modifier, final AlignmentLine alignmentLine, long j10, long j11) {
        AlignmentLine alignmentLine2;
        final long j12;
        final long j13;
        InterfaceC10570l noInspectorInfo;
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            j12 = j10;
            j13 = j11;
            noInspectorInfo = new InterfaceC10570l() { // from class: androidx.compose.foundation.layout.AlignmentLineKt$paddingFrom-Y_r0B1c$$inlined$debugInspectorInfo$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p300x7.InterfaceC10570l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((InspectorInfo) obj);
                    return C8736p.f16368a;
                }

                public final void invoke(InspectorInfo inspectorInfo) {
                    inspectorInfo.setName("paddingFrom");
                    inspectorInfo.getProperties().set("alignmentLine", alignmentLine);
                    inspectorInfo.getProperties().set("before", TextUnit.m27083boximpl(j12));
                    inspectorInfo.getProperties().set("after", TextUnit.m27083boximpl(j13));
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
    public static /* synthetic */ Modifier m20710paddingFromY_r0B1c$default(Modifier modifier, AlignmentLine alignmentLine, long j10, long j11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = TextUnit.Companion.m27104getUnspecifiedXSAIIZE();
        }
        long j12 = j10;
        if ((i10 & 4) != 0) {
            j11 = TextUnit.Companion.m27104getUnspecifiedXSAIIZE();
        }
        return m20709paddingFromY_r0B1c(modifier, alignmentLine, j12, j11);
    }

    @Stable
    /* renamed from: paddingFromBaseline-VpY3zN4, reason: not valid java name */
    public static final Modifier m20711paddingFromBaselineVpY3zN4(Modifier modifier, float f10, float f11) {
        return modifier.then(!Float.isNaN(f10) ? m20708paddingFrom4j6BHR0$default(Modifier.Companion, androidx.compose.p013ui.layout.AlignmentLineKt.getFirstBaseline(), f10, 0.0f, 4, null) : Modifier.Companion).then(!Float.isNaN(f11) ? m20708paddingFrom4j6BHR0$default(Modifier.Companion, androidx.compose.p013ui.layout.AlignmentLineKt.getLastBaseline(), 0.0f, f11, 2, null) : Modifier.Companion);
    }

    /* renamed from: paddingFromBaseline-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ Modifier m20712paddingFromBaselineVpY3zN4$default(Modifier modifier, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = C3156Dp.Companion.m26919getUnspecifiedD9Ej5fM();
        }
        if ((i10 & 2) != 0) {
            f11 = C3156Dp.Companion.m26919getUnspecifiedD9Ej5fM();
        }
        return m20711paddingFromBaselineVpY3zN4(modifier, f10, f11);
    }

    @Stable
    /* renamed from: paddingFromBaseline-wCyjxdI, reason: not valid java name */
    public static final Modifier m20713paddingFromBaselinewCyjxdI(Modifier modifier, long j10, long j11) {
        return modifier.then(TextUnit.m27091getRawTypeimpl(j10) == 0 ? Modifier.Companion : m20710paddingFromY_r0B1c$default(Modifier.Companion, androidx.compose.p013ui.layout.AlignmentLineKt.getFirstBaseline(), j10, 0L, 4, null)).then(TextUnit.m27091getRawTypeimpl(j11) == 0 ? Modifier.Companion : m20710paddingFromY_r0B1c$default(Modifier.Companion, androidx.compose.p013ui.layout.AlignmentLineKt.getLastBaseline(), 0L, j11, 2, null));
    }

    /* renamed from: paddingFromBaseline-wCyjxdI$default, reason: not valid java name */
    public static /* synthetic */ Modifier m20714paddingFromBaselinewCyjxdI$default(Modifier modifier, long j10, long j11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = TextUnit.Companion.m27104getUnspecifiedXSAIIZE();
        }
        if ((i10 & 2) != 0) {
            j11 = TextUnit.Companion.m27104getUnspecifiedXSAIIZE();
        }
        return m20713paddingFromBaselinewCyjxdI(modifier, j10, j11);
    }
}
