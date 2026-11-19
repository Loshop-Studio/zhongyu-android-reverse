package p180m8;

import kotlin.coroutines.InterfaceC9100d;
import p300x7.InterfaceC10574p;

/* renamed from: m8.f */
/* loaded from: classes5.dex */
public final class C9333f implements InterfaceC9100d {

    /* renamed from: a */
    public final Throwable f18390a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC9100d f18391b;

    public C9333f(Throwable th, InterfaceC9100d interfaceC9100d) {
        this.f18390a = th;
        this.f18391b = interfaceC9100d;
    }

    @Override // kotlin.coroutines.InterfaceC9100d
    public Object fold(Object obj, InterfaceC10574p interfaceC10574p) {
        return this.f18391b.fold(obj, interfaceC10574p);
    }

    @Override // kotlin.coroutines.InterfaceC9100d
    public InterfaceC9100d.b get(InterfaceC9100d.c cVar) {
        return this.f18391b.get(cVar);
    }

    @Override // kotlin.coroutines.InterfaceC9100d
    public InterfaceC9100d minusKey(InterfaceC9100d.c cVar) {
        return this.f18391b.minusKey(cVar);
    }

    @Override // kotlin.coroutines.InterfaceC9100d
    public InterfaceC9100d plus(InterfaceC9100d interfaceC9100d) {
        return this.f18391b.plus(interfaceC9100d);
    }
}
