package p246s8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.AbstractC9137y;
import p089e8.InterfaceC8375c;
import p089e8.InterfaceC8377e;
import p089e8.InterfaceC8387o;
import p134i7.AbstractC8811w;
import p257t8.AbstractC10124a;
import p290w8.AbstractC10414k2;
import p290w8.AbstractC10461w1;
import p290w8.AbstractC10465x1;
import p290w8.C10363a1;
import p290w8.C10386f;
import p290w8.C10424n0;
import p290w8.C10432p0;
import p290w8.C10468y0;
import p300x7.InterfaceC10559a;
import p301x8.AbstractC10583a;
import p301x8.AbstractC10584b;

/* renamed from: s8.s */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class AbstractC10069s {
    /* renamed from: b */
    public static final InterfaceC10052b m18786b(InterfaceC8375c interfaceC8375c, List list, InterfaceC10559a interfaceC10559a) {
        if (AbstractC9133u.m16128b(interfaceC8375c, AbstractC9137y.m16154b(Collection.class)) || AbstractC9133u.m16128b(interfaceC8375c, AbstractC9137y.m16154b(List.class)) || AbstractC9133u.m16128b(interfaceC8375c, AbstractC9137y.m16154b(List.class)) || AbstractC9133u.m16128b(interfaceC8375c, AbstractC9137y.m16154b(ArrayList.class))) {
            return new C10386f((InterfaceC10052b) list.get(0));
        }
        if (AbstractC9133u.m16128b(interfaceC8375c, AbstractC9137y.m16154b(HashSet.class))) {
            return new C10432p0((InterfaceC10052b) list.get(0));
        }
        if (AbstractC9133u.m16128b(interfaceC8375c, AbstractC9137y.m16154b(Set.class)) || AbstractC9133u.m16128b(interfaceC8375c, AbstractC9137y.m16154b(Set.class)) || AbstractC9133u.m16128b(interfaceC8375c, AbstractC9137y.m16154b(LinkedHashSet.class))) {
            return new C10363a1((InterfaceC10052b) list.get(0));
        }
        if (AbstractC9133u.m16128b(interfaceC8375c, AbstractC9137y.m16154b(HashMap.class))) {
            return new C10424n0((InterfaceC10052b) list.get(0), (InterfaceC10052b) list.get(1));
        }
        if (AbstractC9133u.m16128b(interfaceC8375c, AbstractC9137y.m16154b(Map.class)) || AbstractC9133u.m16128b(interfaceC8375c, AbstractC9137y.m16154b(Map.class)) || AbstractC9133u.m16128b(interfaceC8375c, AbstractC9137y.m16154b(LinkedHashMap.class))) {
            return new C10468y0((InterfaceC10052b) list.get(0), (InterfaceC10052b) list.get(1));
        }
        if (AbstractC9133u.m16128b(interfaceC8375c, AbstractC9137y.m16154b(Map.Entry.class))) {
            return AbstractC10124a.m18898j((InterfaceC10052b) list.get(0), (InterfaceC10052b) list.get(1));
        }
        if (AbstractC9133u.m16128b(interfaceC8375c, AbstractC9137y.m16154b(Pair.class))) {
            return AbstractC10124a.m18900l((InterfaceC10052b) list.get(0), (InterfaceC10052b) list.get(1));
        }
        if (AbstractC9133u.m16128b(interfaceC8375c, AbstractC9137y.m16154b(Triple.class))) {
            return AbstractC10124a.m18902n((InterfaceC10052b) list.get(0), (InterfaceC10052b) list.get(1), (InterfaceC10052b) list.get(2));
        }
        if (!AbstractC10461w1.m19557o(interfaceC8375c)) {
            return null;
        }
        Object objInvoke = interfaceC10559a.invoke();
        AbstractC9133u.m16131e(objInvoke, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
        return AbstractC10124a.m18889a((InterfaceC8375c) objInvoke, (InterfaceC10052b) list.get(0));
    }

    /* renamed from: c */
    public static final InterfaceC10052b m18787c(InterfaceC8375c interfaceC8375c, List list) {
        InterfaceC10052b[] interfaceC10052bArr = (InterfaceC10052b[]) list.toArray(new InterfaceC10052b[0]);
        return AbstractC10461w1.m19545c(interfaceC8375c, (InterfaceC10052b[]) Arrays.copyOf(interfaceC10052bArr, interfaceC10052bArr.length));
    }

    /* renamed from: d */
    public static final InterfaceC10052b m18788d(InterfaceC10052b interfaceC10052b, boolean z10) {
        if (z10) {
            return AbstractC10124a.m18907s(interfaceC10052b);
        }
        AbstractC9133u.m16131e(interfaceC10052b, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.SerializersKt__SerializersKt.nullable?>");
        return interfaceC10052b;
    }

    /* renamed from: e */
    public static final InterfaceC10052b m18789e(InterfaceC8375c interfaceC8375c, List serializers, InterfaceC10559a elementClassifierIfArray) {
        AbstractC9133u.m16133g(interfaceC8375c, "<this>");
        AbstractC9133u.m16133g(serializers, "serializers");
        AbstractC9133u.m16133g(elementClassifierIfArray, "elementClassifierIfArray");
        InterfaceC10052b interfaceC10052bM18786b = m18786b(interfaceC8375c, serializers, elementClassifierIfArray);
        return interfaceC10052bM18786b == null ? m18787c(interfaceC8375c, serializers) : interfaceC10052bM18786b;
    }

    /* renamed from: f */
    public static final InterfaceC10052b m18790f(InterfaceC8375c interfaceC8375c) {
        AbstractC9133u.m16133g(interfaceC8375c, "<this>");
        InterfaceC10052b interfaceC10052bM18781e = AbstractC10067q.m18781e(interfaceC8375c);
        if (interfaceC10052bM18781e != null) {
            return interfaceC10052bM18781e;
        }
        AbstractC10465x1.m19569f(interfaceC8375c);
        throw new KotlinNothingValueException();
    }

    /* renamed from: g */
    public static final InterfaceC10052b m18791g(InterfaceC8387o type) {
        AbstractC9133u.m16133g(type, "type");
        return AbstractC10067q.m18780d(AbstractC10584b.m19742a(), type);
    }

    /* renamed from: h */
    public static final InterfaceC10052b m18792h(AbstractC10583a abstractC10583a, InterfaceC8387o type) {
        AbstractC9133u.m16133g(abstractC10583a, "<this>");
        AbstractC9133u.m16133g(type, "type");
        InterfaceC10052b interfaceC10052bM18793i = m18793i(abstractC10583a, type, true);
        if (interfaceC10052bM18793i != null) {
            return interfaceC10052bM18793i;
        }
        AbstractC10461w1.m19558p(AbstractC10465x1.m19566c(type));
        throw new KotlinNothingValueException();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final p246s8.InterfaceC10052b m18793i(p301x8.AbstractC10583a r6, p089e8.InterfaceC8387o r7, boolean r8) {
        /*
            e8.c r0 = p290w8.AbstractC10465x1.m19566c(r7)
            boolean r1 = r7.mo13675a()
            java.util.List r7 = r7.getArguments()
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r3 = p134i7.AbstractC8811w.m14786x(r7, r3)
            r2.<init>(r3)
            java.util.Iterator r7 = r7.iterator()
        L1b:
            boolean r3 = r7.hasNext()
            r4 = 0
            if (r3 == 0) goto L31
            java.lang.Object r3 = r7.next()
            com.blankj.utilcode.util.AbstractC5379p.m2596a(r3)
            e8.o r3 = p290w8.AbstractC10465x1.m19570g(r4)
            r2.add(r3)
            goto L1b
        L31:
            boolean r7 = r2.isEmpty()
            r3 = 2
            if (r7 == 0) goto L4b
            boolean r7 = p290w8.AbstractC10461w1.m19554l(r0)
            if (r7 == 0) goto L46
            s8.b r7 = p301x8.AbstractC10583a.m19741c(r6, r0, r4, r3, r4)
            if (r7 == 0) goto L46
        L44:
            r7 = r4
            goto L5f
        L46:
            s8.b r7 = p246s8.AbstractC10066p.m18775m(r0, r1)
            goto L5f
        L4b:
            boolean r7 = r6.mo16912d()
            if (r7 == 0) goto L52
            goto L44
        L52:
            java.lang.Object r7 = p246s8.AbstractC10066p.m18776n(r0, r2, r1)
            boolean r5 = kotlin.Result.m15913g(r7)
            if (r5 == 0) goto L5d
            r7 = r4
        L5d:
            s8.b r7 = (p246s8.InterfaceC10052b) r7
        L5f:
            if (r7 == 0) goto L62
            return r7
        L62:
            boolean r7 = r2.isEmpty()
            if (r7 == 0) goto L83
            s8.b r7 = p246s8.AbstractC10067q.m18781e(r0)
            if (r7 != 0) goto La8
            s8.b r7 = p301x8.AbstractC10583a.m19741c(r6, r0, r4, r3, r4)
            if (r7 != 0) goto La8
            boolean r6 = p290w8.AbstractC10461w1.m19554l(r0)
            if (r6 == 0) goto L81
            s8.f r6 = new s8.f
            r6.<init>(r0)
        L7f:
            r7 = r6
            goto La8
        L81:
            r7 = r4
            goto La8
        L83:
            java.util.List r7 = p246s8.AbstractC10067q.m18784h(r6, r2, r8)
            if (r7 != 0) goto L8a
            return r4
        L8a:
            s8.r r8 = new s8.r
            r8.<init>()
            s8.b r8 = p246s8.AbstractC10067q.m18777a(r0, r7, r8)
            if (r8 != 0) goto La7
            s8.b r7 = r6.mo16911b(r0, r7)
            if (r7 != 0) goto La8
            boolean r6 = p290w8.AbstractC10461w1.m19554l(r0)
            if (r6 == 0) goto L81
            s8.f r6 = new s8.f
            r6.<init>(r0)
            goto L7f
        La7:
            r7 = r8
        La8:
            if (r7 == 0) goto Laf
            s8.b r6 = m18788d(r7, r1)
            return r6
        Laf:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p246s8.AbstractC10069s.m18793i(x8.a, e8.o, boolean):s8.b");
    }

    /* renamed from: j */
    public static final InterfaceC8377e m18794j(List list) {
        return ((InterfaceC8387o) list.get(0)).mo13676b();
    }

    /* renamed from: k */
    public static final InterfaceC10052b m18795k(InterfaceC8375c interfaceC8375c) {
        AbstractC9133u.m16133g(interfaceC8375c, "<this>");
        InterfaceC10052b interfaceC10052bM19544b = AbstractC10461w1.m19544b(interfaceC8375c);
        return interfaceC10052bM19544b == null ? AbstractC10414k2.m19456b(interfaceC8375c) : interfaceC10052bM19544b;
    }

    /* renamed from: l */
    public static final InterfaceC10052b m18796l(InterfaceC8387o type) {
        AbstractC9133u.m16133g(type, "type");
        return AbstractC10067q.m18783g(AbstractC10584b.m19742a(), type);
    }

    /* renamed from: m */
    public static final InterfaceC10052b m18797m(AbstractC10583a abstractC10583a, InterfaceC8387o type) {
        AbstractC9133u.m16133g(abstractC10583a, "<this>");
        AbstractC9133u.m16133g(type, "type");
        return m18793i(abstractC10583a, type, false);
    }

    /* renamed from: n */
    public static final List m18798n(AbstractC10583a abstractC10583a, List typeArguments, boolean z10) {
        AbstractC9133u.m16133g(abstractC10583a, "<this>");
        AbstractC9133u.m16133g(typeArguments, "typeArguments");
        if (z10) {
            ArrayList arrayList = new ArrayList(AbstractC8811w.m14786x(typeArguments, 10));
            Iterator it = typeArguments.iterator();
            while (it.hasNext()) {
                arrayList.add(AbstractC10067q.m18780d(abstractC10583a, (InterfaceC8387o) it.next()));
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(AbstractC8811w.m14786x(typeArguments, 10));
        Iterator it2 = typeArguments.iterator();
        while (it2.hasNext()) {
            InterfaceC10052b interfaceC10052bM18783g = AbstractC10067q.m18783g(abstractC10583a, (InterfaceC8387o) it2.next());
            if (interfaceC10052bM18783g == null) {
                return null;
            }
            arrayList2.add(interfaceC10052bM18783g);
        }
        return arrayList2;
    }
}
