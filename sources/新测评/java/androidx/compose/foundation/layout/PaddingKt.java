package androidx.compose.foundation.layout;

import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.platform.InspectorInfo;
import androidx.compose.p013ui.unit.C3127Dp;
import androidx.compose.p013ui.unit.LayoutDirection;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13557d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\u001a\u001a\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a&\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a:\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a>\u0010\u0010\u001a\u00020\u0011*\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0019\u0010\u0016\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0018H\u0007¢\u0006\u0002\u0010\u0019\u001a\u0019\u0010\u001a\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0018H\u0007¢\u0006\u0002\u0010\u0019\u001a\u0014\u0010\u001b\u001a\u00020\u0011*\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u0001H\u0007\u001a\u001e\u0010\u001b\u001a\u00020\u0011*\u00020\u00112\u0006\u0010\u0002\u001a\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a*\u0010\u001b\u001a\u00020\u0011*\u00020\u00112\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u001a>\u0010\u001b\u001a\u00020\u0011*\u00020\u00112\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b!\u0010\u0015\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\""}, m13558d2 = {"PaddingValues", "Landroidx/compose/foundation/layout/PaddingValues;", "all", "Landroidx/compose/ui/unit/Dp;", "PaddingValues-0680j_4", "(F)Landroidx/compose/foundation/layout/PaddingValues;", "horizontal", "vertical", "PaddingValues-YgX7TsA", "(FF)Landroidx/compose/foundation/layout/PaddingValues;", "start", "top", "end", "bottom", "PaddingValues-a9UjIt4", "(FFFF)Landroidx/compose/foundation/layout/PaddingValues;", "absolutePadding", "Landroidx/compose/ui/Modifier;", "left", "right", "absolutePadding-qDBjuR0", "(Landroidx/compose/ui/Modifier;FFFF)Landroidx/compose/ui/Modifier;", "calculateEndPadding", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "(Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/ui/unit/LayoutDirection;)F", "calculateStartPadding", "padding", "paddingValues", "padding-3ABfNKs", "(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;", "padding-VpY3zN4", "(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;", "padding-qDBjuR0", "foundation-layout_release"}, m13559k = 2, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nPadding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,472:1\n113#2:473\n113#2:474\n113#2:475\n113#2:476\n113#2:477\n113#2:478\n113#2:479\n113#2:480\n*S KotlinDebug\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingKt\n*L\n53#1:473\n83#1:474\n162#1:475\n274#1:476\n284#1:477\n285#1:478\n286#1:479\n287#1:480\n*E\n"})
/* loaded from: classes.dex */
public final class PaddingKt {
    @Stable
    /* renamed from: PaddingValues-0680j_4, reason: not valid java name */
    public static final PaddingValues m17674PaddingValues0680j_4(float f10) {
        return new PaddingValues(f10, f10, f10, f10, null);
    }

    @Stable
    /* renamed from: PaddingValues-YgX7TsA, reason: not valid java name */
    public static final PaddingValues m17675PaddingValuesYgX7TsA(float f10, float f11) {
        return new PaddingValues(f10, f11, f10, f11, null);
    }

    /* renamed from: PaddingValues-YgX7TsA$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m17676PaddingValuesYgX7TsA$default(float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = C3127Dp.m23561constructorimpl(0);
        }
        if ((i10 & 2) != 0) {
            f11 = C3127Dp.m23561constructorimpl(0);
        }
        return m17675PaddingValuesYgX7TsA(f10, f11);
    }

    @Stable
    /* renamed from: PaddingValues-a9UjIt4, reason: not valid java name */
    public static final PaddingValues m17677PaddingValuesa9UjIt4(float f10, float f11, float f12, float f13) {
        return new PaddingValues(f10, f11, f12, f13, null);
    }

