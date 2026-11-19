package androidx.compose.foundation.layout;

import androidx.compose.p006ui.Modifier;
import androidx.compose.p006ui.platform.InspectableValueKt;
import androidx.compose.p006ui.platform.InspectorInfo;
import androidx.compose.p006ui.unit.C1700Dp;
import androidx.compose.p006ui.unit.LayoutDirection;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m5174d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\u001a\u001d\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a)\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\t\u001a=\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u0003H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001aA\u0010\u0010\u001a\u00020\u0011*\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u0003H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001c\u0010\u0016\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0018H\u0007ø\u0001\u0001¢\u0006\u0002\u0010\u0019\u001a\u001c\u0010\u001a\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0018H\u0007ø\u0001\u0001¢\u0006\u0002\u0010\u0019\u001a\u0014\u0010\u001b\u001a\u00020\u0011*\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u0001H\u0007\u001a!\u0010\u001b\u001a\u00020\u0011*\u00020\u00112\u0006\u0010\u0002\u001a\u00020\u0003H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001e\u001a-\u0010\u001b\u001a\u00020\u0011*\u00020\u00112\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010 \u001aA\u0010\u001b\u001a\u00020\u0011*\u00020\u00112\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u0003H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b!\u0010\u0015\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\""}, m5175d2 = {"PaddingValues", "Landroidx/compose/foundation/layout/PaddingValues;", "all", "Landroidx/compose/ui/unit/Dp;", "PaddingValues-0680j_4", "(F)Landroidx/compose/foundation/layout/PaddingValues;", "horizontal", "vertical", "PaddingValues-YgX7TsA", "(FF)Landroidx/compose/foundation/layout/PaddingValues;", "start", "top", "end", "bottom", "PaddingValues-a9UjIt4", "(FFFF)Landroidx/compose/foundation/layout/PaddingValues;", "absolutePadding", "Landroidx/compose/ui/Modifier;", "left", "right", "absolutePadding-qDBjuR0", "(Landroidx/compose/ui/Modifier;FFFF)Landroidx/compose/ui/Modifier;", "calculateEndPadding", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "(Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/ui/unit/LayoutDirection;)F", "calculateStartPadding", "padding", "paddingValues", "padding-3ABfNKs", "(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;", "padding-VpY3zN4", "(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;", "padding-qDBjuR0", "foundation-layout_release"}, m5176k = 2, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nPadding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,436:1\n135#2:437\n135#2:442\n135#2:445\n135#2:446\n135#2:447\n155#3:438\n155#3:439\n155#3:440\n155#3:441\n155#3:443\n155#3:444\n155#3:448\n155#3:449\n155#3:450\n155#3:451\n155#3:452\n155#3:453\n155#3:454\n155#3:455\n155#3:456\n*S KotlinDebug\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingKt\n*L\n62#1:437\n95#1:442\n123#1:445\n146#1:446\n178#1:447\n51#1:438\n52#1:439\n53#1:440\n54#1:441\n86#1:443\n87#1:444\n167#1:448\n168#1:449\n169#1:450\n170#1:451\n286#1:452\n296#1:453\n297#1:454\n298#1:455\n299#1:456\n*E\n"})
/* loaded from: classes.dex */
public final class PaddingKt {
    @Stable
    /* renamed from: PaddingValues-0680j_4, reason: not valid java name */
    public static final PaddingValues m7309PaddingValues0680j_4(float f4) {
        return new PaddingValues(f4, f4, f4, f4, null);
    }

    @Stable
    /* renamed from: PaddingValues-YgX7TsA, reason: not valid java name */
    public static final PaddingValues m7310PaddingValuesYgX7TsA(float f4, float f5) {
        return new PaddingValues(f4, f5, f4, f5, null);
    }

    /* renamed from: PaddingValues-YgX7TsA$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m7311PaddingValuesYgX7TsA$default(float f4, float f5, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            f4 = C1700Dp.m11525constructorimpl(0);
        }
        if ((i4 & 2) != 0) {
            f5 = C1700Dp.m11525constructorimpl(0);
        }
        return m7310PaddingValuesYgX7TsA(f4, f5);
    }

    @Stable
    /* renamed from: PaddingValues-a9UjIt4, reason: not valid java name */
    public static final PaddingValues m7312PaddingValuesa9UjIt4(float f4, float f5, float f6, float f7) {
        return new PaddingValues(f4, f5, f6, f7, null);
    }

