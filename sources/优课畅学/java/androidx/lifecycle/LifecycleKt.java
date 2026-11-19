package androidx.lifecycle;

import kotlin.jvm.internal.AbstractC9133u;
import p135i8.AbstractC8874s1;
import p135i8.C8843i0;
import p169l8.AbstractC9268e;
import p169l8.InterfaceC9266c;

/* loaded from: classes3.dex */
public final class LifecycleKt {
    public static final LifecycleCoroutineScope getCoroutineScope(Lifecycle lifecycle) {
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl;
        AbstractC9133u.m16133g(lifecycle, "<this>");
        do {
            LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl2 = (LifecycleCoroutineScopeImpl) lifecycle.getInternalScopeRef().get();
            if (lifecycleCoroutineScopeImpl2 != null) {
                return lifecycleCoroutineScopeImpl2;
            }
            lifecycleCoroutineScopeImpl = new LifecycleCoroutineScopeImpl(lifecycle, AbstractC8874s1.m14910b(null, 1, null).plus(C8843i0.m14868c().mo15693o()));
        } while (!lifecycle.getInternalScopeRef().compareAndSet(null, lifecycleCoroutineScopeImpl));
        lifecycleCoroutineScopeImpl.register();
        return lifecycleCoroutineScopeImpl;
    }

    public static final InterfaceC9266c getEventFlow(Lifecycle lifecycle) {
        AbstractC9133u.m16133g(lifecycle, "<this>");
        return AbstractC9268e.m16994F(AbstractC9268e.m17015e(new LifecycleKt$eventFlow$1(lifecycle, null)), C8843i0.m14868c().mo15693o());
    }
}
