package androidx.room.coroutines;

import kotlin.coroutines.InterfaceC9100d;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10574p;

/* loaded from: classes3.dex */
final class ConnectionElement implements InterfaceC9100d.b {
    public static final Key Key = new Key(null);
    private final PooledConnectionImpl connectionWrapper;

    public static final class Key implements InterfaceC9100d.c {
        public /* synthetic */ Key(AbstractC9126n abstractC9126n) {
            this();
        }

        private Key() {
        }
    }

    public ConnectionElement(PooledConnectionImpl connectionWrapper) {
        AbstractC9133u.m16133g(connectionWrapper, "connectionWrapper");
        this.connectionWrapper = connectionWrapper;
    }

    @Override // kotlin.coroutines.InterfaceC9100d
    public <R> R fold(R r10, InterfaceC10574p interfaceC10574p) {
        return (R) InterfaceC9100d.b.a.m16071a(this, r10, interfaceC10574p);
    }

    @Override // kotlin.coroutines.InterfaceC9100d.b, kotlin.coroutines.InterfaceC9100d
    public <E extends InterfaceC9100d.b> E get(InterfaceC9100d.c cVar) {
        return (E) InterfaceC9100d.b.a.m16072b(this, cVar);
    }

    public final PooledConnectionImpl getConnectionWrapper() {
        return this.connectionWrapper;
    }

    @Override // kotlin.coroutines.InterfaceC9100d.b
    public InterfaceC9100d.c getKey() {
        return Key;
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
