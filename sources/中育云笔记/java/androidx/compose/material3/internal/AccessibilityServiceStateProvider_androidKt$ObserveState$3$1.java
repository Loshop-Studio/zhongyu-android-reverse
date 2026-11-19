package androidx.compose.material3.internal;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.Lambda;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;

/* loaded from: classes2.dex */
public final class AccessibilityServiceStateProvider_androidKt$ObserveState$3$1 extends Lambda implements InterfaceC9540l {
    final /* synthetic */ InterfaceC9540l $handleEvent;
    final /* synthetic */ LifecycleOwner $lifecycleOwner;
    final /* synthetic */ InterfaceC9529a $onDispose;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccessibilityServiceStateProvider_androidKt$ObserveState$3$1(LifecycleOwner lifecycleOwner, InterfaceC9540l interfaceC9540l, InterfaceC9529a interfaceC9529a) {
        super(1);
        this.$lifecycleOwner = lifecycleOwner;
        this.$handleEvent = interfaceC9540l;
        this.$onDispose = interfaceC9529a;
    }

    @Override // p181hd.InterfaceC9540l
    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
        final InterfaceC9540l interfaceC9540l = this.$handleEvent;
        final LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: androidx.compose.material3.internal.a
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                interfaceC9540l.invoke(event);
            }
        };
        this.$lifecycleOwner.getLifecycle().addObserver(lifecycleEventObserver);
        final InterfaceC9529a interfaceC9529a = this.$onDispose;
        final LifecycleOwner lifecycleOwner = this.$lifecycleOwner;
        return new DisposableEffectResult() { // from class: androidx.compose.material3.internal.AccessibilityServiceStateProvider_androidKt$ObserveState$3$1$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                interfaceC9529a.invoke();
                lifecycleOwner.getLifecycle().removeObserver(lifecycleEventObserver);
            }
        };
    }
}
