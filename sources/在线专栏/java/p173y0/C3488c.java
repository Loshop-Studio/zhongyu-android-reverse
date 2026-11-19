package p173y0;

import androidx.lifecycle.C0511s;
import androidx.work.impl.utils.futures.C0829d;
import com.google.common.util.concurrent.ListenableFuture;
import p169x0.InterfaceC3448q;

/* renamed from: y0.c */
/* loaded from: classes.dex */
public class C3488c implements InterfaceC3448q {

    /* renamed from: c */
    private final C0511s<InterfaceC3448q.b> f12161c = new C0511s<>();

    /* renamed from: d */
    private final C0829d<InterfaceC3448q.b.c> f12162d = C0829d.m4279s();

    public C3488c() {
        m10562b(InterfaceC3448q.f12082b);
    }

    @Override // p169x0.InterfaceC3448q
    /* renamed from: a */
    public ListenableFuture<InterfaceC3448q.b.c> mo10514a() {
        return this.f12162d;
    }

    /* renamed from: b */
    public void m10562b(InterfaceC3448q.b bVar) {
        this.f12161c.postValue(bVar);
        if (bVar instanceof InterfaceC3448q.b.c) {
            this.f12162d.mo4268o((InterfaceC3448q.b.c) bVar);
        } else if (bVar instanceof InterfaceC3448q.b.a) {
            this.f12162d.mo4269p(((InterfaceC3448q.b.a) bVar).m10515a());
        }
    }
}
