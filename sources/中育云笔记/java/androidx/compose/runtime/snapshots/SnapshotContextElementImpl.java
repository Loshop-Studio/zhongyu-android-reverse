package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotContextElement;
import kotlin.coroutines.InterfaceC9945d;
import p181hd.InterfaceC9544p;
import sd.InterfaceC11112f2;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class SnapshotContextElementImpl implements SnapshotContextElement, InterfaceC11112f2 {
    public static final int $stable = 8;
    private final Snapshot snapshot;

    public SnapshotContextElementImpl(Snapshot snapshot) {
        this.snapshot = snapshot;
    }

    @Override // androidx.compose.runtime.snapshots.SnapshotContextElement, kotlin.coroutines.InterfaceC9945d
    public <R> R fold(R r10, InterfaceC9544p interfaceC9544p) {
        return (R) SnapshotContextElement.DefaultImpls.fold(this, r10, interfaceC9544p);
    }

    @Override // androidx.compose.runtime.snapshots.SnapshotContextElement, kotlin.coroutines.InterfaceC9945d.b, kotlin.coroutines.InterfaceC9945d
    public <E extends InterfaceC9945d.b> E get(InterfaceC9945d.c cVar) {
        return (E) SnapshotContextElement.DefaultImpls.get(this, cVar);
    }

    @Override // androidx.compose.runtime.snapshots.SnapshotContextElement, kotlin.coroutines.InterfaceC9945d.b
    public InterfaceC9945d.c getKey() {
        return SnapshotContextElement.Key;
    }

    @Override // androidx.compose.runtime.snapshots.SnapshotContextElement, kotlin.coroutines.InterfaceC9945d
    public InterfaceC9945d minusKey(InterfaceC9945d.c cVar) {
        return SnapshotContextElement.DefaultImpls.minusKey(this, cVar);
    }

    @Override // androidx.compose.runtime.snapshots.SnapshotContextElement, kotlin.coroutines.InterfaceC9945d
    public InterfaceC9945d plus(InterfaceC9945d interfaceC9945d) {
        return SnapshotContextElement.DefaultImpls.plus(this, interfaceC9945d);
    }

    @Override // sd.InterfaceC11112f2
    public void restoreThreadContext(InterfaceC9945d interfaceC9945d, Snapshot snapshot) {
        this.snapshot.unsafeLeave(snapshot);
    }

    @Override // sd.InterfaceC11112f2
    public Snapshot updateThreadContext(InterfaceC9945d interfaceC9945d) {
        return this.snapshot.unsafeEnter();
    }
}
