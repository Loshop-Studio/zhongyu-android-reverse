package androidx.paging;

import androidx.recyclerview.widget.AdapterListUpdateCallback;
import androidx.recyclerview.widget.AsyncDifferConfig;
import androidx.recyclerview.widget.ConcatAdapter;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p309qc.InterfaceC10770a;

@InterfaceC10770a
/* loaded from: classes3.dex */
public abstract class PagedListAdapter<T, VH extends RecyclerView.ViewHolder> extends RecyclerView.Adapter<VH> {
    private final AsyncPagedListDiffer<T> differ;
    private final InterfaceC9544p listener;

    public PagedListAdapter(DiffUtil.ItemCallback<T> diffCallback) {
        AbstractC9979u.m20294g(diffCallback, "diffCallback");
        InterfaceC9544p interfaceC9544p = new InterfaceC9544p() { // from class: androidx.paging.n0
            @Override // p181hd.InterfaceC9544p
            public final Object invoke(Object obj, Object obj2) {
                return PagedListAdapter.listener$lambda$0(this.f1939c, (PagedList) obj, (PagedList) obj2);
            }
        };
        this.listener = interfaceC9544p;
        AsyncPagedListDiffer<T> asyncPagedListDiffer = new AsyncPagedListDiffer<>(this, diffCallback);
        this.differ = asyncPagedListDiffer;
        asyncPagedListDiffer.addPagedListListener(interfaceC9544p);
    }

    public static /* synthetic */ void getCurrentList$annotations() {
    }

    public static /* synthetic */ void getDiffer$paging_runtime$annotations() {
    }

    private static /* synthetic */ void getListener$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C10786q listener$lambda$0(PagedListAdapter pagedListAdapter, PagedList pagedList, PagedList pagedList2) {
        pagedListAdapter.onCurrentListChanged(pagedList2);
        pagedListAdapter.onCurrentListChanged(pagedList, pagedList2);
        return C10786q.f26013a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C10786q withLoadStateFooter$lambda$0(LoadStateAdapter loadStateAdapter, LoadType loadType, LoadState loadState) {
        AbstractC9979u.m20294g(loadType, "loadType");
        AbstractC9979u.m20294g(loadState, "loadState");
        if (loadType == LoadType.APPEND) {
            loadStateAdapter.setLoadState(loadState);
        }
        return C10786q.f26013a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C10786q withLoadStateHeader$lambda$0(LoadStateAdapter loadStateAdapter, LoadType loadType, LoadState loadState) {
        AbstractC9979u.m20294g(loadType, "loadType");
        AbstractC9979u.m20294g(loadState, "loadState");
        if (loadType == LoadType.PREPEND) {
            loadStateAdapter.setLoadState(loadState);
        }
        return C10786q.f26013a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C10786q withLoadStateHeaderAndFooter$lambda$0(LoadStateAdapter loadStateAdapter, LoadStateAdapter loadStateAdapter2, LoadType loadType, LoadState loadState) {
        AbstractC9979u.m20294g(loadType, "loadType");
        AbstractC9979u.m20294g(loadState, "loadState");
        if (loadType == LoadType.PREPEND) {
            loadStateAdapter.setLoadState(loadState);
        } else if (loadType == LoadType.APPEND) {
            loadStateAdapter2.setLoadState(loadState);
        }
        return C10786q.f26013a;
    }

    public void addLoadStateListener(InterfaceC9544p listener) {
        AbstractC9979u.m20294g(listener, "listener");
        this.differ.addLoadStateListener(listener);
    }

    public PagedList<T> getCurrentList() {
        return this.differ.getCurrentList();
    }

    public final AsyncPagedListDiffer<T> getDiffer$paging_runtime() {
        return this.differ;
    }

    public T getItem(int i10) {
        return this.differ.getItem(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.differ.getItemCount();
    }

    @InterfaceC10770a
    public void onCurrentListChanged(PagedList<T> pagedList) {
    }

    public void removeLoadStateListener(InterfaceC9544p listener) {
        AbstractC9979u.m20294g(listener, "listener");
        this.differ.removeLoadStateListener(listener);
    }

    public void submitList(PagedList<T> pagedList) {
        this.differ.submitList(pagedList);
    }

    public final ConcatAdapter withLoadStateFooter(final LoadStateAdapter<?> footer) {
        AbstractC9979u.m20294g(footer, "footer");
        addLoadStateListener(new InterfaceC9544p() { // from class: androidx.paging.p0
            @Override // p181hd.InterfaceC9544p
            public final Object invoke(Object obj, Object obj2) {
                return PagedListAdapter.withLoadStateFooter$lambda$0(footer, (LoadType) obj, (LoadState) obj2);
            }
        });
        return new ConcatAdapter((RecyclerView.Adapter<? extends RecyclerView.ViewHolder>[]) new RecyclerView.Adapter[]{this, footer});
    }

    public final ConcatAdapter withLoadStateHeader(final LoadStateAdapter<?> header) {
        AbstractC9979u.m20294g(header, "header");
        addLoadStateListener(new InterfaceC9544p() { // from class: androidx.paging.o0
            @Override // p181hd.InterfaceC9544p
            public final Object invoke(Object obj, Object obj2) {
                return PagedListAdapter.withLoadStateHeader$lambda$0(header, (LoadType) obj, (LoadState) obj2);
            }
        });
        return new ConcatAdapter((RecyclerView.Adapter<? extends RecyclerView.ViewHolder>[]) new RecyclerView.Adapter[]{header, this});
    }

    public final ConcatAdapter withLoadStateHeaderAndFooter(final LoadStateAdapter<?> header, final LoadStateAdapter<?> footer) {
        AbstractC9979u.m20294g(header, "header");
        AbstractC9979u.m20294g(footer, "footer");
        addLoadStateListener(new InterfaceC9544p() { // from class: androidx.paging.q0
            @Override // p181hd.InterfaceC9544p
            public final Object invoke(Object obj, Object obj2) {
                return PagedListAdapter.withLoadStateHeaderAndFooter$lambda$0(header, footer, (LoadType) obj, (LoadState) obj2);
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
        AbstractC9979u.m20294g(config, "config");
        InterfaceC9544p interfaceC9544p = new InterfaceC9544p() { // from class: androidx.paging.n0
            @Override // p181hd.InterfaceC9544p
            public final Object invoke(Object obj, Object obj2) {
                return PagedListAdapter.listener$lambda$0(this.f1939c, (PagedList) obj, (PagedList) obj2);
            }
        };
        this.listener = interfaceC9544p;
        AsyncPagedListDiffer<T> asyncPagedListDiffer = new AsyncPagedListDiffer<>(new AdapterListUpdateCallback(this), config);
        this.differ = asyncPagedListDiffer;
        asyncPagedListDiffer.addPagedListListener(interfaceC9544p);
    }
}
