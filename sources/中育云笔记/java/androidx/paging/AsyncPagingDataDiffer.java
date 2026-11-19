package androidx.paging;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.IntRange;
import androidx.annotation.MainThread;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleKt;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListUpdateCallback;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.AbstractC9923a;
import kotlin.AbstractC9924b;
import kotlin.coroutines.InterfaceC9945d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p309qc.InterfaceC10770a;
import p309qc.InterfaceC10773d;
import p379vd.AbstractC11596e;
import p379vd.AbstractC11597f;
import p379vd.AbstractC11613v;
import p379vd.InterfaceC11594c;
import p379vd.InterfaceC11603l;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.AbstractC11106e0;
import sd.AbstractC11117h;
import sd.C11157r0;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

/* loaded from: classes3.dex */
public final class AsyncPagingDataDiffer<T> {
    private final InterfaceC10773d LoadStateListenerHandler$delegate;
    private final AsyncPagingDataDiffer$LoadStateListenerRunnable$1 LoadStateListenerRunnable;
    private final CopyOnWriteArrayList<InterfaceC9540l> childLoadStateListeners;
    private final DiffUtil.ItemCallback<T> diffCallback;
    private final InterfaceC11603l inGetItem;
    private final InterfaceC9540l internalLoadStateListener;
    private int lastAccessedIndex;
    private final InterfaceC11594c loadStateFlow;
    private final InterfaceC9945d mainDispatcher;
    private final InterfaceC11594c onPagesUpdatedFlow;
    private final AtomicReference<InterfaceC9540l> parentLoadStateListener;
    private final PagingDataPresenter<T> presenter;
    private final AtomicReference<PlaceholderPaddedList<T>> previousPresenter;
    private final AtomicInteger submitDataId;
    private final ListUpdateCallback updateCallback;
    private final InterfaceC9945d workerDispatcher;

