package kotlinx.coroutines;

import com.zykj.mistake.feature.notebook.list.C4959k1;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ReplaceWith;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p054e7.AbstractC5469a;
import p054e7.C5473e;
import p054e7.C5474f;
import p075h6.AbstractC5629a;
import p075h6.C5632d;
import p075h6.InterfaceC5631c;
import p075h6.InterfaceC5633e;
import p075h6.InterfaceC5634f;
import p075h6.InterfaceC5635g;
import p075h6.InterfaceC5636h;

/* renamed from: kotlinx.coroutines.r */
/* loaded from: classes4.dex */
public abstract class AbstractC5995r extends AbstractC5629a implements InterfaceC5633e {

    @NotNull
    public static final C5992q Key = new C5992q(C5632d.f8764a, new C4959k1(26));

    public AbstractC5995r() {
        super(C5632d.f8764a);
    }

    public static /* synthetic */ AbstractC5995r limitedParallelism$default(AbstractC5995r abstractC5995r, int i, String str, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: limitedParallelism");
        }
        if ((i8 & 2) != 0) {
            str = null;
        }
        return abstractC5995r.limitedParallelism(i, str);
    }

    public abstract void dispatch(InterfaceC5636h interfaceC5636h, Runnable runnable);

    @InternalCoroutinesApi
    public void dispatchYield(@NotNull InterfaceC5636h interfaceC5636h, @NotNull Runnable runnable) {
        AbstractC5469a.m4833i(this, interfaceC5636h, runnable);
    }

    @Override // p075h6.AbstractC5629a, p075h6.InterfaceC5636h
    @Nullable
    public <E extends InterfaceC5634f> E get(@NotNull InterfaceC5635g key) {
        E e;
        AbstractC5830k.m5330g(key, "key");
        if (key instanceof C5992q) {
            C5992q c5992q = (C5992q) key;
            InterfaceC5635g key2 = getKey();
            AbstractC5830k.m5330g(key2, "key");
            if ((key2 == c5992q || c5992q.f9491b == key2) && (e = (E) c5992q.f9490a.invoke(this)) != null) {
                return e;
            }
        } else if (C5632d.f8764a == key) {
            return this;
        }
        return null;
    }

    @Override // p075h6.InterfaceC5633e
    @NotNull
    public final <T> InterfaceC5631c<T> interceptContinuation(@NotNull InterfaceC5631c<? super T> interfaceC5631c) {
        return new C5473e(this, interfaceC5631c);
    }

    public boolean isDispatchNeeded(@NotNull InterfaceC5636h interfaceC5636h) {
        return true;
    }

    @NotNull
    public AbstractC5995r limitedParallelism(int i, @Nullable String str) {
        AbstractC5469a.m4825a(i);
        return new C5474f(this, i, str);
    }

    @Override // p075h6.AbstractC5629a, p075h6.InterfaceC5636h
    @NotNull
    public InterfaceC5636h minusKey(@NotNull InterfaceC5635g key) {
        AbstractC5830k.m5330g(key, "key");
        if (key instanceof C5992q) {
            C5992q c5992q = (C5992q) key;
            InterfaceC5635g key2 = getKey();
            AbstractC5830k.m5330g(key2, "key");
            if ((key2 == c5992q || c5992q.f9491b == key2) && ((InterfaceC5634f) c5992q.f9490a.invoke(this)) != null) {
                return EmptyCoroutineContext.INSTANCE;
            }
        } else if (C5632d.f8764a == key) {
            return EmptyCoroutineContext.INSTANCE;
        }
        return this;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Operator '+' on two CoroutineDispatcher objects is meaningless. CoroutineDispatcher is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The dispatcher to the right of `+` just replaces the dispatcher to the left.")
    @NotNull
    public final AbstractC5995r plus(@NotNull AbstractC5995r abstractC5995r) {
        return abstractC5995r;
    }

    @Override // p075h6.InterfaceC5633e
    public final void releaseInterceptedContinuation(@NotNull InterfaceC5631c<?> interfaceC5631c) {
        AbstractC5830k.m5328e(interfaceC5631c, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        C5473e c5473e = (C5473e) interfaceC5631c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C5473e.f8449h;
        while (atomicReferenceFieldUpdater.get(c5473e) == AbstractC5469a.f8440c) {
        }
        Object obj = atomicReferenceFieldUpdater.get(c5473e);
        C5961g c5961g = obj instanceof C5961g ? (C5961g) obj : null;
        if (c5961g != null) {
            c5961g.m5580p();
        }
    }

    @NotNull
    public String toString() {
        return getClass().getSimpleName() + '@' + AbstractC6014x.m5642m(this);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Deprecated for good. Override 'limitedParallelism(parallelism: Int, name: String?)' instead", replaceWith = @ReplaceWith(expression = "limitedParallelism(parallelism, null)", imports = {}))
    public /* synthetic */ AbstractC5995r limitedParallelism(int i) {
        return limitedParallelism(i, null);
    }
}
