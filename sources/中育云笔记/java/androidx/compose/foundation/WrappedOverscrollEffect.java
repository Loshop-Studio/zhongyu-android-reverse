package androidx.compose.foundation;

import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.geometry.Offset;
import androidx.compose.p014ui.node.DelegatableNode;
import androidx.compose.p014ui.unit.Velocity;
import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import vc.InterfaceC11588c;

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
    public Object mo26928applyToFlingBMRW4eQ(long j10, InterfaceC9544p interfaceC9544p, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        if (this.eventHandlingEnabled) {
            Object objMo26928applyToFlingBMRW4eQ = this.innerOverscrollEffect.mo26928applyToFlingBMRW4eQ(j10, interfaceC9544p, interfaceC11588c);
            return objMo26928applyToFlingBMRW4eQ == AbstractC11725a.m25952f() ? objMo26928applyToFlingBMRW4eQ : C10786q.f26013a;
        }
        Object objInvoke = interfaceC9544p.invoke(Velocity.m33730boximpl(j10), interfaceC11588c);
        return objInvoke == AbstractC11725a.m25952f() ? objInvoke : C10786q.f26013a;
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    /* renamed from: applyToScroll-Rhakbz0 */
    public long mo26929applyToScrollRhakbz0(long j10, int i10, InterfaceC9540l interfaceC9540l) {
        return this.eventHandlingEnabled ? this.innerOverscrollEffect.mo26929applyToScrollRhakbz0(j10, i10, interfaceC9540l) : ((Offset) interfaceC9540l.invoke(Offset.m30626boximpl(j10))).m30647unboximpl();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WrappedOverscrollEffect)) {
            return false;
        }
        WrappedOverscrollEffect wrappedOverscrollEffect = (WrappedOverscrollEffect) obj;
        return this.attachNode == wrappedOverscrollEffect.attachNode && this.eventHandlingEnabled == wrappedOverscrollEffect.eventHandlingEnabled && AbstractC9979u.m20289b(this.innerOverscrollEffect, wrappedOverscrollEffect.innerOverscrollEffect);
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
