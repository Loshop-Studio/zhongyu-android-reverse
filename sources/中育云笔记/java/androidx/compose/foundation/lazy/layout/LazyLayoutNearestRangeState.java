package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9972n;
import p265nd.AbstractC10410o;
import p265nd.C10405j;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class LazyLayoutNearestRangeState implements State<C10405j> {
    public static final int $stable = 0;
    private static final Companion Companion = new Companion(null);
    private final int extraItemCount;
    private int lastFirstVisibleItem;
    private final int slidingWindowSize;
    private final MutableState value$delegate;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final C10405j calculateNearestItemsRange(int i10, int i11, int i12) {
            int i13 = (i10 / i11) * i11;
            return AbstractC10410o.m21768u(Math.max(i13 - i12, 0), i13 + i11 + i12);
        }

        private Companion() {
        }
    }

    public LazyLayoutNearestRangeState(int i10, int i11, int i12) {
        this.slidingWindowSize = i11;
        this.extraItemCount = i12;
        this.value$delegate = SnapshotStateKt.mutableStateOf(Companion.calculateNearestItemsRange(i10, i11, i12), SnapshotStateKt.structuralEqualityPolicy());
        this.lastFirstVisibleItem = i10;
    }

    private void setValue(C10405j c10405j) {
        this.value$delegate.setValue(c10405j);
    }

    public final void update(int i10) {
        if (i10 != this.lastFirstVisibleItem) {
            this.lastFirstVisibleItem = i10;
            setValue(Companion.calculateNearestItemsRange(i10, this.slidingWindowSize, this.extraItemCount));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.State
    public C10405j getValue() {
        return (C10405j) this.value$delegate.getValue();
    }
}
