package androidx.paging;

import androidx.annotation.IntRange;
import androidx.annotation.MainThread;
import androidx.paging.PageEvent;
import com.tencent.smtt.sdk.TbsListener;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.AbstractC9079b;
import kotlin.coroutines.InterfaceC9100d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import kotlinx.coroutines.channels.BufferOverflow;
import p123h7.C8736p;
import p135i8.AbstractC8833f;
import p135i8.C8843i0;
import p135i8.InterfaceC8822b0;
import p169l8.AbstractC9268e;
import p169l8.AbstractC9276m;
import p169l8.AbstractC9281r;
import p169l8.InterfaceC9266c;
import p169l8.InterfaceC9267d;
import p169l8.InterfaceC9270g;
import p169l8.InterfaceC9271h;
import p169l8.InterfaceC9280q;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

/* loaded from: classes3.dex */
public abstract class PagingDataPresenter<T> {
    private final InterfaceC9270g _onPagesUpdatedFlow;
    private final SingleRunner collectFromRunner;
    private final MutableCombinedLoadStateCollection combinedLoadStatesCollection;
    private HintReceiver hintReceiver;
    private final InterfaceC9271h inGetItem;
    private volatile int lastAccessedIndex;
    private volatile boolean lastAccessedIndexUnfulfilled;
    private final InterfaceC9280q loadStateFlow;
    private final InterfaceC9100d mainContext;
    private final CopyOnWriteArrayList<InterfaceC10559a> onPagesUpdatedListeners;
    private PageStore<T> pageStore;
    private UiReceiver uiReceiver;

    public static final class InitialUiReceiver implements UiReceiver {
        private boolean refresh;
        private boolean retry;

        public final boolean getRefresh() {
            return this.refresh;
        }

        public final boolean getRetry() {
            return this.retry;
        }

        @Override // androidx.paging.UiReceiver
        public void refresh() {
            this.refresh = true;
        }

        @Override // androidx.paging.UiReceiver
        public void retry() {
            this.retry = true;
        }

        public final void setRefresh(boolean z10) {
            this.refresh = z10;
        }

        public final void setRetry(boolean z10) {
            this.retry = z10;
        }
    }

