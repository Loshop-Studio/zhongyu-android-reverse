package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.StateFactoryMarker;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.reflect.KProperty;

@Metadata(m13412d1 = {"androidx/compose/runtime/SnapshotLongStateKt__SnapshotLongStateKt"}, m13414k = 4, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class SnapshotLongStateKt {
    public static final long getValue(LongState longState, Object obj, KProperty<?> kProperty) {
        return SnapshotLongStateKt__SnapshotLongStateKt.getValue(longState, obj, kProperty);
    }

    @StateFactoryMarker
    public static final MutableLongState mutableLongStateOf(long j9) {
        return SnapshotLongStateKt__SnapshotLongStateKt.mutableLongStateOf(j9);
    }

    public static final void setValue(MutableLongState mutableLongState, Object obj, KProperty<?> kProperty, long j9) {
        SnapshotLongStateKt__SnapshotLongStateKt.setValue(mutableLongState, obj, kProperty, j9);
    }
}
