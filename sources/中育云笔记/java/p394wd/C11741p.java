package p394wd;

import kotlinx.coroutines.channels.InterfaceC10005f;
import p309qc.C10786q;
import p379vd.InterfaceC11595d;
import p393wc.AbstractC11725a;
import vc.InterfaceC11588c;

/* renamed from: wd.p */
/* loaded from: classes6.dex */
public final class C11741p implements InterfaceC11595d {

    /* renamed from: c */
    public final InterfaceC10005f f27900c;

    public C11741p(InterfaceC10005f interfaceC10005f) {
        this.f27900c = interfaceC10005f;
    }

    @Override // p379vd.InterfaceC11595d
    public Object emit(Object obj, InterfaceC11588c interfaceC11588c) {
        Object objSend = this.f27900c.send(obj, interfaceC11588c);
        return objSend == AbstractC11725a.m25952f() ? objSend : C10786q.f26013a;
    }
}
