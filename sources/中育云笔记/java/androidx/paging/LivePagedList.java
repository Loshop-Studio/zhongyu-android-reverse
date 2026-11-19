package androidx.paging;

import androidx.lifecycle.LiveData;
import androidx.paging.LoadState;
import androidx.paging.PagedList;
import com.taobao.sophix.PatchStatus;
import com.tendcloud.tenddata.C7843ab;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9979u;
import kotlinx.coroutines.InterfaceC10045g;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.AbstractC11106e0;
import sd.AbstractC11117h;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

/* loaded from: classes3.dex */
public final class LivePagedList<Key, Value> extends LiveData<PagedList<Value>> {
    private final PagedList.BoundaryCallback<Value> boundaryCallback;
    private final InterfaceC9529a callback;
    private final PagedList.Config config;
    private final InterfaceC11122i0 coroutineScope;
    private PagedList<Value> currentData;
    private InterfaceC10045g currentJob;
    private final AbstractC11106e0 fetchDispatcher;
    private final AbstractC11106e0 notifyDispatcher;
    private final InterfaceC9529a pagingSourceFactory;
    private final Runnable refreshRetryCallback;

    @InterfaceC11829d(m26210c = "androidx.paging.LivePagedList$invalidate$1", m26211f = "LivePagedList.kt", m26212l = {PatchStatus.CODE_LOAD_ILLEGAL_ACCESS, C7843ab.b.API_MYNA_START}, m26213m = "invokeSuspend", m26214v = 1)
    /* renamed from: androidx.paging.LivePagedList$invalidate$1 */
    public static final class C42351 extends SuspendLambda implements InterfaceC9544p {
        Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ LivePagedList<Key, Value> this$0;

        @InterfaceC11829d(m26210c = "androidx.paging.LivePagedList$invalidate$1$1", m26211f = "LivePagedList.kt", m26212l = {}, m26213m = "invokeSuspend", m26214v = 1)
        /* renamed from: androidx.paging.LivePagedList$invalidate$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC9544p {
            int label;
            final /* synthetic */ LivePagedList<Key, Value> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(LivePagedList<Key, Value> livePagedList, InterfaceC11588c<? super AnonymousClass1> interfaceC11588c) {
                super(2, interfaceC11588c);
                this.this$0 = livePagedList;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
                return new AnonymousClass1(this.this$0, interfaceC11588c);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                AbstractC11725a.m25952f();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
                ((LivePagedList) this.this$0).currentData.setInitialLoadState(LoadType.REFRESH, LoadState.Loading.INSTANCE);
                return C10786q.f26013a;
            }

            @Override // p181hd.InterfaceC9544p
            public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                return ((AnonymousClass1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42351(LivePagedList<Key, Value> livePagedList, InterfaceC11588c<? super C42351> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.this$0 = livePagedList;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            return new C42351(this.this$0, interfaceC11588c);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x00aa  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x00bf  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 289
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.LivePagedList.C42351.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C42351) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LivePagedList(InterfaceC11122i0 coroutineScope, Key key, PagedList.Config config, PagedList.BoundaryCallback<Value> boundaryCallback, InterfaceC9529a pagingSourceFactory, AbstractC11106e0 notifyDispatcher, AbstractC11106e0 fetchDispatcher) {
        super(new InitialPagedList(coroutineScope, notifyDispatcher, fetchDispatcher, config, key));
        AbstractC9979u.m20294g(coroutineScope, "coroutineScope");
        AbstractC9979u.m20294g(config, "config");
        AbstractC9979u.m20294g(pagingSourceFactory, "pagingSourceFactory");
        AbstractC9979u.m20294g(notifyDispatcher, "notifyDispatcher");
        AbstractC9979u.m20294g(fetchDispatcher, "fetchDispatcher");
        this.coroutineScope = coroutineScope;
        this.config = config;
        this.boundaryCallback = boundaryCallback;
        this.pagingSourceFactory = pagingSourceFactory;
        this.notifyDispatcher = notifyDispatcher;
        this.fetchDispatcher = fetchDispatcher;
        this.callback = new InterfaceC9529a() { // from class: androidx.paging.z
            @Override // p181hd.InterfaceC9529a
            public final Object invoke() {
                return LivePagedList.callback$lambda$0(this.f1972c);
            }
        };
        Runnable runnable = new Runnable() { // from class: androidx.paging.a0
            @Override // java.lang.Runnable
            public final void run() {
                this.f1890c.invalidate(true);
            }
        };
        this.refreshRetryCallback = runnable;
        PagedList<Value> value = getValue();
        AbstractC9979u.m20291d(value);
        PagedList<Value> pagedList = value;
        this.currentData = pagedList;
        pagedList.setRetryCallback(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C10786q callback$lambda$0(LivePagedList livePagedList) {
        livePagedList.invalidate(true);
        return C10786q.f26013a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void invalidate(boolean z10) {
        InterfaceC10045g interfaceC10045g = this.currentJob;
        if (interfaceC10045g == null || z10) {
            if (interfaceC10045g != null) {
                InterfaceC10045g.a.m20900a(interfaceC10045g, null, 1, null);
            }
            this.currentJob = AbstractC11117h.m24726d(this.coroutineScope, this.fetchDispatcher, null, new C42351(this, null), 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onItemUpdate(PagedList<Value> pagedList, PagedList<Value> pagedList2) {
        pagedList.setRetryCallback(null);
        pagedList2.setRetryCallback(this.refreshRetryCallback);
    }

    @Override // androidx.lifecycle.LiveData
    public void onActive() {
        super.onActive();
        invalidate(false);
    }
}
