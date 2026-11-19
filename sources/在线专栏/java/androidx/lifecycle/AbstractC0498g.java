package androidx.lifecycle;

import kotlin.coroutines.jvm.internal.AbstractC2755k;
import kotlin.coroutines.jvm.internal.InterfaceC2750f;
import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p087f3.C2560i;
import p087f3.InterfaceC2557h0;
import p087f3.InterfaceC2578m1;
import p128o2.C2920m;
import p128o2.C2925r;
import p142q2.InterfaceC3012d;
import p146r2.C3033d;
import p171x2.InterfaceC3474p;

/* renamed from: androidx.lifecycle.g */
/* loaded from: classes.dex */
public abstract class AbstractC0498g implements InterfaceC2557h0 {

    @InterfaceC2750f(m9206c = "androidx.lifecycle.LifecycleCoroutineScope$launchWhenCreated$1", m9207f = "Lifecycle.kt", m9208l = {74}, m9209m = "invokeSuspend")
    /* renamed from: androidx.lifecycle.g$a */
    static final class a extends AbstractC2755k implements InterfaceC3474p<InterfaceC2557h0, InterfaceC3012d<? super C2925r>, Object> {

        /* renamed from: b */
        int f3426b;

        /* renamed from: d */
        final /* synthetic */ InterfaceC3474p f3428d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC3474p interfaceC3474p, InterfaceC3012d interfaceC3012d) {
            super(2, interfaceC3012d);
            this.f3428d = interfaceC3474p;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC2745a
        @NotNull
        public final InterfaceC3012d<C2925r> create(@Nullable Object obj, @NotNull InterfaceC3012d<?> completion) {
            C2769l.m9241e(completion, "completion");
            return AbstractC0498g.this.new a(this.f3428d, completion);
        }

        @Override // p171x2.InterfaceC3474p
        /* renamed from: d */
        public final Object mo2812d(InterfaceC2557h0 interfaceC2557h0, InterfaceC3012d<? super C2925r> interfaceC3012d) {
            return ((a) create(interfaceC2557h0, interfaceC3012d)).invokeSuspend(C2925r.f11415a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC2745a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objM10175c = C3033d.m10175c();
            int i4 = this.f3426b;
            if (i4 == 0) {
                C2920m.m9994b(obj);
                AbstractC0496f abstractC0496fMo2810i = AbstractC0498g.this.mo2810i();
                InterfaceC3474p interfaceC3474p = this.f3428d;
                this.f3426b = 1;
                if (C0515w.m2907a(abstractC0496fMo2810i, interfaceC3474p, this) == objM10175c) {
                    return objM10175c;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C2920m.m9994b(obj);
            }
            return C2925r.f11415a;
        }
    }

    @InterfaceC2750f(m9206c = "androidx.lifecycle.LifecycleCoroutineScope$launchWhenResumed$1", m9207f = "Lifecycle.kt", m9208l = {99}, m9209m = "invokeSuspend")
    /* renamed from: androidx.lifecycle.g$b */
    static final class b extends AbstractC2755k implements InterfaceC3474p<InterfaceC2557h0, InterfaceC3012d<? super C2925r>, Object> {

        /* renamed from: b */
        int f3429b;

        /* renamed from: d */
        final /* synthetic */ InterfaceC3474p f3431d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC3474p interfaceC3474p, InterfaceC3012d interfaceC3012d) {
            super(2, interfaceC3012d);
            this.f3431d = interfaceC3474p;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC2745a
        @NotNull
        public final InterfaceC3012d<C2925r> create(@Nullable Object obj, @NotNull InterfaceC3012d<?> completion) {
            C2769l.m9241e(completion, "completion");
            return AbstractC0498g.this.new b(this.f3431d, completion);
        }

        @Override // p171x2.InterfaceC3474p
        /* renamed from: d */
        public final Object mo2812d(InterfaceC2557h0 interfaceC2557h0, InterfaceC3012d<? super C2925r> interfaceC3012d) {
            return ((b) create(interfaceC2557h0, interfaceC3012d)).invokeSuspend(C2925r.f11415a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC2745a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objM10175c = C3033d.m10175c();
            int i4 = this.f3429b;
            if (i4 == 0) {
                C2920m.m9994b(obj);
                AbstractC0496f abstractC0496fMo2810i = AbstractC0498g.this.mo2810i();
                InterfaceC3474p interfaceC3474p = this.f3431d;
                this.f3429b = 1;
                if (C0515w.m2908b(abstractC0496fMo2810i, interfaceC3474p, this) == objM10175c) {
                    return objM10175c;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C2920m.m9994b(obj);
            }
            return C2925r.f11415a;
        }
    }

    @NotNull
    /* renamed from: i */
    public abstract AbstractC0496f mo2810i();

    @NotNull
    /* renamed from: j */
    public final InterfaceC2578m1 m2876j(@NotNull InterfaceC3474p<? super InterfaceC2557h0, ? super InterfaceC3012d<? super C2925r>, ? extends Object> block) {
        C2769l.m9241e(block, "block");
        return C2560i.m8574d(this, null, null, new a(block, null), 3, null);
    }

    @NotNull
    /* renamed from: k */
    public final InterfaceC2578m1 m2877k(@NotNull InterfaceC3474p<? super InterfaceC2557h0, ? super InterfaceC3012d<? super C2925r>, ? extends Object> block) {
        C2769l.m9241e(block, "block");
        return C2560i.m8574d(this, null, null, new b(block, null), 3, null);
    }
}
