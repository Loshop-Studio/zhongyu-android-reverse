package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import kotlin.AbstractC9924b;
import kotlin.Result;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.internal.AbstractC9977s;
import kotlin.jvm.internal.AbstractC9979u;
import kotlinx.coroutines.C9997c;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.AbstractC11831f;
import sd.AbstractC11106e0;
import sd.AbstractC11164t1;
import sd.C11157r0;
import sd.InterfaceC11125j;
import vc.InterfaceC11588c;

/* loaded from: classes2.dex */
public final class WithLifecycleStateKt {

    /* renamed from: androidx.lifecycle.WithLifecycleStateKt$withStateAtLeastUnchecked$2 */
    public static final class C39272 implements InterfaceC9529a {
        final /* synthetic */ InterfaceC9529a $block;

        public C39272(InterfaceC9529a interfaceC9529a) {
            this.$block = interfaceC9529a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [R, java.lang.Object] */
        @Override // p181hd.InterfaceC9529a
        public final R invoke() {
            return this.$block.invoke();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.lifecycle.LifecycleObserver, androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1] */
    public static final <R> Object suspendWithStateAtLeastUnchecked(final Lifecycle lifecycle, final Lifecycle.State state, boolean z10, final AbstractC11106e0 abstractC11106e0, final InterfaceC9529a interfaceC9529a, InterfaceC11588c<? super R> interfaceC11588c) {
        final C9997c c9997c = new C9997c(IntrinsicsKt__IntrinsicsJvmKt.m20224d(interfaceC11588c), 1);
        c9997c.m20503F();
        final ?? r12 = new LifecycleEventObserver() { // from class: androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
                Object objM20054c;
                AbstractC9979u.m20294g(source, "source");
                AbstractC9979u.m20294g(event, "event");
                if (event != Lifecycle.Event.Companion.upTo(state)) {
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        lifecycle.removeObserver(this);
                        InterfaceC11125j interfaceC11125j = c9997c;
                        Result.C9921a c9921a = Result.f23263d;
                        interfaceC11125j.resumeWith(Result.m20054c(AbstractC9924b.m20070a(new LifecycleDestroyedException())));
                        return;
                    }
                    return;
                }
                lifecycle.removeObserver(this);
                InterfaceC11125j interfaceC11125j2 = c9997c;
                InterfaceC9529a interfaceC9529a2 = interfaceC9529a;
                try {
                    Result.C9921a c9921a2 = Result.f23263d;
                    objM20054c = Result.m20054c(interfaceC9529a2.invoke());
                } catch (Throwable th) {
                    Result.C9921a c9921a3 = Result.f23263d;
                    objM20054c = Result.m20054c(AbstractC9924b.m20070a(th));
                }
                interfaceC11125j2.resumeWith(objM20054c);
            }
        };
        if (z10) {
            abstractC11106e0.dispatch(EmptyCoroutineContext.f23351c, new Runnable() { // from class: androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$1
                @Override // java.lang.Runnable
                public final void run() {
                    lifecycle.addObserver(r12);
                }
            });
        } else {
            lifecycle.addObserver(r12);
        }
        c9997c.mo20536u(new InterfaceC9540l() { // from class: androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$2
            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C10786q.f26013a;
            }

            public final void invoke(Throwable th) {
                AbstractC11106e0 abstractC11106e02 = abstractC11106e0;
                EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.f23351c;
                if (!abstractC11106e02.isDispatchNeeded(emptyCoroutineContext)) {
                    lifecycle.removeObserver(r12);
                    return;
                }
                AbstractC11106e0 abstractC11106e03 = abstractC11106e0;
                final Lifecycle lifecycle2 = lifecycle;
                final C3926xfdb59cc4 c3926xfdb59cc4 = r12;
                abstractC11106e03.dispatch(emptyCoroutineContext, new Runnable() { // from class: androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$2.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        lifecycle2.removeObserver(c3926xfdb59cc4);
                    }
                });
            }
        });
        Object objM20538x = c9997c.m20538x();
        if (objM20538x == AbstractC11725a.m25952f()) {
            AbstractC11831f.m26221c(interfaceC11588c);
        }
        return objM20538x;
    }

    public static final <R> Object withCreated(Lifecycle lifecycle, InterfaceC9529a interfaceC9529a, InterfaceC11588c<? super R> interfaceC11588c) {
        Lifecycle.State state = Lifecycle.State.CREATED;
        AbstractC11164t1 abstractC11164t1Mo25209k = C11157r0.m24800c().mo25209k();
        boolean zIsDispatchNeeded = abstractC11164t1Mo25209k.isDispatchNeeded(interfaceC11588c.getContext());
        if (!zIsDispatchNeeded) {
            if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                throw new LifecycleDestroyedException();
            }
            if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                return interfaceC9529a.invoke();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, zIsDispatchNeeded, abstractC11164t1Mo25209k, new C39272(interfaceC9529a), interfaceC11588c);
    }

    private static final <R> Object withCreated$$forInline(Lifecycle lifecycle, InterfaceC9529a interfaceC9529a, InterfaceC11588c<? super R> interfaceC11588c) {
        Lifecycle.State state = Lifecycle.State.DESTROYED;
        C11157r0.m24800c().mo25209k();
        AbstractC9977s.m20287c(3);
        throw null;
    }

    public static final <R> Object withResumed(Lifecycle lifecycle, InterfaceC9529a interfaceC9529a, InterfaceC11588c<? super R> interfaceC11588c) {
        Lifecycle.State state = Lifecycle.State.RESUMED;
        AbstractC11164t1 abstractC11164t1Mo25209k = C11157r0.m24800c().mo25209k();
        boolean zIsDispatchNeeded = abstractC11164t1Mo25209k.isDispatchNeeded(interfaceC11588c.getContext());
        if (!zIsDispatchNeeded) {
            if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                throw new LifecycleDestroyedException();
            }
            if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                return interfaceC9529a.invoke();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, zIsDispatchNeeded, abstractC11164t1Mo25209k, new C39272(interfaceC9529a), interfaceC11588c);
    }

    private static final <R> Object withResumed$$forInline(Lifecycle lifecycle, InterfaceC9529a interfaceC9529a, InterfaceC11588c<? super R> interfaceC11588c) {
        Lifecycle.State state = Lifecycle.State.DESTROYED;
        C11157r0.m24800c().mo25209k();
        AbstractC9977s.m20287c(3);
        throw null;
    }

    public static final <R> Object withStarted(Lifecycle lifecycle, InterfaceC9529a interfaceC9529a, InterfaceC11588c<? super R> interfaceC11588c) {
        Lifecycle.State state = Lifecycle.State.STARTED;
        AbstractC11164t1 abstractC11164t1Mo25209k = C11157r0.m24800c().mo25209k();
        boolean zIsDispatchNeeded = abstractC11164t1Mo25209k.isDispatchNeeded(interfaceC11588c.getContext());
        if (!zIsDispatchNeeded) {
            if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                throw new LifecycleDestroyedException();
            }
            if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                return interfaceC9529a.invoke();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, zIsDispatchNeeded, abstractC11164t1Mo25209k, new C39272(interfaceC9529a), interfaceC11588c);
    }

    private static final <R> Object withStarted$$forInline(Lifecycle lifecycle, InterfaceC9529a interfaceC9529a, InterfaceC11588c<? super R> interfaceC11588c) {
        Lifecycle.State state = Lifecycle.State.DESTROYED;
        C11157r0.m24800c().mo25209k();
        AbstractC9977s.m20287c(3);
        throw null;
    }

    public static final <R> Object withStateAtLeast(Lifecycle lifecycle, Lifecycle.State state, InterfaceC9529a interfaceC9529a, InterfaceC11588c<? super R> interfaceC11588c) {
        if (state.compareTo(Lifecycle.State.CREATED) < 0) {
            throw new IllegalArgumentException(("target state must be CREATED or greater, found " + state).toString());
        }
        AbstractC11164t1 abstractC11164t1Mo25209k = C11157r0.m24800c().mo25209k();
        boolean zIsDispatchNeeded = abstractC11164t1Mo25209k.isDispatchNeeded(interfaceC11588c.getContext());
        if (!zIsDispatchNeeded) {
            if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                throw new LifecycleDestroyedException();
            }
            if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                return interfaceC9529a.invoke();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, zIsDispatchNeeded, abstractC11164t1Mo25209k, new C39272(interfaceC9529a), interfaceC11588c);
    }

    private static final <R> Object withStateAtLeast$$forInline(Lifecycle lifecycle, Lifecycle.State state, InterfaceC9529a interfaceC9529a, InterfaceC11588c<? super R> interfaceC11588c) {
        if (state.compareTo(Lifecycle.State.CREATED) >= 0) {
            C11157r0.m24800c().mo25209k();
            AbstractC9977s.m20287c(3);
            throw null;
        }
        throw new IllegalArgumentException(("target state must be CREATED or greater, found " + state).toString());
    }

    public static final <R> Object withStateAtLeastUnchecked(Lifecycle lifecycle, Lifecycle.State state, InterfaceC9529a interfaceC9529a, InterfaceC11588c<? super R> interfaceC11588c) {
        AbstractC11164t1 abstractC11164t1Mo25209k = C11157r0.m24800c().mo25209k();
        boolean zIsDispatchNeeded = abstractC11164t1Mo25209k.isDispatchNeeded(interfaceC11588c.getContext());
        if (!zIsDispatchNeeded) {
            if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                throw new LifecycleDestroyedException();
            }
            if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                return interfaceC9529a.invoke();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, zIsDispatchNeeded, abstractC11164t1Mo25209k, new C39272(interfaceC9529a), interfaceC11588c);
    }

    private static final <R> Object withStateAtLeastUnchecked$$forInline(Lifecycle lifecycle, Lifecycle.State state, InterfaceC9529a interfaceC9529a, InterfaceC11588c<? super R> interfaceC11588c) {
        C11157r0.m24800c().mo25209k();
        AbstractC9977s.m20287c(3);
        throw null;
    }

    private static final <R> Object withCreated$$forInline(LifecycleOwner lifecycleOwner, InterfaceC9529a interfaceC9529a, InterfaceC11588c<? super R> interfaceC11588c) {
        lifecycleOwner.getLifecycle();
        Lifecycle.State state = Lifecycle.State.DESTROYED;
        C11157r0.m24800c().mo25209k();
        AbstractC9977s.m20287c(3);
        throw null;
    }

    private static final <R> Object withResumed$$forInline(LifecycleOwner lifecycleOwner, InterfaceC9529a interfaceC9529a, InterfaceC11588c<? super R> interfaceC11588c) {
        lifecycleOwner.getLifecycle();
        Lifecycle.State state = Lifecycle.State.DESTROYED;
        C11157r0.m24800c().mo25209k();
        AbstractC9977s.m20287c(3);
        throw null;
    }

    private static final <R> Object withStarted$$forInline(LifecycleOwner lifecycleOwner, InterfaceC9529a interfaceC9529a, InterfaceC11588c<? super R> interfaceC11588c) {
        lifecycleOwner.getLifecycle();
        Lifecycle.State state = Lifecycle.State.DESTROYED;
        C11157r0.m24800c().mo25209k();
        AbstractC9977s.m20287c(3);
        throw null;
    }

    private static final <R> Object withStateAtLeast$$forInline(LifecycleOwner lifecycleOwner, Lifecycle.State state, InterfaceC9529a interfaceC9529a, InterfaceC11588c<? super R> interfaceC11588c) {
        lifecycleOwner.getLifecycle();
        if (state.compareTo(Lifecycle.State.CREATED) >= 0) {
            C11157r0.m24800c().mo25209k();
            AbstractC9977s.m20287c(3);
            throw null;
        }
        throw new IllegalArgumentException(("target state must be CREATED or greater, found " + state).toString());
    }

    public static final <R> Object withCreated(LifecycleOwner lifecycleOwner, InterfaceC9529a interfaceC9529a, InterfaceC11588c<? super R> interfaceC11588c) {
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        Lifecycle.State state = Lifecycle.State.CREATED;
        AbstractC11164t1 abstractC11164t1Mo25209k = C11157r0.m24800c().mo25209k();
        boolean zIsDispatchNeeded = abstractC11164t1Mo25209k.isDispatchNeeded(interfaceC11588c.getContext());
        if (!zIsDispatchNeeded) {
            if (lifecycle.getCurrentState() != Lifecycle.State.DESTROYED) {
                if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                    return interfaceC9529a.invoke();
                }
            } else {
                throw new LifecycleDestroyedException();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, zIsDispatchNeeded, abstractC11164t1Mo25209k, new C39272(interfaceC9529a), interfaceC11588c);
    }

    public static final <R> Object withResumed(LifecycleOwner lifecycleOwner, InterfaceC9529a interfaceC9529a, InterfaceC11588c<? super R> interfaceC11588c) {
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        Lifecycle.State state = Lifecycle.State.RESUMED;
        AbstractC11164t1 abstractC11164t1Mo25209k = C11157r0.m24800c().mo25209k();
        boolean zIsDispatchNeeded = abstractC11164t1Mo25209k.isDispatchNeeded(interfaceC11588c.getContext());
        if (!zIsDispatchNeeded) {
            if (lifecycle.getCurrentState() != Lifecycle.State.DESTROYED) {
                if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                    return interfaceC9529a.invoke();
                }
            } else {
                throw new LifecycleDestroyedException();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, zIsDispatchNeeded, abstractC11164t1Mo25209k, new C39272(interfaceC9529a), interfaceC11588c);
    }

    public static final <R> Object withStarted(LifecycleOwner lifecycleOwner, InterfaceC9529a interfaceC9529a, InterfaceC11588c<? super R> interfaceC11588c) {
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        Lifecycle.State state = Lifecycle.State.STARTED;
        AbstractC11164t1 abstractC11164t1Mo25209k = C11157r0.m24800c().mo25209k();
        boolean zIsDispatchNeeded = abstractC11164t1Mo25209k.isDispatchNeeded(interfaceC11588c.getContext());
        if (!zIsDispatchNeeded) {
            if (lifecycle.getCurrentState() != Lifecycle.State.DESTROYED) {
                if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                    return interfaceC9529a.invoke();
                }
            } else {
                throw new LifecycleDestroyedException();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, zIsDispatchNeeded, abstractC11164t1Mo25209k, new C39272(interfaceC9529a), interfaceC11588c);
    }

    public static final <R> Object withStateAtLeast(LifecycleOwner lifecycleOwner, Lifecycle.State state, InterfaceC9529a interfaceC9529a, InterfaceC11588c<? super R> interfaceC11588c) {
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        if (state.compareTo(Lifecycle.State.CREATED) >= 0) {
            AbstractC11164t1 abstractC11164t1Mo25209k = C11157r0.m24800c().mo25209k();
            boolean zIsDispatchNeeded = abstractC11164t1Mo25209k.isDispatchNeeded(interfaceC11588c.getContext());
            if (!zIsDispatchNeeded) {
                if (lifecycle.getCurrentState() != Lifecycle.State.DESTROYED) {
                    if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                        return interfaceC9529a.invoke();
                    }
                } else {
                    throw new LifecycleDestroyedException();
                }
            }
            return suspendWithStateAtLeastUnchecked(lifecycle, state, zIsDispatchNeeded, abstractC11164t1Mo25209k, new C39272(interfaceC9529a), interfaceC11588c);
        }
        throw new IllegalArgumentException(("target state must be CREATED or greater, found " + state).toString());
    }
}
