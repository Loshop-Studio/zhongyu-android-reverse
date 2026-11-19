package kotlinx.coroutines;

import p075h6.InterfaceC5634f;
import p075h6.InterfaceC5635g;
import p075h6.InterfaceC5636h;
import p152r6.InterfaceC6473e;
import p169t6.AbstractC6600a;

/* renamed from: kotlinx.coroutines.t1 */
/* loaded from: classes4.dex */
public final class C6005t1 implements InterfaceC5634f, InterfaceC5635g {

    /* renamed from: a */
    public static final C6005t1 f9509a = new C6005t1();

    @Override // p075h6.InterfaceC5636h
    public final Object fold(Object obj, InterfaceC6473e interfaceC6473e) {
        return AbstractC6600a.m6230a(this, obj, interfaceC6473e);
    }

    @Override // p075h6.InterfaceC5636h
    public final InterfaceC5634f get(InterfaceC5635g interfaceC5635g) {
        return AbstractC6600a.m6231b(this, interfaceC5635g);
    }

    @Override // p075h6.InterfaceC5636h
    public final InterfaceC5636h minusKey(InterfaceC5635g interfaceC5635g) {
        return AbstractC6600a.m6237m(this, interfaceC5635g);
    }

    @Override // p075h6.InterfaceC5636h
    public final InterfaceC5636h plus(InterfaceC5636h interfaceC5636h) {
        return AbstractC6600a.m6239o(interfaceC5636h, this);
    }

    @Override // p075h6.InterfaceC5634f
    public final InterfaceC5635g getKey() {
        return this;
    }
}
