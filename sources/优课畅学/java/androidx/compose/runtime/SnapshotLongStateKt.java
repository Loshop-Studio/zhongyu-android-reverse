package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.StateFactoryMarker;
import p089e8.InterfaceC8383k;

/* loaded from: classes2.dex */
public final class SnapshotLongStateKt {
    public static final long getValue(LongState longState, Object obj, InterfaceC8383k interfaceC8383k) {
        return SnapshotLongStateKt__SnapshotLongStateKt.getValue(longState, obj, interfaceC8383k);
    }

    @StateFactoryMarker
    public static final MutableLongState mutableLongStateOf(long j10) {
        return SnapshotLongStateKt__SnapshotLongStateKt.mutableLongStateOf(j10);
    }

    public static final void setValue(MutableLongState mutableLongState, Object obj, InterfaceC8383k interfaceC8383k, long j10) {
        SnapshotLongStateKt__SnapshotLongStateKt.setValue(mutableLongState, obj, interfaceC8383k, j10);
    }
}
