package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import kotlin.AbstractC9079b;
import kotlin.coroutines.InterfaceC9100d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9133u;
import kotlinx.coroutines.JobKt__JobKt;
import p123h7.C8736p;
import p135i8.AbstractC8839h;
import p135i8.C8843i0;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

/* loaded from: classes3.dex */
public final class LifecycleCoroutineScopeImpl extends LifecycleCoroutineScope implements LifecycleEventObserver {
    private final InterfaceC9100d coroutineContext;
    private final Lifecycle lifecycle;

    @InterfaceC9539d(m17800c = "androidx.lifecycle.LifecycleCoroutineScopeImpl$register$1", m17801f = "Lifecycle.kt", m17802l = {}, m17803m = "invokeSuspend")
    /* renamed from: androidx.lifecycle.LifecycleCoroutineScopeImpl$register$1 */
    public static final class C40431 extends SuspendLambda implements InterfaceC10574p {
        private /* synthetic */ Object L$0;
        int label;

        public C40431(InterfaceC9324c<? super C40431> interfaceC9324c) {
            super(2, interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            C40431 c40431 = LifecycleCoroutineScopeImpl.this.new C40431(interfaceC9324c);
            c40431.L$0 = obj;
            return c40431;
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C40431) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC9434a.m17291f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
            InterfaceC8822b0 interfaceC8822b0 = (InterfaceC8822b0) this.L$0;
            if (LifecycleCoroutineScopeImpl.this.getLifecycle$lifecycle_common().getCurrentState().compareTo(Lifecycle.State.INITIALIZED) >= 0) {
                LifecycleCoroutineScopeImpl.this.getLifecycle$lifecycle_common().addObserver(LifecycleCoroutineScopeImpl.this);
            } else {
                JobKt__JobKt.m16236e(interfaceC8822b0.getCoroutineContext(), null, 1, null);
            }
            return C8736p.f16368a;
        }
    }

    public LifecycleCoroutineScopeImpl(Lifecycle lifecycle, InterfaceC9100d coroutineContext) {
        AbstractC9133u.m16133g(lifecycle, "lifecycle");
        AbstractC9133u.m16133g(coroutineContext, "coroutineContext");
        this.lifecycle = lifecycle;
        this.coroutineContext = coroutineContext;
        if (getLifecycle$lifecycle_common().getCurrentState() == Lifecycle.State.DESTROYED) {
            JobKt__JobKt.m16236e(getCoroutineContext(), null, 1, null);
        }
    }

    @Override // androidx.lifecycle.LifecycleCoroutineScope, p135i8.InterfaceC8822b0
    public InterfaceC9100d getCoroutineContext() {
        return this.coroutineContext;
    }

    @Override // androidx.lifecycle.LifecycleCoroutineScope
    public Lifecycle getLifecycle$lifecycle_common() {
        return this.lifecycle;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
        AbstractC9133u.m16133g(source, "source");
        AbstractC9133u.m16133g(event, "event");
        if (getLifecycle$lifecycle_common().getCurrentState().compareTo(Lifecycle.State.DESTROYED) <= 0) {
            getLifecycle$lifecycle_common().removeObserver(this);
            JobKt__JobKt.m16236e(getCoroutineContext(), null, 1, null);
        }
    }

    public final void register() {
        AbstractC8839h.m14861d(this, C8843i0.m14868c().mo15693o(), null, new C40431(null), 2, null);
    }
}
