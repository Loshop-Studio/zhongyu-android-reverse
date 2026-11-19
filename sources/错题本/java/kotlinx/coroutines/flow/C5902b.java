package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.AbstractC5922d;
import p075h6.InterfaceC5636h;
import p152r6.InterfaceC6473e;

/* renamed from: kotlinx.coroutines.flow.b */
/* loaded from: classes4.dex */
public final class C5902b extends AbstractC5922d {

    /* renamed from: d */
    public final SuspendLambda f9348d;

    /* renamed from: e */
    public final SuspendLambda f9349e;

    /* JADX WARN: Multi-variable type inference failed */
    public C5902b(InterfaceC6473e interfaceC6473e, InterfaceC5636h interfaceC5636h, int i, BufferOverflow bufferOverflow) {
        super(interfaceC5636h, i, bufferOverflow);
        this.f9348d = (SuspendLambda) interfaceC6473e;
        this.f9349e = (SuspendLambda) interfaceC6473e;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r7v2, types: [kotlin.coroutines.jvm.internal.SuspendLambda, r6.e] */
    @Override // kotlinx.coroutines.flow.internal.AbstractC5922d
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo5521e(kotlinx.coroutines.channels.InterfaceC5884m r6, p075h6.InterfaceC5631c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.CallbackFlowBuilder$collectTo$1
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.flow.CallbackFlowBuilder$collectTo$1 r0 = (kotlinx.coroutines.flow.CallbackFlowBuilder$collectTo$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.CallbackFlowBuilder$collectTo$1 r0 = new kotlinx.coroutines.flow.CallbackFlowBuilder$collectTo$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            d6.s r3 = p045d6.C5443s.f8405a
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            java.lang.Object r6 = r0.L$0
            kotlinx.coroutines.channels.m r6 = (kotlinx.coroutines.channels.InterfaceC5884m) r6
            kotlin.AbstractC5774b.m5119b(r7)
            goto L49
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            kotlin.AbstractC5774b.m5119b(r7)
            r0.L$0 = r6
            r0.label = r4
            kotlin.coroutines.jvm.internal.SuspendLambda r7 = r5.f9348d
            java.lang.Object r7 = r7.invoke(r6, r0)
            if (r7 != r1) goto L45
            goto L46
        L45:
            r7 = r3
        L46:
            if (r7 != r1) goto L49
            return r1
        L49:
            kotlinx.coroutines.channels.l r6 = (kotlinx.coroutines.channels.C5883l) r6
            kotlinx.coroutines.channels.b r6 = r6.f9333d
            boolean r6 = r6.m5499w()
            if (r6 == 0) goto L54
            return r3
        L54:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C5902b.mo5521e(kotlinx.coroutines.channels.m, h6.c):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, r6.e] */
    @Override // kotlinx.coroutines.flow.internal.AbstractC5922d
    /* renamed from: f */
    public final AbstractC5922d mo5522f(InterfaceC5636h interfaceC5636h, int i, BufferOverflow bufferOverflow) {
        return new C5902b(this.f9349e, interfaceC5636h, i, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC5922d
    public final String toString() {
        return "block[" + this.f9348d + "] -> " + super.toString();
    }
}
