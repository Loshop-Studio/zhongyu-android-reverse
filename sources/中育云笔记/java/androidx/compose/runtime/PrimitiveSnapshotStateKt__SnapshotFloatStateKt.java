package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.StateFactoryMarker;
import p280od.InterfaceC10478l;

/* loaded from: classes2.dex */
final /* synthetic */ class PrimitiveSnapshotStateKt__SnapshotFloatStateKt {
    public static final float getValue(FloatState floatState, Object obj, InterfaceC10478l interfaceC10478l) {
        return floatState.getFloatValue();
    }

    @StateFactoryMarker
    public static final MutableFloatState mutableFloatStateOf(float f10) {
        return SnapshotFloatState_androidKt.createSnapshotMutableFloatState(f10);
    }

    public static final void setValue(MutableFloatState mutableFloatState, Object obj, InterfaceC10478l interfaceC10478l, float f10) {
        mutableFloatState.setFloatValue(f10);
    }
}
