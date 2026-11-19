package p028c5;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: c5.a */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class AbstractC4509a {
    /* renamed from: a */
    public static /* synthetic */ boolean m1601a(AtomicReferenceArray atomicReferenceArray, int i6, Object obj, Object obj2) {
        while (!atomicReferenceArray.compareAndSet(i6, obj, obj2)) {
            if (atomicReferenceArray.get(i6) != obj) {
                return false;
            }
        }
        return true;
    }
}
