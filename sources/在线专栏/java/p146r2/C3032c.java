package p146r2;

import kotlin.coroutines.jvm.internal.AbstractC2745a;
import kotlin.coroutines.jvm.internal.AbstractC2748d;
import kotlin.coroutines.jvm.internal.AbstractC2754j;
import kotlin.coroutines.jvm.internal.C2752h;
import kotlin.jvm.internal.C2759b0;
import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p128o2.C2920m;
import p128o2.C2925r;
import p142q2.C3016h;
import p142q2.InterfaceC3012d;
import p142q2.InterfaceC3015g;
import p171x2.InterfaceC3474p;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: r2.c */
/* loaded from: classes.dex */
public class C3032c {

    /* renamed from: r2.c$a */
    public static final class a extends AbstractC2754j {

        /* renamed from: a */
        private int f11742a;

        /* renamed from: b */
        final /* synthetic */ InterfaceC3012d f11743b;

        /* renamed from: c */
        final /* synthetic */ InterfaceC3474p f11744c;

        /* renamed from: d */
        final /* synthetic */ Object f11745d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC3012d interfaceC3012d, InterfaceC3474p interfaceC3474p, Object obj) {
            super(interfaceC3012d);
            this.f11743b = interfaceC3012d;
            this.f11744c = interfaceC3474p;
            this.f11745d = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC2745a
        @Nullable
        protected Object invokeSuspend(@NotNull Object obj) throws Throwable {
            int i4 = this.f11742a;
            if (i4 == 0) {
                this.f11742a = 1;
                C2920m.m9994b(obj);
                return ((InterfaceC3474p) C2759b0.m9222b(this.f11744c, 2)).mo2812d(this.f11745d, this);
            }
            if (i4 != 1) {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
            this.f11742a = 2;
            C2920m.m9994b(obj);
            return obj;
        }
    }

    /* renamed from: r2.c$b */
    public static final class b extends AbstractC2748d {

        /* renamed from: a */
        private int f11746a;

        /* renamed from: b */
        final /* synthetic */ InterfaceC3012d f11747b;

        /* renamed from: c */
        final /* synthetic */ InterfaceC3015g f11748c;

        /* renamed from: d */
        final /* synthetic */ InterfaceC3474p f11749d;

        /* renamed from: e */
        final /* synthetic */ Object f11750e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC3012d interfaceC3012d, InterfaceC3015g interfaceC3015g, InterfaceC3474p interfaceC3474p, Object obj) {
            super(interfaceC3012d, interfaceC3015g);
            this.f11747b = interfaceC3012d;
            this.f11748c = interfaceC3015g;
            this.f11749d = interfaceC3474p;
            this.f11750e = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC2745a
        @Nullable
        protected Object invokeSuspend(@NotNull Object obj) throws Throwable {
            int i4 = this.f11746a;
            if (i4 == 0) {
                this.f11746a = 1;
                C2920m.m9994b(obj);
                return ((InterfaceC3474p) C2759b0.m9222b(this.f11749d, 2)).mo2812d(this.f11750e, this);
            }
            if (i4 != 1) {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
            this.f11746a = 2;
            C2920m.m9994b(obj);
            return obj;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    /* renamed from: a */
    public static <R, T> InterfaceC3012d<C2925r> m10173a(@NotNull InterfaceC3474p<? super R, ? super InterfaceC3012d<? super T>, ? extends Object> interfaceC3474p, R r3, @NotNull InterfaceC3012d<? super T> completion) {
        C2769l.m9241e(interfaceC3474p, "<this>");
        C2769l.m9241e(completion, "completion");
        InterfaceC3012d<?> interfaceC3012dM9215a = C2752h.m9215a(completion);
        if (interfaceC3474p instanceof AbstractC2745a) {
            return ((AbstractC2745a) interfaceC3474p).create(r3, interfaceC3012dM9215a);
        }
        InterfaceC3015g context = interfaceC3012dM9215a.getContext();
        return context == C3016h.f11678a ? new a(interfaceC3012dM9215a, interfaceC3474p, r3) : new b(interfaceC3012dM9215a, context, interfaceC3474p, r3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    /* renamed from: b */
    public static <T> InterfaceC3012d<T> m10174b(@NotNull InterfaceC3012d<? super T> interfaceC3012d) {
        C2769l.m9241e(interfaceC3012d, "<this>");
        AbstractC2748d abstractC2748d = interfaceC3012d instanceof AbstractC2748d ? (AbstractC2748d) interfaceC3012d : null;
        return abstractC2748d == null ? interfaceC3012d : (InterfaceC3012d<T>) abstractC2748d.intercepted();
    }
}
