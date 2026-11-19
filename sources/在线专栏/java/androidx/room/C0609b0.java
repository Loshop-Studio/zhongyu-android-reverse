package androidx.room;

import androidx.room.AbstractC0621h0;
import java.util.concurrent.Executor;
import p149s0.InterfaceC3372c;

/* renamed from: androidx.room.b0 */
/* loaded from: classes.dex */
final class C0609b0 implements InterfaceC3372c.c {

    /* renamed from: a */
    private final InterfaceC3372c.c f3928a;

    /* renamed from: b */
    private final AbstractC0621h0.f f3929b;

    /* renamed from: c */
    private final Executor f3930c;

    C0609b0(InterfaceC3372c.c cVar, AbstractC0621h0.f fVar, Executor executor) {
        this.f3928a = cVar;
        this.f3929b = fVar;
        this.f3930c = executor;
    }

    @Override // p149s0.InterfaceC3372c.c
    /* renamed from: a */
    public InterfaceC3372c mo3484a(InterfaceC3372c.b bVar) {
        return new C0607a0(this.f3928a.mo3484a(bVar), this.f3929b, this.f3930c);
    }
}
