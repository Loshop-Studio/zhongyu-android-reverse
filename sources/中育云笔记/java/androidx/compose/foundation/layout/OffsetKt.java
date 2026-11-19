package androidx.compose.foundation.layout;

import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.platform.InspectorInfo;
import androidx.compose.p014ui.unit.C3186Dp;
import androidx.compose.runtime.Stable;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;

/* loaded from: classes.dex */
public final class OffsetKt {
    public static final Modifier absoluteOffset(Modifier modifier, final InterfaceC9540l interfaceC9540l) {
        return modifier.then(new OffsetPxElement(interfaceC9540l, false, new InterfaceC9540l() { // from class: androidx.compose.foundation.layout.OffsetKt.absoluteOffset.2
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return C10786q.f26013a;
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("absoluteOffset");
                inspectorInfo.getProperties().set("offset", interfaceC9540l);
            }
        }));
    }

    @Stable
    /* renamed from: absoluteOffset-VpY3zN4, reason: not valid java name */
    public static final Modifier m27415absoluteOffsetVpY3zN4(Modifier modifier, final float f10, final float f11) {
        return modifier.then(new OffsetElement(f10, f11, false, new InterfaceC9540l() { // from class: androidx.compose.foundation.layout.OffsetKt.absoluteOffset.1
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
                inspectorInfo.setName("absoluteOffset");
                inspectorInfo.getProperties().set("x", C3186Dp.m33499boximpl(f10));
                inspectorInfo.getProperties().set("y", C3186Dp.m33499boximpl(f11));
            }
        }, null));
    }

    /* renamed from: absoluteOffset-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ Modifier m27416absoluteOffsetVpY3zN4$default(Modifier modifier, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = C3186Dp.m33501constructorimpl(0);
        }
        if ((i10 & 2) != 0) {
            f11 = C3186Dp.m33501constructorimpl(0);
        }
        return m27415absoluteOffsetVpY3zN4(modifier, f10, f11);
    }

    public static final Modifier offset(Modifier modifier, final InterfaceC9540l interfaceC9540l) {
        return modifier.then(new OffsetPxElement(interfaceC9540l, true, new InterfaceC9540l() { // from class: androidx.compose.foundation.layout.OffsetKt.offset.2
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return C10786q.f26013a;
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("offset");
                inspectorInfo.getProperties().set("offset", interfaceC9540l);
            }
        }));
    }

    @Stable
    /* renamed from: offset-VpY3zN4, reason: not valid java name */
    public static final Modifier m27417offsetVpY3zN4(Modifier modifier, final float f10, final float f11) {
        return modifier.then(new OffsetElement(f10, f11, true, new InterfaceC9540l() { // from class: androidx.compose.foundation.layout.OffsetKt.offset.1
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
                inspectorInfo.setName("offset");
                inspectorInfo.getProperties().set("x", C3186Dp.m33499boximpl(f10));
                inspectorInfo.getProperties().set("y", C3186Dp.m33499boximpl(f11));
            }
        }, null));
    }

    /* renamed from: offset-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ Modifier m27418offsetVpY3zN4$default(Modifier modifier, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = C3186Dp.m33501constructorimpl(0);
        }
        if ((i10 & 2) != 0) {
            f11 = C3186Dp.m33501constructorimpl(0);
        }
        return m27417offsetVpY3zN4(modifier, f10, f11);
    }
}
