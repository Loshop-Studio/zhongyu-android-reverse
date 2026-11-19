package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.StateFactoryMarker;
import kotlin.Metadata;
import kotlin.reflect.KProperty;

@Metadata(m13557d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u001a#\u0010\u0004\u001a\u00020\u0003*\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\tH\u0086\n\u001a+\u0010\n\u001a\u00020\u000b*\u00020\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\n¨\u0006\f"}, m13558d2 = {"mutableDoubleStateOf", "Landroidx/compose/runtime/MutableDoubleState;", "value", "", "getValue", "Landroidx/compose/runtime/DoubleState;", "thisObj", "", "property", "Lkotlin/reflect/KProperty;", "setValue", "", "runtime_release"}, m13559k = 5, m13560mv = {1, 9, 0}, m13562xi = 48, m13563xs = "androidx/compose/runtime/SnapshotDoubleStateKt")
/* loaded from: classes2.dex */
final /* synthetic */ class SnapshotDoubleStateKt__SnapshotDoubleStateKt {
    public static final double getValue(DoubleState doubleState, Object obj, KProperty<?> kProperty) {
        return doubleState.getDoubleValue();
    }

    @StateFactoryMarker
    public static final MutableDoubleState mutableDoubleStateOf(double d10) {
        return SnapshotDoubleState_androidKt.createSnapshotMutableDoubleState(d10);
    }

    public static final void setValue(MutableDoubleState mutableDoubleState, Object obj, KProperty<?> kProperty, double d10) {
        mutableDoubleState.setDoubleValue(d10);
    }
}
