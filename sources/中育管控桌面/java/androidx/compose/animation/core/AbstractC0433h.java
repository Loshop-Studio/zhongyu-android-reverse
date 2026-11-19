package androidx.compose.animation.core;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: androidx.compose.animation.core.h */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0433h {
    /* renamed from: a */
    public static /* synthetic */ boolean m112a(AtomicReference atomicReference, Object obj, Object obj2) {
        while (!atomicReference.compareAndSet(obj, obj2)) {
            if (atomicReference.get() != obj) {
                return false;
            }
        }
        return true;
    }
}
