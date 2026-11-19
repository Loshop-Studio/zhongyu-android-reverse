package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.StateFactoryMarker;
import p089e8.InterfaceC8383k;

/* loaded from: classes2.dex */
public final class SnapshotDoubleStateKt {
    public static final double getValue(DoubleState doubleState, Object obj, InterfaceC8383k interfaceC8383k) {
        return SnapshotDoubleStateKt__SnapshotDoubleStateKt.getValue(doubleState, obj, interfaceC8383k);
    }

    @StateFactoryMarker
    public static final MutableDoubleState mutableDoubleStateOf(double d10) {
        return SnapshotDoubleStateKt__SnapshotDoubleStateKt.mutableDoubleStateOf(d10);
    }

    public static final void setValue(MutableDoubleState mutableDoubleState, Object obj, InterfaceC8383k interfaceC8383k, double d10) {
        SnapshotDoubleStateKt__SnapshotDoubleStateKt.setValue(mutableDoubleState, obj, interfaceC8383k, d10);
    }
}
