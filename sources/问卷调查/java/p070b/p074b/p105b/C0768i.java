package p070b.p074b.p105b;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import p070b.p074b.p105b.p106a0.C0717g;
import p070b.p074b.p105b.p106a0.C0725o;
import p070b.p074b.p105b.p106a0.p108z.C0736a;
import p070b.p074b.p105b.p106a0.p108z.C0737b;
import p070b.p074b.p105b.p106a0.p108z.C0738c;
import p070b.p074b.p105b.p106a0.p108z.C0739d;
import p070b.p074b.p105b.p106a0.p108z.C0742g;
import p070b.p074b.p105b.p106a0.p108z.C0743h;
import p070b.p074b.p105b.p106a0.p108z.C0745j;
import p070b.p074b.p105b.p106a0.p108z.C0746k;
import p070b.p074b.p105b.p106a0.p108z.C0747l;
import p070b.p074b.p105b.p106a0.p108z.C0750o;
import p070b.p074b.p105b.p106a0.p108z.C0751p;
import p070b.p074b.p105b.p106a0.p108z.C0752q;
import p070b.p074b.p105b.p110b0.C0757a;
import p070b.p074b.p105b.p111c0.C0759a;
import p070b.p074b.p105b.p111c0.C0761c;

/* renamed from: b.b.b.i */
/* loaded from: classes.dex */
public final class C0768i {

    /* renamed from: f */
    public static final C0757a<?> f4434f = new C0757a<>(Object.class);

    /* renamed from: a */
    public final ThreadLocal<Map<C0757a<?>, a<?>>> f4435a;

    /* renamed from: b */
    public final Map<C0757a<?>, AbstractC0783x<?>> f4436b;

    /* renamed from: c */
    public final C0717g f4437c;

    /* renamed from: d */
    public final C0739d f4438d;

    /* renamed from: e */
    public final List<InterfaceC0784y> f4439e;

    /* renamed from: b.b.b.i$a */
    public static class a<T> extends AbstractC0783x<T> {

        /* renamed from: a */
        public AbstractC0783x<T> f4440a;

        @Override // p070b.p074b.p105b.AbstractC0783x
        /* renamed from: a */
        public T mo2370a(C0759a c0759a) {
            AbstractC0783x<T> abstractC0783x = this.f4440a;
            if (abstractC0783x != null) {
                return abstractC0783x.mo2370a(c0759a);
            }
            throw new IllegalStateException();
        }

        @Override // p070b.p074b.p105b.AbstractC0783x
        /* renamed from: b */
        public void mo2371b(C0761c c0761c, T t) {
            AbstractC0783x<T> abstractC0783x = this.f4440a;
            if (abstractC0783x == null) {
                throw new IllegalStateException();
            }
            abstractC0783x.mo2371b(c0761c, t);
        }
    }

