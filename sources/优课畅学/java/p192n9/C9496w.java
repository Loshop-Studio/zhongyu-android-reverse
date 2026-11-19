package p192n9;

import java.io.IOException;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.AbstractC8722b;
import p192n9.InterfaceC9494u;

/* renamed from: n9.w */
/* loaded from: classes5.dex */
public final class C9496w implements InterfaceC9482i {

    /* renamed from: a */
    public final InterfaceC9494u f18847a;

    public C9496w(InterfaceC9494u routePlanner) {
        AbstractC9133u.m16133g(routePlanner, "routePlanner");
        this.f18847a = routePlanner;
    }

    @Override // p192n9.InterfaceC9482i
    /* renamed from: a */
    public C9488o mo17492a() throws Throwable {
        InterfaceC9494u.b bVarMo17506d;
        IOException iOException = null;
        while (!mo17493b().isCanceled()) {
            try {
                bVarMo17506d = mo17493b().mo17506d();
            } catch (IOException e10) {
                if (iOException == null) {
                    iOException = e10;
                } else {
                    AbstractC8722b.m14228a(iOException, e10);
                }
                if (!InterfaceC9494u.m17593f(mo17493b(), null, 1, null)) {
                    throw iOException;
                }
            }
            if (!bVarMo17506d.isReady()) {
                InterfaceC9494u.a aVarMo17447e = bVarMo17506d.mo17447e();
                if (aVarMo17447e.m17599f()) {
                    aVarMo17447e = bVarMo17506d.mo17445c();
                }
                InterfaceC9494u.b bVarM17594a = aVarMo17447e.m17594a();
                Throwable thM17595b = aVarMo17447e.m17595b();
                if (thM17595b != null) {
                    throw thM17595b;
                }
                if (bVarM17594a != null) {
                    mo17493b().mo17505c().addFirst(bVarM17594a);
                }
            }
            return bVarMo17506d.mo17443a();
        }
        throw new IOException("Canceled");
    }

    @Override // p192n9.InterfaceC9482i
    /* renamed from: b */
    public InterfaceC9494u mo17493b() {
        return this.f18847a;
    }
}
