package retrofit2;

import kotlin.jvm.internal.AbstractC5830k;
import okhttp3.InterfaceC6290d;
import p075h6.InterfaceC5631c;

/* renamed from: retrofit2.q */
/* loaded from: classes4.dex */
public final class C6514q extends AbstractC6516r {

    /* renamed from: d */
    public final InterfaceC6494g f10776d;

    /* renamed from: e */
    public final boolean f10777e;

    public C6514q(C6507m0 c6507m0, InterfaceC6290d interfaceC6290d, InterfaceC6506m interfaceC6506m, InterfaceC6494g interfaceC6494g, boolean z8) {
        super(c6507m0, interfaceC6290d, interfaceC6506m);
        this.f10776d = interfaceC6494g;
        this.f10777e = z8;
    }

    @Override // retrofit2.AbstractC6516r
    /* renamed from: a */
    public final Object mo6153a(C6524x c6524x, Object[] objArr) {
        InterfaceC6490e interfaceC6490e = (InterfaceC6490e) this.f10776d.mo115i(c6524x);
        InterfaceC5631c interfaceC5631c = (InterfaceC5631c) objArr[objArr.length - 1];
        try {
            if (!this.f10777e) {
                return AbstractC6522v.m6160b(interfaceC6490e, interfaceC5631c);
            }
            AbstractC5830k.m5328e(interfaceC6490e, "null cannot be cast to non-null type retrofit2.Call<kotlin.Unit?>");
            return AbstractC6522v.m6161c(interfaceC6490e, interfaceC5631c);
        } catch (LinkageError e) {
            throw e;
        } catch (ThreadDeath e4) {
            throw e4;
        } catch (VirtualMachineError e8) {
            throw e8;
        } catch (Throwable th) {
            return AbstractC6522v.m6175q(th, interfaceC5631c);
        }
    }
}
