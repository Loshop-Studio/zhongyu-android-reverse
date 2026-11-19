package androidx.paging;

import androidx.paging.ActiveFlowTracker;
import androidx.paging.PageEvent;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p169l8.AbstractC9268e;
import p169l8.InterfaceC9267d;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10574p;
import p300x7.InterfaceC10575q;

/* loaded from: classes3.dex */
final class MulticastedPagingData<T> {
    private final CachedPageEventFlow<T> accumulated;
    private final PagingData<T> parent;
    private final InterfaceC8822b0 scope;
    private final ActiveFlowTracker tracker;

    @InterfaceC9539d(m17800c = "androidx.paging.MulticastedPagingData$asPagingData$1", m17801f = "CachedPagingData.kt", m17802l = {51}, m17803m = "invokeSuspend")
    /* renamed from: androidx.paging.MulticastedPagingData$asPagingData$1 */
    public static final class C43141 extends SuspendLambda implements InterfaceC10574p {
        int label;
        final /* synthetic */ MulticastedPagingData<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C43141(MulticastedPagingData<T> multicastedPagingData, InterfaceC9324c<? super C43141> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.this$0 = multicastedPagingData;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            return new C43141(this.this$0, interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                ActiveFlowTracker tracker = this.this$0.getTracker();
                if (tracker != null) {
                    ActiveFlowTracker.FlowType flowType = ActiveFlowTracker.FlowType.PAGE_EVENT_FLOW;
                    this.label = 1;
                    if (tracker.onStart(flowType, this) == objM17291f) {
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

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC9267d interfaceC9267d, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C43141) create(interfaceC9267d, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }
    }

    @InterfaceC9539d(m17800c = "androidx.paging.MulticastedPagingData$asPagingData$2", m17801f = "CachedPagingData.kt", m17802l = {53}, m17803m = "invokeSuspend")
    /* renamed from: androidx.paging.MulticastedPagingData$asPagingData$2 */
    public static final class C43152 extends SuspendLambda implements InterfaceC10575q {
        int label;
        final /* synthetic */ MulticastedPagingData<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C43152(MulticastedPagingData<T> multicastedPagingData, InterfaceC9324c<? super C43152> interfaceC9324c) {
            super(3, interfaceC9324c);
            this.this$0 = multicastedPagingData;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                ActiveFlowTracker tracker = this.this$0.getTracker();
                if (tracker != null) {
                    ActiveFlowTracker.FlowType flowType = ActiveFlowTracker.FlowType.PAGE_EVENT_FLOW;
                    this.label = 1;
                    if (tracker.onComplete(flowType, this) == objM17291f) {
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

        @Override // p300x7.InterfaceC10575q
        public final Object invoke(InterfaceC9267d interfaceC9267d, Throwable th, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return new C43152(this.this$0, interfaceC9324c).invokeSuspend(C8736p.f16368a);
        }
    }

    public MulticastedPagingData(InterfaceC8822b0 scope, PagingData<T> parent, ActiveFlowTracker activeFlowTracker) {
        AbstractC9133u.m16133g(scope, "scope");
        AbstractC9133u.m16133g(parent, "parent");
        this.scope = scope;
        this.parent = parent;
        this.tracker = activeFlowTracker;
        CachedPageEventFlow<T> cachedPageEventFlow = new CachedPageEventFlow<>(parent.getFlow$paging_common_release(), scope);
        if (activeFlowTracker != null) {
            activeFlowTracker.onNewCachedEventFlow(cachedPageEventFlow);
        }
        this.accumulated = cachedPageEventFlow;
    }

    public final PagingData<T> asPagingData() {
        return new PagingData<>(AbstractC9268e.m16999K(AbstractC9268e.m17001M(this.accumulated.getDownstreamFlow(), new C43141(this, null)), new C43152(this, null)), this.parent.getUiReceiver$paging_common_release(), this.parent.getHintReceiver$paging_common_release(), new InterfaceC10559a(this) { // from class: androidx.paging.MulticastedPagingData.asPagingData.3
            final /* synthetic */ MulticastedPagingData<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // p300x7.InterfaceC10559a
            public final PageEvent.Insert<T> invoke() {
                return ((MulticastedPagingData) this.this$0).accumulated.getCachedEvent$paging_common_release();
            }
        });
    }

    public final Object close(InterfaceC9324c<? super C8736p> interfaceC9324c) {
        this.accumulated.close();
        return C8736p.f16368a;
    }

    public final PagingData<T> getParent() {
        return this.parent;
    }

    public final InterfaceC8822b0 getScope() {
        return this.scope;
    }

    public final ActiveFlowTracker getTracker() {
        return this.tracker;
    }

    public /* synthetic */ MulticastedPagingData(InterfaceC8822b0 interfaceC8822b0, PagingData pagingData, ActiveFlowTracker activeFlowTracker, int i10, AbstractC9126n abstractC9126n) {
        this(interfaceC8822b0, pagingData, (i10 & 4) != 0 ? null : activeFlowTracker);
    }
}
