package kotlinx.coroutines.debug.internal;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: kotlinx.coroutines.debug.internal.a */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC4194a {
    /* renamed from: a */
    public static /* synthetic */ boolean m5327a(AtomicReferenceArray atomicReferenceArray, int i4, Object obj, Object obj2) {
        while (!atomicReferenceArray.compareAndSet(i4, obj, obj2)) {
            if (atomicReferenceArray.get(i4) != obj) {
                return false;
            }
        }
        return true;
    }
}
