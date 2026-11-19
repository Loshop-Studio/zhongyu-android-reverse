package androidx.compose.p011ui;

import androidx.compose.p011ui.SessionMutex;
import androidx.exifinterface.media.ExifInterface;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC6014x;
import kotlinx.coroutines.InterfaceC6009v;
import kotlinx.coroutines.InterfaceC6013w0;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\u008a@"}, m5110d2 = {"R", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/v;", "<anonymous>"}, m5111k = 3, m5112mv = {1, 9, 0})
@DebugMetadata(m5302c = "androidx.compose.ui.SessionMutex$withSessionCancellingPrevious$2", m5303f = "SessionMutex.kt", m5304i = {0, 1}, m5305l = {61, 63}, m5306m = "invokeSuspend", m5307n = {"newSession", "newSession"}, m5308s = {"L$0", "L$0"})
/* loaded from: classes.dex */
public final class SessionMutex$withSessionCancellingPrevious$2 extends SuspendLambda implements InterfaceC6473e {
    final /* synthetic */ AtomicReference<SessionMutex.Session<T>> $arg0;
    final /* synthetic */ InterfaceC6473e $session;
    final /* synthetic */ InterfaceC6471c $sessionInitializer;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionMutex$withSessionCancellingPrevious$2(InterfaceC6471c interfaceC6471c, AtomicReference<SessionMutex.Session<T>> atomicReference, InterfaceC6473e interfaceC6473e, InterfaceC5631c<? super SessionMutex$withSessionCancellingPrevious$2> interfaceC5631c) {
        super(2, interfaceC5631c);
        this.$sessionInitializer = interfaceC6471c;
        this.$arg0 = atomicReference;
        this.$session = interfaceC6473e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
        SessionMutex$withSessionCancellingPrevious$2 sessionMutex$withSessionCancellingPrevious$2 = new SessionMutex$withSessionCancellingPrevious$2(this.$sessionInitializer, this.$arg0, this.$session, interfaceC5631c);
        sessionMutex$withSessionCancellingPrevious$2.L$0 = obj;
        return sessionMutex$withSessionCancellingPrevious$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        SessionMutex.Session session;
        InterfaceC6013w0 job;
        SessionMutex.Session session2;
        AtomicReference<SessionMutex.Session<T>> atomicReference;
        AtomicReference<SessionMutex.Session<T>> atomicReference2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                AbstractC5774b.m5119b(obj);
                InterfaceC6009v interfaceC6009v = (InterfaceC6009v) this.L$0;
                session = new SessionMutex.Session(AbstractC6014x.m5643n(interfaceC6009v.getCoroutineContext()), this.$sessionInitializer.invoke(interfaceC6009v));
                SessionMutex.Session session3 = (SessionMutex.Session) this.$arg0.getAndSet(session);
                if (session3 != null && (job = session3.getJob()) != null) {
                    this.L$0 = session;
                    this.label = 1;
                    if (AbstractC6014x.m5636g(job, this) != coroutineSingletons) {
                    }
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    session2 = (SessionMutex.Session) this.L$0;
                    try {
                        AbstractC5774b.m5119b(obj);
                        atomicReference2 = this.$arg0;
                        while (!atomicReference2.compareAndSet(session2, null) && atomicReference2.get() == session2) {
                        }
                        return obj;
                    } catch (Throwable th) {
                        th = th;
                        atomicReference = this.$arg0;
                        while (!atomicReference.compareAndSet(session2, null) && atomicReference.get() == session2) {
                        }
                        throw th;
                    }
                }
                session = (SessionMutex.Session) this.L$0;
                AbstractC5774b.m5119b(obj);
            }
            InterfaceC6473e interfaceC6473e = this.$session;
            Object value = session.getValue();
            this.L$0 = session;
            this.label = 2;
            obj = interfaceC6473e.invoke(value, this);
            if (obj != coroutineSingletons) {
                session2 = session;
                atomicReference2 = this.$arg0;
                while (!atomicReference2.compareAndSet(session2, null)) {
                }
                return obj;
            }
            return coroutineSingletons;
        } catch (Throwable th2) {
            th = th2;
            session2 = session;
            atomicReference = this.$arg0;
            while (!atomicReference.compareAndSet(session2, null)) {
            }
            throw th;
        }
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super R> interfaceC5631c) {
        return ((SessionMutex$withSessionCancellingPrevious$2) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }
}
