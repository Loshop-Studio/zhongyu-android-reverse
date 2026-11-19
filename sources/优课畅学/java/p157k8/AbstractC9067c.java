package p157k8;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: k8.c */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class AbstractC9067c {
    /* renamed from: a */
    public static /* synthetic */ boolean m15881a(AtomicReferenceArray atomicReferenceArray, int i10, Object obj, Object obj2) {
        while (!atomicReferenceArray.compareAndSet(i10, obj, obj2)) {
            if (atomicReferenceArray.get(i10) != obj) {
                return false;
            }
        }
        return true;
    }
}
