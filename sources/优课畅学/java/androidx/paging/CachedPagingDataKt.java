package androidx.paging;

import androidx.annotation.CheckResult;
import androidx.paging.ActiveFlowTracker;
import com.tencent.smtt.sdk.TbsListener;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9133u;
import kotlinx.coroutines.flow.InterfaceC9198a;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p169l8.AbstractC9268e;
import p169l8.InterfaceC9266c;
import p169l8.InterfaceC9267d;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;
import p300x7.InterfaceC10575q;

/* loaded from: classes3.dex */
public final class CachedPagingDataKt {

    @InterfaceC9539d(m17800c = "androidx.paging.CachedPagingDataKt$cachedIn$2", m17801f = "CachedPagingData.kt", m17802l = {104}, m17803m = "invokeSuspend")
    /* renamed from: androidx.paging.CachedPagingDataKt$cachedIn$2 */
    public static final class C42892 extends SuspendLambda implements InterfaceC10575q {
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        public C42892(InterfaceC9324c<? super C42892> interfaceC9324c) {
            super(3, interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10575q
        public final Object invoke(MulticastedPagingData<T> multicastedPagingData, MulticastedPagingData<T> multicastedPagingData2, InterfaceC9324c<? super MulticastedPagingData<T>> interfaceC9324c) {
            C42892 c42892 = new C42892(interfaceC9324c);
            c42892.L$0 = multicastedPagingData;
            c42892.L$1 = multicastedPagingData2;
            return c42892.invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                MulticastedPagingData multicastedPagingData = (MulticastedPagingData) this.L$0;
                AbstractC9079b.m15926b(obj);
                return multicastedPagingData;
            }
            AbstractC9079b.m15926b(obj);
            MulticastedPagingData multicastedPagingData2 = (MulticastedPagingData) this.L$0;
            MulticastedPagingData multicastedPagingData3 = (MulticastedPagingData) this.L$1;
            this.L$0 = multicastedPagingData3;
            this.label = 1;
            return multicastedPagingData2.close(this) == objM17291f ? objM17291f : multicastedPagingData3;
        }
    }

