package p169l8;

import kotlinx.coroutines.flow.AbstractFlow;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p300x7.InterfaceC10574p;

/* renamed from: l8.k */
/* loaded from: classes5.dex */
public final class C9274k extends AbstractFlow {

    /* renamed from: a */
    public final InterfaceC10574p f18272a;

    public C9274k(InterfaceC10574p interfaceC10574p) {
        this.f18272a = interfaceC10574p;
    }

    @Override // kotlinx.coroutines.flow.AbstractFlow
    /* renamed from: f */
    public Object mo16568f(InterfaceC9267d interfaceC9267d, InterfaceC9324c interfaceC9324c) {
        Object objInvoke = this.f18272a.invoke(interfaceC9267d, interfaceC9324c);
        return objInvoke == AbstractC9434a.m17291f() ? objInvoke : C8736p.f16368a;
    }
}
