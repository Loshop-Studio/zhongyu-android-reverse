package androidx.compose.p013ui;

import androidx.camera.view.AbstractC0949q;
import androidx.compose.p013ui.SessionMutex;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC9212n;
import p123h7.C8736p;
import p135i8.AbstractC8823b1;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "androidx.compose.ui.SessionMutex$withSessionCancellingPrevious$2", m17801f = "SessionMutex.kt", m17802l = {61, 63}, m17803m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class SessionMutex$withSessionCancellingPrevious$2 extends SuspendLambda implements InterfaceC10574p {
    final /* synthetic */ AtomicReference<SessionMutex.Session<T>> $arg0;
    final /* synthetic */ InterfaceC10574p $session;
    final /* synthetic */ InterfaceC10570l $sessionInitializer;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionMutex$withSessionCancellingPrevious$2(InterfaceC10570l interfaceC10570l, AtomicReference<SessionMutex.Session<T>> atomicReference, InterfaceC10574p interfaceC10574p, InterfaceC9324c<? super SessionMutex$withSessionCancellingPrevious$2> interfaceC9324c) {
        super(2, interfaceC9324c);
        this.$sessionInitializer = interfaceC10570l;
        this.$arg0 = atomicReference;
        this.$session = interfaceC10574p;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
        SessionMutex$withSessionCancellingPrevious$2 sessionMutex$withSessionCancellingPrevious$2 = new SessionMutex$withSessionCancellingPrevious$2(this.$sessionInitializer, this.$arg0, this.$session, interfaceC9324c);
        sessionMutex$withSessionCancellingPrevious$2.L$0 = obj;
        return sessionMutex$withSessionCancellingPrevious$2;
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super R> interfaceC9324c) {
        return ((SessionMutex$withSessionCancellingPrevious$2) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        SessionMutex.Session session;
        InterfaceC9212n job;
        SessionMutex.Session session2;
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.label;
        try {
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                InterfaceC8822b0 interfaceC8822b0 = (InterfaceC8822b0) this.L$0;
                session = new SessionMutex.Session(AbstractC8823b1.m14816l(interfaceC8822b0.getCoroutineContext()), this.$sessionInitializer.invoke(interfaceC8822b0));
                SessionMutex.Session session3 = (SessionMutex.Session) this.$arg0.getAndSet(session);
                if (session3 != null && (job = session3.getJob()) != null) {
                    this.L$0 = session;
                    this.label = 1;
                    if (AbstractC8823b1.m14811g(job, this) != objM17291f) {
                    }
                    return objM17291f;
                }
            } else {
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    session2 = (SessionMutex.Session) this.L$0;
                    try {
                        AbstractC9079b.m15926b(obj);
                        AbstractC0949q.m807a(this.$arg0, session2, null);
                        return obj;
                    } catch (Throwable th) {
                        th = th;
                        AbstractC0949q.m807a(this.$arg0, session2, null);
                        throw th;
                    }
                }
                session = (SessionMutex.Session) this.L$0;
                AbstractC9079b.m15926b(obj);
            }
            InterfaceC10574p interfaceC10574p = this.$session;
            Object value = session.getValue();
            this.L$0 = session;
            this.label = 2;
            obj = interfaceC10574p.invoke(value, this);
            if (obj != objM17291f) {
                session2 = session;
                AbstractC0949q.m807a(this.$arg0, session2, null);
                return obj;
            }
            return objM17291f;
        } catch (Throwable th2) {
            th = th2;
            session2 = session;
            AbstractC0949q.m807a(this.$arg0, session2, null);
            throw th;
        }
    }
}
