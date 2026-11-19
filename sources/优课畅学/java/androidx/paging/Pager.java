package androidx.paging;

import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p169l8.InterfaceC9266c;
import p300x7.InterfaceC10559a;

/* loaded from: classes3.dex */
public final class Pager<Key, Value> {
    private final InterfaceC9266c flow;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Pager(PagingConfig config, InterfaceC10559a pagingSourceFactory) {
        this(config, null, pagingSourceFactory, 2, null);
        AbstractC9133u.m16133g(config, "config");
        AbstractC9133u.m16133g(pagingSourceFactory, "pagingSourceFactory");
    }

    public static /* synthetic */ void getFlow$annotations() {
    }

    public final InterfaceC9266c getFlow() {
        return this.flow;
    }

    @ExperimentalPagingApi
    public Pager(PagingConfig config, Key key, RemoteMediator<Key, Value> remoteMediator, InterfaceC10559a pagingSourceFactory) {
        AbstractC9133u.m16133g(config, "config");
        AbstractC9133u.m16133g(pagingSourceFactory, "pagingSourceFactory");
        this.flow = new PageFetcher(pagingSourceFactory instanceof SuspendingPagingSourceFactory ? new Pager$flow$1(pagingSourceFactory) : new Pager$flow$2(pagingSourceFactory, null), key, config, remoteMediator).getFlow();
    }

    public /* synthetic */ Pager(PagingConfig pagingConfig, Object obj, RemoteMediator remoteMediator, InterfaceC10559a interfaceC10559a, int i10, AbstractC9126n abstractC9126n) {
        this(pagingConfig, (i10 & 2) != 0 ? null : obj, remoteMediator, interfaceC10559a);
    }

    public /* synthetic */ Pager(PagingConfig pagingConfig, Object obj, InterfaceC10559a interfaceC10559a, int i10, AbstractC9126n abstractC9126n) {
        this(pagingConfig, (i10 & 2) != 0 ? null : obj, interfaceC10559a);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Pager(PagingConfig config, Key key, InterfaceC10559a pagingSourceFactory) {
        this(config, key, null, pagingSourceFactory);
        AbstractC9133u.m16133g(config, "config");
        AbstractC9133u.m16133g(pagingSourceFactory, "pagingSourceFactory");
    }
}
