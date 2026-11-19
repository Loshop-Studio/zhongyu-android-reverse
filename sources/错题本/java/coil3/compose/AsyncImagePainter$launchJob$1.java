package coil3.compose;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC6009v;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {2, 1, 0})
@DebugMetadata(m5302c = "coil3.compose.AsyncImagePainter$launchJob$1", m5303f = "AsyncImagePainter.kt", m5304i = {}, m5305l = {228, 232}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
/* loaded from: classes2.dex */
final class AsyncImagePainter$launchJob$1 extends SuspendLambda implements InterfaceC6473e {
    final /* synthetic */ C3247d $input;
    Object L$0;
    int label;
    final /* synthetic */ AsyncImagePainter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncImagePainter$launchJob$1(AsyncImagePainter asyncImagePainter, C3247d c3247d, InterfaceC5631c<? super AsyncImagePainter$launchJob$1> interfaceC5631c) {
        super(2, interfaceC5631c);
        this.this$0 = asyncImagePainter;
        this.$input = c3247d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
        return new AsyncImagePainter$launchJob$1(this.this$0, this.$input, interfaceC5631c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
    
        if (r5 == r0) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007c  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r4.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L20
            if (r1 == r3) goto L1c
            if (r1 != r2) goto L14
            java.lang.Object r0 = r4.L$0
            coil3.compose.AsyncImagePainter r0 = (coil3.compose.AsyncImagePainter) r0
            kotlin.AbstractC5774b.m5119b(r5)
            goto L5e
        L14:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L1c:
            kotlin.AbstractC5774b.m5119b(r5)
            goto L3e
        L20:
            kotlin.AbstractC5774b.m5119b(r5)
            coil3.compose.AsyncImagePainter r5 = r4.this$0
            coil3.compose.j r1 = r5.f1830l
            if (r1 == 0) goto L41
            coil3.compose.d r2 = r4.$input
            s.f r2 = r2.f1851b
            s.f r5 = coil3.compose.AsyncImagePainter.m2176a(r5, r2, r3)
            coil3.compose.d r2 = r4.$input
            coil3.n r2 = r2.f1850a
            r4.label = r3
            java.lang.Object r5 = r1.m2187a(r2, r5, r4)
            if (r5 != r0) goto L3e
            goto L5c
        L3e:
            coil3.compose.i r5 = (coil3.compose.InterfaceC3252i) r5
            goto L98
        L41:
            coil3.compose.d r1 = r4.$input
            s.f r1 = r1.f1851b
            r3 = 0
            s.f r5 = coil3.compose.AsyncImagePainter.m2176a(r5, r1, r3)
            coil3.compose.AsyncImagePainter r1 = r4.this$0
            coil3.compose.d r3 = r4.$input
            coil3.n r3 = r3.f1850a
            r4.L$0 = r1
            r4.label = r2
            coil3.r r3 = (coil3.C3333r) r3
            java.lang.Object r5 = r3.m2276c(r5, r4)
            if (r5 != r0) goto L5d
        L5c:
            return r0
        L5d:
            r0 = r1
        L5e:
            s.i r5 = (p154s.InterfaceC6535i) r5
            r0.getClass()
            boolean r1 = r5 instanceof p154s.C6540n
            if (r1 == 0) goto L7c
            coil3.compose.h r1 = new coil3.compose.h
            s.n r5 = (p154s.C6540n) r5
            coil3.k r2 = r5.f10904a
            s.f r3 = r5.f10905b
            android.content.Context r3 = r3.f10861a
            int r0 = r0.f1829k
            androidx.compose.ui.graphics.painter.Painter r0 = coil3.compose.AbstractC3255l.m2188a(r2, r3, r0)
            r1.<init>(r0, r5)
        L7a:
            r5 = r1
            goto L98
        L7c:
            boolean r1 = r5 instanceof p154s.C6528b
            if (r1 == 0) goto La0
            coil3.compose.f r1 = new coil3.compose.f
            s.b r5 = (p154s.C6528b) r5
            coil3.k r2 = r5.f10815a
            if (r2 == 0) goto L93
            s.f r3 = r5.f10816b
            android.content.Context r3 = r3.f10861a
            int r0 = r0.f1829k
            androidx.compose.ui.graphics.painter.Painter r0 = coil3.compose.AbstractC3255l.m2188a(r2, r3, r0)
            goto L94
        L93:
            r0 = 0
        L94:
            r1.<init>(r0, r5)
            goto L7a
        L98:
            coil3.compose.AsyncImagePainter r0 = r4.this$0
            coil3.compose.AsyncImagePainter.m2177b(r0, r5)
            d6.s r5 = p045d6.C5443s.f8405a
            return r5
        La0:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.compose.AsyncImagePainter$launchJob$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
        return ((AsyncImagePainter$launchJob$1) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }
}
