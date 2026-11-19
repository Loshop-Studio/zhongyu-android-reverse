package androidx.paging;

import androidx.annotation.VisibleForTesting;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p134i7.AbstractC8778f0;
import p134i7.AbstractC8809v;
import p300x7.InterfaceC10559a;

/* loaded from: classes3.dex */
public final class InvalidatingPagingSourceFactory<Key, Value> implements PagingSourceFactory<Key, Value> {
    private final ReentrantLock lock;
    private final InterfaceC10559a pagingSourceFactory;
    private List<? extends PagingSource<Key, Value>> pagingSources;

    public InvalidatingPagingSourceFactory(InterfaceC10559a pagingSourceFactory) {
        AbstractC9133u.m16133g(pagingSourceFactory, "pagingSourceFactory");
        this.pagingSourceFactory = pagingSourceFactory;
        this.lock = new ReentrantLock();
        this.pagingSources = AbstractC8809v.m14771n();
    }

    public final void invalidate() {
        ReentrantLock reentrantLock = this.lock;
        try {
            reentrantLock.lock();
            List<? extends PagingSource<Key, Value>> list = this.pagingSources;
            this.pagingSources = AbstractC8809v.m14771n();
            reentrantLock.unlock();
            for (PagingSource<Key, Value> pagingSource : list) {
                if (!pagingSource.getInvalid()) {
                    pagingSource.invalidate();
                }
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @VisibleForTesting
    public final List<PagingSource<Key, Value>> pagingSources$paging_common_release() {
        return this.pagingSources;
    }

    @Override // androidx.paging.PagingSourceFactory, p300x7.InterfaceC10559a
    public PagingSource<Key, Value> invoke() {
        PagingSource<Key, Value> pagingSource = (PagingSource) this.pagingSourceFactory.invoke();
        ReentrantLock reentrantLock = this.lock;
        try {
            reentrantLock.lock();
            this.pagingSources = AbstractC8778f0.m14530G0(this.pagingSources, pagingSource);
            C8736p c8736p = C8736p.f16368a;
            return pagingSource;
        } finally {
            reentrantLock.unlock();
        }
    }
}
