package p070b.p074b.p105b.p106a0.p108z;

import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;
import p070b.p071a.p072a.p073a.C0561a;
import p070b.p074b.p105b.AbstractC0773n;
import p070b.p074b.p105b.AbstractC0783x;
import p070b.p074b.p105b.C0768i;
import p070b.p074b.p105b.C0770k;
import p070b.p074b.p105b.C0774o;
import p070b.p074b.p105b.C0775p;
import p070b.p074b.p105b.C0776q;
import p070b.p074b.p105b.C0778s;
import p070b.p074b.p105b.C0781v;
import p070b.p074b.p105b.InterfaceC0784y;
import p070b.p074b.p105b.p106a0.AbstractC0727q;
import p070b.p074b.p105b.p106a0.C0708a;
import p070b.p074b.p105b.p106a0.C0717g;
import p070b.p074b.p105b.p106a0.InterfaceC0730t;
import p070b.p074b.p105b.p110b0.C0757a;
import p070b.p074b.p105b.p111c0.C0759a;
import p070b.p074b.p105b.p111c0.C0761c;
import p070b.p074b.p105b.p111c0.EnumC0760b;

/* renamed from: b.b.b.a0.z.g */
/* loaded from: classes.dex */
public final class C0742g implements InterfaceC0784y {

    /* renamed from: b */
    public final C0717g f4281b;

    /* renamed from: c */
    public final boolean f4282c;

    /* renamed from: b.b.b.a0.z.g$a */
    public final class a<K, V> extends AbstractC0783x<Map<K, V>> {

        /* renamed from: a */
        public final AbstractC0783x<K> f4283a;

        /* renamed from: b */
        public final AbstractC0783x<V> f4284b;

        /* renamed from: c */
        public final InterfaceC0730t<? extends Map<K, V>> f4285c;

        public a(C0768i c0768i, Type type, AbstractC0783x<K> abstractC0783x, Type type2, AbstractC0783x<V> abstractC0783x2, InterfaceC0730t<? extends Map<K, V>> interfaceC0730t) {
            this.f4283a = new C0749n(c0768i, abstractC0783x, type);
            this.f4284b = new C0749n(c0768i, abstractC0783x2, type2);
            this.f4285c = interfaceC0730t;
        }

        @Override // p070b.p074b.p105b.AbstractC0783x
        /* renamed from: a */
        public Object mo2370a(C0759a c0759a) throws IOException {
            int i;
            EnumC0760b enumC0760bMo2403v = c0759a.mo2403v();
            if (enumC0760bMo2403v == EnumC0760b.NULL) {
                c0759a.mo2401r();
                return null;
            }
            Map<K, V> mapMo2365a = this.f4285c.mo2365a();
            if (enumC0760bMo2403v == EnumC0760b.BEGIN_ARRAY) {
                c0759a.mo2390a();
                while (c0759a.mo2395i()) {
                    c0759a.mo2390a();
                    K kMo2370a = this.f4283a.mo2370a(c0759a);
                    if (mapMo2365a.put(kMo2370a, this.f4284b.mo2370a(c0759a)) != null) {
                        throw new C0781v("duplicate key: " + kMo2370a);
                    }
                    c0759a.mo2392e();
                }
                c0759a.mo2392e();
            } else {
                c0759a.mo2391b();
                while (c0759a.mo2395i()) {
                    Objects.requireNonNull((C0759a.a) AbstractC0727q.f4233a);
                    if (c0759a instanceof C0740e) {
                        C0740e c0740e = (C0740e) c0759a;
                        c0740e.m2386C(EnumC0760b.NAME);
                        Map.Entry entry = (Map.Entry) ((Iterator) c0740e.m2387D()).next();
                        c0740e.m2389F(entry.getValue());
                        c0740e.m2389F(new C0778s((String) entry.getKey()));
                    } else {
                        int iM2431d = c0759a.f4404i;
                        if (iM2431d == 0) {
                            iM2431d = c0759a.m2431d();
                        }
                        if (iM2431d == 13) {
                            i = 9;
                        } else if (iM2431d == 12) {
                            i = 8;
                        } else {
                            if (iM2431d != 14) {
                                StringBuilder sbM2079g = C0561a.m2079g("Expected a name but was ");
                                sbM2079g.append(c0759a.mo2403v());
                                sbM2079g.append(c0759a.m2434k());
                                throw new IllegalStateException(sbM2079g.toString());
                            }
                            i = 10;
                        }
                        c0759a.f4404i = i;
                    }
                    K kMo2370a2 = this.f4283a.mo2370a(c0759a);
                    if (mapMo2365a.put(kMo2370a2, this.f4284b.mo2370a(c0759a)) != null) {
                        throw new C0781v("duplicate key: " + kMo2370a2);
                    }
                }
                c0759a.mo2393f();
            }
            return mapMo2365a;
        }

