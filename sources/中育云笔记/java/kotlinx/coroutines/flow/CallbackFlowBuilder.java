package kotlinx.coroutines.flow;

import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.InterfaceC9945d;
import kotlin.jvm.internal.AbstractC9972n;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.ChannelFlow;
import p181hd.InterfaceC9544p;
import p379vd.C11593b;

/* loaded from: classes6.dex */
public final class CallbackFlowBuilder extends C11593b {

    /* renamed from: g */
    public final InterfaceC9544p f23595g;

    public /* synthetic */ CallbackFlowBuilder(InterfaceC9544p interfaceC9544p, InterfaceC9945d interfaceC9945d, int i10, BufferOverflow bufferOverflow, int i11, AbstractC9972n abstractC9972n) {
        this(interfaceC9544p, (i11 & 2) != 0 ? EmptyCoroutineContext.f23351c : interfaceC9945d, (i11 & 4) != 0 ? -2 : i10, (i11 & 8) != 0 ? BufferOverflow.f23519c : bufferOverflow);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p379vd.C11593b, kotlinx.coroutines.flow.internal.ChannelFlow
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo20757h(p365ud.InterfaceC11395j r5, vc.InterfaceC11588c r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.CallbackFlowBuilder$collectTo$1
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.CallbackFlowBuilder$collectTo$1 r0 = (kotlinx.coroutines.flow.CallbackFlowBuilder$collectTo$1) r0
            int r1 = r0.f23599f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23599f = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.CallbackFlowBuilder$collectTo$1 r0 = new kotlinx.coroutines.flow.CallbackFlowBuilder$collectTo$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f23597d
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.f23599f
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f23596c
            ud.j r5 = (p365ud.InterfaceC11395j) r5
            kotlin.AbstractC9924b.m20071b(r6)
            goto L43
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.AbstractC9924b.m20071b(r6)
            r0.f23596c = r5
            r0.f23599f = r3
            java.lang.Object r6 = super.mo20757h(r5, r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            boolean r5 = r5.isClosedForSend()
            if (r5 == 0) goto L4c
            qc.q r5 = p309qc.C10786q.f26013a
            return r5
        L4c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.CallbackFlowBuilder.mo20757h(ud.j, vc.c):java.lang.Object");
    }

    @Override // p379vd.C11593b, kotlinx.coroutines.flow.internal.ChannelFlow
    /* renamed from: i */
    public ChannelFlow mo20758i(InterfaceC9945d interfaceC9945d, int i10, BufferOverflow bufferOverflow) {
        return new CallbackFlowBuilder(this.f23595g, interfaceC9945d, i10, bufferOverflow);
    }

    public CallbackFlowBuilder(InterfaceC9544p interfaceC9544p, InterfaceC9945d interfaceC9945d, int i10, BufferOverflow bufferOverflow) {
        super(interfaceC9544p, interfaceC9945d, i10, bufferOverflow);
        this.f23595g = interfaceC9544p;
    }
}
