package coil3;

import coil3.C4548a;
import coil3.decode.InterfaceC4565a;
import coil3.intercept.InterfaceC4581a;
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
import p023c0.AbstractC4457b;
import p124p.C7587p;
import p124p.InterfaceC7582k;
import p138r.InterfaceC7633c;
import p145s.InterfaceC7675c;
import p187y.C7880m;

/* renamed from: coil3.a */
/* loaded from: classes3.dex */
public final class C4548a {

    /* renamed from: a */
    public final List f1486a;

    /* renamed from: b */
    public final List f1487b;

    /* renamed from: c */
    public final List f1488c;

    /* renamed from: d */
    public List f1489d;

    /* renamed from: e */
    public List f1490e;

    /* renamed from: f */
    public final Lazy f1491f;

    /* renamed from: g */
    public final Lazy f1492g;

    /* renamed from: coil3.a$a */
    public static final class a {

        /* renamed from: a */
        public final List f1493a;

        /* renamed from: b */
        public final List f1494b;

        /* renamed from: c */
        public final List f1495c;

        /* renamed from: d */
        public final List f1496d;

        /* renamed from: e */
        public final List f1497e;

        public a(C4548a c4548a) {
            this.f1493a = CollectionsKt.toMutableList((Collection) c4548a.m1675g());
            this.f1494b = CollectionsKt.toMutableList((Collection) c4548a.m1677i());
            this.f1495c = CollectionsKt.toMutableList((Collection) c4548a.m1676h());
            List<Pair> listM1674f = c4548a.m1674f();
            ArrayList arrayList = new ArrayList();
            for (final Pair pair : listM1674f) {
                arrayList.add(new Function0() { // from class: k.d
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C4548a.a.m1686e(pair);
                    }
                });
            }
            this.f1496d = arrayList;
            List<InterfaceC4565a.a> listM1673e = c4548a.m1673e();
            ArrayList arrayList2 = new ArrayList();
            for (final InterfaceC4565a.a aVar : listM1673e) {
                arrayList2.add(new Function0() { // from class: k.e
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C4548a.a.m1687f(aVar);
                    }
                });
            }
            this.f1497e = arrayList2;
        }

        /* renamed from: e */
        public static final List m1686e(Pair pair) {
            return CollectionsKt.listOf(pair);
        }

        /* renamed from: f */
        public static final List m1687f(InterfaceC4565a.a aVar) {
            return CollectionsKt.listOf(aVar);
        }

        /* renamed from: l */
        public static final List m1688l(InterfaceC4565a.a aVar) {
            return CollectionsKt.listOf(aVar);
        }

        /* renamed from: m */
        public static final List m1689m(InterfaceC7582k.a aVar, KClass kClass) {
            return CollectionsKt.listOf(TuplesKt.m7887to(aVar, kClass));
        }

        /* renamed from: g */
        public final a m1690g(final InterfaceC4565a.a aVar) {
            this.f1497e.add(new Function0() { // from class: k.g
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C4548a.a.m1688l(aVar);
                }
            });
            return this;
        }

        /* renamed from: h */
        public final a m1691h(InterfaceC4581a interfaceC4581a) {
            this.f1493a.add(interfaceC4581a);
            return this;
        }

        /* renamed from: i */
        public final a m1692i(final InterfaceC7582k.a aVar, final KClass kClass) {
            this.f1496d.add(new Function0() { // from class: k.f
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C4548a.a.m1689m(aVar, kClass);
                }
            });
            return this;
        }

        /* renamed from: j */
        public final a m1693j(InterfaceC7633c interfaceC7633c, KClass kClass) {
            this.f1495c.add(TuplesKt.m7887to(interfaceC7633c, kClass));
            return this;
        }

        /* renamed from: k */
        public final a m1694k(InterfaceC7675c interfaceC7675c, KClass kClass) {
            this.f1494b.add(TuplesKt.m7887to(interfaceC7675c, kClass));
            return this;
        }

        /* renamed from: n */
        public final a m1695n(Function0 function0) {
            this.f1497e.add(function0);
            return this;
        }

        /* renamed from: o */
        public final a m1696o(Function0 function0) {
            this.f1496d.add(function0);
            return this;
        }

        /* renamed from: p */
        public final C4548a m1697p() {
            return new C4548a(AbstractC4457b.m1526c(this.f1493a), AbstractC4457b.m1526c(this.f1494b), AbstractC4457b.m1526c(this.f1495c), AbstractC4457b.m1526c(this.f1496d), AbstractC4457b.m1526c(this.f1497e), null);
        }

        /* renamed from: q */
        public final List m1698q() {
            return this.f1497e;
        }

        /* renamed from: r */
        public final List m1699r() {
            return this.f1496d;
        }
    }

    public /* synthetic */ C4548a(List list, List list2, List list3, List list4, List list5, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2, list3, list4, list5);
    }

    /* renamed from: c */
    public static final List m1671c(C4548a c4548a) {
        List list = c4548a.f1490e;
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            CollectionsKt.addAll(arrayList, (List) ((Function0) list.get(i6)).invoke());
        }
        c4548a.f1490e = CollectionsKt.emptyList();
        return arrayList;
    }

    /* renamed from: d */
    public static final List m1672d(C4548a c4548a) {
        List list = c4548a.f1489d;
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            CollectionsKt.addAll(arrayList, (List) ((Function0) list.get(i6)).invoke());
        }
        c4548a.f1489d = CollectionsKt.emptyList();
        return arrayList;
    }

    /* renamed from: e */
    public final List m1673e() {
        return (List) this.f1492g.getValue();
    }

    /* renamed from: f */
    public final List m1674f() {
        return (List) this.f1491f.getValue();
    }

    /* renamed from: g */
    public final List m1675g() {
        return this.f1486a;
    }

    /* renamed from: h */
    public final List m1676h() {
        return this.f1488c;
    }

    /* renamed from: i */
    public final List m1677i() {
        return this.f1487b;
    }

    /* renamed from: j */
    public final Object m1678j(Object obj, C7880m c7880m) {
        List list = this.f1487b;
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            Pair pair = (Pair) list.get(i6);
            InterfaceC7675c interfaceC7675c = (InterfaceC7675c) pair.component1();
            if (((KClass) pair.component2()).isInstance(obj)) {
                Intrinsics.checkNotNull(interfaceC7675c, "null cannot be cast to non-null type coil3.map.Mapper<kotlin.Any, *>");
                Object objMo9125a = interfaceC7675c.mo9125a(obj, c7880m);
                if (objMo9125a != null) {
                    obj = objMo9125a;
                }
            }
        }
        return obj;
    }

    /* renamed from: k */
    public final a m1679k() {
        return new a(this);
    }

    /* renamed from: l */
    public final Pair m1680l(C7587p c7587p, C7880m c7880m, InterfaceC4574e interfaceC4574e, int i6) {
        int size = m1673e().size();
        while (i6 < size) {
            InterfaceC4565a interfaceC4565aMo1796a = ((InterfaceC4565a.a) m1673e().get(i6)).mo1796a(c7587p, c7880m, interfaceC4574e);
            if (interfaceC4565aMo1796a != null) {
                return TuplesKt.m7887to(interfaceC4565aMo1796a, Integer.valueOf(i6));
            }
            i6++;
        }
        return null;
    }

    /* renamed from: m */
    public final Pair m1681m(Object obj, C7880m c7880m, InterfaceC4574e interfaceC4574e, int i6) {
        int size = m1674f().size();
        while (i6 < size) {
            Pair pair = (Pair) m1674f().get(i6);
            InterfaceC7582k.a aVar = (InterfaceC7582k.a) pair.component1();
            if (((KClass) pair.component2()).isInstance(obj)) {
                Intrinsics.checkNotNull(aVar, "null cannot be cast to non-null type coil3.fetch.Fetcher.Factory<kotlin.Any>");
                InterfaceC7582k interfaceC7582kMo1960a = aVar.mo1960a(obj, c7880m, interfaceC4574e);
                if (interfaceC7582kMo1960a != null) {
                    return TuplesKt.m7887to(interfaceC7582kMo1960a, Integer.valueOf(i6));
                }
            }
            i6++;
        }
        return null;
    }

    public C4548a(List list, List list2, List list3, List list4, List list5) {
        this.f1486a = list;
        this.f1487b = list2;
        this.f1488c = list3;
        this.f1489d = list4;
        this.f1490e = list5;
        this.f1491f = LazyKt.lazy(new Function0() { // from class: k.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C4548a.m1672d(this.f8642a);
            }
        });
        this.f1492g = LazyKt.lazy(new Function0() { // from class: k.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C4548a.m1671c(this.f8643a);
            }
        });
    }

    public C4548a() {
        this(CollectionsKt.emptyList(), CollectionsKt.emptyList(), CollectionsKt.emptyList(), CollectionsKt.emptyList(), CollectionsKt.emptyList());
    }
}
