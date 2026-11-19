package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.coroutines.InterfaceC9945d;
import kotlinx.coroutines.AbstractC10006d;
import kotlinx.coroutines.InterfaceC10045g;
import kotlinx.coroutines.JobKt__JobKt;
import p181hd.InterfaceC9544p;
import sd.AbstractC11117h;
import sd.InterfaceC11122i0;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class LaunchedEffectImpl implements RememberObserver {
    public static final int $stable = 8;
    private InterfaceC10045g job;
    private final InterfaceC11122i0 scope;
    private final InterfaceC9544p task;

    public LaunchedEffectImpl(InterfaceC9945d interfaceC9945d, InterfaceC9544p interfaceC9544p) {
        this.task = interfaceC9544p;
        this.scope = AbstractC10006d.m20744a(interfaceC9945d);
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
        InterfaceC10045g interfaceC10045g = this.job;
        if (interfaceC10045g != null) {
            interfaceC10045g.cancel(new LeftCompositionCancellationException());
        }
        this.job = null;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        InterfaceC10045g interfaceC10045g = this.job;
        if (interfaceC10045g != null) {
            interfaceC10045g.cancel(new LeftCompositionCancellationException());
        }
        this.job = null;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
        InterfaceC10045g interfaceC10045g = this.job;
        if (interfaceC10045g != null) {
            JobKt__JobKt.m20389f(interfaceC10045g, "Old job was still running!", null, 2, null);
        }
        this.job = AbstractC11117h.m24726d(this.scope, null, null, this.task, 3, null);
    }
}
