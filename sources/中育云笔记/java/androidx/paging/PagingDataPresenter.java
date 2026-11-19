package androidx.paging;

import androidx.annotation.IntRange;
import androidx.annotation.MainThread;
import androidx.paging.PageEvent;
import androidx.paging.internal.CopyOnWriteArrayList;
import com.alibaba.fastjson.asm.Opcodes;
import com.taobao.sophix.PatchStatus;
import kotlin.AbstractC9924b;
import kotlin.coroutines.InterfaceC9945d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import kotlinx.coroutines.channels.BufferOverflow;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p379vd.AbstractC11596e;
import p379vd.AbstractC11608q;
import p379vd.AbstractC11613v;
import p379vd.InterfaceC11594c;
import p379vd.InterfaceC11595d;
import p379vd.InterfaceC11602k;
import p379vd.InterfaceC11603l;
import p379vd.InterfaceC11612u;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.AbstractC11109f;
import sd.C11157r0;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

/* loaded from: classes3.dex */
public abstract class PagingDataPresenter<T> {
    private final InterfaceC11602k _onPagesUpdatedFlow;
    private final SingleRunner collectFromRunner;
    private final MutableCombinedLoadStateCollection combinedLoadStatesCollection;
    private HintReceiver hintReceiver;
    private final InterfaceC11603l inGetItem;
    private volatile int lastAccessedIndex;
    private volatile boolean lastAccessedIndexUnfulfilled;
    private final InterfaceC11612u loadStateFlow;
    private final InterfaceC9945d mainContext;
    private final CopyOnWriteArrayList<InterfaceC9529a> onPagesUpdatedListeners;
    private PageStore<T> pageStore;
    private UiReceiver uiReceiver;

    public static final class InitialUiReceiver implements UiReceiver {
        private boolean shouldRefresh;
        private boolean shouldRetry;

        public final boolean getShouldRefresh() {
            return this.shouldRefresh;
        }

        public final boolean getShouldRetry() {
            return this.shouldRetry;
        }

        @Override // androidx.paging.UiReceiver
        public void refresh() {
            this.shouldRefresh = true;
        }

        @Override // androidx.paging.UiReceiver
        public void retry() {
            this.shouldRetry = true;
        }

        public final void setShouldRefresh(boolean z10) {
            this.shouldRefresh = z10;
        }

        public final void setShouldRetry(boolean z10) {
            this.shouldRetry = z10;
        }
    }

