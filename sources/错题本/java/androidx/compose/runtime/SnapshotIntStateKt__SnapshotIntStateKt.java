package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.StateFactoryMarker;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p207y6.InterfaceC6792p;

@Metadata(m5109d1 = {"\u0000(\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a*\u0010\n\u001a\u00020\u0000*\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\bH\u0086\n¢\u0006\u0004\b\n\u0010\u000b\u001a2\u0010\r\u001a\u00020\f*\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b2\u0006\u0010\u0001\u001a\u00020\u0000H\u0086\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m5110d2 = {"", "value", "Landroidx/compose/runtime/MutableIntState;", "mutableIntStateOf", "(I)Landroidx/compose/runtime/MutableIntState;", "Landroidx/compose/runtime/IntState;", "", "thisObj", "Ly6/p;", "property", "getValue", "(Landroidx/compose/runtime/IntState;Ljava/lang/Object;Ly6/p;)I", "Ld6/s;", "setValue", "(Landroidx/compose/runtime/MutableIntState;Ljava/lang/Object;Ly6/p;I)V", "runtime_release"}, m5111k = 5, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE, m5115xs = "androidx/compose/runtime/SnapshotIntStateKt")
/* loaded from: classes.dex */
final /* synthetic */ class SnapshotIntStateKt__SnapshotIntStateKt {
    public static final int getValue(@NotNull IntState intState, @Nullable Object obj, @NotNull InterfaceC6792p interfaceC6792p) {
        return intState.getIntValue();
    }

    @StateFactoryMarker
    @NotNull
    public static final MutableIntState mutableIntStateOf(int i) {
        return SnapshotIntState_androidKt.createSnapshotMutableIntState(i);
    }

    public static final void setValue(@NotNull MutableIntState mutableIntState, @Nullable Object obj, @NotNull InterfaceC6792p interfaceC6792p, int i) {
        mutableIntState.setIntValue(i);
    }
}
