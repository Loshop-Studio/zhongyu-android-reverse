package androidx.compose.foundation;

import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.node.DelegatableNode;
import androidx.compose.p013ui.unit.Velocity;
import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

@Immutable
/* loaded from: classes.dex */
final class WrappedOverscrollEffect implements OverscrollEffect {
    private final boolean attachNode;
    private final boolean eventHandlingEnabled;
    private final OverscrollEffect innerOverscrollEffect;
    private final DelegatableNode node;

    public WrappedOverscrollEffect(boolean z10, boolean z11, OverscrollEffect overscrollEffect) {
        this.attachNode = z10;
        this.eventHandlingEnabled = z11;
        this.innerOverscrollEffect = overscrollEffect;
        this.node = z10 ? overscrollEffect.getNode() : new Modifier.Node() { // from class: androidx.compose.foundation.WrappedOverscrollEffect$node$1
        };
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    /* renamed from: applyToFling-BMRW4eQ */
    public Object mo20326applyToFlingBMRW4eQ(long j10, InterfaceC10574p interfaceC10574p, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        if (this.eventHandlingEnabled) {
            Object objMo20326applyToFlingBMRW4eQ = this.innerOverscrollEffect.mo20326applyToFlingBMRW4eQ(j10, interfaceC10574p, interfaceC9324c);
            return objMo20326applyToFlingBMRW4eQ == AbstractC9434a.m17291f() ? objMo20326applyToFlingBMRW4eQ : C8736p.f16368a;
        }
        Object objInvoke = interfaceC10574p.invoke(Velocity.m27128boximpl(j10), interfaceC9324c);
        return objInvoke == AbstractC9434a.m17291f() ? objInvoke : C8736p.f16368a;
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    /* renamed from: applyToScroll-Rhakbz0 */
    public long mo20327applyToScrollRhakbz0(long j10, int i10, InterfaceC10570l interfaceC10570l) {
        return this.eventHandlingEnabled ? this.innerOverscrollEffect.mo20327applyToScrollRhakbz0(j10, i10, interfaceC10570l) : ((Offset) interfaceC10570l.invoke(Offset.m24024boximpl(j10))).m24045unboximpl();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WrappedOverscrollEffect)) {
            return false;
        }
        WrappedOverscrollEffect wrappedOverscrollEffect = (WrappedOverscrollEffect) obj;
        return this.attachNode == wrappedOverscrollEffect.attachNode && this.eventHandlingEnabled == wrappedOverscrollEffect.eventHandlingEnabled && AbstractC9133u.m16128b(this.innerOverscrollEffect, wrappedOverscrollEffect.innerOverscrollEffect);
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    public DelegatableNode getNode() {
        return this.node;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.attachNode) * 31) + Boolean.hashCode(this.eventHandlingEnabled)) * 31) + this.innerOverscrollEffect.hashCode();
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    public boolean isInProgress() {
        return this.innerOverscrollEffect.isInProgress();
    }
}