        @Override // p070b.p074b.p105b.AbstractC0783x
        /* renamed from: b */
        public void mo2371b(C0761c c0761c, Object obj) throws IOException {
            String strM2459d;
            Map map = (Map) obj;
            if (map == null) {
                c0761c.mo2409h();
                return;
            }
            if (C0742g.this.f4282c) {
                ArrayList arrayList = new ArrayList(map.size());
                ArrayList arrayList2 = new ArrayList(map.size());
                int i = 0;
                boolean z = false;
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    AbstractC0783x<K> abstractC0783x = this.f4283a;
                    K key = entry.getKey();
                    Objects.requireNonNull(abstractC0783x);
                    try {
                        C0741f c0741f = new C0741f();
                        abstractC0783x.mo2371b(c0741f, key);
                        if (!c0741f.f4278k.isEmpty()) {
                            throw new IllegalStateException("Expected one JSON element but was " + c0741f.f4278k);
                        }
                        AbstractC0773n abstractC0773n = c0741f.f4280m;
                        arrayList.add(abstractC0773n);
                        arrayList2.add(entry.getValue());
                        Objects.requireNonNull(abstractC0773n);
                        z |= (abstractC0773n instanceof C0770k) || (abstractC0773n instanceof C0776q);
                    } catch (IOException e2) {
                        throw new C0774o(e2);
                    }
                }
                if (z) {
                    c0761c.mo2404b();
                    int size = arrayList.size();
                    while (i < size) {
                        c0761c.mo2404b();
                        C0750o.f4341X.mo2371b(c0761c, (AbstractC0773n) arrayList.get(i));
                        this.f4284b.mo2371b(c0761c, arrayList2.get(i));
                        c0761c.mo2406e();
                        i++;
                    }
                    c0761c.mo2406e();
                    return;
                }
                c0761c.mo2405c();
                int size2 = arrayList.size();
                while (i < size2) {
                    AbstractC0773n abstractC0773n2 = (AbstractC0773n) arrayList.get(i);
                    Objects.requireNonNull(abstractC0773n2);
                    if (abstractC0773n2 instanceof C0778s) {
                        C0778s c0778sM2455a = abstractC0773n2.m2455a();
                        Object obj2 = c0778sM2455a.f4444a;
                        if (obj2 instanceof Number) {
                            strM2459d = String.valueOf(c0778sM2455a.m2458c());
                        } else if (obj2 instanceof Boolean) {
                            strM2459d = Boolean.toString(c0778sM2455a.m2457b());
                        } else {
                            if (!(obj2 instanceof String)) {
                                throw new AssertionError();
                            }
                            strM2459d = c0778sM2455a.m2459d();
                        }
                    } else {
                        if (!(abstractC0773n2 instanceof C0775p)) {
                            throw new AssertionError();
                        }
                        strM2459d = "null";
                    }
                    c0761c.mo2408g(strM2459d);
                    this.f4284b.mo2371b(c0761c, arrayList2.get(i));
                    i++;
                }
            } else {
                c0761c.mo2405c();
                for (Map.Entry<K, V> entry2 : map.entrySet()) {
                    c0761c.mo2408g(String.valueOf(entry2.getKey()));
                    this.f4284b.mo2371b(c0761c, entry2.getValue());
                }
            }
            c0761c.mo2407f();
        }
    }

    public C0742g(C0717g c0717g, boolean z) {
        this.f4281b = c0717g;
        this.f4282c = z;
    }

    @Override // p070b.p074b.p105b.InterfaceC0784y
    /* renamed from: a */
    public <T> AbstractC0783x<T> mo2367a(C0768i c0768i, C0757a<T> c0757a) {
        Type[] actualTypeArguments;
        Type type = c0757a.f4387b;
        if (!Map.class.isAssignableFrom(c0757a.f4386a)) {
            return null;
        }
        Class<?> clsM2359e = C0708a.m2359e(type);
        if (type == Properties.class) {
            actualTypeArguments = new Type[]{String.class, String.class};
        } else {
            Type typeM2360f = C0708a.m2360f(type, clsM2359e, Map.class);
            actualTypeArguments = typeM2360f instanceof ParameterizedType ? ((ParameterizedType) typeM2360f).getActualTypeArguments() : new Type[]{Object.class, Object.class};
        }
        Type type2 = actualTypeArguments[0];
        return new a(c0768i, actualTypeArguments[0], (type2 == Boolean.TYPE || type2 == Boolean.class) ? C0750o.f4349f : c0768i.m2451c(new C0757a<>(type2)), actualTypeArguments[1], c0768i.m2451c(new C0757a<>(actualTypeArguments[1])), this.f4281b.m2366a(c0757a));
    }
}
