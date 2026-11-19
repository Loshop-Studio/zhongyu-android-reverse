package androidx.compose.runtime.internal;

import androidx.compose.runtime.CompositionLocal;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.ValueHolder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import kotlin.Pair;
import kotlin.collections.AbstractC9925a;

/* loaded from: classes2.dex */
public final class PersistentCompositionLocalMapKt {
    public static final PersistentCompositionLocalHashMap persistentCompositionLocalHashMapOf() {
        return PersistentCompositionLocalHashMap.Companion.getEmpty();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.compose.runtime.PersistentCompositionLocalMap] */
    public static final PersistentCompositionLocalMap persistentCompositionLocalHashMapOf(Pair<? extends CompositionLocal<Object>, ? extends ValueHolder<Object>>... pairArr) {
        PersistentMap.Builder<CompositionLocal<Object>, ValueHolder<Object>> builderBuilder2 = PersistentCompositionLocalHashMap.Companion.getEmpty().builder2();
        AbstractC9925a.m20098r(builderBuilder2, pairArr);
        return builderBuilder2.build2();
    }
}