    @InterfaceC9539d(m17800c = "androidx.paging.CachedPagingDataKt$cachedIn$4", m17801f = "CachedPagingData.kt", m17802l = {109}, m17803m = "invokeSuspend")
    /* renamed from: androidx.paging.CachedPagingDataKt$cachedIn$4 */
    public static final class C42904 extends SuspendLambda implements InterfaceC10574p {
        final /* synthetic */ ActiveFlowTracker $tracker;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42904(ActiveFlowTracker activeFlowTracker, InterfaceC9324c<? super C42904> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.$tracker = activeFlowTracker;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            return new C42904(this.$tracker, interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                ActiveFlowTracker activeFlowTracker = this.$tracker;
                if (activeFlowTracker != null) {
                    ActiveFlowTracker.FlowType flowType = ActiveFlowTracker.FlowType.PAGED_DATA_FLOW;
                    this.label = 1;
                    if (activeFlowTracker.onStart(flowType, this) == objM17291f) {
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
            return ((C42904) create(interfaceC9267d, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }
    }

    @InterfaceC9539d(m17800c = "androidx.paging.CachedPagingDataKt$cachedIn$5", m17801f = "CachedPagingData.kt", m17802l = {TbsListener.ErrorCode.NETWORK_NOT_WIFI_ERROR}, m17803m = "invokeSuspend")
    /* renamed from: androidx.paging.CachedPagingDataKt$cachedIn$5 */
    public static final class C42915 extends SuspendLambda implements InterfaceC10575q {
        final /* synthetic */ ActiveFlowTracker $tracker;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42915(ActiveFlowTracker activeFlowTracker, InterfaceC9324c<? super C42915> interfaceC9324c) {
            super(3, interfaceC9324c);
            this.$tracker = activeFlowTracker;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                ActiveFlowTracker activeFlowTracker = this.$tracker;
                if (activeFlowTracker != null) {
                    ActiveFlowTracker.FlowType flowType = ActiveFlowTracker.FlowType.PAGED_DATA_FLOW;
                    this.label = 1;
                    if (activeFlowTracker.onComplete(flowType, this) == objM17291f) {
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
            return new C42915(this.$tracker, interfaceC9324c).invokeSuspend(C8736p.f16368a);
        }
    }

    @CheckResult
    public static final <T> InterfaceC9266c cachedIn(InterfaceC9266c interfaceC9266c, InterfaceC8822b0 scope) {
        AbstractC9133u.m16133g(interfaceC9266c, "<this>");
        AbstractC9133u.m16133g(scope, "scope");
        return cachedIn(interfaceC9266c, scope, null);
    }

    public static /* synthetic */ InterfaceC9266c cachedIn$default(InterfaceC9266c interfaceC9266c, InterfaceC8822b0 interfaceC8822b0, ActiveFlowTracker activeFlowTracker, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            activeFlowTracker = null;
        }
        return cachedIn(interfaceC9266c, interfaceC8822b0, activeFlowTracker);
    }

    public static final <T> InterfaceC9266c cachedIn(InterfaceC9266c interfaceC9266c, InterfaceC8822b0 scope, ActiveFlowTracker activeFlowTracker) {
        AbstractC9133u.m16133g(interfaceC9266c, "<this>");
        AbstractC9133u.m16133g(scope, "scope");
        final InterfaceC9266c interfaceC9266cSimpleRunningReduce = FlowExtKt.simpleRunningReduce(FlowExtKt.simpleTransformLatest(interfaceC9266c, new CachedPagingDataKt$cachedIn$$inlined$simpleMapLatest$1(null, scope, activeFlowTracker)), new C42892(null));
        return AbstractC9268e.m17004P(AbstractC9268e.m16999K(AbstractC9268e.m17001M(new InterfaceC9266c() { // from class: androidx.paging.CachedPagingDataKt$cachedIn$$inlined$map$1

            /* renamed from: androidx.paging.CachedPagingDataKt$cachedIn$$inlined$map$1$2 */
            public static final class C42882<T> implements InterfaceC9267d {
                final /* synthetic */ InterfaceC9267d $this_unsafeFlow;

                @InterfaceC9539d(m17800c = "androidx.paging.CachedPagingDataKt$cachedIn$$inlined$map$1$2", m17801f = "CachedPagingData.kt", m17802l = {TbsListener.ErrorCode.EXCEED_LZMA_RETRY_NUM}, m17803m = "emit")
                /* renamed from: androidx.paging.CachedPagingDataKt$cachedIn$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(InterfaceC9324c interfaceC9324c) {
                        super(interfaceC9324c);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C42882.this.emit(null, this);
                    }
                }

                public C42882(InterfaceC9267d interfaceC9267d) {
                    this.$this_unsafeFlow = interfaceC9267d;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // p169l8.InterfaceC9267d
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, p179m7.InterfaceC9324c r6) throws java.lang.Throwable {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof androidx.paging.CachedPagingDataKt$cachedIn$$inlined$map$1.C42882.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        androidx.paging.CachedPagingDataKt$cachedIn$$inlined$map$1$2$1 r0 = (androidx.paging.CachedPagingDataKt$cachedIn$$inlined$map$1.C42882.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        androidx.paging.CachedPagingDataKt$cachedIn$$inlined$map$1$2$1 r0 = new androidx.paging.CachedPagingDataKt$cachedIn$$inlined$map$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.AbstractC9079b.m15926b(r6)
                        goto L45
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        kotlin.AbstractC9079b.m15926b(r6)
                        l8.d r6 = r4.$this_unsafeFlow
                        androidx.paging.MulticastedPagingData r5 = (androidx.paging.MulticastedPagingData) r5
                        androidx.paging.PagingData r5 = r5.asPagingData()
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L45
                        return r1
                    L45:
                        h7.p r5 = p123h7.C8736p.f16368a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.paging.CachedPagingDataKt$cachedIn$$inlined$map$1.C42882.emit(java.lang.Object, m7.c):java.lang.Object");
                }
            }

            @Override // p169l8.InterfaceC9266c
            public Object collect(InterfaceC9267d interfaceC9267d, InterfaceC9324c interfaceC9324c) {
                Object objCollect = interfaceC9266cSimpleRunningReduce.collect(new C42882(interfaceC9267d), interfaceC9324c);
                return objCollect == AbstractC9434a.m17291f() ? objCollect : C8736p.f16368a;
            }
        }, new C42904(activeFlowTracker, null)), new C42915(activeFlowTracker, null)), scope, InterfaceC9198a.f17984a.m16694d(), 1);
    }
}
