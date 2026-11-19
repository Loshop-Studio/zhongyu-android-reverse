package p120m2;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C2738t;
import kotlin.jvm.internal.AbstractC2770m;
import kotlin.jvm.internal.C2764g;
import kotlin.jvm.internal.C2769l;
import kotlin.jvm.internal.C2776s;
import kotlin.jvm.internal.C2782y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p019c3.InterfaceC1091h;
import p124n2.C2889a;
import p124n2.C2890b;
import p128o2.C2915h;
import p128o2.InterfaceC2913f;
import p171x2.InterfaceC3459a;

/* renamed from: m2.d */
/* loaded from: classes.dex */
public final class C2864d {

    /* renamed from: f */
    private static C2864d f11049f;

    /* renamed from: a */
    private final List<InterfaceC2863c> f11052a;

    /* renamed from: b */
    @NotNull
    private final List<InterfaceC2863c> f11053b;

    /* renamed from: c */
    private final boolean f11054c;

    /* renamed from: d */
    private final boolean f11055d;

    /* renamed from: e */
    private final boolean f11056e;

    /* renamed from: h */
    public static final c f11051h = new c(null);

    /* renamed from: g */
    private static final InterfaceC2913f f11050g = C2915h.m9984a(b.f11061a);

    /* renamed from: m2.d$a */
    public static final class a {

        /* renamed from: a */
        private final List<InterfaceC2863c> f11057a = new ArrayList();

        /* renamed from: b */
        private boolean f11058b = true;

        /* renamed from: c */
        private boolean f11059c = true;

        /* renamed from: d */
        private boolean f11060d;

        @NotNull
        /* renamed from: a */
        public final a m9654a(@NotNull InterfaceC2863c interceptor) {
            C2769l.m9242f(interceptor, "interceptor");
            this.f11057a.add(interceptor);
            return this;
        }

        @NotNull
        /* renamed from: b */
        public final C2864d m9655b() {
            return new C2864d(C2738t.m9163K(this.f11057a), this.f11058b, this.f11059c, this.f11060d, null);
        }
    }

    /* renamed from: m2.d$b */
    static final class b extends AbstractC2770m implements InterfaceC3459a<C2890b> {

        /* renamed from: a */
        public static final b f11061a = new b();

        b() {
            super(0);
        }

        @Override // p171x2.InterfaceC3459a
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2890b invoke() {
            return new C2890b();
        }
    }

    /* renamed from: m2.d$c */
    public static final class c {

        /* renamed from: a */
        static final /* synthetic */ InterfaceC1091h[] f11062a = {C2782y.m9261e(new C2776s(C2782y.m9258b(c.class), "reflectiveFallbackViewCreator", "getReflectiveFallbackViewCreator()Lio/github/inflationx/viewpump/FallbackViewCreator;"))};

        private c() {
        }

        public /* synthetic */ c(C2764g c2764g) {
            this();
        }

        @NotNull
        /* renamed from: a */
        public final a m9657a() {
            return new a();
        }

        /* renamed from: b */
        public final void m9658b(@Nullable C2864d c2864d) {
            C2864d.f11049f = c2864d;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private C2864d(List<? extends InterfaceC2863c> list, boolean z3, boolean z4, boolean z5) {
        this.f11053b = list;
        this.f11054c = z3;
        this.f11055d = z4;
        this.f11056e = z5;
        this.f11052a = C2738t.m9165M(C2738t.m9158F(list, new C2889a()));
    }

    @NotNull
    /* renamed from: b */
    public static final a m9652b() {
        return f11051h.m9657a();
    }

    /* renamed from: c */
    public static final void m9653c(@Nullable C2864d c2864d) {
        f11051h.m9658b(c2864d);
    }

    public /* synthetic */ C2864d(List list, boolean z3, boolean z4, boolean z5, C2764g c2764g) {
        this(list, z3, z4, z5);
    }
}
