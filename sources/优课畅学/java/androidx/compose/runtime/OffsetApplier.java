package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class OffsetApplier<N> implements Applier<N> {
    public static final int $stable = 8;
    private final Applier<N> applier;
    private int nesting;
    private final int offset;

    public OffsetApplier(Applier<N> applier, int i10) {
        this.applier = applier;
        this.offset = i10;
    }

    @Override // androidx.compose.runtime.Applier
    public void clear() {
        ComposerKt.composeImmediateRuntimeError("Clear is not valid on OffsetApplier");
    }

    @Override // androidx.compose.runtime.Applier
    public void down(N n10) {
        this.nesting++;
        this.applier.down(n10);
    }

    @Override // androidx.compose.runtime.Applier
    public N getCurrent() {
        return this.applier.getCurrent();
    }

    @Override // androidx.compose.runtime.Applier
    public void insertBottomUp(int i10, N n10) {
        this.applier.insertBottomUp(i10 + (this.nesting == 0 ? this.offset : 0), n10);
    }

    @Override // androidx.compose.runtime.Applier
    public void insertTopDown(int i10, N n10) {
        this.applier.insertTopDown(i10 + (this.nesting == 0 ? this.offset : 0), n10);
    }

    @Override // androidx.compose.runtime.Applier
    public void move(int i10, int i11, int i12) {
        int i13 = this.nesting == 0 ? this.offset : 0;
        this.applier.move(i10 + i13, i11 + i13, i12);
    }

    @Override // androidx.compose.runtime.Applier
    public void remove(int i10, int i11) {
        this.applier.remove(i10 + (this.nesting == 0 ? this.offset : 0), i11);
    }

    @Override // androidx.compose.runtime.Applier
    /* renamed from: up */
    public void mo972up() {
        if (!(this.nesting > 0)) {
            ComposerKt.composeImmediateRuntimeError("OffsetApplier up called with no corresponding down");
        }
        this.nesting--;
        this.applier.mo972up();
    }
}
