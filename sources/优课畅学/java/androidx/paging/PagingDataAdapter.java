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
import kotlin.coroutines.InterfaceC9100d;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import kotlinx.coroutines.CoroutineDispatcher;
import p123h7.C8736p;
import p123h7.InterfaceC8721a;
import p135i8.C8843i0;
import p169l8.InterfaceC9266c;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;

/* loaded from: classes3.dex */
public abstract class PagingDataAdapter<T, VH extends RecyclerView.ViewHolder> extends RecyclerView.Adapter<VH> {
    private final AsyncPagingDataDiffer<T> differ;
    private final InterfaceC9266c loadStateFlow;
    private final InterfaceC9266c onPagesUpdatedFlow;
    private boolean userSetRestorationPolicy;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PagingDataAdapter(DiffUtil.ItemCallback<T> diffCallback) {
        this(diffCallback, (InterfaceC9100d) null, (InterfaceC9100d) null, 6, (AbstractC9126n) null);
        AbstractC9133u.m16133g(diffCallback, "diffCallback");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T, VH extends RecyclerView.ViewHolder> void _init_$considerAllowingStateRestoration(PagingDataAdapter<T, VH> pagingDataAdapter) {
        if (pagingDataAdapter.getStateRestorationPolicy() != RecyclerView.Adapter.StateRestorationPolicy.PREVENT || ((PagingDataAdapter) pagingDataAdapter).userSetRestorationPolicy) {
            return;
        }
        pagingDataAdapter.setStateRestorationPolicy(RecyclerView.Adapter.StateRestorationPolicy.ALLOW);
    }

    public final void addLoadStateListener(InterfaceC10570l listener) {
        AbstractC9133u.m16133g(listener, "listener");
        this.differ.addLoadStateListener(listener);
    }

    public final void addOnPagesUpdatedListener(InterfaceC10559a listener) {
        AbstractC9133u.m16133g(listener, "listener");
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

    public final InterfaceC9266c getLoadStateFlow() {
        return this.loadStateFlow;
    }

    public final InterfaceC9266c getOnPagesUpdatedFlow() {
        return this.onPagesUpdatedFlow;
    }

    @MainThread
    public final T peek(@IntRange(from = 0) int i10) {
        return this.differ.peek(i10);
    }

    public final void refresh() {
        this.differ.refresh();
    }

    public final void removeLoadStateListener(InterfaceC10570l listener) {
        AbstractC9133u.m16133g(listener, "listener");
        this.differ.removeLoadStateListener(listener);
    }

    public final void removeOnPagesUpdatedListener(InterfaceC10559a listener) {
        AbstractC9133u.m16133g(listener, "listener");
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
        AbstractC9133u.m16133g(strategy, "strategy");
        this.userSetRestorationPolicy = true;
        super.setStateRestorationPolicy(strategy);
    }

    public final ItemSnapshotList<T> snapshot() {
        return this.differ.snapshot();
    }

    public final Object submitData(PagingData<T> pagingData, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        Object objSubmitData = this.differ.submitData(pagingData, interfaceC9324c);
        return objSubmitData == AbstractC9434a.m17291f() ? objSubmitData : C8736p.f16368a;
    }

    public final ConcatAdapter withLoadStateFooter(final LoadStateAdapter<?> footer) {
        AbstractC9133u.m16133g(footer, "footer");
        addLoadStateListener(new InterfaceC10570l() { // from class: androidx.paging.PagingDataAdapter.withLoadStateFooter.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((CombinedLoadStates) obj);
                return C8736p.f16368a;
            }

            public final void invoke(CombinedLoadStates loadStates) {
                AbstractC9133u.m16133g(loadStates, "loadStates");
                footer.setLoadState(loadStates.getAppend());
            }
        });
        return new ConcatAdapter((RecyclerView.Adapter<? extends RecyclerView.ViewHolder>[]) new RecyclerView.Adapter[]{this, footer});
    }

    public final ConcatAdapter withLoadStateHeader(final LoadStateAdapter<?> header) {
        AbstractC9133u.m16133g(header, "header");
        addLoadStateListener(new InterfaceC10570l() { // from class: androidx.paging.PagingDataAdapter.withLoadStateHeader.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((CombinedLoadStates) obj);
                return C8736p.f16368a;
            }

            public final void invoke(CombinedLoadStates loadStates) {
                AbstractC9133u.m16133g(loadStates, "loadStates");
                header.setLoadState(loadStates.getPrepend());
            }
        });
        return new ConcatAdapter((RecyclerView.Adapter<? extends RecyclerView.ViewHolder>[]) new RecyclerView.Adapter[]{header, this});
    }

