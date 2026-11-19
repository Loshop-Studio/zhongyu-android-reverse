package androidx.compose.runtime.snapshots.tooling;

import androidx.compose.runtime.ExperimentalComposeRuntimeApi;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ExperimentalComposeRuntimeApi
@Metadata(m5109d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\t\u001a\u0004\u0018\u00010\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ+\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0010J%\u0010\u0014\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00022\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0016À\u0006\u0001"}, m5110d2 = {"Landroidx/compose/runtime/snapshots/tooling/SnapshotObserver;", "", "Landroidx/compose/runtime/snapshots/Snapshot;", "parent", "", "readonly", "Landroidx/compose/runtime/snapshots/tooling/SnapshotInstanceObservers;", "onCreating", "(Landroidx/compose/runtime/snapshots/Snapshot;Z)Landroidx/compose/runtime/snapshots/tooling/SnapshotInstanceObservers;", "onPreCreate", "snapshot", "observers", "Ld6/s;", "onCreated", "(Landroidx/compose/runtime/snapshots/Snapshot;Landroidx/compose/runtime/snapshots/Snapshot;Landroidx/compose/runtime/snapshots/tooling/SnapshotInstanceObservers;)V", "onDisposing", "(Landroidx/compose/runtime/snapshots/Snapshot;)V", "onPreDispose", "", "changed", "onApplied", "(Landroidx/compose/runtime/snapshots/Snapshot;Ljava/util/Set;)V", "runtime_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public interface SnapshotObserver {
    default void onApplied(@NotNull Snapshot snapshot, @NotNull Set<? extends Object> changed) {
    }

    default void onCreated(@NotNull Snapshot snapshot, @Nullable Snapshot parent, @Nullable SnapshotInstanceObservers observers) {
    }

    @Deprecated(message = "Deprecated and renamed to onPreCreate. This method will be removed before 1.8.0 stable", replaceWith = @ReplaceWith(expression = "onPreCreate", imports = {}))
    @Nullable
    default SnapshotInstanceObservers onCreating(@Nullable Snapshot parent, boolean readonly) {
        return null;
    }

    @Deprecated(message = "Deprecated and renamed to onPreDispose. This method will be removed before 1.8.0 stable", replaceWith = @ReplaceWith(expression = "onPreDispose", imports = {}))
    default void onDisposing(@NotNull Snapshot snapshot) {
    }

    @Nullable
    default SnapshotInstanceObservers onPreCreate(@Nullable Snapshot parent, boolean readonly) {
        return onCreating(parent, readonly);
    }

    default void onPreDispose(@NotNull Snapshot snapshot) {
        onDisposing(snapshot);
    }
}