    @InterfaceC11829d(m26210c = "androidx.paging.PagingDataPresenter$collectFrom$2", m26211f = "PagingDataPresenter.kt", m26212l = {119}, m26213m = "invokeSuspend", m26214v = 1)
    /* renamed from: androidx.paging.PagingDataPresenter$collectFrom$2 */
    public static final class C42662 extends SuspendLambda implements InterfaceC9540l {
        final /* synthetic */ PagingData<T> $pagingData;
        int label;
        final /* synthetic */ PagingDataPresenter<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42662(PagingDataPresenter<T> pagingDataPresenter, PagingData<T> pagingData, InterfaceC11588c<? super C42662> interfaceC11588c) {
            super(1, interfaceC11588c);
            this.this$0 = pagingDataPresenter;
            this.$pagingData = pagingData;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(InterfaceC11588c<?> interfaceC11588c) {
            return new C42662(this.this$0, this.$pagingData, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                this.this$0.setUiReceiver(this.$pagingData.getUiReceiver$paging_common());
                InterfaceC11594c flow$paging_common = this.$pagingData.getFlow$paging_common();
                final PagingDataPresenter<T> pagingDataPresenter = this.this$0;
                final PagingData<T> pagingData = this.$pagingData;
                InterfaceC11595d interfaceC11595d = new InterfaceC11595d() { // from class: androidx.paging.PagingDataPresenter.collectFrom.2.1

                    @InterfaceC11829d(m26210c = "androidx.paging.PagingDataPresenter$collectFrom$2$1$2", m26211f = "PagingDataPresenter.kt", m26212l = {PatchStatus.CODE_LOAD_LIB_NS, Opcodes.IFEQ, Opcodes.IF_ACMPEQ, 168, 223, 226}, m26213m = "invokeSuspend", m26214v = 1)
                    /* renamed from: androidx.paging.PagingDataPresenter$collectFrom$2$1$2, reason: invalid class name */
                    public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC9544p {
                        final /* synthetic */ PageEvent<T> $event;
                        final /* synthetic */ PagingData<T> $pagingData;
                        int label;
                        final /* synthetic */ PagingDataPresenter<T> this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass2(PageEvent<T> pageEvent, PagingDataPresenter<T> pagingDataPresenter, PagingData<T> pagingData, InterfaceC11588c<? super AnonymousClass2> interfaceC11588c) {
                            super(2, interfaceC11588c);
                            this.$event = pageEvent;
                            this.this$0 = pagingDataPresenter;
                            this.$pagingData = pagingData;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
                            return new AnonymousClass2(this.$event, this.this$0, this.$pagingData, interfaceC11588c);
                        }

                        /* JADX WARN: Code restructure failed: missing block: B:21:0x0093, code lost:
                        
                            if (r14 == r0) goto L91;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:28:0x00de, code lost:
                        
                            if (r1.presentNewList(r2, r3, r4, true, r6, r7, r8, r9) == r0) goto L91;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:38:0x0118, code lost:
                        
                            if (r14.presentPagingDataEvent(r1, r13) != r0) goto L40;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:90:0x0256, code lost:
                        
                            if (r14.presentPagingDataEvent(r1, r13) != r0) goto L92;
                         */
                        /* JADX WARN: Removed duplicated region for block: B:102:0x02a1  */
                        /* JADX WARN: Removed duplicated region for block: B:105:0x02b1 A[LOOP:0: B:103:0x02ab->B:105:0x02b1, LOOP_END] */
                        /* JADX WARN: Removed duplicated region for block: B:37:0x0105 A[PHI: r9
                          0x0105: PHI (r9v4 androidx.paging.PagingDataPresenter$collectFrom$2$1$2) = 
                          (r9v0 androidx.paging.PagingDataPresenter$collectFrom$2$1$2)
                          (r9v0 androidx.paging.PagingDataPresenter$collectFrom$2$1$2)
                          (r9v5 androidx.paging.PagingDataPresenter$collectFrom$2$1$2)
                         binds: [B:33:0x00f8, B:35:0x0101, B:9:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Removed duplicated region for block: B:89:0x0243 A[PHI: r9
                          0x0243: PHI (r9v8 androidx.paging.PagingDataPresenter$collectFrom$2$1$2) = 
                          (r9v0 androidx.paging.PagingDataPresenter$collectFrom$2$1$2)
                          (r9v0 androidx.paging.PagingDataPresenter$collectFrom$2$1$2)
                          (r9v9 androidx.paging.PagingDataPresenter$collectFrom$2$1$2)
                         binds: [B:85:0x0237, B:87:0x0240, B:7:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Removed duplicated region for block: B:98:0x0299  */
                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
                            /*
                                Method dump skipped, instructions count: 720
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PagingDataPresenter.C42662.AnonymousClass1.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
                        }

                        @Override // p181hd.InterfaceC9544p
                        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                            return ((AnonymousClass2) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
                        }
                    }

                    @Override // p379vd.InterfaceC11595d
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, InterfaceC11588c interfaceC11588c) {
                        return emit((PageEvent) obj2, (InterfaceC11588c<? super C10786q>) interfaceC11588c);
                    }

                    public final Object emit(PageEvent<T> pageEvent, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                        PagingLogger pagingLogger = PagingLogger.INSTANCE;
                        if (pagingLogger.isLoggable(2)) {
                            pagingLogger.log(2, "Collected " + pageEvent, null);
                        }
                        Object objM24709g = AbstractC11109f.m24709g(((PagingDataPresenter) pagingDataPresenter).mainContext, new AnonymousClass2(pageEvent, pagingDataPresenter, pagingData, null), interfaceC11588c);
                        return objM24709g == AbstractC11725a.m25952f() ? objM24709g : C10786q.f26013a;
                    }
                };
                this.label = 1;
                if (flow$paging_common.collect(interfaceC11595d, this) == objM25952f) {
                    return objM25952f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
            }
            return C10786q.f26013a;
        }

        @Override // p181hd.InterfaceC9540l
        public final Object invoke(InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C42662) create(interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.paging.PagingDataPresenter", m26211f = "PagingDataPresenter.kt", m26212l = {468}, m26213m = "presentNewList", m26214v = 1)
    /* renamed from: androidx.paging.PagingDataPresenter$presentNewList$1 */
    public static final class C42671 extends ContinuationImpl {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ PagingDataPresenter<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42671(PagingDataPresenter<T> pagingDataPresenter, InterfaceC11588c<? super C42671> interfaceC11588c) {
            super(interfaceC11588c);
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
    public static final C10786q _init_$lambda$0(PagingDataPresenter pagingDataPresenter) {
        InterfaceC11602k interfaceC11602k = pagingDataPresenter._onPagesUpdatedFlow;
        C10786q c10786q = C10786q.f26013a;
        interfaceC11602k.mo20854a(c10786q);
        return c10786q;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object presentNewList(java.util.List<androidx.paging.TransformablePage<T>> r18, int r19, int r20, boolean r21, androidx.paging.LoadStates r22, androidx.paging.LoadStates r23, androidx.paging.HintReceiver r24, vc.InterfaceC11588c<? super p309qc.C10786q> r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PagingDataPresenter.presentNewList(java.util.List, int, int, boolean, androidx.paging.LoadStates, androidx.paging.LoadStates, androidx.paging.HintReceiver, vc.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setUiReceiver(UiReceiver uiReceiver) {
        UiReceiver uiReceiver2 = this.uiReceiver;
        this.uiReceiver = uiReceiver;
        if (uiReceiver2 instanceof InitialUiReceiver) {
            InitialUiReceiver initialUiReceiver = (InitialUiReceiver) uiReceiver2;
            if (initialUiReceiver.getShouldRetry()) {
                uiReceiver.retry();
            }
            if (initialUiReceiver.getShouldRefresh()) {
                uiReceiver.refresh();
            }
        }
    }

    public final void addLoadStateListener(InterfaceC9540l listener) {
        AbstractC9979u.m20294g(listener, "listener");
        this.combinedLoadStatesCollection.addListener(listener);
    }

    public final void addOnPagesUpdatedListener(InterfaceC9529a listener) {
        AbstractC9979u.m20294g(listener, "listener");
        this.onPagesUpdatedListeners.add(listener);
    }

    public final Object collectFrom(PagingData<T> pagingData, InterfaceC11588c<C10786q> interfaceC11588c) {
        Object objRunInIsolation$default = SingleRunner.runInIsolation$default(this.collectFromRunner, 0, new C42662(this, pagingData, null), interfaceC11588c, 1, null);
        return objRunInIsolation$default == AbstractC11725a.m25952f() ? objRunInIsolation$default : C10786q.f26013a;
    }

    @MainThread
    public final T get(@IntRange(from = 0) int i10) {
        Object value;
        Object value2;
        InterfaceC11603l interfaceC11603l = this.inGetItem;
        do {
            value = interfaceC11603l.getValue();
            ((Boolean) value).getClass();
        } while (!interfaceC11603l.mo20870e(value, Boolean.TRUE));
        this.lastAccessedIndexUnfulfilled = true;
        this.lastAccessedIndex = i10;
        PagingLogger pagingLogger = PagingLogger.INSTANCE;
        if (pagingLogger.isLoggable(2)) {
            pagingLogger.log(2, "Accessing item index[" + i10 + ']', null);
        }
        HintReceiver hintReceiver = this.hintReceiver;
        if (hintReceiver != null) {
            hintReceiver.processHint(this.pageStore.createAccessHintForIndex(i10));
        }
        T t10 = this.pageStore.get(i10);
        InterfaceC11603l interfaceC11603l2 = this.inGetItem;
        do {
            value2 = interfaceC11603l2.getValue();
            ((Boolean) value2).getClass();
        } while (!interfaceC11603l2.mo20870e(value2, Boolean.FALSE));
        return t10;
    }

    public final InterfaceC11612u getLoadStateFlow() {
        return this.loadStateFlow;
    }

    public final InterfaceC11594c getOnPagesUpdatedFlow() {
        return AbstractC11596e.m25551a(this._onPagesUpdatedFlow);
    }

    public final int getSize() {
        return this.pageStore.getSize();
    }

    @MainThread
    public final T peek(@IntRange(from = 0) int i10) {
        return this.pageStore.get(i10);
    }

    public abstract Object presentPagingDataEvent(PagingDataEvent<T> pagingDataEvent, InterfaceC11588c<C10786q> interfaceC11588c);

    public final void refresh() {
        PagingLogger pagingLogger = PagingLogger.INSTANCE;
        if (pagingLogger.isLoggable(3)) {
            pagingLogger.log(3, "Refresh signal received", null);
        }
        this.uiReceiver.refresh();
    }

    public final void removeLoadStateListener(InterfaceC9540l listener) {
        AbstractC9979u.m20294g(listener, "listener");
        this.combinedLoadStatesCollection.removeListener(listener);
    }

    public final void removeOnPagesUpdatedListener(InterfaceC9529a listener) {
        AbstractC9979u.m20294g(listener, "listener");
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

    public PagingDataPresenter(InterfaceC9945d mainContext, PagingData<T> pagingData) {
        PageEvent.Insert<T> insertCachedEvent$paging_common;
        AbstractC9979u.m20294g(mainContext, "mainContext");
        this.mainContext = mainContext;
        this.uiReceiver = new InitialUiReceiver();
        AbstractC9972n abstractC9972n = null;
        this.pageStore = PageStore.Companion.initial$paging_common(pagingData != null ? pagingData.cachedEvent$paging_common() : null);
        MutableCombinedLoadStateCollection mutableCombinedLoadStateCollection = new MutableCombinedLoadStateCollection();
        if (pagingData != null && (insertCachedEvent$paging_common = pagingData.cachedEvent$paging_common()) != null) {
            mutableCombinedLoadStateCollection.set(insertCachedEvent$paging_common.getSourceLoadStates(), insertCachedEvent$paging_common.getMediatorLoadStates());
        }
        this.combinedLoadStatesCollection = mutableCombinedLoadStateCollection;
        this.onPagesUpdatedListeners = new CopyOnWriteArrayList<>();
        this.collectFromRunner = new SingleRunner(false, 1, abstractC9972n);
        this.inGetItem = AbstractC11613v.m25602a(Boolean.FALSE);
        this.loadStateFlow = mutableCombinedLoadStateCollection.getStateFlow();
        this._onPagesUpdatedFlow = AbstractC11608q.m25591a(0, 64, BufferOverflow.f23520d);
        addOnPagesUpdatedListener(new InterfaceC9529a() { // from class: androidx.paging.y0
            @Override // p181hd.InterfaceC9529a
            public final Object invoke() {
                return PagingDataPresenter._init_$lambda$0(this.f1971c);
            }
        });
    }

    public /* synthetic */ PagingDataPresenter(InterfaceC9945d interfaceC9945d, PagingData pagingData, int i10, AbstractC9972n abstractC9972n) {
        this((i10 & 1) != 0 ? C11157r0.m24800c() : interfaceC9945d, (i10 & 2) != 0 ? null : pagingData);
    }
}
