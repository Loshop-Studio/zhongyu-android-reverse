package p410xd;

import kotlin.coroutines.InterfaceC9945d;
import sd.InterfaceC11122i0;

/* renamed from: xd.e */
/* loaded from: classes6.dex */
public final class C11842e implements InterfaceC11122i0 {

    /* renamed from: c */
    public final InterfaceC9945d f28083c;

    public C11842e(InterfaceC9945d interfaceC9945d) {
        this.f28083c = interfaceC9945d;
    }

    @Override // sd.InterfaceC11122i0
    public InterfaceC9945d getCoroutineContext() {
        return this.f28083c;
    }

    public String toString() {
        return "CoroutineScope(coroutineContext=" + getCoroutineContext() + ')';
    }
}
