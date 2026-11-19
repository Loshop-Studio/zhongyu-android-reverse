package androidx.compose.runtime;

import p300x7.InterfaceC10570l;

/* loaded from: classes2.dex */
final class DisposableEffectImpl implements RememberObserver {
    private final InterfaceC10570l effect;
    private DisposableEffectResult onDispose;

    public DisposableEffectImpl(InterfaceC10570l interfaceC10570l) {
        this.effect = interfaceC10570l;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        DisposableEffectResult disposableEffectResult = this.onDispose;
        if (disposableEffectResult != null) {
            disposableEffectResult.dispose();
        }
        this.onDispose = null;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
        this.onDispose = (DisposableEffectResult) this.effect.invoke(EffectsKt.InternalDisposableEffectScope);
    }
}
