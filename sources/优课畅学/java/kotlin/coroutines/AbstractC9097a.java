package kotlin.coroutines;

import kotlin.coroutines.InterfaceC9100d;
import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10574p;

/* renamed from: kotlin.coroutines.a */
/* loaded from: classes5.dex */
public abstract class AbstractC9097a implements InterfaceC9100d.b {
    private final InterfaceC9100d.c key;

    public AbstractC9097a(InterfaceC9100d.c key) {
        AbstractC9133u.m16133g(key, "key");
        this.key = key;
    }

    @Override // kotlin.coroutines.InterfaceC9100d
    public <R> R fold(R r10, InterfaceC10574p interfaceC10574p) {
        return (R) InterfaceC9100d.b.a.m16071a(this, r10, interfaceC10574p);
    }

    @Override // kotlin.coroutines.InterfaceC9100d.b, kotlin.coroutines.InterfaceC9100d
    public <E extends InterfaceC9100d.b> E get(InterfaceC9100d.c cVar) {
        return (E) InterfaceC9100d.b.a.m16072b(this, cVar);
    }

    @Override // kotlin.coroutines.InterfaceC9100d.b
    public InterfaceC9100d.c getKey() {
        return this.key;
    }

    @Override // kotlin.coroutines.InterfaceC9100d
    public InterfaceC9100d minusKey(InterfaceC9100d.c cVar) {
        return InterfaceC9100d.b.a.m16073c(this, cVar);
    }

    @Override // kotlin.coroutines.InterfaceC9100d
    public InterfaceC9100d plus(InterfaceC9100d interfaceC9100d) {
        return InterfaceC9100d.b.a.m16074d(this, interfaceC9100d);
    }
}
