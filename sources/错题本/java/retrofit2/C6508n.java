package retrofit2;

import android.support.v4.media.C0039h;
import java.util.concurrent.Executor;
import okhttp3.C6289c0;

/* renamed from: retrofit2.n */
/* loaded from: classes4.dex */
public final class C6508n implements InterfaceC6490e {

    /* renamed from: a */
    public final Executor f10760a;

    /* renamed from: b */
    public final InterfaceC6490e f10761b;

    public C6508n(Executor executor, InterfaceC6490e interfaceC6490e) {
        this.f10760a = executor;
        this.f10761b = interfaceC6490e;
    }

    @Override // retrofit2.InterfaceC6490e
    /* renamed from: a */
    public final C6289c0 mo6143a() {
        return this.f10761b.mo6143a();
    }

    @Override // retrofit2.InterfaceC6490e
    /* renamed from: b */
    public final void mo6144b(InterfaceC6496h interfaceC6496h) {
        this.f10761b.mo6144b(new C0039h(27, this, interfaceC6496h));
    }

    @Override // retrofit2.InterfaceC6490e
    public final void cancel() {
        this.f10761b.cancel();
    }

    @Override // retrofit2.InterfaceC6490e
    /* renamed from: d */
    public final C6509n0 mo6145d() {
        return this.f10761b.mo6145d();
    }

    @Override // retrofit2.InterfaceC6490e
    public final boolean isCanceled() {
        return this.f10761b.isCanceled();
    }

    @Override // retrofit2.InterfaceC6490e
    public final InterfaceC6490e clone() {
        return new C6508n(this.f10760a, this.f10761b.clone());
    }
}
