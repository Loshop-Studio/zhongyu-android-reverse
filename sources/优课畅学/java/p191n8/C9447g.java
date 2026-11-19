package p191n8;

import kotlin.coroutines.InterfaceC9100d;
import p135i8.InterfaceC8822b0;

/* renamed from: n8.g */
/* loaded from: classes5.dex */
public final class C9447g implements InterfaceC8822b0 {

    /* renamed from: a */
    public final InterfaceC9100d f18652a;

    public C9447g(InterfaceC9100d interfaceC9100d) {
        this.f18652a = interfaceC9100d;
    }

    @Override // p135i8.InterfaceC8822b0
    public InterfaceC9100d getCoroutineContext() {
        return this.f18652a;
    }

    public String toString() {
        return "CoroutineScope(coroutineContext=" + getCoroutineContext() + ')';
    }
}
