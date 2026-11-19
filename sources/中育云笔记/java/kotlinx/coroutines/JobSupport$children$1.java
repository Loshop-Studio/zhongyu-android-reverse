package kotlinx.coroutines;

import com.tendcloud.tenddata.InterfaceC7873be;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import p181hd.InterfaceC9544p;
import p296pd.AbstractC10661i;
import p309qc.C10786q;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "kotlinx.coroutines.JobSupport$children$1", m26211f = "JobSupport.kt", m26212l = {1003, InterfaceC7873be.f14404e}, m26213m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class JobSupport$children$1 extends RestrictedSuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public Object f23501c;

    /* renamed from: d */
    public Object f23502d;

    /* renamed from: e */
    public int f23503e;

    /* renamed from: f */
    public /* synthetic */ Object f23504f;

    /* renamed from: g */
    public final /* synthetic */ JobSupport f23505g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JobSupport$children$1(JobSupport jobSupport, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f23505g = jobSupport;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        JobSupport$children$1 jobSupport$children$1 = new JobSupport$children$1(this.f23505g, interfaceC11588c);
        jobSupport$children$1.f23504f = obj;
        return jobSupport$children$1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0045, code lost:
    
        if (r6.mo22551a(r1, r5) == r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007e, code lost:
    
        if (r4.mo22551a(r6, r5) == r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0080, code lost:
    
        return r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x006b -> B:27:0x0081). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x007e -> B:27:0x0081). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) throws java.lang.Throwable {
        /*
            r5 = this;
            java.lang.Object r0 = p393wc.AbstractC11725a.m25952f()
            int r1 = r5.f23503e
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L2a
            if (r1 == r3) goto L26
            if (r1 != r2) goto L1e
            java.lang.Object r1 = r5.f23502d
            kotlinx.coroutines.internal.LockFreeLinkedListNode r1 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r1
            java.lang.Object r3 = r5.f23501c
            xd.n r3 = (p410xd.AbstractC11860n) r3
            java.lang.Object r4 = r5.f23504f
            pd.i r4 = (p296pd.AbstractC10661i) r4
            kotlin.AbstractC9924b.m20071b(r6)
            goto L81
        L1e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L26:
            kotlin.AbstractC9924b.m20071b(r6)
            goto L86
        L2a:
            kotlin.AbstractC9924b.m20071b(r6)
            java.lang.Object r6 = r5.f23504f
            pd.i r6 = (p296pd.AbstractC10661i) r6
            kotlinx.coroutines.JobSupport r1 = r5.f23505g
            java.lang.Object r1 = r1.m20430X()
            boolean r4 = r1 instanceof sd.C11153q
            if (r4 == 0) goto L48
            sd.q r1 = (sd.C11153q) r1
            sd.r r1 = r1.f26812g
            r5.f23503e = r3
            java.lang.Object r6 = r6.mo22551a(r1, r5)
            if (r6 != r0) goto L86
            goto L80
        L48:
            boolean r3 = r1 instanceof sd.InterfaceC11127j1
            if (r3 == 0) goto L86
            sd.j1 r1 = (sd.InterfaceC11127j1) r1
            sd.u1 r1 = r1.mo20474b()
            if (r1 == 0) goto L86
            java.lang.Object r3 = r1.m20915j()
            java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode"
            kotlin.jvm.internal.AbstractC9979u.m20292e(r3, r4)
            kotlinx.coroutines.internal.LockFreeLinkedListNode r3 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r3
            r4 = r3
            r3 = r1
            r1 = r4
            r4 = r6
        L63:
            boolean r6 = kotlin.jvm.internal.AbstractC9979u.m20289b(r1, r3)
            if (r6 != 0) goto L86
            boolean r6 = r1 instanceof sd.C11153q
            if (r6 == 0) goto L81
            r6 = r1
            sd.q r6 = (sd.C11153q) r6
            sd.r r6 = r6.f26812g
            r5.f23504f = r4
            r5.f23501c = r3
            r5.f23502d = r1
            r5.f23503e = r2
            java.lang.Object r6 = r4.mo22551a(r6, r5)
            if (r6 != r0) goto L81
        L80:
            return r0
        L81:
            kotlinx.coroutines.internal.LockFreeLinkedListNode r1 = r1.m20916k()
            goto L63
        L86:
            qc.q r6 = p309qc.C10786q.f26013a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.JobSupport$children$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(AbstractC10661i abstractC10661i, InterfaceC11588c interfaceC11588c) {
        return ((JobSupport$children$1) create(abstractC10661i, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