    /* renamed from: PaddingValues-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m17678PaddingValuesa9UjIt4$default(float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = C3127Dp.m23561constructorimpl(0);
        }
        if ((i10 & 2) != 0) {
            f11 = C3127Dp.m23561constructorimpl(0);
        }
        if ((i10 & 4) != 0) {
            f12 = C3127Dp.m23561constructorimpl(0);
        }
        if ((i10 & 8) != 0) {
            f13 = C3127Dp.m23561constructorimpl(0);
        }
        return m17677PaddingValuesa9UjIt4(f10, f11, f12, f13);
    }

    @Stable
    /* renamed from: absolutePadding-qDBjuR0, reason: not valid java name */
    public static final Modifier m17679absolutePaddingqDBjuR0(Modifier modifier, final float f10, final float f11, final float f12, final float f13) {
        return modifier.then(new PaddingElement(f10, f11, f12, f13, false, new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.PaddingKt$absolutePadding$1
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
                inspectorInfo.setName("absolutePadding");
                inspectorInfo.getProperties().set("left", C3127Dp.m23559boximpl(f10));
                inspectorInfo.getProperties().set("top", C3127Dp.m23559boximpl(f11));
                inspectorInfo.getProperties().set("right", C3127Dp.m23559boximpl(f12));
                inspectorInfo.getProperties().set("bottom", C3127Dp.m23559boximpl(f13));
            }
        }, null));
    }

    /* renamed from: absolutePadding-qDBjuR0$default, reason: not valid java name */
    public static /* synthetic */ Modifier m17680absolutePaddingqDBjuR0$default(Modifier modifier, float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = C3127Dp.m23561constructorimpl(0);
        }
        if ((i10 & 2) != 0) {
            f11 = C3127Dp.m23561constructorimpl(0);
        }
        if ((i10 & 4) != 0) {
            f12 = C3127Dp.m23561constructorimpl(0);
        }
        if ((i10 & 8) != 0) {
            f13 = C3127Dp.m23561constructorimpl(0);
        }
        return m17679absolutePaddingqDBjuR0(modifier, f10, f11, f12, f13);
    }

    @Stable
    public static final float calculateEndPadding(PaddingValues paddingValues, LayoutDirection layoutDirection) {
        return layoutDirection == LayoutDirection.Ltr ? paddingValues.mo17632calculateRightPaddingu2uoSUM(layoutDirection) : paddingValues.mo17631calculateLeftPaddingu2uoSUM(layoutDirection);
    }

    @Stable
    public static final float calculateStartPadding(PaddingValues paddingValues, LayoutDirection layoutDirection) {
        return layoutDirection == LayoutDirection.Ltr ? paddingValues.mo17631calculateLeftPaddingu2uoSUM(layoutDirection) : paddingValues.mo17632calculateRightPaddingu2uoSUM(layoutDirection);
    }

    @Stable
    public static final Modifier padding(Modifier modifier, final PaddingValues paddingValues) {
        return modifier.then(new PaddingValuesElement(paddingValues, new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.PaddingKt.padding.4
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
                inspectorInfo.setName("padding");
                inspectorInfo.getProperties().set("paddingValues", paddingValues);
            }
        }));
    }

    @Stable
    /* renamed from: padding-3ABfNKs, reason: not valid java name */
    public static final Modifier m17681padding3ABfNKs(Modifier modifier, final float f10) {
        return modifier.then(new PaddingElement(f10, f10, f10, f10, true, new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.PaddingKt.padding.3
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
                inspectorInfo.setName("padding");
                inspectorInfo.setValue(C3127Dp.m23559boximpl(f10));
            }
        }, null));
    }

    @Stable
    /* renamed from: padding-VpY3zN4, reason: not valid java name */
    public static final Modifier m17682paddingVpY3zN4(Modifier modifier, final float f10, final float f11) {
        return modifier.then(new PaddingElement(f10, f11, f10, f11, true, new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.PaddingKt.padding.2
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
                inspectorInfo.setName("padding");
                inspectorInfo.getProperties().set("horizontal", C3127Dp.m23559boximpl(f10));
                inspectorInfo.getProperties().set("vertical", C3127Dp.m23559boximpl(f11));
            }
        }, null));
    }

    /* renamed from: padding-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ Modifier m17683paddingVpY3zN4$default(Modifier modifier, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = C3127Dp.m23561constructorimpl(0);
        }
        if ((i10 & 2) != 0) {
            f11 = C3127Dp.m23561constructorimpl(0);
        }
        return m17682paddingVpY3zN4(modifier, f10, f11);
    }

    @Stable
    /* renamed from: padding-qDBjuR0, reason: not valid java name */
    public static final Modifier m17684paddingqDBjuR0(Modifier modifier, final float f10, final float f11, final float f12, final float f13) {
        return modifier.then(new PaddingElement(f10, f11, f12, f13, true, new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.PaddingKt.padding.1
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
                inspectorInfo.setName("padding");
                inspectorInfo.getProperties().set("start", C3127Dp.m23559boximpl(f10));
                inspectorInfo.getProperties().set("top", C3127Dp.m23559boximpl(f11));
                inspectorInfo.getProperties().set("end", C3127Dp.m23559boximpl(f12));
                inspectorInfo.getProperties().set("bottom", C3127Dp.m23559boximpl(f13));
            }
        }, null));
    }

    /* renamed from: padding-qDBjuR0$default, reason: not valid java name */
    public static /* synthetic */ Modifier m17685paddingqDBjuR0$default(Modifier modifier, float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = C3127Dp.m23561constructorimpl(0);
        }
        if ((i10 & 2) != 0) {
            f11 = C3127Dp.m23561constructorimpl(0);
        }
        if ((i10 & 4) != 0) {
            f12 = C3127Dp.m23561constructorimpl(0);
        }
        if ((i10 & 8) != 0) {
            f13 = C3127Dp.m23561constructorimpl(0);
        }
        return m17684paddingqDBjuR0(modifier, f10, f11, f12, f13);
    }
}
