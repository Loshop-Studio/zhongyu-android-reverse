package kotlinx.coroutines.flow.internal;

import p075h6.InterfaceC5631c;
import p075h6.InterfaceC5636h;
import p083i6.InterfaceC5682b;

/* renamed from: kotlinx.coroutines.flow.internal.p */
/* loaded from: classes4.dex */
public final class C5934p implements InterfaceC5631c, InterfaceC5682b {

    /* renamed from: a */
    public final InterfaceC5631c f9408a;

    /* renamed from: b */
    public final InterfaceC5636h f9409b;

    public C5934p(InterfaceC5631c interfaceC5631c, InterfaceC5636h interfaceC5636h) {
        this.f9408a = interfaceC5631c;
        this.f9409b = interfaceC5636h;
    }

    @Override // p083i6.InterfaceC5682b
    public final InterfaceC5682b getCallerFrame() {
        InterfaceC5631c interfaceC5631c = this.f9408a;
        if (interfaceC5631c instanceof InterfaceC5682b) {
            return (InterfaceC5682b) interfaceC5631c;
        }
        return null;
    }

    @Override // p075h6.InterfaceC5631c
    public final InterfaceC5636h getContext() {
        return this.f9409b;
    }

    @Override // p075h6.InterfaceC5631c
    public final void resumeWith(Object obj) {
        this.f9408a.resumeWith(obj);
    }
}
