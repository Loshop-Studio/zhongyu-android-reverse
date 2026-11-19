package p385w4;

import android.os.Looper;
import p401x4.C11794d;
import p401x4.C11795e;

/* renamed from: w4.h */
/* loaded from: classes5.dex */
public abstract class AbstractC11704h {

    /* renamed from: a */
    public static C11795e f27814a = new C11795e();

    /* renamed from: a */
    public static Object m25876a(AbstractC11701e abstractC11701e) throws InterruptedException {
        C11795e c11795e = f27814a;
        c11795e.getClass();
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("await must not be called on the UI thread");
        }
        if (abstractC11701e.mo25870d()) {
            return c11795e.m26026a(abstractC11701e);
        }
        C11795e.a aVar = new C11795e.a();
        ((C11794d) abstractC11701e).m26024i(C11703g.m25875a(), aVar).mo25867a(aVar);
        aVar.f27986a.await();
        return c11795e.m26026a(abstractC11701e);
    }
}
