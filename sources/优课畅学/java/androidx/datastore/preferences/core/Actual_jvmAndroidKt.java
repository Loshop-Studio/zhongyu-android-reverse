package androidx.datastore.preferences.core;

import androidx.annotation.RestrictTo;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC9133u;
import kotlinx.coroutines.CoroutineDispatcher;
import p134i7.AbstractC8778f0;
import p135i8.C8843i0;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public final class Actual_jvmAndroidKt {
    public static final <T> Set<T> immutableCopyOfSet(Set<? extends T> set) {
        AbstractC9133u.m16133g(set, "set");
        Set<T> setUnmodifiableSet = Collections.unmodifiableSet(AbstractC8778f0.m14549Z0(set));
        AbstractC9133u.m16132f(setUnmodifiableSet, "unmodifiableSet(set.toSet())");
        return setUnmodifiableSet;
    }

    public static final <K, V> Map<K, V> immutableMap(Map<K, ? extends V> map) {
        AbstractC9133u.m16133g(map, "map");
        Map<K, V> mapUnmodifiableMap = Collections.unmodifiableMap(map);
        AbstractC9133u.m16132f(mapUnmodifiableMap, "unmodifiableMap(map)");
        return mapUnmodifiableMap;
    }

    public static final CoroutineDispatcher ioDispatcher() {
        return C8843i0.m14867b();
    }
}
