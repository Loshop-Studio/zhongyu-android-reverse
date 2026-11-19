package coil3;

import coil3.C5167a;
import coil3.decode.InterfaceC5184a;
import coil3.intercept.InterfaceC5200a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import p030c0.AbstractC5077b;
import p194p.C8800p;
import p194p.InterfaceC8795k;
import p216r.InterfaceC8993c;
import p227s.InterfaceC9095c;
import p290y.C9892k;

/* renamed from: coil3.a */
/* loaded from: classes3.dex */
public final class C5167a {

    /* renamed from: a */
    public final List f2802a;

    /* renamed from: b */
    public final List f2803b;

    /* renamed from: c */
    public final List f2804c;

    /* renamed from: d */
    public List f2805d;

    /* renamed from: e */
    public List f2806e;

    /* renamed from: f */
    public final Lazy f2807f;

    /* renamed from: g */
    public final Lazy f2808g;

    public /* synthetic */ C5167a(List list, List list2, List list3, List list4, List list5, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2, list3, list4, list5);
    }

    /* renamed from: c */
    public static final List m2837c(C5167a c5167a) {
        List list = c5167a.f2806e;
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            CollectionsKt.addAll(arrayList, (List) ((Function0) list.get(i10)).invoke());
        }
        c5167a.f2806e = CollectionsKt.emptyList();
        return arrayList;
    }

    /* renamed from: d */
    public static final List m2838d(C5167a c5167a) {
        List list = c5167a.f2805d;
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            CollectionsKt.addAll(arrayList, (List) ((Function0) list.get(i10)).invoke());
        }
        c5167a.f2805d = CollectionsKt.emptyList();
        return arrayList;
    }

    /* renamed from: e */
    public final List m2839e() {
        return (List) this.f2808g.getValue();
    }

    /* renamed from: f */
    public final List m2840f() {
        return (List) this.f2807f.getValue();
    }

    /* renamed from: g */
    public final List m2841g() {
        return this.f2802a;
    }

    /* renamed from: h */
    public final List m2842h() {
        return this.f2804c;
    }

    /* renamed from: i */
    public final List m2843i() {
        return this.f2803b;
    }

    /* renamed from: j */
    public final Object m2844j(Object obj, C9892k c9892k) {
        List list = this.f2803b;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Pair pair = (Pair) list.get(i10);
            InterfaceC9095c interfaceC9095c = (InterfaceC9095c) pair.component1();
            if (((KClass) pair.component2()).isInstance(obj)) {
                Intrinsics.checkNotNull(interfaceC9095c, "null cannot be cast to non-null type coil3.map.Mapper<kotlin.Any, *>");
                Object objMo15347a = interfaceC9095c.mo15347a(obj, c9892k);
                if (objMo15347a != null) {
                    obj = objMo15347a;
                }
            }
        }
        return obj;
    }

    /* renamed from: k */
    public final a m2845k() {
        return new a(this);
    }

    /* renamed from: l */
    public final Pair m2846l(C8800p c8800p, C9892k c9892k, InterfaceC5193e interfaceC5193e, int i10) {
        int size = m2839e().size();
        while (i10 < size) {
            InterfaceC5184a interfaceC5184aMo2969a = ((InterfaceC5184a.a) m2839e().get(i10)).mo2969a(c8800p, c9892k, interfaceC5193e);
            if (interfaceC5184aMo2969a != null) {
                return TuplesKt.m13565to(interfaceC5184aMo2969a, Integer.valueOf(i10));
            }
            i10++;
        }
        return null;
    }

    /* renamed from: m */
    public final Pair m2847m(Object obj, C9892k c9892k, InterfaceC5193e interfaceC5193e, int i10) {
        int size = m2840f().size();
        while (i10 < size) {
            Pair pair = (Pair) m2840f().get(i10);
            InterfaceC8795k.a aVar = (InterfaceC8795k.a) pair.component1();
            if (((KClass) pair.component2()).isInstance(obj)) {
                Intrinsics.checkNotNull(aVar, "null cannot be cast to non-null type coil3.fetch.Fetcher.Factory<kotlin.Any>");
                InterfaceC8795k interfaceC8795kMo3134a = aVar.mo3134a(obj, c9892k, interfaceC5193e);
                if (interfaceC8795kMo3134a != null) {
                    return TuplesKt.m13565to(interfaceC8795kMo3134a, Integer.valueOf(i10));
                }
            }
            i10++;
        }
        return null;
    }

    public C5167a(List list, List list2, List list3, List list4, List list5) {
        this.f2802a = list;
        this.f2803b = list2;
        this.f2804c = list3;
        this.f2805d = list4;
        this.f2806e = list5;
        this.f2807f = LazyKt.lazy(new Function0() { // from class: k.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C5167a.m2838d(this.f13565a);
            }
        });
        this.f2808g = LazyKt.lazy(new Function0() { // from class: k.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C5167a.m2837c(this.f13566a);
            }
        });
    }

    /* renamed from: coil3.a$a */
    public static final class a {

        /* renamed from: a */
        public final List f2809a;

        /* renamed from: b */
        public final List f2810b;

        /* renamed from: c */
        public final List f2811c;

        /* renamed from: d */
        public final List f2812d;

        /* renamed from: e */
        public final List f2813e;

        public a() {
            this.f2809a = new ArrayList();
            this.f2810b = new ArrayList();
            this.f2811c = new ArrayList();
            this.f2812d = new ArrayList();
            this.f2813e = new ArrayList();
        }

        /* renamed from: e */
        public static final List m2852e(Pair pair) {
            return CollectionsKt.listOf(pair);
        }

        /* renamed from: f */
        public static final List m2853f(InterfaceC5184a.a aVar) {
            return CollectionsKt.listOf(aVar);
        }

        /* renamed from: l */
        public static final List m2854l(InterfaceC5184a.a aVar) {
            return CollectionsKt.listOf(aVar);
        }

        /* renamed from: m */
        public static final List m2855m(InterfaceC8795k.a aVar, KClass kClass) {
            return CollectionsKt.listOf(TuplesKt.m13565to(aVar, kClass));
        }

        /* renamed from: g */
        public final a m2856g(final InterfaceC5184a.a aVar) {
            this.f2813e.add(new Function0() { // from class: k.g
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C5167a.a.m2854l(aVar);
                }
            });
            return this;
        }

        /* renamed from: h */
        public final a m2857h(InterfaceC5200a interfaceC5200a) {
            this.f2809a.add(interfaceC5200a);
            return this;
        }

        /* renamed from: i */
        public final a m2858i(final InterfaceC8795k.a aVar, final KClass kClass) {
            this.f2812d.add(new Function0() { // from class: k.f
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C5167a.a.m2855m(aVar, kClass);
                }
            });
            return this;
        }

        /* renamed from: j */
        public final a m2859j(InterfaceC8993c interfaceC8993c, KClass kClass) {
            this.f2811c.add(TuplesKt.m13565to(interfaceC8993c, kClass));
            return this;
        }

        /* renamed from: k */
        public final a m2860k(InterfaceC9095c interfaceC9095c, KClass kClass) {
            this.f2810b.add(TuplesKt.m13565to(interfaceC9095c, kClass));
            return this;
        }

        /* renamed from: n */
        public final a m2861n(Function0 function0) {
            this.f2813e.add(function0);
            return this;
        }

        /* renamed from: o */
        public final a m2862o(Function0 function0) {
            this.f2812d.add(function0);
            return this;
        }

        /* renamed from: p */
        public final C5167a m2863p() {
            return new C5167a(AbstractC5077b.m2669c(this.f2809a), AbstractC5077b.m2669c(this.f2810b), AbstractC5077b.m2669c(this.f2811c), AbstractC5077b.m2669c(this.f2812d), AbstractC5077b.m2669c(this.f2813e), null);
        }

        /* renamed from: q */
        public final List m2864q() {
            return this.f2813e;
        }

        /* renamed from: r */
        public final List m2865r() {
            return this.f2812d;
        }

        public a(C5167a c5167a) {
            this.f2809a = CollectionsKt.toMutableList((Collection) c5167a.m2841g());
            this.f2810b = CollectionsKt.toMutableList((Collection) c5167a.m2843i());
            this.f2811c = CollectionsKt.toMutableList((Collection) c5167a.m2842h());
            List<Pair> listM2840f = c5167a.m2840f();
            ArrayList arrayList = new ArrayList();
            for (final Pair pair : listM2840f) {
                arrayList.add(new Function0() { // from class: k.d
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C5167a.a.m2852e(pair);
                    }
                });
            }
            this.f2812d = arrayList;
            List<InterfaceC5184a.a> listM2839e = c5167a.m2839e();
            ArrayList arrayList2 = new ArrayList();
            for (final InterfaceC5184a.a aVar : listM2839e) {
                arrayList2.add(new Function0() { // from class: k.e
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C5167a.a.m2853f(aVar);
                    }
                });
            }
            this.f2813e = arrayList2;
        }
    }

    public C5167a() {
        this(CollectionsKt.emptyList(), CollectionsKt.emptyList(), CollectionsKt.emptyList(), CollectionsKt.emptyList(), CollectionsKt.emptyList());
    }
}
