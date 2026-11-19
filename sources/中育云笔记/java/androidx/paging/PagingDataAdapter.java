package androidx.paging;

import androidx.annotation.IntRange;
import androidx.annotation.MainThread;
import androidx.lifecycle.Lifecycle;
import androidx.paging.LoadState;
import androidx.recyclerview.widget.AdapterListUpdateCallback;
import androidx.recyclerview.widget.ConcatAdapter;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import kotlin.coroutines.InterfaceC9945d;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;
import p309qc.InterfaceC10770a;
import p379vd.InterfaceC11594c;
import p393wc.AbstractC11725a;
import sd.AbstractC11106e0;
import sd.C11157r0;
import vc.InterfaceC11588c;

/* loaded from: classes3.dex */
public abstract class PagingDataAdapter<T, VH extends RecyclerView.ViewHolder> extends RecyclerView.Adapter<VH> {
    private final AsyncPagingDataDiffer<T> differ;
    private final InterfaceC11594c loadStateFlow;
    private final InterfaceC11594c onPagesUpdatedFlow;
    private boolean userSetRestorationPolicy;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PagingDataAdapter(DiffUtil.ItemCallback<T> diffCallback) {
        this(diffCallback, (InterfaceC9945d) null, (InterfaceC9945d) null, 6, (AbstractC9972n) null);
        AbstractC9979u.m20294g(diffCallback, "diffCallback");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T, VH extends RecyclerView.ViewHolder> void _init_$considerAllowingStateRestoration(PagingDataAdapter<T, VH> pagingDataAdapter) {
        if (pagingDataAdapter.getStateRestorationPolicy() != RecyclerView.Adapter.StateRestorationPolicy.PREVENT || ((PagingDataAdapter) pagingDataAdapter).userSetRestorationPolicy) {
            return;
        }
        pagingDataAdapter.setStateRestorationPolicy(RecyclerView.Adapter.StateRestorationPolicy.ALLOW);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C10786q withLoadStateFooter$lambda$0(LoadStateAdapter loadStateAdapter, CombinedLoadStates loadStates) {
        AbstractC9979u.m20294g(loadStates, "loadStates");
        loadStateAdapter.setLoadState(loadStates.getAppend());
        return C10786q.f26013a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C10786q withLoadStateHeader$lambda$0(LoadStateAdapter loadStateAdapter, CombinedLoadStates loadStates) {
        AbstractC9979u.m20294g(loadStates, "loadStates");
        loadStateAdapter.setLoadState(loadStates.getPrepend());
        return C10786q.f26013a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C10786q withLoadStateHeaderAndFooter$lambda$0(LoadStateAdapter loadStateAdapter, LoadStateAdapter loadStateAdapter2, CombinedLoadStates loadStates) {
        AbstractC9979u.m20294g(loadStates, "loadStates");
        loadStateAdapter.setLoadState(loadStates.getPrepend());
        loadStateAdapter2.setLoadState(loadStates.getAppend());
        return C10786q.f26013a;
    }

    public final void addLoadStateListener(InterfaceC9540l listener) {
        AbstractC9979u.m20294g(listener, "listener");
        this.differ.addLoadStateListener(listener);
    }

    public final void addOnPagesUpdatedListener(InterfaceC9529a listener) {
        AbstractC9979u.m20294g(listener, "listener");
        this.differ.addOnPagesUpdatedListener(listener);
    }

    @MainThread
    public final T getItem(@IntRange(from = 0) int i10) {
        return this.differ.getItem(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.differ.getItemCount();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i10) {
        return super.getItemId(i10);
    }

    public final InterfaceC11594c getLoadStateFlow() {
        return this.loadStateFlow;
    }

    public final InterfaceC11594c getOnPagesUpdatedFlow() {
        return this.onPagesUpdatedFlow;
    }

    @MainThread
    public final T peek(@IntRange(from = 0) int i10) {
        return this.differ.peek(i10);
    }

    public final void refresh() {
        this.differ.refresh();
    }

    public final void removeLoadStateListener(InterfaceC9540l listener) {
        AbstractC9979u.m20294g(listener, "listener");
        this.differ.removeLoadStateListener(listener);
    }

    public final void removeOnPagesUpdatedListener(InterfaceC9529a listener) {
        AbstractC9979u.m20294g(listener, "listener");
        this.differ.removeOnPagesUpdatedListener(listener);
    }

    public final void retry() {
        this.differ.retry();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void setHasStableIds(boolean z10) {
        throw new UnsupportedOperationException("Stable ids are unsupported on PagingDataAdapter.");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void setStateRestorationPolicy(RecyclerView.Adapter.StateRestorationPolicy strategy) {
        AbstractC9979u.m20294g(strategy, "strategy");
        this.userSetRestorationPolicy = true;
        super.setStateRestorationPolicy(strategy);
    }

    public final ItemSnapshotList<T> snapshot() {
        return this.differ.snapshot();
    }

    public final Object submitData(PagingData<T> pagingData, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        Object objSubmitData = this.differ.submitData(pagingData, interfaceC11588c);
        return objSubmitData == AbstractC11725a.m25952f() ? objSubmitData : C10786q.f26013a;
    }

    public final ConcatAdapter withLoadStateFooter(final LoadStateAdapter<?> footer) {
        AbstractC9979u.m20294g(footer, "footer");
        addLoadStateListener(new InterfaceC9540l() { // from class: androidx.paging.v0
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return PagingDataAdapter.withLoadStateFooter$lambda$0(footer, (CombinedLoadStates) obj);
            }
        });
        return new ConcatAdapter((RecyclerView.Adapter<? extends RecyclerView.ViewHolder>[]) new RecyclerView.Adapter[]{this, footer});
    }

    public final ConcatAdapter withLoadStateHeader(final LoadStateAdapter<?> header) {
        AbstractC9979u.m20294g(header, "header");
        addLoadStateListener(new InterfaceC9540l() { // from class: androidx.paging.x0
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return PagingDataAdapter.withLoadStateHeader$lambda$0(header, (CombinedLoadStates) obj);
            }
        });
        return new ConcatAdapter((RecyclerView.Adapter<? extends RecyclerView.ViewHolder>[]) new RecyclerView.Adapter[]{header, this});
    }

    public final ConcatAdapter withLoadStateHeaderAndFooter(final LoadStateAdapter<?> header, final LoadStateAdapter<?> footer) {
        AbstractC9979u.m20294g(header, "header");
        AbstractC9979u.m20294g(footer, "footer");
        addLoadStateListener(new InterfaceC9540l() { // from class: androidx.paging.w0
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return PagingDataAdapter.withLoadStateHeaderAndFooter$lambda$0(header, footer, (CombinedLoadStates) obj);
            }
        });
        return new ConcatAdapter((RecyclerView.Adapter<? extends RecyclerView.ViewHolder>[]) new RecyclerView.Adapter[]{header, this, footer});
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PagingDataAdapter(DiffUtil.ItemCallback<T> diffCallback, InterfaceC9945d mainDispatcher) {
        this(diffCallback, mainDispatcher, (InterfaceC9945d) null, 4, (AbstractC9972n) null);
        AbstractC9979u.m20294g(diffCallback, "diffCallback");
        AbstractC9979u.m20294g(mainDispatcher, "mainDispatcher");
    }

    public final void submitData(Lifecycle lifecycle, PagingData<T> pagingData) {
        AbstractC9979u.m20294g(lifecycle, "lifecycle");
        AbstractC9979u.m20294g(pagingData, "pagingData");
        this.differ.submitData(lifecycle, pagingData);
    }

    public PagingDataAdapter(DiffUtil.ItemCallback<T> diffCallback, InterfaceC9945d mainDispatcher, InterfaceC9945d workerDispatcher) {
        AbstractC9979u.m20294g(diffCallback, "diffCallback");
        AbstractC9979u.m20294g(mainDispatcher, "mainDispatcher");
        AbstractC9979u.m20294g(workerDispatcher, "workerDispatcher");
        AsyncPagingDataDiffer<T> asyncPagingDataDiffer = new AsyncPagingDataDiffer<>(diffCallback, new AdapterListUpdateCallback(this), mainDispatcher, workerDispatcher);
        this.differ = asyncPagingDataDiffer;
        super.setStateRestorationPolicy(RecyclerView.Adapter.StateRestorationPolicy.PREVENT);
        registerAdapterDataObserver(new RecyclerView.AdapterDataObserver(this) { // from class: androidx.paging.PagingDataAdapter.1
            final /* synthetic */ PagingDataAdapter<T, VH> this$0;

            {
                this.this$0 = this;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public void onItemRangeInserted(int i10, int i11) {
                PagingDataAdapter._init_$considerAllowingStateRestoration(this.this$0);
                this.this$0.unregisterAdapterDataObserver(this);
                super.onItemRangeInserted(i10, i11);
            }
        });
        addLoadStateListener(new InterfaceC9540l(this) { // from class: androidx.paging.PagingDataAdapter.2
            private boolean ignoreNextEvent = true;
            final /* synthetic */ PagingDataAdapter<T, VH> this$0;

            {
                this.this$0 = this;
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((CombinedLoadStates) obj);
                return C10786q.f26013a;
            }

            public void invoke(CombinedLoadStates loadStates) {
                AbstractC9979u.m20294g(loadStates, "loadStates");
                if (this.ignoreNextEvent) {
                    this.ignoreNextEvent = false;
                } else if (loadStates.getSource().getRefresh() instanceof LoadState.NotLoading) {
                    PagingDataAdapter._init_$considerAllowingStateRestoration(this.this$0);
                    this.this$0.removeLoadStateListener(this);
                }
            }
        });
        this.loadStateFlow = asyncPagingDataDiffer.getLoadStateFlow();
        this.onPagesUpdatedFlow = asyncPagingDataDiffer.getOnPagesUpdatedFlow();
    }

    public /* synthetic */ PagingDataAdapter(DiffUtil.ItemCallback itemCallback, InterfaceC9945d interfaceC9945d, InterfaceC9945d interfaceC9945d2, int i10, AbstractC9972n abstractC9972n) {
        this(itemCallback, (i10 & 2) != 0 ? C11157r0.m24800c() : interfaceC9945d, (i10 & 4) != 0 ? C11157r0.m24798a() : interfaceC9945d2);
    }

    public /* synthetic */ PagingDataAdapter(DiffUtil.ItemCallback itemCallback, AbstractC11106e0 abstractC11106e0, int i10, AbstractC9972n abstractC9972n) {
        this(itemCallback, (i10 & 2) != 0 ? C11157r0.m24800c() : abstractC11106e0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @InterfaceC10770a
    public /* synthetic */ PagingDataAdapter(DiffUtil.ItemCallback diffCallback, AbstractC11106e0 mainDispatcher) {
        this(diffCallback, (InterfaceC9945d) mainDispatcher, (InterfaceC9945d) C11157r0.m24798a());
        AbstractC9979u.m20294g(diffCallback, "diffCallback");
        AbstractC9979u.m20294g(mainDispatcher, "mainDispatcher");
    }

    public /* synthetic */ PagingDataAdapter(DiffUtil.ItemCallback itemCallback, AbstractC11106e0 abstractC11106e0, AbstractC11106e0 abstractC11106e02, int i10, AbstractC9972n abstractC9972n) {
        this(itemCallback, (i10 & 2) != 0 ? C11157r0.m24800c() : abstractC11106e0, (i10 & 4) != 0 ? C11157r0.m24798a() : abstractC11106e02);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @InterfaceC10770a
    public /* synthetic */ PagingDataAdapter(DiffUtil.ItemCallback diffCallback, AbstractC11106e0 mainDispatcher, AbstractC11106e0 workerDispatcher) {
        this(diffCallback, (InterfaceC9945d) mainDispatcher, (InterfaceC9945d) workerDispatcher);
        AbstractC9979u.m20294g(diffCallback, "diffCallback");
        AbstractC9979u.m20294g(mainDispatcher, "mainDispatcher");
        AbstractC9979u.m20294g(workerDispatcher, "workerDispatcher");
    }
}
