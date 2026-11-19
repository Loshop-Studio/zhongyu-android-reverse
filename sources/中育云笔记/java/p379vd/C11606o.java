package p379vd;

import kotlinx.coroutines.flow.AbstractFlow;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import vc.InterfaceC11588c;

/* renamed from: vd.o */
/* loaded from: classes6.dex */
public final class C11606o extends AbstractFlow {

    /* renamed from: c */
    public final InterfaceC9544p f27505c;

    public C11606o(InterfaceC9544p interfaceC9544p) {
        this.f27505c = interfaceC9544p;
    }

    @Override // kotlinx.coroutines.flow.AbstractFlow
    /* renamed from: c */
    public Object mo20756c(InterfaceC11595d interfaceC11595d, InterfaceC11588c interfaceC11588c) {
        Object objInvoke = this.f27505c.invoke(interfaceC11595d, interfaceC11588c);
        return objInvoke == AbstractC11725a.m25952f() ? objInvoke : C10786q.f26013a;
    }
}
