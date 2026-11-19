package androidx.lifecycle;

import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes3.dex */
public final class LifecycleOwnerKt {
    public static final LifecycleCoroutineScope getLifecycleScope(LifecycleOwner lifecycleOwner) {
        AbstractC9133u.m16133g(lifecycleOwner, "<this>");
        return LifecycleKt.getCoroutineScope(lifecycleOwner.getLifecycle());
    }
}
