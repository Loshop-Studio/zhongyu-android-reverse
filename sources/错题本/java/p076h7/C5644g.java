package p076h7;

import java.util.concurrent.atomic.AtomicReferenceArray;
import p054e7.AbstractC5484p;
import p075h6.InterfaceC5636h;

/* renamed from: h7.g */
/* loaded from: classes4.dex */
public final class C5644g extends AbstractC5484p {

    /* renamed from: e */
    public final /* synthetic */ AtomicReferenceArray f8776e;

    public C5644g(long j7, C5644g c5644g, int i) {
        super(j7, c5644g, i);
        this.f8776e = new AtomicReferenceArray(AbstractC5643f.f8775f);
    }

    @Override // p054e7.AbstractC5484p
    /* renamed from: f */
    public final int mo4863f() {
        return AbstractC5643f.f8775f;
    }

    @Override // p054e7.AbstractC5484p
    /* renamed from: g */
    public final void mo4864g(int i, InterfaceC5636h interfaceC5636h) {
        this.f8776e.set(i, AbstractC5643f.f8774e);
        m4865h();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.f8478c + ", hashCode=" + hashCode() + ']';
    }
}
