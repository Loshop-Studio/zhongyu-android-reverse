package androidx.work.multiprocess;

import android.os.RemoteException;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import p169x0.AbstractC3445n;

/* renamed from: androidx.work.multiprocess.c */
/* loaded from: classes.dex */
public abstract class AbstractC0835c<I> {

    /* renamed from: a */
    final Executor f4912a;

    /* renamed from: b */
    final InterfaceC0834b f4913b;

    /* renamed from: c */
    final ListenableFuture<I> f4914c;

    /* renamed from: androidx.work.multiprocess.c$a */
    public static class a<I> implements Runnable {

        /* renamed from: b */
        private static final String f4915b = AbstractC3445n.m10503f("ListenableCallbackRbl");

        /* renamed from: a */
        private final AbstractC0835c<I> f4916a;

        public a(AbstractC0835c<I> abstractC0835c) {
            this.f4916a = abstractC0835c;
        }

        /* renamed from: a */
        public static void m4300a(InterfaceC0834b interfaceC0834b, Throwable th) {
            try {
                interfaceC0834b.mo4295u(th.getMessage());
            } catch (RemoteException e4) {
                AbstractC3445n.m10501c().mo10505b(f4915b, "Unable to notify failures in operation", e4);
            }
        }

        /* renamed from: b */
        public static void m4301b(InterfaceC0834b interfaceC0834b, byte[] bArr) {
            try {
                interfaceC0834b.mo4294n(bArr);
            } catch (RemoteException e4) {
                AbstractC3445n.m10501c().mo10505b(f4915b, "Unable to notify successful operation", e4);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                I i4 = this.f4916a.f4914c.get();
                AbstractC0835c<I> abstractC0835c = this.f4916a;
                m4301b(abstractC0835c.f4913b, abstractC0835c.mo4299b(i4));
            } catch (Throwable th) {
                m4300a(this.f4916a.f4913b, th);
            }
        }
    }

    public AbstractC0835c(Executor executor, InterfaceC0834b interfaceC0834b, ListenableFuture<I> listenableFuture) {
        this.f4912a = executor;
        this.f4913b = interfaceC0834b;
        this.f4914c = listenableFuture;
    }

    /* renamed from: a */
    public void m4298a() {
        this.f4914c.addListener(new a(this), this.f4912a);
    }

    /* renamed from: b */
    public abstract byte[] mo4299b(I i4);
}
