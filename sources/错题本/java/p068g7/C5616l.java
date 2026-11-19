package p068g7;

import kotlinx.coroutines.AbstractC5995r;
import p054e7.AbstractC5469a;
import p054e7.C5480l;
import p075h6.InterfaceC5636h;

/* renamed from: g7.l */
/* loaded from: classes4.dex */
public final class C5616l extends AbstractC5995r {

    /* renamed from: a */
    public static final C5616l f8744a = new C5616l();

    @Override // kotlinx.coroutines.AbstractC5995r
    public final void dispatch(InterfaceC5636h interfaceC5636h, Runnable runnable) {
        C5609e.f8732b.f8734a.m4929b(runnable, true, false);
    }

    @Override // kotlinx.coroutines.AbstractC5995r
    public final void dispatchYield(InterfaceC5636h interfaceC5636h, Runnable runnable) {
        C5609e.f8732b.f8734a.m4929b(runnable, true, true);
    }

    @Override // kotlinx.coroutines.AbstractC5995r
    public final AbstractC5995r limitedParallelism(int i, String str) {
        AbstractC5469a.m4825a(i);
        return i >= AbstractC5615k.f8741d ? str != null ? new C5480l(this, str) : this : super.limitedParallelism(i, str);
    }

    @Override // kotlinx.coroutines.AbstractC5995r
    public final String toString() {
        return "Dispatchers.IO";
    }
}