    @InterfaceC11829d(m26210c = "androidx.paging.AsyncPagingDataDiffer$submitData$2", m26211f = "AsyncPagingDataDiffer.kt", m26212l = {417}, m26213m = "invokeSuspend", m26214v = 1)
    /* renamed from: androidx.paging.AsyncPagingDataDiffer$submitData$2 */
    public static final class C42092 extends SuspendLambda implements InterfaceC9544p {
        final /* synthetic */ int $id;
        final /* synthetic */ PagingData<T> $pagingData;
        int label;
        final /* synthetic */ AsyncPagingDataDiffer<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42092(AsyncPagingDataDiffer<T> asyncPagingDataDiffer, int i10, PagingData<T> pagingData, InterfaceC11588c<? super C42092> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.this$0 = asyncPagingDataDiffer;
            this.$id = i10;
            this.$pagingData = pagingData;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            return new C42092(this.this$0, this.$id, this.$pagingData, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                if (((AsyncPagingDataDiffer) this.this$0).submitDataId.get() == this.$id) {
                    PagingDataPresenter<T> presenter$paging_runtime = this.this$0.getPresenter$paging_runtime();
                    PagingData<T> pagingData = this.$pagingData;
                    this.label = 1;
                    if (presenter$paging_runtime.collectFrom(pagingData, this) == objM25952f) {
                        return objM25952f;
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
            }
            return C10786q.f26013a;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C42092) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AsyncPagingDataDiffer(DiffUtil.ItemCallback<T> diffCallback, ListUpdateCallback updateCallback) {
        this(diffCallback, updateCallback, (InterfaceC9945d) null, (InterfaceC9945d) null, 12, (AbstractC9972n) null);
        AbstractC9979u.m20294g(diffCallback, "diffCallback");
        AbstractC9979u.m20294g(updateCallback, "updateCallback");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Handler LoadStateListenerHandler_delegate$lambda$0() {
        return new Handler(Looper.getMainLooper());
    }

    private final Handler getLoadStateListenerHandler() {
        return (Handler) this.LoadStateListenerHandler$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C10786q internalLoadStateListener$lambda$0(AsyncPagingDataDiffer asyncPagingDataDiffer, CombinedLoadStates loadState) {
        AbstractC9979u.m20294g(loadState, "loadState");
        if (((Boolean) asyncPagingDataDiffer.inGetItem.getValue()).booleanValue()) {
            Handler loadStateListenerHandler = asyncPagingDataDiffer.getLoadStateListenerHandler();
            loadStateListenerHandler.removeCallbacks(asyncPagingDataDiffer.LoadStateListenerRunnable);
            asyncPagingDataDiffer.LoadStateListenerRunnable.getLoadState().set(loadState);
            loadStateListenerHandler.post(asyncPagingDataDiffer.LoadStateListenerRunnable);
        } else {
            Iterator<T> it = asyncPagingDataDiffer.childLoadStateListeners.iterator();
            while (it.hasNext()) {
                ((InterfaceC9540l) it.next()).invoke(loadState);
            }
        }
        return C10786q.f26013a;
    }

    public final void addLoadStateListener(InterfaceC9540l listener) {
        AbstractC9979u.m20294g(listener, "listener");
        if (this.parentLoadStateListener.get() == null) {
            addLoadStateListenerInternal$paging_runtime(this.internalLoadStateListener);
        }
        this.childLoadStateListeners.add(listener);
    }

    public final void addLoadStateListenerInternal$paging_runtime(InterfaceC9540l listener) {
        AbstractC9979u.m20294g(listener, "listener");
        this.parentLoadStateListener.set(listener);
        this.presenter.addLoadStateListener(listener);
    }

    public final void addOnPagesUpdatedListener(InterfaceC9529a listener) {
        AbstractC9979u.m20294g(listener, "listener");
        this.presenter.addOnPagesUpdatedListener(listener);
    }

    public final InterfaceC11603l getInGetItem$paging_runtime() {
        return this.inGetItem;
    }

    public final InterfaceC9540l getInternalLoadStateListener$paging_runtime() {
        return this.internalLoadStateListener;
    }

    @MainThread
    public final T getItem(@IntRange(from = 0) int i10) {
        Object value;
        Object value2;
        Object value3;
        try {
            InterfaceC11603l interfaceC11603l = this.inGetItem;
            do {
                value2 = interfaceC11603l.getValue();
                ((Boolean) value2).getClass();
            } while (!interfaceC11603l.mo20870e(value2, Boolean.TRUE));
            this.lastAccessedIndex = i10;
            PlaceholderPaddedList<T> placeholderPaddedList = this.previousPresenter.get();
            T t10 = placeholderPaddedList != null ? (T) AsyncPagingDataDifferKt.get(placeholderPaddedList, i10) : this.presenter.get(i10);
            InterfaceC11603l interfaceC11603l2 = this.inGetItem;
            do {
                value3 = interfaceC11603l2.getValue();
                ((Boolean) value3).getClass();
            } while (!interfaceC11603l2.mo20870e(value3, Boolean.FALSE));
            return t10;
        } catch (Throwable th) {
            InterfaceC11603l interfaceC11603l3 = this.inGetItem;
            do {
                value = interfaceC11603l3.getValue();
                ((Boolean) value).getClass();
            } while (!interfaceC11603l3.mo20870e(value, Boolean.FALSE));
            throw th;
        }
    }

    public final int getItemCount() {
        PlaceholderPaddedList<T> placeholderPaddedList = this.previousPresenter.get();
        return placeholderPaddedList != null ? placeholderPaddedList.getSize() : this.presenter.getSize();
    }

    public final InterfaceC11594c getLoadStateFlow() {
        return this.loadStateFlow;
    }

    public final InterfaceC11594c getOnPagesUpdatedFlow() {
        return this.onPagesUpdatedFlow;
    }

    public final PagingDataPresenter<T> getPresenter$paging_runtime() {
        return this.presenter;
    }

    @MainThread
    public final T peek(@IntRange(from = 0) int i10) {
        PlaceholderPaddedList<T> placeholderPaddedList = this.previousPresenter.get();
        return placeholderPaddedList != null ? (T) AsyncPagingDataDifferKt.peek(placeholderPaddedList, i10) : this.presenter.peek(i10);
    }

    public final void refresh() {
        this.presenter.refresh();
    }

    public final void removeLoadStateListener(InterfaceC9540l listener) {
        InterfaceC9540l interfaceC9540l;
        AbstractC9979u.m20294g(listener, "listener");
        this.childLoadStateListeners.remove(listener);
        if (!this.childLoadStateListeners.isEmpty() || (interfaceC9540l = this.parentLoadStateListener.get()) == null) {
            return;
        }
        this.presenter.removeLoadStateListener(interfaceC9540l);
    }

    public final void removeOnPagesUpdatedListener(InterfaceC9529a listener) {
        AbstractC9979u.m20294g(listener, "listener");
        this.presenter.removeOnPagesUpdatedListener(listener);
    }

    public final void retry() {
        this.presenter.retry();
    }

    public final ItemSnapshotList<T> snapshot() {
        ItemSnapshotList<T> itemSnapshotListSnapshot;
        PlaceholderPaddedList<T> placeholderPaddedList = this.previousPresenter.get();
        return (placeholderPaddedList == null || (itemSnapshotListSnapshot = AsyncPagingDataDifferKt.snapshot(placeholderPaddedList)) == null) ? this.presenter.snapshot() : itemSnapshotListSnapshot;
    }

    public final Object submitData(PagingData<T> pagingData, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        this.submitDataId.incrementAndGet();
        Object objCollectFrom = this.presenter.collectFrom(pagingData, interfaceC11588c);
        return objCollectFrom == AbstractC11725a.m25952f() ? objCollectFrom : C10786q.f26013a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AsyncPagingDataDiffer(DiffUtil.ItemCallback<T> diffCallback, ListUpdateCallback updateCallback, InterfaceC9945d mainDispatcher) {
        this(diffCallback, updateCallback, mainDispatcher, (InterfaceC9945d) null, 8, (AbstractC9972n) null);
        AbstractC9979u.m20294g(diffCallback, "diffCallback");
        AbstractC9979u.m20294g(updateCallback, "updateCallback");
        AbstractC9979u.m20294g(mainDispatcher, "mainDispatcher");
    }

    public AsyncPagingDataDiffer(DiffUtil.ItemCallback<T> diffCallback, ListUpdateCallback updateCallback, InterfaceC9945d mainDispatcher, InterfaceC9945d workerDispatcher) {
        AbstractC9979u.m20294g(diffCallback, "diffCallback");
        AbstractC9979u.m20294g(updateCallback, "updateCallback");
        AbstractC9979u.m20294g(mainDispatcher, "mainDispatcher");
        AbstractC9979u.m20294g(workerDispatcher, "workerDispatcher");
        this.diffCallback = diffCallback;
        this.updateCallback = updateCallback;
        this.mainDispatcher = mainDispatcher;
        this.workerDispatcher = workerDispatcher;
        this.inGetItem = AbstractC11613v.m25602a(Boolean.FALSE);
        this.previousPresenter = new AtomicReference<>(null);
        AsyncPagingDataDiffer$presenter$1 asyncPagingDataDiffer$presenter$1 = new AsyncPagingDataDiffer$presenter$1(this, mainDispatcher);
        this.presenter = asyncPagingDataDiffer$presenter$1;
        this.submitDataId = new AtomicInteger(0);
        this.loadStateFlow = AbstractC11596e.m25534E(AbstractC11596e.m25531B(new AsyncPagingDataDiffer$special$$inlined$transform$1(AbstractC11597f.m25578b(AbstractC11596e.m25572v(asyncPagingDataDiffer$presenter$1.getLoadStateFlow()), -1, null, 2, null), null, this)), C11157r0.m24800c());
        this.onPagesUpdatedFlow = asyncPagingDataDiffer$presenter$1.getOnPagesUpdatedFlow();
        this.parentLoadStateListener = new AtomicReference<>(null);
        this.childLoadStateListeners = new CopyOnWriteArrayList<>();
        this.internalLoadStateListener = new InterfaceC9540l() { // from class: androidx.paging.e
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return AsyncPagingDataDiffer.internalLoadStateListener$lambda$0(this.f1918c, (CombinedLoadStates) obj);
            }
        };
        this.LoadStateListenerHandler$delegate = AbstractC9923a.m20068a(new InterfaceC9529a() { // from class: androidx.paging.f
            @Override // p181hd.InterfaceC9529a
            public final Object invoke() {
                return AsyncPagingDataDiffer.LoadStateListenerHandler_delegate$lambda$0();
            }
        });
        this.LoadStateListenerRunnable = new AsyncPagingDataDiffer$LoadStateListenerRunnable$1(this);
    }

    public final void submitData(Lifecycle lifecycle, PagingData<T> pagingData) {
        AbstractC9979u.m20294g(lifecycle, "lifecycle");
        AbstractC9979u.m20294g(pagingData, "pagingData");
        AbstractC11117h.m24726d(LifecycleKt.getCoroutineScope(lifecycle), null, null, new C42092(this, this.submitDataId.incrementAndGet(), pagingData, null), 3, null);
    }

    public /* synthetic */ AsyncPagingDataDiffer(DiffUtil.ItemCallback itemCallback, ListUpdateCallback listUpdateCallback, InterfaceC9945d interfaceC9945d, InterfaceC9945d interfaceC9945d2, int i10, AbstractC9972n abstractC9972n) {
        this(itemCallback, listUpdateCallback, (i10 & 4) != 0 ? C11157r0.m24800c() : interfaceC9945d, (i10 & 8) != 0 ? C11157r0.m24798a() : interfaceC9945d2);
    }

    public /* synthetic */ AsyncPagingDataDiffer(DiffUtil.ItemCallback itemCallback, ListUpdateCallback listUpdateCallback, AbstractC11106e0 abstractC11106e0, int i10, AbstractC9972n abstractC9972n) {
        this(itemCallback, listUpdateCallback, (i10 & 4) != 0 ? C11157r0.m24800c() : abstractC11106e0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @InterfaceC10770a
    public /* synthetic */ AsyncPagingDataDiffer(DiffUtil.ItemCallback diffCallback, ListUpdateCallback updateCallback, AbstractC11106e0 mainDispatcher) {
        this(diffCallback, updateCallback, (InterfaceC9945d) mainDispatcher, (InterfaceC9945d) C11157r0.m24798a());
        AbstractC9979u.m20294g(diffCallback, "diffCallback");
        AbstractC9979u.m20294g(updateCallback, "updateCallback");
        AbstractC9979u.m20294g(mainDispatcher, "mainDispatcher");
    }

    public /* synthetic */ AsyncPagingDataDiffer(DiffUtil.ItemCallback itemCallback, ListUpdateCallback listUpdateCallback, AbstractC11106e0 abstractC11106e0, AbstractC11106e0 abstractC11106e02, int i10, AbstractC9972n abstractC9972n) {
        this(itemCallback, listUpdateCallback, (i10 & 4) != 0 ? C11157r0.m24800c() : abstractC11106e0, (i10 & 8) != 0 ? C11157r0.m24798a() : abstractC11106e02);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @InterfaceC10770a
    public /* synthetic */ AsyncPagingDataDiffer(DiffUtil.ItemCallback diffCallback, ListUpdateCallback updateCallback, AbstractC11106e0 mainDispatcher, AbstractC11106e0 workerDispatcher) {
        this(diffCallback, updateCallback, (InterfaceC9945d) mainDispatcher, (InterfaceC9945d) workerDispatcher);
        AbstractC9979u.m20294g(diffCallback, "diffCallback");
        AbstractC9979u.m20294g(updateCallback, "updateCallback");
        AbstractC9979u.m20294g(mainDispatcher, "mainDispatcher");
        AbstractC9979u.m20294g(workerDispatcher, "workerDispatcher");
    }
}
