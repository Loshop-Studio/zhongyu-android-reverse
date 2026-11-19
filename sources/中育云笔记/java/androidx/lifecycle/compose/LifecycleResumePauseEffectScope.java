package androidx.lifecycle.compose;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import p181hd.InterfaceC9540l;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class LifecycleResumePauseEffectScope implements LifecycleOwner {
    public static final int $stable = 8;
    private final Lifecycle lifecycle;

    public LifecycleResumePauseEffectScope(Lifecycle lifecycle) {
        this.lifecycle = lifecycle;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        return this.lifecycle;
    }

    public final LifecyclePauseOrDisposeEffectResult onPauseOrDispose(final InterfaceC9540l interfaceC9540l) {
        return new LifecyclePauseOrDisposeEffectResult() { // from class: androidx.lifecycle.compose.LifecycleResumePauseEffectScope.onPauseOrDispose.1
            @Override // androidx.lifecycle.compose.LifecyclePauseOrDisposeEffectResult
            public void runPauseOrOnDisposeEffect() {
                interfaceC9540l.invoke(this);
            }
        };
    }
}
