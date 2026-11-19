package kotlinx.coroutines.flow;

import kotlin.jvm.internal.AbstractC5830k;
import kotlinx.coroutines.C5961g;
import kotlinx.coroutines.InterfaceC5962g0;

/* renamed from: kotlinx.coroutines.flow.d0 */
/* loaded from: classes4.dex */
public final class C5907d0 implements InterfaceC5962g0 {

    /* renamed from: a */
    public final C5911f0 f9357a;

    /* renamed from: b */
    public final long f9358b;

    /* renamed from: c */
    public final Object f9359c;

    /* renamed from: d */
    public final C5961g f9360d;

    public C5907d0(C5911f0 c5911f0, long j7, Object obj, C5961g c5961g) {
        this.f9357a = c5911f0;
        this.f9358b = j7;
        this.f9359c = obj;
        this.f9360d = c5961g;
    }

    @Override // kotlinx.coroutines.InterfaceC5962g0
    public final void dispose() {
        C5911f0 c5911f0 = this.f9357a;
        synchronized (c5911f0) {
            if (this.f9358b < c5911f0.m5536o()) {
                return;
            }
            Object[] objArr = c5911f0.f9367h;
            AbstractC5830k.m5327d(objArr);
            long j7 = this.f9358b;
            if (objArr[((int) j7) & (objArr.length - 1)] != this) {
                return;
            }
            AbstractC5914h.m5549e(objArr, j7, AbstractC5914h.f9375b);
            c5911f0.m5532j();
        }
    }
}
