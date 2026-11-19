package p054e7;

import kotlinx.coroutines.InterfaceC6009v;
import p075h6.InterfaceC5636h;

/* renamed from: e7.c */
/* loaded from: classes4.dex */
public final class C5471c implements InterfaceC6009v {

    /* renamed from: a */
    public final InterfaceC5636h f8447a;

    public C5471c(InterfaceC5636h interfaceC5636h) {
        this.f8447a = interfaceC5636h;
    }

    @Override // kotlinx.coroutines.InterfaceC6009v
    public final InterfaceC5636h getCoroutineContext() {
        return this.f8447a;
    }

    public final String toString() {
        return "CoroutineScope(coroutineContext=" + this.f8447a + ')';
    }
}
