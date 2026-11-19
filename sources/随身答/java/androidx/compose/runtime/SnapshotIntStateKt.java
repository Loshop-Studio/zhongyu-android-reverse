package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.StateFactoryMarker;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.reflect.KProperty;

@Metadata(m13412d1 = {"androidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt"}, m13414k = 4, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class SnapshotIntStateKt {
    public static final int getValue(IntState intState, Object obj, KProperty<?> kProperty) {
        return SnapshotIntStateKt__SnapshotIntStateKt.getValue(intState, obj, kProperty);
    }

    @StateFactoryMarker
    public static final MutableIntState mutableIntStateOf(int i9) {
        return SnapshotIntStateKt__SnapshotIntStateKt.mutableIntStateOf(i9);
    }

    public static final void setValue(MutableIntState mutableIntState, Object obj, KProperty<?> kProperty, int i9) {
        SnapshotIntStateKt__SnapshotIntStateKt.setValue(mutableIntState, obj, kProperty, i9);
    }
}
