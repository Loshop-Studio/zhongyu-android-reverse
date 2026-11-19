package p054e7;

import kotlinx.coroutines.AbstractC5863a;
import kotlinx.coroutines.AbstractC6014x;
import kotlinx.coroutines.DispatchException;
import p075h6.InterfaceC5631c;
import p075h6.InterfaceC5636h;
import p083i6.InterfaceC5682b;
import p185v7.AbstractC6683l;

/* renamed from: e7.o */
/* loaded from: classes4.dex */
public class C5483o extends AbstractC5863a implements InterfaceC5682b {

    /* renamed from: d */
    public final InterfaceC5631c f8476d;

    public C5483o(InterfaceC5631c interfaceC5631c, InterfaceC5636h interfaceC5636h) {
        super(interfaceC5636h, true);
        this.f8476d = interfaceC5631c;
    }

    @Override // kotlinx.coroutines.C5871c1
    /* renamed from: M */
    public final boolean mo4858M() {
        return true;
    }

    @Override // p083i6.InterfaceC5682b
    public final InterfaceC5682b getCallerFrame() {
        InterfaceC5631c interfaceC5631c = this.f8476d;
        if (interfaceC5631c instanceof InterfaceC5682b) {
            return (InterfaceC5682b) interfaceC5631c;
        }
        return null;
    }

    @Override // kotlinx.coroutines.C5871c1
    /* renamed from: s */
    public void mo4860s(Object obj) throws DispatchException {
        AbstractC5469a.m4832h(AbstractC6683l.m6374n(this.f8476d), AbstractC6014x.m5653x(obj));
    }

    @Override // kotlinx.coroutines.C5871c1
    /* renamed from: t */
    public void mo4861t(Object obj) {
        this.f8476d.resumeWith(AbstractC6014x.m5653x(obj));
    }

    /* renamed from: c0 */
    public void mo4859c0() {
    }
}
