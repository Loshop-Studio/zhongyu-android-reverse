package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import p181hd.InterfaceC9529a;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class DisposableEffectScope {
    public static final int $stable = 0;

    public final DisposableEffectResult onDispose(final InterfaceC9529a interfaceC9529a) {
        return new DisposableEffectResult() { // from class: androidx.compose.runtime.DisposableEffectScope.onDispose.1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                interfaceC9529a.invoke();
            }
        };
    }
}
