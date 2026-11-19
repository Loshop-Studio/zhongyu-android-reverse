package androidx.paging.compose;

import androidx.compose.p013ui.platform.AndroidUiDispatcher;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.paging.CombinedLoadStates;
import androidx.paging.ItemSnapshotList;
import androidx.paging.PagingData;
import androidx.paging.PagingDataEvent;
import androidx.paging.PagingDataPresenter;
import kotlin.coroutines.InterfaceC9100d;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p134i7.AbstractC8778f0;
import p169l8.AbstractC9268e;
import p169l8.InterfaceC9266c;
import p169l8.InterfaceC9267d;
import p169l8.InterfaceC9275l;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;

@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class LazyPagingItems<T> {
    public static final int $stable = 8;
    private final InterfaceC9266c flow;
    private final MutableState itemSnapshotList$delegate;
    private final MutableState loadState$delegate;
    private final InterfaceC9100d mainDispatcher;
    private final LazyPagingItems$pagingDataPresenter$1 pagingDataPresenter;

    public LazyPagingItems(InterfaceC9266c flow) {
        AbstractC9133u.m16133g(flow, "flow");
        this.flow = flow;
        final InterfaceC9100d main = AndroidUiDispatcher.Companion.getMain();
        this.mainDispatcher = main;
        final PagingData pagingData = flow instanceof InterfaceC9275l ? (PagingData) AbstractC8778f0.m14568n0(((InterfaceC9275l) flow).mo16672d()) : null;
        PagingDataPresenter<T> pagingDataPresenter = new PagingDataPresenter<T>(this, main, pagingData) { // from class: androidx.paging.compose.LazyPagingItems$pagingDataPresenter$1
            final /* synthetic */ LazyPagingItems<T> this$0;

            {
                this.this$0 = this;
            }

            @Override // androidx.paging.PagingDataPresenter
            public Object presentPagingDataEvent(PagingDataEvent<T> pagingDataEvent, InterfaceC9324c<? super C8736p> interfaceC9324c) {
                this.this$0.updateItemSnapshotList();
                return C8736p.f16368a;
            }
        };
        this.pagingDataPresenter = pagingDataPresenter;
        this.itemSnapshotList$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(pagingDataPresenter.snapshot(), null, 2, null);
        CombinedLoadStates combinedLoadStates = (CombinedLoadStates) pagingDataPresenter.getLoadStateFlow().getValue();
        this.loadState$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(combinedLoadStates == null ? new CombinedLoadStates(LazyPagingItemsKt.InitialLoadStates.getRefresh(), LazyPagingItemsKt.InitialLoadStates.getPrepend(), LazyPagingItemsKt.InitialLoadStates.getAppend(), LazyPagingItemsKt.InitialLoadStates, null, 16, null) : combinedLoadStates, null, 2, null);
    }

    private final void setItemSnapshotList(ItemSnapshotList<T> itemSnapshotList) {
        this.itemSnapshotList$delegate.setValue(itemSnapshotList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setLoadState(CombinedLoadStates combinedLoadStates) {
        this.loadState$delegate.setValue(combinedLoadStates);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateItemSnapshotList() {
        setItemSnapshotList(snapshot());
    }

    public final Object collectLoadState$paging_compose_release(InterfaceC9324c<? super C8736p> interfaceC9324c) {
        Object objCollect = AbstractC9268e.m17033w(getLoadStateFlow()).collect(new InterfaceC9267d(this) { // from class: androidx.paging.compose.LazyPagingItems$collectLoadState$2
            final /* synthetic */ LazyPagingItems<T> this$0;

            {
                this.this$0 = this;
            }

            @Override // p169l8.InterfaceC9267d
            public /* bridge */ /* synthetic */ Object emit(Object obj, InterfaceC9324c interfaceC9324c2) {
                return emit((CombinedLoadStates) obj, (InterfaceC9324c<? super C8736p>) interfaceC9324c2);
            }

            public final Object emit(CombinedLoadStates combinedLoadStates, InterfaceC9324c<? super C8736p> interfaceC9324c2) {
                this.this$0.setLoadState(combinedLoadStates);
                return C8736p.f16368a;
            }
        }, interfaceC9324c);
        return objCollect == AbstractC9434a.m17291f() ? objCollect : C8736p.f16368a;
    }

    public final Object collectPagingData$paging_compose_release(InterfaceC9324c<? super C8736p> interfaceC9324c) {
        Object objM17019i = AbstractC9268e.m17019i(this.flow, new LazyPagingItems$collectPagingData$2(this, null), interfaceC9324c);
        return objM17019i == AbstractC9434a.m17291f() ? objM17019i : C8736p.f16368a;
    }

    public final T get(int i10) {
        get(i10);
        return getItemSnapshotList().get(i10);
    }

    public final int getItemCount() {
        return getItemSnapshotList().size();
    }

    public final ItemSnapshotList<T> getItemSnapshotList() {
        return (ItemSnapshotList) this.itemSnapshotList$delegate.getValue();
    }

    public final CombinedLoadStates getLoadState() {
        return (CombinedLoadStates) this.loadState$delegate.getValue();
    }

    public final T peek(int i10) {
        return getItemSnapshotList().get(i10);
    }

    public final void refresh() {
        refresh();
    }

    public final void retry() {
        retry();
    }
}
