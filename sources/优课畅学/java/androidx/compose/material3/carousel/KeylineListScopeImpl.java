package androidx.compose.material3.carousel;

import androidx.compose.material3.carousel.CarouselAlignment;
import java.util.ArrayList;
import java.util.List;
import p134i7.AbstractC8809v;

/* loaded from: classes2.dex */
final class KeylineListScopeImpl implements KeylineListScope {
    private float focalItemSize;
    private float pivotOffset;
    private int firstFocalIndex = -1;
    private int pivotIndex = -1;
    private final List<TmpKeyline> tmpKeylines = new ArrayList();

    public static final class TmpKeyline {
        private final boolean isAnchor;
        private final float size;

        public TmpKeyline(float f10, boolean z10) {
            this.size = f10;
            this.isAnchor = z10;
        }

        public static /* synthetic */ TmpKeyline copy$default(TmpKeyline tmpKeyline, float f10, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = tmpKeyline.size;
            }
            if ((i10 & 2) != 0) {
                z10 = tmpKeyline.isAnchor;
            }
            return tmpKeyline.copy(f10, z10);
        }

        public final float component1() {
            return this.size;
        }

        public final boolean component2() {
            return this.isAnchor;
        }

        public final TmpKeyline copy(float f10, boolean z10) {
            return new TmpKeyline(f10, z10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TmpKeyline)) {
                return false;
            }
            TmpKeyline tmpKeyline = (TmpKeyline) obj;
            return Float.compare(this.size, tmpKeyline.size) == 0 && this.isAnchor == tmpKeyline.isAnchor;
        }

        public final float getSize() {
            return this.size;
        }

        public int hashCode() {
            return (Float.hashCode(this.size) * 31) + Boolean.hashCode(this.isAnchor);
        }

        public final boolean isAnchor() {
            return this.isAnchor;
        }

        public String toString() {
            return "TmpKeyline(size=" + this.size + ", isAnchor=" + this.isAnchor + ')';
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.List<androidx.compose.material3.carousel.Keyline> createKeylinesWithPivot(int r28, float r29, int r30, int r31, float r32, float r33, float r34, java.util.List<androidx.compose.material3.carousel.KeylineListScopeImpl.TmpKeyline> r35) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.carousel.KeylineListScopeImpl.createKeylinesWithPivot(int, float, int, int, float, float, float, java.util.List):java.util.List");
    }

    private final int findLastFocalIndex() {
        int i10 = this.firstFocalIndex;
        while (i10 < AbstractC8809v.m14773p(this.tmpKeylines)) {
            int i11 = i10 + 1;
            if (this.tmpKeylines.get(i11).getSize() != this.focalItemSize) {
                break;
            }
            i10 = i11;
        }
        return i10;
    }

    private final boolean isCutoffLeft(float f10, float f11) {
        float f12 = f10 / 2;
        return f11 - f12 < 0.0f && f11 + f12 > 0.0f;
    }

    private final boolean isCutoffRight(float f10, float f11, float f12) {
        float f13 = f10 / 2;
        return f11 - f13 < f12 && f11 + f13 > f12;
    }

    @Override // androidx.compose.material3.carousel.KeylineListScope
    public void add(float f10, boolean z10) {
        this.tmpKeylines.add(new TmpKeyline(f10, z10));
        if (f10 > this.focalItemSize) {
            this.firstFocalIndex = AbstractC8809v.m14773p(this.tmpKeylines);
            this.focalItemSize = f10;
        }
    }

    /* renamed from: createWithAlignment-waks0t8, reason: not valid java name */
    public final KeylineList m22897createWithAlignmentwaks0t8(float f10, float f11, int i10) {
        float f12;
        int iFindLastFocalIndex = findLastFocalIndex();
        int i11 = this.firstFocalIndex;
        int i12 = iFindLastFocalIndex - i11;
        this.pivotIndex = i11;
        CarouselAlignment.Companion companion = CarouselAlignment.Companion;
        if (CarouselAlignment.m22881equalsimpl0(i10, companion.m22885getCenterNUL3oTo())) {
            float f13 = 0.0f;
            if (f11 != 0.0f) {
                int i13 = i12 % 2;
                if (i13 + ((((i13 ^ 2) & ((-i13) | i13)) >> 31) & 2) != 0) {
                    f13 = f11 / 2.0f;
                }
            }
            float f14 = 2;
            f12 = ((f10 / f14) - ((this.focalItemSize / f14) * i12)) - f13;
        } else {
            f12 = CarouselAlignment.m22881equalsimpl0(i10, companion.m22886getEndNUL3oTo()) ? f10 - (this.focalItemSize / 2) : this.focalItemSize / 2;
        }
        this.pivotOffset = f12;
        return new KeylineList(createKeylinesWithPivot(this.pivotIndex, f12, this.firstFocalIndex, iFindLastFocalIndex, this.focalItemSize, f10, f11, this.tmpKeylines));
    }

    public final KeylineList createWithPivot(float f10, float f11, int i10, float f12) {
        return new KeylineList(createKeylinesWithPivot(i10, f12, this.firstFocalIndex, findLastFocalIndex(), this.focalItemSize, f10, f11, this.tmpKeylines));
    }
}
