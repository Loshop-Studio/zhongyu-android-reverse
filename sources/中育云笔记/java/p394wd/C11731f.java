package p394wd;

import kotlin.coroutines.InterfaceC9945d;
import p181hd.InterfaceC9544p;

/* renamed from: wd.f */
/* loaded from: classes6.dex */
public final class C11731f implements InterfaceC9945d {

    /* renamed from: c */
    public final /* synthetic */ InterfaceC9945d f27891c;

    /* renamed from: d */
    public final Throwable f27892d;

    public C11731f(Throwable th, InterfaceC9945d interfaceC9945d) {
        this.f27891c = interfaceC9945d;
        this.f27892d = th;
    }

    @Override // kotlin.coroutines.InterfaceC9945d
    public Object fold(Object obj, InterfaceC9544p interfaceC9544p) {
        return this.f27891c.fold(obj, interfaceC9544p);
    }

    @Override // kotlin.coroutines.InterfaceC9945d
    public InterfaceC9945d.b get(InterfaceC9945d.c cVar) {
        return this.f27891c.get(cVar);
    }

    @Override // kotlin.coroutines.InterfaceC9945d
    public InterfaceC9945d minusKey(InterfaceC9945d.c cVar) {
        return this.f27891c.minusKey(cVar);
    }

    @Override // kotlin.coroutines.InterfaceC9945d
    public InterfaceC9945d plus(InterfaceC9945d interfaceC9945d) {
        return this.f27891c.plus(interfaceC9945d);
    }
}
