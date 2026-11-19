package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.StateFactoryMarker;
import kotlin.Metadata;
import kotlin.reflect.KProperty;

@Metadata(m13557d1 = {"androidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt"}, m13559k = 4, m13560mv = {1, 9, 0}, m13562xi = 48)
/* loaded from: classes2.dex */
public final class PrimitiveSnapshotStateKt {
    public static final float getValue(FloatState floatState, Object obj, KProperty<?> kProperty) {
        return PrimitiveSnapshotStateKt__SnapshotFloatStateKt.getValue(floatState, obj, kProperty);
    }

    @StateFactoryMarker
    public static final MutableFloatState mutableFloatStateOf(float f10) {
        return PrimitiveSnapshotStateKt__SnapshotFloatStateKt.mutableFloatStateOf(f10);
    }

    public static final void setValue(MutableFloatState mutableFloatState, Object obj, KProperty<?> kProperty, float f10) {
        PrimitiveSnapshotStateKt__SnapshotFloatStateKt.setValue(mutableFloatState, obj, kProperty, f10);
    }
}
