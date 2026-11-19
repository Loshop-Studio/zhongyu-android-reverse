package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9126n;
import p077d8.AbstractC8323h;
import p077d8.C8321f;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class LazyLayoutNearestRangeState implements State<C8321f> {
    public static final int $stable = 0;
    private static final Companion Companion = new Companion(null);
    private final int extraItemCount;
    private int lastFirstVisibleItem;
    private final int slidingWindowSize;
    private final MutableState value$delegate;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final C8321f calculateNearestItemsRange(int i10, int i11, int i12) {
            int i13 = (i10 / i11) * i11;
            return AbstractC8323h.m13525t(Math.max(i13 - i12, 0), i13 + i11 + i12);
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

    private void setValue(C8321f c8321f) {
        this.value$delegate.setValue(c8321f);
    }

    public final void update(int i10) {
        if (i10 != this.lastFirstVisibleItem) {
            this.lastFirstVisibleItem = i10;
            setValue(Companion.calculateNearestItemsRange(i10, this.slidingWindowSize, this.extraItemCount));
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.State
    public C8321f getValue() {
        return (C8321f) this.value$delegate.getValue();
    }
}
