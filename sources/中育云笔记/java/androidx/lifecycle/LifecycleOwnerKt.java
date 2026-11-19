package androidx.lifecycle;

import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes2.dex */
public final class LifecycleOwnerKt {
    public static final LifecycleCoroutineScope getLifecycleScope(LifecycleOwner lifecycleOwner) {
        AbstractC9979u.m20294g(lifecycleOwner, "<this>");
        return LifecycleKt.getCoroutineScope(lifecycleOwner.getLifecycle());
    }
}
