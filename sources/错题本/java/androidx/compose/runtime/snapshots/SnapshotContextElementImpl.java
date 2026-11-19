package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotContextElement;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlinx.coroutines.InterfaceC5985n1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p075h6.InterfaceC5634f;
import p075h6.InterfaceC5635g;
import p075h6.InterfaceC5636h;
import p152r6.InterfaceC6473e;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u0004\u0018\u00010\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ!\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000fR\u0018\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, m5110d2 = {"Landroidx/compose/runtime/snapshots/SnapshotContextElementImpl;", "Landroidx/compose/runtime/snapshots/SnapshotContextElement;", "Lkotlinx/coroutines/n1;", "Landroidx/compose/runtime/snapshots/Snapshot;", "snapshot", "<init>", "(Landroidx/compose/runtime/snapshots/Snapshot;)V", "Lh6/h;", "context", "updateThreadContext", "(Lh6/h;)Landroidx/compose/runtime/snapshots/Snapshot;", "oldState", "Ld6/s;", "restoreThreadContext", "(Lh6/h;Landroidx/compose/runtime/snapshots/Snapshot;)V", "Landroidx/compose/runtime/snapshots/Snapshot;", "Lh6/g;", "getKey", "()Lh6/g;", "key", "runtime_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class SnapshotContextElementImpl implements SnapshotContextElement, InterfaceC5985n1 {
    public static final int $stable = 8;

    @NotNull
    private final Snapshot snapshot;

    public SnapshotContextElementImpl(@NotNull Snapshot snapshot) {
        this.snapshot = snapshot;
    }

    @Override // androidx.compose.runtime.snapshots.SnapshotContextElement, p075h6.InterfaceC5636h
    public <R> R fold(R r, @NotNull InterfaceC6473e interfaceC6473e) {
        return (R) SnapshotContextElement.DefaultImpls.fold(this, r, interfaceC6473e);
    }

    @Override // androidx.compose.runtime.snapshots.SnapshotContextElement, p075h6.InterfaceC5636h
    @Nullable
    public <E extends InterfaceC5634f> E get(@NotNull InterfaceC5635g interfaceC5635g) {
        return (E) SnapshotContextElement.DefaultImpls.get(this, interfaceC5635g);
    }

    @Override // androidx.compose.runtime.snapshots.SnapshotContextElement, p075h6.InterfaceC5634f
    @NotNull
    public InterfaceC5635g getKey() {
        return SnapshotContextElement.INSTANCE;
    }

    @Override // androidx.compose.runtime.snapshots.SnapshotContextElement, p075h6.InterfaceC5636h
    @NotNull
    public InterfaceC5636h minusKey(@NotNull InterfaceC5635g interfaceC5635g) {
        return SnapshotContextElement.DefaultImpls.minusKey(this, interfaceC5635g);
    }

    @Override // androidx.compose.runtime.snapshots.SnapshotContextElement, p075h6.InterfaceC5636h
    @NotNull
    public InterfaceC5636h plus(@NotNull InterfaceC5636h interfaceC5636h) {
        return SnapshotContextElement.DefaultImpls.plus(this, interfaceC5636h);
    }

    @Override // kotlinx.coroutines.InterfaceC5985n1
    public void restoreThreadContext(@NotNull InterfaceC5636h context, @Nullable Snapshot oldState) {
        this.snapshot.unsafeLeave(oldState);
    }

    @Override // kotlinx.coroutines.InterfaceC5985n1
    @Nullable
    public Snapshot updateThreadContext(@NotNull InterfaceC5636h context) {
        return this.snapshot.unsafeEnter();
    }
}
