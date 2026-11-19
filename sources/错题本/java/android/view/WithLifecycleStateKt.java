package android.view;

import android.view.Lifecycle;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Result;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AbstractC5896f0;
import kotlinx.coroutines.AbstractC5995r;
import kotlinx.coroutines.C5961g;
import kotlinx.coroutines.InterfaceC5895f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p046d7.C5447d;
import p054e7.AbstractC5479k;
import p068g7.C5609e;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p185v7.AbstractC6683l;

@Metadata(m5109d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a2\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u000e\b\u0004\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0086H¢\u0006\u0004\b\u0006\u0010\u0007\u001a*\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u000e\b\u0004\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0086H¢\u0006\u0004\b\b\u0010\t\u001a*\u0010\n\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u000e\b\u0004\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0086H¢\u0006\u0004\b\n\u0010\t\u001a*\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u000e\b\u0004\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0086H¢\u0006\u0004\b\u000b\u0010\t\u001a2\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u000e\b\u0004\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0086H¢\u0006\u0004\b\u0006\u0010\r\u001a*\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\f2\u000e\b\u0004\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0086H¢\u0006\u0004\b\b\u0010\u000e\u001a*\u0010\n\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\f2\u000e\b\u0004\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0086H¢\u0006\u0004\b\n\u0010\u000e\u001a*\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\f2\u000e\b\u0004\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0086H¢\u0006\u0004\b\u000b\u0010\u000e\u001a2\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u000e\b\u0004\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0081H¢\u0006\u0004\b\u000f\u0010\u0007\u001a@\u0010\u0014\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0081@¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m5110d2 = {"R", "Landroidx/lifecycle/Lifecycle;", "Landroidx/lifecycle/Lifecycle$State;", "state", "Lkotlin/Function0;", "block", "withStateAtLeast", "(Landroidx/lifecycle/Lifecycle;Landroidx/lifecycle/Lifecycle$State;Lr6/a;Lh6/c;)Ljava/lang/Object;", "withCreated", "(Landroidx/lifecycle/Lifecycle;Lr6/a;Lh6/c;)Ljava/lang/Object;", "withStarted", "withResumed", "Landroidx/lifecycle/LifecycleOwner;", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$State;Lr6/a;Lh6/c;)Ljava/lang/Object;", "(Landroidx/lifecycle/LifecycleOwner;Lr6/a;Lh6/c;)Ljava/lang/Object;", "withStateAtLeastUnchecked", "", "dispatchNeeded", "Lkotlinx/coroutines/r;", "lifecycleDispatcher", "suspendWithStateAtLeastUnchecked", "(Landroidx/lifecycle/Lifecycle;Landroidx/lifecycle/Lifecycle$State;ZLkotlinx/coroutines/r;Lr6/a;Lh6/c;)Ljava/lang/Object;", "lifecycle-runtime_release"}, m5111k = 2, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nWithLifecycleState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WithLifecycleState.kt\nandroidx/lifecycle/WithLifecycleStateKt\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,175:1\n127#1,8:176\n127#1,8:184\n127#1,8:192\n127#1,8:200\n43#1,5:208\n127#1,8:213\n43#1,5:221\n127#1,8:226\n127#1,8:234\n127#1,8:242\n127#1,8:250\n318#2,11:258\n*S KotlinDebug\n*F\n+ 1 WithLifecycleState.kt\nandroidx/lifecycle/WithLifecycleStateKt\n*L\n47#1:176,8\n57#1:184,8\n66#1:192,8\n75#1:200,8\n86#1:208,5\n86#1:213,8\n86#1:221,5\n86#1:226,8\n95#1:234,8\n104#1:242,8\n113#1:250,8\n148#1:258,11\n*E\n"})
/* loaded from: classes2.dex */
public final class WithLifecycleStateKt {

    @Metadata(m5111k = 3, m5112mv = {2, 0, 0}, m5114xi = 176)
    /* renamed from: androidx.lifecycle.WithLifecycleStateKt$withStateAtLeastUnchecked$2 */
    public static final class C27402 implements InterfaceC6469a {
        final /* synthetic */ InterfaceC6469a $block;

