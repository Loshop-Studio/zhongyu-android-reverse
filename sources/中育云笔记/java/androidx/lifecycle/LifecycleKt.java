package androidx.lifecycle;

import kotlin.jvm.internal.AbstractC9979u;
import p379vd.AbstractC11596e;
import p379vd.InterfaceC11594c;
import sd.AbstractC11108e2;
import sd.C11157r0;

/* loaded from: classes2.dex */
public final class LifecycleKt {
    public static final LifecycleCoroutineScope getCoroutineScope(Lifecycle lifecycle) {
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl;
        AbstractC9979u.m20294g(lifecycle, "<this>");
        do {
            LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl2 = (LifecycleCoroutineScopeImpl) lifecycle.getInternalScopeRef().get();
            if (lifecycleCoroutineScopeImpl2 != null) {
                return lifecycleCoroutineScopeImpl2;
            }
            lifecycleCoroutineScopeImpl = new LifecycleCoroutineScopeImpl(lifecycle, AbstractC11108e2.m24701b(null, 1, null).plus(C11157r0.m24800c().mo25209k()));
        } while (!lifecycle.getInternalScopeRef().compareAndSet(null, lifecycleCoroutineScopeImpl));
        lifecycleCoroutineScopeImpl.register();
        return lifecycleCoroutineScopeImpl;
    }

    public static final InterfaceC11594c getEventFlow(Lifecycle lifecycle) {
        AbstractC9979u.m20294g(lifecycle, "<this>");
        return AbstractC11596e.m25534E(AbstractC11596e.m25555e(new LifecycleKt$eventFlow$1(lifecycle, null)), C11157r0.m24800c().mo25209k());
    }
}
