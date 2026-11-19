package p134i7;

import java.util.Collections;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.builders.MapBuilder;
import kotlin.jvm.internal.AbstractC9133u;

/* renamed from: i7.p0 */
/* loaded from: classes5.dex */
public abstract class AbstractC8798p0 extends AbstractC8796o0 {
    /* renamed from: b */
    public static Map m14660b(Map builder) {
        AbstractC9133u.m16133g(builder, "builder");
        return ((MapBuilder) builder).m16027l();
    }

    /* renamed from: c */
    public static Map m14661c() {
        return new MapBuilder();
    }

    /* renamed from: d */
    public static Map m14662d(int i10) {
        return new MapBuilder(i10);
    }

    /* renamed from: e */
    public static int m14663e(int i10) {
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
    public static Map m14664f(Pair pair) {
        AbstractC9133u.m16133g(pair, "pair");
        Map mapSingletonMap = Collections.singletonMap(pair.m15906e(), pair.m15907g());
        AbstractC9133u.m16132f(mapSingletonMap, "singletonMap(...)");
        return mapSingletonMap;
    }

    /* renamed from: g */
    public static final Map m14665g(Map map) {
        AbstractC9133u.m16133g(map, "<this>");
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        AbstractC9133u.m16132f(mapSingletonMap, "with(...)");
        return mapSingletonMap;
    }
}
