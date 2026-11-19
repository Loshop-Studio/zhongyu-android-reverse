package sd;

import java.util.concurrent.Future;

/* renamed from: sd.s0 */
/* loaded from: classes6.dex */
public final class C11160s0 implements InterfaceC11163t0 {

    /* renamed from: c */
    public final Future f26825c;

    public C11160s0(Future future) {
        this.f26825c = future;
    }

    @Override // sd.InterfaceC11163t0
    public void dispose() {
        this.f26825c.cancel(false);
    }

    public String toString() {
        return "DisposableFutureHandle[" + this.f26825c + ']';
    }
}
