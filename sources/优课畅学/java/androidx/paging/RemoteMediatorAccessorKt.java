package androidx.paging;

import kotlin.jvm.internal.AbstractC9133u;
import p135i8.InterfaceC8822b0;

/* loaded from: classes3.dex */
public final class RemoteMediatorAccessorKt {
    public static final <Key, Value> RemoteMediatorAccessor<Key, Value> RemoteMediatorAccessor(InterfaceC8822b0 scope, RemoteMediator<Key, Value> delegate) {
        AbstractC9133u.m16133g(scope, "scope");
        AbstractC9133u.m16133g(delegate, "delegate");
        return new RemoteMediatorAccessImpl(scope, delegate);
    }
}
