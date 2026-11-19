package androidx.compose.animation.core;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: androidx.compose.animation.core.d */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0369d {
    /* renamed from: a */
    public static /* synthetic */ boolean m147a(AtomicReference atomicReference, Object obj, Object obj2) {
        while (!atomicReference.compareAndSet(obj, obj2)) {
            if (atomicReference.get() != obj) {
                return false;
            }
        }
        return true;
    }
}
