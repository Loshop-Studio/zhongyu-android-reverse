package androidx.paging;

import androidx.recyclerview.widget.AdapterListUpdateCallback;
import androidx.recyclerview.widget.AsyncDifferConfig;
import androidx.recyclerview.widget.ConcatAdapter;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p123h7.InterfaceC8721a;
import p300x7.InterfaceC10574p;

@InterfaceC8721a
/* loaded from: classes3.dex */
public abstract class PagedListAdapter<T, VH extends RecyclerView.ViewHolder> extends RecyclerView.Adapter<VH> {
    private final AsyncPagedListDiffer<T> differ;
    private final InterfaceC10574p listener;

    public PagedListAdapter(DiffUtil.ItemCallback<T> diffCallback) {
        AbstractC9133u.m16133g(diffCallback, "diffCallback");
        InterfaceC10574p interfaceC10574p = new InterfaceC10574p(this) { // from class: androidx.paging.PagedListAdapter$listener$1
            final /* synthetic */ PagedListAdapter<T, VH> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
                this.this$0 = this;
            }

            @Override // p300x7.InterfaceC10574p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((PagedList) obj, (PagedList) obj2);
                return C8736p.f16368a;
            }

            public final void invoke(PagedList<T> pagedList, PagedList<T> pagedList2) {
                this.this$0.onCurrentListChanged(pagedList2);
                this.this$0.onCurrentListChanged(pagedList, pagedList2);
            }
        };
        this.listener = interfaceC10574p;
        AsyncPagedListDiffer<T> asyncPagedListDiffer = new AsyncPagedListDiffer<>(this, diffCallback);
        this.differ = asyncPagedListDiffer;
        asyncPagedListDiffer.addPagedListListener(interfaceC10574p);
    }

    public static /* synthetic */ void getCurrentList$annotations() {
    }

    public static /* synthetic */ void getDiffer$paging_runtime_release$annotations() {
    }

    private static /* synthetic */ void getListener$annotations() {
    }

    public void addLoadStateListener(InterfaceC10574p listener) {
        AbstractC9133u.m16133g(listener, "listener");
        this.differ.addLoadStateListener(listener);
    }

    public PagedList<T> getCurrentList() {
        return this.differ.getCurrentList();
    }

    public final AsyncPagedListDiffer<T> getDiffer$paging_runtime_release() {
        return this.differ;
    }

    public T getItem(int i10) {
        return this.differ.getItem(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.differ.getItemCount();
    }

    @InterfaceC8721a
    public void onCurrentListChanged(PagedList<T> pagedList) {
    }

    public void removeLoadStateListener(InterfaceC10574p listener) {
        AbstractC9133u.m16133g(listener, "listener");
        this.differ.removeLoadStateListener(listener);
    }

    public void submitList(PagedList<T> pagedList) {
        this.differ.submitList(pagedList);
    }

    public final ConcatAdapter withLoadStateFooter(final LoadStateAdapter<?> footer) {
        AbstractC9133u.m16133g(footer, "footer");
        addLoadStateListener(new InterfaceC10574p() { // from class: androidx.paging.PagedListAdapter.withLoadStateFooter.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // p300x7.InterfaceC10574p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((LoadType) obj, (LoadState) obj2);
                return C8736p.f16368a;
            }

            public final void invoke(LoadType loadType, LoadState loadState) {
                AbstractC9133u.m16133g(loadType, "loadType");
                AbstractC9133u.m16133g(loadState, "loadState");
                if (loadType == LoadType.APPEND) {
                    footer.setLoadState(loadState);
                }
            }
        });
        return new ConcatAdapter((RecyclerView.Adapter<? extends RecyclerView.ViewHolder>[]) new RecyclerView.Adapter[]{this, footer});
    }

    public final ConcatAdapter withLoadStateHeader(final LoadStateAdapter<?> header) {
        AbstractC9133u.m16133g(header, "header");
        addLoadStateListener(new InterfaceC10574p() { // from class: androidx.paging.PagedListAdapter.withLoadStateHeader.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // p300x7.InterfaceC10574p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((LoadType) obj, (LoadState) obj2);
                return C8736p.f16368a;
            }

            public final void invoke(LoadType loadType, LoadState loadState) {
                AbstractC9133u.m16133g(loadType, "loadType");
                AbstractC9133u.m16133g(loadState, "loadState");
                if (loadType == LoadType.PREPEND) {
                    header.setLoadState(loadState);
                }
            }
        });
        return new ConcatAdapter((RecyclerView.Adapter<? extends RecyclerView.ViewHolder>[]) new RecyclerView.Adapter[]{header, this});
    }

    public final ConcatAdapter withLoadStateHeaderAndFooter(final LoadStateAdapter<?> header, final LoadStateAdapter<?> footer) {
        AbstractC9133u.m16133g(header, "header");
        AbstractC9133u.m16133g(footer, "footer");
        addLoadStateListener(new InterfaceC10574p() { // from class: androidx.paging.PagedListAdapter.withLoadStateHeaderAndFooter.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // p300x7.InterfaceC10574p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((LoadType) obj, (LoadState) obj2);
                return C8736p.f16368a;
            }

            public final void invoke(LoadType loadType, LoadState loadState) {
                AbstractC9133u.m16133g(loadType, "loadType");
                AbstractC9133u.m16133g(loadState, "loadState");
                if (loadType == LoadType.PREPEND) {
                    header.setLoadState(loadState);
                } else if (loadType == LoadType.APPEND) {
                    footer.setLoadState(loadState);
                }
            }
        });
        return new ConcatAdapter((RecyclerView.Adapter<? extends RecyclerView.ViewHolder>[]) new RecyclerView.Adapter[]{header, this, footer});
    }

    public void onCurrentListChanged(PagedList<T> pagedList, PagedList<T> pagedList2) {
    }

    public void submitList(PagedList<T> pagedList, Runnable runnable) {
        this.differ.submitList(pagedList, runnable);
    }

    public PagedListAdapter(AsyncDifferConfig<T> config) {
        AbstractC9133u.m16133g(config, "config");
        InterfaceC10574p interfaceC10574p = new InterfaceC10574p(this) { // from class: androidx.paging.PagedListAdapter$listener$1
            final /* synthetic */ PagedListAdapter<T, VH> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
                this.this$0 = this;
            }

            @Override // p300x7.InterfaceC10574p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((PagedList) obj, (PagedList) obj2);
                return C8736p.f16368a;
            }

            public final void invoke(PagedList<T> pagedList, PagedList<T> pagedList2) {
                this.this$0.onCurrentListChanged(pagedList2);
                this.this$0.onCurrentListChanged(pagedList, pagedList2);
            }
        };
        this.listener = interfaceC10574p;
        AsyncPagedListDiffer<T> asyncPagedListDiffer = new AsyncPagedListDiffer<>(new AdapterListUpdateCallback(this), config);
        this.differ = asyncPagedListDiffer;
        asyncPagedListDiffer.addPagedListListener(interfaceC10574p);
    }
}
