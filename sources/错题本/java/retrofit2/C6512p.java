package retrofit2;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.C5961g;
import okhttp3.InterfaceC6290d;
import p075h6.InterfaceC5631c;
import p185v7.AbstractC6683l;

/* renamed from: retrofit2.p */
/* loaded from: classes4.dex */
public final class C6512p extends AbstractC6516r {

    /* renamed from: d */
    public final /* synthetic */ int f10768d;

    /* renamed from: e */
    public final InterfaceC6494g f10769e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6512p(C6507m0 c6507m0, InterfaceC6290d interfaceC6290d, InterfaceC6506m interfaceC6506m, InterfaceC6494g interfaceC6494g, int i) {
        super(c6507m0, interfaceC6290d, interfaceC6506m);
        this.f10768d = i;
        this.f10769e = interfaceC6494g;
    }

    @Override // retrofit2.AbstractC6516r
    /* renamed from: a */
    public final Object mo6153a(C6524x c6524x, Object[] objArr) {
        int i = this.f10768d;
        InterfaceC6494g interfaceC6494g = this.f10769e;
        switch (i) {
            case 0:
                return interfaceC6494g.mo115i(c6524x);
            default:
                InterfaceC6490e interfaceC6490e = (InterfaceC6490e) interfaceC6494g.mo115i(c6524x);
                InterfaceC5631c interfaceC5631c = (InterfaceC5631c) objArr[objArr.length - 1];
                try {
                    C5961g c5961g = new C5961g(1, AbstractC6683l.m6374n(interfaceC5631c));
                    c5961g.m5584u();
                    c5961g.mo4966m(new C6520t(interfaceC6490e, 2));
                    interfaceC6490e.mo6144b(new C6521u(c5961g, 2));
                    Object objM5583t = c5961g.m5583t();
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    return objM5583t;
                } catch (Exception e) {
                    return AbstractC6522v.m6175q(e, interfaceC5631c);
                }
        }
    }
}
