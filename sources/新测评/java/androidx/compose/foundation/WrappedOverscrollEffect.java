package androidx.compose.foundation;

import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.node.DelegatableNode;
import androidx.compose.p013ui.unit.Velocity;
import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Immutable
@Metadata(m13557d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0001¢\u0006\u0002\u0010\u0006J?\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\"\u0010\u0011\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0012H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J6\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u001b2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00180\u001dH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u0013\u0010 \u001a\u00020\u00032\b\u0010!\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\"\u001a\u00020#H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006$"}, m13558d2 = {"Landroidx/compose/foundation/WrappedOverscrollEffect;", "Landroidx/compose/foundation/OverscrollEffect;", "attachNode", "", "eventHandlingEnabled", "innerOverscrollEffect", "(ZZLandroidx/compose/foundation/OverscrollEffect;)V", "isInProgress", "()Z", "node", "Landroidx/compose/ui/node/DelegatableNode;", "getNode", "()Landroidx/compose/ui/node/DelegatableNode;", "applyToFling", "", "velocity", "Landroidx/compose/ui/unit/Velocity;", "performFling", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "applyToFling-BMRW4eQ", "(JLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "applyToScroll", "Landroidx/compose/ui/geometry/Offset;", "delta", "source", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "performScroll", "Lkotlin/Function1;", "applyToScroll-Rhakbz0", "(JILkotlin/jvm/functions/Function1;)J", "equals", "other", "hashCode", "", "foundation_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
/* loaded from: classes.dex */
final class WrappedOverscrollEffect implements OverscrollEffect {
    private final boolean attachNode;
    private final boolean eventHandlingEnabled;
    private final OverscrollEffect innerOverscrollEffect;
    private final DelegatableNode node;

    public WrappedOverscrollEffect(boolean z9, boolean z10, OverscrollEffect overscrollEffect) {
        this.attachNode = z9;
        this.eventHandlingEnabled = z10;
        this.innerOverscrollEffect = overscrollEffect;
        this.node = z9 ? overscrollEffect.getNode() : new Modifier.Node() { // from class: androidx.compose.foundation.WrappedOverscrollEffect$node$1
        };
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    /* renamed from: applyToFling-BMRW4eQ */
    public Object mo17168applyToFlingBMRW4eQ(long j10, Function2<? super Velocity, ? super Continuation<? super Velocity>, ? extends Object> function2, Continuation<? super Unit> continuation) {
        if (this.eventHandlingEnabled) {
            Object objMo17168applyToFlingBMRW4eQ = this.innerOverscrollEffect.mo17168applyToFlingBMRW4eQ(j10, function2, continuation);
            return objMo17168applyToFlingBMRW4eQ == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo17168applyToFlingBMRW4eQ : Unit.INSTANCE;
        }
        Object objInvoke = function2.invoke(Velocity.m23790boximpl(j10), continuation);
        return objInvoke == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvoke : Unit.INSTANCE;
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    /* renamed from: applyToScroll-Rhakbz0 */
    public long mo17169applyToScrollRhakbz0(long delta, int source, Function1<? super Offset, Offset> performScroll) {
        return this.eventHandlingEnabled ? this.innerOverscrollEffect.mo17169applyToScrollRhakbz0(delta, source, performScroll) : performScroll.invoke(Offset.m20724boximpl(delta)).m20745unboximpl();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WrappedOverscrollEffect)) {
            return false;
        }
        WrappedOverscrollEffect wrappedOverscrollEffect = (WrappedOverscrollEffect) other;
        return this.attachNode == wrappedOverscrollEffect.attachNode && this.eventHandlingEnabled == wrappedOverscrollEffect.eventHandlingEnabled && Intrinsics.areEqual(this.innerOverscrollEffect, wrappedOverscrollEffect.innerOverscrollEffect);
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
