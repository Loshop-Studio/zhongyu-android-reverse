package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.SnapshotMutableState;

/* loaded from: classes2.dex */
public final class SnapshotState_androidKt {
    public static final <T> SnapshotMutableState<T> createSnapshotMutableState(T t10, SnapshotMutationPolicy<T> snapshotMutationPolicy) {
        return new ParcelableSnapshotMutableState(t10, snapshotMutationPolicy);
    }
}
