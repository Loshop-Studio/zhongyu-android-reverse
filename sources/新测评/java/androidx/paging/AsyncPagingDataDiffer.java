package androidx.paging;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.IntRange;
import androidx.annotation.MainThread;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleKt;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListUpdateCallback;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ContextKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@Metadata(m13557d1 = {"\u0000\u009f\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0015\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002B'\b\u0017\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tB1\b\u0017\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0002\u0010\u000bB1\b\u0007\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\f\u0012\b\b\u0002\u0010\n\u001a\u00020\f¢\u0006\u0002\u0010\rJ\u001a\u00109\u001a\u00020\u001b2\u0012\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u0019J!\u0010;\u001a\u00020\u001b2\u0012\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u0019H\u0000¢\u0006\u0002\b<J\u0014\u0010=\u001a\u00020\u001b2\f\u0010:\u001a\b\u0012\u0004\u0012\u00020\u001b0>J\u0019\u0010?\u001a\u0004\u0018\u00018\u00002\b\b\u0001\u0010@\u001a\u00020%H\u0007¢\u0006\u0002\u0010AJ\u0019\u0010B\u001a\u0004\u0018\u00018\u00002\b\b\u0001\u0010@\u001a\u00020%H\u0007¢\u0006\u0002\u0010AJ\u0006\u0010C\u001a\u00020\u001bJ\u001a\u0010D\u001a\u00020\u001b2\u0012\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u0019J\u0014\u0010E\u001a\u00020\u001b2\f\u0010:\u001a\b\u0012\u0004\u0012\u00020\u001b0>J\u0006\u0010F\u001a\u00020\u001bJ\f\u0010G\u001a\b\u0012\u0004\u0012\u00028\u00000HJ\u001c\u0010I\u001a\u00020\u001b2\u0006\u0010J\u001a\u00020K2\f\u0010L\u001a\b\u0012\u0004\u0012\u00028\u00000MJ\u001c\u0010I\u001a\u00020\u001b2\f\u0010L\u001a\b\u0012\u0004\u0012\u00028\u00000MH\u0086@¢\u0006\u0002\u0010NR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0016R \u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u00190\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R \u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u0019X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010$\u001a\u00020%8F¢\u0006\u0006\u001a\u0004\b&\u0010'R\u000e\u0010(\u001a\u00020%X\u0082\u000e¢\u0006\u0002\n\u0000R\u0017\u0010)\u001a\b\u0012\u0004\u0012\u00020\u001a0*¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u000e\u0010\u0007\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010-\u001a\b\u0012\u0004\u0012\u00020\u001b0*¢\u0006\b\n\u0000\u001a\u0004\b.\u0010,R\"\u0010/\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001900X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00028\u000002X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u001a\u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000600X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u000208X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006O"}, m13558d2 = {"Landroidx/paging/AsyncPagingDataDiffer;", ExifInterface.GPS_DIRECTION_TRUE, "", "diffCallback", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "updateCallback", "Landroidx/recyclerview/widget/ListUpdateCallback;", "mainDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Landroidx/recyclerview/widget/DiffUtil$ItemCallback;Landroidx/recyclerview/widget/ListUpdateCallback;Lkotlinx/coroutines/CoroutineDispatcher;)V", "workerDispatcher", "(Landroidx/recyclerview/widget/DiffUtil$ItemCallback;Landroidx/recyclerview/widget/ListUpdateCallback;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineDispatcher;)V", "Lkotlin/coroutines/CoroutineContext;", "(Landroidx/recyclerview/widget/DiffUtil$ItemCallback;Landroidx/recyclerview/widget/ListUpdateCallback;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;)V", "LoadStateListenerHandler", "Landroid/os/Handler;", "getLoadStateListenerHandler", "()Landroid/os/Handler;", "LoadStateListenerHandler$delegate", "Lkotlin/Lazy;", "LoadStateListenerRunnable", "androidx/paging/AsyncPagingDataDiffer$LoadStateListenerRunnable$1", "Landroidx/paging/AsyncPagingDataDiffer$LoadStateListenerRunnable$1;", "childLoadStateListeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lkotlin/Function1;", "Landroidx/paging/CombinedLoadStates;", "", "inGetItem", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "getInGetItem$paging_runtime_release", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "internalLoadStateListener", "getInternalLoadStateListener$paging_runtime_release", "()Lkotlin/jvm/functions/Function1;", "itemCount", "", "getItemCount", "()I", "lastAccessedIndex", "loadStateFlow", "Lkotlinx/coroutines/flow/Flow;", "getLoadStateFlow", "()Lkotlinx/coroutines/flow/Flow;", "onPagesUpdatedFlow", "getOnPagesUpdatedFlow", "parentLoadStateListener", "Ljava/util/concurrent/atomic/AtomicReference;", "presenter", "Landroidx/paging/PagingDataPresenter;", "getPresenter$paging_runtime_release", "()Landroidx/paging/PagingDataPresenter;", "previousPresenter", "Landroidx/paging/PlaceholderPaddedList;", "submitDataId", "Ljava/util/concurrent/atomic/AtomicInteger;", "addLoadStateListener", "listener", "addLoadStateListenerInternal", "addLoadStateListenerInternal$paging_runtime_release", "addOnPagesUpdatedListener", "Lkotlin/Function0;", "getItem", "index", "(I)Ljava/lang/Object;", "peek", "refresh", "removeLoadStateListener", "removeOnPagesUpdatedListener", "retry", "snapshot", "Landroidx/paging/ItemSnapshotList;", "submitData", RequestParameters.SUBRESOURCE_LIFECYCLE, "Landroidx/lifecycle/Lifecycle;", "pagingData", "Landroidx/paging/PagingData;", "(Landroidx/paging/PagingData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "paging-runtime_release"}, m13559k = 1, m13560mv = {1, 8, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nAsyncPagingDataDiffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AsyncPagingDataDiffer.kt\nandroidx/paging/AsyncPagingDataDiffer\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,668:1\n39#2,6:669\n230#3,5:675\n230#3,5:680\n1#4:685\n*S KotlinDebug\n*F\n+ 1 AsyncPagingDataDiffer.kt\nandroidx/paging/AsyncPagingDataDiffer\n*L\n507#1:669,6\n457#1:675,5\n462#1:680,5\n*E\n"})
/* loaded from: classes3.dex */
public final class AsyncPagingDataDiffer<T> {

