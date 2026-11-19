package androidx.paging;

import ae.InterfaceC0112h;
import com.alibaba.fastjson.asm.Opcodes;
import kotlin.coroutines.InterfaceC9945d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC9979u;
import kotlinx.coroutines.channels.InterfaceC10005f;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;
import p309qc.InterfaceC10770a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

/* loaded from: classes3.dex */
public final class SimpleProducerScopeImpl<T> implements SimpleProducerScope<T>, InterfaceC11122i0, InterfaceC10005f {
    private final /* synthetic */ InterfaceC11122i0 $$delegate_0;
    private final InterfaceC10005f channel;

    @InterfaceC11829d(m26210c = "androidx.paging.SimpleProducerScopeImpl", m26211f = "SimpleChannelFlow.kt", m26212l = {Opcodes.IADD}, m26213m = "awaitClose", m26214v = 1)
    /* renamed from: androidx.paging.SimpleProducerScopeImpl$awaitClose$1 */
    public static final class C42911 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ SimpleProducerScopeImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42911(SimpleProducerScopeImpl<T> simpleProducerScopeImpl, InterfaceC11588c<? super C42911> interfaceC11588c) {
            super(interfaceC11588c);
            this.this$0 = simpleProducerScopeImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.awaitClose(null, this);
        }
    }

    public SimpleProducerScopeImpl(InterfaceC11122i0 scope, InterfaceC10005f channel) {
        AbstractC9979u.m20294g(scope, "scope");
        AbstractC9979u.m20294g(channel, "channel");
        this.$$delegate_0 = scope;
        this.channel = channel;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.paging.SimpleProducerScope
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object awaitClose(p181hd.InterfaceC9529a r6, vc.InterfaceC11588c<? super p309qc.C10786q> r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof androidx.paging.SimpleProducerScopeImpl.C42911
            if (r0 == 0) goto L13
            r0 = r7
            androidx.paging.SimpleProducerScopeImpl$awaitClose$1 r0 = (androidx.paging.SimpleProducerScopeImpl.C42911) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.paging.SimpleProducerScopeImpl$awaitClose$1 r0 = new androidx.paging.SimpleProducerScopeImpl$awaitClose$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r6 = r0.L$1
            kotlinx.coroutines.g r6 = (kotlinx.coroutines.InterfaceC10045g) r6
            java.lang.Object r6 = r0.L$0
            hd.a r6 = (p181hd.InterfaceC9529a) r6
            kotlin.AbstractC9924b.m20071b(r7)     // Catch: java.lang.Throwable -> L31
            goto L76
        L31:
            r7 = move-exception
            goto L84
        L33:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3b:
            kotlin.AbstractC9924b.m20071b(r7)
            kotlin.coroutines.d r7 = r5.getCoroutineContext()     // Catch: java.lang.Throwable -> L31
            kotlinx.coroutines.g$b r2 = kotlinx.coroutines.InterfaceC10045g.f23976b0     // Catch: java.lang.Throwable -> L31
            kotlin.coroutines.d$b r7 = r7.get(r2)     // Catch: java.lang.Throwable -> L31
            if (r7 == 0) goto L7c
            kotlinx.coroutines.g r7 = (kotlinx.coroutines.InterfaceC10045g) r7     // Catch: java.lang.Throwable -> L31
            r0.L$0 = r6     // Catch: java.lang.Throwable -> L31
            r0.L$1 = r7     // Catch: java.lang.Throwable -> L31
            r0.label = r3     // Catch: java.lang.Throwable -> L31
            kotlinx.coroutines.c r2 = new kotlinx.coroutines.c     // Catch: java.lang.Throwable -> L31
            vc.c r4 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.m20224d(r0)     // Catch: java.lang.Throwable -> L31
            r2.<init>(r4, r3)     // Catch: java.lang.Throwable -> L31
            r2.m20503F()     // Catch: java.lang.Throwable -> L31
            androidx.paging.SimpleProducerScopeImpl$awaitClose$2$1 r3 = new androidx.paging.SimpleProducerScopeImpl$awaitClose$2$1     // Catch: java.lang.Throwable -> L31
            r3.<init>()     // Catch: java.lang.Throwable -> L31
            r7.mo20404A(r3)     // Catch: java.lang.Throwable -> L31
            java.lang.Object r7 = r2.m20538x()     // Catch: java.lang.Throwable -> L31
            java.lang.Object r2 = p393wc.AbstractC11725a.m25952f()     // Catch: java.lang.Throwable -> L31
            if (r7 != r2) goto L73
            p409xc.AbstractC11831f.m26221c(r0)     // Catch: java.lang.Throwable -> L31
        L73:
            if (r7 != r1) goto L76
            return r1
        L76:
            r6.invoke()
            qc.q r6 = p309qc.C10786q.f26013a
            return r6
        L7c:
            java.lang.String r7 = "Internal error, context should have a job."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L31
            r0.<init>(r7)     // Catch: java.lang.Throwable -> L31
            throw r0     // Catch: java.lang.Throwable -> L31
        L84:
            r6.invoke()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.SimpleProducerScopeImpl.awaitClose(hd.a, vc.c):java.lang.Object");
    }

    @Override // androidx.paging.SimpleProducerScope, kotlinx.coroutines.channels.InterfaceC10005f
    public boolean close(Throwable th) {
        return this.channel.close(th);
    }

    @Override // androidx.paging.SimpleProducerScope
    public InterfaceC10005f getChannel() {
        return this.channel;
    }

    @Override // androidx.paging.SimpleProducerScope, sd.InterfaceC11122i0
    public InterfaceC9945d getCoroutineContext() {
        return this.$$delegate_0.getCoroutineContext();
    }

    @Override // androidx.paging.SimpleProducerScope, kotlinx.coroutines.channels.InterfaceC10005f
    public InterfaceC0112h getOnSend() {
        return this.channel.getOnSend();
    }

    @Override // androidx.paging.SimpleProducerScope, kotlinx.coroutines.channels.InterfaceC10005f
    public void invokeOnClose(InterfaceC9540l handler) {
        AbstractC9979u.m20294g(handler, "handler");
        this.channel.invokeOnClose(handler);
    }

    @Override // androidx.paging.SimpleProducerScope, kotlinx.coroutines.channels.InterfaceC10005f
    public boolean isClosedForSend() {
        return this.channel.isClosedForSend();
    }

    @Override // androidx.paging.SimpleProducerScope, kotlinx.coroutines.channels.InterfaceC10005f
    @InterfaceC10770a
    public boolean offer(T t10) {
        return this.channel.offer(t10);
    }

    @Override // androidx.paging.SimpleProducerScope, kotlinx.coroutines.channels.InterfaceC10005f
    public Object send(T t10, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        return this.channel.send(t10, interfaceC11588c);
    }

    @Override // androidx.paging.SimpleProducerScope, kotlinx.coroutines.channels.InterfaceC10005f
    /* renamed from: trySend-JP2dKIU */
    public Object mo33808trySendJP2dKIU(T t10) {
        return this.channel.mo33808trySendJP2dKIU(t10);
    }
}
