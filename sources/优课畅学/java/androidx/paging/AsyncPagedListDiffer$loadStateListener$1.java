package androidx.paging;

import androidx.paging.PagedList;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p123h7.C8736p;
import p300x7.InterfaceC10574p;

/* loaded from: classes3.dex */
public /* synthetic */ class AsyncPagedListDiffer$loadStateListener$1 extends FunctionReferenceImpl implements InterfaceC10574p {
    public AsyncPagedListDiffer$loadStateListener$1(Object obj) {
        super(2, obj, PagedList.LoadStateManager.class, "setState", "setState(Landroidx/paging/LoadType;Landroidx/paging/LoadState;)V", 0);
    }

    @Override // p300x7.InterfaceC10574p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((LoadType) obj, (LoadState) obj2);
        return C8736p.f16368a;
    }

    public final void invoke(LoadType p02, LoadState p12) {
        AbstractC9133u.m16133g(p02, "p0");
        AbstractC9133u.m16133g(p12, "p1");
        ((PagedList.LoadStateManager) this.receiver).setState(p02, p12);
    }
}
