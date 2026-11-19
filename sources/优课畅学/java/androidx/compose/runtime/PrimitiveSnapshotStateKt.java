package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.StateFactoryMarker;
import p089e8.InterfaceC8383k;

/* loaded from: classes2.dex */
public final class PrimitiveSnapshotStateKt {
    public static final float getValue(FloatState floatState, Object obj, InterfaceC8383k interfaceC8383k) {
        return PrimitiveSnapshotStateKt__SnapshotFloatStateKt.getValue(floatState, obj, interfaceC8383k);
    }

    @StateFactoryMarker
    public static final MutableFloatState mutableFloatStateOf(float f10) {
        return PrimitiveSnapshotStateKt__SnapshotFloatStateKt.mutableFloatStateOf(f10);
    }

    public static final void setValue(MutableFloatState mutableFloatState, Object obj, InterfaceC8383k interfaceC8383k, float f10) {
        PrimitiveSnapshotStateKt__SnapshotFloatStateKt.setValue(mutableFloatState, obj, interfaceC8383k, f10);
    }
}
