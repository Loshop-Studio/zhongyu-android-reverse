package androidx.concurrent.futures;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: androidx.concurrent.futures.a */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC3223a {
    /* renamed from: a */
    public static /* synthetic */ boolean m1395a(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Object obj, Object obj2, Object obj3) {
        while (!atomicReferenceFieldUpdater.compareAndSet(obj, obj2, obj3)) {
            if (atomicReferenceFieldUpdater.get(obj) != obj2) {
                return false;
            }
        }
        return true;
    }
}
