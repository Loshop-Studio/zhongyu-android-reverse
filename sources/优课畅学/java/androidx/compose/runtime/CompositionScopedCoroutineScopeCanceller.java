package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlinx.coroutines.AbstractC9165e;
import p135i8.InterfaceC8822b0;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class CompositionScopedCoroutineScopeCanceller implements RememberObserver {
    public static final int $stable = 8;
    private final InterfaceC8822b0 coroutineScope;

    public CompositionScopedCoroutineScopeCanceller(InterfaceC8822b0 interfaceC8822b0) {
        this.coroutineScope = interfaceC8822b0;
    }

    public final InterfaceC8822b0 getCoroutineScope() {
        return this.coroutineScope;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
        InterfaceC8822b0 interfaceC8822b0 = this.coroutineScope;
        if (interfaceC8822b0 instanceof RememberedCoroutineScope) {
            ((RememberedCoroutineScope) interfaceC8822b0).cancelIfCreated();
        } else {
            AbstractC9165e.m16554c(interfaceC8822b0, new LeftCompositionCancellationException());
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        InterfaceC8822b0 interfaceC8822b0 = this.coroutineScope;
        if (interfaceC8822b0 instanceof RememberedCoroutineScope) {
            ((RememberedCoroutineScope) interfaceC8822b0).cancelIfCreated();
        } else {
            AbstractC9165e.m16554c(interfaceC8822b0, new LeftCompositionCancellationException());
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
    }
}
