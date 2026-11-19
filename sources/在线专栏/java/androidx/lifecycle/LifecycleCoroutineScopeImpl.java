package androidx.lifecycle;

import androidx.lifecycle.AbstractC0496f;
import kotlin.coroutines.jvm.internal.AbstractC2755k;
import kotlin.coroutines.jvm.internal.InterfaceC2750f;
import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p087f3.C2560i;
import p087f3.C2594r1;
import p087f3.C2605v0;
import p087f3.InterfaceC2557h0;
import p128o2.C2920m;
import p128o2.C2925r;
import p142q2.InterfaceC3012d;
import p142q2.InterfaceC3015g;
import p146r2.C3033d;
import p171x2.InterfaceC3474p;

/* loaded from: classes.dex */
public final class LifecycleCoroutineScopeImpl extends AbstractC0498g implements InterfaceC0501i {

    /* renamed from: a */
    @NotNull
    private final AbstractC0496f f3362a;

    /* renamed from: b */
    @NotNull
    private final InterfaceC3015g f3363b;

    @InterfaceC2750f(m9206c = "androidx.lifecycle.LifecycleCoroutineScopeImpl$register$1", m9207f = "Lifecycle.kt", m9208l = {}, m9209m = "invokeSuspend")
    /* renamed from: androidx.lifecycle.LifecycleCoroutineScopeImpl$a */
    static final class C0479a extends AbstractC2755k implements InterfaceC3474p<InterfaceC2557h0, InterfaceC3012d<? super C2925r>, Object> {

        /* renamed from: b */
        private /* synthetic */ Object f3364b;

        /* renamed from: c */
        int f3365c;

        C0479a(InterfaceC3012d interfaceC3012d) {
            super(2, interfaceC3012d);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC2745a
        @NotNull
        public final InterfaceC3012d<C2925r> create(@Nullable Object obj, @NotNull InterfaceC3012d<?> completion) {
            C2769l.m9241e(completion, "completion");
            C0479a c0479a = LifecycleCoroutineScopeImpl.this.new C0479a(completion);
            c0479a.f3364b = obj;
            return c0479a;
        }

        @Override // p171x2.InterfaceC3474p
        /* renamed from: d */
        public final Object mo2812d(InterfaceC2557h0 interfaceC2557h0, InterfaceC3012d<? super C2925r> interfaceC3012d) {
            return ((C0479a) create(interfaceC2557h0, interfaceC3012d)).invokeSuspend(C2925r.f11415a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC2745a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            C3033d.m10175c();
            if (this.f3365c != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C2920m.m9994b(obj);
            InterfaceC2557h0 interfaceC2557h0 = (InterfaceC2557h0) this.f3364b;
            if (LifecycleCoroutineScopeImpl.this.mo2810i().mo2868b().compareTo(AbstractC0496f.c.INITIALIZED) >= 0) {
                LifecycleCoroutineScopeImpl.this.mo2810i().mo2867a(LifecycleCoroutineScopeImpl.this);
            } else {
                C2594r1.m8659d(interfaceC2557h0.mo2809e(), null, 1, null);
            }
            return C2925r.f11415a;
        }
    }

    public LifecycleCoroutineScopeImpl(@NotNull AbstractC0496f lifecycle, @NotNull InterfaceC3015g coroutineContext) {
        C2769l.m9241e(lifecycle, "lifecycle");
        C2769l.m9241e(coroutineContext, "coroutineContext");
        this.f3362a = lifecycle;
        this.f3363b = coroutineContext;
        if (mo2810i().mo2868b() == AbstractC0496f.c.DESTROYED) {
            C2594r1.m8659d(mo2809e(), null, 1, null);
        }
    }

    @Override // androidx.lifecycle.InterfaceC0501i
    /* renamed from: d */
    public void mo63d(@NotNull InterfaceC0504l source, @NotNull AbstractC0496f.b event) {
        C2769l.m9241e(source, "source");
        C2769l.m9241e(event, "event");
        if (mo2810i().mo2868b().compareTo(AbstractC0496f.c.DESTROYED) <= 0) {
            mo2810i().mo2869c(this);
            C2594r1.m8659d(mo2809e(), null, 1, null);
        }
    }

    @Override // p087f3.InterfaceC2557h0
    @NotNull
    /* renamed from: e */
    public InterfaceC3015g mo2809e() {
        return this.f3363b;
    }

    @Override // androidx.lifecycle.AbstractC0498g
    @NotNull
    /* renamed from: i */
    public AbstractC0496f mo2810i() {
        return this.f3362a;
    }

    /* renamed from: l */
    public final void m2811l() {
        C2560i.m8574d(this, C2605v0.m8752c().mo8757L(), null, new C0479a(null), 2, null);
    }
}
