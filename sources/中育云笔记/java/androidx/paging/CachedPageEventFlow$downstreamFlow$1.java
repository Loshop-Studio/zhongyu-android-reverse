package androidx.paging;

import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$IntRef;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p325rc.C10955k0;
import p379vd.AbstractC11596e;
import p379vd.InterfaceC11594c;
import p379vd.InterfaceC11595d;
import p393wc.AbstractC11725a;
import p409xc.AbstractC11826a;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.paging.CachedPageEventFlow$downstreamFlow$1", m26211f = "CachedPageEventFlow.kt", m26212l = {101}, m26213m = "invokeSuspend", m26214v = 1)
/* loaded from: classes3.dex */
public final class CachedPageEventFlow$downstreamFlow$1 extends SuspendLambda implements InterfaceC9544p {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CachedPageEventFlow<T> this$0;

    @InterfaceC11829d(m26210c = "androidx.paging.CachedPageEventFlow$downstreamFlow$1$1", m26211f = "CachedPageEventFlow.kt", m26212l = {}, m26213m = "invokeSuspend", m26214v = 1)
    /* renamed from: androidx.paging.CachedPageEventFlow$downstreamFlow$1$1 */
    public static final class C42101 extends SuspendLambda implements InterfaceC9544p {
        /* synthetic */ Object L$0;
        int label;

        public C42101(InterfaceC11588c<? super C42101> interfaceC11588c) {
            super(2, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            C42101 c42101 = new C42101(interfaceC11588c);
            c42101.L$0 = obj;
            return c42101;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC11725a.m25952f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
            return AbstractC11826a.m26206a(((C10955k0) this.L$0) != null);
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(C10955k0 c10955k0, InterfaceC11588c<? super Boolean> interfaceC11588c) {
            return ((C42101) create(c10955k0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    /* renamed from: androidx.paging.CachedPageEventFlow$downstreamFlow$1$2 */
    public static final class C42112<T> implements InterfaceC11595d {
        final /* synthetic */ InterfaceC11595d $$this$flow;
        final /* synthetic */ Ref$IntRef $maxEventIndex;

        public C42112(Ref$IntRef ref$IntRef, InterfaceC11595d interfaceC11595d) {
            this.$maxEventIndex = ref$IntRef;
            this.$$this$flow = interfaceC11595d;
        }

        @Override // p379vd.InterfaceC11595d
        public /* bridge */ /* synthetic */ Object emit(Object obj, InterfaceC11588c interfaceC11588c) {
            return emit((C10955k0) obj, (InterfaceC11588c<? super C10786q>) interfaceC11588c);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(p325rc.C10955k0 r5, vc.InterfaceC11588c<? super p309qc.C10786q> r6) throws java.lang.Throwable {
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
                java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L35
                if (r2 != r3) goto L2d
                java.lang.Object r5 = r0.L$0
                rc.k0 r5 = (p325rc.C10955k0) r5
                kotlin.AbstractC9924b.m20071b(r6)
                goto L56
            L2d:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L35:
                kotlin.AbstractC9924b.m20071b(r6)
                kotlin.jvm.internal.AbstractC9979u.m20291d(r5)
                int r6 = r5.m23962a()
                kotlin.jvm.internal.Ref$IntRef r2 = r4.$maxEventIndex
                int r2 = r2.f23400c
                if (r6 <= r2) goto L5e
                vd.d r6 = r4.$$this$flow
                java.lang.Object r2 = r5.m23963b()
                r0.L$0 = r5
                r0.label = r3
                java.lang.Object r6 = r6.emit(r2, r0)
                if (r6 != r1) goto L56
                return r1
            L56:
                kotlin.jvm.internal.Ref$IntRef r6 = r4.$maxEventIndex
                int r5 = r5.m23962a()
                r6.f23400c = r5
            L5e:
                qc.q r5 = p309qc.C10786q.f26013a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.CachedPageEventFlow$downstreamFlow$1.C42112.emit(rc.k0, vc.c):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CachedPageEventFlow$downstreamFlow$1(CachedPageEventFlow<T> cachedPageEventFlow, InterfaceC11588c<? super CachedPageEventFlow$downstreamFlow$1> interfaceC11588c) {
        super(2, interfaceC11588c);
        this.this$0 = cachedPageEventFlow;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
        CachedPageEventFlow$downstreamFlow$1 cachedPageEventFlow$downstreamFlow$1 = new CachedPageEventFlow$downstreamFlow$1(this.this$0, interfaceC11588c);
        cachedPageEventFlow$downstreamFlow$1.L$0 = obj;
        return cachedPageEventFlow$downstreamFlow$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            InterfaceC11595d interfaceC11595d = (InterfaceC11595d) this.L$0;
            Ref$IntRef ref$IntRef = new Ref$IntRef();
            ref$IntRef.f23400c = Integer.MIN_VALUE;
            InterfaceC11594c interfaceC11594cM25548S = AbstractC11596e.m25548S(((CachedPageEventFlow) this.this$0).sharedForDownstream, new C42101(null));
            C42112 c42112 = new C42112(ref$IntRef, interfaceC11595d);
            this.label = 1;
            if (interfaceC11594cM25548S.collect(c42112, this) == objM25952f) {
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

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11595d interfaceC11595d, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        return ((CachedPageEventFlow$downstreamFlow$1) create(interfaceC11595d, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
