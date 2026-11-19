package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotContextElement;
import kotlin.coroutines.InterfaceC9100d;
import p135i8.InterfaceC8877t1;
import p300x7.InterfaceC10574p;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class SnapshotContextElementImpl implements SnapshotContextElement, InterfaceC8877t1 {
    public static final int $stable = 8;
    private final Snapshot snapshot;

    public SnapshotContextElementImpl(Snapshot snapshot) {
        this.snapshot = snapshot;
    }

    @Override // androidx.compose.runtime.snapshots.SnapshotContextElement, kotlin.coroutines.InterfaceC9100d
    public <R> R fold(R r10, InterfaceC10574p interfaceC10574p) {
        return (R) SnapshotContextElement.DefaultImpls.fold(this, r10, interfaceC10574p);
    }

    @Override // androidx.compose.runtime.snapshots.SnapshotContextElement, kotlin.coroutines.InterfaceC9100d.b, kotlin.coroutines.InterfaceC9100d
    public <E extends InterfaceC9100d.b> E get(InterfaceC9100d.c cVar) {
        return (E) SnapshotContextElement.DefaultImpls.get(this, cVar);
    }

    @Override // androidx.compose.runtime.snapshots.SnapshotContextElement, kotlin.coroutines.InterfaceC9100d.b
    public InterfaceC9100d.c getKey() {
        return SnapshotContextElement.Key;
    }

    @Override // androidx.compose.runtime.snapshots.SnapshotContextElement, kotlin.coroutines.InterfaceC9100d
    public InterfaceC9100d minusKey(InterfaceC9100d.c cVar) {
        return SnapshotContextElement.DefaultImpls.minusKey(this, cVar);
    }

    @Override // androidx.compose.runtime.snapshots.SnapshotContextElement, kotlin.coroutines.InterfaceC9100d
    public InterfaceC9100d plus(InterfaceC9100d interfaceC9100d) {
        return SnapshotContextElement.DefaultImpls.plus(this, interfaceC9100d);
    }

    @Override // p135i8.InterfaceC8877t1
    public void restoreThreadContext(InterfaceC9100d interfaceC9100d, Snapshot snapshot) {
        this.snapshot.unsafeLeave(snapshot);
    }

    @Override // p135i8.InterfaceC8877t1
    public Snapshot updateThreadContext(InterfaceC9100d interfaceC9100d) {
        return this.snapshot.unsafeEnter();
    }
}
