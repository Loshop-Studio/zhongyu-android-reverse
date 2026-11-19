package androidx.paging;

import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p379vd.InterfaceC11594c;

/* loaded from: classes3.dex */
public final class Pager<Key, Value> {
    private final InterfaceC11594c flow;
    private final PageFetcher<Key, Value> pageFetcher;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Pager(PagingConfig config, InterfaceC9529a pagingSourceFactory) {
        this(config, null, pagingSourceFactory, 2, null);
        AbstractC9979u.m20294g(config, "config");
        AbstractC9979u.m20294g(pagingSourceFactory, "pagingSourceFactory");
    }

    public static /* synthetic */ void getFlow$annotations() {
    }

    private static /* synthetic */ void getPageFetcher$annotations() {
    }

    public final void append() {
        this.pageFetcher.load(LoadType.APPEND);
    }

    public final InterfaceC11594c getFlow() {
        return this.flow;
    }

    public final void prepend() {
        this.pageFetcher.load(LoadType.PREPEND);
    }

    public final void refresh() {
        this.pageFetcher.refreshAll();
    }

    public final void retry() {
        this.pageFetcher.retry();
    }

    @ExperimentalPagingApi
    public Pager(PagingConfig config, Key key, RemoteMediator<Key, Value> remoteMediator, InterfaceC9529a pagingSourceFactory) {
        AbstractC9979u.m20294g(config, "config");
        AbstractC9979u.m20294g(pagingSourceFactory, "pagingSourceFactory");
        PageFetcher<Key, Value> pageFetcher = new PageFetcher<>(pagingSourceFactory instanceof SuspendingPagingSourceFactory ? new Pager$pageFetcher$1((SuspendingPagingSourceFactory) pagingSourceFactory) : new Pager$pageFetcher$2(pagingSourceFactory, null), key, config, remoteMediator);
        this.pageFetcher = pageFetcher;
        this.flow = pageFetcher.getFlow();
    }

    public final void refresh(Value item) {
        AbstractC9979u.m20294g(item, "item");
        this.pageFetcher.refresh(item);
    }

    public /* synthetic */ Pager(PagingConfig pagingConfig, Object obj, RemoteMediator remoteMediator, InterfaceC9529a interfaceC9529a, int i10, AbstractC9972n abstractC9972n) {
        this(pagingConfig, (i10 & 2) != 0 ? null : obj, remoteMediator, interfaceC9529a);
    }

    public /* synthetic */ Pager(PagingConfig pagingConfig, Object obj, InterfaceC9529a interfaceC9529a, int i10, AbstractC9972n abstractC9972n) {
        this(pagingConfig, (i10 & 2) != 0 ? null : obj, interfaceC9529a);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Pager(PagingConfig config, Key key, InterfaceC9529a pagingSourceFactory) {
        this(config, key, null, pagingSourceFactory);
        AbstractC9979u.m20294g(config, "config");
        AbstractC9979u.m20294g(pagingSourceFactory, "pagingSourceFactory");
    }
}
