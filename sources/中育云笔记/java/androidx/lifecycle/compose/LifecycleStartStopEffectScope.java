package androidx.lifecycle.compose;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import p181hd.InterfaceC9540l;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class LifecycleStartStopEffectScope implements LifecycleOwner {
    public static final int $stable = 8;
    private final Lifecycle lifecycle;

    public LifecycleStartStopEffectScope(Lifecycle lifecycle) {
        this.lifecycle = lifecycle;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        return this.lifecycle;
    }

    public final LifecycleStopOrDisposeEffectResult onStopOrDispose(final InterfaceC9540l interfaceC9540l) {
        return new LifecycleStopOrDisposeEffectResult() { // from class: androidx.lifecycle.compose.LifecycleStartStopEffectScope.onStopOrDispose.1
            @Override // androidx.lifecycle.compose.LifecycleStopOrDisposeEffectResult
            public void runStopOrDisposeEffect() {
                interfaceC9540l.invoke(this);
            }
        };
    }
}
