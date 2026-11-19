package p083i6;

import p075h6.InterfaceC5631c;
import p075h6.InterfaceC5636h;

/* renamed from: i6.a */
/* loaded from: classes2.dex */
public final class C5681a implements InterfaceC5631c {

    /* renamed from: a */
    public static final C5681a f8855a = new C5681a();

    @Override // p075h6.InterfaceC5631c
    public final InterfaceC5636h getContext() {
        throw new IllegalStateException("This continuation is already complete");
    }

    @Override // p075h6.InterfaceC5631c
    public final void resumeWith(Object obj) {
        throw new IllegalStateException("This continuation is already complete");
    }

    public final String toString() {
        return "This continuation is already complete";
    }
}