    public C0768i() {
        C0725o c0725o = C0725o.f4223d;
        EnumC0758c enumC0758c = EnumC0758c.f4389b;
        Map mapEmptyMap = Collections.emptyMap();
        Collections.emptyList();
        Collections.emptyList();
        List listEmptyList = Collections.emptyList();
        this.f4435a = new ThreadLocal<>();
        this.f4436b = new ConcurrentHashMap();
        C0717g c0717g = new C0717g(mapEmptyMap);
        this.f4437c = c0717g;
        ArrayList arrayList = new ArrayList();
        arrayList.add(C0750o.f4342Y);
        arrayList.add(C0743h.f4287b);
        arrayList.add(c0725o);
        arrayList.addAll(listEmptyList);
        arrayList.add(C0750o.f4321D);
        arrayList.add(C0750o.f4356m);
        arrayList.add(C0750o.f4350g);
        arrayList.add(C0750o.f4352i);
        arrayList.add(C0750o.f4354k);
        AbstractC0783x<Number> abstractC0783x = C0750o.f4363t;
        arrayList.add(new C0752q(Long.TYPE, Long.class, abstractC0783x));
        arrayList.add(new C0752q(Double.TYPE, Double.class, new C0764e(this)));
        arrayList.add(new C0752q(Float.TYPE, Float.class, new C0765f(this)));
        arrayList.add(C0750o.f4367x);
        arrayList.add(C0750o.f4358o);
        arrayList.add(C0750o.f4360q);
        arrayList.add(new C0751p(AtomicLong.class, new C0782w(new C0766g(abstractC0783x))));
        arrayList.add(new C0751p(AtomicLongArray.class, new C0782w(new C0767h(abstractC0783x))));
        arrayList.add(C0750o.f4362s);
        arrayList.add(C0750o.f4369z);
        arrayList.add(C0750o.f4323F);
        arrayList.add(C0750o.f4325H);
        arrayList.add(new C0751p(BigDecimal.class, C0750o.f4319B));
        arrayList.add(new C0751p(BigInteger.class, C0750o.f4320C));
        arrayList.add(C0750o.f4327J);
        arrayList.add(C0750o.f4329L);
        arrayList.add(C0750o.f4333P);
        arrayList.add(C0750o.f4335R);
        arrayList.add(C0750o.f4340W);
        arrayList.add(C0750o.f4331N);
        arrayList.add(C0750o.f4347d);
        arrayList.add(C0738c.f4268b);
        arrayList.add(C0750o.f4338U);
        arrayList.add(C0747l.f4307b);
        arrayList.add(C0746k.f4305b);
        arrayList.add(C0750o.f4336S);
        arrayList.add(C0736a.f4262c);
        arrayList.add(C0750o.f4345b);
        arrayList.add(new C0737b(c0717g));
        arrayList.add(new C0742g(c0717g, false));
        C0739d c0739d = new C0739d(c0717g);
        this.f4438d = c0739d;
        arrayList.add(c0739d);
        arrayList.add(C0750o.f4343Z);
        arrayList.add(new C0745j(c0717g, enumC0758c, c0725o, c0739d));
        this.f4439e = Collections.unmodifiableList(arrayList);
    }

    /* renamed from: a */
    public static void m2449a(double d2) {
        if (Double.isNaN(d2) || Double.isInfinite(d2)) {
            throw new IllegalArgumentException(d2 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0063 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <T> T m2450b(java.lang.String r6, java.lang.Class<T> r7) {
        /*
            Method dump skipped, instructions count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p070b.p074b.p105b.C0768i.m2450b(java.lang.String, java.lang.Class):java.lang.Object");
    }

    /* renamed from: c */
    public <T> AbstractC0783x<T> m2451c(C0757a<T> c0757a) {
        AbstractC0783x<T> abstractC0783x = (AbstractC0783x) this.f4436b.get(c0757a);
        if (abstractC0783x != null) {
            return abstractC0783x;
        }
        Map<C0757a<?>, a<?>> map = this.f4435a.get();
        boolean z = false;
        if (map == null) {
            map = new HashMap<>();
            this.f4435a.set(map);
            z = true;
        }
        a<?> aVar = map.get(c0757a);
        if (aVar != null) {
            return aVar;
        }
        try {
            a<?> aVar2 = new a<>();
            map.put(c0757a, aVar2);
            Iterator<InterfaceC0784y> it = this.f4439e.iterator();
            while (it.hasNext()) {
                AbstractC0783x<T> abstractC0783xMo2367a = it.next().mo2367a(this, c0757a);
                if (abstractC0783xMo2367a != null) {
                    if (aVar2.f4440a != null) {
                        throw new AssertionError();
                    }
                    aVar2.f4440a = abstractC0783xMo2367a;
                    this.f4436b.put(c0757a, abstractC0783xMo2367a);
                    return abstractC0783xMo2367a;
                }
            }
            throw new IllegalArgumentException("GSON (2.8.6) cannot handle " + c0757a);
        } finally {
            map.remove(c0757a);
            if (z) {
                this.f4435a.remove();
            }
        }
    }

    /* renamed from: d */
    public <T> AbstractC0783x<T> m2452d(InterfaceC0784y interfaceC0784y, C0757a<T> c0757a) {
        if (!this.f4439e.contains(interfaceC0784y)) {
            interfaceC0784y = this.f4438d;
        }
        boolean z = false;
        for (InterfaceC0784y interfaceC0784y2 : this.f4439e) {
            if (z) {
                AbstractC0783x<T> abstractC0783xMo2367a = interfaceC0784y2.mo2367a(this, c0757a);
                if (abstractC0783xMo2367a != null) {
                    return abstractC0783xMo2367a;
                }
            } else if (interfaceC0784y2 == interfaceC0784y) {
                z = true;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize " + c0757a);
    }

    public String toString() {
        return "{serializeNulls:false,factories:" + this.f4439e + ",instanceCreators:" + this.f4437c + "}";
    }
}
