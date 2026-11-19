package p135i8;

import java.util.concurrent.Future;

/* renamed from: i8.j0 */
/* loaded from: classes5.dex */
public final class C8846j0 implements InterfaceC8849k0 {

    /* renamed from: a */
    public final Future f16517a;

    public C8846j0(Future future) {
        this.f16517a = future;
    }

    @Override // p135i8.InterfaceC8849k0
    public void dispose() {
        this.f16517a.cancel(false);
    }

    public String toString() {
        return "DisposableFutureHandle[" + this.f16517a + ']';
    }
}
