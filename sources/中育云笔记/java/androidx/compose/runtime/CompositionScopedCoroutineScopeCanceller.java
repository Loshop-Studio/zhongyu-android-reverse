package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlinx.coroutines.AbstractC10006d;
import sd.InterfaceC11122i0;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class CompositionScopedCoroutineScopeCanceller implements RememberObserver {
    public static final int $stable = 8;
    private final InterfaceC11122i0 coroutineScope;

    public CompositionScopedCoroutineScopeCanceller(InterfaceC11122i0 interfaceC11122i0) {
        this.coroutineScope = interfaceC11122i0;
    }

    public final InterfaceC11122i0 getCoroutineScope() {
        return this.coroutineScope;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
        InterfaceC11122i0 interfaceC11122i0 = this.coroutineScope;
        if (interfaceC11122i0 instanceof RememberedCoroutineScope) {
            ((RememberedCoroutineScope) interfaceC11122i0).cancelIfCreated();
        } else {
            AbstractC10006d.m20746c(interfaceC11122i0, new LeftCompositionCancellationException());
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        InterfaceC11122i0 interfaceC11122i0 = this.coroutineScope;
        if (interfaceC11122i0 instanceof RememberedCoroutineScope) {
            ((RememberedCoroutineScope) interfaceC11122i0).cancelIfCreated();
        } else {
            AbstractC10006d.m20746c(interfaceC11122i0, new LeftCompositionCancellationException());
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
    }
}
