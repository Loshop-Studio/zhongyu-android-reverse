package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.StateFactoryMarker;
import p089e8.InterfaceC8383k;

/* loaded from: classes2.dex */
final /* synthetic */ class SnapshotIntStateKt__SnapshotIntStateKt {
    public static final int getValue(IntState intState, Object obj, InterfaceC8383k interfaceC8383k) {
        return intState.getIntValue();
    }

    @StateFactoryMarker
    public static final MutableIntState mutableIntStateOf(int i10) {
        return SnapshotIntState_androidKt.createSnapshotMutableIntState(i10);
    }

    public static final void setValue(MutableIntState mutableIntState, Object obj, InterfaceC8383k interfaceC8383k, int i10) {
        mutableIntState.setIntValue(i10);
    }
}
