package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.StateFactoryMarker;
import p280od.InterfaceC10478l;

/* loaded from: classes2.dex */
public final class SnapshotLongStateKt {
    public static final long getValue(LongState longState, Object obj, InterfaceC10478l interfaceC10478l) {
        return SnapshotLongStateKt__SnapshotLongStateKt.getValue(longState, obj, interfaceC10478l);
    }

    @StateFactoryMarker
    public static final MutableLongState mutableLongStateOf(long j10) {
        return SnapshotLongStateKt__SnapshotLongStateKt.mutableLongStateOf(j10);
    }

    public static final void setValue(MutableLongState mutableLongState, Object obj, InterfaceC10478l interfaceC10478l, long j10) {
        SnapshotLongStateKt__SnapshotLongStateKt.setValue(mutableLongState, obj, interfaceC10478l, j10);
    }
}
