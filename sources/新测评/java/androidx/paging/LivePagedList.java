package androidx.paging;

import androidx.lifecycle.LiveData;
import androidx.paging.LoadState;
import androidx.paging.PagedList;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

@Metadata(m13557d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00022\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00050\u0004BY\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00018\u0000\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\f\u0012\u0018\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000f0\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0002\u0010\u0013J\u0010\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\b\u0010\u001e\u001a\u00020\u0015H\u0014J$\u0010\u001f\u001a\u00020\u00152\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00010\u00052\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005H\u0002R\u0016\u0010\u000b\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, m13558d2 = {"Landroidx/paging/LivePagedList;", "Key", "", "Value", "Landroidx/lifecycle/LiveData;", "Landroidx/paging/PagedList;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "initialKey", "config", "Landroidx/paging/PagedList$Config;", "boundaryCallback", "Landroidx/paging/PagedList$BoundaryCallback;", "pagingSourceFactory", "Lkotlin/Function0;", "Landroidx/paging/PagingSource;", "notifyDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "fetchDispatcher", "(Lkotlinx/coroutines/CoroutineScope;Ljava/lang/Object;Landroidx/paging/PagedList$Config;Landroidx/paging/PagedList$BoundaryCallback;Lkotlin/jvm/functions/Function0;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineDispatcher;)V", "callback", "", "currentData", "currentJob", "Lkotlinx/coroutines/Job;", "refreshRetryCallback", "Ljava/lang/Runnable;", "invalidate", "force", "", "onActive", "onItemUpdate", "previous", "next", "paging-runtime_release"}, m13559k = 1, m13560mv = {1, 8, 0}, m13562xi = 48)
/* loaded from: classes3.dex */
public final class LivePagedList<Key, Value> extends LiveData<PagedList<Value>> {
    private final PagedList.BoundaryCallback<Value> boundaryCallback;
    private final Function0<Unit> callback;
    private final PagedList.Config config;
    private final CoroutineScope coroutineScope;
    private PagedList<Value> currentData;
    private Job currentJob;
    private final CoroutineDispatcher fetchDispatcher;
    private final CoroutineDispatcher notifyDispatcher;
    private final Function0<PagingSource<Key, Value>> pagingSourceFactory;
    private final Runnable refreshRetryCallback;

    @Metadata(m13557d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0003*\u00020\u0005H\u008a@"}, m13558d2 = {"<anonymous>", "", "Key", "", "Value", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {1, 8, 0}, m13562xi = 48)
    @DebugMetadata(m13595c = "androidx.paging.LivePagedList$invalidate$1", m13596f = "LivePagedList.kt", m13597i = {0, 1, 1}, m13598l = {82, 90}, m13599m = "invokeSuspend", m13600n = {"pagingSource", "pagingSource", "lastKey"}, m13601s = {"L$0", "L$0", "L$1"})
    /* renamed from: androidx.paging.LivePagedList$invalidate$1 */
    public static final class C42271 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ LivePagedList<Key, Value> this$0;

        @Metadata(m13557d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0003*\u00020\u0005H\u008a@"}, m13558d2 = {"<anonymous>", "", "Key", "", "Value", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {1, 8, 0}, m13562xi = 48)
        @DebugMetadata(m13595c = "androidx.paging.LivePagedList$invalidate$1$1", m13596f = "LivePagedList.kt", m13597i = {}, m13598l = {}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
        /* renamed from: androidx.paging.LivePagedList$invalidate$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ LivePagedList<Key, Value> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(LivePagedList<Key, Value> livePagedList, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = livePagedList;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                ((LivePagedList) this.this$0).currentData.setInitialLoadState(LoadType.REFRESH, LoadState.Loading.INSTANCE);
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42271(LivePagedList<Key, Value> livePagedList, Continuation<? super C42271> continuation) {
            super(2, continuation);
            this.this$0 = livePagedList;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C42271(this.this$0, continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x00aa  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x00bf  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                Method dump skipped, instructions count: 283
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.LivePagedList.C42271.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C42271) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LivePagedList(CoroutineScope coroutineScope, Key key, PagedList.Config config, PagedList.BoundaryCallback<Value> boundaryCallback, Function0<? extends PagingSource<Key, Value>> pagingSourceFactory, CoroutineDispatcher notifyDispatcher, CoroutineDispatcher fetchDispatcher) {
        super(new InitialPagedList(coroutineScope, notifyDispatcher, fetchDispatcher, config, key));
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(pagingSourceFactory, "pagingSourceFactory");
        Intrinsics.checkNotNullParameter(notifyDispatcher, "notifyDispatcher");
        Intrinsics.checkNotNullParameter(fetchDispatcher, "fetchDispatcher");
        this.coroutineScope = coroutineScope;
        this.config = config;
        this.boundaryCallback = boundaryCallback;
        this.pagingSourceFactory = pagingSourceFactory;
        this.notifyDispatcher = notifyDispatcher;
        this.fetchDispatcher = fetchDispatcher;
        this.callback = new Function0<Unit>(this) { // from class: androidx.paging.LivePagedList$callback$1
            final /* synthetic */ LivePagedList<Key, Value> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.this$0.invalidate(true);
            }
        };
        Runnable runnable = new Runnable() { // from class: androidx.paging.k
            @Override // java.lang.Runnable
            public final void run() {
                LivePagedList.refreshRetryCallback$lambda$0(this.f2092a);
            }
        };
        this.refreshRetryCallback = runnable;
        PagedList<Value> value = getValue();
        Intrinsics.checkNotNull(value);
        PagedList<Value> pagedList = value;
        this.currentData = pagedList;
        pagedList.setRetryCallback(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void invalidate(boolean force) {
        Job job = this.currentJob;
        if (job == null || force) {
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            this.currentJob = BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, this.fetchDispatcher, null, new C42271(this, null), 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onItemUpdate(PagedList<Value> previous, PagedList<Value> next) {
        previous.setRetryCallback(null);
        next.setRetryCallback(this.refreshRetryCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void refreshRetryCallback$lambda$0(LivePagedList this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.invalidate(true);
    }

    @Override // androidx.lifecycle.LiveData
    public void onActive() {
        super.onActive();
        invalidate(false);
    }
}
