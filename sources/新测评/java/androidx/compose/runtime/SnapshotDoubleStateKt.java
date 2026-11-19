package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.StateFactoryMarker;
import kotlin.Metadata;
import kotlin.reflect.KProperty;

@Metadata(m13557d1 = {"androidx/compose/runtime/SnapshotDoubleStateKt__SnapshotDoubleStateKt"}, m13559k = 4, m13560mv = {1, 9, 0}, m13562xi = 48)
/* loaded from: classes2.dex */
public final class SnapshotDoubleStateKt {
    public static final double getValue(DoubleState doubleState, Object obj, KProperty<?> kProperty) {
        return SnapshotDoubleStateKt__SnapshotDoubleStateKt.getValue(doubleState, obj, kProperty);
    }

    @StateFactoryMarker
    public static final MutableDoubleState mutableDoubleStateOf(double d10) {
        return SnapshotDoubleStateKt__SnapshotDoubleStateKt.mutableDoubleStateOf(d10);
    }

    public static final void setValue(MutableDoubleState mutableDoubleState, Object obj, KProperty<?> kProperty, double d10) {
        SnapshotDoubleStateKt__SnapshotDoubleStateKt.setValue(mutableDoubleState, obj, kProperty, d10);
    }
}
