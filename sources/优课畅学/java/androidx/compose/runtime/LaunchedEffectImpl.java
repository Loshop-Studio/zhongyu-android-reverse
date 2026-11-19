package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.coroutines.InterfaceC9100d;
import kotlinx.coroutines.AbstractC9165e;
import kotlinx.coroutines.InterfaceC9212n;
import kotlinx.coroutines.JobKt__JobKt;
import p135i8.AbstractC8839h;
import p135i8.InterfaceC8822b0;
import p300x7.InterfaceC10574p;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class LaunchedEffectImpl implements RememberObserver {
    public static final int $stable = 8;
    private InterfaceC9212n job;
    private final InterfaceC8822b0 scope;
    private final InterfaceC10574p task;

    public LaunchedEffectImpl(InterfaceC9100d interfaceC9100d, InterfaceC10574p interfaceC10574p) {
        this.task = interfaceC10574p;
        this.scope = AbstractC9165e.m16552a(interfaceC9100d);
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
        InterfaceC9212n interfaceC9212n = this.job;
        if (interfaceC9212n != null) {
            interfaceC9212n.cancel(new LeftCompositionCancellationException());
        }
        this.job = null;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        InterfaceC9212n interfaceC9212n = this.job;
        if (interfaceC9212n != null) {
            interfaceC9212n.cancel(new LeftCompositionCancellationException());
        }
        this.job = null;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
        InterfaceC9212n interfaceC9212n = this.job;
        if (interfaceC9212n != null) {
            JobKt__JobKt.m16237f(interfaceC9212n, "Old job was still running!", null, 2, null);
        }
        this.job = AbstractC8839h.m14861d(this.scope, null, null, this.task, 3, null);
    }
}