    @InterfaceC9539d(m17800c = "androidx.paging.PagingDataPresenter$collectFrom$2", m17801f = "PagingDataPresenter.kt", m17802l = {TbsListener.ErrorCode.THREAD_INIT_ERROR}, m17803m = "invokeSuspend")
    /* renamed from: androidx.paging.PagingDataPresenter$collectFrom$2 */
    public static final class C43592 extends SuspendLambda implements InterfaceC10570l {
        final /* synthetic */ PagingData<T> $pagingData;
        int label;
        final /* synthetic */ PagingDataPresenter<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C43592(PagingDataPresenter<T> pagingDataPresenter, PagingData<T> pagingData, InterfaceC9324c<? super C43592> interfaceC9324c) {
            super(1, interfaceC9324c);
            this.this$0 = pagingDataPresenter;
            this.$pagingData = pagingData;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(InterfaceC9324c<?> interfaceC9324c) {
            return new C43592(this.this$0, this.$pagingData, interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                this.this$0.setUiReceiver(this.$pagingData.getUiReceiver$paging_common_release());
                InterfaceC9266c flow$paging_common_release = this.$pagingData.getFlow$paging_common_release();
                final PagingDataPresenter<T> pagingDataPresenter = this.this$0;
                final PagingData<T> pagingData = this.$pagingData;
                InterfaceC9267d interfaceC9267d = new InterfaceC9267d() { // from class: androidx.paging.PagingDataPresenter.collectFrom.2.1

                    @InterfaceC9539d(m17800c = "androidx.paging.PagingDataPresenter$collectFrom$2$1$2", m17801f = "PagingDataPresenter.kt", m17802l = {141, 158, 170, 173, TbsListener.ErrorCode.CREATE_TEMP_CONF_ERROR, 228}, m17803m = "invokeSuspend")
                    /* renamed from: androidx.paging.PagingDataPresenter$collectFrom$2$1$2, reason: invalid class name */
                    public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC10574p {
                        final /* synthetic */ PageEvent<T> $event;
                        final /* synthetic */ PagingData<T> $pagingData;
                        int label;
                        final /* synthetic */ PagingDataPresenter<T> this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass2(PageEvent<T> pageEvent, PagingDataPresenter<T> pagingDataPresenter, PagingData<T> pagingData, InterfaceC9324c<? super AnonymousClass2> interfaceC9324c) {
                            super(2, interfaceC9324c);
                            this.$event = pageEvent;
                            this.this$0 = pagingDataPresenter;
                            this.$pagingData = pagingData;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
                            return new AnonymousClass2(this.$event, this.this$0, this.$pagingData, interfaceC9324c);
                        }

                        @Override // p300x7.InterfaceC10574p
                        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
                            return ((AnonymousClass2) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
                        }

                        /* JADX WARN: Code restructure failed: missing block: B:21:0x0085, code lost:
                        
                            if (r14 == r0) goto L91;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:28:0x00d0, code lost:
                        
                            if (r1.presentNewList(r2, r3, r4, true, r6, r7, r8, r9) == r0) goto L91;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:38:0x010a, code lost:
                        
                            if (r14.presentPagingDataEvent(r1, r13) != r0) goto L40;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:90:0x0241, code lost:
                        
                            if (r14.presentPagingDataEvent(r1, r13) != r0) goto L92;
                         */
                        /* JADX WARN: Removed duplicated region for block: B:102:0x028c  */
                        /* JADX WARN: Removed duplicated region for block: B:105:0x029c A[LOOP:0: B:103:0x0296->B:105:0x029c, LOOP_END] */
                        /* JADX WARN: Removed duplicated region for block: B:37:0x00f7 A[PHI: r9
                          0x00f7: PHI (r9v4 androidx.paging.PagingDataPresenter$collectFrom$2$1$2) = 
                          (r9v0 androidx.paging.PagingDataPresenter$collectFrom$2$1$2)
                          (r9v0 androidx.paging.PagingDataPresenter$collectFrom$2$1$2)
                          (r9v5 androidx.paging.PagingDataPresenter$collectFrom$2$1$2)
                         binds: [B:33:0x00ea, B:35:0x00f3, B:9:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Removed duplicated region for block: B:89:0x022e A[PHI: r9
                          0x022e: PHI (r9v8 androidx.paging.PagingDataPresenter$collectFrom$2$1$2) = 
                          (r9v0 androidx.paging.PagingDataPresenter$collectFrom$2$1$2)
                          (r9v0 androidx.paging.PagingDataPresenter$collectFrom$2$1$2)
                          (r9v9 androidx.paging.PagingDataPresenter$collectFrom$2$1$2)
                         binds: [B:85:0x0222, B:87:0x022b, B:7:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Removed duplicated region for block: B:98:0x0284  */
                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
                            /*
                                Method dump skipped, instructions count: 700
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PagingDataPresenter.C43592.AnonymousClass1.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
                        }
                    }

                    @Override // p169l8.InterfaceC9267d
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, InterfaceC9324c interfaceC9324c) {
                        return emit((PageEvent) obj2, (InterfaceC9324c<? super C8736p>) interfaceC9324c);
                    }

                    public final Object emit(PageEvent<T> pageEvent, InterfaceC9324c<? super C8736p> interfaceC9324c) {
                        PagingLogger pagingLogger = PagingLogger.INSTANCE;
                        if (pagingLogger.isLoggable(2)) {
                            pagingLogger.log(2, "Collected " + pageEvent, null);
                        }
                        Object objM14848g = AbstractC8833f.m14848g(((PagingDataPresenter) pagingDataPresenter).mainContext, new AnonymousClass2(pageEvent, pagingDataPresenter, pagingData, null), interfaceC9324c);
                        return objM14848g == AbstractC9434a.m17291f() ? objM14848g : C8736p.f16368a;
                    }
                };
                this.label = 1;
                if (flow$paging_common_release.collect(interfaceC9267d, this) == objM17291f) {
                    return objM17291f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9079b.m15926b(obj);
            }
            return C8736p.f16368a;
        }

        @Override // p300x7.InterfaceC10570l
        public final Object invoke(InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C43592) create(interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }
    }

    @InterfaceC9539d(m17800c = "androidx.paging.PagingDataPresenter", m17801f = "PagingDataPresenter.kt", m17802l = {478}, m17803m = "presentNewList")
    /* renamed from: androidx.paging.PagingDataPresenter$presentNewList$1 */
    public static final class C43601 extends ContinuationImpl {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ PagingDataPresenter<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C43601(PagingDataPresenter<T> pagingDataPresenter, InterfaceC9324c<? super C43601> interfaceC9324c) {
            super(interfaceC9324c);
            this.this$0 = pagingDataPresenter;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.presentNewList(null, 0, 0, false, null, null, null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PagingDataPresenter() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object presentNewList(java.util.List<androidx.paging.TransformablePage<T>> r8, int r9, int r10, boolean r11, androidx.paging.LoadStates r12, androidx.paging.LoadStates r13, androidx.paging.HintReceiver r14, p179m7.InterfaceC9324c<? super p123h7.C8736p> r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PagingDataPresenter.presentNewList(java.util.List, int, int, boolean, androidx.paging.LoadStates, androidx.paging.LoadStates, androidx.paging.HintReceiver, m7.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setUiReceiver(UiReceiver uiReceiver) {
        UiReceiver uiReceiver2 = this.uiReceiver;
        this.uiReceiver = uiReceiver;
        if (uiReceiver2 instanceof InitialUiReceiver) {
            InitialUiReceiver initialUiReceiver = (InitialUiReceiver) uiReceiver2;
            if (initialUiReceiver.getRetry()) {
                uiReceiver.retry();
            }
            if (initialUiReceiver.getRefresh()) {
                uiReceiver.refresh();
            }
        }
    }

    public final void addLoadStateListener(InterfaceC10570l listener) {
        AbstractC9133u.m16133g(listener, "listener");
        this.combinedLoadStatesCollection.addListener(listener);
    }

    public final void addOnPagesUpdatedListener(InterfaceC10559a listener) {
        AbstractC9133u.m16133g(listener, "listener");
        this.onPagesUpdatedListeners.add(listener);
    }

    public final Object collectFrom(PagingData<T> pagingData, InterfaceC9324c<C8736p> interfaceC9324c) {
        Object objRunInIsolation$default = SingleRunner.runInIsolation$default(this.collectFromRunner, 0, new C43592(this, pagingData, null), interfaceC9324c, 1, null);
        return objRunInIsolation$default == AbstractC9434a.m17291f() ? objRunInIsolation$default : C8736p.f16368a;
    }

    @MainThread
    public final T get(@IntRange(from = 0) int i10) {
        Object value;
        Object value2;
        InterfaceC9271h interfaceC9271h = this.inGetItem;
        do {
            value = interfaceC9271h.getValue();
            ((Boolean) value).getClass();
        } while (!interfaceC9271h.mo16686e(value, Boolean.TRUE));
        this.lastAccessedIndexUnfulfilled = true;
        this.lastAccessedIndex = i10;
        PagingLogger pagingLogger = PagingLogger.INSTANCE;
        if (pagingLogger.isLoggable(2)) {
            pagingLogger.log(2, "Accessing item index[" + i10 + ']', null);
        }
        HintReceiver hintReceiver = this.hintReceiver;
        if (hintReceiver != null) {
            hintReceiver.accessHint(this.pageStore.accessHintForPresenterIndex(i10));
        }
        T t10 = this.pageStore.get(i10);
        InterfaceC9271h interfaceC9271h2 = this.inGetItem;
        do {
            value2 = interfaceC9271h2.getValue();
            ((Boolean) value2).getClass();
        } while (!interfaceC9271h2.mo16686e(value2, Boolean.FALSE));
        return t10;
    }

    public final InterfaceC9280q getLoadStateFlow() {
        return this.loadStateFlow;
    }

    public final InterfaceC9266c getOnPagesUpdatedFlow() {
        return AbstractC9268e.m17011a(this._onPagesUpdatedFlow);
    }

    public final int getSize() {
        return this.pageStore.getSize();
    }

    @MainThread
    public final T peek(@IntRange(from = 0) int i10) {
        return this.pageStore.get(i10);
    }

    public abstract Object presentPagingDataEvent(PagingDataEvent<T> pagingDataEvent, InterfaceC9324c<C8736p> interfaceC9324c);

    public final void refresh() {
        PagingLogger pagingLogger = PagingLogger.INSTANCE;
        if (pagingLogger.isLoggable(3)) {
            pagingLogger.log(3, "Refresh signal received", null);
        }
        this.uiReceiver.refresh();
    }

    public final void removeLoadStateListener(InterfaceC10570l listener) {
        AbstractC9133u.m16133g(listener, "listener");
        this.combinedLoadStatesCollection.removeListener(listener);
    }

    public final void removeOnPagesUpdatedListener(InterfaceC10559a listener) {
        AbstractC9133u.m16133g(listener, "listener");
        this.onPagesUpdatedListeners.remove(listener);
    }

    public final void retry() {
        PagingLogger pagingLogger = PagingLogger.INSTANCE;
        if (pagingLogger.isLoggable(3)) {
            pagingLogger.log(3, "Retry signal received", null);
        }
        this.uiReceiver.retry();
    }

    public final ItemSnapshotList<T> snapshot() {
        return this.pageStore.snapshot();
    }

    public PagingDataPresenter(InterfaceC9100d mainContext, PagingData<T> pagingData) {
        PageEvent.Insert<T> insertCachedEvent$paging_common_release;
        AbstractC9133u.m16133g(mainContext, "mainContext");
        this.mainContext = mainContext;
        this.uiReceiver = new InitialUiReceiver();
        AbstractC9126n abstractC9126n = null;
        this.pageStore = PageStore.Companion.initial$paging_common_release(pagingData != null ? pagingData.cachedEvent$paging_common_release() : null);
        MutableCombinedLoadStateCollection mutableCombinedLoadStateCollection = new MutableCombinedLoadStateCollection();
        if (pagingData != null && (insertCachedEvent$paging_common_release = pagingData.cachedEvent$paging_common_release()) != null) {
            mutableCombinedLoadStateCollection.set(insertCachedEvent$paging_common_release.getSourceLoadStates(), insertCachedEvent$paging_common_release.getMediatorLoadStates());
        }
        this.combinedLoadStatesCollection = mutableCombinedLoadStateCollection;
        this.onPagesUpdatedListeners = new CopyOnWriteArrayList<>();
        this.collectFromRunner = new SingleRunner(false, 1, abstractC9126n);
        this.inGetItem = AbstractC9281r.m17054a(Boolean.FALSE);
        this.loadStateFlow = mutableCombinedLoadStateCollection.getStateFlow();
        this._onPagesUpdatedFlow = AbstractC9276m.m17043a(0, 64, BufferOverflow.f17604b);
        addOnPagesUpdatedListener(new InterfaceC10559a(this) { // from class: androidx.paging.PagingDataPresenter.1
            final /* synthetic */ PagingDataPresenter<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // p300x7.InterfaceC10559a
            public /* bridge */ /* synthetic */ Object invoke() {
                m27212invoke();
                return C8736p.f16368a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m27212invoke() {
                ((PagingDataPresenter) this.this$0)._onPagesUpdatedFlow.mo16670a(C8736p.f16368a);
            }
        });
    }

    public /* synthetic */ PagingDataPresenter(InterfaceC9100d interfaceC9100d, PagingData pagingData, int i10, AbstractC9126n abstractC9126n) {
        this((i10 & 1) != 0 ? C8843i0.m14868c() : interfaceC9100d, (i10 & 2) != 0 ? null : pagingData);
    }
}
