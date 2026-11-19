package p147rx.internal.util.unsafe;

import sun.misc.Unsafe;

/* renamed from: rx.internal.util.unsafe.a */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3293a {
    /* renamed from: a */
    public static /* synthetic */ boolean m10182a(Unsafe unsafe, Object obj, long j4, Object obj2, Object obj3) {
        while (!unsafe.compareAndSwapObject(obj, j4, obj2, obj3)) {
            if (unsafe.getObject(obj, j4) != obj2) {
                return false;
            }
        }
        return true;
    }
}
