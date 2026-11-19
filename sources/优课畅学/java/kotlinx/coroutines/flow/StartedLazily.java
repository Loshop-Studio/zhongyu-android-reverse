package kotlinx.coroutines.flow;

import p169l8.AbstractC9268e;
import p169l8.InterfaceC9266c;
import p169l8.InterfaceC9280q;

/* loaded from: classes5.dex */
public final class StartedLazily implements InterfaceC9198a {
    @Override // kotlinx.coroutines.flow.InterfaceC9198a
    /* renamed from: a */
    public InterfaceC9266c mo16679a(InterfaceC9280q interfaceC9280q) {
        return AbstractC9268e.m16990B(new StartedLazily$command$1(interfaceC9280q, null));
    }

    public String toString() {
        return "SharingStarted.Lazily";
    }
}
