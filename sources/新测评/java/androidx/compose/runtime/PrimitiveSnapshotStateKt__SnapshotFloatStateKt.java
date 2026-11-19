package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.StateFactoryMarker;
import kotlin.Metadata;
import kotlin.reflect.KProperty;

@Metadata(m13557d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u001a#\u0010\u0004\u001a\u00020\u0003*\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\tH\u0086\n\u001a+\u0010\n\u001a\u00020\u000b*\u00020\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\n¨\u0006\f"}, m13558d2 = {"mutableFloatStateOf", "Landroidx/compose/runtime/MutableFloatState;", "value", "", "getValue", "Landroidx/compose/runtime/FloatState;", "thisObj", "", "property", "Lkotlin/reflect/KProperty;", "setValue", "", "runtime_release"}, m13559k = 5, m13560mv = {1, 9, 0}, m13562xi = 48, m13563xs = "androidx/compose/runtime/PrimitiveSnapshotStateKt")
/* loaded from: classes2.dex */
final /* synthetic */ class PrimitiveSnapshotStateKt__SnapshotFloatStateKt {
    public static final float getValue(FloatState floatState, Object obj, KProperty<?> kProperty) {
        return floatState.getFloatValue();
    }

    @StateFactoryMarker
    public static final MutableFloatState mutableFloatStateOf(float f10) {
        return SnapshotFloatState_androidKt.createSnapshotMutableFloatState(f10);
    }

    public static final void setValue(MutableFloatState mutableFloatState, Object obj, KProperty<?> kProperty, float f10) {
        mutableFloatState.setFloatValue(f10);
    }
}
