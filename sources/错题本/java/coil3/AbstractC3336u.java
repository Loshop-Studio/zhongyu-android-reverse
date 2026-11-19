package coil3;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.AbstractC5830k;
import p129o2.C6268a;

/* renamed from: coil3.u */
/* loaded from: classes2.dex */
public abstract class AbstractC3336u {

    /* renamed from: a */
    public static final /* synthetic */ AtomicReference f2067a = new AtomicReference(null);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [coil3.n] */
    /* renamed from: a */
    public static final InterfaceC3308n m2283a(Context context) {
        C3333r c3333r;
        AtomicReference atomicReference = f2067a;
        Object obj = atomicReference.get();
        C3333r c3333rM2290a = null;
        InterfaceC3308n interfaceC3308n = obj instanceof InterfaceC3308n ? (InterfaceC3308n) obj : null;
        if (interfaceC3308n != null) {
            return interfaceC3308n;
        }
        while (true) {
            Object obj2 = atomicReference.get();
            if (obj2 instanceof InterfaceC3308n) {
                c3333r = c3333rM2290a;
                c3333rM2290a = (InterfaceC3308n) obj2;
            } else {
                if (c3333rM2290a == null) {
                    if (obj2 instanceof AbstractC3349v) {
                    }
                    context.getApplicationContext();
                    C6268a c6268a = AbstractC3350w.f2085a;
                    c3333rM2290a = AbstractC3349v.m2290a(context);
                }
                c3333r = c3333rM2290a;
            }
            while (!atomicReference.compareAndSet(obj2, c3333rM2290a)) {
                if (atomicReference.get() != obj2) {
                    break;
                }
            }
            AbstractC5830k.m5328e(c3333rM2290a, "null cannot be cast to non-null type coil3.ImageLoader");
            return c3333rM2290a;
            c3333rM2290a = c3333r;
        }
    }
}
