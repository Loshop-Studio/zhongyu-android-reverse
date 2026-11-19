package coil3;

import coil3.C5302a;
import coil3.decode.InterfaceC5319a;
import coil3.intercept.InterfaceC5335a;
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
import p090e0.AbstractC7804b;
import p207p.C9303p;
import p207p.InterfaceC9298k;
import p227r.InterfaceC9388c;
import p237s.InterfaceC9459c;
import p297y.C9932m;

/* renamed from: coil3.a */
/* loaded from: classes3.dex */
public final class C5302a {

    /* renamed from: a */
    public final List f2737a;

    /* renamed from: b */
    public final List f2738b;

    /* renamed from: c */
    public final List f2739c;

    /* renamed from: d */
    public List f2740d;

    /* renamed from: e */
    public List f2741e;

    /* renamed from: f */
    public final Lazy f2742f;

    /* renamed from: g */
    public final Lazy f2743g;

    /* renamed from: coil3.a$a */
    public static final class a {

        /* renamed from: a */
        public final List f2744a;

        /* renamed from: b */
        public final List f2745b;

        /* renamed from: c */
        public final List f2746c;

        /* renamed from: d */
        public final List f2747d;

        /* renamed from: e */
        public final List f2748e;

        public a(C5302a c5302a) {
            this.f2744a = CollectionsKt.toMutableList((Collection) c5302a.m2569g());
            this.f2745b = CollectionsKt.toMutableList((Collection) c5302a.m2571i());
            this.f2746c = CollectionsKt.toMutableList((Collection) c5302a.m2570h());
            List<Pair> listM2568f = c5302a.m2568f();
            ArrayList arrayList = new ArrayList();
            for (final Pair pair : listM2568f) {
                arrayList.add(new Function0() { // from class: k.d
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C5302a.a.m2580e(pair);
                    }
                });
            }
            this.f2747d = arrayList;
            List<InterfaceC5319a.a> listM2567e = c5302a.m2567e();
            ArrayList arrayList2 = new ArrayList();
            for (final InterfaceC5319a.a aVar : listM2567e) {
                arrayList2.add(new Function0() { // from class: k.e
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C5302a.a.m2581f(aVar);
                    }
                });
            }
            this.f2748e = arrayList2;
        }

        /* renamed from: e */
        public static final List m2580e(Pair pair) {
            return CollectionsKt.listOf(pair);
        }

        /* renamed from: f */
        public static final List m2581f(InterfaceC5319a.a aVar) {
            return CollectionsKt.listOf(aVar);
        }

        /* renamed from: l */
        public static final List m2582l(InterfaceC5319a.a aVar) {
            return CollectionsKt.listOf(aVar);
        }

        /* renamed from: m */
        public static final List m2583m(InterfaceC9298k.a aVar, KClass kClass) {
            return CollectionsKt.listOf(TuplesKt.m13420to(aVar, kClass));
        }

        /* renamed from: g */
        public final a m2584g(final InterfaceC5319a.a aVar) {
            this.f2748e.add(new Function0() { // from class: k.g
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C5302a.a.m2582l(aVar);
                }
            });
            return this;
        }

        /* renamed from: h */
        public final a m2585h(InterfaceC5335a interfaceC5335a) {
            this.f2744a.add(interfaceC5335a);
            return this;
        }

        /* renamed from: i */
        public final a m2586i(final InterfaceC9298k.a aVar, final KClass kClass) {
            this.f2747d.add(new Function0() { // from class: k.f
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C5302a.a.m2583m(aVar, kClass);
                }
            });
            return this;
        }

        /* renamed from: j */
        public final a m2587j(InterfaceC9388c interfaceC9388c, KClass kClass) {
            this.f2746c.add(TuplesKt.m13420to(interfaceC9388c, kClass));
            return this;
        }

        /* renamed from: k */
        public final a m2588k(InterfaceC9459c interfaceC9459c, KClass kClass) {
            this.f2745b.add(TuplesKt.m13420to(interfaceC9459c, kClass));
            return this;
        }

        /* renamed from: n */
        public final a m2589n(Function0 function0) {
            this.f2748e.add(function0);
            return this;
        }

        /* renamed from: o */
        public final a m2590o(Function0 function0) {
            this.f2747d.add(function0);
            return this;
        }

        /* renamed from: p */
        public final C5302a m2591p() {
            return new C5302a(AbstractC7804b.m12177c(this.f2744a), AbstractC7804b.m12177c(this.f2745b), AbstractC7804b.m12177c(this.f2746c), AbstractC7804b.m12177c(this.f2747d), AbstractC7804b.m12177c(this.f2748e), null);
        }

        /* renamed from: q */
        public final List m2592q() {
            return this.f2748e;
        }

        /* renamed from: r */
        public final List m2593r() {
            return this.f2747d;
        }
    }

    public /* synthetic */ C5302a(List list, List list2, List list3, List list4, List list5, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2, list3, list4, list5);
    }

    /* renamed from: c */
    public static final List m2565c(C5302a c5302a) {
        List list = c5302a.f2741e;
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i9 = 0; i9 < size; i9++) {
            CollectionsKt.addAll(arrayList, (List) ((Function0) list.get(i9)).invoke());
        }
        c5302a.f2741e = CollectionsKt.emptyList();
        return arrayList;
    }

    /* renamed from: d */
    public static final List m2566d(C5302a c5302a) {
        List list = c5302a.f2740d;
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i9 = 0; i9 < size; i9++) {
            CollectionsKt.addAll(arrayList, (List) ((Function0) list.get(i9)).invoke());
        }
        c5302a.f2740d = CollectionsKt.emptyList();
        return arrayList;
    }

    /* renamed from: e */
    public final List m2567e() {
        return (List) this.f2743g.getValue();
    }

    /* renamed from: f */
    public final List m2568f() {
        return (List) this.f2742f.getValue();
    }

    /* renamed from: g */
    public final List m2569g() {
        return this.f2737a;
    }

    /* renamed from: h */
    public final List m2570h() {
        return this.f2739c;
    }

    /* renamed from: i */
    public final List m2571i() {
        return this.f2738b;
    }

    /* renamed from: j */
    public final Object m2572j(Object obj, C9932m c9932m) {
        List list = this.f2738b;
        int size = list.size();
        for (int i9 = 0; i9 < size; i9++) {
            Pair pair = (Pair) list.get(i9);
            InterfaceC9459c interfaceC9459c = (InterfaceC9459c) pair.component1();
            if (((KClass) pair.component2()).isInstance(obj)) {
                Intrinsics.checkNotNull(interfaceC9459c, "null cannot be cast to non-null type coil3.map.Mapper<kotlin.Any, *>");
                Object objMo15625a = interfaceC9459c.mo15625a(obj, c9932m);
                if (objMo15625a != null) {
                    obj = objMo15625a;
                }
            }
        }
        return obj;
    }

    /* renamed from: k */
    public final a m2573k() {
        return new a(this);
    }

    /* renamed from: l */
    public final Pair m2574l(C9303p c9303p, C9932m c9932m, InterfaceC5328e interfaceC5328e, int i9) {
        int size = m2567e().size();
        while (i9 < size) {
            InterfaceC5319a interfaceC5319aMo10a = ((InterfaceC5319a.a) m2567e().get(i9)).mo10a(c9303p, c9932m, interfaceC5328e);
            if (interfaceC5319aMo10a != null) {
                return TuplesKt.m13420to(interfaceC5319aMo10a, Integer.valueOf(i9));
            }
            i9++;
        }
        return null;
    }

    /* renamed from: m */
    public final Pair m2575m(Object obj, C9932m c9932m, InterfaceC5328e interfaceC5328e, int i9) {
        int size = m2568f().size();
        while (i9 < size) {
            Pair pair = (Pair) m2568f().get(i9);
            InterfaceC9298k.a aVar = (InterfaceC9298k.a) pair.component1();
            if (((KClass) pair.component2()).isInstance(obj)) {
                Intrinsics.checkNotNull(aVar, "null cannot be cast to non-null type coil3.fetch.Fetcher.Factory<kotlin.Any>");
                InterfaceC9298k interfaceC9298kMo2854a = aVar.mo2854a(obj, c9932m, interfaceC5328e);
                if (interfaceC9298kMo2854a != null) {
                    return TuplesKt.m13420to(interfaceC9298kMo2854a, Integer.valueOf(i9));
                }
            }
            i9++;
        }
        return null;
    }

    public C5302a(List list, List list2, List list3, List list4, List list5) {
        this.f2737a = list;
        this.f2738b = list2;
        this.f2739c = list3;
        this.f2740d = list4;
        this.f2741e = list5;
        this.f2742f = LazyKt.lazy(new Function0() { // from class: k.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C5302a.m2566d(this.f14300a);
            }
        });
        this.f2743g = LazyKt.lazy(new Function0() { // from class: k.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C5302a.m2565c(this.f14301a);
            }
        });
    }

    public C5302a() {
        this(CollectionsKt.emptyList(), CollectionsKt.emptyList(), CollectionsKt.emptyList(), CollectionsKt.emptyList(), CollectionsKt.emptyList());
    }
}
