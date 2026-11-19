package kotlin.collections;

import java.util.Collections;
import java.util.Map;
import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;
import p128o2.C2918k;

/* renamed from: kotlin.collections.b0 */
/* loaded from: classes.dex */
class C2714b0 extends C2712a0 {
    /* renamed from: a */
    public static int m9050a(int i4) {
        if (i4 < 0) {
            return i4;
        }
        if (i4 < 3) {
            return i4 + 1;
        }
        if (i4 < 1073741824) {
            return (int) ((i4 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    @NotNull
    /* renamed from: b */
    public static final <K, V> Map<K, V> m9051b(@NotNull C2918k<? extends K, ? extends V> pair) {
        C2769l.m9241e(pair, "pair");
        Map<K, V> mapSingletonMap = Collections.singletonMap(pair.m9987c(), pair.m9988d());
        C2769l.m9240d(mapSingletonMap, "singletonMap(pair.first, pair.second)");
        return mapSingletonMap;
    }

    @NotNull
    /* renamed from: c */
    public static final <K, V> Map<K, V> m9052c(@NotNull Map<? extends K, ? extends V> map) {
        C2769l.m9241e(map, "<this>");
        Map.Entry<? extends K, ? extends V> next = map.entrySet().iterator().next();
        Map<K, V> mapSingletonMap = Collections.singletonMap(next.getKey(), next.getValue());
        C2769l.m9240d(mapSingletonMap, "with(entries.iterator().…ingletonMap(key, value) }");
        return mapSingletonMap;
    }
}
