package p365ud;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: ud.f */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC11391f {
    /* renamed from: a */
    public static /* synthetic */ boolean m25342a(AtomicReferenceArray atomicReferenceArray, int i10, Object obj, Object obj2) {
        while (!atomicReferenceArray.compareAndSet(i10, obj, obj2)) {
            if (atomicReferenceArray.get(i10) != obj) {
                return false;
            }
        }
        return true;
    }
}
