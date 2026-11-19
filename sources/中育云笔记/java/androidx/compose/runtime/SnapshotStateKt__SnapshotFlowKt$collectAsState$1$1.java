package androidx.compose.runtime;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.AbstractC9924b;
import kotlin.coroutines.InterfaceC9945d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p379vd.InterfaceC11594c;
import p379vd.InterfaceC11595d;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1$1", m26211f = "SnapshotFlow.kt", m26212l = {ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL, 68}, m26213m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class SnapshotStateKt__SnapshotFlowKt$collectAsState$1$1 extends SuspendLambda implements InterfaceC9544p {
    final /* synthetic */ InterfaceC9945d $context;
    final /* synthetic */ InterfaceC11594c $this_collectAsState;
    private /* synthetic */ Object L$0;
    int label;

    @InterfaceC11829d(m26210c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1$1$2", m26211f = "SnapshotFlow.kt", m26212l = {68}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1$1$2 */
    public static final class C25802 extends SuspendLambda implements InterfaceC9544p {
        final /* synthetic */ ProduceStateScope<R> $$this$produceState;
        final /* synthetic */ InterfaceC11594c $this_collectAsState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25802(InterfaceC11594c interfaceC11594c, ProduceStateScope<R> produceStateScope, InterfaceC11588c<? super C25802> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$this_collectAsState = interfaceC11594c;
            this.$$this$produceState = produceStateScope;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            return new C25802(this.$this_collectAsState, this.$$this$produceState, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                InterfaceC11594c interfaceC11594c = this.$this_collectAsState;
                final ProduceStateScope<R> produceStateScope = this.$$this$produceState;
                InterfaceC11595d interfaceC11595d = new InterfaceC11595d() { // from class: androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt.collectAsState.1.1.2.1
                    @Override // p379vd.InterfaceC11595d
                    public final Object emit(T t10, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                        produceStateScope.setValue(t10);
                        return C10786q.f26013a;
                    }
                };
                this.label = 1;
                if (interfaceC11594c.collect(interfaceC11595d, this) == objM25952f) {
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
            return ((C25802) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapshotStateKt__SnapshotFlowKt$collectAsState$1$1(InterfaceC9945d interfaceC9945d, InterfaceC11594c interfaceC11594c, InterfaceC11588c<? super SnapshotStateKt__SnapshotFlowKt$collectAsState$1$1> interfaceC11588c) {
        super(2, interfaceC11588c);
        this.$context = interfaceC9945d;
        this.$this_collectAsState = interfaceC11594c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
        SnapshotStateKt__SnapshotFlowKt$collectAsState$1$1 snapshotStateKt__SnapshotFlowKt$collectAsState$1$1 = new SnapshotStateKt__SnapshotFlowKt$collectAsState$1$1(this.$context, this.$this_collectAsState, interfaceC11588c);
        snapshotStateKt__SnapshotFlowKt$collectAsState$1$1.L$0 = obj;
        return snapshotStateKt__SnapshotFlowKt$collectAsState$1$1;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(ProduceStateScope<R> produceStateScope, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        return ((SnapshotStateKt__SnapshotFlowKt$collectAsState$1$1) create(produceStateScope, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
    
        if (r1.collect(r2, r6) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
    
        if (sd.AbstractC11109f.m24709g(r1, r3, r6) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
    
        return r0;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            java.lang.Object r0 = p393wc.AbstractC11725a.m25952f()
            int r1 = r6.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1b
            if (r1 == r3) goto L17
            if (r1 != r2) goto Lf
            goto L17
        Lf:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L17:
            kotlin.AbstractC9924b.m20071b(r7)
            goto L4f
        L1b:
            kotlin.AbstractC9924b.m20071b(r7)
            java.lang.Object r7 = r6.L$0
            androidx.compose.runtime.ProduceStateScope r7 = (androidx.compose.runtime.ProduceStateScope) r7
            kotlin.coroutines.d r1 = r6.$context
            kotlin.coroutines.EmptyCoroutineContext r4 = kotlin.coroutines.EmptyCoroutineContext.f23351c
            boolean r1 = kotlin.jvm.internal.AbstractC9979u.m20289b(r1, r4)
            if (r1 == 0) goto L3c
            vd.c r1 = r6.$this_collectAsState
            androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1$1$1 r2 = new androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1$1$1
            r2.<init>()
            r6.label = r3
            java.lang.Object r7 = r1.collect(r2, r6)
            if (r7 != r0) goto L4f
            goto L4e
        L3c:
            kotlin.coroutines.d r1 = r6.$context
            androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1$1$2 r3 = new androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1$1$2
            vd.c r4 = r6.$this_collectAsState
            r5 = 0
            r3.<init>(r4, r7, r5)
            r6.label = r2
            java.lang.Object r7 = sd.AbstractC11109f.m24709g(r1, r3, r6)
            if (r7 != r0) goto L4f
        L4e:
            return r0
        L4f:
            qc.q r7 = p309qc.C10786q.f26013a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
