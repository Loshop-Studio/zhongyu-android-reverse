package androidx.paging;

import kotlin.coroutines.InterfaceC9100d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC9133u;
import kotlinx.coroutines.channels.InterfaceC9163f;
import p123h7.C8736p;
import p123h7.InterfaceC8721a;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;
import p224q8.InterfaceC9851g;
import p300x7.InterfaceC10570l;

/* loaded from: classes3.dex */
public final class SimpleProducerScopeImpl<T> implements SimpleProducerScope<T>, InterfaceC8822b0, InterfaceC9163f {
    private final /* synthetic */ InterfaceC8822b0 $$delegate_0;
    private final InterfaceC9163f channel;

    @InterfaceC9539d(m17800c = "androidx.paging.SimpleProducerScopeImpl", m17801f = "SimpleChannelFlow.kt", m17802l = {101}, m17803m = "awaitClose")
    /* renamed from: androidx.paging.SimpleProducerScopeImpl$awaitClose$1 */
    public static final class C43881 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ SimpleProducerScopeImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C43881(SimpleProducerScopeImpl<T> simpleProducerScopeImpl, InterfaceC9324c<? super C43881> interfaceC9324c) {
            super(interfaceC9324c);
            this.this$0 = simpleProducerScopeImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.awaitClose(null, this);
        }
    }

    public SimpleProducerScopeImpl(InterfaceC8822b0 scope, InterfaceC9163f channel) {
        AbstractC9133u.m16133g(scope, "scope");
        AbstractC9133u.m16133g(channel, "channel");
        this.channel = channel;
        this.$$delegate_0 = scope;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.paging.SimpleProducerScope
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object awaitClose(p300x7.InterfaceC10559a r6, p179m7.InterfaceC9324c<? super p123h7.C8736p> r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof androidx.paging.SimpleProducerScopeImpl.C43881
            if (r0 == 0) goto L13
            r0 = r7
            androidx.paging.SimpleProducerScopeImpl$awaitClose$1 r0 = (androidx.paging.SimpleProducerScopeImpl.C43881) r0
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
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r6 = r0.L$1
            kotlinx.coroutines.n r6 = (kotlinx.coroutines.InterfaceC9212n) r6
            java.lang.Object r6 = r0.L$0
            x7.a r6 = (p300x7.InterfaceC10559a) r6
            kotlin.AbstractC9079b.m15926b(r7)     // Catch: java.lang.Throwable -> L31
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
            kotlin.AbstractC9079b.m15926b(r7)
            kotlin.coroutines.d r7 = r5.getCoroutineContext()     // Catch: java.lang.Throwable -> L31
            kotlinx.coroutines.n$b r2 = kotlinx.coroutines.InterfaceC9212n.f18095c0     // Catch: java.lang.Throwable -> L31
            kotlin.coroutines.d$b r7 = r7.get(r2)     // Catch: java.lang.Throwable -> L31
            if (r7 == 0) goto L7c
            kotlinx.coroutines.n r7 = (kotlinx.coroutines.InterfaceC9212n) r7     // Catch: java.lang.Throwable -> L31
            r0.L$0 = r6     // Catch: java.lang.Throwable -> L31
            r0.L$1 = r7     // Catch: java.lang.Throwable -> L31
            r0.label = r3     // Catch: java.lang.Throwable -> L31
            kotlinx.coroutines.c r2 = new kotlinx.coroutines.c     // Catch: java.lang.Throwable -> L31
            m7.c r4 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.m16079d(r0)     // Catch: java.lang.Throwable -> L31
            r2.<init>(r4, r3)     // Catch: java.lang.Throwable -> L31
            r2.m16343D()     // Catch: java.lang.Throwable -> L31
            androidx.paging.SimpleProducerScopeImpl$awaitClose$2$1 r3 = new androidx.paging.SimpleProducerScopeImpl$awaitClose$2$1     // Catch: java.lang.Throwable -> L31
            r3.<init>()     // Catch: java.lang.Throwable -> L31
            r7.mo16287k(r3)     // Catch: java.lang.Throwable -> L31
            java.lang.Object r7 = r2.m16372x()     // Catch: java.lang.Throwable -> L31
            java.lang.Object r2 = p190n7.AbstractC9434a.m17291f()     // Catch: java.lang.Throwable -> L31
            if (r7 != r2) goto L73
            p201o7.AbstractC9541f.m17811c(r0)     // Catch: java.lang.Throwable -> L31
        L73:
            if (r7 != r1) goto L76
            return r1
        L76:
            r6.invoke()
            h7.p r6 = p123h7.C8736p.f16368a
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.SimpleProducerScopeImpl.awaitClose(x7.a, m7.c):java.lang.Object");
    }

    @Override // androidx.paging.SimpleProducerScope, kotlinx.coroutines.channels.InterfaceC9163f
    public boolean close(Throwable th) {
        return this.channel.close(th);
    }

    @Override // androidx.paging.SimpleProducerScope
    public InterfaceC9163f getChannel() {
        return this.channel;
    }

    @Override // androidx.paging.SimpleProducerScope, p135i8.InterfaceC8822b0
    public InterfaceC9100d getCoroutineContext() {
        return this.$$delegate_0.getCoroutineContext();
    }

    @Override // androidx.paging.SimpleProducerScope, kotlinx.coroutines.channels.InterfaceC9163f
    public InterfaceC9851g getOnSend() {
        return this.channel.getOnSend();
    }

    @Override // androidx.paging.SimpleProducerScope, kotlinx.coroutines.channels.InterfaceC9163f
    public void invokeOnClose(InterfaceC10570l handler) {
        AbstractC9133u.m16133g(handler, "handler");
        this.channel.invokeOnClose(handler);
    }

    @Override // androidx.paging.SimpleProducerScope, kotlinx.coroutines.channels.InterfaceC9163f
    public boolean isClosedForSend() {
        return this.channel.isClosedForSend();
    }

    @Override // androidx.paging.SimpleProducerScope, kotlinx.coroutines.channels.InterfaceC9163f
    @InterfaceC8721a
    public boolean offer(T t10) {
        return this.channel.offer(t10);
    }

    @Override // androidx.paging.SimpleProducerScope, kotlinx.coroutines.channels.InterfaceC9163f
    public Object send(T t10, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        return this.channel.send(t10, interfaceC9324c);
    }

    @Override // androidx.paging.SimpleProducerScope, kotlinx.coroutines.channels.InterfaceC9163f
    /* renamed from: trySend-JP2dKIU */
    public Object mo27213trySendJP2dKIU(T t10) {
        return this.channel.mo27213trySendJP2dKIU(t10);
    }
}
