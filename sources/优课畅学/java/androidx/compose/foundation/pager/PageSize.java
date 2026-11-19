package androidx.compose.foundation.pager;

import androidx.compose.p013ui.unit.C3156Dp;
import androidx.compose.p013ui.unit.Density;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9126n;

@Stable
/* loaded from: classes.dex */
public interface PageSize {

    @StabilityInferred(parameters = 1)
    public static final class Fill implements PageSize {
        public static final int $stable = 0;
        public static final Fill INSTANCE = new Fill();

        private Fill() {
        }

        @Override // androidx.compose.foundation.pager.PageSize
        public int calculateMainAxisPageSize(Density density, int i10, int i11) {
            return i10;
        }
    }

    @StabilityInferred(parameters = 1)
    public static final class Fixed implements PageSize {
        public static final int $stable = 0;
        private final float pageSize;

        public /* synthetic */ Fixed(float f10, AbstractC9126n abstractC9126n) {
            this(f10);
        }

        @Override // androidx.compose.foundation.pager.PageSize
        public int calculateMainAxisPageSize(Density density, int i10, int i11) {
            return density.mo20491roundToPx0680j_4(this.pageSize);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Fixed) {
                return C3156Dp.m26904equalsimpl0(this.pageSize, ((Fixed) obj).pageSize);
            }
            return false;
        }

        /* renamed from: getPageSize-D9Ej5fM, reason: not valid java name */
        public final float m21101getPageSizeD9Ej5fM() {
            return this.pageSize;
        }

        public int hashCode() {
            return C3156Dp.m26905hashCodeimpl(this.pageSize);
        }

        private Fixed(float f10) {
            this.pageSize = f10;
        }
    }

    int calculateMainAxisPageSize(Density density, int i10, int i11);
}
