package p110m;

import kotlin.jvm.internal.AbstractC5830k;
import kotlinx.coroutines.AbstractC5995r;
import kotlinx.coroutines.C5992q;
import p075h6.InterfaceC5634f;
import p075h6.InterfaceC5635g;
import p075h6.InterfaceC5636h;
import p152r6.InterfaceC6473e;

/* renamed from: m.b */
/* loaded from: classes2.dex */
public final class C6074b implements InterfaceC5636h {

    /* renamed from: a */
    public final InterfaceC5636h f9673a;

    public C6074b(InterfaceC5636h interfaceC5636h) {
        this.f9673a = interfaceC5636h;
    }

    public final boolean equals(Object obj) {
        return AbstractC5830k.m5325b(this.f9673a, obj);
    }

    @Override // p075h6.InterfaceC5636h
    public final Object fold(Object obj, InterfaceC6473e interfaceC6473e) {
        return this.f9673a.fold(obj, interfaceC6473e);
    }

    @Override // p075h6.InterfaceC5636h
    public final InterfaceC5634f get(InterfaceC5635g interfaceC5635g) {
        return this.f9673a.get(interfaceC5635g);
    }

    public final int hashCode() {
        return this.f9673a.hashCode();
    }

    @Override // p075h6.InterfaceC5636h
    public final InterfaceC5636h minusKey(InterfaceC5635g interfaceC5635g) {
        InterfaceC5636h interfaceC5636hMinusKey = this.f9673a.minusKey(interfaceC5635g);
        int i = AbstractC6077e.f9679b;
        C5992q c5992q = AbstractC5995r.Key;
        AbstractC5995r abstractC5995r = (AbstractC5995r) get(c5992q);
        AbstractC5995r abstractC5995r2 = (AbstractC5995r) interfaceC5636hMinusKey.get(c5992q);
        if ((abstractC5995r instanceof C6075c) && !AbstractC5830k.m5325b(abstractC5995r, abstractC5995r2)) {
            ((C6075c) abstractC5995r).f9676b = 0;
        }
        return new C6074b(interfaceC5636hMinusKey);
    }

    @Override // p075h6.InterfaceC5636h
    public final InterfaceC5636h plus(InterfaceC5636h interfaceC5636h) {
        InterfaceC5636h interfaceC5636hPlus = this.f9673a.plus(interfaceC5636h);
        int i = AbstractC6077e.f9679b;
        C5992q c5992q = AbstractC5995r.Key;
        AbstractC5995r abstractC5995r = (AbstractC5995r) get(c5992q);
        AbstractC5995r abstractC5995r2 = (AbstractC5995r) interfaceC5636hPlus.get(c5992q);
        if ((abstractC5995r instanceof C6075c) && !AbstractC5830k.m5325b(abstractC5995r, abstractC5995r2)) {
            ((C6075c) abstractC5995r).f9676b = 0;
        }
        return new C6074b(interfaceC5636hPlus);
    }

    public final String toString() {
        return "ForwardingCoroutineContext(delegate=" + this.f9673a + ")";
    }
}
