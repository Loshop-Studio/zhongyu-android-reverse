package androidx.paging;

import androidx.paging.RemoteMediator;
import p169l8.InterfaceC9280q;
import p179m7.InterfaceC9324c;

/* loaded from: classes3.dex */
public interface RemoteMediatorAccessor<Key, Value> extends RemoteMediatorConnection<Key, Value> {
    InterfaceC9280q getState();

    Object initialize(InterfaceC9324c<? super RemoteMediator.InitializeAction> interfaceC9324c);
}
