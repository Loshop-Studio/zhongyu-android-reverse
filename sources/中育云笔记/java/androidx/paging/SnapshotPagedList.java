package androidx.paging;

import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9544p;

/* loaded from: classes3.dex */
public final class SnapshotPagedList<T> extends PagedList<T> {
    private final boolean isDetached;
    private final boolean isImmutable;
    private final PagedList<T> pagedList;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapshotPagedList(PagedList<T> pagedList) {
        super(pagedList.getPagingSource(), pagedList.getCoroutineScope$paging_common(), pagedList.getNotifyDispatcher$paging_common(), pagedList.getStorage$paging_common().snapshot(), pagedList.getConfig());
        AbstractC9979u.m20294g(pagedList, "pagedList");
        this.pagedList = pagedList;
        this.isImmutable = true;
        this.isDetached = true;
    }

    @Override // androidx.paging.PagedList
    public void detach() {
    }

    @Override // androidx.paging.PagedList
    public void dispatchCurrentLoadState(InterfaceC9544p callback) {
        AbstractC9979u.m20294g(callback, "callback");
    }

    @Override // androidx.paging.PagedList
    public Object getLastKey() {
        return this.pagedList.getLastKey();
    }

    @Override // androidx.paging.PagedList
    public boolean isDetached() {
        return this.isDetached;
    }

    @Override // androidx.paging.PagedList
    public boolean isImmutable() {
        return this.isImmutable;
    }

    @Override // androidx.paging.PagedList
    public void loadAroundInternal(int i10) {
    }
}
