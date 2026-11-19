package androidx.lifecycle.viewmodel.internal;

import kotlin.NotImplementedError;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.InterfaceC9100d;
import kotlin.jvm.internal.AbstractC9133u;
import p135i8.AbstractC8874s1;
import p135i8.C8843i0;
import p135i8.InterfaceC8822b0;

/* loaded from: classes3.dex */
public final class CloseableCoroutineScopeKt {
    public static final String VIEW_MODEL_SCOPE_KEY = "androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY";

    public static final CloseableCoroutineScope asCloseable(InterfaceC8822b0 interfaceC8822b0) {
        AbstractC9133u.m16133g(interfaceC8822b0, "<this>");
        return new CloseableCoroutineScope(interfaceC8822b0);
    }

    public static final CloseableCoroutineScope createViewModelScope() {
        InterfaceC9100d interfaceC9100dMo14863i;
        try {
            interfaceC9100dMo14863i = C8843i0.m14868c().mo14863i();
        } catch (IllegalStateException unused) {
            interfaceC9100dMo14863i = EmptyCoroutineContext.f17438a;
        } catch (NotImplementedError unused2) {
            interfaceC9100dMo14863i = EmptyCoroutineContext.f17438a;
        }
        return new CloseableCoroutineScope(interfaceC9100dMo14863i.plus(AbstractC8874s1.m14910b(null, 1, null)));
    }
}
