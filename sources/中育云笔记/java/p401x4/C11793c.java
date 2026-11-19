package p401x4;

import java.util.concurrent.Executor;
import p385w4.AbstractC11701e;
import p385w4.InterfaceC11698b;
import p385w4.InterfaceC11700d;

/* renamed from: x4.c */
/* loaded from: classes5.dex */
public class C11793c implements InterfaceC11698b {

    /* renamed from: a */
    public InterfaceC11700d f27975a;

    /* renamed from: b */
    public Executor f27976b;

    /* renamed from: c */
    public final Object f27977c = new Object();

    /* renamed from: x4.c$a */
    public class a implements Runnable {

        /* renamed from: c */
        public final /* synthetic */ AbstractC11701e f27978c;

        public a(AbstractC11701e abstractC11701e) {
            this.f27978c = abstractC11701e;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (C11793c.this.f27977c) {
                try {
                    InterfaceC11700d interfaceC11700d = C11793c.this.f27975a;
                    if (interfaceC11700d != null) {
                        interfaceC11700d.onSuccess(this.f27978c.mo25869c());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public C11793c(Executor executor, InterfaceC11700d interfaceC11700d) {
        this.f27975a = interfaceC11700d;
        this.f27976b = executor;
    }

    @Override // p385w4.InterfaceC11698b
    /* renamed from: a */
    public final void mo25865a(AbstractC11701e abstractC11701e) {
        if (!abstractC11701e.mo25871e() || ((C11794d) abstractC11701e).f27982c) {
            return;
        }
        this.f27976b.execute(new a(abstractC11701e));
    }
}
