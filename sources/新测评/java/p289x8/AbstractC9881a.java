package p289x8;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: x8.a */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class AbstractC9881a {
    /* renamed from: a */
    public static /* synthetic */ boolean m16590a(AtomicReferenceArray atomicReferenceArray, int i10, Object obj, Object obj2) {
        while (!atomicReferenceArray.compareAndSet(i10, obj, obj2)) {
            if (atomicReferenceArray.get(i10) != obj) {
                return false;
            }
        }
        return true;
    }
}