    public final ConcatAdapter withLoadStateHeaderAndFooter(final LoadStateAdapter<?> header, final LoadStateAdapter<?> footer) {
        AbstractC9133u.m16133g(header, "header");
        AbstractC9133u.m16133g(footer, "footer");
        addLoadStateListener(new InterfaceC10570l() { // from class: androidx.paging.PagingDataAdapter.withLoadStateHeaderAndFooter.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((CombinedLoadStates) obj);
                return C8736p.f16368a;
            }

            public final void invoke(CombinedLoadStates loadStates) {
                AbstractC9133u.m16133g(loadStates, "loadStates");
                header.setLoadState(loadStates.getPrepend());
                footer.setLoadState(loadStates.getAppend());
            }
        });
        return new ConcatAdapter((RecyclerView.Adapter<? extends RecyclerView.ViewHolder>[]) new RecyclerView.Adapter[]{header, this, footer});
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PagingDataAdapter(DiffUtil.ItemCallback<T> diffCallback, InterfaceC9100d mainDispatcher) {
        this(diffCallback, mainDispatcher, (InterfaceC9100d) null, 4, (AbstractC9126n) null);
        AbstractC9133u.m16133g(diffCallback, "diffCallback");
        AbstractC9133u.m16133g(mainDispatcher, "mainDispatcher");
    }

    public final void submitData(Lifecycle lifecycle, PagingData<T> pagingData) {
        AbstractC9133u.m16133g(lifecycle, "lifecycle");
        AbstractC9133u.m16133g(pagingData, "pagingData");
        this.differ.submitData(lifecycle, pagingData);
    }

    public /* synthetic */ PagingDataAdapter(DiffUtil.ItemCallback itemCallback, InterfaceC9100d interfaceC9100d, InterfaceC9100d interfaceC9100d2, int i10, AbstractC9126n abstractC9126n) {
        this(itemCallback, (i10 & 2) != 0 ? C8843i0.m14868c() : interfaceC9100d, (i10 & 4) != 0 ? C8843i0.m14866a() : interfaceC9100d2);
    }

    public PagingDataAdapter(DiffUtil.ItemCallback<T> diffCallback, InterfaceC9100d mainDispatcher, InterfaceC9100d workerDispatcher) {
        AbstractC9133u.m16133g(diffCallback, "diffCallback");
        AbstractC9133u.m16133g(mainDispatcher, "mainDispatcher");
        AbstractC9133u.m16133g(workerDispatcher, "workerDispatcher");
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
        addLoadStateListener(new InterfaceC10570l(this) { // from class: androidx.paging.PagingDataAdapter.2
            private boolean ignoreNextEvent = true;
            final /* synthetic */ PagingDataAdapter<T, VH> this$0;

            {
                this.this$0 = this;
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((CombinedLoadStates) obj);
                return C8736p.f16368a;
            }

            public void invoke(CombinedLoadStates loadStates) {
                AbstractC9133u.m16133g(loadStates, "loadStates");
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

    public /* synthetic */ PagingDataAdapter(DiffUtil.ItemCallback itemCallback, CoroutineDispatcher coroutineDispatcher, int i10, AbstractC9126n abstractC9126n) {
        this(itemCallback, (i10 & 2) != 0 ? C8843i0.m14868c() : coroutineDispatcher);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @InterfaceC8721a
    public /* synthetic */ PagingDataAdapter(DiffUtil.ItemCallback diffCallback, CoroutineDispatcher mainDispatcher) {
        this(diffCallback, (InterfaceC9100d) mainDispatcher, (InterfaceC9100d) C8843i0.m14866a());
        AbstractC9133u.m16133g(diffCallback, "diffCallback");
        AbstractC9133u.m16133g(mainDispatcher, "mainDispatcher");
    }

    public /* synthetic */ PagingDataAdapter(DiffUtil.ItemCallback itemCallback, CoroutineDispatcher coroutineDispatcher, CoroutineDispatcher coroutineDispatcher2, int i10, AbstractC9126n abstractC9126n) {
        this(itemCallback, (i10 & 2) != 0 ? C8843i0.m14868c() : coroutineDispatcher, (i10 & 4) != 0 ? C8843i0.m14866a() : coroutineDispatcher2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @InterfaceC8721a
    public /* synthetic */ PagingDataAdapter(DiffUtil.ItemCallback diffCallback, CoroutineDispatcher mainDispatcher, CoroutineDispatcher workerDispatcher) {
        this(diffCallback, (InterfaceC9100d) mainDispatcher, (InterfaceC9100d) workerDispatcher);
        AbstractC9133u.m16133g(diffCallback, "diffCallback");
        AbstractC9133u.m16133g(mainDispatcher, "mainDispatcher");
        AbstractC9133u.m16133g(workerDispatcher, "workerDispatcher");
    }
}
