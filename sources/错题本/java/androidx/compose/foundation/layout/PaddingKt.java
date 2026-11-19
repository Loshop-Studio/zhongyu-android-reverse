package androidx.compose.foundation.layout;

import androidx.collection.AbstractC0584a;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.InspectorInfo;
import androidx.compose.p011ui.unit.C2331Dp;
import androidx.compose.p011ui.unit.LayoutDirection;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p045d6.C5443s;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\u001a\u001a\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a&\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a:\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a>\u0010\u0010\u001a\u00020\u0011*\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0019\u0010\u0016\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0018H\u0007¢\u0006\u0002\u0010\u0019\u001a\u0019\u0010\u001a\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0018H\u0007¢\u0006\u0002\u0010\u0019\u001a\u0014\u0010\u001b\u001a\u00020\u0011*\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u0001H\u0007\u001a\u001e\u0010\u001b\u001a\u00020\u0011*\u00020\u00112\u0006\u0010\u0002\u001a\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a*\u0010\u001b\u001a\u00020\u0011*\u00020\u00112\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u001a>\u0010\u001b\u001a\u00020\u0011*\u00020\u00112\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b!\u0010\u0015\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\""}, m5110d2 = {"PaddingValues", "Landroidx/compose/foundation/layout/PaddingValues;", "all", "Landroidx/compose/ui/unit/Dp;", "PaddingValues-0680j_4", "(F)Landroidx/compose/foundation/layout/PaddingValues;", "horizontal", "vertical", "PaddingValues-YgX7TsA", "(FF)Landroidx/compose/foundation/layout/PaddingValues;", "start", "top", "end", "bottom", "PaddingValues-a9UjIt4", "(FFFF)Landroidx/compose/foundation/layout/PaddingValues;", "absolutePadding", "Landroidx/compose/ui/Modifier;", "left", "right", "absolutePadding-qDBjuR0", "(Landroidx/compose/ui/Modifier;FFFF)Landroidx/compose/ui/Modifier;", "calculateEndPadding", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "(Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/ui/unit/LayoutDirection;)F", "calculateStartPadding", "padding", "paddingValues", "padding-3ABfNKs", "(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;", "padding-VpY3zN4", "(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;", "padding-qDBjuR0", "foundation-layout_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nPadding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,472:1\n113#2:473\n113#2:474\n113#2:475\n113#2:476\n113#2:477\n113#2:478\n113#2:479\n113#2:480\n*S KotlinDebug\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingKt\n*L\n53#1:473\n83#1:474\n162#1:475\n274#1:476\n284#1:477\n285#1:478\n286#1:479\n287#1:480\n*E\n"})
/* loaded from: classes.dex */
public final class PaddingKt {
    @Stable
    @NotNull
    /* renamed from: PaddingValues-0680j_4, reason: not valid java name */
    public static final PaddingValues m7255PaddingValues0680j_4(float f) {
        return new PaddingValuesImpl(f, f, f, f, null);
    }

    @Stable
    @NotNull
    /* renamed from: PaddingValues-YgX7TsA, reason: not valid java name */
    public static final PaddingValues m7256PaddingValuesYgX7TsA(float f, float f7) {
        return new PaddingValuesImpl(f, f7, f, f7, null);
    }

    /* renamed from: PaddingValues-YgX7TsA$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m7257PaddingValuesYgX7TsA$default(float f, float f7, int i, Object obj) {
        if ((i & 1) != 0) {
            f = C2331Dp.m13305constructorimpl(0);
        }
        if ((i & 2) != 0) {
            f7 = C2331Dp.m13305constructorimpl(0);
        }
        return m7256PaddingValuesYgX7TsA(f, f7);
    }

    @Stable
    @NotNull
    /* renamed from: PaddingValues-a9UjIt4, reason: not valid java name */
    public static final PaddingValues m7258PaddingValuesa9UjIt4(float f, float f7, float f8, float f9) {
        return new PaddingValuesImpl(f, f7, f8, f9, null);
    }

