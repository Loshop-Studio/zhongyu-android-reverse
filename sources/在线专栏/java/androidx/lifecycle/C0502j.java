package androidx.lifecycle;

import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;
import p087f3.C2555g2;
import p087f3.C2605v0;

/* renamed from: androidx.lifecycle.j */
/* loaded from: classes.dex */
public final class C0502j {
    @NotNull
    /* renamed from: a */
    public static final AbstractC0498g m2879a(@NotNull AbstractC0496f coroutineScope) {
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl;
        C2769l.m9241e(coroutineScope, "$this$coroutineScope");
        do {
            LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl2 = (LifecycleCoroutineScopeImpl) coroutineScope.f3417a.get();
            if (lifecycleCoroutineScopeImpl2 != null) {
                return lifecycleCoroutineScopeImpl2;
            }
            lifecycleCoroutineScopeImpl = new LifecycleCoroutineScopeImpl(coroutineScope, C2555g2.m8565b(null, 1, null).plus(C2605v0.m8752c().mo8757L()));
        } while (!coroutineScope.f3417a.compareAndSet(null, lifecycleCoroutineScopeImpl));
        lifecycleCoroutineScopeImpl.m2811l();
        return lifecycleCoroutineScopeImpl;
    }
}
