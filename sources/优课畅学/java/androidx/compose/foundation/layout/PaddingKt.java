package androidx.compose.foundation.layout;

import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.platform.InspectorInfo;
import androidx.compose.p013ui.unit.C3156Dp;
import androidx.compose.p013ui.unit.LayoutDirection;
import androidx.compose.runtime.Stable;
import p123h7.C8736p;
import p300x7.InterfaceC10570l;

/* loaded from: classes.dex */
public final class PaddingKt {
    @Stable
    /* renamed from: PaddingValues-0680j_4, reason: not valid java name */
    public static final PaddingValues m20849PaddingValues0680j_4(float f10) {
        return new PaddingValuesImpl(f10, f10, f10, f10, null);
    }

    @Stable
    /* renamed from: PaddingValues-YgX7TsA, reason: not valid java name */
    public static final PaddingValues m20850PaddingValuesYgX7TsA(float f10, float f11) {
        return new PaddingValuesImpl(f10, f11, f10, f11, null);
    }

    /* renamed from: PaddingValues-YgX7TsA$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m20851PaddingValuesYgX7TsA$default(float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = C3156Dp.m26899constructorimpl(0);
        }
        if ((i10 & 2) != 0) {
            f11 = C3156Dp.m26899constructorimpl(0);
        }
        return m20850PaddingValuesYgX7TsA(f10, f11);
    }

    @Stable
    /* renamed from: PaddingValues-a9UjIt4, reason: not valid java name */
    public static final PaddingValues m20852PaddingValuesa9UjIt4(float f10, float f11, float f12, float f13) {
        return new PaddingValuesImpl(f10, f11, f12, f13, null);
    }

