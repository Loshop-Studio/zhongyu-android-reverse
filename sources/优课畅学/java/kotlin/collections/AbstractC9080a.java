package kotlin.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC9133u;
import p101f8.InterfaceC8469g;
import p134i7.AbstractC8796o0;
import p134i7.AbstractC8798p0;

/* renamed from: kotlin.collections.a */
/* loaded from: classes5.dex */
public abstract class AbstractC9080a extends AbstractC8798p0 {
    /* renamed from: h */
    public static Map m15943h() {
        EmptyMap emptyMap = EmptyMap.f17368a;
        AbstractC9133u.m16131e(emptyMap, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return emptyMap;
    }

    /* renamed from: i */
    public static Object m15944i(Map map, Object obj) {
        AbstractC9133u.m16133g(map, "<this>");
        return AbstractC8796o0.m14610a(map, obj);
    }

    /* renamed from: j */
    public static HashMap m15945j(Pair... pairs) {
        AbstractC9133u.m16133g(pairs, "pairs");
        HashMap map = new HashMap(AbstractC8798p0.m14663e(pairs.length));
        m15953r(map, pairs);
        return map;
    }

    /* renamed from: k */
    public static Map m15946k(Pair... pairs) {
        AbstractC9133u.m16133g(pairs, "pairs");
        return pairs.length > 0 ? m15958w(pairs, new LinkedHashMap(AbstractC8798p0.m14663e(pairs.length))) : m15943h();
    }

    /* renamed from: l */
    public static Map m15947l(Pair... pairs) {
        AbstractC9133u.m16133g(pairs, "pairs");
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC8798p0.m14663e(pairs.length));
        m15953r(linkedHashMap, pairs);
        return linkedHashMap;
    }

    /* renamed from: m */
    public static final Map m15948m(Map map) {
        AbstractC9133u.m16133g(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? map : AbstractC8798p0.m14665g(map) : m15943h();
    }

    /* renamed from: n */
    public static Map m15949n(Map map, Map map2) {
        AbstractC9133u.m16133g(map, "<this>");
        AbstractC9133u.m16133g(map2, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    /* renamed from: o */
    public static Map m15950o(Map map, Pair pair) {
        AbstractC9133u.m16133g(map, "<this>");
        AbstractC9133u.m16133g(pair, "pair");
        if (map.isEmpty()) {
            return AbstractC8798p0.m14664f(pair);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(pair.m15906e(), pair.m15907g());
        return linkedHashMap;
    }

    /* renamed from: p */
    public static void m15951p(Map map, InterfaceC8469g pairs) {
        AbstractC9133u.m16133g(map, "<this>");
        AbstractC9133u.m16133g(pairs, "pairs");
        Iterator it = pairs.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            map.put(pair.m15903a(), pair.m15904b());
        }
    }

    /* renamed from: q */
    public static void m15952q(Map map, Iterable pairs) {
        AbstractC9133u.m16133g(map, "<this>");
        AbstractC9133u.m16133g(pairs, "pairs");
        Iterator it = pairs.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            map.put(pair.m15903a(), pair.m15904b());
        }
    }

    /* renamed from: r */
    public static void m15953r(Map map, Pair[] pairs) {
        AbstractC9133u.m16133g(map, "<this>");
        AbstractC9133u.m16133g(pairs, "pairs");
        for (Pair pair : pairs) {
            map.put(pair.m15903a(), pair.m15904b());
        }
    }

    /* renamed from: s */
    public static Map m15954s(Iterable iterable) {
        AbstractC9133u.m16133g(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return m15948m(m15955t(iterable, new LinkedHashMap()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return m15943h();
        }
        if (size != 1) {
            return m15955t(iterable, new LinkedHashMap(AbstractC8798p0.m14663e(collection.size())));
        }
        return AbstractC8798p0.m14664f((Pair) (iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next()));
    }

    /* renamed from: t */
    public static final Map m15955t(Iterable iterable, Map destination) {
        AbstractC9133u.m16133g(iterable, "<this>");
        AbstractC9133u.m16133g(destination, "destination");
        m15952q(destination, iterable);
        return destination;
    }

    /* renamed from: u */
    public static Map m15956u(Map map) {
        AbstractC9133u.m16133g(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? m15959x(map) : AbstractC8798p0.m14665g(map) : m15943h();
    }

    /* renamed from: v */
    public static Map m15957v(Pair[] pairArr) {
        AbstractC9133u.m16133g(pairArr, "<this>");
        int length = pairArr.length;
        return length != 0 ? length != 1 ? m15958w(pairArr, new LinkedHashMap(AbstractC8798p0.m14663e(pairArr.length))) : AbstractC8798p0.m14664f(pairArr[0]) : m15943h();
    }

    /* renamed from: w */
    public static final Map m15958w(Pair[] pairArr, Map destination) {
        AbstractC9133u.m16133g(pairArr, "<this>");
        AbstractC9133u.m16133g(destination, "destination");
        m15953r(destination, pairArr);
        return destination;
    }

    /* renamed from: x */
    public static Map m15959x(Map map) {
        AbstractC9133u.m16133g(map, "<this>");
        return new LinkedHashMap(map);
    }
}
