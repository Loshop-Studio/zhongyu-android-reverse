package androidx.compose.foundation.layout;

import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.platform.InspectorInfo;
import androidx.compose.p013ui.unit.C3156Dp;
import androidx.compose.runtime.Stable;
import p123h7.C8736p;
import p300x7.InterfaceC10570l;

/* loaded from: classes.dex */
public final class OffsetKt {
    public static final Modifier absoluteOffset(Modifier modifier, final InterfaceC10570l interfaceC10570l) {
        return modifier.then(new OffsetPxElement(interfaceC10570l, false, new InterfaceC10570l() { // from class: androidx.compose.foundation.layout.OffsetKt.absoluteOffset.2
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return C8736p.f16368a;
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("absoluteOffset");
                inspectorInfo.getProperties().set("offset", interfaceC10570l);
            }
        }));
    }

    @Stable
    /* renamed from: absoluteOffset-VpY3zN4, reason: not valid java name */
    public static final Modifier m20813absoluteOffsetVpY3zN4(Modifier modifier, final float f10, final float f11) {
        return modifier.then(new OffsetElement(f10, f11, false, new InterfaceC10570l() { // from class: androidx.compose.foundation.layout.OffsetKt.absoluteOffset.1
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
                inspectorInfo.setName("absoluteOffset");
                inspectorInfo.getProperties().set("x", C3156Dp.m26897boximpl(f10));
                inspectorInfo.getProperties().set("y", C3156Dp.m26897boximpl(f11));
            }
        }, null));
    }

    /* renamed from: absoluteOffset-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ Modifier m20814absoluteOffsetVpY3zN4$default(Modifier modifier, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = C3156Dp.m26899constructorimpl(0);
        }
        if ((i10 & 2) != 0) {
            f11 = C3156Dp.m26899constructorimpl(0);
        }
        return m20813absoluteOffsetVpY3zN4(modifier, f10, f11);
    }

    public static final Modifier offset(Modifier modifier, final InterfaceC10570l interfaceC10570l) {
        return modifier.then(new OffsetPxElement(interfaceC10570l, true, new InterfaceC10570l() { // from class: androidx.compose.foundation.layout.OffsetKt.offset.2
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return C8736p.f16368a;
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("offset");
                inspectorInfo.getProperties().set("offset", interfaceC10570l);
            }
        }));
    }

    @Stable
    /* renamed from: offset-VpY3zN4, reason: not valid java name */
    public static final Modifier m20815offsetVpY3zN4(Modifier modifier, final float f10, final float f11) {
        return modifier.then(new OffsetElement(f10, f11, true, new InterfaceC10570l() { // from class: androidx.compose.foundation.layout.OffsetKt.offset.1
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
                inspectorInfo.setName("offset");
                inspectorInfo.getProperties().set("x", C3156Dp.m26897boximpl(f10));
                inspectorInfo.getProperties().set("y", C3156Dp.m26897boximpl(f11));
            }
        }, null));
    }

    /* renamed from: offset-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ Modifier m20816offsetVpY3zN4$default(Modifier modifier, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = C3156Dp.m26899constructorimpl(0);
        }
        if ((i10 & 2) != 0) {
            f11 = C3156Dp.m26899constructorimpl(0);
        }
        return m20815offsetVpY3zN4(modifier, f10, f11);
    }
}
