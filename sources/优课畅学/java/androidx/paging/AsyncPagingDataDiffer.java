package androidx.paging;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.IntRange;
import androidx.annotation.MainThread;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleKt;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListUpdateCallback;
import com.tencent.smtt.sdk.TbsListener;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.AbstractC9078a;
import kotlin.AbstractC9079b;
import kotlin.coroutines.InterfaceC9100d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import kotlinx.coroutines.CoroutineDispatcher;
import p123h7.C8736p;
import p123h7.InterfaceC8721a;
import p123h7.InterfaceC8724d;
import p135i8.AbstractC8839h;
import p135i8.C8843i0;
import p135i8.InterfaceC8822b0;
import p169l8.AbstractC9268e;
import p169l8.AbstractC9269f;
import p169l8.AbstractC9281r;
import p169l8.InterfaceC9266c;
import p169l8.InterfaceC9271h;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

/* loaded from: classes3.dex */
public final class AsyncPagingDataDiffer<T> {
    private final InterfaceC8724d LoadStateListenerHandler$delegate;
    private final AsyncPagingDataDiffer$LoadStateListenerRunnable$1 LoadStateListenerRunnable;
    private final CopyOnWriteArrayList<InterfaceC10570l> childLoadStateListeners;
    private final DiffUtil.ItemCallback<T> diffCallback;
    private final InterfaceC9271h inGetItem;
    private final InterfaceC10570l internalLoadStateListener;
    private int lastAccessedIndex;
    private final InterfaceC9266c loadStateFlow;
    private final InterfaceC9100d mainDispatcher;
    private final InterfaceC9266c onPagesUpdatedFlow;
    private final AtomicReference<InterfaceC10570l> parentLoadStateListener;
    private final PagingDataPresenter<T> presenter;
    private final AtomicReference<PlaceholderPaddedList<T>> previousPresenter;
    private final AtomicInteger submitDataId;
    private final ListUpdateCallback updateCallback;
    private final InterfaceC9100d workerDispatcher;

