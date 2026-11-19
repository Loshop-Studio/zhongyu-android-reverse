package androidx.compose.material3.carousel;

import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class Keyline {
    public static final int $stable = 0;
    private final float cutoff;
    private final boolean isAnchor;
    private final boolean isFocal;
    private final boolean isPivot;
    private final float offset;
    private final float size;
    private final float unadjustedOffset;

    public Keyline(float f10, float f11, float f12, boolean z10, boolean z11, boolean z12, float f13) {
        this.size = f10;
        this.offset = f11;
        this.unadjustedOffset = f12;
        this.isFocal = z10;
        this.isAnchor = z11;
        this.isPivot = z12;
        this.cutoff = f13;
    }

    public static /* synthetic */ Keyline copy$default(Keyline keyline, float f10, float f11, float f12, boolean z10, boolean z11, boolean z12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = keyline.size;
        }
        if ((i10 & 2) != 0) {
            f11 = keyline.offset;
        }
        if ((i10 & 4) != 0) {
            f12 = keyline.unadjustedOffset;
        }
        if ((i10 & 8) != 0) {
            z10 = keyline.isFocal;
        }
        if ((i10 & 16) != 0) {
            z11 = keyline.isAnchor;
        }
        if ((i10 & 32) != 0) {
            z12 = keyline.isPivot;
        }
        if ((i10 & 64) != 0) {
            f13 = keyline.cutoff;
        }
        boolean z13 = z12;
        float f14 = f13;
        boolean z14 = z11;
        float f15 = f12;
        return keyline.copy(f10, f11, f15, z10, z14, z13, f14);
    }

    public final float component1() {
        return this.size;
    }

    public final float component2() {
        return this.offset;
    }

    public final float component3() {
        return this.unadjustedOffset;
    }

    public final boolean component4() {
        return this.isFocal;
    }

    public final boolean component5() {
        return this.isAnchor;
    }

    public final boolean component6() {
        return this.isPivot;
    }

    public final float component7() {
        return this.cutoff;
    }

    public final Keyline copy(float f10, float f11, float f12, boolean z10, boolean z11, boolean z12, float f13) {
        return new Keyline(f10, f11, f12, z10, z11, z12, f13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Keyline)) {
            return false;
        }
        Keyline keyline = (Keyline) obj;
        return Float.compare(this.size, keyline.size) == 0 && Float.compare(this.offset, keyline.offset) == 0 && Float.compare(this.unadjustedOffset, keyline.unadjustedOffset) == 0 && this.isFocal == keyline.isFocal && this.isAnchor == keyline.isAnchor && this.isPivot == keyline.isPivot && Float.compare(this.cutoff, keyline.cutoff) == 0;
    }

    public final float getCutoff() {
        return this.cutoff;
    }

    public final float getOffset() {
        return this.offset;
    }

    public final float getSize() {
        return this.size;
    }

    public final float getUnadjustedOffset() {
        return this.unadjustedOffset;
    }

    public int hashCode() {
        return (((((((((((Float.hashCode(this.size) * 31) + Float.hashCode(this.offset)) * 31) + Float.hashCode(this.unadjustedOffset)) * 31) + Boolean.hashCode(this.isFocal)) * 31) + Boolean.hashCode(this.isAnchor)) * 31) + Boolean.hashCode(this.isPivot)) * 31) + Float.hashCode(this.cutoff);
    }

    public final boolean isAnchor() {
        return this.isAnchor;
    }

    public final boolean isFocal() {
        return this.isFocal;
    }

    public final boolean isPivot() {
        return this.isPivot;
    }

    public String toString() {
        return "Keyline(size=" + this.size + ", offset=" + this.offset + ", unadjustedOffset=" + this.unadjustedOffset + ", isFocal=" + this.isFocal + ", isAnchor=" + this.isAnchor + ", isPivot=" + this.isPivot + ", cutoff=" + this.cutoff + ')';
    }
}
