package androidx.paging;

import kotlin.jvm.internal.AbstractC9979u;
import sd.InterfaceC11122i0;

/* loaded from: classes3.dex */
public final class RemoteMediatorAccessorKt {
    public static final <Key, Value> RemoteMediatorAccessor<Key, Value> RemoteMediatorAccessor(InterfaceC11122i0 scope, RemoteMediator<Key, Value> delegate) {
        AbstractC9979u.m20294g(scope, "scope");
        AbstractC9979u.m20294g(delegate, "delegate");
        return new RemoteMediatorAccessImpl(scope, delegate);
    }
}
