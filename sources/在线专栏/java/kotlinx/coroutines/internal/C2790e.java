package kotlinx.coroutines.internal;

import androidx.work.impl.utils.futures.C0827b;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.jvm.internal.InterfaceC2749e;
import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p087f3.AbstractC2545e0;
import p087f3.AbstractC2599t0;
import p087f3.AbstractC2617z0;
import p087f3.C2537c0;
import p087f3.C2563i2;
import p087f3.C2573l0;
import p087f3.C2576m;
import p087f3.C2616z;
import p087f3.InterfaceC2572l;
import p128o2.C2925r;
import p142q2.InterfaceC3012d;
import p142q2.InterfaceC3015g;

/* renamed from: kotlinx.coroutines.internal.e */
/* loaded from: classes.dex */
public final class C2790e<T> extends AbstractC2599t0<T> implements InterfaceC2749e, InterfaceC3012d<T> {

    /* renamed from: h */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f10753h = AtomicReferenceFieldUpdater.newUpdater(C2790e.class, Object.class, "_reusableCancellableContinuation");

    @NotNull
    private volatile /* synthetic */ Object _reusableCancellableContinuation;

    /* renamed from: d */
    @NotNull
    public final AbstractC2545e0 f10754d;

    /* renamed from: e */
    @NotNull
    public final InterfaceC3012d<T> f10755e;

    /* renamed from: f */
    @Nullable
    public Object f10756f;

    /* renamed from: g */
    @NotNull
    public final Object f10757g;

    /* JADX WARN: Multi-variable type inference failed */
    public C2790e(@NotNull AbstractC2545e0 abstractC2545e0, @NotNull InterfaceC3012d<? super T> interfaceC3012d) {
        super(-1);
        this.f10754d = abstractC2545e0;
        this.f10755e = interfaceC3012d;
        this.f10756f = C2791f.f10758a;
        this.f10757g = C2809x.m9358b(getContext());
        this._reusableCancellableContinuation = null;
    }

    /* renamed from: k */
    private final C2576m<?> m9282k() {
        Object obj = this._reusableCancellableContinuation;
        if (obj instanceof C2576m) {
            return (C2576m) obj;
        }
        return null;
    }

    @Override // p087f3.AbstractC2599t0
    /* renamed from: a */
    public void mo8612a(@Nullable Object obj, @NotNull Throwable th) {
        if (obj instanceof C2616z) {
            ((C2616z) obj).f10319b.invoke(th);
        }
    }

    @Override // p087f3.AbstractC2599t0
    @NotNull
    /* renamed from: b */
    public InterfaceC3012d<T> mo8613b() {
        return this;
    }

    @Override // kotlin.coroutines.jvm.internal.InterfaceC2749e
    @Nullable
    public InterfaceC2749e getCallerFrame() {
        InterfaceC3012d<T> interfaceC3012d = this.f10755e;
        if (interfaceC3012d instanceof InterfaceC2749e) {
            return (InterfaceC2749e) interfaceC3012d;
        }
        return null;
    }

    @Override // p142q2.InterfaceC3012d
    @NotNull
    public InterfaceC3015g getContext() {
        return this.f10755e.getContext();
    }

    @Override // p087f3.AbstractC2599t0
    @Nullable
    /* renamed from: i */
    public Object mo8616i() {
        Object obj = this.f10756f;
        this.f10756f = C2791f.f10758a;
        return obj;
    }

    /* renamed from: j */
    public final void m9283j() {
        while (this._reusableCancellableContinuation == C2791f.f10759b) {
        }
    }

    /* renamed from: l */
    public final boolean m9284l() {
        return this._reusableCancellableContinuation != null;
    }

    /* renamed from: m */
    public final boolean m9285m(@NotNull Throwable th) {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            C2805t c2805t = C2791f.f10759b;
            if (C2769l.m9237a(obj, c2805t)) {
                if (C0827b.m4278a(f10753h, this, c2805t, th)) {
                    return true;
                }
            } else {
                if (obj instanceof Throwable) {
                    return true;
                }
                if (C0827b.m4278a(f10753h, this, obj, null)) {
                    return false;
                }
            }
        }
    }

    /* renamed from: n */
    public final void m9286n() {
        m9283j();
        C2576m<?> c2576mM9282k = m9282k();
        if (c2576mM9282k == null) {
            return;
        }
        c2576mM9282k.m8619o();
    }

    @Nullable
    /* renamed from: o */
    public final Throwable m9287o(@NotNull InterfaceC2572l<?> interfaceC2572l) {
        C2805t c2805t;
        do {
            Object obj = this._reusableCancellableContinuation;
            c2805t = C2791f.f10759b;
            if (obj != c2805t) {
                if (!(obj instanceof Throwable)) {
                    throw new IllegalStateException(C2769l.m9248l("Inconsistent state ", obj).toString());
                }
                if (C0827b.m4278a(f10753h, this, obj, null)) {
                    return (Throwable) obj;
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        } while (!C0827b.m4278a(f10753h, this, c2805t, interfaceC2572l));
        return null;
    }

    @Override // p142q2.InterfaceC3012d
    public void resumeWith(@NotNull Object obj) {
        InterfaceC3015g context = this.f10755e.getContext();
        Object objM8534d = C2537c0.m8534d(obj, null, 1, null);
        if (this.f10754d.mo2906K(context)) {
            this.f10756f = objM8534d;
            this.f10281c = 0;
            this.f10754d.mo2905J(context, this);
            return;
        }
        AbstractC2617z0 abstractC2617z0M8579b = C2563i2.f10245a.m8579b();
        if (abstractC2617z0M8579b.m8767S()) {
            this.f10756f = objM8534d;
            this.f10281c = 0;
            abstractC2617z0M8579b.m8765O(this);
            return;
        }
        abstractC2617z0M8579b.m8766Q(true);
        try {
            InterfaceC3015g context2 = getContext();
            Object objM9359c = C2809x.m9359c(context2, this.f10757g);
            try {
                this.f10755e.resumeWith(obj);
                C2925r c2925r = C2925r.f11415a;
                while (abstractC2617z0M8579b.m8769V()) {
                }
            } finally {
                C2809x.m9357a(context2, objM9359c);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    @NotNull
    public String toString() {
        return "DispatchedContinuation[" + this.f10754d + ", " + C2573l0.m8593c(this.f10755e) + ']';
    }
}
