package p401x4;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import p385w4.AbstractC11701e;
import p385w4.InterfaceC11699c;
import p385w4.InterfaceC11700d;

/* renamed from: x4.e */
/* loaded from: classes5.dex */
public class C11795e {

    /* renamed from: x4.e$a */
    public static class a implements InterfaceC11700d, InterfaceC11699c {

        /* renamed from: a */
        public final CountDownLatch f27986a = new CountDownLatch(1);

        @Override // p385w4.InterfaceC11699c
        /* renamed from: a */
        public final void mo25866a(Exception exc) {
            this.f27986a.countDown();
        }

        @Override // p385w4.InterfaceC11700d
        public final void onSuccess(Object obj) {
            this.f27986a.countDown();
        }
    }

    /* renamed from: a */
    public final Object m26026a(AbstractC11701e abstractC11701e) throws ExecutionException {
        if (abstractC11701e.mo25871e()) {
            return abstractC11701e.mo25869c();
        }
        throw new ExecutionException(abstractC11701e.mo25868b());
    }
}
