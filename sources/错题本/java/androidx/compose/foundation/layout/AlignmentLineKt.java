package androidx.compose.foundation.layout;

import androidx.collection.AbstractC0584a;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.AlignmentLine;
import androidx.compose.p011ui.layout.HorizontalAlignmentLine;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.MeasureScope;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.platform.InspectableValueKt;
import androidx.compose.p011ui.platform.InspectorInfo;
import androidx.compose.p011ui.unit.C2331Dp;
import androidx.compose.p011ui.unit.Constraints;
import androidx.compose.p011ui.unit.TextUnit;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.collections.AbstractC5806u;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p045d6.C5443s;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000@\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u001a>\u0010\u0005\u001a\u00020\u0006*\u00020\u00072\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a2\u0010\u0012\u001a\u00020\u0013*\u00020\u00132\u0006\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a2\u0010\u0012\u001a\u00020\u0013*\u00020\u00132\u0006\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00162\b\b\u0002\u0010\u000b\u001a\u00020\u0016H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a*\u0010\u0019\u001a\u00020\u0013*\u00020\u00132\b\b\u0002\u0010\u001a\u001a\u00020\n2\b\b\u0002\u0010\u001b\u001a\u00020\nH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a*\u0010\u0019\u001a\u00020\u0013*\u00020\u00132\b\b\u0002\u0010\u001a\u001a\u00020\u00162\b\b\u0002\u0010\u001b\u001a\u00020\u0016H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001f\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006 "}, m5110d2 = {"horizontal", "", "Landroidx/compose/ui/layout/AlignmentLine;", "getHorizontal", "(Landroidx/compose/ui/layout/AlignmentLine;)Z", "alignmentLineOffsetMeasure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "alignmentLine", "before", "Landroidx/compose/ui/unit/Dp;", "after", "measurable", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "alignmentLineOffsetMeasure-tjqqzMA", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/AlignmentLine;FFLandroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "paddingFrom", "Landroidx/compose/ui/Modifier;", "paddingFrom-4j6BHR0", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/layout/AlignmentLine;FF)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/unit/TextUnit;", "paddingFrom-Y_r0B1c", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/layout/AlignmentLine;JJ)Landroidx/compose/ui/Modifier;", "paddingFromBaseline", "top", "bottom", "paddingFromBaseline-VpY3zN4", "(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;", "paddingFromBaseline-wCyjxdI", "(Landroidx/compose/ui/Modifier;JJ)Landroidx/compose/ui/Modifier;", "foundation-layout_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nAlignmentLine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlignmentLine.kt\nandroidx/compose/foundation/layout/AlignmentLineKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 TextUnit.kt\nandroidx/compose/ui/unit/TextUnitKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,364:1\n110#2:365\n110#2:366\n97#3:367\n97#3:368\n97#3:372\n97#3:373\n247#4:369\n247#4:370\n1#5:371\n*S KotlinDebug\n*F\n+ 1 AlignmentLine.kt\nandroidx/compose/foundation/layout/AlignmentLineKt\n*L\n75#1:365\n119#1:366\n146#1:367\n153#1:368\n323#1:372\n328#1:373\n181#1:369\n184#1:370\n*E\n"})
/* loaded from: classes.dex */
public final class AlignmentLineKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: alignmentLineOffsetMeasure-tjqqzMA, reason: not valid java name */
    public static final MeasureResult m7112alignmentLineOffsetMeasuretjqqzMA(MeasureScope measureScope, final AlignmentLine alignmentLine, final float f, float f7, Measurable measurable, long j7) {
        final Placeable placeableMo12033measureBRTryo0 = measurable.mo12033measureBRTryo0(getHorizontal(alignmentLine) ? Constraints.m13248copyZbe2FdA$default(j7, 0, 0, 0, 0, 11, null) : Constraints.m13248copyZbe2FdA$default(j7, 0, 0, 0, 0, 14, null));
        int i = placeableMo12033measureBRTryo0.get(alignmentLine);
        if (i == Integer.MIN_VALUE) {
            i = 0;
        }
        int height = getHorizontal(alignmentLine) ? placeableMo12033measureBRTryo0.getHeight() : placeableMo12033measureBRTryo0.getWidth();
        int iM13257getMaxHeightimpl = (getHorizontal(alignmentLine) ? Constraints.m13257getMaxHeightimpl(j7) : Constraints.m13258getMaxWidthimpl(j7)) - height;
        final int iM5274m = AbstractC5806u.m5274m((!Float.isNaN(f) ? measureScope.mo6897roundToPx0680j_4(f) : 0) - i, 0, iM13257getMaxHeightimpl);
        final int iM5274m2 = AbstractC5806u.m5274m(((!Float.isNaN(f7) ? measureScope.mo6897roundToPx0680j_4(f7) : 0) - height) + i, 0, iM13257getMaxHeightimpl - iM5274m);
        final int width = getHorizontal(alignmentLine) ? placeableMo12033measureBRTryo0.getWidth() : Math.max(placeableMo12033measureBRTryo0.getWidth() + iM5274m + iM5274m2, Constraints.m13260getMinWidthimpl(j7));
        final int iMax = getHorizontal(alignmentLine) ? Math.max(placeableMo12033measureBRTryo0.getHeight() + iM5274m + iM5274m2, Constraints.m13259getMinHeightimpl(j7)) : placeableMo12033measureBRTryo0.getHeight();
        return MeasureScope.layout$default(measureScope, width, iMax, null, new InterfaceC6471c() { // from class: androidx.compose.foundation.layout.AlignmentLineKt$alignmentLineOffsetMeasure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Placeable.PlacementScope) obj);
                return C5443s.f8405a;
            }

            public final void invoke(Placeable.PlacementScope placementScope) {
                int width2;
                if (AlignmentLineKt.getHorizontal(alignmentLine)) {
                    width2 = 0;
                } else {
                    width2 = !C2331Dp.m13310equalsimpl0(f, C2331Dp.INSTANCE.m13325getUnspecifiedD9Ej5fM()) ? iM5274m : (width - iM5274m2) - placeableMo12033measureBRTryo0.getWidth();
                }
                Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo12033measureBRTryo0, width2, AlignmentLineKt.getHorizontal(alignmentLine) ? !C2331Dp.m13310equalsimpl0(f, C2331Dp.INSTANCE.m13325getUnspecifiedD9Ej5fM()) ? iM5274m : (iMax - iM5274m2) - placeableMo12033measureBRTryo0.getHeight() : 0, 0.0f, 4, null);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getHorizontal(AlignmentLine alignmentLine) {
        return alignmentLine instanceof HorizontalAlignmentLine;
    }

    @Stable
    @NotNull
    /* renamed from: paddingFrom-4j6BHR0, reason: not valid java name */
    public static final Modifier m7113paddingFrom4j6BHR0(@NotNull Modifier modifier, @NotNull final AlignmentLine alignmentLine, final float f, final float f7) {
        return modifier.then(new AlignmentLineOffsetDpElement(alignmentLine, f, f7, InspectableValueKt.isDebugInspectorInfoEnabled() ? new InterfaceC6471c() { // from class: androidx.compose.foundation.layout.AlignmentLineKt$paddingFrom-4j6BHR0$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return C5443s.f8405a;
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("paddingFrom");
                inspectorInfo.getProperties().set("alignmentLine", alignmentLine);
                AbstractC0584a.m909j(f, inspectorInfo.getProperties(), "before", inspectorInfo).set("after", C2331Dp.m13303boximpl(f7));
            }
        } : InspectableValueKt.getNoInspectorInfo(), null));
    }

    /* renamed from: paddingFrom-4j6BHR0$default, reason: not valid java name */
    public static /* synthetic */ Modifier m7114paddingFrom4j6BHR0$default(Modifier modifier, AlignmentLine alignmentLine, float f, float f7, int i, Object obj) {
        if ((i & 2) != 0) {
            f = C2331Dp.INSTANCE.m13325getUnspecifiedD9Ej5fM();
        }
        if ((i & 4) != 0) {
            f7 = C2331Dp.INSTANCE.m13325getUnspecifiedD9Ej5fM();
        }
        return m7113paddingFrom4j6BHR0(modifier, alignmentLine, f, f7);
    }

    @Stable
    @NotNull
    /* renamed from: paddingFrom-Y_r0B1c, reason: not valid java name */
    public static final Modifier m7115paddingFromY_r0B1c(@NotNull Modifier modifier, @NotNull final AlignmentLine alignmentLine, long j7, long j8) {
        AlignmentLine alignmentLine2;
        final long j9;
        final long j10;
        InterfaceC6471c noInspectorInfo;
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            j9 = j7;
            j10 = j8;
            noInspectorInfo = new InterfaceC6471c() { // from class: androidx.compose.foundation.layout.AlignmentLineKt$paddingFrom-Y_r0B1c$$inlined$debugInspectorInfo$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p152r6.InterfaceC6471c
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((InspectorInfo) obj);
                    return C5443s.f8405a;
                }

                public final void invoke(InspectorInfo inspectorInfo) {
                    inspectorInfo.setName("paddingFrom");
                    inspectorInfo.getProperties().set("alignmentLine", alignmentLine);
                    inspectorInfo.getProperties().set("before", TextUnit.m13489boximpl(j9));
                    inspectorInfo.getProperties().set("after", TextUnit.m13489boximpl(j10));
                }
            };
            alignmentLine2 = alignmentLine;
        } else {
            alignmentLine2 = alignmentLine;
            j9 = j7;
            j10 = j8;
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return modifier.then(new AlignmentLineOffsetTextUnitElement(alignmentLine2, j9, j10, noInspectorInfo, null));
    }

    /* renamed from: paddingFrom-Y_r0B1c$default, reason: not valid java name */
    public static /* synthetic */ Modifier m7116paddingFromY_r0B1c$default(Modifier modifier, AlignmentLine alignmentLine, long j7, long j8, int i, Object obj) {
        if ((i & 2) != 0) {
            j7 = TextUnit.INSTANCE.m13510getUnspecifiedXSAIIZE();
        }
        long j9 = j7;
        if ((i & 4) != 0) {
            j8 = TextUnit.INSTANCE.m13510getUnspecifiedXSAIIZE();
        }
        return m7115paddingFromY_r0B1c(modifier, alignmentLine, j9, j8);
    }

    @Stable
    @NotNull
    /* renamed from: paddingFromBaseline-VpY3zN4, reason: not valid java name */
    public static final Modifier m7117paddingFromBaselineVpY3zN4(@NotNull Modifier modifier, float f, float f7) {
        return modifier.then(!Float.isNaN(f) ? m7114paddingFrom4j6BHR0$default(Modifier.INSTANCE, androidx.compose.p011ui.layout.AlignmentLineKt.getFirstBaseline(), f, 0.0f, 4, null) : Modifier.INSTANCE).then(!Float.isNaN(f7) ? m7114paddingFrom4j6BHR0$default(Modifier.INSTANCE, androidx.compose.p011ui.layout.AlignmentLineKt.getLastBaseline(), 0.0f, f7, 2, null) : Modifier.INSTANCE);
    }

    /* renamed from: paddingFromBaseline-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ Modifier m7118paddingFromBaselineVpY3zN4$default(Modifier modifier, float f, float f7, int i, Object obj) {
        if ((i & 1) != 0) {
            f = C2331Dp.INSTANCE.m13325getUnspecifiedD9Ej5fM();
        }
        if ((i & 2) != 0) {
            f7 = C2331Dp.INSTANCE.m13325getUnspecifiedD9Ej5fM();
        }
        return m7117paddingFromBaselineVpY3zN4(modifier, f, f7);
    }

    @Stable
    @NotNull
    /* renamed from: paddingFromBaseline-wCyjxdI, reason: not valid java name */
    public static final Modifier m7119paddingFromBaselinewCyjxdI(@NotNull Modifier modifier, long j7, long j8) {
        return modifier.then(TextUnit.m13497getRawTypeimpl(j7) == 0 ? Modifier.INSTANCE : m7116paddingFromY_r0B1c$default(Modifier.INSTANCE, androidx.compose.p011ui.layout.AlignmentLineKt.getFirstBaseline(), j7, 0L, 4, null)).then(TextUnit.m13497getRawTypeimpl(j8) == 0 ? Modifier.INSTANCE : m7116paddingFromY_r0B1c$default(Modifier.INSTANCE, androidx.compose.p011ui.layout.AlignmentLineKt.getLastBaseline(), 0L, j8, 2, null));
    }

    /* renamed from: paddingFromBaseline-wCyjxdI$default, reason: not valid java name */
    public static /* synthetic */ Modifier m7120paddingFromBaselinewCyjxdI$default(Modifier modifier, long j7, long j8, int i, Object obj) {
        if ((i & 1) != 0) {
            j7 = TextUnit.INSTANCE.m13510getUnspecifiedXSAIIZE();
        }
        if ((i & 2) != 0) {
            j8 = TextUnit.INSTANCE.m13510getUnspecifiedXSAIIZE();
        }
        return m7119paddingFromBaselinewCyjxdI(modifier, j7, j8);
    }
}
