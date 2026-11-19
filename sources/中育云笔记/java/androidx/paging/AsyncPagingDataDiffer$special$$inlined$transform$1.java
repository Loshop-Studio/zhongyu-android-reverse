package androidx.paging;

import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p379vd.InterfaceC11594c;
import p379vd.InterfaceC11595d;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.paging.AsyncPagingDataDiffer$special$$inlined$transform$1", m26211f = "AsyncPagingDataDiffer.kt", m26212l = {36}, m26213m = "invokeSuspend", m26214v = 1)
/* loaded from: classes3.dex */
public final class AsyncPagingDataDiffer$special$$inlined$transform$1 extends SuspendLambda implements InterfaceC9544p {
    final /* synthetic */ InterfaceC11594c $this_transform;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AsyncPagingDataDiffer this$0;

    /* renamed from: androidx.paging.AsyncPagingDataDiffer$special$$inlined$transform$1$1 */
    public static final class C42071<T> implements InterfaceC11595d {
        final /* synthetic */ InterfaceC11595d $$this$flow;
        final /* synthetic */ AsyncPagingDataDiffer this$0;

        @InterfaceC11829d(m26210c = "androidx.paging.AsyncPagingDataDiffer$special$$inlined$transform$1$1", m26211f = "AsyncPagingDataDiffer.kt", m26212l = {40, 41, 43}, m26213m = "emit", m26214v = 1)
        /* renamed from: androidx.paging.AsyncPagingDataDiffer$special$$inlined$transform$1$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends ContinuationImpl {
            Object L$0;
            Object L$1;
            int label;
            /* synthetic */ Object result;

            public AnonymousClass1(InterfaceC11588c interfaceC11588c) {
                super(interfaceC11588c);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return C42071.this.emit(null, this);
            }
        }

        public C42071(InterfaceC11595d interfaceC11595d, AsyncPagingDataDiffer asyncPagingDataDiffer) {
            this.this$0 = asyncPagingDataDiffer;
            this.$$this$flow = interfaceC11595d;
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x008e, code lost:
        
            if (p379vd.AbstractC11596e.m25575y(r9, r5, r0) == r1) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x009d, code lost:
        
            if (r9.emit(r8, r0) != r1) goto L31;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // p379vd.InterfaceC11595d
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(T r8, vc.InterfaceC11588c<? super p309qc.C10786q> r9) throws java.lang.Throwable {
            /*
                r7 = this;
                boolean r0 = r9 instanceof androidx.paging.AsyncPagingDataDiffer$special$$inlined$transform$1.C42071.AnonymousClass1
                if (r0 == 0) goto L13
                r0 = r9
                androidx.paging.AsyncPagingDataDiffer$special$$inlined$transform$1$1$1 r0 = (androidx.paging.AsyncPagingDataDiffer$special$$inlined$transform$1.C42071.AnonymousClass1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                androidx.paging.AsyncPagingDataDiffer$special$$inlined$transform$1$1$1 r0 = new androidx.paging.AsyncPagingDataDiffer$special$$inlined$transform$1$1$1
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.result
                java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
                int r2 = r0.label
                r3 = 3
                r4 = 2
                r5 = 1
                r6 = 0
                if (r2 == 0) goto L51
                if (r2 == r5) goto L45
                if (r2 == r4) goto L39
                if (r2 != r3) goto L31
                kotlin.AbstractC9924b.m20071b(r9)
                goto La0
            L31:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L39:
                java.lang.Object r8 = r0.L$1
                vd.d r8 = (p379vd.InterfaceC11595d) r8
                java.lang.Object r2 = r0.L$0
                androidx.paging.CombinedLoadStates r2 = (androidx.paging.CombinedLoadStates) r2
                kotlin.AbstractC9924b.m20071b(r9)
                goto L91
            L45:
                java.lang.Object r8 = r0.L$1
                vd.d r8 = (p379vd.InterfaceC11595d) r8
                java.lang.Object r2 = r0.L$0
                androidx.paging.CombinedLoadStates r2 = (androidx.paging.CombinedLoadStates) r2
                kotlin.AbstractC9924b.m20071b(r9)
                goto L79
            L51:
                kotlin.AbstractC9924b.m20071b(r9)
                vd.d r9 = r7.$$this$flow
                androidx.paging.CombinedLoadStates r8 = (androidx.paging.CombinedLoadStates) r8
                androidx.paging.AsyncPagingDataDiffer r2 = r7.this$0
                vd.l r2 = r2.getInGetItem$paging_runtime()
                java.lang.Object r2 = r2.getValue()
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                if (r2 == 0) goto L93
                r0.L$0 = r8
                r0.L$1 = r9
                r0.label = r5
                java.lang.Object r2 = sd.AbstractC11152p2.m24789a(r0)
                if (r2 != r1) goto L77
                goto L9f
            L77:
                r2 = r8
                r8 = r9
            L79:
                androidx.paging.AsyncPagingDataDiffer r9 = r7.this$0
                vd.l r9 = r9.getInGetItem$paging_runtime()
                androidx.paging.AsyncPagingDataDiffer$loadStateFlow$1$1 r5 = new androidx.paging.AsyncPagingDataDiffer$loadStateFlow$1$1
                r5.<init>(r6)
                r0.L$0 = r2
                r0.L$1 = r8
                r0.label = r4
                java.lang.Object r9 = p379vd.AbstractC11596e.m25575y(r9, r5, r0)
                if (r9 != r1) goto L91
                goto L9f
            L91:
                r9 = r8
                r8 = r2
            L93:
                r0.L$0 = r6
                r0.L$1 = r6
                r0.label = r3
                java.lang.Object r8 = r9.emit(r8, r0)
                if (r8 != r1) goto La0
            L9f:
                return r1
            La0:
                qc.q r8 = p309qc.C10786q.f26013a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.AsyncPagingDataDiffer$special$$inlined$transform$1.C42071.emit(java.lang.Object, vc.c):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncPagingDataDiffer$special$$inlined$transform$1(InterfaceC11594c interfaceC11594c, InterfaceC11588c interfaceC11588c, AsyncPagingDataDiffer asyncPagingDataDiffer) {
        super(2, interfaceC11588c);
        this.$this_transform = interfaceC11594c;
        this.this$0 = asyncPagingDataDiffer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
        AsyncPagingDataDiffer$special$$inlined$transform$1 asyncPagingDataDiffer$special$$inlined$transform$1 = new AsyncPagingDataDiffer$special$$inlined$transform$1(this.$this_transform, interfaceC11588c, this.this$0);
        asyncPagingDataDiffer$special$$inlined$transform$1.L$0 = obj;
        return asyncPagingDataDiffer$special$$inlined$transform$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            InterfaceC11595d interfaceC11595d = (InterfaceC11595d) this.L$0;
            InterfaceC11594c interfaceC11594c = this.$this_transform;
            C42071 c42071 = new C42071(interfaceC11595d, this.this$0);
            this.label = 1;
            if (interfaceC11594c.collect(c42071, this) == objM25952f) {
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
        return ((AsyncPagingDataDiffer$special$$inlined$transform$1) create(interfaceC11595d, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
