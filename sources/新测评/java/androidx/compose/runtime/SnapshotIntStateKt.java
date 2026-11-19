package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.StateFactoryMarker;
import kotlin.Metadata;
import kotlin.reflect.KProperty;

@Metadata(m13557d1 = {"androidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt"}, m13559k = 4, m13560mv = {1, 9, 0}, m13562xi = 48)
/* loaded from: classes2.dex */
public final class SnapshotIntStateKt {
    public static final int getValue(IntState intState, Object obj, KProperty<?> kProperty) {
        return SnapshotIntStateKt__SnapshotIntStateKt.getValue(intState, obj, kProperty);
    }

    @StateFactoryMarker
    public static final MutableIntState mutableIntStateOf(int i10) {
        return SnapshotIntStateKt__SnapshotIntStateKt.mutableIntStateOf(i10);
    }

    public static final void setValue(MutableIntState mutableIntState, Object obj, KProperty<?> kProperty, int i10) {
        SnapshotIntStateKt__SnapshotIntStateKt.setValue(mutableIntState, obj, kProperty, i10);
    }
}
