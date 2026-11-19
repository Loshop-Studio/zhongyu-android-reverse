package kotlin.collections;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;
import p128o2.C2918k;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: kotlin.collections.c0 */
/* loaded from: classes.dex */
public class C2716c0 extends C2714b0 {
    @NotNull
    /* renamed from: d */
    public static <K, V> Map<K, V> m9054d() {
        return C2741w.f10708a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    /* renamed from: e */
    public static final <K, V> Map<K, V> m9055e(@NotNull Map<K, ? extends V> map) {
        C2769l.m9241e(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? map : C2714b0.m9052c(map) : m9054d();
    }

    /* renamed from: f */
    public static final <K, V> void m9056f(@NotNull Map<? super K, ? super V> map, @NotNull Iterable<? extends C2918k<? extends K, ? extends V>> pairs) {
        C2769l.m9241e(map, "<this>");
        C2769l.m9241e(pairs, "pairs");
        for (C2918k<? extends K, ? extends V> c2918k : pairs) {
            map.put(c2918k.m9985a(), c2918k.m9986b());
        }
    }

    @NotNull
    /* renamed from: g */
    public static <K, V> Map<K, V> m9057g(@NotNull Iterable<? extends C2918k<? extends K, ? extends V>> iterable) {
        C2769l.m9241e(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return m9055e(m9058h(iterable, new LinkedHashMap()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return m9054d();
        }
        if (size != 1) {
            return m9058h(iterable, new LinkedHashMap(C2714b0.m9050a(collection.size())));
        }
        return C2714b0.m9051b(iterable instanceof List ? (C2918k<? extends K, ? extends V>) ((List) iterable).get(0) : iterable.iterator().next());
    }

    @NotNull
    /* renamed from: h */
    public static final <K, V, M extends Map<? super K, ? super V>> M m9058h(@NotNull Iterable<? extends C2918k<? extends K, ? extends V>> iterable, @NotNull M destination) {
        C2769l.m9241e(iterable, "<this>");
        C2769l.m9241e(destination, "destination");
        m9056f(destination, iterable);
        return destination;
    }

    @NotNull
    /* renamed from: i */
    public static <K, V> Map<K, V> m9059i(@NotNull Map<? extends K, ? extends V> map) {
        C2769l.m9241e(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? m9060j(map) : C2714b0.m9052c(map) : m9054d();
    }

    @NotNull
    /* renamed from: j */
    public static <K, V> Map<K, V> m9060j(@NotNull Map<? extends K, ? extends V> map) {
        C2769l.m9241e(map, "<this>");
        return new LinkedHashMap(map);
    }
}
