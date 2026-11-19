package kotlin.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC9979u;
import p296pd.InterfaceC10659g;
import p325rc.AbstractC10965p0;
import p325rc.AbstractC10967q0;

/* renamed from: kotlin.collections.a */
/* loaded from: classes6.dex */
public abstract class AbstractC9925a extends AbstractC10967q0 {
    /* renamed from: h */
    public static Map m20088h() {
        EmptyMap emptyMap = EmptyMap.f23281c;
        AbstractC9979u.m20292e(emptyMap, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return emptyMap;
    }

    /* renamed from: i */
    public static Object m20089i(Map map, Object obj) {
        AbstractC9979u.m20294g(map, "<this>");
        return AbstractC10965p0.m24034a(map, obj);
    }

    /* renamed from: j */
    public static HashMap m20090j(Pair... pairs) {
        AbstractC9979u.m20294g(pairs, "pairs");
        HashMap map = new HashMap(AbstractC10967q0.m24038e(pairs.length));
        m20098r(map, pairs);
        return map;
    }

    /* renamed from: k */
    public static Map m20091k(Pair... pairs) {
        AbstractC9979u.m20294g(pairs, "pairs");
        return pairs.length > 0 ? m20103w(pairs, new LinkedHashMap(AbstractC10967q0.m24038e(pairs.length))) : m20088h();
    }

    /* renamed from: l */
    public static Map m20092l(Pair... pairs) {
        AbstractC9979u.m20294g(pairs, "pairs");
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC10967q0.m24038e(pairs.length));
        m20098r(linkedHashMap, pairs);
        return linkedHashMap;
    }

    /* renamed from: m */
    public static final Map m20093m(Map map) {
        AbstractC9979u.m20294g(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? map : AbstractC10967q0.m24040g(map) : m20088h();
    }

    /* renamed from: n */
    public static Map m20094n(Map map, Map map2) {
        AbstractC9979u.m20294g(map, "<this>");
        AbstractC9979u.m20294g(map2, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    /* renamed from: o */
    public static Map m20095o(Map map, Pair pair) {
        AbstractC9979u.m20294g(map, "<this>");
        AbstractC9979u.m20294g(pair, "pair");
        if (map.isEmpty()) {
            return AbstractC10967q0.m24039f(pair);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(pair.m20051f(), pair.m20052g());
        return linkedHashMap;
    }

    /* renamed from: p */
    public static void m20096p(Map map, Iterable pairs) {
        AbstractC9979u.m20294g(map, "<this>");
        AbstractC9979u.m20294g(pairs, "pairs");
        Iterator it = pairs.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            map.put(pair.m20048a(), pair.m20049c());
        }
    }

    /* renamed from: q */
    public static void m20097q(Map map, InterfaceC10659g pairs) {
        AbstractC9979u.m20294g(map, "<this>");
        AbstractC9979u.m20294g(pairs, "pairs");
        Iterator it = pairs.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            map.put(pair.m20048a(), pair.m20049c());
        }
    }

    /* renamed from: r */
    public static void m20098r(Map map, Pair[] pairs) {
        AbstractC9979u.m20294g(map, "<this>");
        AbstractC9979u.m20294g(pairs, "pairs");
        for (Pair pair : pairs) {
            map.put(pair.m20048a(), pair.m20049c());
        }
    }

    /* renamed from: s */
    public static Map m20099s(Iterable iterable) {
        AbstractC9979u.m20294g(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return m20093m(m20100t(iterable, new LinkedHashMap()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return m20088h();
        }
        if (size != 1) {
            return m20100t(iterable, new LinkedHashMap(AbstractC10967q0.m24038e(collection.size())));
        }
        return AbstractC10967q0.m24039f((Pair) (iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next()));
    }

    /* renamed from: t */
    public static final Map m20100t(Iterable iterable, Map destination) {
        AbstractC9979u.m20294g(iterable, "<this>");
        AbstractC9979u.m20294g(destination, "destination");
        m20096p(destination, iterable);
        return destination;
    }

    /* renamed from: u */
    public static Map m20101u(Map map) {
        AbstractC9979u.m20294g(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? m20104x(map) : AbstractC10967q0.m24040g(map) : m20088h();
    }

    /* renamed from: v */
    public static Map m20102v(Pair[] pairArr) {
        AbstractC9979u.m20294g(pairArr, "<this>");
        int length = pairArr.length;
        return length != 0 ? length != 1 ? m20103w(pairArr, new LinkedHashMap(AbstractC10967q0.m24038e(pairArr.length))) : AbstractC10967q0.m24039f(pairArr[0]) : m20088h();
    }

    /* renamed from: w */
    public static final Map m20103w(Pair[] pairArr, Map destination) {
        AbstractC9979u.m20294g(pairArr, "<this>");
        AbstractC9979u.m20294g(destination, "destination");
        m20098r(destination, pairArr);
        return destination;
    }

    /* renamed from: x */
    public static Map m20104x(Map map) {
        AbstractC9979u.m20294g(map, "<this>");
        return new LinkedHashMap(map);
    }
}
