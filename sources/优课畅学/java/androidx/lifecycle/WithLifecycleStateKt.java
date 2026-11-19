package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import kotlin.AbstractC9079b;
import kotlin.Result;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.internal.AbstractC9131s;
import kotlin.jvm.internal.AbstractC9133u;
import kotlinx.coroutines.C9155c;
import kotlinx.coroutines.CoroutineDispatcher;
import p123h7.C8736p;
import p135i8.AbstractC8841h1;
import p135i8.C8843i0;
import p135i8.InterfaceC8845j;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.AbstractC9541f;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;

/* loaded from: classes3.dex */
public final class WithLifecycleStateKt {

    /* renamed from: androidx.lifecycle.WithLifecycleStateKt$withStateAtLeastUnchecked$2 */
    public static final class C40532 implements InterfaceC10559a {
        final /* synthetic */ InterfaceC10559a $block;

        public C40532(InterfaceC10559a interfaceC10559a) {
            this.$block = interfaceC10559a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [R, java.lang.Object] */
        @Override // p300x7.InterfaceC10559a
        public final R invoke() {
            return this.$block.invoke();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.lifecycle.LifecycleObserver, androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1] */
    public static final <R> Object suspendWithStateAtLeastUnchecked(final Lifecycle lifecycle, final Lifecycle.State state, boolean z10, final CoroutineDispatcher coroutineDispatcher, final InterfaceC10559a interfaceC10559a, InterfaceC9324c<? super R> interfaceC9324c) {
        final C9155c c9155c = new C9155c(IntrinsicsKt__IntrinsicsJvmKt.m16079d(interfaceC9324c), 1);
        c9155c.m16343D();
        final ?? r12 = new LifecycleEventObserver() { // from class: androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
                Object objM15909b;
                AbstractC9133u.m16133g(source, "source");
                AbstractC9133u.m16133g(event, "event");
                if (event != Lifecycle.Event.Companion.upTo(state)) {
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        lifecycle.removeObserver(this);
                        InterfaceC8845j interfaceC8845j = c9155c;
                        Result.C9076a c9076a = Result.f17350b;
                        interfaceC8845j.resumeWith(Result.m15909b(AbstractC9079b.m15925a(new LifecycleDestroyedException())));
                        return;
                    }
                    return;
                }
                lifecycle.removeObserver(this);
                InterfaceC8845j interfaceC8845j2 = c9155c;
                InterfaceC10559a interfaceC10559a2 = interfaceC10559a;
                try {
                    Result.C9076a c9076a2 = Result.f17350b;
                    objM15909b = Result.m15909b(interfaceC10559a2.invoke());
                } catch (Throwable th) {
                    Result.C9076a c9076a3 = Result.f17350b;
                    objM15909b = Result.m15909b(AbstractC9079b.m15925a(th));
                }
                interfaceC8845j2.resumeWith(objM15909b);
            }
        };
        if (z10) {
            coroutineDispatcher.dispatch(EmptyCoroutineContext.f17438a, new Runnable() { // from class: androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$1
                @Override // java.lang.Runnable
                public final void run() {
                    lifecycle.addObserver(r12);
                }
            });
        } else {
            lifecycle.addObserver(r12);
        }
        c9155c.mo14873r(new InterfaceC10570l() { // from class: androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$2
            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C8736p.f16368a;
            }

            public final void invoke(Throwable th) {
                CoroutineDispatcher coroutineDispatcher2 = coroutineDispatcher;
                EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.f17438a;
                if (!coroutineDispatcher2.isDispatchNeeded(emptyCoroutineContext)) {
                    lifecycle.removeObserver(r12);
                    return;
                }
                CoroutineDispatcher coroutineDispatcher3 = coroutineDispatcher;
                final Lifecycle lifecycle2 = lifecycle;
                final C4052xfdb59cc4 c4052xfdb59cc4 = r12;
                coroutineDispatcher3.dispatch(emptyCoroutineContext, new Runnable() { // from class: androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$2.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        lifecycle2.removeObserver(c4052xfdb59cc4);
                    }
                });
            }
        });
        Object objM16372x = c9155c.m16372x();
        if (objM16372x == AbstractC9434a.m17291f()) {
            AbstractC9541f.m17811c(interfaceC9324c);
        }
        return objM16372x;
    }

    public static final <R> Object withCreated(Lifecycle lifecycle, InterfaceC10559a interfaceC10559a, InterfaceC9324c<? super R> interfaceC9324c) {
        Lifecycle.State state = Lifecycle.State.CREATED;
        AbstractC8841h1 abstractC8841h1Mo15693o = C8843i0.m14868c().mo15693o();
        boolean zIsDispatchNeeded = abstractC8841h1Mo15693o.isDispatchNeeded(interfaceC9324c.getContext());
        if (!zIsDispatchNeeded) {
            if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                throw new LifecycleDestroyedException();
            }
            if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                return interfaceC10559a.invoke();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, zIsDispatchNeeded, abstractC8841h1Mo15693o, new C40532(interfaceC10559a), interfaceC9324c);
    }

    private static final <R> Object withCreated$$forInline(Lifecycle lifecycle, InterfaceC10559a interfaceC10559a, InterfaceC9324c<? super R> interfaceC9324c) {
        Lifecycle.State state = Lifecycle.State.DESTROYED;
        C8843i0.m14868c().mo15693o();
        AbstractC9131s.m16126c(3);
        throw null;
    }

    public static final <R> Object withResumed(Lifecycle lifecycle, InterfaceC10559a interfaceC10559a, InterfaceC9324c<? super R> interfaceC9324c) {
        Lifecycle.State state = Lifecycle.State.RESUMED;
        AbstractC8841h1 abstractC8841h1Mo15693o = C8843i0.m14868c().mo15693o();
        boolean zIsDispatchNeeded = abstractC8841h1Mo15693o.isDispatchNeeded(interfaceC9324c.getContext());
        if (!zIsDispatchNeeded) {
            if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                throw new LifecycleDestroyedException();
            }
            if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                return interfaceC10559a.invoke();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, zIsDispatchNeeded, abstractC8841h1Mo15693o, new C40532(interfaceC10559a), interfaceC9324c);
    }

    private static final <R> Object withResumed$$forInline(Lifecycle lifecycle, InterfaceC10559a interfaceC10559a, InterfaceC9324c<? super R> interfaceC9324c) {
        Lifecycle.State state = Lifecycle.State.DESTROYED;
        C8843i0.m14868c().mo15693o();
        AbstractC9131s.m16126c(3);
        throw null;
    }

    public static final <R> Object withStarted(Lifecycle lifecycle, InterfaceC10559a interfaceC10559a, InterfaceC9324c<? super R> interfaceC9324c) {
        Lifecycle.State state = Lifecycle.State.STARTED;
        AbstractC8841h1 abstractC8841h1Mo15693o = C8843i0.m14868c().mo15693o();
        boolean zIsDispatchNeeded = abstractC8841h1Mo15693o.isDispatchNeeded(interfaceC9324c.getContext());
        if (!zIsDispatchNeeded) {
            if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                throw new LifecycleDestroyedException();
            }
            if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                return interfaceC10559a.invoke();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, zIsDispatchNeeded, abstractC8841h1Mo15693o, new C40532(interfaceC10559a), interfaceC9324c);
    }

    private static final <R> Object withStarted$$forInline(Lifecycle lifecycle, InterfaceC10559a interfaceC10559a, InterfaceC9324c<? super R> interfaceC9324c) {
        Lifecycle.State state = Lifecycle.State.DESTROYED;
        C8843i0.m14868c().mo15693o();
        AbstractC9131s.m16126c(3);
        throw null;
    }

    public static final <R> Object withStateAtLeast(Lifecycle lifecycle, Lifecycle.State state, InterfaceC10559a interfaceC10559a, InterfaceC9324c<? super R> interfaceC9324c) {
        if (state.compareTo(Lifecycle.State.CREATED) < 0) {
            throw new IllegalArgumentException(("target state must be CREATED or greater, found " + state).toString());
        }
        AbstractC8841h1 abstractC8841h1Mo15693o = C8843i0.m14868c().mo15693o();
        boolean zIsDispatchNeeded = abstractC8841h1Mo15693o.isDispatchNeeded(interfaceC9324c.getContext());
        if (!zIsDispatchNeeded) {
            if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                throw new LifecycleDestroyedException();
            }
            if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                return interfaceC10559a.invoke();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, zIsDispatchNeeded, abstractC8841h1Mo15693o, new C40532(interfaceC10559a), interfaceC9324c);
    }

    private static final <R> Object withStateAtLeast$$forInline(Lifecycle lifecycle, Lifecycle.State state, InterfaceC10559a interfaceC10559a, InterfaceC9324c<? super R> interfaceC9324c) {
        if (state.compareTo(Lifecycle.State.CREATED) >= 0) {
            C8843i0.m14868c().mo15693o();
            AbstractC9131s.m16126c(3);
            throw null;
        }
        throw new IllegalArgumentException(("target state must be CREATED or greater, found " + state).toString());
    }

    public static final <R> Object withStateAtLeastUnchecked(Lifecycle lifecycle, Lifecycle.State state, InterfaceC10559a interfaceC10559a, InterfaceC9324c<? super R> interfaceC9324c) {
        AbstractC8841h1 abstractC8841h1Mo15693o = C8843i0.m14868c().mo15693o();
        boolean zIsDispatchNeeded = abstractC8841h1Mo15693o.isDispatchNeeded(interfaceC9324c.getContext());
        if (!zIsDispatchNeeded) {
            if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                throw new LifecycleDestroyedException();
            }
            if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                return interfaceC10559a.invoke();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, zIsDispatchNeeded, abstractC8841h1Mo15693o, new C40532(interfaceC10559a), interfaceC9324c);
    }

    private static final <R> Object withStateAtLeastUnchecked$$forInline(Lifecycle lifecycle, Lifecycle.State state, InterfaceC10559a interfaceC10559a, InterfaceC9324c<? super R> interfaceC9324c) {
        C8843i0.m14868c().mo15693o();
        AbstractC9131s.m16126c(3);
        throw null;
    }

    private static final <R> Object withCreated$$forInline(LifecycleOwner lifecycleOwner, InterfaceC10559a interfaceC10559a, InterfaceC9324c<? super R> interfaceC9324c) {
        lifecycleOwner.getLifecycle();
        Lifecycle.State state = Lifecycle.State.DESTROYED;
        C8843i0.m14868c().mo15693o();
        AbstractC9131s.m16126c(3);
        throw null;
    }

    private static final <R> Object withResumed$$forInline(LifecycleOwner lifecycleOwner, InterfaceC10559a interfaceC10559a, InterfaceC9324c<? super R> interfaceC9324c) {
        lifecycleOwner.getLifecycle();
        Lifecycle.State state = Lifecycle.State.DESTROYED;
        C8843i0.m14868c().mo15693o();
        AbstractC9131s.m16126c(3);
        throw null;
    }

    private static final <R> Object withStarted$$forInline(LifecycleOwner lifecycleOwner, InterfaceC10559a interfaceC10559a, InterfaceC9324c<? super R> interfaceC9324c) {
        lifecycleOwner.getLifecycle();
        Lifecycle.State state = Lifecycle.State.DESTROYED;
        C8843i0.m14868c().mo15693o();
        AbstractC9131s.m16126c(3);
        throw null;
    }

    private static final <R> Object withStateAtLeast$$forInline(LifecycleOwner lifecycleOwner, Lifecycle.State state, InterfaceC10559a interfaceC10559a, InterfaceC9324c<? super R> interfaceC9324c) {
        lifecycleOwner.getLifecycle();
        if (state.compareTo(Lifecycle.State.CREATED) >= 0) {
            C8843i0.m14868c().mo15693o();
            AbstractC9131s.m16126c(3);
            throw null;
        }
        throw new IllegalArgumentException(("target state must be CREATED or greater, found " + state).toString());
    }

    public static final <R> Object withCreated(LifecycleOwner lifecycleOwner, InterfaceC10559a interfaceC10559a, InterfaceC9324c<? super R> interfaceC9324c) {
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        Lifecycle.State state = Lifecycle.State.CREATED;
        AbstractC8841h1 abstractC8841h1Mo15693o = C8843i0.m14868c().mo15693o();
        boolean zIsDispatchNeeded = abstractC8841h1Mo15693o.isDispatchNeeded(interfaceC9324c.getContext());
        if (!zIsDispatchNeeded) {
            if (lifecycle.getCurrentState() != Lifecycle.State.DESTROYED) {
                if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                    return interfaceC10559a.invoke();
                }
            } else {
                throw new LifecycleDestroyedException();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, zIsDispatchNeeded, abstractC8841h1Mo15693o, new C40532(interfaceC10559a), interfaceC9324c);
    }

    public static final <R> Object withResumed(LifecycleOwner lifecycleOwner, InterfaceC10559a interfaceC10559a, InterfaceC9324c<? super R> interfaceC9324c) {
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        Lifecycle.State state = Lifecycle.State.RESUMED;
        AbstractC8841h1 abstractC8841h1Mo15693o = C8843i0.m14868c().mo15693o();
        boolean zIsDispatchNeeded = abstractC8841h1Mo15693o.isDispatchNeeded(interfaceC9324c.getContext());
        if (!zIsDispatchNeeded) {
            if (lifecycle.getCurrentState() != Lifecycle.State.DESTROYED) {
                if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                    return interfaceC10559a.invoke();
                }
            } else {
                throw new LifecycleDestroyedException();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, zIsDispatchNeeded, abstractC8841h1Mo15693o, new C40532(interfaceC10559a), interfaceC9324c);
    }

    public static final <R> Object withStarted(LifecycleOwner lifecycleOwner, InterfaceC10559a interfaceC10559a, InterfaceC9324c<? super R> interfaceC9324c) {
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        Lifecycle.State state = Lifecycle.State.STARTED;
        AbstractC8841h1 abstractC8841h1Mo15693o = C8843i0.m14868c().mo15693o();
        boolean zIsDispatchNeeded = abstractC8841h1Mo15693o.isDispatchNeeded(interfaceC9324c.getContext());
        if (!zIsDispatchNeeded) {
            if (lifecycle.getCurrentState() != Lifecycle.State.DESTROYED) {
                if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                    return interfaceC10559a.invoke();
                }
            } else {
                throw new LifecycleDestroyedException();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, zIsDispatchNeeded, abstractC8841h1Mo15693o, new C40532(interfaceC10559a), interfaceC9324c);
    }

    public static final <R> Object withStateAtLeast(LifecycleOwner lifecycleOwner, Lifecycle.State state, InterfaceC10559a interfaceC10559a, InterfaceC9324c<? super R> interfaceC9324c) {
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        if (state.compareTo(Lifecycle.State.CREATED) >= 0) {
            AbstractC8841h1 abstractC8841h1Mo15693o = C8843i0.m14868c().mo15693o();
            boolean zIsDispatchNeeded = abstractC8841h1Mo15693o.isDispatchNeeded(interfaceC9324c.getContext());
            if (!zIsDispatchNeeded) {
                if (lifecycle.getCurrentState() != Lifecycle.State.DESTROYED) {
                    if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                        return interfaceC10559a.invoke();
                    }
                } else {
                    throw new LifecycleDestroyedException();
                }
            }
            return suspendWithStateAtLeastUnchecked(lifecycle, state, zIsDispatchNeeded, abstractC8841h1Mo15693o, new C40532(interfaceC10559a), interfaceC9324c);
        }
        throw new IllegalArgumentException(("target state must be CREATED or greater, found " + state).toString());
    }
}
