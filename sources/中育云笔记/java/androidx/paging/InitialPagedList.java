package androidx.paging;

import androidx.annotation.RestrictTo;
import androidx.paging.PagedList;
import androidx.paging.PagingSource;
import kotlin.jvm.internal.AbstractC9979u;
import sd.AbstractC11106e0;
import sd.InterfaceC11122i0;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes3.dex */
public final class InitialPagedList<K, V> extends ContiguousPagedList<K, V> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitialPagedList(InterfaceC11122i0 coroutineScope, AbstractC11106e0 notifyDispatcher, AbstractC11106e0 backgroundDispatcher, PagedList.Config config, K k10) {
        super(new LegacyPagingSource(notifyDispatcher, new InitialDataSource()), coroutineScope, notifyDispatcher, backgroundDispatcher, null, config, PagingSource.LoadResult.Page.Companion.empty$paging_common(), k10);
        AbstractC9979u.m20294g(coroutineScope, "coroutineScope");
        AbstractC9979u.m20294g(notifyDispatcher, "notifyDispatcher");
        AbstractC9979u.m20294g(backgroundDispatcher, "backgroundDispatcher");
        AbstractC9979u.m20294g(config, "config");
    }
}
