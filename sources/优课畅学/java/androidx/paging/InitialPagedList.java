package androidx.paging;

import androidx.annotation.RestrictTo;
import androidx.paging.PagedList;
import androidx.paging.PagingSource;
import kotlin.jvm.internal.AbstractC9133u;
import kotlinx.coroutines.CoroutineDispatcher;
import p135i8.InterfaceC8822b0;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes3.dex */
public final class InitialPagedList<K, V> extends ContiguousPagedList<K, V> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitialPagedList(InterfaceC8822b0 coroutineScope, CoroutineDispatcher notifyDispatcher, CoroutineDispatcher backgroundDispatcher, PagedList.Config config, K k10) {
        super(new LegacyPagingSource(notifyDispatcher, new InitialDataSource()), coroutineScope, notifyDispatcher, backgroundDispatcher, null, config, PagingSource.LoadResult.Page.Companion.empty$paging_common_release(), k10);
        AbstractC9133u.m16133g(coroutineScope, "coroutineScope");
        AbstractC9133u.m16133g(notifyDispatcher, "notifyDispatcher");
        AbstractC9133u.m16133g(backgroundDispatcher, "backgroundDispatcher");
        AbstractC9133u.m16133g(config, "config");
    }
}
