package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.StateFactoryMarker;
import p280od.InterfaceC10478l;

/* loaded from: classes2.dex */
public final class SnapshotIntStateKt {
    public static final int getValue(IntState intState, Object obj, InterfaceC10478l interfaceC10478l) {
        return SnapshotIntStateKt__SnapshotIntStateKt.getValue(intState, obj, interfaceC10478l);
    }

    @StateFactoryMarker
    public static final MutableIntState mutableIntStateOf(int i10) {
        return SnapshotIntStateKt__SnapshotIntStateKt.mutableIntStateOf(i10);
    }

    public static final void setValue(MutableIntState mutableIntState, Object obj, InterfaceC10478l interfaceC10478l, int i10) {
        SnapshotIntStateKt__SnapshotIntStateKt.setValue(mutableIntState, obj, interfaceC10478l, i10);
    }
}
