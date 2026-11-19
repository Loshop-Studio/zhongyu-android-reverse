package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.StateFactoryMarker;
import p089e8.InterfaceC8383k;

/* loaded from: classes2.dex */
final /* synthetic */ class SnapshotLongStateKt__SnapshotLongStateKt {
    public static final long getValue(LongState longState, Object obj, InterfaceC8383k interfaceC8383k) {
        return longState.getLongValue();
    }

    @StateFactoryMarker
    public static final MutableLongState mutableLongStateOf(long j10) {
        return SnapshotLongState_androidKt.createSnapshotMutableLongState(j10);
    }

    public static final void setValue(MutableLongState mutableLongState, Object obj, InterfaceC8383k interfaceC8383k, long j10) {
        mutableLongState.setLongValue(j10);
    }
}
