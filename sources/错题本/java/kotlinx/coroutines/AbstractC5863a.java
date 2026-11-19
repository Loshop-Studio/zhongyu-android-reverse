package kotlinx.coroutines;

import kotlin.Result;
import p075h6.InterfaceC5631c;
import p075h6.InterfaceC5636h;

/* renamed from: kotlinx.coroutines.a */
/* loaded from: classes4.dex */
public abstract class AbstractC5863a extends C5871c1 implements InterfaceC5631c, InterfaceC6009v {

    /* renamed from: c */
    public final InterfaceC5636h f9276c;

    public AbstractC5863a(InterfaceC5636h interfaceC5636h, boolean z8) {
        super(z8);
        m5444K((InterfaceC6013w0) interfaceC5636h.get(C6010v0.f9513a));
        this.f9276c = interfaceC5636h.plus(this);
    }

    @Override // kotlinx.coroutines.C5871c1
    /* renamed from: J */
    public final void mo5420J(CompletionHandlerException completionHandlerException) {
        AbstractC6014x.m5645p(this.f9276c, completionHandlerException);
    }

    @Override // kotlinx.coroutines.C5871c1
    /* renamed from: S */
    public final void mo5421S(Object obj) {
        if (!(obj instanceof C5989p)) {
            mo5423b0(obj);
            return;
        }
        C5989p c5989p = (C5989p) obj;
        mo5422a0(C5989p.f9485b.get(c5989p) == 1, c5989p.f9486a);
    }

    /* renamed from: b0 */
    public void mo5423b0(Object obj) {
    }

    @Override // p075h6.InterfaceC5631c
    public final InterfaceC5636h getContext() {
        return this.f9276c;
    }

    @Override // kotlinx.coroutines.InterfaceC6009v
    public final InterfaceC5636h getCoroutineContext() {
        return this.f9276c;
    }

    @Override // p075h6.InterfaceC5631c
    public final void resumeWith(Object obj) {
        Throwable thM13959exceptionOrNullimpl = Result.m13959exceptionOrNullimpl(obj);
        if (thM13959exceptionOrNullimpl != null) {
            obj = new C5989p(false, thM13959exceptionOrNullimpl);
        }
        Object objM5447O = m5447O(obj);
        if (objM5447O == AbstractC6014x.f9521e) {
            return;
        }
        mo4861t(objM5447O);
    }

    @Override // kotlinx.coroutines.C5871c1
    /* renamed from: y */
    public final String mo5424y() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    /* renamed from: a0 */
    public void mo5422a0(boolean z8, Throwable th) {
    }
}
