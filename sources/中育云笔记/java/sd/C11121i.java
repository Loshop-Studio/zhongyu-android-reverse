package sd;

import java.util.concurrent.Future;
import kotlinx.coroutines.InterfaceC9996b;

/* renamed from: sd.i */
/* loaded from: classes6.dex */
public final class C11121i implements InterfaceC9996b {

    /* renamed from: c */
    public final Future f26787c;

    public C11121i(Future future) {
        this.f26787c = future;
    }

    @Override // kotlinx.coroutines.InterfaceC9996b
    /* renamed from: a */
    public void mo20494a(Throwable th) {
        this.f26787c.cancel(false);
    }

    public String toString() {
        return "CancelFutureOnCancel[" + this.f26787c + ']';
    }
}
