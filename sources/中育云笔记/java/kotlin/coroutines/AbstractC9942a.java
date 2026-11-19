package kotlin.coroutines;

import kotlin.coroutines.InterfaceC9945d;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9544p;

/* renamed from: kotlin.coroutines.a */
/* loaded from: classes6.dex */
public abstract class AbstractC9942a implements InterfaceC9945d.b {
    private final InterfaceC9945d.c key;

    public AbstractC9942a(InterfaceC9945d.c key) {
        AbstractC9979u.m20294g(key, "key");
        this.key = key;
    }

    @Override // kotlin.coroutines.InterfaceC9945d
    public <R> R fold(R r10, InterfaceC9544p interfaceC9544p) {
        return (R) InterfaceC9945d.b.a.m20216a(this, r10, interfaceC9544p);
    }

    @Override // kotlin.coroutines.InterfaceC9945d.b, kotlin.coroutines.InterfaceC9945d
    public <E extends InterfaceC9945d.b> E get(InterfaceC9945d.c cVar) {
        return (E) InterfaceC9945d.b.a.m20217b(this, cVar);
    }

    @Override // kotlin.coroutines.InterfaceC9945d.b
    public InterfaceC9945d.c getKey() {
        return this.key;
    }

    @Override // kotlin.coroutines.InterfaceC9945d
    public InterfaceC9945d minusKey(InterfaceC9945d.c cVar) {
        return InterfaceC9945d.b.a.m20218c(this, cVar);
    }

    @Override // kotlin.coroutines.InterfaceC9945d
    public InterfaceC9945d plus(InterfaceC9945d interfaceC9945d) {
        return InterfaceC9945d.b.a.m20219d(this, interfaceC9945d);
    }
}
