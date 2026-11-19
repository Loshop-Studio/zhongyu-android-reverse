package androidx.paging;

import androidx.paging.RemoteMediator;
import p379vd.InterfaceC11612u;
import vc.InterfaceC11588c;

/* loaded from: classes3.dex */
public interface RemoteMediatorAccessor<Key, Value> extends RemoteMediatorConnection<Key, Value> {
    InterfaceC11612u getState();

    Object initialize(InterfaceC11588c<? super RemoteMediator.InitializeAction> interfaceC11588c);
}
