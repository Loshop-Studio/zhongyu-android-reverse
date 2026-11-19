package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.StateFactoryMarker;
import p280od.InterfaceC10478l;

/* loaded from: classes2.dex */
public final class PrimitiveSnapshotStateKt {
    public static final float getValue(FloatState floatState, Object obj, InterfaceC10478l interfaceC10478l) {
        return PrimitiveSnapshotStateKt__SnapshotFloatStateKt.getValue(floatState, obj, interfaceC10478l);
    }

    @StateFactoryMarker
    public static final MutableFloatState mutableFloatStateOf(float f10) {
        return PrimitiveSnapshotStateKt__SnapshotFloatStateKt.mutableFloatStateOf(f10);
    }

    public static final void setValue(MutableFloatState mutableFloatState, Object obj, InterfaceC10478l interfaceC10478l, float f10) {
        PrimitiveSnapshotStateKt__SnapshotFloatStateKt.setValue(mutableFloatState, obj, interfaceC10478l, f10);
    }
}
