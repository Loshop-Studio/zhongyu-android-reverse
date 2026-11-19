package kotlinx.coroutines.flow;

import p379vd.AbstractC11596e;
import p379vd.InterfaceC11594c;
import p379vd.InterfaceC11612u;

/* loaded from: classes6.dex */
public final class StartedLazily implements InterfaceC10040a {
    @Override // kotlinx.coroutines.flow.InterfaceC10040a
    /* renamed from: a */
    public InterfaceC11594c mo20863a(InterfaceC11612u interfaceC11612u) {
        return AbstractC11596e.m25531B(new StartedLazily$command$1(interfaceC11612u, null));
    }

    public String toString() {
        return "SharingStarted.Lazily";
    }
}
