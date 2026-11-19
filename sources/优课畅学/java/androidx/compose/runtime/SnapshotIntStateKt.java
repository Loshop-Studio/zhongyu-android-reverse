package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.StateFactoryMarker;
import p089e8.InterfaceC8383k;

/* loaded from: classes2.dex */
public final class SnapshotIntStateKt {
    public static final int getValue(IntState intState, Object obj, InterfaceC8383k interfaceC8383k) {
        return SnapshotIntStateKt__SnapshotIntStateKt.getValue(intState, obj, interfaceC8383k);
    }

    @StateFactoryMarker
    public static final MutableIntState mutableIntStateOf(int i10) {
        return SnapshotIntStateKt__SnapshotIntStateKt.mutableIntStateOf(i10);
    }

    public static final void setValue(MutableIntState mutableIntState, Object obj, InterfaceC8383k interfaceC8383k, int i10) {
        SnapshotIntStateKt__SnapshotIntStateKt.setValue(mutableIntState, obj, interfaceC8383k, i10);
    }
}
