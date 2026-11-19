package androidx.lifecycle.viewmodel.internal;

import kotlin.NotImplementedError;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.InterfaceC9945d;
import kotlin.jvm.internal.AbstractC9979u;
import sd.AbstractC11108e2;
import sd.C11157r0;
import sd.InterfaceC11122i0;

/* loaded from: classes2.dex */
public final class CloseableCoroutineScopeKt {
    public static final String VIEW_MODEL_SCOPE_KEY = "androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY";

    public static final CloseableCoroutineScope asCloseable(InterfaceC11122i0 interfaceC11122i0) {
        AbstractC9979u.m20294g(interfaceC11122i0, "<this>");
        return new CloseableCoroutineScope(interfaceC11122i0);
    }

    public static final CloseableCoroutineScope createViewModelScope() {
        InterfaceC9945d interfaceC9945dMo24804i;
        try {
            interfaceC9945dMo24804i = C11157r0.m24800c().mo24804i();
        } catch (IllegalStateException unused) {
            interfaceC9945dMo24804i = EmptyCoroutineContext.f23351c;
        } catch (NotImplementedError unused2) {
            interfaceC9945dMo24804i = EmptyCoroutineContext.f23351c;
        }
        return new CloseableCoroutineScope(interfaceC9945dMo24804i.plus(AbstractC11108e2.m24701b(null, 1, null)));
    }
}
