package androidx.paging;

import androidx.annotation.VisibleForTesting;
import androidx.paging.internal.SynchronizedLock;
import java.util.List;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p309qc.C10786q;
import p325rc.AbstractC10947g0;
import p325rc.AbstractC10978w;

/* loaded from: classes3.dex */
public final class InvalidatingPagingSourceFactory<Key, Value> implements PagingSourceFactory<Key, Value> {
    private final SynchronizedLock lock;
    private final InterfaceC9529a pagingSourceFactory;
    private List<? extends PagingSource<Key, Value>> pagingSources;

    public InvalidatingPagingSourceFactory(InterfaceC9529a pagingSourceFactory) {
        AbstractC9979u.m20294g(pagingSourceFactory, "pagingSourceFactory");
        this.pagingSourceFactory = pagingSourceFactory;
        this.lock = new SynchronizedLock();
        this.pagingSources = AbstractC10978w.m24136n();
    }

    public final void invalidate() {
        List<? extends PagingSource<Key, Value>> list;
        synchronized (this.lock) {
            list = this.pagingSources;
            this.pagingSources = AbstractC10978w.m24136n();
        }
        for (PagingSource<Key, Value> pagingSource : list) {
            if (!pagingSource.getInvalid()) {
                pagingSource.invalidate();
            }
        }
    }

    @VisibleForTesting
    public final List<PagingSource<Key, Value>> pagingSources$paging_common() {
        return this.pagingSources;
    }

    @Override // androidx.paging.PagingSourceFactory, p181hd.InterfaceC9529a
    public PagingSource<Key, Value> invoke() {
        PagingSource<Key, Value> pagingSource = (PagingSource) this.pagingSourceFactory.invoke();
        synchronized (this.lock) {
            this.pagingSources = AbstractC10947g0.m23907I0(this.pagingSources, pagingSource);
            C10786q c10786q = C10786q.f26013a;
        }
        return pagingSource;
    }
}
