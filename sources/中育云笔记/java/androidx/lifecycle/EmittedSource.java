package androidx.lifecycle;

import androidx.annotation.MainThread;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9979u;
import kotlinx.coroutines.AbstractC10006d;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.AbstractC11109f;
import sd.AbstractC11117h;
import sd.C11157r0;
import sd.InterfaceC11122i0;
import sd.InterfaceC11163t0;
import vc.InterfaceC11588c;

/* loaded from: classes2.dex */
public final class EmittedSource implements InterfaceC11163t0 {
    private boolean disposed;
    private final MediatorLiveData<?> mediator;
    private final LiveData<?> source;

    @InterfaceC11829d(m26210c = "androidx.lifecycle.EmittedSource$dispose$1", m26211f = "CoroutineLiveData.kt", m26212l = {}, m26213m = "invokeSuspend")
    /* renamed from: androidx.lifecycle.EmittedSource$dispose$1 */
    public static final class C39081 extends SuspendLambda implements InterfaceC9544p {
        int label;

        public C39081(InterfaceC11588c<? super C39081> interfaceC11588c) {
            super(2, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            return EmittedSource.this.new C39081(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC11725a.m25952f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
            EmittedSource.this.removeSource();
            return C10786q.f26013a;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C39081) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.lifecycle.EmittedSource$disposeNow$2", m26211f = "CoroutineLiveData.kt", m26212l = {}, m26213m = "invokeSuspend")
    /* renamed from: androidx.lifecycle.EmittedSource$disposeNow$2 */
    public static final class C39092 extends SuspendLambda implements InterfaceC9544p {
        int label;

        public C39092(InterfaceC11588c<? super C39092> interfaceC11588c) {
            super(2, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            return EmittedSource.this.new C39092(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC11725a.m25952f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
            EmittedSource.this.removeSource();
            return C10786q.f26013a;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C39092) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    public EmittedSource(LiveData<?> source, MediatorLiveData<?> mediator) {
        AbstractC9979u.m20294g(source, "source");
        AbstractC9979u.m20294g(mediator, "mediator");
        this.source = source;
        this.mediator = mediator;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @MainThread
    public final void removeSource() {
        if (this.disposed) {
            return;
        }
        this.mediator.removeSource(this.source);
        this.disposed = true;
    }

    @Override // sd.InterfaceC11163t0
    public void dispose() {
        AbstractC11117h.m24726d(AbstractC10006d.m20744a(C11157r0.m24800c().mo25209k()), null, null, new C39081(null), 3, null);
    }

    public final Object disposeNow(InterfaceC11588c<? super C10786q> interfaceC11588c) {
        Object objM24709g = AbstractC11109f.m24709g(C11157r0.m24800c().mo25209k(), new C39092(null), interfaceC11588c);
        return objM24709g == AbstractC11725a.m25952f() ? objM24709g : C10786q.f26013a;
    }
}
