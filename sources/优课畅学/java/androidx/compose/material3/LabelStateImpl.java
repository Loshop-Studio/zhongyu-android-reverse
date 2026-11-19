package androidx.compose.material3;

import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.foundation.MutatePriority;
import kotlin.jvm.internal.AbstractC9126n;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;

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
    public Object show(MutatePriority mutatePriority, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        return C8736p.f16368a;
    }

    public LabelStateImpl(boolean z10, boolean z11) {
        this.isVisible = z10;
        this.isPersistent = z11;
        this.transition = new MutableTransitionState<>(Boolean.FALSE);
    }

    public /* synthetic */ LabelStateImpl(boolean z10, boolean z11, int i10, AbstractC9126n abstractC9126n) {
        this((i10 & 1) != 0 ? true : z10, (i10 & 2) != 0 ? true : z11);
    }
}
