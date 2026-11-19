package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.p013ui.unit.C3156Dp;
import androidx.compose.p013ui.unit.Density;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC9126n;

@Stable
/* loaded from: classes.dex */
public interface GridCells {

    @StabilityInferred(parameters = 1)
    public static final class Adaptive implements GridCells {
        public static final int $stable = 0;
        private final float minSize;

        public /* synthetic */ Adaptive(float f10, AbstractC9126n abstractC9126n) {
            this(f10);
        }

        @Override // androidx.compose.foundation.lazy.grid.GridCells
        public List<Integer> calculateCrossAxisCellSizes(Density density, int i10, int i11) {
            return LazyGridDslKt.calculateCellsCrossAxisSizeImpl(i10, Math.max((i10 + i11) / (density.mo20491roundToPx0680j_4(this.minSize) + i11), 1), i11);
        }

        public boolean equals(Object obj) {
            return (obj instanceof Adaptive) && C3156Dp.m26904equalsimpl0(this.minSize, ((Adaptive) obj).minSize);
        }

        public int hashCode() {
            return C3156Dp.m26905hashCodeimpl(this.minSize);
        }

        private Adaptive(float f10) {
            this.minSize = f10;
            if (C3156Dp.m26898compareTo0680j_4(f10, C3156Dp.m26899constructorimpl((float) 0)) > 0) {
                return;
            }
            InlineClassHelperKt.throwIllegalArgumentException("Provided min size should be larger than zero.");
        }
    }

    @StabilityInferred(parameters = 1)
    public static final class Fixed implements GridCells {
        public static final int $stable = 0;
        private final int count;

        public Fixed(int i10) {
            this.count = i10;
            if (i10 > 0) {
                return;
            }
            InlineClassHelperKt.throwIllegalArgumentException("Provided count should be larger than zero");
        }

        @Override // androidx.compose.foundation.lazy.grid.GridCells
        public List<Integer> calculateCrossAxisCellSizes(Density density, int i10, int i11) {
            return LazyGridDslKt.calculateCellsCrossAxisSizeImpl(i10, this.count, i11);
        }

        public boolean equals(Object obj) {
            return (obj instanceof Fixed) && this.count == ((Fixed) obj).count;
        }

        public int hashCode() {
            return -this.count;
        }
    }

    @StabilityInferred(parameters = 1)
    public static final class FixedSize implements GridCells {
        public static final int $stable = 0;
        private final float size;

        public /* synthetic */ FixedSize(float f10, AbstractC9126n abstractC9126n) {
            this(f10);
        }

        @Override // androidx.compose.foundation.lazy.grid.GridCells
        public List<Integer> calculateCrossAxisCellSizes(Density density, int i10, int i11) {
            int iMo20491roundToPx0680j_4 = density.mo20491roundToPx0680j_4(this.size);
            int i12 = iMo20491roundToPx0680j_4 + i11;
            int i13 = i11 + i10;
            if (i12 >= i13) {
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(Integer.valueOf(i10));
                return arrayList;
            }
            int i14 = i13 / i12;
            ArrayList arrayList2 = new ArrayList(i14);
            for (int i15 = 0; i15 < i14; i15++) {
                arrayList2.add(Integer.valueOf(iMo20491roundToPx0680j_4));
            }
            return arrayList2;
        }

        public boolean equals(Object obj) {
            return (obj instanceof FixedSize) && C3156Dp.m26904equalsimpl0(this.size, ((FixedSize) obj).size);
        }

        public int hashCode() {
            return C3156Dp.m26905hashCodeimpl(this.size);
        }

        private FixedSize(float f10) {
            this.size = f10;
            if (C3156Dp.m26898compareTo0680j_4(f10, C3156Dp.m26899constructorimpl((float) 0)) > 0) {
                return;
            }
            InlineClassHelperKt.throwIllegalArgumentException("Provided size should be larger than zero.");
        }
    }

    List<Integer> calculateCrossAxisCellSizes(Density density, int i10, int i11);
}
