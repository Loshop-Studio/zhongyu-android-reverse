package p032c8;

import io.reactivex.exceptions.CompositeException;
import p016b0.C3080k0;
import p073h4.AbstractC5625a;
import p129o2.C6268a;
import p145q5.AbstractC6434e;
import p145q5.InterfaceC6436g;
import p185v7.AbstractC6675d;
import retrofit2.C6524x;
import retrofit2.InterfaceC6490e;

/* renamed from: c8.a */
/* loaded from: classes4.dex */
public final class C3236a extends AbstractC6434e {

    /* renamed from: a */
    public final /* synthetic */ int f1800a;

    /* renamed from: b */
    public final Object f1801b;

    public /* synthetic */ C3236a(Object obj, int i) {
        this.f1800a = i;
        this.f1801b = obj;
    }

    @Override // p145q5.AbstractC6434e
    /* renamed from: c */
    public final void mo2173c(InterfaceC6436g interfaceC6436g) {
        switch (this.f1800a) {
            case 0:
                ((C3236a) this.f1801b).m6078b(new C3080k0(interfaceC6436g));
                break;
            case 1:
                ((C3236a) this.f1801b).m6078b(new C6268a(interfaceC6436g, 5));
                break;
            default:
                InterfaceC6490e interfaceC6490eClone = ((C6524x) this.f1801b).clone();
                C3237b c3237b = new C3237b(interfaceC6490eClone);
                interfaceC6436g.onSubscribe(c3237b);
                if (!c3237b.f1803b) {
                    boolean z8 = false;
                    try {
                        Object objMo6145d = ((C6524x) interfaceC6490eClone).mo6145d();
                        if (!c3237b.f1803b) {
                            interfaceC6436g.onNext(objMo6145d);
                        }
                        if (!c3237b.f1803b) {
                            try {
                                interfaceC6436g.onComplete();
                                break;
                            } catch (Throwable th) {
                                th = th;
                                z8 = true;
                                AbstractC5625a.m4956p(th);
                                if (z8) {
                                    AbstractC6675d.m6351q(th);
                                    return;
                                }
                                if (c3237b.f1803b) {
                                    return;
                                }
                                try {
                                    interfaceC6436g.onError(th);
                                    return;
                                } catch (Throwable th2) {
                                    AbstractC5625a.m4956p(th2);
                                    AbstractC6675d.m6351q(new CompositeException(th, th2));
                                }
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
                break;
        }
    }
}