    @InterfaceC9539d(m17800c = "androidx.paging.AsyncPagingDataDiffer$submitData$2", m17801f = "AsyncPagingDataDiffer.kt", m17802l = {TbsListener.ErrorCode.INFO_MISS_SDKEXTENSION_JAR_OLD}, m17803m = "invokeSuspend")
    /* renamed from: androidx.paging.AsyncPagingDataDiffer$submitData$2 */
    public static final class C42842 extends SuspendLambda implements InterfaceC10574p {
        final /* synthetic */ int $id;
        final /* synthetic */ PagingData<T> $pagingData;
        int label;
        final /* synthetic */ AsyncPagingDataDiffer<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42842(AsyncPagingDataDiffer<T> asyncPagingDataDiffer, int i10, PagingData<T> pagingData, InterfaceC9324c<? super C42842> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.this$0 = asyncPagingDataDiffer;
            this.$id = i10;
            this.$pagingData = pagingData;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            return new C42842(this.this$0, this.$id, this.$pagingData, interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C42842) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                if (((AsyncPagingDataDiffer) this.this$0).submitDataId.get() == this.$id) {
                    PagingDataPresenter<T> presenter$paging_runtime_release = this.this$0.getPresenter$paging_runtime_release();
                    PagingData<T> pagingData = this.$pagingData;
                    this.label = 1;
                    if (presenter$paging_runtime_release.collectFrom(pagingData, this) == objM17291f) {
                        return objM17291f;
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9079b.m15926b(obj);
            }
            return C8736p.f16368a;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AsyncPagingDataDiffer(DiffUtil.ItemCallback<T> diffCallback, ListUpdateCallback updateCallback) {
        this(diffCallback, updateCallback, (InterfaceC9100d) null, (InterfaceC9100d) null, 12, (AbstractC9126n) null);
        AbstractC9133u.m16133g(diffCallback, "diffCallback");
        AbstractC9133u.m16133g(updateCallback, "updateCallback");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Handler getLoadStateListenerHandler() {
        return (Handler) this.LoadStateListenerHandler$delegate.getValue();
    }

    public final void addLoadStateListener(InterfaceC10570l listener) {
        AbstractC9133u.m16133g(listener, "listener");
        if (this.parentLoadStateListener.get() == null) {
            addLoadStateListenerInternal$paging_runtime_release(this.internalLoadStateListener);
        }
        this.childLoadStateListeners.add(listener);
    }

    public final void addLoadStateListenerInternal$paging_runtime_release(InterfaceC10570l listener) {
        AbstractC9133u.m16133g(listener, "listener");
        this.parentLoadStateListener.set(listener);
        this.presenter.addLoadStateListener(listener);
    }

    public final void addOnPagesUpdatedListener(InterfaceC10559a listener) {
        AbstractC9133u.m16133g(listener, "listener");
        this.presenter.addOnPagesUpdatedListener(listener);
    }

    public final InterfaceC9271h getInGetItem$paging_runtime_release() {
        return this.inGetItem;
    }

    public final InterfaceC10570l getInternalLoadStateListener$paging_runtime_release() {
        return this.internalLoadStateListener;
    }

    @MainThread
    public final T getItem(@IntRange(from = 0) int i10) {
        Object value;
        Object value2;
        Object value3;
        try {
            InterfaceC9271h interfaceC9271h = this.inGetItem;
            do {
                value2 = interfaceC9271h.getValue();
                ((Boolean) value2).getClass();
            } while (!interfaceC9271h.mo16686e(value2, Boolean.TRUE));
            this.lastAccessedIndex = i10;
            PlaceholderPaddedList<T> placeholderPaddedList = this.previousPresenter.get();
            T t10 = placeholderPaddedList != null ? (T) AsyncPagingDataDifferKt.get(placeholderPaddedList, i10) : this.presenter.get(i10);
            InterfaceC9271h interfaceC9271h2 = this.inGetItem;
            do {
                value3 = interfaceC9271h2.getValue();
                ((Boolean) value3).getClass();
            } while (!interfaceC9271h2.mo16686e(value3, Boolean.FALSE));
            return t10;
        } catch (Throwable th) {
            InterfaceC9271h interfaceC9271h3 = this.inGetItem;
            do {
                value = interfaceC9271h3.getValue();
                ((Boolean) value).getClass();
            } while (!interfaceC9271h3.mo16686e(value, Boolean.FALSE));
            throw th;
        }
    }

    public final int getItemCount() {
        PlaceholderPaddedList<T> placeholderPaddedList = this.previousPresenter.get();
        return placeholderPaddedList != null ? placeholderPaddedList.getSize() : this.presenter.getSize();
    }

    public final InterfaceC9266c getLoadStateFlow() {
        return this.loadStateFlow;
    }

    public final InterfaceC9266c getOnPagesUpdatedFlow() {
        return this.onPagesUpdatedFlow;
    }

    public final PagingDataPresenter<T> getPresenter$paging_runtime_release() {
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

    public final void removeLoadStateListener(InterfaceC10570l listener) {
        InterfaceC10570l interfaceC10570l;
        AbstractC9133u.m16133g(listener, "listener");
        this.childLoadStateListeners.remove(listener);
        if (!this.childLoadStateListeners.isEmpty() || (interfaceC10570l = this.parentLoadStateListener.get()) == null) {
            return;
        }
        this.presenter.removeLoadStateListener(interfaceC10570l);
    }

    public final void removeOnPagesUpdatedListener(InterfaceC10559a listener) {
        AbstractC9133u.m16133g(listener, "listener");
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

    public final Object submitData(PagingData<T> pagingData, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        this.submitDataId.incrementAndGet();
        Object objCollectFrom = this.presenter.collectFrom(pagingData, interfaceC9324c);
        return objCollectFrom == AbstractC9434a.m17291f() ? objCollectFrom : C8736p.f16368a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AsyncPagingDataDiffer(DiffUtil.ItemCallback<T> diffCallback, ListUpdateCallback updateCallback, InterfaceC9100d mainDispatcher) {
        this(diffCallback, updateCallback, mainDispatcher, (InterfaceC9100d) null, 8, (AbstractC9126n) null);
        AbstractC9133u.m16133g(diffCallback, "diffCallback");
        AbstractC9133u.m16133g(updateCallback, "updateCallback");
        AbstractC9133u.m16133g(mainDispatcher, "mainDispatcher");
    }

    public AsyncPagingDataDiffer(DiffUtil.ItemCallback<T> diffCallback, ListUpdateCallback updateCallback, InterfaceC9100d mainDispatcher, InterfaceC9100d workerDispatcher) {
        AbstractC9133u.m16133g(diffCallback, "diffCallback");
        AbstractC9133u.m16133g(updateCallback, "updateCallback");
        AbstractC9133u.m16133g(mainDispatcher, "mainDispatcher");
        AbstractC9133u.m16133g(workerDispatcher, "workerDispatcher");
        this.diffCallback = diffCallback;
        this.updateCallback = updateCallback;
        this.mainDispatcher = mainDispatcher;
        this.workerDispatcher = workerDispatcher;
        this.inGetItem = AbstractC9281r.m17054a(Boolean.FALSE);
        this.previousPresenter = new AtomicReference<>(null);
        AsyncPagingDataDiffer$presenter$1 asyncPagingDataDiffer$presenter$1 = new AsyncPagingDataDiffer$presenter$1(this, mainDispatcher);
        this.presenter = asyncPagingDataDiffer$presenter$1;
        this.submitDataId = new AtomicInteger(0);
        this.loadStateFlow = AbstractC9268e.m16994F(AbstractC9268e.m16990B(new AsyncPagingDataDiffer$special$$inlined$transform$1(AbstractC9269f.m17038b(AbstractC9268e.m17033w(asyncPagingDataDiffer$presenter$1.getLoadStateFlow()), -1, null, 2, null), null, this)), C8843i0.m14868c());
        this.onPagesUpdatedFlow = asyncPagingDataDiffer$presenter$1.getOnPagesUpdatedFlow();
        this.parentLoadStateListener = new AtomicReference<>(null);
        this.childLoadStateListeners = new CopyOnWriteArrayList<>();
        this.internalLoadStateListener = new InterfaceC10570l(this) { // from class: androidx.paging.AsyncPagingDataDiffer$internalLoadStateListener$1
            final /* synthetic */ AsyncPagingDataDiffer<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((CombinedLoadStates) obj);
                return C8736p.f16368a;
            }

            public final void invoke(CombinedLoadStates loadState) {
                AbstractC9133u.m16133g(loadState, "loadState");
                if (!((Boolean) this.this$0.getInGetItem$paging_runtime_release().getValue()).booleanValue()) {
                    Iterator it = ((AsyncPagingDataDiffer) this.this$0).childLoadStateListeners.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC10570l) it.next()).invoke(loadState);
                    }
                } else {
                    Handler loadStateListenerHandler = this.this$0.getLoadStateListenerHandler();
                    AsyncPagingDataDiffer<T> asyncPagingDataDiffer = this.this$0;
                    loadStateListenerHandler.removeCallbacks(((AsyncPagingDataDiffer) asyncPagingDataDiffer).LoadStateListenerRunnable);
                    ((AsyncPagingDataDiffer) asyncPagingDataDiffer).LoadStateListenerRunnable.getLoadState().set(loadState);
                    loadStateListenerHandler.post(((AsyncPagingDataDiffer) asyncPagingDataDiffer).LoadStateListenerRunnable);
                }
            }
        };
        this.LoadStateListenerHandler$delegate = AbstractC9078a.m15924b(new InterfaceC10559a() { // from class: androidx.paging.AsyncPagingDataDiffer$LoadStateListenerHandler$2
            @Override // p300x7.InterfaceC10559a
            public final Handler invoke() {
                return new Handler(Looper.getMainLooper());
            }
        });
        this.LoadStateListenerRunnable = new AsyncPagingDataDiffer$LoadStateListenerRunnable$1(this);
    }

    public final void submitData(Lifecycle lifecycle, PagingData<T> pagingData) {
        AbstractC9133u.m16133g(lifecycle, "lifecycle");
        AbstractC9133u.m16133g(pagingData, "pagingData");
        AbstractC8839h.m14861d(LifecycleKt.getCoroutineScope(lifecycle), null, null, new C42842(this, this.submitDataId.incrementAndGet(), pagingData, null), 3, null);
    }

    public /* synthetic */ AsyncPagingDataDiffer(DiffUtil.ItemCallback itemCallback, ListUpdateCallback listUpdateCallback, InterfaceC9100d interfaceC9100d, InterfaceC9100d interfaceC9100d2, int i10, AbstractC9126n abstractC9126n) {
        this(itemCallback, listUpdateCallback, (i10 & 4) != 0 ? C8843i0.m14868c() : interfaceC9100d, (i10 & 8) != 0 ? C8843i0.m14866a() : interfaceC9100d2);
    }

    public /* synthetic */ AsyncPagingDataDiffer(DiffUtil.ItemCallback itemCallback, ListUpdateCallback listUpdateCallback, CoroutineDispatcher coroutineDispatcher, int i10, AbstractC9126n abstractC9126n) {
        this(itemCallback, listUpdateCallback, (i10 & 4) != 0 ? C8843i0.m14868c() : coroutineDispatcher);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @InterfaceC8721a
    public /* synthetic */ AsyncPagingDataDiffer(DiffUtil.ItemCallback diffCallback, ListUpdateCallback updateCallback, CoroutineDispatcher mainDispatcher) {
        this(diffCallback, updateCallback, (InterfaceC9100d) mainDispatcher, (InterfaceC9100d) C8843i0.m14866a());
        AbstractC9133u.m16133g(diffCallback, "diffCallback");
        AbstractC9133u.m16133g(updateCallback, "updateCallback");
        AbstractC9133u.m16133g(mainDispatcher, "mainDispatcher");
    }

    public /* synthetic */ AsyncPagingDataDiffer(DiffUtil.ItemCallback itemCallback, ListUpdateCallback listUpdateCallback, CoroutineDispatcher coroutineDispatcher, CoroutineDispatcher coroutineDispatcher2, int i10, AbstractC9126n abstractC9126n) {
        this(itemCallback, listUpdateCallback, (i10 & 4) != 0 ? C8843i0.m14868c() : coroutineDispatcher, (i10 & 8) != 0 ? C8843i0.m14866a() : coroutineDispatcher2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @InterfaceC8721a
    public /* synthetic */ AsyncPagingDataDiffer(DiffUtil.ItemCallback diffCallback, ListUpdateCallback updateCallback, CoroutineDispatcher mainDispatcher, CoroutineDispatcher workerDispatcher) {
        this(diffCallback, updateCallback, (InterfaceC9100d) mainDispatcher, (InterfaceC9100d) workerDispatcher);
        AbstractC9133u.m16133g(diffCallback, "diffCallback");
        AbstractC9133u.m16133g(updateCallback, "updateCallback");
        AbstractC9133u.m16133g(mainDispatcher, "mainDispatcher");
        AbstractC9133u.m16133g(workerDispatcher, "workerDispatcher");
    }
}
