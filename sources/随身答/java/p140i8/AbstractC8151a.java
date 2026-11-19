package p140i8;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: i8.a */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class AbstractC8151a {
    /* renamed from: a */
    public static /* synthetic */ boolean m13080a(AtomicReferenceArray atomicReferenceArray, int i9, Object obj, Object obj2) {
        while (!atomicReferenceArray.compareAndSet(i9, obj, obj2)) {
            if (atomicReferenceArray.get(i9) != obj) {
                return false;
            }
        }
        return true;
    }
}
