package p169x0;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.CancellationException;
import p087f3.InterfaceC2572l;
import p128o2.C2919l;
import p128o2.C2920m;

/* renamed from: x0.e */
/* loaded from: classes.dex */
public final class RunnableC3436e implements Runnable {

    /* renamed from: a */
    final /* synthetic */ InterfaceC2572l f12057a;

    /* renamed from: b */
    final /* synthetic */ ListenableFuture f12058b;

    public RunnableC3436e(InterfaceC2572l interfaceC2572l, ListenableFuture listenableFuture) {
        this.f12057a = interfaceC2572l;
        this.f12058b = listenableFuture;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            InterfaceC2572l interfaceC2572l = this.f12057a;
            V v3 = this.f12058b.get();
            C2919l.a aVar = C2919l.f11409a;
            interfaceC2572l.resumeWith(C2919l.m9989a(v3));
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                cause = th;
            }
            if (th instanceof CancellationException) {
                this.f12057a.mo8589g(cause);
                return;
            }
            InterfaceC2572l interfaceC2572l2 = this.f12057a;
            C2919l.a aVar2 = C2919l.f11409a;
            interfaceC2572l2.resumeWith(C2919l.m9989a(C2920m.m9993a(cause)));
        }
    }
}
