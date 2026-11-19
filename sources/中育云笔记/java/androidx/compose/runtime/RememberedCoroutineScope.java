package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.coroutines.InterfaceC9945d;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import kotlinx.coroutines.InterfaceC10045g;
import p309qc.C10786q;
import sd.AbstractC11147o1;
import sd.InterfaceC11122i0;
import sd.InterfaceC11168v;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class RememberedCoroutineScope implements InterfaceC11122i0, RememberObserver {
    private volatile InterfaceC9945d _coroutineContext;
    private final Object lock = this;
    private final InterfaceC9945d overlayContext;
    private final InterfaceC9945d parentContext;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final InterfaceC9945d CancelledCoroutineContext = new CancelledCoroutineContext();

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        private Companion() {
        }
    }

    public RememberedCoroutineScope(InterfaceC9945d interfaceC9945d, InterfaceC9945d interfaceC9945d2) {
        this.parentContext = interfaceC9945d;
        this.overlayContext = interfaceC9945d2;
    }

    public final void cancelIfCreated() {
        synchronized (this.lock) {
            try {
                InterfaceC9945d interfaceC9945d = this._coroutineContext;
                if (interfaceC9945d == null) {
                    this._coroutineContext = CancelledCoroutineContext;
                } else {
                    AbstractC11147o1.m24769c(interfaceC9945d, new ForgottenCoroutineScopeException());
                }
                C10786q c10786q = C10786q.f26013a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // sd.InterfaceC11122i0
    public InterfaceC9945d getCoroutineContext() {
        InterfaceC9945d interfaceC9945dPlus;
        InterfaceC9945d interfaceC9945d = this._coroutineContext;
        if (interfaceC9945d == null || interfaceC9945d == CancelledCoroutineContext) {
            synchronized (this.lock) {
                try {
                    interfaceC9945dPlus = this._coroutineContext;
                    if (interfaceC9945dPlus == null) {
                        InterfaceC9945d interfaceC9945d2 = this.parentContext;
                        interfaceC9945dPlus = interfaceC9945d2.plus(AbstractC11147o1.m24767a((InterfaceC10045g) interfaceC9945d2.get(InterfaceC10045g.f23976b0))).plus(this.overlayContext);
                    } else if (interfaceC9945dPlus == CancelledCoroutineContext) {
                        InterfaceC9945d interfaceC9945d3 = this.parentContext;
                        InterfaceC11168v interfaceC11168vM24767a = AbstractC11147o1.m24767a((InterfaceC10045g) interfaceC9945d3.get(InterfaceC10045g.f23976b0));
                        interfaceC11168vM24767a.cancel(new ForgottenCoroutineScopeException());
                        interfaceC9945dPlus = interfaceC9945d3.plus(interfaceC11168vM24767a).plus(this.overlayContext);
                    }
                    this._coroutineContext = interfaceC9945dPlus;
                    C10786q c10786q = C10786q.f26013a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            interfaceC9945d = interfaceC9945dPlus;
        }
        AbstractC9979u.m20291d(interfaceC9945d);
        return interfaceC9945d;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
        cancelIfCreated();
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        cancelIfCreated();
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
    }
}
