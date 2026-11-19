package kotlinx.coroutines;

import androidx.core.view.PointerIconCompat;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6473e;
import p214z6.AbstractC6832j;

@Metadata(m5109d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m5110d2 = {"Lz6/j;", "Lkotlinx/coroutines/w0;", "Ld6/s;", "<anonymous>", "(Lz6/j;)V"}, m5111k = 3, m5112mv = {2, 1, 0})
@DebugMetadata(m5302c = "kotlinx.coroutines.JobSupport$children$1", m5303f = "JobSupport.kt", m5304i = {1, 1, 1}, m5305l = {PointerIconCompat.TYPE_HELP, 1005}, m5306m = "invokeSuspend", m5307n = {"$this$sequence", "this_$iv", "cur$iv"}, m5308s = {"L$0", "L$1", "L$2"})
@SourceDebugExtension({"SMAP\nJobSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JobSupport.kt\nkotlinx/coroutines/JobSupport$children$1\n+ 2 LockFreeLinkedList.kt\nkotlinx/coroutines/internal/LockFreeLinkedListHead\n*L\n1#1,1583:1\n273#2,6:1584\n*S KotlinDebug\n*F\n+ 1 JobSupport.kt\nkotlinx/coroutines/JobSupport$children$1\n*L\n1005#1:1584,6\n*E\n"})
/* loaded from: classes4.dex */
final class JobSupport$children$1 extends RestrictedSuspendLambda implements InterfaceC6473e {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ C5871c1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JobSupport$children$1(C5871c1 c5871c1, InterfaceC5631c<? super JobSupport$children$1> interfaceC5631c) {
        super(2, interfaceC5631c);
        this.this$0 = c5871c1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
        JobSupport$children$1 jobSupport$children$1 = new JobSupport$children$1(this.this$0, interfaceC5631c);
        jobSupport$children$1.L$0 = obj;
        return jobSupport$children$1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0049, code lost:
    
        if (r6.mo6491a(r5, r1) == r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0084, code lost:
    
        if (r4.mo6491a(r5, r6) == r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0086, code lost:
    
        return r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0071 -> B:27:0x0087). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0084 -> B:27:0x0087). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r5.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L29
            if (r1 == r3) goto L25
            if (r1 != r2) goto L1d
            java.lang.Object r1 = r5.L$2
            kotlinx.coroutines.internal.a r1 = (kotlinx.coroutines.internal.C5970a) r1
            java.lang.Object r3 = r5.L$1
            kotlinx.coroutines.f1 r3 = (kotlinx.coroutines.C5897f1) r3
            java.lang.Object r4 = r5.L$0
            z6.j r4 = (p214z6.AbstractC6832j) r4
            kotlin.AbstractC5774b.m5119b(r6)
            goto L87
        L1d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L25:
            kotlin.AbstractC5774b.m5119b(r6)
            goto L8c
        L29:
            kotlin.AbstractC5774b.m5119b(r6)
            java.lang.Object r6 = r5.L$0
            z6.j r6 = (p214z6.AbstractC6832j) r6
            kotlinx.coroutines.c1 r1 = r5.this$0
            r1.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = kotlinx.coroutines.C5871c1.f9288a
            java.lang.Object r1 = r4.get(r1)
            boolean r4 = r1 instanceof kotlinx.coroutines.C5974k
            if (r4 == 0) goto L4c
            kotlinx.coroutines.k r1 = (kotlinx.coroutines.C5974k) r1
            kotlinx.coroutines.c1 r1 = r1.f9466e
            r5.label = r3
            kotlin.coroutines.intrinsics.CoroutineSingletons r6 = r6.mo6491a(r5, r1)
            if (r6 != r0) goto L8c
            goto L86
        L4c:
            boolean r3 = r1 instanceof kotlinx.coroutines.InterfaceC5999s0
            if (r3 == 0) goto L8c
            kotlinx.coroutines.s0 r1 = (kotlinx.coroutines.InterfaceC5999s0) r1
            kotlinx.coroutines.f1 r1 = r1.mo5429b()
            if (r1 == 0) goto L8c
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = kotlinx.coroutines.internal.C5970a.f9461a
            java.lang.Object r3 = r3.get(r1)
            java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode"
            kotlin.jvm.internal.AbstractC5830k.m5328e(r3, r4)
            kotlinx.coroutines.internal.a r3 = (kotlinx.coroutines.internal.C5970a) r3
            r4 = r3
            r3 = r1
            r1 = r4
            r4 = r6
        L69:
            boolean r6 = r1.equals(r3)
            if (r6 != 0) goto L8c
            boolean r6 = r1 instanceof kotlinx.coroutines.C5974k
            if (r6 == 0) goto L87
            r6 = r1
            kotlinx.coroutines.k r6 = (kotlinx.coroutines.C5974k) r6
            kotlinx.coroutines.c1 r6 = r6.f9466e
            r5.L$0 = r4
            r5.L$1 = r3
            r5.L$2 = r1
            r5.label = r2
            kotlin.coroutines.intrinsics.CoroutineSingletons r6 = r4.mo6491a(r5, r6)
            if (r6 != r0) goto L87
        L86:
            return r0
        L87:
            kotlinx.coroutines.internal.a r1 = r1.m5593f()
            goto L69
        L8c:
            d6.s r6 = p045d6.C5443s.f8405a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.JobSupport$children$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(AbstractC6832j abstractC6832j, InterfaceC5631c<? super C5443s> interfaceC5631c) {
        return ((JobSupport$children$1) create(abstractC6832j, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }
}
