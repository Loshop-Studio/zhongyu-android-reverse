package kotlinx.coroutines;

import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import p101f8.AbstractC8471i;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "kotlinx.coroutines.JobSupport$children$1", m17801f = "JobSupport.kt", m17802l = {963, 965}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class JobSupport$children$1 extends RestrictedSuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public Object f17575a;

    /* renamed from: b */
    public Object f17576b;

    /* renamed from: c */
    public int f17577c;

    /* renamed from: d */
    public /* synthetic */ Object f17578d;

    /* renamed from: e */
    public final /* synthetic */ JobSupport f17579e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JobSupport$children$1(JobSupport jobSupport, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f17579e = jobSupport;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        JobSupport$children$1 jobSupport$children$1 = new JobSupport$children$1(this.f17579e, interfaceC9324c);
        jobSupport$children$1.f17578d = obj;
        return jobSupport$children$1;
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(AbstractC8471i abstractC8471i, InterfaceC9324c interfaceC9324c) {
        return ((JobSupport$children$1) create(abstractC8471i, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0045, code lost:
    
        if (r6.mo13820a(r1, r5) == r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007e, code lost:
    
        if (r4.mo13820a(r6, r5) == r0) goto L26;
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
            java.lang.Object r0 = p190n7.AbstractC9434a.m17291f()
            int r1 = r5.f17577c
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L2a
            if (r1 == r3) goto L26
            if (r1 != r2) goto L1e
            java.lang.Object r1 = r5.f17576b
            kotlinx.coroutines.internal.LockFreeLinkedListNode r1 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r1
            java.lang.Object r3 = r5.f17575a
            n8.o r3 = (p191n8.AbstractC9462o) r3
            java.lang.Object r4 = r5.f17578d
            f8.i r4 = (p101f8.AbstractC8471i) r4
            kotlin.AbstractC9079b.m15926b(r6)
            goto L81
        L1e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L26:
            kotlin.AbstractC9079b.m15926b(r6)
            goto L86
        L2a:
            kotlin.AbstractC9079b.m15926b(r6)
            java.lang.Object r6 = r5.f17578d
            f8.i r6 = (p101f8.AbstractC8471i) r6
            kotlinx.coroutines.JobSupport r1 = r5.f17579e
            java.lang.Object r1 = r1.m16276X()
            boolean r4 = r1 instanceof p135i8.C8863p
            if (r4 == 0) goto L48
            i8.p r1 = (p135i8.C8863p) r1
            i8.q r1 = r1.f16532e
            r5.f17577c = r3
            java.lang.Object r6 = r6.mo13820a(r1, r5)
            if (r6 != r0) goto L86
            goto L80
        L48:
            boolean r3 = r1 instanceof p135i8.InterfaceC8882v0
            if (r3 == 0) goto L86
            i8.v0 r1 = (p135i8.InterfaceC8882v0) r1
            i8.i1 r1 = r1.getList()
            if (r1 == 0) goto L86
            java.lang.Object r3 = r1.m16733i()
            java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
            kotlin.jvm.internal.AbstractC9133u.m16131e(r3, r4)
            kotlinx.coroutines.internal.LockFreeLinkedListNode r3 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r3
            r4 = r3
            r3 = r1
            r1 = r4
            r4 = r6
        L63:
            boolean r6 = kotlin.jvm.internal.AbstractC9133u.m16128b(r1, r3)
            if (r6 != 0) goto L86
            boolean r6 = r1 instanceof p135i8.C8863p
            if (r6 == 0) goto L81
            r6 = r1
            i8.p r6 = (p135i8.C8863p) r6
            i8.q r6 = r6.f16532e
            r5.f17578d = r4
            r5.f17575a = r3
            r5.f17576b = r1
            r5.f17577c = r2
            java.lang.Object r6 = r4.mo13820a(r6, r5)
            if (r6 != r0) goto L81
        L80:
            return r0
        L81:
            kotlinx.coroutines.internal.LockFreeLinkedListNode r1 = r1.m16734j()
            goto L63
        L86:
            h7.p r6 = p123h7.C8736p.f16368a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.JobSupport$children$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
