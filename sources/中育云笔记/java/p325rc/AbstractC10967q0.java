package p325rc;

import java.util.Collections;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.builders.MapBuilder;
import kotlin.jvm.internal.AbstractC9979u;

/* renamed from: rc.q0 */
/* loaded from: classes6.dex */
public abstract class AbstractC10967q0 extends AbstractC10965p0 {
    /* renamed from: b */
    public static Map m24035b(Map builder) {
        AbstractC9979u.m20294g(builder, "builder");
        return ((MapBuilder) builder).m20179p();
    }

    /* renamed from: c */
    public static Map m24036c() {
        return new MapBuilder();
    }

    /* renamed from: d */
    public static Map m24037d(int i10) {
        return new MapBuilder(i10);
    }

    /* renamed from: e */
    public static int m24038e(int i10) {
        if (i10 < 0) {
            return i10;
        }
        if (i10 < 3) {
            return i10 + 1;
        }
        if (i10 < 1073741824) {
            return (int) ((i10 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    /* renamed from: f */
    public static Map m24039f(Pair pair) {
        AbstractC9979u.m20294g(pair, "pair");
        Map mapSingletonMap = Collections.singletonMap(pair.m20051f(), pair.m20052g());
        AbstractC9979u.m20293f(mapSingletonMap, "singletonMap(...)");
        return mapSingletonMap;
    }

    /* renamed from: g */
    public static final Map m24040g(Map map) {
        AbstractC9979u.m20294g(map, "<this>");
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        AbstractC9979u.m20293f(mapSingletonMap, "with(...)");
        return mapSingletonMap;
    }
}
