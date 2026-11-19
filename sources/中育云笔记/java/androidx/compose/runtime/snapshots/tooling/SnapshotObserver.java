package androidx.compose.runtime.snapshots.tooling;

import androidx.compose.runtime.ExperimentalComposeRuntimeApi;
import androidx.compose.runtime.snapshots.Snapshot;
import java.util.Set;
import p309qc.InterfaceC10770a;

@ExperimentalComposeRuntimeApi
/* loaded from: classes2.dex */
public interface SnapshotObserver {
    default void onApplied(Snapshot snapshot, Set<? extends Object> set) {
    }

    default void onCreated(Snapshot snapshot, Snapshot snapshot2, SnapshotInstanceObservers snapshotInstanceObservers) {
    }

    @InterfaceC10770a
    default SnapshotInstanceObservers onCreating(Snapshot snapshot, boolean z10) {
        return null;
    }

    @InterfaceC10770a
    default void onDisposing(Snapshot snapshot) {
    }

    default SnapshotInstanceObservers onPreCreate(Snapshot snapshot, boolean z10) {
        return onCreating(snapshot, z10);
    }

    default void onPreDispose(Snapshot snapshot) {
        onDisposing(snapshot);
    }
}
