package kotlinx.coroutines;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, m5110d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/v;", "<anonymous>"}, m5111k = 3, m5112mv = {2, 1, 0})
@DebugMetadata(m5302c = "kotlinx.coroutines.InterruptibleKt$runInterruptible$2", m5303f = "Interruptible.kt", m5304i = {}, m5305l = {}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
/* loaded from: classes4.dex */
final class InterruptibleKt$runInterruptible$2 extends SuspendLambda implements InterfaceC6473e {
    final /* synthetic */ InterfaceC6469a $block;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InterruptibleKt$runInterruptible$2(InterfaceC6469a interfaceC6469a, InterfaceC5631c<? super InterruptibleKt$runInterruptible$2> interfaceC5631c) {
        super(2, interfaceC5631c);
        this.$block = interfaceC6469a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
        InterruptibleKt$runInterruptible$2 interruptibleKt$runInterruptible$2 = new InterruptibleKt$runInterruptible$2(this.$block, interfaceC5631c);
        interruptibleKt$runInterruptible$2.L$0 = obj;
        return interruptibleKt$runInterruptible$2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0044, code lost:
    
        return r0.invoke();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0047, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0048, code lost:
    
        r1.m5610k();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004b, code lost:
    
        throw r5;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) throws java.lang.Throwable {
        /*
            r4 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r0 = r4.label
            if (r0 != 0) goto L58
            kotlin.AbstractC5774b.m5119b(r5)
            java.lang.Object r5 = r4.L$0
            kotlinx.coroutines.v r5 = (kotlinx.coroutines.InterfaceC6009v) r5
            h6.h r5 = r5.getCoroutineContext()
            r6.a r0 = r4.$block
            kotlinx.coroutines.p1 r1 = new kotlinx.coroutines.p1     // Catch: java.lang.InterruptedException -> L45
            r1.<init>()     // Catch: java.lang.InterruptedException -> L45
            kotlinx.coroutines.w0 r5 = kotlinx.coroutines.AbstractC6014x.m5643n(r5)     // Catch: java.lang.InterruptedException -> L45
            kotlinx.coroutines.g0 r5 = kotlinx.coroutines.AbstractC6014x.m5646q(r5, r1)     // Catch: java.lang.InterruptedException -> L45
            r1.f9489f = r5     // Catch: java.lang.InterruptedException -> L45
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r5 = kotlinx.coroutines.C5991p1.f9487g     // Catch: java.lang.InterruptedException -> L45
        L24:
            int r2 = r5.get(r1)     // Catch: java.lang.InterruptedException -> L45
            if (r2 == 0) goto L36
            r5 = 2
            if (r2 == r5) goto L3d
            r5 = 3
            if (r2 != r5) goto L31
            goto L3d
        L31:
            kotlinx.coroutines.C5991p1.m5609l(r2)     // Catch: java.lang.InterruptedException -> L45
            r5 = 0
            throw r5     // Catch: java.lang.InterruptedException -> L45
        L36:
            r3 = 0
            boolean r2 = r5.compareAndSet(r1, r2, r3)     // Catch: java.lang.InterruptedException -> L45
            if (r2 == 0) goto L24
        L3d:
            java.lang.Object r5 = r0.invoke()     // Catch: java.lang.Throwable -> L47
            r1.m5610k()     // Catch: java.lang.InterruptedException -> L45
            return r5
        L45:
            r5 = move-exception
            goto L4c
        L47:
            r5 = move-exception
            r1.m5610k()     // Catch: java.lang.InterruptedException -> L45
            throw r5     // Catch: java.lang.InterruptedException -> L45
        L4c:
            java.util.concurrent.CancellationException r0 = new java.util.concurrent.CancellationException
            java.lang.String r1 = "Blocking call was interrupted due to parent cancellation"
            r0.<init>(r1)
            java.lang.Throwable r5 = r0.initCause(r5)
            throw r5
        L58:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.InterruptibleKt$runInterruptible$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<Object> interfaceC5631c) {
        return ((InterruptibleKt$runInterruptible$2) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }
}
