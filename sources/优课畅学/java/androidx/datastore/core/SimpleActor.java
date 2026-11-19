package androidx.datastore.core;

import com.tencent.smtt.sdk.TbsListener;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9133u;
import kotlinx.coroutines.InterfaceC9212n;
import kotlinx.coroutines.channels.AbstractC9159b;
import kotlinx.coroutines.channels.C9160c;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import kotlinx.coroutines.channels.InterfaceC9158a;
import p123h7.C8736p;
import p135i8.AbstractC8839h;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

/* loaded from: classes2.dex */
public final class SimpleActor<T> {
    private final InterfaceC10574p consumeMessage;
    private final InterfaceC9158a messageQueue;
    private final AtomicInt remainingMessages;
    private final InterfaceC8822b0 scope;

    @InterfaceC9539d(m17800c = "androidx.datastore.core.SimpleActor$offer$2", m17801f = "SimpleActor.kt", m17802l = {TbsListener.ErrorCode.THREAD_INIT_ERROR, TbsListener.ErrorCode.THREAD_INIT_ERROR}, m17803m = "invokeSuspend")
    /* renamed from: androidx.datastore.core.SimpleActor$offer$2 */
    public static final class C37612 extends SuspendLambda implements InterfaceC10574p {
        Object L$0;
        int label;
        final /* synthetic */ SimpleActor<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37612(SimpleActor<T> simpleActor, InterfaceC9324c<? super C37612> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.this$0 = simpleActor;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            return new C37612(this.this$0, interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C37612) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x005a, code lost:
        
            if (r1.invoke(r6, r5) != r0) goto L18;
         */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0051 A[PHI: r1 r6
          0x0051: PHI (r1v1 x7.p) = (r1v2 x7.p), (r1v4 x7.p) binds: [B:13:0x004e, B:9:0x001a] A[DONT_GENERATE, DONT_INLINE]
          0x0051: PHI (r6v5 java.lang.Object) = (r6v12 java.lang.Object), (r6v0 java.lang.Object) binds: [B:13:0x004e, B:9:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x005a -> B:18:0x005d). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) throws java.lang.Throwable {
            /*
                r5 = this;
                java.lang.Object r0 = p190n7.AbstractC9434a.m17291f()
                int r1 = r5.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.AbstractC9079b.m15926b(r6)
                goto L5d
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                java.lang.Object r1 = r5.L$0
                x7.p r1 = (p300x7.InterfaceC10574p) r1
                kotlin.AbstractC9079b.m15926b(r6)
                goto L51
            L22:
                kotlin.AbstractC9079b.m15926b(r6)
                androidx.datastore.core.SimpleActor<T> r6 = r5.this$0
                androidx.datastore.core.AtomicInt r6 = androidx.datastore.core.SimpleActor.access$getRemainingMessages$p(r6)
                int r6 = r6.get()
                if (r6 <= 0) goto L6c
            L31:
                androidx.datastore.core.SimpleActor<T> r6 = r5.this$0
                i8.b0 r6 = androidx.datastore.core.SimpleActor.access$getScope$p(r6)
                kotlinx.coroutines.AbstractC9165e.m16557f(r6)
                androidx.datastore.core.SimpleActor<T> r6 = r5.this$0
                x7.p r1 = androidx.datastore.core.SimpleActor.access$getConsumeMessage$p(r6)
                androidx.datastore.core.SimpleActor<T> r6 = r5.this$0
                kotlinx.coroutines.channels.a r6 = androidx.datastore.core.SimpleActor.access$getMessageQueue$p(r6)
                r5.L$0 = r1
                r5.label = r3
                java.lang.Object r6 = r6.mo15876f(r5)
                if (r6 != r0) goto L51
                goto L5c
            L51:
                r4 = 0
                r5.L$0 = r4
                r5.label = r2
                java.lang.Object r6 = r1.invoke(r6, r5)
                if (r6 != r0) goto L5d
            L5c:
                return r0
            L5d:
                androidx.datastore.core.SimpleActor<T> r6 = r5.this$0
                androidx.datastore.core.AtomicInt r6 = androidx.datastore.core.SimpleActor.access$getRemainingMessages$p(r6)
                int r6 = r6.decrementAndGet()
                if (r6 != 0) goto L31
                h7.p r6 = p123h7.C8736p.f16368a
                return r6
            L6c:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "Check failed."
                r6.<init>(r0)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SimpleActor.C37612.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public SimpleActor(InterfaceC8822b0 scope, final InterfaceC10570l onComplete, final InterfaceC10574p onUndeliveredElement, InterfaceC10574p consumeMessage) {
        AbstractC9133u.m16133g(scope, "scope");
        AbstractC9133u.m16133g(onComplete, "onComplete");
        AbstractC9133u.m16133g(onUndeliveredElement, "onUndeliveredElement");
        AbstractC9133u.m16133g(consumeMessage, "consumeMessage");
        this.scope = scope;
        this.consumeMessage = consumeMessage;
        this.messageQueue = AbstractC9159b.m16529b(Integer.MAX_VALUE, null, null, 6, null);
        this.remainingMessages = new AtomicInt(0);
        InterfaceC9212n interfaceC9212n = (InterfaceC9212n) scope.getCoroutineContext().get(InterfaceC9212n.f18095c0);
        if (interfaceC9212n != null) {
            interfaceC9212n.mo16287k(new InterfaceC10570l() { // from class: androidx.datastore.core.SimpleActor.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p300x7.InterfaceC10570l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Throwable) obj);
                    return C8736p.f16368a;
                }

                public final void invoke(Throwable th) {
                    C8736p c8736p;
                    onComplete.invoke(th);
                    ((SimpleActor) this).messageQueue.close(th);
                    do {
                        Object objM16535f = C9160c.m16535f(((SimpleActor) this).messageQueue.mo15878o());
                        if (objM16535f != null) {
                            onUndeliveredElement.invoke(objM16535f, th);
                            c8736p = C8736p.f16368a;
                        } else {
                            c8736p = null;
                        }
                    } while (c8736p != null);
                }
            });
        }
    }

    public final void offer(T t10) {
        Object objMo27213trySendJP2dKIU = this.messageQueue.mo27213trySendJP2dKIU(t10);
        if (objMo27213trySendJP2dKIU instanceof C9160c.a) {
            Throwable thM16534e = C9160c.m16534e(objMo27213trySendJP2dKIU);
            if (thM16534e != null) {
                throw thM16534e;
            }
            throw new ClosedSendChannelException("Channel was closed normally");
        }
        if (!C9160c.m16539j(objMo27213trySendJP2dKIU)) {
            throw new IllegalStateException("Check failed.");
        }
        if (this.remainingMessages.getAndIncrement() == 0) {
            AbstractC8839h.m14861d(this.scope, null, null, new C37612(this, null), 3, null);
        }
    }
}