    /* renamed from: PaddingValues-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m7259PaddingValuesa9UjIt4$default(float f, float f7, float f8, float f9, int i, Object obj) {
        if ((i & 1) != 0) {
            f = C2331Dp.m13305constructorimpl(0);
        }
        if ((i & 2) != 0) {
            f7 = C2331Dp.m13305constructorimpl(0);
        }
        if ((i & 4) != 0) {
            f8 = C2331Dp.m13305constructorimpl(0);
        }
        if ((i & 8) != 0) {
            f9 = C2331Dp.m13305constructorimpl(0);
        }
        return m7258PaddingValuesa9UjIt4(f, f7, f8, f9);
    }

    @Stable
    @NotNull
    /* renamed from: absolutePadding-qDBjuR0, reason: not valid java name */
    public static final Modifier m7260absolutePaddingqDBjuR0(@NotNull Modifier modifier, final float f, final float f7, final float f8, final float f9) {
        return modifier.then(new PaddingElement(f, f7, f8, f9, false, new InterfaceC6471c() { // from class: androidx.compose.foundation.layout.PaddingKt$absolutePadding$1
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
                inspectorInfo.setName("absolutePadding");
                AbstractC0584a.m909j(f8, AbstractC0584a.m909j(f7, AbstractC0584a.m909j(f, inspectorInfo.getProperties(), "left", inspectorInfo), "top", inspectorInfo), "right", inspectorInfo).set("bottom", C2331Dp.m13303boximpl(f9));
            }
        }, null));
    }

    /* renamed from: absolutePadding-qDBjuR0$default, reason: not valid java name */
    public static /* synthetic */ Modifier m7261absolutePaddingqDBjuR0$default(Modifier modifier, float f, float f7, float f8, float f9, int i, Object obj) {
        if ((i & 1) != 0) {
            f = C2331Dp.m13305constructorimpl(0);
        }
        if ((i & 2) != 0) {
            f7 = C2331Dp.m13305constructorimpl(0);
        }
        if ((i & 4) != 0) {
            f8 = C2331Dp.m13305constructorimpl(0);
        }
        if ((i & 8) != 0) {
            f9 = C2331Dp.m13305constructorimpl(0);
        }
        return m7260absolutePaddingqDBjuR0(modifier, f, f7, f8, f9);
    }

    @Stable
    public static final float calculateEndPadding(@NotNull PaddingValues paddingValues, @NotNull LayoutDirection layoutDirection) {
        return layoutDirection == LayoutDirection.Ltr ? paddingValues.mo7213calculateRightPaddingu2uoSUM(layoutDirection) : paddingValues.mo7212calculateLeftPaddingu2uoSUM(layoutDirection);
    }

    @Stable
    public static final float calculateStartPadding(@NotNull PaddingValues paddingValues, @NotNull LayoutDirection layoutDirection) {
        return layoutDirection == LayoutDirection.Ltr ? paddingValues.mo7212calculateLeftPaddingu2uoSUM(layoutDirection) : paddingValues.mo7213calculateRightPaddingu2uoSUM(layoutDirection);
    }

    @Stable
    @NotNull
    public static final Modifier padding(@NotNull Modifier modifier, @NotNull final PaddingValues paddingValues) {
        return modifier.then(new PaddingValuesElement(paddingValues, new InterfaceC6471c() { // from class: androidx.compose.foundation.layout.PaddingKt.padding.4
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return C5443s.f8405a;
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("padding");
                inspectorInfo.getProperties().set("paddingValues", paddingValues);
            }
        }));
    }

    @Stable
    @NotNull
    /* renamed from: padding-3ABfNKs, reason: not valid java name */
    public static final Modifier m7262padding3ABfNKs(@NotNull Modifier modifier, final float f) {
        return modifier.then(new PaddingElement(f, f, f, f, true, new InterfaceC6471c() { // from class: androidx.compose.foundation.layout.PaddingKt.padding.3
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
                inspectorInfo.setName("padding");
                inspectorInfo.setValue(C2331Dp.m13303boximpl(f));
            }
        }, null));
    }

    @Stable
    @NotNull
    /* renamed from: padding-VpY3zN4, reason: not valid java name */
    public static final Modifier m7263paddingVpY3zN4(@NotNull Modifier modifier, final float f, final float f7) {
        return modifier.then(new PaddingElement(f, f7, f, f7, true, new InterfaceC6471c() { // from class: androidx.compose.foundation.layout.PaddingKt.padding.2
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
                inspectorInfo.setName("padding");
                AbstractC0584a.m909j(f, inspectorInfo.getProperties(), "horizontal", inspectorInfo).set("vertical", C2331Dp.m13303boximpl(f7));
            }
        }, null));
    }

    /* renamed from: padding-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ Modifier m7264paddingVpY3zN4$default(Modifier modifier, float f, float f7, int i, Object obj) {
        if ((i & 1) != 0) {
            f = C2331Dp.m13305constructorimpl(0);
        }
        if ((i & 2) != 0) {
            f7 = C2331Dp.m13305constructorimpl(0);
        }
        return m7263paddingVpY3zN4(modifier, f, f7);
    }

    @Stable
    @NotNull
    /* renamed from: padding-qDBjuR0, reason: not valid java name */
    public static final Modifier m7265paddingqDBjuR0(@NotNull Modifier modifier, final float f, final float f7, final float f8, final float f9) {
        return modifier.then(new PaddingElement(f, f7, f8, f9, true, new InterfaceC6471c() { // from class: androidx.compose.foundation.layout.PaddingKt.padding.1
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
                inspectorInfo.setName("padding");
                AbstractC0584a.m909j(f8, AbstractC0584a.m909j(f7, AbstractC0584a.m909j(f, inspectorInfo.getProperties(), "start", inspectorInfo), "top", inspectorInfo), "end", inspectorInfo).set("bottom", C2331Dp.m13303boximpl(f9));
            }
        }, null));
    }

    /* renamed from: padding-qDBjuR0$default, reason: not valid java name */
    public static /* synthetic */ Modifier m7266paddingqDBjuR0$default(Modifier modifier, float f, float f7, float f8, float f9, int i, Object obj) {
        if ((i & 1) != 0) {
            f = C2331Dp.m13305constructorimpl(0);
        }
        if ((i & 2) != 0) {
            f7 = C2331Dp.m13305constructorimpl(0);
        }
        if ((i & 4) != 0) {
            f8 = C2331Dp.m13305constructorimpl(0);
        }
        if ((i & 8) != 0) {
            f9 = C2331Dp.m13305constructorimpl(0);
        }
        return m7265paddingqDBjuR0(modifier, f, f7, f8, f9);
    }
}
