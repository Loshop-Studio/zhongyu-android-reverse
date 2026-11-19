package androidx.paging;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.paging.ActiveFlowTracker;
import androidx.paging.PageEvent;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9544p;
import p181hd.InterfaceC9545q;
import p309qc.C10786q;
import p379vd.AbstractC11596e;
import p379vd.InterfaceC11595d;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

/* loaded from: classes3.dex */
final class MulticastedPagingData<T> {
    private final CachedPageEventFlow<T> accumulated;
    private final PagingData<T> parent;
    private final InterfaceC11122i0 scope;
    private final ActiveFlowTracker tracker;

    @InterfaceC11829d(m26210c = "androidx.paging.MulticastedPagingData$asPagingData$1", m26211f = "CachedPagingData.kt", m26212l = {ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF}, m26213m = "invokeSuspend", m26214v = 1)
    /* renamed from: androidx.paging.MulticastedPagingData$asPagingData$1 */
    public static final class C42361 extends SuspendLambda implements InterfaceC9544p {
        int label;
        final /* synthetic */ MulticastedPagingData<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42361(MulticastedPagingData<T> multicastedPagingData, InterfaceC11588c<? super C42361> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.this$0 = multicastedPagingData;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            return new C42361(this.this$0, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                ActiveFlowTracker tracker = this.this$0.getTracker();
                if (tracker != null) {
                    ActiveFlowTracker.FlowType flowType = ActiveFlowTracker.FlowType.PAGE_EVENT_FLOW;
                    this.label = 1;
                    if (tracker.onStart(flowType, this) == objM25952f) {
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
        public final Object invoke(InterfaceC11595d interfaceC11595d, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C42361) create(interfaceC11595d, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.paging.MulticastedPagingData$asPagingData$2", m26211f = "CachedPagingData.kt", m26212l = {54}, m26213m = "invokeSuspend", m26214v = 1)
    /* renamed from: androidx.paging.MulticastedPagingData$asPagingData$2 */
    public static final class C42372 extends SuspendLambda implements InterfaceC9545q {
        int label;
        final /* synthetic */ MulticastedPagingData<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42372(MulticastedPagingData<T> multicastedPagingData, InterfaceC11588c<? super C42372> interfaceC11588c) {
            super(3, interfaceC11588c);
            this.this$0 = multicastedPagingData;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                ActiveFlowTracker tracker = this.this$0.getTracker();
                if (tracker != null) {
                    ActiveFlowTracker.FlowType flowType = ActiveFlowTracker.FlowType.PAGE_EVENT_FLOW;
                    this.label = 1;
                    if (tracker.onComplete(flowType, this) == objM25952f) {
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

        @Override // p181hd.InterfaceC9545q
        public final Object invoke(InterfaceC11595d interfaceC11595d, Throwable th, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return new C42372(this.this$0, interfaceC11588c).invokeSuspend(C10786q.f26013a);
        }
    }

    public MulticastedPagingData(InterfaceC11122i0 scope, PagingData<T> parent, ActiveFlowTracker activeFlowTracker) {
        AbstractC9979u.m20294g(scope, "scope");
        AbstractC9979u.m20294g(parent, "parent");
        this.scope = scope;
        this.parent = parent;
        this.tracker = activeFlowTracker;
        CachedPageEventFlow<T> cachedPageEventFlow = new CachedPageEventFlow<>(parent.getFlow$paging_common(), scope);
        if (activeFlowTracker != null) {
            activeFlowTracker.onNewCachedEventFlow(cachedPageEventFlow);
        }
        this.accumulated = cachedPageEventFlow;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PageEvent.Insert asPagingData$lambda$0(MulticastedPagingData multicastedPagingData) {
        return multicastedPagingData.accumulated.getCachedEvent$paging_common();
    }

    public final PagingData<T> asPagingData() {
        return new PagingData<>(AbstractC11596e.m25539J(AbstractC11596e.m25541L(this.accumulated.getDownstreamFlow(), new C42361(this, null)), new C42372(this, null)), this.parent.getUiReceiver$paging_common(), this.parent.getHintReceiver$paging_common(), new InterfaceC9529a() { // from class: androidx.paging.b0
            @Override // p181hd.InterfaceC9529a
            public final Object invoke() {
                return MulticastedPagingData.asPagingData$lambda$0(this.f1893c);
            }
        });
    }

    public final Object close(InterfaceC11588c<? super C10786q> interfaceC11588c) {
        this.accumulated.close();
        return C10786q.f26013a;
    }

    public final PagingData<T> getParent() {
        return this.parent;
    }

    public final InterfaceC11122i0 getScope() {
        return this.scope;
    }

    public final ActiveFlowTracker getTracker() {
        return this.tracker;
    }

    public /* synthetic */ MulticastedPagingData(InterfaceC11122i0 interfaceC11122i0, PagingData pagingData, ActiveFlowTracker activeFlowTracker, int i10, AbstractC9972n abstractC9972n) {
        this(interfaceC11122i0, pagingData, (i10 & 4) != 0 ? null : activeFlowTracker);
    }
}
