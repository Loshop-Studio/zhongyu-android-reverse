package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.StateFactoryMarker;
import p280od.InterfaceC10478l;

/* loaded from: classes2.dex */
public final class SnapshotDoubleStateKt {
    public static final double getValue(DoubleState doubleState, Object obj, InterfaceC10478l interfaceC10478l) {
        return SnapshotDoubleStateKt__SnapshotDoubleStateKt.getValue(doubleState, obj, interfaceC10478l);
    }

    @StateFactoryMarker
    public static final MutableDoubleState mutableDoubleStateOf(double d10) {
        return SnapshotDoubleStateKt__SnapshotDoubleStateKt.mutableDoubleStateOf(d10);
    }

    public static final void setValue(MutableDoubleState mutableDoubleState, Object obj, InterfaceC10478l interfaceC10478l, double d10) {
        SnapshotDoubleStateKt__SnapshotDoubleStateKt.setValue(mutableDoubleState, obj, interfaceC10478l, d10);
    }
}
