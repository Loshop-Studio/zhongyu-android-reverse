package androidx.camera.view;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: androidx.camera.view.q */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0949q {
    /* renamed from: a */
    public static /* synthetic */ boolean m807a(AtomicReference atomicReference, Object obj, Object obj2) {
        while (!atomicReference.compareAndSet(obj, obj2)) {
            if (atomicReference.get() != obj) {
                return false;
            }
        }
        return true;
    }
}
