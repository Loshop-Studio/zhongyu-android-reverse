package androidx.compose.p014ui.modifier;

import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import kotlin.Pair;
import kotlin.collections.AbstractC9925a;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class MultiLocalMap extends ModifierLocalMap {
    public static final int $stable = 0;
    private final SnapshotStateMap<ModifierLocal<?>, Object> map;

    /* JADX WARN: Multi-variable type inference failed */
    public MultiLocalMap(Pair<? extends ModifierLocal<?>, ? extends Object> pair, Pair<? extends ModifierLocal<?>, ? extends Object>... pairArr) {
        super(null);
        SnapshotStateMap<ModifierLocal<?>, Object> snapshotStateMapMutableStateMapOf = SnapshotStateKt.mutableStateMapOf();
        this.map = snapshotStateMapMutableStateMapOf;
        snapshotStateMapMutableStateMapOf.put(pair.m20051f(), pair.m20052g());
        snapshotStateMapMutableStateMapOf.putAll(AbstractC9925a.m20102v(pairArr));
    }

    @Override // androidx.compose.p014ui.modifier.ModifierLocalMap
    public boolean contains$ui_release(ModifierLocal<?> modifierLocal) {
        return this.map.containsKey(modifierLocal);
    }

    @Override // androidx.compose.p014ui.modifier.ModifierLocalMap
    public <T> T get$ui_release(ModifierLocal<T> modifierLocal) {
        T t10 = (T) this.map.get(modifierLocal);
        if (t10 == null) {
            return null;
        }
        return t10;
    }

    @Override // androidx.compose.p014ui.modifier.ModifierLocalMap
    /* renamed from: set$ui_release */
    public <T> void mo32336set$ui_release(ModifierLocal<T> modifierLocal, T t10) {
        this.map.put(modifierLocal, t10);
    }
}
