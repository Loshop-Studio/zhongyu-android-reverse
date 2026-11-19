package p032c8;

import p159s5.InterfaceC6559b;
import retrofit2.InterfaceC6490e;

/* renamed from: c8.b */
/* loaded from: classes4.dex */
public final class C3237b implements InterfaceC6559b {

    /* renamed from: a */
    public final InterfaceC6490e f1802a;

    /* renamed from: b */
    public volatile boolean f1803b;

    public C3237b(InterfaceC6490e interfaceC6490e) {
        this.f1802a = interfaceC6490e;
    }

    @Override // p159s5.InterfaceC6559b
    public final void dispose() {
        this.f1803b = true;
        this.f1802a.cancel();
    }
}
