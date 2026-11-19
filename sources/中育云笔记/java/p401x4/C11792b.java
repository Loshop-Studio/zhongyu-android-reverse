package p401x4;

import java.util.concurrent.Executor;
import p385w4.AbstractC11701e;
import p385w4.InterfaceC11698b;
import p385w4.InterfaceC11699c;

/* renamed from: x4.b */
/* loaded from: classes5.dex */
public class C11792b implements InterfaceC11698b {

    /* renamed from: a */
    public InterfaceC11699c f27970a;

    /* renamed from: b */
    public Executor f27971b;

    /* renamed from: c */
    public final Object f27972c = new Object();

    /* renamed from: x4.b$a */
    public class a implements Runnable {

        /* renamed from: c */
        public final /* synthetic */ AbstractC11701e f27973c;

        public a(AbstractC11701e abstractC11701e) {
            this.f27973c = abstractC11701e;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (C11792b.this.f27972c) {
                try {
                    InterfaceC11699c interfaceC11699c = C11792b.this.f27970a;
                    if (interfaceC11699c != null) {
                        interfaceC11699c.mo25866a(this.f27973c.mo25868b());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public C11792b(Executor executor, InterfaceC11699c interfaceC11699c) {
        this.f27970a = interfaceC11699c;
        this.f27971b = executor;
    }

    @Override // p385w4.InterfaceC11698b
    /* renamed from: a */
    public final void mo25865a(AbstractC11701e abstractC11701e) {
        if (abstractC11701e.mo25871e() || ((C11794d) abstractC11701e).f27982c) {
            return;
        }
        this.f27971b.execute(new a(abstractC11701e));
    }
}
