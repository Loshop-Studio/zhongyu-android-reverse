package p169x0;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.CancellationException;
import p087f3.InterfaceC2572l;
import p128o2.C2919l;
import p128o2.C2920m;

/* renamed from: x0.f */
/* loaded from: classes.dex */
public final class RunnableC3437f implements Runnable {

    /* renamed from: a */
    final /* synthetic */ InterfaceC2572l f12059a;

    /* renamed from: b */
    final /* synthetic */ ListenableFuture f12060b;

    public RunnableC3437f(InterfaceC2572l interfaceC2572l, ListenableFuture listenableFuture) {
        this.f12059a = interfaceC2572l;
        this.f12060b = listenableFuture;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            InterfaceC2572l interfaceC2572l = this.f12059a;
            V v3 = this.f12060b.get();
            C2919l.a aVar = C2919l.f11409a;
            interfaceC2572l.resumeWith(C2919l.m9989a(v3));
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                cause = th;
            }
            if (th instanceof CancellationException) {
                this.f12059a.mo8589g(cause);
                return;
            }
            InterfaceC2572l interfaceC2572l2 = this.f12059a;
            C2919l.a aVar2 = C2919l.f11409a;
            interfaceC2572l2.resumeWith(C2919l.m9989a(C2920m.m9993a(cause)));
        }
    }
}
