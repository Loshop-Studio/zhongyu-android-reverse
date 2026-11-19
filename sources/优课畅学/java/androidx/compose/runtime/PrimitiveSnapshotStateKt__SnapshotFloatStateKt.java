package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.StateFactoryMarker;
import p089e8.InterfaceC8383k;

/* loaded from: classes2.dex */
final /* synthetic */ class PrimitiveSnapshotStateKt__SnapshotFloatStateKt {
    public static final float getValue(FloatState floatState, Object obj, InterfaceC8383k interfaceC8383k) {
        return floatState.getFloatValue();
    }

    @StateFactoryMarker
    public static final MutableFloatState mutableFloatStateOf(float f10) {
        return SnapshotFloatState_androidKt.createSnapshotMutableFloatState(f10);
    }

    public static final void setValue(MutableFloatState mutableFloatState, Object obj, InterfaceC8383k interfaceC8383k, float f10) {
        mutableFloatState.setFloatValue(f10);
    }
}
