package p135i8;

import java.util.concurrent.Future;
import kotlinx.coroutines.InterfaceC9154b;

/* renamed from: i8.i */
/* loaded from: classes5.dex */
public final class C8842i implements InterfaceC9154b {

    /* renamed from: a */
    public final Future f16512a;

    public C8842i(Future future) {
        this.f16512a = future;
    }

    @Override // kotlinx.coroutines.InterfaceC9154b
    /* renamed from: a */
    public void mo14865a(Throwable th) {
        if (th != null) {
            this.f16512a.cancel(false);
        }
    }

    public String toString() {
        return "CancelFutureOnCancel[" + this.f16512a + ']';
    }
}
