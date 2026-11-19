package p187w0;

import androidx.core.util.Pools;
import io.reactivex.internal.operators.observable.C5711g;

/* renamed from: w0.g */
/* loaded from: classes2.dex */
public abstract class AbstractC6699g {

    /* renamed from: a */
    public static final C5711g f11310a = new C5711g(10);

    /* renamed from: a */
    public static C6696d m6398a(int i, InterfaceC6695c interfaceC6695c) {
        return new C6696d(new Pools.SynchronizedPool(i), interfaceC6695c, f11310a);
    }
}