    /* renamed from: LoadStateListenerHandler$delegate, reason: from kotlin metadata */
    private final Lazy LoadStateListenerHandler;
    private final AsyncPagingDataDiffer$LoadStateListenerRunnable$1 LoadStateListenerRunnable;
    private final CopyOnWriteArrayList<Function1<CombinedLoadStates, Unit>> childLoadStateListeners;
    private final DiffUtil.ItemCallback<T> diffCallback;
    private final MutableStateFlow<Boolean> inGetItem;
    private final Function1<CombinedLoadStates, Unit> internalLoadStateListener;
    private int lastAccessedIndex;
    private final Flow<CombinedLoadStates> loadStateFlow;
    private final CoroutineContext mainDispatcher;
    private final Flow<Unit> onPagesUpdatedFlow;
    private final AtomicReference<Function1<CombinedLoadStates, Unit>> parentLoadStateListener;
    private final PagingDataPresenter<T> presenter;
    private final AtomicReference<PlaceholderPaddedList<T>> previousPresenter;
    private final AtomicInteger submitDataId;
    private final ListUpdateCallback updateCallback;
    private final CoroutineContext workerDispatcher;

    @Metadata(m13557d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u0004H\u008a@"}, m13558d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {1, 8, 0}, m13562xi = 48)
    @DebugMetadata(m13595c = "androidx.paging.AsyncPagingDataDiffer$submitData$2", m13596f = "AsyncPagingDataDiffer.kt", m13597i = {}, m13598l = {406}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
    /* renamed from: androidx.paging.AsyncPagingDataDiffer$submitData$2 */
    public static final class C41982 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $id;
        final /* synthetic */ PagingData<T> $pagingData;
        int label;
        final /* synthetic */ AsyncPagingDataDiffer<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41982(AsyncPagingDataDiffer<T> asyncPagingDataDiffer, int i10, PagingData<T> pagingData, Continuation<? super C41982> continuation) {
            super(2, continuation);
            this.this$0 = asyncPagingDataDiffer;
            this.$id = i10;
            this.$pagingData = pagingData;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C41982(this.this$0, this.$id, this.$pagingData, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                if (((AsyncPagingDataDiffer) this.this$0).submitDataId.get() == this.$id) {
                    PagingDataPresenter<T> presenter$paging_runtime_release = this.this$0.getPresenter$paging_runtime_release();
                    PagingData<T> pagingData = this.$pagingData;
                    this.label = 1;
                    if (presenter$paging_runtime_release.collectFrom(pagingData, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C41982) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AsyncPagingDataDiffer(DiffUtil.ItemCallback<T> diffCallback, ListUpdateCallback updateCallback) {
        this(diffCallback, updateCallback, (CoroutineContext) null, (CoroutineContext) null, 12, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(diffCallback, "diffCallback");
        Intrinsics.checkNotNullParameter(updateCallback, "updateCallback");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Handler getLoadStateListenerHandler() {
        return (Handler) this.LoadStateListenerHandler.getValue();
    }

    public final void addLoadStateListener(Function1<? super CombinedLoadStates, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (this.parentLoadStateListener.get() == null) {
            addLoadStateListenerInternal$paging_runtime_release(this.internalLoadStateListener);
        }
        this.childLoadStateListeners.add(listener);
    }

    public final void addLoadStateListenerInternal$paging_runtime_release(Function1<? super CombinedLoadStates, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.parentLoadStateListener.set(listener);
        this.presenter.addLoadStateListener(listener);
    }

    public final void addOnPagesUpdatedListener(Function0<Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.presenter.addOnPagesUpdatedListener(listener);
    }

    public final MutableStateFlow<Boolean> getInGetItem$paging_runtime_release() {
        return this.inGetItem;
    }

    public final Function1<CombinedLoadStates, Unit> getInternalLoadStateListener$paging_runtime_release() {
        return this.internalLoadStateListener;
    }

    @MainThread
    public final T getItem(@IntRange(from = 0) int index) {
        Boolean value;
        Boolean value2;
        Boolean value3;
        try {
            MutableStateFlow<Boolean> mutableStateFlow = this.inGetItem;
            do {
                value2 = mutableStateFlow.getValue();
                value2.getClass();
            } while (!mutableStateFlow.compareAndSet(value2, Boolean.TRUE));
            this.lastAccessedIndex = index;
            PlaceholderPaddedList<T> placeholderPaddedList = this.previousPresenter.get();
            T t10 = placeholderPaddedList != null ? (T) AsyncPagingDataDifferKt.get(placeholderPaddedList, index) : this.presenter.get(index);
            MutableStateFlow<Boolean> mutableStateFlow2 = this.inGetItem;
            do {
                value3 = mutableStateFlow2.getValue();
                value3.getClass();
            } while (!mutableStateFlow2.compareAndSet(value3, Boolean.FALSE));
            return t10;
        } catch (Throwable th) {
            MutableStateFlow<Boolean> mutableStateFlow3 = this.inGetItem;
            do {
                value = mutableStateFlow3.getValue();
                value.getClass();
            } while (!mutableStateFlow3.compareAndSet(value, Boolean.FALSE));
            throw th;
        }
    }

    public final int getItemCount() {
        PlaceholderPaddedList<T> placeholderPaddedList = this.previousPresenter.get();
        return placeholderPaddedList != null ? placeholderPaddedList.getSize() : this.presenter.getSize();
    }

    public final Flow<CombinedLoadStates> getLoadStateFlow() {
        return this.loadStateFlow;
    }

    public final Flow<Unit> getOnPagesUpdatedFlow() {
        return this.onPagesUpdatedFlow;
    }

    public final PagingDataPresenter<T> getPresenter$paging_runtime_release() {
        return this.presenter;
    }

    @MainThread
    public final T peek(@IntRange(from = 0) int index) {
        PlaceholderPaddedList<T> placeholderPaddedList = this.previousPresenter.get();
        return placeholderPaddedList != null ? (T) AsyncPagingDataDifferKt.peek(placeholderPaddedList, index) : this.presenter.peek(index);
    }

    public final void refresh() {
        this.presenter.refresh();
    }

    public final void removeLoadStateListener(Function1<? super CombinedLoadStates, Unit> listener) {
        Function1<CombinedLoadStates, Unit> function1;
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.childLoadStateListeners.remove(listener);
        if (!this.childLoadStateListeners.isEmpty() || (function1 = this.parentLoadStateListener.get()) == null) {
            return;
        }
        this.presenter.removeLoadStateListener(function1);
    }

    public final void removeOnPagesUpdatedListener(Function0<Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
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

    public final Object submitData(PagingData<T> pagingData, Continuation<? super Unit> continuation) {
        this.submitDataId.incrementAndGet();
        Object objCollectFrom = this.presenter.collectFrom(pagingData, continuation);
        return objCollectFrom == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollectFrom : Unit.INSTANCE;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AsyncPagingDataDiffer(DiffUtil.ItemCallback<T> diffCallback, ListUpdateCallback updateCallback, CoroutineContext mainDispatcher) {
        this(diffCallback, updateCallback, mainDispatcher, (CoroutineContext) null, 8, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(diffCallback, "diffCallback");
        Intrinsics.checkNotNullParameter(updateCallback, "updateCallback");
        Intrinsics.checkNotNullParameter(mainDispatcher, "mainDispatcher");
    }

    @JvmOverloads
    public AsyncPagingDataDiffer(DiffUtil.ItemCallback<T> diffCallback, ListUpdateCallback updateCallback, CoroutineContext mainDispatcher, CoroutineContext workerDispatcher) {
        Intrinsics.checkNotNullParameter(diffCallback, "diffCallback");
        Intrinsics.checkNotNullParameter(updateCallback, "updateCallback");
        Intrinsics.checkNotNullParameter(mainDispatcher, "mainDispatcher");
        Intrinsics.checkNotNullParameter(workerDispatcher, "workerDispatcher");
        this.diffCallback = diffCallback;
        this.updateCallback = updateCallback;
        this.mainDispatcher = mainDispatcher;
        this.workerDispatcher = workerDispatcher;
        this.inGetItem = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.previousPresenter = new AtomicReference<>(null);
        AsyncPagingDataDiffer$presenter$1 asyncPagingDataDiffer$presenter$1 = new AsyncPagingDataDiffer$presenter$1(this, mainDispatcher);
        this.presenter = asyncPagingDataDiffer$presenter$1;
        this.submitDataId = new AtomicInteger(0);
        this.loadStateFlow = FlowKt.flowOn(FlowKt.flow(new AsyncPagingDataDiffer$special$$inlined$transform$1(FlowKt__ContextKt.buffer$default(FlowKt.filterNotNull(asyncPagingDataDiffer$presenter$1.getLoadStateFlow()), -1, null, 2, null), null, this)), Dispatchers.getMain());
        this.onPagesUpdatedFlow = asyncPagingDataDiffer$presenter$1.getOnPagesUpdatedFlow();
        this.parentLoadStateListener = new AtomicReference<>(null);
        this.childLoadStateListeners = new CopyOnWriteArrayList<>();
        this.internalLoadStateListener = new Function1<CombinedLoadStates, Unit>(this) { // from class: androidx.paging.AsyncPagingDataDiffer$internalLoadStateListener$1
            final /* synthetic */ AsyncPagingDataDiffer<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(CombinedLoadStates combinedLoadStates) {
                invoke2(combinedLoadStates);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(CombinedLoadStates loadState) {
                Intrinsics.checkNotNullParameter(loadState, "loadState");
                if (!this.this$0.getInGetItem$paging_runtime_release().getValue().booleanValue()) {
                    Iterator it = ((AsyncPagingDataDiffer) this.this$0).childLoadStateListeners.iterator();
                    while (it.hasNext()) {
                        ((Function1) it.next()).invoke(loadState);
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
        this.LoadStateListenerHandler = LazyKt.lazy(new Function0<Handler>() { // from class: androidx.paging.AsyncPagingDataDiffer$LoadStateListenerHandler$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Handler invoke() {
                return new Handler(Looper.getMainLooper());
            }
        });
        this.LoadStateListenerRunnable = new AsyncPagingDataDiffer$LoadStateListenerRunnable$1(this);
    }

    public final void submitData(Lifecycle lifecycle, PagingData<T> pagingData) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(pagingData, "pagingData");
        BuildersKt__Builders_commonKt.launch$default(LifecycleKt.getCoroutineScope(lifecycle), null, null, new C41982(this, this.submitDataId.incrementAndGet(), pagingData, null), 3, null);
    }

    public /* synthetic */ AsyncPagingDataDiffer(DiffUtil.ItemCallback itemCallback, ListUpdateCallback listUpdateCallback, CoroutineContext coroutineContext, CoroutineContext coroutineContext2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(itemCallback, listUpdateCallback, (i10 & 4) != 0 ? Dispatchers.getMain() : coroutineContext, (i10 & 8) != 0 ? Dispatchers.getDefault() : coroutineContext2);
    }

    public /* synthetic */ AsyncPagingDataDiffer(DiffUtil.ItemCallback itemCallback, ListUpdateCallback listUpdateCallback, CoroutineDispatcher coroutineDispatcher, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(itemCallback, listUpdateCallback, (i10 & 4) != 0 ? Dispatchers.getMain() : coroutineDispatcher);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Superseded by constructors which accept CoroutineContext")
    public /* synthetic */ AsyncPagingDataDiffer(DiffUtil.ItemCallback diffCallback, ListUpdateCallback updateCallback, CoroutineDispatcher mainDispatcher) {
        this(diffCallback, updateCallback, (CoroutineContext) mainDispatcher, (CoroutineContext) Dispatchers.getDefault());
        Intrinsics.checkNotNullParameter(diffCallback, "diffCallback");
        Intrinsics.checkNotNullParameter(updateCallback, "updateCallback");
        Intrinsics.checkNotNullParameter(mainDispatcher, "mainDispatcher");
    }

    public /* synthetic */ AsyncPagingDataDiffer(DiffUtil.ItemCallback itemCallback, ListUpdateCallback listUpdateCallback, CoroutineDispatcher coroutineDispatcher, CoroutineDispatcher coroutineDispatcher2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(itemCallback, listUpdateCallback, (i10 & 4) != 0 ? Dispatchers.getMain() : coroutineDispatcher, (i10 & 8) != 0 ? Dispatchers.getDefault() : coroutineDispatcher2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Superseded by constructors which accept CoroutineContext")
    public /* synthetic */ AsyncPagingDataDiffer(DiffUtil.ItemCallback diffCallback, ListUpdateCallback updateCallback, CoroutineDispatcher mainDispatcher, CoroutineDispatcher workerDispatcher) {
        this(diffCallback, updateCallback, (CoroutineContext) mainDispatcher, (CoroutineContext) workerDispatcher);
        Intrinsics.checkNotNullParameter(diffCallback, "diffCallback");
        Intrinsics.checkNotNullParameter(updateCallback, "updateCallback");
        Intrinsics.checkNotNullParameter(mainDispatcher, "mainDispatcher");
        Intrinsics.checkNotNullParameter(workerDispatcher, "workerDispatcher");
    }
}