        public C27402(InterfaceC6469a interfaceC6469a) {
            this.$block = interfaceC6469a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [R, java.lang.Object] */
        @Override // p152r6.InterfaceC6469a
        public final R invoke() {
            return this.$block.invoke();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v2, types: [androidx.lifecycle.LifecycleObserver, androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1] */
    @PublishedApi
    @Nullable
    public static final <R> Object suspendWithStateAtLeastUnchecked(@NotNull final Lifecycle lifecycle, @NotNull final Lifecycle.State state, boolean z8, @NotNull final AbstractC5995r abstractC5995r, @NotNull final InterfaceC6469a interfaceC6469a, @NotNull InterfaceC5631c<? super R> interfaceC5631c) {
        final C5961g c5961g = new C5961g(1, AbstractC6683l.m6374n(interfaceC5631c));
        c5961g.m5584u();
        final ?? r72 = new LifecycleEventObserver() { // from class: androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1
            @Override // android.view.LifecycleEventObserver
            public void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
                Object objM13956constructorimpl;
                AbstractC5830k.m5330g(source, "source");
                AbstractC5830k.m5330g(event, "event");
                if (event != Lifecycle.Event.INSTANCE.upTo(state)) {
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        lifecycle.removeObserver(this);
                        c5961g.resumeWith(Result.m13956constructorimpl(AbstractC5774b.m5118a(new LifecycleDestroyedException())));
                        return;
                    }
                    return;
                }
                lifecycle.removeObserver(this);
                InterfaceC5895f interfaceC5895f = c5961g;
                try {
                    objM13956constructorimpl = Result.m13956constructorimpl(interfaceC6469a.invoke());
                } catch (Throwable th) {
                    objM13956constructorimpl = Result.m13956constructorimpl(AbstractC5774b.m5118a(th));
                }
                interfaceC5895f.resumeWith(objM13956constructorimpl);
            }
        };
        if (z8) {
            abstractC5995r.dispatch(EmptyCoroutineContext.INSTANCE, new Runnable() { // from class: androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$1
                @Override // java.lang.Runnable
                public final void run() {
                    lifecycle.addObserver(r72);
                }
            });
        } else {
            lifecycle.addObserver(r72);
        }
        c5961g.mo4966m(new InterfaceC6471c() { // from class: androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$2
            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C5443s.f8405a;
            }

            public final void invoke(Throwable th) {
                AbstractC5995r abstractC5995r2 = abstractC5995r;
                EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
                if (!abstractC5995r2.isDispatchNeeded(emptyCoroutineContext)) {
                    lifecycle.removeObserver(r72);
                    return;
                }
                AbstractC5995r abstractC5995r3 = abstractC5995r;
                final Lifecycle lifecycle2 = lifecycle;
                final C2739xfdb59cc4 c2739xfdb59cc4 = r72;
                abstractC5995r3.dispatch(emptyCoroutineContext, new Runnable() { // from class: androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$2.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        lifecycle2.removeObserver(c2739xfdb59cc4);
                    }
                });
            }
        });
        Object objM5583t = c5961g.m5583t();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return objM5583t;
    }

    @Nullable
    public static final <R> Object withCreated(@NotNull Lifecycle lifecycle, @NotNull InterfaceC6469a interfaceC6469a, @NotNull InterfaceC5631c<? super R> interfaceC5631c) {
        Lifecycle.State state = Lifecycle.State.CREATED;
        C5609e c5609e = AbstractC5896f0.f9343a;
        C5447d c5447d = AbstractC5479k.f8471a.f8411d;
        boolean zIsDispatchNeeded = c5447d.isDispatchNeeded(interfaceC5631c.getContext());
        if (!zIsDispatchNeeded) {
            if (lifecycle.getState() == Lifecycle.State.DESTROYED) {
                throw new LifecycleDestroyedException();
            }
            if (lifecycle.getState().compareTo(state) >= 0) {
                return interfaceC6469a.invoke();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, zIsDispatchNeeded, c5447d, new C27402(interfaceC6469a), interfaceC5631c);
    }

    private static final <R> Object withCreated$$forInline(Lifecycle lifecycle, InterfaceC6469a interfaceC6469a, InterfaceC5631c<? super R> interfaceC5631c) {
        Lifecycle.State state = Lifecycle.State.DESTROYED;
        C5609e c5609e = AbstractC5896f0.f9343a;
        C5447d c5447d = AbstractC5479k.f8471a.f8411d;
        throw null;
    }

    @Nullable
    public static final <R> Object withResumed(@NotNull Lifecycle lifecycle, @NotNull InterfaceC6469a interfaceC6469a, @NotNull InterfaceC5631c<? super R> interfaceC5631c) {
        Lifecycle.State state = Lifecycle.State.RESUMED;
        C5609e c5609e = AbstractC5896f0.f9343a;
        C5447d c5447d = AbstractC5479k.f8471a.f8411d;
        boolean zIsDispatchNeeded = c5447d.isDispatchNeeded(interfaceC5631c.getContext());
        if (!zIsDispatchNeeded) {
            if (lifecycle.getState() == Lifecycle.State.DESTROYED) {
                throw new LifecycleDestroyedException();
            }
            if (lifecycle.getState().compareTo(state) >= 0) {
                return interfaceC6469a.invoke();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, zIsDispatchNeeded, c5447d, new C27402(interfaceC6469a), interfaceC5631c);
    }

    private static final <R> Object withResumed$$forInline(Lifecycle lifecycle, InterfaceC6469a interfaceC6469a, InterfaceC5631c<? super R> interfaceC5631c) {
        Lifecycle.State state = Lifecycle.State.DESTROYED;
        C5609e c5609e = AbstractC5896f0.f9343a;
        C5447d c5447d = AbstractC5479k.f8471a.f8411d;
        throw null;
    }

    @Nullable
    public static final <R> Object withStarted(@NotNull Lifecycle lifecycle, @NotNull InterfaceC6469a interfaceC6469a, @NotNull InterfaceC5631c<? super R> interfaceC5631c) {
        Lifecycle.State state = Lifecycle.State.STARTED;
        C5609e c5609e = AbstractC5896f0.f9343a;
        C5447d c5447d = AbstractC5479k.f8471a.f8411d;
        boolean zIsDispatchNeeded = c5447d.isDispatchNeeded(interfaceC5631c.getContext());
        if (!zIsDispatchNeeded) {
            if (lifecycle.getState() == Lifecycle.State.DESTROYED) {
                throw new LifecycleDestroyedException();
            }
            if (lifecycle.getState().compareTo(state) >= 0) {
                return interfaceC6469a.invoke();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, zIsDispatchNeeded, c5447d, new C27402(interfaceC6469a), interfaceC5631c);
    }

    private static final <R> Object withStarted$$forInline(Lifecycle lifecycle, InterfaceC6469a interfaceC6469a, InterfaceC5631c<? super R> interfaceC5631c) {
        Lifecycle.State state = Lifecycle.State.DESTROYED;
        C5609e c5609e = AbstractC5896f0.f9343a;
        C5447d c5447d = AbstractC5479k.f8471a.f8411d;
        throw null;
    }

    @Nullable
    public static final <R> Object withStateAtLeast(@NotNull Lifecycle lifecycle, @NotNull Lifecycle.State state, @NotNull InterfaceC6469a interfaceC6469a, @NotNull InterfaceC5631c<? super R> interfaceC5631c) {
        if (state.compareTo(Lifecycle.State.CREATED) < 0) {
            throw new IllegalArgumentException(("target state must be CREATED or greater, found " + state).toString());
        }
        C5609e c5609e = AbstractC5896f0.f9343a;
        C5447d c5447d = AbstractC5479k.f8471a.f8411d;
        boolean zIsDispatchNeeded = c5447d.isDispatchNeeded(interfaceC5631c.getContext());
        if (!zIsDispatchNeeded) {
            if (lifecycle.getState() == Lifecycle.State.DESTROYED) {
                throw new LifecycleDestroyedException();
            }
            if (lifecycle.getState().compareTo(state) >= 0) {
                return interfaceC6469a.invoke();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, zIsDispatchNeeded, c5447d, new C27402(interfaceC6469a), interfaceC5631c);
    }

    private static final <R> Object withStateAtLeast$$forInline(Lifecycle lifecycle, Lifecycle.State state, InterfaceC6469a interfaceC6469a, InterfaceC5631c<? super R> interfaceC5631c) {
        if (state.compareTo(Lifecycle.State.CREATED) >= 0) {
            C5609e c5609e = AbstractC5896f0.f9343a;
            C5447d c5447d = AbstractC5479k.f8471a.f8411d;
            throw null;
        }
        throw new IllegalArgumentException(("target state must be CREATED or greater, found " + state).toString());
    }

    @PublishedApi
    @Nullable
    public static final <R> Object withStateAtLeastUnchecked(@NotNull Lifecycle lifecycle, @NotNull Lifecycle.State state, @NotNull InterfaceC6469a interfaceC6469a, @NotNull InterfaceC5631c<? super R> interfaceC5631c) {
        C5609e c5609e = AbstractC5896f0.f9343a;
        C5447d c5447d = AbstractC5479k.f8471a.f8411d;
        boolean zIsDispatchNeeded = c5447d.isDispatchNeeded(interfaceC5631c.getContext());
        if (!zIsDispatchNeeded) {
            if (lifecycle.getState() == Lifecycle.State.DESTROYED) {
                throw new LifecycleDestroyedException();
            }
            if (lifecycle.getState().compareTo(state) >= 0) {
                return interfaceC6469a.invoke();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, zIsDispatchNeeded, c5447d, new C27402(interfaceC6469a), interfaceC5631c);
    }

    @PublishedApi
    private static final <R> Object withStateAtLeastUnchecked$$forInline(Lifecycle lifecycle, Lifecycle.State state, InterfaceC6469a interfaceC6469a, InterfaceC5631c<? super R> interfaceC5631c) {
        C5609e c5609e = AbstractC5896f0.f9343a;
        C5447d c5447d = AbstractC5479k.f8471a.f8411d;
        throw null;
    }

    private static final <R> Object withCreated$$forInline(LifecycleOwner lifecycleOwner, InterfaceC6469a interfaceC6469a, InterfaceC5631c<? super R> interfaceC5631c) {
        lifecycleOwner.getLifecycle();
        Lifecycle.State state = Lifecycle.State.DESTROYED;
        C5609e c5609e = AbstractC5896f0.f9343a;
        C5447d c5447d = AbstractC5479k.f8471a.f8411d;
        throw null;
    }

    private static final <R> Object withResumed$$forInline(LifecycleOwner lifecycleOwner, InterfaceC6469a interfaceC6469a, InterfaceC5631c<? super R> interfaceC5631c) {
        lifecycleOwner.getLifecycle();
        Lifecycle.State state = Lifecycle.State.DESTROYED;
        C5609e c5609e = AbstractC5896f0.f9343a;
        C5447d c5447d = AbstractC5479k.f8471a.f8411d;
        throw null;
    }

    private static final <R> Object withStarted$$forInline(LifecycleOwner lifecycleOwner, InterfaceC6469a interfaceC6469a, InterfaceC5631c<? super R> interfaceC5631c) {
        lifecycleOwner.getLifecycle();
        Lifecycle.State state = Lifecycle.State.DESTROYED;
        C5609e c5609e = AbstractC5896f0.f9343a;
        C5447d c5447d = AbstractC5479k.f8471a.f8411d;
        throw null;
    }

    private static final <R> Object withStateAtLeast$$forInline(LifecycleOwner lifecycleOwner, Lifecycle.State state, InterfaceC6469a interfaceC6469a, InterfaceC5631c<? super R> interfaceC5631c) {
        lifecycleOwner.getLifecycle();
        if (state.compareTo(Lifecycle.State.CREATED) >= 0) {
            C5609e c5609e = AbstractC5896f0.f9343a;
            C5447d c5447d = AbstractC5479k.f8471a.f8411d;
            throw null;
        }
        throw new IllegalArgumentException(("target state must be CREATED or greater, found " + state).toString());
    }

    @Nullable
    public static final <R> Object withCreated(@NotNull LifecycleOwner lifecycleOwner, @NotNull InterfaceC6469a interfaceC6469a, @NotNull InterfaceC5631c<? super R> interfaceC5631c) {
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        Lifecycle.State state = Lifecycle.State.CREATED;
        C5609e c5609e = AbstractC5896f0.f9343a;
        C5447d c5447d = AbstractC5479k.f8471a.f8411d;
        boolean zIsDispatchNeeded = c5447d.isDispatchNeeded(interfaceC5631c.getContext());
        if (!zIsDispatchNeeded) {
            if (lifecycle.getState() != Lifecycle.State.DESTROYED) {
                if (lifecycle.getState().compareTo(state) >= 0) {
                    return interfaceC6469a.invoke();
                }
            } else {
                throw new LifecycleDestroyedException();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, zIsDispatchNeeded, c5447d, new C27402(interfaceC6469a), interfaceC5631c);
    }

    @Nullable
    public static final <R> Object withResumed(@NotNull LifecycleOwner lifecycleOwner, @NotNull InterfaceC6469a interfaceC6469a, @NotNull InterfaceC5631c<? super R> interfaceC5631c) {
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        Lifecycle.State state = Lifecycle.State.RESUMED;
        C5609e c5609e = AbstractC5896f0.f9343a;
        C5447d c5447d = AbstractC5479k.f8471a.f8411d;
        boolean zIsDispatchNeeded = c5447d.isDispatchNeeded(interfaceC5631c.getContext());
        if (!zIsDispatchNeeded) {
            if (lifecycle.getState() != Lifecycle.State.DESTROYED) {
                if (lifecycle.getState().compareTo(state) >= 0) {
                    return interfaceC6469a.invoke();
                }
            } else {
                throw new LifecycleDestroyedException();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, zIsDispatchNeeded, c5447d, new C27402(interfaceC6469a), interfaceC5631c);
    }

    @Nullable
    public static final <R> Object withStarted(@NotNull LifecycleOwner lifecycleOwner, @NotNull InterfaceC6469a interfaceC6469a, @NotNull InterfaceC5631c<? super R> interfaceC5631c) {
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        Lifecycle.State state = Lifecycle.State.STARTED;
        C5609e c5609e = AbstractC5896f0.f9343a;
        C5447d c5447d = AbstractC5479k.f8471a.f8411d;
        boolean zIsDispatchNeeded = c5447d.isDispatchNeeded(interfaceC5631c.getContext());
        if (!zIsDispatchNeeded) {
            if (lifecycle.getState() != Lifecycle.State.DESTROYED) {
                if (lifecycle.getState().compareTo(state) >= 0) {
                    return interfaceC6469a.invoke();
                }
            } else {
                throw new LifecycleDestroyedException();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, zIsDispatchNeeded, c5447d, new C27402(interfaceC6469a), interfaceC5631c);
    }

    @Nullable
    public static final <R> Object withStateAtLeast(@NotNull LifecycleOwner lifecycleOwner, @NotNull Lifecycle.State state, @NotNull InterfaceC6469a interfaceC6469a, @NotNull InterfaceC5631c<? super R> interfaceC5631c) {
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        if (state.compareTo(Lifecycle.State.CREATED) >= 0) {
            C5609e c5609e = AbstractC5896f0.f9343a;
            C5447d c5447d = AbstractC5479k.f8471a.f8411d;
            boolean zIsDispatchNeeded = c5447d.isDispatchNeeded(interfaceC5631c.getContext());
            if (!zIsDispatchNeeded) {
                if (lifecycle.getState() != Lifecycle.State.DESTROYED) {
                    if (lifecycle.getState().compareTo(state) >= 0) {
                        return interfaceC6469a.invoke();
                    }
                } else {
                    throw new LifecycleDestroyedException();
                }
            }
            return suspendWithStateAtLeastUnchecked(lifecycle, state, zIsDispatchNeeded, c5447d, new C27402(interfaceC6469a), interfaceC5631c);
        }
        throw new IllegalArgumentException(("target state must be CREATED or greater, found " + state).toString());
    }
}
