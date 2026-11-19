package androidx.compose.foundation.layout;

import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.layout.AlignmentLine;
import androidx.compose.p014ui.layout.HorizontalAlignmentLine;
import androidx.compose.p014ui.layout.Measurable;
import androidx.compose.p014ui.layout.MeasureResult;
import androidx.compose.p014ui.layout.MeasureScope;
import androidx.compose.p014ui.layout.Placeable;
import androidx.compose.p014ui.platform.InspectableValueKt;
import androidx.compose.p014ui.platform.InspectorInfo;
import androidx.compose.p014ui.unit.C3186Dp;
import androidx.compose.p014ui.unit.Constraints;
import androidx.compose.p014ui.unit.TextUnit;
import androidx.compose.runtime.Stable;
import p181hd.InterfaceC9540l;
import p265nd.AbstractC10410o;
import p309qc.C10786q;

/* loaded from: classes.dex */
public final class AlignmentLineKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: alignmentLineOffsetMeasure-tjqqzMA, reason: not valid java name */
    public static final MeasureResult m27308alignmentLineOffsetMeasuretjqqzMA(MeasureScope measureScope, final AlignmentLine alignmentLine, final float f10, float f11, Measurable measurable, long j10) {
        final Placeable placeableMo32229measureBRTryo0 = measurable.mo32229measureBRTryo0(getHorizontal(alignmentLine) ? Constraints.m33444copyZbe2FdA$default(j10, 0, 0, 0, 0, 11, null) : Constraints.m33444copyZbe2FdA$default(j10, 0, 0, 0, 0, 14, null));
        int i10 = placeableMo32229measureBRTryo0.get(alignmentLine);
        if (i10 == Integer.MIN_VALUE) {
            i10 = 0;
        }
        int height = getHorizontal(alignmentLine) ? placeableMo32229measureBRTryo0.getHeight() : placeableMo32229measureBRTryo0.getWidth();
        int iM33453getMaxHeightimpl = (getHorizontal(alignmentLine) ? Constraints.m33453getMaxHeightimpl(j10) : Constraints.m33454getMaxWidthimpl(j10)) - height;
        final int iM21761n = AbstractC10410o.m21761n((!Float.isNaN(f10) ? measureScope.mo27093roundToPx0680j_4(f10) : 0) - i10, 0, iM33453getMaxHeightimpl);
        final int iM21761n2 = AbstractC10410o.m21761n(((!Float.isNaN(f11) ? measureScope.mo27093roundToPx0680j_4(f11) : 0) - height) + i10, 0, iM33453getMaxHeightimpl - iM21761n);
        final int width = getHorizontal(alignmentLine) ? placeableMo32229measureBRTryo0.getWidth() : Math.max(placeableMo32229measureBRTryo0.getWidth() + iM21761n + iM21761n2, Constraints.m33456getMinWidthimpl(j10));
        final int iMax = getHorizontal(alignmentLine) ? Math.max(placeableMo32229measureBRTryo0.getHeight() + iM21761n + iM21761n2, Constraints.m33455getMinHeightimpl(j10)) : placeableMo32229measureBRTryo0.getHeight();
        return MeasureScope.layout$default(measureScope, width, iMax, null, new InterfaceC9540l() { // from class: androidx.compose.foundation.layout.AlignmentLineKt$alignmentLineOffsetMeasure$1
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
                int width2;
                if (AlignmentLineKt.getHorizontal(alignmentLine)) {
                    width2 = 0;
                } else {
                    width2 = !C3186Dp.m33506equalsimpl0(f10, C3186Dp.Companion.m33521getUnspecifiedD9Ej5fM()) ? iM21761n : (width - iM21761n2) - placeableMo32229measureBRTryo0.getWidth();
                }
                Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo32229measureBRTryo0, width2, AlignmentLineKt.getHorizontal(alignmentLine) ? !C3186Dp.m33506equalsimpl0(f10, C3186Dp.Companion.m33521getUnspecifiedD9Ej5fM()) ? iM21761n : (iMax - iM21761n2) - placeableMo32229measureBRTryo0.getHeight() : 0, 0.0f, 4, null);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getHorizontal(AlignmentLine alignmentLine) {
        return alignmentLine instanceof HorizontalAlignmentLine;
    }

    @Stable
    /* renamed from: paddingFrom-4j6BHR0, reason: not valid java name */
    public static final Modifier m27309paddingFrom4j6BHR0(Modifier modifier, final AlignmentLine alignmentLine, final float f10, final float f11) {
        return modifier.then(new AlignmentLineOffsetDpElement(alignmentLine, f10, f11, InspectableValueKt.isDebugInspectorInfoEnabled() ? new InterfaceC9540l() { // from class: androidx.compose.foundation.layout.AlignmentLineKt$paddingFrom-4j6BHR0$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return C10786q.f26013a;
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("paddingFrom");
                inspectorInfo.getProperties().set("alignmentLine", alignmentLine);
                inspectorInfo.getProperties().set("before", C3186Dp.m33499boximpl(f10));
                inspectorInfo.getProperties().set("after", C3186Dp.m33499boximpl(f11));
            }
        } : InspectableValueKt.getNoInspectorInfo(), null));
    }

    /* renamed from: paddingFrom-4j6BHR0$default, reason: not valid java name */
    public static /* synthetic */ Modifier m27310paddingFrom4j6BHR0$default(Modifier modifier, AlignmentLine alignmentLine, float f10, float f11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f10 = C3186Dp.Companion.m33521getUnspecifiedD9Ej5fM();
        }
        if ((i10 & 4) != 0) {
            f11 = C3186Dp.Companion.m33521getUnspecifiedD9Ej5fM();
        }
        return m27309paddingFrom4j6BHR0(modifier, alignmentLine, f10, f11);
    }

    @Stable
    /* renamed from: paddingFrom-Y_r0B1c, reason: not valid java name */
    public static final Modifier m27311paddingFromY_r0B1c(Modifier modifier, final AlignmentLine alignmentLine, long j10, long j11) {
        AlignmentLine alignmentLine2;
        final long j12;
        final long j13;
        InterfaceC9540l noInspectorInfo;
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            j12 = j10;
            j13 = j11;
            noInspectorInfo = new InterfaceC9540l() { // from class: androidx.compose.foundation.layout.AlignmentLineKt$paddingFrom-Y_r0B1c$$inlined$debugInspectorInfo$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p181hd.InterfaceC9540l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((InspectorInfo) obj);
                    return C10786q.f26013a;
                }

                public final void invoke(InspectorInfo inspectorInfo) {
                    inspectorInfo.setName("paddingFrom");
                    inspectorInfo.getProperties().set("alignmentLine", alignmentLine);
                    inspectorInfo.getProperties().set("before", TextUnit.m33685boximpl(j12));
                    inspectorInfo.getProperties().set("after", TextUnit.m33685boximpl(j13));
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
    public static /* synthetic */ Modifier m27312paddingFromY_r0B1c$default(Modifier modifier, AlignmentLine alignmentLine, long j10, long j11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = TextUnit.Companion.m33706getUnspecifiedXSAIIZE();
        }
        long j12 = j10;
        if ((i10 & 4) != 0) {
            j11 = TextUnit.Companion.m33706getUnspecifiedXSAIIZE();
        }
        return m27311paddingFromY_r0B1c(modifier, alignmentLine, j12, j11);
    }

    @Stable
    /* renamed from: paddingFromBaseline-VpY3zN4, reason: not valid java name */
    public static final Modifier m27313paddingFromBaselineVpY3zN4(Modifier modifier, float f10, float f11) {
        return modifier.then(!Float.isNaN(f10) ? m27310paddingFrom4j6BHR0$default(Modifier.Companion, androidx.compose.p014ui.layout.AlignmentLineKt.getFirstBaseline(), f10, 0.0f, 4, null) : Modifier.Companion).then(!Float.isNaN(f11) ? m27310paddingFrom4j6BHR0$default(Modifier.Companion, androidx.compose.p014ui.layout.AlignmentLineKt.getLastBaseline(), 0.0f, f11, 2, null) : Modifier.Companion);
    }

    /* renamed from: paddingFromBaseline-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ Modifier m27314paddingFromBaselineVpY3zN4$default(Modifier modifier, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = C3186Dp.Companion.m33521getUnspecifiedD9Ej5fM();
        }
        if ((i10 & 2) != 0) {
            f11 = C3186Dp.Companion.m33521getUnspecifiedD9Ej5fM();
        }
        return m27313paddingFromBaselineVpY3zN4(modifier, f10, f11);
    }

    @Stable
    /* renamed from: paddingFromBaseline-wCyjxdI, reason: not valid java name */
    public static final Modifier m27315paddingFromBaselinewCyjxdI(Modifier modifier, long j10, long j11) {
        return modifier.then(TextUnit.m33693getRawTypeimpl(j10) == 0 ? Modifier.Companion : m27312paddingFromY_r0B1c$default(Modifier.Companion, androidx.compose.p014ui.layout.AlignmentLineKt.getFirstBaseline(), j10, 0L, 4, null)).then(TextUnit.m33693getRawTypeimpl(j11) == 0 ? Modifier.Companion : m27312paddingFromY_r0B1c$default(Modifier.Companion, androidx.compose.p014ui.layout.AlignmentLineKt.getLastBaseline(), 0L, j11, 2, null));
    }

    /* renamed from: paddingFromBaseline-wCyjxdI$default, reason: not valid java name */
    public static /* synthetic */ Modifier m27316paddingFromBaselinewCyjxdI$default(Modifier modifier, long j10, long j11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = TextUnit.Companion.m33706getUnspecifiedXSAIIZE();
        }
        if ((i10 & 2) != 0) {
            j11 = TextUnit.Companion.m33706getUnspecifiedXSAIIZE();
        }
        return m27315paddingFromBaselinewCyjxdI(modifier, j10, j11);
    }
}
