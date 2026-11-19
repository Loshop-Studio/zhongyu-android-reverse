package p093k5;

import java.io.IOException;
import kotlin.ExceptionsKt;
import kotlin.jvm.internal.Intrinsics;
import p093k5.InterfaceC6698u;

/* renamed from: k5.w */
/* loaded from: classes4.dex */
public final class C6700w implements InterfaceC6686i {

    /* renamed from: a */
    public final InterfaceC6698u f8977a;

    public C6700w(InterfaceC6698u routePlanner) {
        Intrinsics.checkNotNullParameter(routePlanner, "routePlanner");
        this.f8977a = routePlanner;
    }

    @Override // p093k5.InterfaceC6686i
    /* renamed from: a */
    public C6692o mo7759a() throws Throwable {
        InterfaceC6698u.b bVarMo7772c;
        IOException iOException = null;
        while (!mo7760b().isCanceled()) {
            try {
                bVarMo7772c = mo7760b().mo7772c();
            } catch (IOException e6) {
                if (iOException == null) {
                    iOException = e6;
                } else {
                    ExceptionsKt.addSuppressed(iOException, e6);
                }
                if (!InterfaceC6698u.m7860d(mo7760b(), null, 1, null)) {
                    throw iOException;
                }
            }
            if (!bVarMo7772c.isReady()) {
                InterfaceC6698u.a aVarMo7715f = bVarMo7772c.mo7715f();
                if (aVarMo7715f.m7866f()) {
                    aVarMo7715f = bVarMo7772c.mo7712c();
                }
                InterfaceC6698u.b bVarM7861a = aVarMo7715f.m7861a();
                Throwable thM7862b = aVarMo7715f.m7862b();
                if (thM7862b != null) {
                    throw thM7862b;
                }
                if (bVarM7861a != null) {
                    mo7760b().mo7771b().addFirst(bVarM7861a);
                }
            }
            return bVarMo7772c.mo7710a();
        }
        throw new IOException("Canceled");
    }

    @Override // p093k5.InterfaceC6686i
    /* renamed from: b */
    public InterfaceC6698u mo7760b() {
        return this.f8977a;
    }
}
