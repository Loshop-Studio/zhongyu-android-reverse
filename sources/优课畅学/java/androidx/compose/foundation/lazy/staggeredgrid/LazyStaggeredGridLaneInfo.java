package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLaneInfo;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9126n;
import p134i7.AbstractC8778f0;
import p134i7.AbstractC8797p;
import p134i7.AbstractC8809v;
import p134i7.C8791m;
import p168l7.AbstractC9260b;
import p300x7.InterfaceC10570l;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class LazyStaggeredGridLaneInfo {
    public static final int FullSpan = -2;
    private static final int MaxCapacity = 131072;
    public static final int Unset = -1;
    private int anchor;
    private int[] lanes = new int[16];
    private final C8791m spannedItems = new C8791m();
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        private Companion() {
        }
    }

    public static final class SpannedItem {
        private int[] gaps;
        private final int index;

        public SpannedItem(int i10, int[] iArr) {
            this.index = i10;
            this.gaps = iArr;
        }

        public final int[] getGaps() {
            return this.gaps;
        }

        public final int getIndex() {
            return this.index;
        }

        public final void setGaps(int[] iArr) {
            this.gaps = iArr;
        }
    }

    private final void ensureCapacity(int i10, int i11) {
        if (!(i10 <= 131072)) {
            InlineClassHelperKt.throwIllegalArgumentException("Requested item capacity " + i10 + " is larger than max supported: 131072!");
        }
        int[] iArr = this.lanes;
        if (iArr.length < i10) {
            int length = iArr.length;
            while (length < i10) {
                length *= 2;
            }
            this.lanes = AbstractC8797p.m14653t(this.lanes, new int[length], i11, 0, 0, 12, null);
        }
    }

    public static /* synthetic */ void ensureCapacity$default(LazyStaggeredGridLaneInfo lazyStaggeredGridLaneInfo, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        lazyStaggeredGridLaneInfo.ensureCapacity(i10, i11);
    }

    public final boolean assignedToLane(int i10, int i11) {
        int lane = getLane(i10);
        return lane == i11 || lane == -1 || lane == -2;
    }

    public final void ensureValidIndex(int i10) {
        int i11 = this.anchor;
        int i12 = i10 - i11;
        if (i12 < 0 || i12 >= 131072) {
            int iMax = Math.max(i10 - (this.lanes.length / 2), 0);
            this.anchor = iMax;
            int i13 = iMax - i11;
            if (i13 >= 0) {
                int[] iArr = this.lanes;
                if (i13 < iArr.length) {
                    AbstractC8797p.m14647n(iArr, iArr, 0, i13, iArr.length);
                }
                int[] iArr2 = this.lanes;
                AbstractC8797p.m14611A(iArr2, 0, Math.max(0, iArr2.length - i13), this.lanes.length);
            } else {
                int i14 = -i13;
                int[] iArr3 = this.lanes;
                if (iArr3.length + i14 < 131072) {
                    ensureCapacity(iArr3.length + i14 + 1, i14);
                } else {
                    if (i14 < iArr3.length) {
                        AbstractC8797p.m14647n(iArr3, iArr3, i14, 0, iArr3.length - i14);
                    }
                    int[] iArr4 = this.lanes;
                    AbstractC8797p.m14611A(iArr4, 0, 0, Math.min(iArr4.length, i14));
                }
            }
        } else {
            ensureCapacity$default(this, i12 + 1, 0, 2, null);
        }
        while (!this.spannedItems.isEmpty() && ((SpannedItem) this.spannedItems.first()).getIndex() < lowerBound()) {
            this.spannedItems.removeFirst();
        }
        while (!this.spannedItems.isEmpty() && ((SpannedItem) this.spannedItems.last()).getIndex() > upperBound()) {
            this.spannedItems.removeLast();
        }
    }

    public final int findNextItemIndex(int i10, int i11) {
        int iUpperBound = upperBound();
        for (int i12 = i10 + 1; i12 < iUpperBound; i12++) {
            if (assignedToLane(i12, i11)) {
                return i12;
            }
        }
        return upperBound();
    }

    public final int findPreviousItemIndex(int i10, int i11) {
        do {
            i10--;
            if (-1 >= i10) {
                return -1;
            }
        } while (!assignedToLane(i10, i11));
        return i10;
    }

    public final int[] getGaps(int i10) {
        C8791m c8791m = this.spannedItems;
        final Integer numValueOf = Integer.valueOf(i10);
        SpannedItem spannedItem = (SpannedItem) AbstractC8778f0.m14569o0(this.spannedItems, AbstractC8809v.m14767j(c8791m, 0, c8791m.size(), new InterfaceC10570l() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLaneInfo$getGaps$$inlined$binarySearchBy$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public final Integer invoke(LazyStaggeredGridLaneInfo.SpannedItem spannedItem2) {
                return Integer.valueOf(AbstractC9260b.m16977d(Integer.valueOf(spannedItem2.getIndex()), numValueOf));
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((LazyStaggeredGridLaneInfo.SpannedItem) obj);
            }
        }));
        if (spannedItem != null) {
            return spannedItem.getGaps();
        }
        return null;
    }

    public final int getLane(int i10) {
        if (i10 < lowerBound() || i10 >= upperBound()) {
            return -1;
        }
        return this.lanes[i10 - this.anchor] - 1;
    }

    public final int lowerBound() {
        return this.anchor;
    }

    public final void reset() {
        AbstractC8797p.m14615E(this.lanes, 0, 0, 0, 6, null);
        this.spannedItems.clear();
    }

    public final void setGaps(int i10, int[] iArr) {
        C8791m c8791m = this.spannedItems;
        final Integer numValueOf = Integer.valueOf(i10);
        int iM14767j = AbstractC8809v.m14767j(c8791m, 0, c8791m.size(), new InterfaceC10570l() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLaneInfo$setGaps$$inlined$binarySearchBy$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public final Integer invoke(LazyStaggeredGridLaneInfo.SpannedItem spannedItem) {
                return Integer.valueOf(AbstractC9260b.m16977d(Integer.valueOf(spannedItem.getIndex()), numValueOf));
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((LazyStaggeredGridLaneInfo.SpannedItem) obj);
            }
        });
        if (iM14767j < 0) {
            if (iArr == null) {
                return;
            }
            this.spannedItems.add(-(iM14767j + 1), new SpannedItem(i10, iArr));
            return;
        }
        if (iArr == null) {
            this.spannedItems.remove(iM14767j);
        } else {
            ((SpannedItem) this.spannedItems.get(iM14767j)).setGaps(iArr);
        }
    }

    public final void setLane(int i10, int i11) {
        if (!(i10 >= 0)) {
            InlineClassHelperKt.throwIllegalArgumentException("Negative lanes are not supported");
        }
        ensureValidIndex(i10);
        this.lanes[i10 - this.anchor] = i11 + 1;
    }

    public final int upperBound() {
        return this.anchor + this.lanes.length;
    }
}