    /* renamed from: PaddingValues-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m7313PaddingValuesa9UjIt4$default(float f4, float f5, float f6, float f7, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            f4 = C1700Dp.m11525constructorimpl(0);
        }
        if ((i4 & 2) != 0) {
            f5 = C1700Dp.m11525constructorimpl(0);
        }
        if ((i4 & 4) != 0) {
            f6 = C1700Dp.m11525constructorimpl(0);
        }
        if ((i4 & 8) != 0) {
            f7 = C1700Dp.m11525constructorimpl(0);
        }
        return m7312PaddingValuesa9UjIt4(f4, f5, f6, f7);
    }

    @Stable
    /* renamed from: absolutePadding-qDBjuR0, reason: not valid java name */
    public static final Modifier m7314absolutePaddingqDBjuR0(Modifier absolutePadding, final float f4, final float f5, final float f6, final float f7) {
        Intrinsics.checkNotNullParameter(absolutePadding, "$this$absolutePadding");
        return absolutePadding.then(new PaddingModifier(f4, f5, f6, f7, false, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.PaddingKt$absolutePadding-qDBjuR0$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("absolutePadding");
                inspectorInfo.getProperties().set("left", C1700Dp.m11523boximpl(f4));
                inspectorInfo.getProperties().set("top", C1700Dp.m11523boximpl(f5));
                inspectorInfo.getProperties().set("right", C1700Dp.m11523boximpl(f6));
                inspectorInfo.getProperties().set("bottom", C1700Dp.m11523boximpl(f7));
            }
        } : InspectableValueKt.getNoInspectorInfo(), null));
    }

    /* renamed from: absolutePadding-qDBjuR0$default, reason: not valid java name */
    public static /* synthetic */ Modifier m7315absolutePaddingqDBjuR0$default(Modifier modifier, float f4, float f5, float f6, float f7, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            f4 = C1700Dp.m11525constructorimpl(0);
        }
        if ((i4 & 2) != 0) {
            f5 = C1700Dp.m11525constructorimpl(0);
        }
        if ((i4 & 4) != 0) {
            f6 = C1700Dp.m11525constructorimpl(0);
        }
        if ((i4 & 8) != 0) {
            f7 = C1700Dp.m11525constructorimpl(0);
        }
        return m7314absolutePaddingqDBjuR0(modifier, f4, f5, f6, f7);
    }

    @Stable
    public static final float calculateEndPadding(PaddingValues paddingValues, LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(paddingValues, "<this>");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        return layoutDirection == LayoutDirection.Ltr ? paddingValues.mo7298calculateRightPaddingu2uoSUM(layoutDirection) : paddingValues.mo7297calculateLeftPaddingu2uoSUM(layoutDirection);
    }

    @Stable
    public static final float calculateStartPadding(PaddingValues paddingValues, LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(paddingValues, "<this>");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        return layoutDirection == LayoutDirection.Ltr ? paddingValues.mo7297calculateLeftPaddingu2uoSUM(layoutDirection) : paddingValues.mo7298calculateRightPaddingu2uoSUM(layoutDirection);
    }

    @Stable
    public static final Modifier padding(Modifier modifier, final PaddingValues paddingValues) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
        return modifier.then(new PaddingValuesModifier(paddingValues, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.PaddingKt$padding$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("padding");
                inspectorInfo.getProperties().set("paddingValues", paddingValues);
            }
        } : InspectableValueKt.getNoInspectorInfo()));
    }

    @Stable
    /* renamed from: padding-3ABfNKs, reason: not valid java name */
    public static final Modifier m7316padding3ABfNKs(Modifier padding, final float f4) {
        Intrinsics.checkNotNullParameter(padding, "$this$padding");
        return padding.then(new PaddingModifier(f4, f4, f4, f4, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.PaddingKt$padding-3ABfNKs$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("padding");
                inspectorInfo.setValue(C1700Dp.m11523boximpl(f4));
            }
        } : InspectableValueKt.getNoInspectorInfo(), null));
    }

    @Stable
    /* renamed from: padding-VpY3zN4, reason: not valid java name */
    public static final Modifier m7317paddingVpY3zN4(Modifier padding, final float f4, final float f5) {
        Intrinsics.checkNotNullParameter(padding, "$this$padding");
        return padding.then(new PaddingModifier(f4, f5, f4, f5, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.PaddingKt$padding-VpY3zN4$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("padding");
                inspectorInfo.getProperties().set("horizontal", C1700Dp.m11523boximpl(f4));
                inspectorInfo.getProperties().set("vertical", C1700Dp.m11523boximpl(f5));
            }
        } : InspectableValueKt.getNoInspectorInfo(), null));
    }

    /* renamed from: padding-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ Modifier m7318paddingVpY3zN4$default(Modifier modifier, float f4, float f5, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            f4 = C1700Dp.m11525constructorimpl(0);
        }
        if ((i4 & 2) != 0) {
            f5 = C1700Dp.m11525constructorimpl(0);
        }
        return m7317paddingVpY3zN4(modifier, f4, f5);
    }

    @Stable
    /* renamed from: padding-qDBjuR0, reason: not valid java name */
    public static final Modifier m7319paddingqDBjuR0(Modifier padding, final float f4, final float f5, final float f6, final float f7) {
        Intrinsics.checkNotNullParameter(padding, "$this$padding");
        return padding.then(new PaddingModifier(f4, f5, f6, f7, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.PaddingKt$padding-qDBjuR0$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("padding");
                inspectorInfo.getProperties().set("start", C1700Dp.m11523boximpl(f4));
                inspectorInfo.getProperties().set("top", C1700Dp.m11523boximpl(f5));
                inspectorInfo.getProperties().set("end", C1700Dp.m11523boximpl(f6));
                inspectorInfo.getProperties().set("bottom", C1700Dp.m11523boximpl(f7));
            }
        } : InspectableValueKt.getNoInspectorInfo(), null));
    }

    /* renamed from: padding-qDBjuR0$default, reason: not valid java name */
    public static /* synthetic */ Modifier m7320paddingqDBjuR0$default(Modifier modifier, float f4, float f5, float f6, float f7, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            f4 = C1700Dp.m11525constructorimpl(0);
        }
        if ((i4 & 2) != 0) {
            f5 = C1700Dp.m11525constructorimpl(0);
        }
        if ((i4 & 4) != 0) {
            f6 = C1700Dp.m11525constructorimpl(0);
        }
        if ((i4 & 8) != 0) {
            f7 = C1700Dp.m11525constructorimpl(0);
        }
        return m7319paddingqDBjuR0(modifier, f4, f5, f6, f7);
    }
}
