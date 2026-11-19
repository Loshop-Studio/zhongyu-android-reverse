package p087f3;

import kotlinx.coroutines.internal.C2804s;
import kotlinx.coroutines.internal.C2809x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p128o2.C2925r;
import p142q2.InterfaceC3012d;
import p142q2.InterfaceC3015g;

/* renamed from: f3.k2 */
/* loaded from: classes.dex */
public final class C2571k2<T> extends C2804s<T> {

    /* renamed from: d */
    @Nullable
    private InterfaceC3015g f10257d;

    /* renamed from: e */
    @Nullable
    private Object f10258e;

    /* JADX WARN: Illegal instructions before constructor call */
    public C2571k2(@NotNull InterfaceC3015g interfaceC3015g, @NotNull InterfaceC3012d<? super T> interfaceC3012d) {
        C2575l2 c2575l2 = C2575l2.f10260a;
        super(interfaceC3015g.get(c2575l2) == null ? interfaceC3015g.plus(c2575l2) : interfaceC3015g, interfaceC3012d);
    }

    @Override // kotlinx.coroutines.internal.C2804s, p087f3.AbstractC2528a
    /* renamed from: t0 */
    protected void mo8498t0(@Nullable Object obj) {
        InterfaceC3015g interfaceC3015g = this.f10257d;
        if (interfaceC3015g != null) {
            C2809x.m9357a(interfaceC3015g, this.f10258e);
            this.f10257d = null;
            this.f10258e = null;
        }
        Object objM8531a = C2537c0.m8531a(obj, this.f10786c);
        InterfaceC3012d<T> interfaceC3012d = this.f10786c;
        InterfaceC3015g context = interfaceC3012d.getContext();
        Object objM9359c = C2809x.m9359c(context, null);
        C2571k2<?> c2571k2M8540e = objM9359c != C2809x.f10789a ? C2541d0.m8540e(interfaceC3012d, context, objM9359c) : null;
        try {
            this.f10786c.resumeWith(objM8531a);
            C2925r c2925r = C2925r.f11415a;
        } finally {
            if (c2571k2M8540e == null || c2571k2M8540e.m8586y0()) {
                C2809x.m9357a(context, objM9359c);
            }
        }
    }

    /* renamed from: y0 */
    public final boolean m8586y0() {
        if (this.f10257d == null) {
            return false;
        }
        this.f10257d = null;
        this.f10258e = null;
        return true;
    }

    /* renamed from: z0 */
    public final void m8587z0(@NotNull InterfaceC3015g interfaceC3015g, @Nullable Object obj) {
        this.f10257d = interfaceC3015g;
        this.f10258e = obj;
    }
}
