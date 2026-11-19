package androidx.paging;

import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$IntRef;
import p123h7.C8736p;
import p134i7.C8786j0;
import p169l8.AbstractC9268e;
import p169l8.InterfaceC9266c;
import p169l8.InterfaceC9267d;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.AbstractC9536a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "androidx.paging.CachedPageEventFlow$downstreamFlow$1", m17801f = "CachedPageEventFlow.kt", m17802l = {102}, m17803m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class CachedPageEventFlow$downstreamFlow$1 extends SuspendLambda implements InterfaceC10574p {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CachedPageEventFlow<T> this$0;

    @InterfaceC9539d(m17800c = "androidx.paging.CachedPageEventFlow$downstreamFlow$1$1", m17801f = "CachedPageEventFlow.kt", m17802l = {}, m17803m = "invokeSuspend")
    /* renamed from: androidx.paging.CachedPageEventFlow$downstreamFlow$1$1 */
    public static final class C42851 extends SuspendLambda implements InterfaceC10574p {
        /* synthetic */ Object L$0;
        int label;

        public C42851(InterfaceC9324c<? super C42851> interfaceC9324c) {
            super(2, interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            C42851 c42851 = new C42851(interfaceC9324c);
            c42851.L$0 = obj;
            return c42851;
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(C8786j0 c8786j0, InterfaceC9324c<? super Boolean> interfaceC9324c) {
            return ((C42851) create(c8786j0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC9434a.m17291f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
            return AbstractC9536a.m17796a(((C8786j0) this.L$0) != null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CachedPageEventFlow$downstreamFlow$1(CachedPageEventFlow<T> cachedPageEventFlow, InterfaceC9324c<? super CachedPageEventFlow$downstreamFlow$1> interfaceC9324c) {
        super(2, interfaceC9324c);
        this.this$0 = cachedPageEventFlow;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
        CachedPageEventFlow$downstreamFlow$1 cachedPageEventFlow$downstreamFlow$1 = new CachedPageEventFlow$downstreamFlow$1(this.this$0, interfaceC9324c);
        cachedPageEventFlow$downstreamFlow$1.L$0 = obj;
        return cachedPageEventFlow$downstreamFlow$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            InterfaceC9267d interfaceC9267d = (InterfaceC9267d) this.L$0;
            Ref$IntRef ref$IntRef = new Ref$IntRef();
            ref$IntRef.f17471a = Integer.MIN_VALUE;
            InterfaceC9266c interfaceC9266cM17008T = AbstractC9268e.m17008T(((CachedPageEventFlow) this.this$0).sharedForDownstream, new C42851(null));
            C42862 c42862 = new C42862(ref$IntRef, interfaceC9267d);
            this.label = 1;
            if (interfaceC9266cM17008T.collect(c42862, this) == objM17291f) {
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

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC9267d interfaceC9267d, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        return ((CachedPageEventFlow$downstreamFlow$1) create(interfaceC9267d, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    /* renamed from: androidx.paging.CachedPageEventFlow$downstreamFlow$1$2 */
    public static final class C42862<T> implements InterfaceC9267d {
        final /* synthetic */ InterfaceC9267d $$this$flow;
        final /* synthetic */ Ref$IntRef $maxEventIndex;

        public C42862(Ref$IntRef ref$IntRef, InterfaceC9267d interfaceC9267d) {
            this.$maxEventIndex = ref$IntRef;
            this.$$this$flow = interfaceC9267d;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(p134i7.C8786j0 r5, p179m7.InterfaceC9324c<? super p123h7.C8736p> r6) throws java.lang.Throwable {
            /*
                r4 = this;
                boolean r0 = r6 instanceof androidx.paging.CachedPageEventFlow$downstreamFlow$1$2$emit$1
                if (r0 == 0) goto L13
                r0 = r6
                androidx.paging.CachedPageEventFlow$downstreamFlow$1$2$emit$1 r0 = (androidx.paging.CachedPageEventFlow$downstreamFlow$1$2$emit$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                androidx.paging.CachedPageEventFlow$downstreamFlow$1$2$emit$1 r0 = new androidx.paging.CachedPageEventFlow$downstreamFlow$1$2$emit$1
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.result
                java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L39
                if (r2 != r3) goto L31
                java.lang.Object r5 = r0.L$1
                i7.j0 r5 = (p134i7.C8786j0) r5
                java.lang.Object r0 = r0.L$0
                androidx.paging.CachedPageEventFlow$downstreamFlow$1$2 r0 = (androidx.paging.CachedPageEventFlow$downstreamFlow$1.C42862) r0
                kotlin.AbstractC9079b.m15926b(r6)
                goto L5d
            L31:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L39:
                kotlin.AbstractC9079b.m15926b(r6)
                kotlin.jvm.internal.AbstractC9133u.m16130d(r5)
                int r6 = r5.m14584a()
                kotlin.jvm.internal.Ref$IntRef r2 = r4.$maxEventIndex
                int r2 = r2.f17471a
                if (r6 <= r2) goto L65
                l8.d r6 = r4.$$this$flow
                java.lang.Object r2 = r5.m14585b()
                r0.L$0 = r4
                r0.L$1 = r5
                r0.label = r3
                java.lang.Object r6 = r6.emit(r2, r0)
                if (r6 != r1) goto L5c
                return r1
            L5c:
                r0 = r4
            L5d:
                kotlin.jvm.internal.Ref$IntRef r6 = r0.$maxEventIndex
                int r5 = r5.m14584a()
                r6.f17471a = r5
            L65:
                h7.p r5 = p123h7.C8736p.f16368a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.CachedPageEventFlow$downstreamFlow$1.C42862.emit(i7.j0, m7.c):java.lang.Object");
        }

        @Override // p169l8.InterfaceC9267d
        public /* bridge */ /* synthetic */ Object emit(Object obj, InterfaceC9324c interfaceC9324c) {
            return emit((C8786j0) obj, (InterfaceC9324c<? super C8736p>) interfaceC9324c);
        }
    }
}
