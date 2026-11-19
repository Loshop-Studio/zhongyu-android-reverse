package androidx.compose.runtime;

import p181hd.InterfaceC9540l;

/* loaded from: classes2.dex */
final class DisposableEffectImpl implements RememberObserver {
    private final InterfaceC9540l effect;
    private DisposableEffectResult onDispose;

    public DisposableEffectImpl(InterfaceC9540l interfaceC9540l) {
        this.effect = interfaceC9540l;
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
