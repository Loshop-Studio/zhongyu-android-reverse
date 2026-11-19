package androidx.compose.runtime.snapshots.tooling;

import androidx.compose.runtime.ExperimentalComposeRuntimeApi;
import androidx.compose.runtime.snapshots.Snapshot;
import java.util.Set;
import p123h7.InterfaceC8721a;

@ExperimentalComposeRuntimeApi
/* loaded from: classes2.dex */
public interface SnapshotObserver {
    default void onApplied(Snapshot snapshot, Set<? extends Object> set) {
    }

    default void onCreated(Snapshot snapshot, Snapshot snapshot2, SnapshotInstanceObservers snapshotInstanceObservers) {
    }

    @InterfaceC8721a
    default SnapshotInstanceObservers onCreating(Snapshot snapshot, boolean z10) {
        return null;
    }

    @InterfaceC8721a
    default void onDisposing(Snapshot snapshot) {
    }

    default SnapshotInstanceObservers onPreCreate(Snapshot snapshot, boolean z10) {
        return onCreating(snapshot, z10);
    }

    default void onPreDispose(Snapshot snapshot) {
        onDisposing(snapshot);
    }
}
