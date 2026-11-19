package androidx.compose.material3.internal;

import androidx.compose.material3.internal.MenuPosition;
import androidx.compose.p014ui.Alignment;
import androidx.compose.p014ui.unit.IntRect;
import androidx.compose.p014ui.unit.IntSize;
import androidx.compose.p014ui.unit.LayoutDirection;
import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC9979u;
import p265nd.AbstractC10410o;

@Immutable
/* loaded from: classes2.dex */
public final class WindowAlignmentMarginPosition {
    public static final int $stable = 0;
    public static final WindowAlignmentMarginPosition INSTANCE = new WindowAlignmentMarginPosition();

    @Immutable
    public static final class Horizontal implements MenuPosition.Horizontal {
        public static final int $stable = 0;
        private final Alignment.Horizontal alignment;
        private final int margin;

        public Horizontal(Alignment.Horizontal horizontal, int i10) {
            this.alignment = horizontal;
            this.margin = i10;
        }

        private final Alignment.Horizontal component1() {
            return this.alignment;
        }

        private final int component2() {
            return this.margin;
        }

        public static /* synthetic */ Horizontal copy$default(Horizontal horizontal, Alignment.Horizontal horizontal2, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                horizontal2 = horizontal.alignment;
            }
            if ((i11 & 2) != 0) {
                i10 = horizontal.margin;
            }
            return horizontal.copy(horizontal2, i10);
        }

        public final Horizontal copy(Alignment.Horizontal horizontal, int i10) {
            return new Horizontal(horizontal, i10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Horizontal)) {
                return false;
            }
            Horizontal horizontal = (Horizontal) obj;
            return AbstractC9979u.m20289b(this.alignment, horizontal.alignment) && this.margin == horizontal.margin;
        }

        public int hashCode() {
            return (this.alignment.hashCode() * 31) + Integer.hashCode(this.margin);
        }

        @Override // androidx.compose.material3.internal.MenuPosition.Horizontal
        /* renamed from: position-95KtPRI */
        public int mo29503position95KtPRI(IntRect intRect, long j10, int i10, LayoutDirection layoutDirection) {
            return i10 >= IntSize.m33672getWidthimpl(j10) - (this.margin * 2) ? Alignment.Companion.getCenterHorizontally().align(i10, IntSize.m33672getWidthimpl(j10), layoutDirection) : AbstractC10410o.m21761n(this.alignment.align(i10, IntSize.m33672getWidthimpl(j10), layoutDirection), this.margin, (IntSize.m33672getWidthimpl(j10) - this.margin) - i10);
        }

        public String toString() {
            return "Horizontal(alignment=" + this.alignment + ", margin=" + this.margin + ')';
        }
    }

    @Immutable
    public static final class Vertical implements MenuPosition.Vertical {
        public static final int $stable = 0;
        private final Alignment.Vertical alignment;
        private final int margin;

        public Vertical(Alignment.Vertical vertical, int i10) {
            this.alignment = vertical;
            this.margin = i10;
        }

        private final Alignment.Vertical component1() {
            return this.alignment;
        }

        private final int component2() {
            return this.margin;
        }

        public static /* synthetic */ Vertical copy$default(Vertical vertical, Alignment.Vertical vertical2, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                vertical2 = vertical.alignment;
            }
            if ((i11 & 2) != 0) {
                i10 = vertical.margin;
            }
            return vertical.copy(vertical2, i10);
        }

        public final Vertical copy(Alignment.Vertical vertical, int i10) {
            return new Vertical(vertical, i10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Vertical)) {
                return false;
            }
            Vertical vertical = (Vertical) obj;
            return AbstractC9979u.m20289b(this.alignment, vertical.alignment) && this.margin == vertical.margin;
        }

        public int hashCode() {
            return (this.alignment.hashCode() * 31) + Integer.hashCode(this.margin);
        }

        @Override // androidx.compose.material3.internal.MenuPosition.Vertical
        /* renamed from: position-JVtK1S4 */
        public int mo29504positionJVtK1S4(IntRect intRect, long j10, int i10) {
            return i10 >= IntSize.m33671getHeightimpl(j10) - (this.margin * 2) ? Alignment.Companion.getCenterVertically().align(i10, IntSize.m33671getHeightimpl(j10)) : AbstractC10410o.m21761n(this.alignment.align(i10, IntSize.m33671getHeightimpl(j10)), this.margin, (IntSize.m33671getHeightimpl(j10) - this.margin) - i10);
        }

        public String toString() {
            return "Vertical(alignment=" + this.alignment + ", margin=" + this.margin + ')';
        }
    }

    private WindowAlignmentMarginPosition() {
    }
}