    /* renamed from: PaddingValues-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m20853PaddingValuesa9UjIt4$default(float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = C3156Dp.m26899constructorimpl(0);
        }
        if ((i10 & 2) != 0) {
            f11 = C3156Dp.m26899constructorimpl(0);
        }
        if ((i10 & 4) != 0) {
            f12 = C3156Dp.m26899constructorimpl(0);
        }
        if ((i10 & 8) != 0) {
            f13 = C3156Dp.m26899constructorimpl(0);
        }
        return m20852PaddingValuesa9UjIt4(f10, f11, f12, f13);
    }

    @Stable
    /* renamed from: absolutePadding-qDBjuR0, reason: not valid java name */
    public static final Modifier m20854absolutePaddingqDBjuR0(Modifier modifier, final float f10, final float f11, final float f12, final float f13) {
        return modifier.then(new PaddingElement(f10, f11, f12, f13, false, new InterfaceC10570l() { // from class: androidx.compose.foundation.layout.PaddingKt$absolutePadding$1
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
                inspectorInfo.setName("absolutePadding");
                inspectorInfo.getProperties().set("left", C3156Dp.m26897boximpl(f10));
                inspectorInfo.getProperties().set("top", C3156Dp.m26897boximpl(f11));
                inspectorInfo.getProperties().set("right", C3156Dp.m26897boximpl(f12));
                inspectorInfo.getProperties().set("bottom", C3156Dp.m26897boximpl(f13));
            }
        }, null));
    }

    /* renamed from: absolutePadding-qDBjuR0$default, reason: not valid java name */
    public static /* synthetic */ Modifier m20855absolutePaddingqDBjuR0$default(Modifier modifier, float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = C3156Dp.m26899constructorimpl(0);
        }
        if ((i10 & 2) != 0) {
            f11 = C3156Dp.m26899constructorimpl(0);
        }
        if ((i10 & 4) != 0) {
            f12 = C3156Dp.m26899constructorimpl(0);
        }
        if ((i10 & 8) != 0) {
            f13 = C3156Dp.m26899constructorimpl(0);
        }
        return m20854absolutePaddingqDBjuR0(modifier, f10, f11, f12, f13);
    }

    @Stable
    public static final float calculateEndPadding(PaddingValues paddingValues, LayoutDirection layoutDirection) {
        return layoutDirection == LayoutDirection.Ltr ? paddingValues.mo20807calculateRightPaddingu2uoSUM(layoutDirection) : paddingValues.mo20806calculateLeftPaddingu2uoSUM(layoutDirection);
    }

    @Stable
    public static final float calculateStartPadding(PaddingValues paddingValues, LayoutDirection layoutDirection) {
        return layoutDirection == LayoutDirection.Ltr ? paddingValues.mo20806calculateLeftPaddingu2uoSUM(layoutDirection) : paddingValues.mo20807calculateRightPaddingu2uoSUM(layoutDirection);
    }

    @Stable
    public static final Modifier padding(Modifier modifier, final PaddingValues paddingValues) {
        return modifier.then(new PaddingValuesElement(paddingValues, new InterfaceC10570l() { // from class: androidx.compose.foundation.layout.PaddingKt.padding.4
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return C8736p.f16368a;
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("padding");
                inspectorInfo.getProperties().set("paddingValues", paddingValues);
            }
        }));
    }

    @Stable
    /* renamed from: padding-3ABfNKs, reason: not valid java name */
    public static final Modifier m20856padding3ABfNKs(Modifier modifier, final float f10) {
        return modifier.then(new PaddingElement(f10, f10, f10, f10, true, new InterfaceC10570l() { // from class: androidx.compose.foundation.layout.PaddingKt.padding.3
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
                inspectorInfo.setName("padding");
                inspectorInfo.setValue(C3156Dp.m26897boximpl(f10));
            }
        }, null));
    }

    @Stable
    /* renamed from: padding-VpY3zN4, reason: not valid java name */
    public static final Modifier m20857paddingVpY3zN4(Modifier modifier, final float f10, final float f11) {
        return modifier.then(new PaddingElement(f10, f11, f10, f11, true, new InterfaceC10570l() { // from class: androidx.compose.foundation.layout.PaddingKt.padding.2
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
                inspectorInfo.setName("padding");
                inspectorInfo.getProperties().set("horizontal", C3156Dp.m26897boximpl(f10));
                inspectorInfo.getProperties().set("vertical", C3156Dp.m26897boximpl(f11));
            }
        }, null));
    }

    /* renamed from: padding-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ Modifier m20858paddingVpY3zN4$default(Modifier modifier, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = C3156Dp.m26899constructorimpl(0);
        }
        if ((i10 & 2) != 0) {
            f11 = C3156Dp.m26899constructorimpl(0);
        }
        return m20857paddingVpY3zN4(modifier, f10, f11);
    }

    @Stable
    /* renamed from: padding-qDBjuR0, reason: not valid java name */
    public static final Modifier m20859paddingqDBjuR0(Modifier modifier, final float f10, final float f11, final float f12, final float f13) {
        return modifier.then(new PaddingElement(f10, f11, f12, f13, true, new InterfaceC10570l() { // from class: androidx.compose.foundation.layout.PaddingKt.padding.1
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
                inspectorInfo.setName("padding");
                inspectorInfo.getProperties().set("start", C3156Dp.m26897boximpl(f10));
                inspectorInfo.getProperties().set("top", C3156Dp.m26897boximpl(f11));
                inspectorInfo.getProperties().set("end", C3156Dp.m26897boximpl(f12));
                inspectorInfo.getProperties().set("bottom", C3156Dp.m26897boximpl(f13));
            }
        }, null));
    }

    /* renamed from: padding-qDBjuR0$default, reason: not valid java name */
    public static /* synthetic */ Modifier m20860paddingqDBjuR0$default(Modifier modifier, float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = C3156Dp.m26899constructorimpl(0);
        }
        if ((i10 & 2) != 0) {
            f11 = C3156Dp.m26899constructorimpl(0);
        }
        if ((i10 & 4) != 0) {
            f12 = C3156Dp.m26899constructorimpl(0);
        }
        if ((i10 & 8) != 0) {
            f13 = C3156Dp.m26899constructorimpl(0);
        }
        return m20859paddingqDBjuR0(modifier, f10, f11, f12, f13);
    }
}
