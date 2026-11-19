package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.StateFactoryMarker;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p207y6.InterfaceC6792p;

@Metadata(m5109d1 = {"androidx/compose/runtime/SnapshotLongStateKt__SnapshotLongStateKt"}, m5111k = 4, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class SnapshotLongStateKt {
    public static final long getValue(@NotNull LongState longState, @Nullable Object obj, @NotNull InterfaceC6792p interfaceC6792p) {
        return SnapshotLongStateKt__SnapshotLongStateKt.getValue(longState, obj, interfaceC6792p);
    }

    @StateFactoryMarker
    @NotNull
    public static final MutableLongState mutableLongStateOf(long j7) {
        return SnapshotLongStateKt__SnapshotLongStateKt.mutableLongStateOf(j7);
    }

    public static final void setValue(@NotNull MutableLongState mutableLongState, @Nullable Object obj, @NotNull InterfaceC6792p interfaceC6792p, long j7) {
        SnapshotLongStateKt__SnapshotLongStateKt.setValue(mutableLongState, obj, interfaceC6792p, j7);
    }
}
