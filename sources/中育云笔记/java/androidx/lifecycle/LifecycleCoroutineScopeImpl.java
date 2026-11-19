package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import kotlin.AbstractC9924b;
import kotlin.coroutines.InterfaceC9945d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9979u;
import kotlinx.coroutines.JobKt__JobKt;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.AbstractC11117h;
import sd.C11157r0;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

/* loaded from: classes2.dex */
public final class LifecycleCoroutineScopeImpl extends LifecycleCoroutineScope implements LifecycleEventObserver {
    private final InterfaceC9945d coroutineContext;
    private final Lifecycle lifecycle;

    @InterfaceC11829d(m26210c = "androidx.lifecycle.LifecycleCoroutineScopeImpl$register$1", m26211f = "Lifecycle.kt", m26212l = {}, m26213m = "invokeSuspend")
    /* renamed from: androidx.lifecycle.LifecycleCoroutineScopeImpl$register$1 */
    public static final class C39171 extends SuspendLambda implements InterfaceC9544p {
        private /* synthetic */ Object L$0;
        int label;

        public C39171(InterfaceC11588c<? super C39171> interfaceC11588c) {
            super(2, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            C39171 c39171 = LifecycleCoroutineScopeImpl.this.new C39171(interfaceC11588c);
            c39171.L$0 = obj;
            return c39171;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC11725a.m25952f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
            InterfaceC11122i0 interfaceC11122i0 = (InterfaceC11122i0) this.L$0;
            if (LifecycleCoroutineScopeImpl.this.getLifecycle$lifecycle_common().getCurrentState().compareTo(Lifecycle.State.INITIALIZED) >= 0) {
                LifecycleCoroutineScopeImpl.this.getLifecycle$lifecycle_common().addObserver(LifecycleCoroutineScopeImpl.this);
            } else {
                JobKt__JobKt.m20388e(interfaceC11122i0.getCoroutineContext(), null, 1, null);
            }
            return C10786q.f26013a;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C39171) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    public LifecycleCoroutineScopeImpl(Lifecycle lifecycle, InterfaceC9945d coroutineContext) {
        AbstractC9979u.m20294g(lifecycle, "lifecycle");
        AbstractC9979u.m20294g(coroutineContext, "coroutineContext");
        this.lifecycle = lifecycle;
        this.coroutineContext = coroutineContext;
        if (getLifecycle$lifecycle_common().getCurrentState() == Lifecycle.State.DESTROYED) {
            JobKt__JobKt.m20388e(getCoroutineContext(), null, 1, null);
        }
    }

    @Override // androidx.lifecycle.LifecycleCoroutineScope, sd.InterfaceC11122i0
    public InterfaceC9945d getCoroutineContext() {
        return this.coroutineContext;
    }

    @Override // androidx.lifecycle.LifecycleCoroutineScope
    public Lifecycle getLifecycle$lifecycle_common() {
        return this.lifecycle;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
        AbstractC9979u.m20294g(source, "source");
        AbstractC9979u.m20294g(event, "event");
        if (getLifecycle$lifecycle_common().getCurrentState().compareTo(Lifecycle.State.DESTROYED) <= 0) {
            getLifecycle$lifecycle_common().removeObserver(this);
            JobKt__JobKt.m20388e(getCoroutineContext(), null, 1, null);
        }
    }

    public final void register() {
        AbstractC11117h.m24726d(this, C11157r0.m24800c().mo25209k(), null, new C39171(null), 2, null);
    }
}
