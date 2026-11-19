package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.StateFactoryMarker;
import p089e8.InterfaceC8383k;

/* loaded from: classes2.dex */
final /* synthetic */ class SnapshotDoubleStateKt__SnapshotDoubleStateKt {
    public static final double getValue(DoubleState doubleState, Object obj, InterfaceC8383k interfaceC8383k) {
        return doubleState.getDoubleValue();
    }

    @StateFactoryMarker
    public static final MutableDoubleState mutableDoubleStateOf(double d10) {
        return SnapshotDoubleState_androidKt.createSnapshotMutableDoubleState(d10);
    }

    public static final void setValue(MutableDoubleState mutableDoubleState, Object obj, InterfaceC8383k interfaceC8383k, double d10) {
        mutableDoubleState.setDoubleValue(d10);
    }
}
