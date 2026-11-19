package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.InterfaceC9945d;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p379vd.InterfaceC11595d;
import p393wc.AbstractC11725a;
import p394wd.AbstractC11729d;
import p410xd.AbstractC11853j0;
import vc.InterfaceC11588c;

/* loaded from: classes6.dex */
public final class UndispatchedContextCollector implements InterfaceC11595d {

    /* renamed from: c */
    public final InterfaceC9945d f23970c;

    /* renamed from: d */
    public final Object f23971d;

    /* renamed from: e */
    public final InterfaceC9544p f23972e;

    public UndispatchedContextCollector(InterfaceC11595d interfaceC11595d, InterfaceC9945d interfaceC9945d) {
        this.f23970c = interfaceC9945d;
        this.f23971d = AbstractC11853j0.m26291g(interfaceC9945d);
        this.f23972e = new UndispatchedContextCollector$emitRef$1(interfaceC11595d, null);
    }

    @Override // p379vd.InterfaceC11595d
    public Object emit(Object obj, InterfaceC11588c interfaceC11588c) {
        Object objM25961b = AbstractC11729d.m25961b(this.f23970c, obj, this.f23971d, this.f23972e, interfaceC11588c);
        return objM25961b == AbstractC11725a.m25952f() ? objM25961b : C10786q.f26013a;
    }
}
