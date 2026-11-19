package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.coroutines.InterfaceC9100d;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import kotlinx.coroutines.InterfaceC9212n;
import p123h7.C8736p;
import p135i8.AbstractC8823b1;
import p135i8.InterfaceC8822b0;
import p135i8.InterfaceC8878u;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class RememberedCoroutineScope implements InterfaceC8822b0, RememberObserver {
    private volatile InterfaceC9100d _coroutineContext;
    private final Object lock = this;
    private final InterfaceC9100d overlayContext;
    private final InterfaceC9100d parentContext;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final InterfaceC9100d CancelledCoroutineContext = new CancelledCoroutineContext();

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        private Companion() {
        }
    }

    public RememberedCoroutineScope(InterfaceC9100d interfaceC9100d, InterfaceC9100d interfaceC9100d2) {
        this.parentContext = interfaceC9100d;
        this.overlayContext = interfaceC9100d2;
    }

    public final void cancelIfCreated() {
        synchronized (this.lock) {
            try {
                InterfaceC9100d interfaceC9100d = this._coroutineContext;
                if (interfaceC9100d == null) {
                    this._coroutineContext = CancelledCoroutineContext;
                } else {
                    AbstractC8823b1.m14807c(interfaceC9100d, new ForgottenCoroutineScopeException());
                }
                C8736p c8736p = C8736p.f16368a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p135i8.InterfaceC8822b0
    public InterfaceC9100d getCoroutineContext() {
        InterfaceC9100d interfaceC9100dPlus;
        InterfaceC9100d interfaceC9100d = this._coroutineContext;
        if (interfaceC9100d == null || interfaceC9100d == CancelledCoroutineContext) {
            synchronized (this.lock) {
                try {
                    interfaceC9100dPlus = this._coroutineContext;
                    if (interfaceC9100dPlus == null) {
                        InterfaceC9100d interfaceC9100d2 = this.parentContext;
                        interfaceC9100dPlus = interfaceC9100d2.plus(AbstractC8823b1.m14805a((InterfaceC9212n) interfaceC9100d2.get(InterfaceC9212n.f18095c0))).plus(this.overlayContext);
                    } else if (interfaceC9100dPlus == CancelledCoroutineContext) {
                        InterfaceC9100d interfaceC9100d3 = this.parentContext;
                        InterfaceC8878u interfaceC8878uM14805a = AbstractC8823b1.m14805a((InterfaceC9212n) interfaceC9100d3.get(InterfaceC9212n.f18095c0));
                        interfaceC8878uM14805a.cancel(new ForgottenCoroutineScopeException());
                        interfaceC9100dPlus = interfaceC9100d3.plus(interfaceC8878uM14805a).plus(this.overlayContext);
                    }
                    this._coroutineContext = interfaceC9100dPlus;
                    C8736p c8736p = C8736p.f16368a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            interfaceC9100d = interfaceC9100dPlus;
        }
        AbstractC9133u.m16130d(interfaceC9100d);
        return interfaceC9100d;
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
