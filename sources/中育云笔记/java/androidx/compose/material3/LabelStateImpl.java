package androidx.compose.material3;

import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.foundation.MutatePriority;
import kotlin.jvm.internal.AbstractC9972n;
import p309qc.C10786q;
import vc.InterfaceC11588c;

/* loaded from: classes2.dex */
final class LabelStateImpl implements TooltipState {
    private final boolean isPersistent;
    private final boolean isVisible;
    private final MutableTransitionState<Boolean> transition;

    /* JADX WARN: Illegal instructions before constructor call */
    public LabelStateImpl() {
        boolean z10 = false;
        this(z10, z10, 3, null);
    }

    @Override // androidx.compose.material3.TooltipState
    public void dismiss() {
    }

    @Override // androidx.compose.material3.TooltipState
    public MutableTransitionState<Boolean> getTransition() {
        return this.transition;
    }

    @Override // androidx.compose.material3.TooltipState
    public boolean isPersistent() {
        return this.isPersistent;
    }

    @Override // androidx.compose.material3.TooltipState
    public boolean isVisible() {
        return this.isVisible;
    }

    @Override // androidx.compose.material3.TooltipState
    public void onDispose() {
    }

    @Override // androidx.compose.material3.TooltipState
    public Object show(MutatePriority mutatePriority, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        return C10786q.f26013a;
    }

    public LabelStateImpl(boolean z10, boolean z11) {
        this.isVisible = z10;
        this.isPersistent = z11;
        this.transition = new MutableTransitionState<>(Boolean.FALSE);
    }

    public /* synthetic */ LabelStateImpl(boolean z10, boolean z11, int i10, AbstractC9972n abstractC9972n) {
        this((i10 & 1) != 0 ? true : z10, (i10 & 2) != 0 ? true : z11);
    }
}
