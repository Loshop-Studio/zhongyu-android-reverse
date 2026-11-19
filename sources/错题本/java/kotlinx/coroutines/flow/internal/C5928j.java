package kotlinx.coroutines.flow.internal;

import p075h6.InterfaceC5634f;
import p075h6.InterfaceC5635g;
import p075h6.InterfaceC5636h;
import p152r6.InterfaceC6473e;

/* renamed from: kotlinx.coroutines.flow.internal.j */
/* loaded from: classes4.dex */
public final class C5928j implements InterfaceC5636h {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC5636h f9401a;

    /* renamed from: b */
    public final Throwable f9402b;

    public C5928j(InterfaceC5636h interfaceC5636h, Throwable th) {
        this.f9401a = interfaceC5636h;
        this.f9402b = th;
    }

    @Override // p075h6.InterfaceC5636h
    public final Object fold(Object obj, InterfaceC6473e interfaceC6473e) {
        return this.f9401a.fold(obj, interfaceC6473e);
    }

    @Override // p075h6.InterfaceC5636h
    public final InterfaceC5634f get(InterfaceC5635g interfaceC5635g) {
        return this.f9401a.get(interfaceC5635g);
    }

    @Override // p075h6.InterfaceC5636h
    public final InterfaceC5636h minusKey(InterfaceC5635g interfaceC5635g) {
        return this.f9401a.minusKey(interfaceC5635g);
    }

    @Override // p075h6.InterfaceC5636h
    public final InterfaceC5636h plus(InterfaceC5636h interfaceC5636h) {
        return this.f9401a.plus(interfaceC5636h);
    }
}
