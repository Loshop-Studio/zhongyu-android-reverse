package androidx.paging;

import com.taobao.sophix.PatchStatus;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p325rc.C10955k0;
import p379vd.AbstractC11596e;
import p379vd.InterfaceC11594c;
import p379vd.InterfaceC11595d;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.paging.CachedPageEventFlow$job$1", m26211f = "CachedPageEventFlow.kt", m26212l = {PatchStatus.CODE_LOAD_MFITEM}, m26213m = "invokeSuspend", m26214v = 1)
/* loaded from: classes3.dex */
public final class CachedPageEventFlow$job$1 extends SuspendLambda implements InterfaceC9544p {
    final /* synthetic */ InterfaceC11594c $src;
    int label;
    final /* synthetic */ CachedPageEventFlow<T> this$0;

    /* renamed from: androidx.paging.CachedPageEventFlow$job$1$1 */
    public static final class C42121<T> implements InterfaceC11595d {
        final /* synthetic */ CachedPageEventFlow<T> this$0;

        public C42121(CachedPageEventFlow<T> cachedPageEventFlow) {
            this.this$0 = cachedPageEventFlow;
        }

        @Override // p379vd.InterfaceC11595d
        public /* bridge */ /* synthetic */ Object emit(Object obj, InterfaceC11588c interfaceC11588c) {
            return emit((C10955k0) obj, (InterfaceC11588c<? super C10786q>) interfaceC11588c);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x005f, code lost:
        
            if (r7.record(r6, r0) == r1) goto L21;
         */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(p325rc.C10955k0 r6, vc.InterfaceC11588c<? super p309qc.C10786q> r7) throws java.lang.Throwable {
            /*
                r5 = this;
                boolean r0 = r7 instanceof androidx.paging.CachedPageEventFlow$job$1$1$emit$1
                if (r0 == 0) goto L13
                r0 = r7
                androidx.paging.CachedPageEventFlow$job$1$1$emit$1 r0 = (androidx.paging.CachedPageEventFlow$job$1$1$emit$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                androidx.paging.CachedPageEventFlow$job$1$1$emit$1 r0 = new androidx.paging.CachedPageEventFlow$job$1$1$emit$1
                r0.<init>(r5, r7)
            L18:
                java.lang.Object r7 = r0.result
                java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
                int r2 = r0.label
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L3c
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                kotlin.AbstractC9924b.m20071b(r7)
                goto L62
            L2c:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L34:
                java.lang.Object r6 = r0.L$0
                rc.k0 r6 = (p325rc.C10955k0) r6
                kotlin.AbstractC9924b.m20071b(r7)
                goto L50
            L3c:
                kotlin.AbstractC9924b.m20071b(r7)
                androidx.paging.CachedPageEventFlow<T> r7 = r5.this$0
                vd.k r7 = androidx.paging.CachedPageEventFlow.access$getMutableSharedSrc$p(r7)
                r0.L$0 = r6
                r0.label = r4
                java.lang.Object r7 = r7.emit(r6, r0)
                if (r7 != r1) goto L50
                goto L61
            L50:
                androidx.paging.CachedPageEventFlow<T> r7 = r5.this$0
                androidx.paging.FlattenedPageController r7 = androidx.paging.CachedPageEventFlow.access$getPageController$p(r7)
                r2 = 0
                r0.L$0 = r2
                r0.label = r3
                java.lang.Object r6 = r7.record(r6, r0)
                if (r6 != r1) goto L62
            L61:
                return r1
            L62:
                qc.q r6 = p309qc.C10786q.f26013a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.CachedPageEventFlow$job$1.C42121.emit(rc.k0, vc.c):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CachedPageEventFlow$job$1(InterfaceC11594c interfaceC11594c, CachedPageEventFlow<T> cachedPageEventFlow, InterfaceC11588c<? super CachedPageEventFlow$job$1> interfaceC11588c) {
        super(2, interfaceC11588c);
        this.$src = interfaceC11594c;
        this.this$0 = cachedPageEventFlow;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
        return new CachedPageEventFlow$job$1(this.$src, this.this$0, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            InterfaceC11594c interfaceC11594cM25550U = AbstractC11596e.m25550U(this.$src);
            C42121 c42121 = new C42121(this.this$0);
            this.label = 1;
            if (interfaceC11594cM25550U.collect(c42121, this) == objM25952f) {
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
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        return ((CachedPageEventFlow$job$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
