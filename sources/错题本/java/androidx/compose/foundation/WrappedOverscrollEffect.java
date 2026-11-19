package androidx.compose.foundation;

import androidx.collection.AbstractC0584a;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.node.DelegatableNode;
import androidx.compose.p011ui.unit.Velocity;
import androidx.compose.runtime.Immutable;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

@Immutable
@Metadata(m5109d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0007J6\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ?\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00112\"\u0010\u0016\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0013H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u00022\b\u0010\u001b\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010!R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010!R\u0014\u0010\u0005\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\"R\u001a\u0010$\u001a\u00020#8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006*"}, m5110d2 = {"Landroidx/compose/foundation/WrappedOverscrollEffect;", "Landroidx/compose/foundation/OverscrollEffect;", "", "attachNode", "eventHandlingEnabled", "innerOverscrollEffect", "<init>", "(ZZLandroidx/compose/foundation/OverscrollEffect;)V", "Landroidx/compose/ui/geometry/Offset;", "delta", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "source", "Lkotlin/Function1;", "performScroll", "applyToScroll-Rhakbz0", "(JILr6/c;)J", "applyToScroll", "Landroidx/compose/ui/unit/Velocity;", "velocity", "Lkotlin/Function2;", "Lh6/c;", "", "performFling", "Ld6/s;", "applyToFling-BMRW4eQ", "(JLr6/e;Lh6/c;)Ljava/lang/Object;", "applyToFling", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Z", "Landroidx/compose/foundation/OverscrollEffect;", "Landroidx/compose/ui/node/DelegatableNode;", "node", "Landroidx/compose/ui/node/DelegatableNode;", "getNode", "()Landroidx/compose/ui/node/DelegatableNode;", "isInProgress", "()Z", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
final class WrappedOverscrollEffect implements OverscrollEffect {
    private final boolean attachNode;
    private final boolean eventHandlingEnabled;

    @NotNull
    private final OverscrollEffect innerOverscrollEffect;

    @NotNull
    private final DelegatableNode node;

    public WrappedOverscrollEffect(boolean z8, boolean z9, @NotNull OverscrollEffect overscrollEffect) {
        this.attachNode = z8;
        this.eventHandlingEnabled = z9;
        this.innerOverscrollEffect = overscrollEffect;
        this.node = z8 ? overscrollEffect.getNode() : new Modifier.Node() { // from class: androidx.compose.foundation.WrappedOverscrollEffect$node$1
        };
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    @Nullable
    /* renamed from: applyToFling-BMRW4eQ */
    public Object mo6732applyToFlingBMRW4eQ(long j7, @NotNull InterfaceC6473e interfaceC6473e, @NotNull InterfaceC5631c<? super C5443s> interfaceC5631c) {
        boolean z8 = this.eventHandlingEnabled;
        C5443s c5443s = C5443s.f8405a;
        if (z8) {
            Object objMo6732applyToFlingBMRW4eQ = this.innerOverscrollEffect.mo6732applyToFlingBMRW4eQ(j7, interfaceC6473e, interfaceC5631c);
            return objMo6732applyToFlingBMRW4eQ == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo6732applyToFlingBMRW4eQ : c5443s;
        }
        Object objInvoke = interfaceC6473e.invoke(Velocity.m13534boximpl(j7), interfaceC5631c);
        return objInvoke == CoroutineSingletons.COROUTINE_SUSPENDED ? objInvoke : c5443s;
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    /* renamed from: applyToScroll-Rhakbz0 */
    public long mo6733applyToScrollRhakbz0(long delta, int source, @NotNull InterfaceC6471c performScroll) {
        return this.eventHandlingEnabled ? this.innerOverscrollEffect.mo6733applyToScrollRhakbz0(delta, source, performScroll) : ((Offset) performScroll.invoke(Offset.m10430boximpl(delta))).m10451unboximpl();
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WrappedOverscrollEffect)) {
            return false;
        }
        WrappedOverscrollEffect wrappedOverscrollEffect = (WrappedOverscrollEffect) other;
        return this.attachNode == wrappedOverscrollEffect.attachNode && this.eventHandlingEnabled == wrappedOverscrollEffect.eventHandlingEnabled && AbstractC5830k.m5325b(this.innerOverscrollEffect, wrappedOverscrollEffect.innerOverscrollEffect);
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    @NotNull
    public DelegatableNode getNode() {
        return this.node;
    }

    public int hashCode() {
        return this.innerOverscrollEffect.hashCode() + AbstractC0584a.m908i(this.eventHandlingEnabled, Boolean.hashCode(this.attachNode) * 31, 31);
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    public boolean isInProgress() {
        return this.innerOverscrollEffect.isInProgress();
    }
}
