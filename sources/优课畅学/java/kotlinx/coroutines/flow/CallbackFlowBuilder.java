package kotlinx.coroutines.flow;

import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.InterfaceC9100d;
import kotlin.jvm.internal.AbstractC9126n;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.ChannelFlow;
import p169l8.C9265b;
import p300x7.InterfaceC10574p;

/* loaded from: classes5.dex */
public final class CallbackFlowBuilder extends C9265b {

    /* renamed from: e */
    public final InterfaceC10574p f17687e;

    public /* synthetic */ CallbackFlowBuilder(InterfaceC10574p interfaceC10574p, InterfaceC9100d interfaceC9100d, int i10, BufferOverflow bufferOverflow, int i11, AbstractC9126n abstractC9126n) {
        this(interfaceC10574p, (i11 & 2) != 0 ? EmptyCoroutineContext.f17438a : interfaceC9100d, (i11 & 4) != 0 ? -2 : i10, (i11 & 8) != 0 ? BufferOverflow.f17603a : bufferOverflow);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p169l8.C9265b, kotlinx.coroutines.flow.internal.ChannelFlow
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo16569i(p157k8.InterfaceC9071g r5, p179m7.InterfaceC9324c r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.CallbackFlowBuilder$collectTo$1
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.CallbackFlowBuilder$collectTo$1 r0 = (kotlinx.coroutines.flow.CallbackFlowBuilder$collectTo$1) r0
            int r1 = r0.f17691d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17691d = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.CallbackFlowBuilder$collectTo$1 r0 = new kotlinx.coroutines.flow.CallbackFlowBuilder$collectTo$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f17689b
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.f17691d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f17688a
            k8.g r5 = (p157k8.InterfaceC9071g) r5
            kotlin.AbstractC9079b.m15926b(r6)
            goto L43
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.AbstractC9079b.m15926b(r6)
            r0.f17688a = r5
            r0.f17691d = r3
            java.lang.Object r6 = super.mo16569i(r5, r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            boolean r5 = r5.isClosedForSend()
            if (r5 == 0) goto L4c
            h7.p r5 = p123h7.C8736p.f16368a
            return r5
        L4c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.CallbackFlowBuilder.mo16569i(k8.g, m7.c):java.lang.Object");
    }

    @Override // p169l8.C9265b, kotlinx.coroutines.flow.internal.ChannelFlow
    /* renamed from: j */
    public ChannelFlow mo16570j(InterfaceC9100d interfaceC9100d, int i10, BufferOverflow bufferOverflow) {
        return new CallbackFlowBuilder(this.f17687e, interfaceC9100d, i10, bufferOverflow);
    }

    public CallbackFlowBuilder(InterfaceC10574p interfaceC10574p, InterfaceC9100d interfaceC9100d, int i10, BufferOverflow bufferOverflow) {
        super(interfaceC10574p, interfaceC9100d, i10, bufferOverflow);
        this.f17687e = interfaceC10574p;
    }
}
