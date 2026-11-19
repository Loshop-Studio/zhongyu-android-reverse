package androidx.paging;

import androidx.paging.PagedList;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;

/* loaded from: classes3.dex */
public final /* synthetic */ class AsyncPagedListDiffer$loadStateListener$1 extends FunctionReferenceImpl implements InterfaceC9544p {
    public AsyncPagedListDiffer$loadStateListener$1(Object obj) {
        super(2, obj, PagedList.LoadStateManager.class, "setState", "setState(Landroidx/paging/LoadType;Landroidx/paging/LoadState;)V", 0);
    }

    @Override // p181hd.InterfaceC9544p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((LoadType) obj, (LoadState) obj2);
        return C10786q.f26013a;
    }

    public final void invoke(LoadType p02, LoadState p12) {
        AbstractC9979u.m20294g(p02, "p0");
        AbstractC9979u.m20294g(p12, "p1");
        ((PagedList.LoadStateManager) this.receiver).setState(p02, p12);
    }
}
