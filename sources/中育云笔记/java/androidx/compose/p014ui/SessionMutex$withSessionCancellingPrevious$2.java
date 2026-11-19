package androidx.compose.p014ui;

import androidx.camera.view.AbstractC0979q;
import androidx.compose.p014ui.SessionMutex;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC10045g;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.AbstractC11147o1;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.compose.ui.SessionMutex$withSessionCancellingPrevious$2", m26211f = "SessionMutex.kt", m26212l = {61, 63}, m26213m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class SessionMutex$withSessionCancellingPrevious$2 extends SuspendLambda implements InterfaceC9544p {
    final /* synthetic */ AtomicReference<SessionMutex.Session<T>> $arg0;
    final /* synthetic */ InterfaceC9544p $session;
    final /* synthetic */ InterfaceC9540l $sessionInitializer;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionMutex$withSessionCancellingPrevious$2(InterfaceC9540l interfaceC9540l, AtomicReference<SessionMutex.Session<T>> atomicReference, InterfaceC9544p interfaceC9544p, InterfaceC11588c<? super SessionMutex$withSessionCancellingPrevious$2> interfaceC11588c) {
        super(2, interfaceC11588c);
        this.$sessionInitializer = interfaceC9540l;
        this.$arg0 = atomicReference;
        this.$session = interfaceC9544p;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
        SessionMutex$withSessionCancellingPrevious$2 sessionMutex$withSessionCancellingPrevious$2 = new SessionMutex$withSessionCancellingPrevious$2(this.$sessionInitializer, this.$arg0, this.$session, interfaceC11588c);
        sessionMutex$withSessionCancellingPrevious$2.L$0 = obj;
        return sessionMutex$withSessionCancellingPrevious$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        SessionMutex.Session session;
        InterfaceC10045g job;
        SessionMutex.Session session2;
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.label;
        try {
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                InterfaceC11122i0 interfaceC11122i0 = (InterfaceC11122i0) this.L$0;
                session = new SessionMutex.Session(AbstractC11147o1.m24777k(interfaceC11122i0.getCoroutineContext()), this.$sessionInitializer.invoke(interfaceC11122i0));
                SessionMutex.Session session3 = (SessionMutex.Session) this.$arg0.getAndSet(session);
                if (session3 != null && (job = session3.getJob()) != null) {
                    this.L$0 = session;
                    this.label = 1;
                    if (AbstractC11147o1.m24773g(job, this) != objM25952f) {
                    }
                    return objM25952f;
                }
            } else {
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    session2 = (SessionMutex.Session) this.L$0;
                    try {
                        AbstractC9924b.m20071b(obj);
                        AbstractC0979q.m884a(this.$arg0, session2, null);
                        return obj;
                    } catch (Throwable th) {
                        th = th;
                        AbstractC0979q.m884a(this.$arg0, session2, null);
                        throw th;
                    }
                }
                session = (SessionMutex.Session) this.L$0;
                AbstractC9924b.m20071b(obj);
            }
            InterfaceC9544p interfaceC9544p = this.$session;
            Object value = session.getValue();
            this.L$0 = session;
            this.label = 2;
            obj = interfaceC9544p.invoke(value, this);
            if (obj != objM25952f) {
                session2 = session;
                AbstractC0979q.m884a(this.$arg0, session2, null);
                return obj;
            }
            return objM25952f;
        } catch (Throwable th2) {
            th = th2;
            session2 = session;
            AbstractC0979q.m884a(this.$arg0, session2, null);
            throw th;
        }
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super R> interfaceC11588c) {
        return ((SessionMutex$withSessionCancellingPrevious$2) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
