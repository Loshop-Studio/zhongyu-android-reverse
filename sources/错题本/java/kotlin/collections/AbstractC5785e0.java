package kotlin.collections;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC5830k;
import p169t6.AbstractC6600a;

/* renamed from: kotlin.collections.e0 */
/* loaded from: classes2.dex */
public abstract class AbstractC5785e0 extends AbstractC6600a {
    /* renamed from: A */
    public static Map m5147A() {
        EmptyMap emptyMap = EmptyMap.INSTANCE;
        AbstractC5830k.m5328e(emptyMap, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return emptyMap;
    }

    /* renamed from: B */
    public static Object m5148B(Map map, Object obj) {
        AbstractC5830k.m5330g(map, "<this>");
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException("Key " + obj + " is missing in the map.");
    }

    /* renamed from: C */
    public static int m5149C(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    /* renamed from: D */
    public static Map m5150D(Pair pair) {
        AbstractC5830k.m5330g(pair, "pair");
        Map mapSingletonMap = Collections.singletonMap(pair.getFirst(), pair.getSecond());
        AbstractC5830k.m5329f(mapSingletonMap, "singletonMap(...)");
        return mapSingletonMap;
    }

    /* renamed from: E */
    public static Map m5151E(Pair... pairArr) {
        if (pairArr.length <= 0) {
            return m5147A();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(m5149C(pairArr.length));
        m5154H(linkedHashMap, pairArr);
        return linkedHashMap;
    }

    /* renamed from: F */
    public static LinkedHashMap m5152F(Map map, Map map2) {
        AbstractC5830k.m5330g(map, "<this>");
        AbstractC5830k.m5330g(map2, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    /* renamed from: G */
    public static void m5153G(Map map, Iterable pairs) {
        AbstractC5830k.m5330g(map, "<this>");
        AbstractC5830k.m5330g(pairs, "pairs");
        Iterator it = pairs.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            map.put(pair.component1(), pair.component2());
        }
    }

    /* renamed from: H */
    public static void m5154H(Map map, Pair[] pairs) {
        AbstractC5830k.m5330g(map, "<this>");
        AbstractC5830k.m5330g(pairs, "pairs");
        for (Pair pair : pairs) {
            map.put(pair.component1(), pair.component2());
        }
    }

    /* renamed from: I */
    public static Map m5155I(Iterable iterable) {
        AbstractC5830k.m5330g(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            m5153G(linkedHashMap, iterable);
            int size = linkedHashMap.size();
            return size != 0 ? size != 1 ? linkedHashMap : m5159M(linkedHashMap) : m5147A();
        }
        Collection collection = (Collection) iterable;
        int size2 = collection.size();
        if (size2 == 0) {
            return m5147A();
        }
        if (size2 == 1) {
            return m5150D((Pair) (iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next()));
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(m5149C(collection.size()));
        m5153G(linkedHashMap2, iterable);
        return linkedHashMap2;
    }

    /* renamed from: J */
    public static Map m5156J(Map map) {
        AbstractC5830k.m5330g(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? m5158L(map) : m5159M(map) : m5147A();
    }

    /* renamed from: K */
    public static Map m5157K(Pair[] pairArr) {
        AbstractC5830k.m5330g(pairArr, "<this>");
        int length = pairArr.length;
        if (length == 0) {
            return m5147A();
        }
        if (length == 1) {
            return m5150D(pairArr[0]);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(m5149C(pairArr.length));
        m5154H(linkedHashMap, pairArr);
        return linkedHashMap;
    }

    /* renamed from: L */
    public static LinkedHashMap m5158L(Map map) {
        AbstractC5830k.m5330g(map, "<this>");
        return new LinkedHashMap(map);
    }

    /* renamed from: M */
    public static final Map m5159M(Map map) {
        AbstractC5830k.m5330g(map, "<this>");
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        AbstractC5830k.m5329f(mapSingletonMap, "with(...)");
        return mapSingletonMap;
    }
}
