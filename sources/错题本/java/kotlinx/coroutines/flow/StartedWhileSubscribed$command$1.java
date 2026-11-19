package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6474f;

@Metadata(m5109d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m5110d2 = {"Lkotlinx/coroutines/flow/g;", "Lkotlinx/coroutines/flow/SharingCommand;", "", "count", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/flow/g;I)V"}, m5111k = 3, m5112mv = {2, 1, 0})
@DebugMetadata(m5302c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$1", m5303f = "SharingStarted.kt", m5304i = {1, 2, 3}, m5305l = {174, 176, 178, 179, 181}, m5306m = "invokeSuspend", m5307n = {"$this$transformLatest", "$this$transformLatest", "$this$transformLatest"}, m5308s = {"L$0", "L$0", "L$0"})
/* loaded from: classes4.dex */
final class StartedWhileSubscribed$command$1 extends SuspendLambda implements InterfaceC6474f {
    /* synthetic */ int I$0;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C5942l0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartedWhileSubscribed$command$1(C5942l0 c5942l0, InterfaceC5631c<? super StartedWhileSubscribed$command$1> interfaceC5631c) {
        super(3, interfaceC5631c);
        this.this$0 = c5942l0;
    }

    @Override // p152r6.InterfaceC6474f
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((InterfaceC5912g) obj, ((Number) obj2).intValue(), (InterfaceC5631c<? super C5443s>) obj3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004e, code lost:
    
        if (r1.emit(r8, r7) == r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0095, code lost:
    
        if (r1.emit(r8, r7) != r0) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0075 A[PHI: r1
      0x0075: PHI (r1v4 kotlinx.coroutines.flow.g) = (r1v3 kotlinx.coroutines.flow.g), (r1v9 kotlinx.coroutines.flow.g) binds: [B:25:0x0072, B:13:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008a A[PHI: r1
      0x008a: PHI (r1v5 kotlinx.coroutines.flow.g) = (r1v4 kotlinx.coroutines.flow.g), (r1v11 kotlinx.coroutines.flow.g) binds: [B:28:0x0087, B:12:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r7.label
            r2 = 5
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L3a
            if (r1 == r6) goto L36
            if (r1 == r5) goto L2e
            if (r1 == r4) goto L26
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L16
            goto L36
        L16:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1e:
            java.lang.Object r1 = r7.L$0
            kotlinx.coroutines.flow.g r1 = (kotlinx.coroutines.flow.InterfaceC5912g) r1
            kotlin.AbstractC5774b.m5119b(r8)
            goto L8a
        L26:
            java.lang.Object r1 = r7.L$0
            kotlinx.coroutines.flow.g r1 = (kotlinx.coroutines.flow.InterfaceC5912g) r1
            kotlin.AbstractC5774b.m5119b(r8)
            goto L75
        L2e:
            java.lang.Object r1 = r7.L$0
            kotlinx.coroutines.flow.g r1 = (kotlinx.coroutines.flow.InterfaceC5912g) r1
            kotlin.AbstractC5774b.m5119b(r8)
            goto L63
        L36:
            kotlin.AbstractC5774b.m5119b(r8)
            goto L98
        L3a:
            kotlin.AbstractC5774b.m5119b(r8)
            java.lang.Object r8 = r7.L$0
            r1 = r8
            kotlinx.coroutines.flow.g r1 = (kotlinx.coroutines.flow.InterfaceC5912g) r1
            int r8 = r7.I$0
            if (r8 <= 0) goto L51
            kotlinx.coroutines.flow.SharingCommand r8 = kotlinx.coroutines.flow.SharingCommand.START
            r7.label = r6
            java.lang.Object r8 = r1.emit(r8, r7)
            if (r8 != r0) goto L98
            goto L97
        L51:
            kotlinx.coroutines.flow.l0 r8 = r7.this$0
            r8.getClass()
            r7.L$0 = r1
            r7.label = r5
            r5 = 0
            java.lang.Object r8 = kotlinx.coroutines.AbstractC6014x.m5638i(r5, r7)
            if (r8 != r0) goto L63
            goto L97
        L63:
            kotlinx.coroutines.flow.l0 r8 = r7.this$0
            r8.getClass()
            kotlinx.coroutines.flow.SharingCommand r8 = kotlinx.coroutines.flow.SharingCommand.STOP
            r7.L$0 = r1
            r7.label = r4
            java.lang.Object r8 = r1.emit(r8, r7)
            if (r8 != r0) goto L75
            goto L97
        L75:
            kotlinx.coroutines.flow.l0 r8 = r7.this$0
            r8.getClass()
            r7.L$0 = r1
            r7.label = r3
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.lang.Object r8 = kotlinx.coroutines.AbstractC6014x.m5638i(r3, r7)
            if (r8 != r0) goto L8a
            goto L97
        L8a:
            kotlinx.coroutines.flow.SharingCommand r8 = kotlinx.coroutines.flow.SharingCommand.STOP_AND_RESET_REPLAY_CACHE
            r3 = 0
            r7.L$0 = r3
            r7.label = r2
            java.lang.Object r8 = r1.emit(r8, r7)
            if (r8 != r0) goto L98
        L97:
            return r0
        L98:
            d6.s r8 = p045d6.C5443s.f8405a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.StartedWhileSubscribed$command$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final Object invoke(InterfaceC5912g interfaceC5912g, int i, InterfaceC5631c<? super C5443s> interfaceC5631c) {
        StartedWhileSubscribed$command$1 startedWhileSubscribed$command$1 = new StartedWhileSubscribed$command$1(this.this$0, interfaceC5631c);
        startedWhileSubscribed$command$1.L$0 = interfaceC5912g;
        startedWhileSubscribed$command$1.I$0 = i;
        return startedWhileSubscribed$command$1.invokeSuspend(C5443s.f8405a);
    }
}
