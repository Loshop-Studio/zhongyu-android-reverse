package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.StateFactoryMarker;
import kotlin.Metadata;
import kotlin.reflect.KProperty;

@Metadata(m13557d1 = {"androidx/compose/runtime/SnapshotLongStateKt__SnapshotLongStateKt"}, m13559k = 4, m13560mv = {1, 9, 0}, m13562xi = 48)
/* loaded from: classes2.dex */
public final class SnapshotLongStateKt {
    public static final long getValue(LongState longState, Object obj, KProperty<?> kProperty) {
        return SnapshotLongStateKt__SnapshotLongStateKt.getValue(longState, obj, kProperty);
    }

    @StateFactoryMarker
    public static final MutableLongState mutableLongStateOf(long j10) {
        return SnapshotLongStateKt__SnapshotLongStateKt.mutableLongStateOf(j10);
    }

    public static final void setValue(MutableLongState mutableLongState, Object obj, KProperty<?> kProperty, long j10) {
        SnapshotLongStateKt__SnapshotLongStateKt.setValue(mutableLongState, obj, kProperty, j10);
    }
}
