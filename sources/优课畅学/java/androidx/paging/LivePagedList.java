package androidx.paging;

import androidx.lifecycle.LiveData;
import androidx.paging.LoadState;
import androidx.paging.PagedList;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9133u;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.InterfaceC9212n;
import p123h7.C8736p;
import p135i8.AbstractC8839h;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10574p;

/* loaded from: classes3.dex */
public final class LivePagedList<Key, Value> extends LiveData<PagedList<Value>> {
    private final PagedList.BoundaryCallback<Value> boundaryCallback;
    private final InterfaceC10559a callback;
    private final PagedList.Config config;
    private final InterfaceC8822b0 coroutineScope;
    private PagedList<Value> currentData;
    private InterfaceC9212n currentJob;
    private final CoroutineDispatcher fetchDispatcher;
    private final CoroutineDispatcher notifyDispatcher;
    private final InterfaceC10559a pagingSourceFactory;
    private final Runnable refreshRetryCallback;

    @InterfaceC9539d(m17800c = "androidx.paging.LivePagedList$invalidate$1", m17801f = "LivePagedList.kt", m17802l = {82, 90}, m17803m = "invokeSuspend")
    /* renamed from: androidx.paging.LivePagedList$invalidate$1 */
    public static final class C43131 extends SuspendLambda implements InterfaceC10574p {
        Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ LivePagedList<Key, Value> this$0;

        @InterfaceC9539d(m17800c = "androidx.paging.LivePagedList$invalidate$1$1", m17801f = "LivePagedList.kt", m17802l = {}, m17803m = "invokeSuspend")
        /* renamed from: androidx.paging.LivePagedList$invalidate$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC10574p {
            int label;
            final /* synthetic */ LivePagedList<Key, Value> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(LivePagedList<Key, Value> livePagedList, InterfaceC9324c<? super AnonymousClass1> interfaceC9324c) {
                super(2, interfaceC9324c);
                this.this$0 = livePagedList;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
                return new AnonymousClass1(this.this$0, interfaceC9324c);
            }

            @Override // p300x7.InterfaceC10574p
            public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
                return ((AnonymousClass1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                AbstractC9434a.m17291f();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9079b.m15926b(obj);
                ((LivePagedList) this.this$0).currentData.setInitialLoadState(LoadType.REFRESH, LoadState.Loading.INSTANCE);
                return C8736p.f16368a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C43131(LivePagedList<Key, Value> livePagedList, InterfaceC9324c<? super C43131> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.this$0 = livePagedList;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            return new C43131(this.this$0, interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C43131) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
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
                Method dump skipped, instructions count: 283
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.LivePagedList.C43131.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LivePagedList(InterfaceC8822b0 coroutineScope, Key key, PagedList.Config config, PagedList.BoundaryCallback<Value> boundaryCallback, InterfaceC10559a pagingSourceFactory, CoroutineDispatcher notifyDispatcher, CoroutineDispatcher fetchDispatcher) {
        super(new InitialPagedList(coroutineScope, notifyDispatcher, fetchDispatcher, config, key));
        AbstractC9133u.m16133g(coroutineScope, "coroutineScope");
        AbstractC9133u.m16133g(config, "config");
        AbstractC9133u.m16133g(pagingSourceFactory, "pagingSourceFactory");
        AbstractC9133u.m16133g(notifyDispatcher, "notifyDispatcher");
        AbstractC9133u.m16133g(fetchDispatcher, "fetchDispatcher");
        this.coroutineScope = coroutineScope;
        this.config = config;
        this.boundaryCallback = boundaryCallback;
        this.pagingSourceFactory = pagingSourceFactory;
        this.notifyDispatcher = notifyDispatcher;
        this.fetchDispatcher = fetchDispatcher;
        this.callback = new InterfaceC10559a(this) { // from class: androidx.paging.LivePagedList$callback$1
            final /* synthetic */ LivePagedList<Key, Value> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // p300x7.InterfaceC10559a
            public /* bridge */ /* synthetic */ Object invoke() {
                m27206invoke();
                return C8736p.f16368a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m27206invoke() {
                this.this$0.invalidate(true);
            }
        };
        Runnable runnable = new Runnable() { // from class: androidx.paging.k
            @Override // java.lang.Runnable
            public final void run() {
                LivePagedList.refreshRetryCallback$lambda$0(this.f1852a);
            }
        };
        this.refreshRetryCallback = runnable;
        PagedList<Value> value = getValue();
        AbstractC9133u.m16130d(value);
        PagedList<Value> pagedList = value;
        this.currentData = pagedList;
        pagedList.setRetryCallback(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void invalidate(boolean z10) {
        InterfaceC9212n interfaceC9212n = this.currentJob;
        if (interfaceC9212n == null || z10) {
            if (interfaceC9212n != null) {
                InterfaceC9212n.a.m16777a(interfaceC9212n, null, 1, null);
            }
            this.currentJob = AbstractC8839h.m14861d(this.coroutineScope, this.fetchDispatcher, null, new C43131(this, null), 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onItemUpdate(PagedList<Value> pagedList, PagedList<Value> pagedList2) {
        pagedList.setRetryCallback(null);
        pagedList2.setRetryCallback(this.refreshRetryCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void refreshRetryCallback$lambda$0(LivePagedList this$0) {
        AbstractC9133u.m16133g(this$0, "this$0");
        this$0.invalidate(true);
    }

    @Override // androidx.lifecycle.LiveData
    public void onActive() {
        super.onActive();
        invalidate(false);
    }
}
