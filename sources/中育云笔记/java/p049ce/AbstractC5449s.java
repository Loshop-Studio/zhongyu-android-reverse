package p049ce;

import de.AbstractC9025a;
import ge.AbstractC9347k2;
import ge.AbstractC9394w1;
import ge.AbstractC9398x1;
import ge.C9296a1;
import ge.C9319f;
import ge.C9357n0;
import ge.C9365p0;
import ge.C9401y0;
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
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.AbstractC9983y;
import p181hd.InterfaceC9529a;
import p182he.AbstractC9553a;
import p182he.AbstractC9554b;
import p280od.InterfaceC10469c;
import p280od.InterfaceC10471e;
import p280od.InterfaceC10481o;
import p325rc.AbstractC10980x;

/* renamed from: ce.s */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC5449s {
    /* renamed from: b */
    public static final InterfaceC5432b m2960b(InterfaceC10469c interfaceC10469c, List list, InterfaceC9529a interfaceC9529a) {
        if (AbstractC9979u.m20289b(interfaceC10469c, AbstractC9983y.m20315b(Collection.class)) || AbstractC9979u.m20289b(interfaceC10469c, AbstractC9983y.m20315b(List.class)) || AbstractC9979u.m20289b(interfaceC10469c, AbstractC9983y.m20315b(List.class)) || AbstractC9979u.m20289b(interfaceC10469c, AbstractC9983y.m20315b(ArrayList.class))) {
            return new C9319f((InterfaceC5432b) list.get(0));
        }
        if (AbstractC9979u.m20289b(interfaceC10469c, AbstractC9983y.m20315b(HashSet.class))) {
            return new C9365p0((InterfaceC5432b) list.get(0));
        }
        if (AbstractC9979u.m20289b(interfaceC10469c, AbstractC9983y.m20315b(Set.class)) || AbstractC9979u.m20289b(interfaceC10469c, AbstractC9983y.m20315b(Set.class)) || AbstractC9979u.m20289b(interfaceC10469c, AbstractC9983y.m20315b(LinkedHashSet.class))) {
            return new C9296a1((InterfaceC5432b) list.get(0));
        }
        if (AbstractC9979u.m20289b(interfaceC10469c, AbstractC9983y.m20315b(HashMap.class))) {
            return new C9357n0((InterfaceC5432b) list.get(0), (InterfaceC5432b) list.get(1));
        }
        if (AbstractC9979u.m20289b(interfaceC10469c, AbstractC9983y.m20315b(Map.class)) || AbstractC9979u.m20289b(interfaceC10469c, AbstractC9983y.m20315b(Map.class)) || AbstractC9979u.m20289b(interfaceC10469c, AbstractC9983y.m20315b(LinkedHashMap.class))) {
            return new C9401y0((InterfaceC5432b) list.get(0), (InterfaceC5432b) list.get(1));
        }
        if (AbstractC9979u.m20289b(interfaceC10469c, AbstractC9983y.m20315b(Map.Entry.class))) {
            return AbstractC9025a.m17652j((InterfaceC5432b) list.get(0), (InterfaceC5432b) list.get(1));
        }
        if (AbstractC9979u.m20289b(interfaceC10469c, AbstractC9983y.m20315b(Pair.class))) {
            return AbstractC9025a.m17655m((InterfaceC5432b) list.get(0), (InterfaceC5432b) list.get(1));
        }
        if (AbstractC9979u.m20289b(interfaceC10469c, AbstractC9983y.m20315b(Triple.class))) {
            return AbstractC9025a.m17657o((InterfaceC5432b) list.get(0), (InterfaceC5432b) list.get(1), (InterfaceC5432b) list.get(2));
        }
        if (!AbstractC9394w1.m18585o(interfaceC10469c)) {
            return null;
        }
        Object objInvoke = interfaceC9529a.invoke();
        AbstractC9979u.m20292e(objInvoke, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
        return AbstractC9025a.m17643a((InterfaceC10469c) objInvoke, (InterfaceC5432b) list.get(0));
    }

    /* renamed from: c */
    public static final InterfaceC5432b m2961c(InterfaceC10469c interfaceC10469c, List list) {
        InterfaceC5432b[] interfaceC5432bArr = (InterfaceC5432b[]) list.toArray(new InterfaceC5432b[0]);
        return AbstractC9394w1.m18574d(interfaceC10469c, (InterfaceC5432b[]) Arrays.copyOf(interfaceC5432bArr, interfaceC5432bArr.length));
    }

    /* renamed from: d */
    public static final InterfaceC5432b m2962d(InterfaceC5432b interfaceC5432b, boolean z10) {
        if (z10) {
            return AbstractC9025a.m17662t(interfaceC5432b);
        }
        AbstractC9979u.m20292e(interfaceC5432b, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.SerializersKt__SerializersKt.nullable?>");
        return interfaceC5432b;
    }

    /* renamed from: e */
    public static final InterfaceC5432b m2963e(InterfaceC10469c interfaceC10469c, List serializers, InterfaceC9529a elementClassifierIfArray) {
        AbstractC9979u.m20294g(interfaceC10469c, "<this>");
        AbstractC9979u.m20294g(serializers, "serializers");
        AbstractC9979u.m20294g(elementClassifierIfArray, "elementClassifierIfArray");
        InterfaceC5432b interfaceC5432bM2960b = m2960b(interfaceC10469c, serializers, elementClassifierIfArray);
        return interfaceC5432bM2960b == null ? m2961c(interfaceC10469c, serializers) : interfaceC5432bM2960b;
    }

    /* renamed from: f */
    public static final InterfaceC5432b m2964f(AbstractC9553a abstractC9553a, InterfaceC10481o type) {
        AbstractC9979u.m20294g(abstractC9553a, "<this>");
        AbstractC9979u.m20294g(type, "type");
        InterfaceC5432b interfaceC5432bM2967i = m2967i(abstractC9553a, type, true);
        if (interfaceC5432bM2967i != null) {
            return interfaceC5432bM2967i;
        }
        AbstractC9394w1.m18586p(AbstractC9398x1.m18594c(type));
        throw new KotlinNothingValueException();
    }

    /* renamed from: g */
    public static final InterfaceC5432b m2965g(InterfaceC10469c interfaceC10469c) {
        AbstractC9979u.m20294g(interfaceC10469c, "<this>");
        InterfaceC5432b interfaceC5432bM2956f = AbstractC5447q.m2956f(interfaceC10469c);
        if (interfaceC5432bM2956f != null) {
            return interfaceC5432bM2956f;
        }
        AbstractC9398x1.m18597f(interfaceC10469c);
        throw new KotlinNothingValueException();
    }

    /* renamed from: h */
    public static final InterfaceC5432b m2966h(InterfaceC10481o type) {
        AbstractC9979u.m20294g(type, "type");
        return AbstractC5447q.m2952b(AbstractC9554b.m18782a(), type);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final p049ce.InterfaceC5432b m2967i(p182he.AbstractC9553a r6, p280od.InterfaceC10481o r7, boolean r8) {
        /*
            od.c r0 = ge.AbstractC9398x1.m18594c(r7)
            boolean r1 = r7.mo18565a()
            java.util.List r7 = r7.getArguments()
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r3 = p325rc.AbstractC10980x.m24153x(r7, r3)
            r2.<init>(r3)
            java.util.Iterator r7 = r7.iterator()
        L1d:
            boolean r3 = r7.hasNext()
            r4 = 0
            if (r3 == 0) goto L33
            java.lang.Object r3 = r7.next()
            p212k.AbstractC9764r.m19682a(r3)
            od.o r3 = ge.AbstractC9398x1.m18598g(r4)
            r2.add(r3)
            goto L1d
        L33:
            boolean r7 = r2.isEmpty()
            r3 = 2
            if (r7 == 0) goto L4d
            boolean r7 = ge.AbstractC9394w1.m18582l(r0)
            if (r7 == 0) goto L48
            ce.b r7 = p182he.AbstractC9553a.m18776c(r6, r0, r4, r3, r4)
            if (r7 == 0) goto L48
        L46:
            r7 = r4
            goto L61
        L48:
            ce.b r7 = p049ce.AbstractC5446p.m2949m(r0, r1)
            goto L61
        L4d:
            boolean r7 = r6.mo18779d()
            if (r7 == 0) goto L54
            goto L46
        L54:
            java.lang.Object r7 = p049ce.AbstractC5446p.m2950n(r0, r2, r1)
            boolean r5 = kotlin.Result.m20058g(r7)
            if (r5 == 0) goto L5f
            r7 = r4
        L5f:
            ce.b r7 = (p049ce.InterfaceC5432b) r7
        L61:
            if (r7 == 0) goto L64
            return r7
        L64:
            boolean r7 = r2.isEmpty()
            if (r7 == 0) goto L85
            ce.b r7 = p049ce.AbstractC5447q.m2956f(r0)
            if (r7 != 0) goto Laa
            ce.b r7 = p182he.AbstractC9553a.m18776c(r6, r0, r4, r3, r4)
            if (r7 != 0) goto Laa
            boolean r6 = ge.AbstractC9394w1.m18582l(r0)
            if (r6 == 0) goto L83
            ce.f r6 = new ce.f
            r6.<init>(r0)
        L81:
            r7 = r6
            goto Laa
        L83:
            r7 = r4
            goto Laa
        L85:
            java.util.List r7 = p049ce.AbstractC5447q.m2958h(r6, r2, r8)
            if (r7 != 0) goto L8c
            return r4
        L8c:
            ce.r r8 = new ce.r
            r8.<init>()
            ce.b r8 = p049ce.AbstractC5447q.m2951a(r0, r7, r8)
            if (r8 != 0) goto La9
            ce.b r7 = r6.mo18778b(r0, r7)
            if (r7 != 0) goto Laa
            boolean r6 = ge.AbstractC9394w1.m18582l(r0)
            if (r6 == 0) goto L83
            ce.f r6 = new ce.f
            r6.<init>(r0)
            goto L81
        La9:
            r7 = r8
        Laa:
            if (r7 == 0) goto Lb1
            ce.b r6 = m2962d(r7, r1)
            return r6
        Lb1:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p049ce.AbstractC5449s.m2967i(he.a, od.o, boolean):ce.b");
    }

    /* renamed from: j */
    public static final InterfaceC10471e m2968j(List list) {
        return ((InterfaceC10481o) list.get(0)).mo18566c();
    }

    /* renamed from: k */
    public static final InterfaceC5432b m2969k(AbstractC9553a abstractC9553a, InterfaceC10481o type) {
        AbstractC9979u.m20294g(abstractC9553a, "<this>");
        AbstractC9979u.m20294g(type, "type");
        return m2967i(abstractC9553a, type, false);
    }

    /* renamed from: l */
    public static final InterfaceC5432b m2970l(InterfaceC10469c interfaceC10469c) {
        AbstractC9979u.m20294g(interfaceC10469c, "<this>");
        InterfaceC5432b interfaceC5432bM18572b = AbstractC9394w1.m18572b(interfaceC10469c);
        return interfaceC5432bM18572b == null ? AbstractC9347k2.m18482b(interfaceC10469c) : interfaceC5432bM18572b;
    }

    /* renamed from: m */
    public static final InterfaceC5432b m2971m(InterfaceC10481o type) {
        AbstractC9979u.m20294g(type, "type");
        return AbstractC5447q.m2955e(AbstractC9554b.m18782a(), type);
    }

    /* renamed from: n */
    public static final List m2972n(AbstractC9553a abstractC9553a, List typeArguments, boolean z10) {
        AbstractC9979u.m20294g(abstractC9553a, "<this>");
        AbstractC9979u.m20294g(typeArguments, "typeArguments");
        if (z10) {
            List list = typeArguments;
            ArrayList arrayList = new ArrayList(AbstractC10980x.m24153x(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(AbstractC5447q.m2952b(abstractC9553a, (InterfaceC10481o) it.next()));
            }
            return arrayList;
        }
        List list2 = typeArguments;
        ArrayList arrayList2 = new ArrayList(AbstractC10980x.m24153x(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            InterfaceC5432b interfaceC5432bM2955e = AbstractC5447q.m2955e(abstractC9553a, (InterfaceC10481o) it2.next());
            if (interfaceC5432bM2955e == null) {
                return null;
            }
            arrayList2.add(interfaceC5432bM2955e);
        }
        return arrayList2;
    }
}
