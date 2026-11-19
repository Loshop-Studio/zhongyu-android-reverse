package androidx.compose.material3.carousel;

import androidx.collection.AbstractC0584a;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(m5109d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003JO\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000eR\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\r¨\u0006 "}, m5110d2 = {"Landroidx/compose/material3/carousel/Keyline;", "", "size", "", TypedValues.CycleType.S_WAVE_OFFSET, "unadjustedOffset", "isFocal", "", "isAnchor", "isPivot", "cutoff", "(FFFZZZF)V", "getCutoff", "()F", "()Z", "getOffset", "getSize", "getUnadjustedOffset", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "", "material3_release"}, m5111k = 1, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final /* data */ class Keyline {
    public static final int $stable = 0;
    private final float cutoff;
    private final boolean isAnchor;
    private final boolean isFocal;
    private final boolean isPivot;
    private final float offset;
    private final float size;
    private final float unadjustedOffset;

    public Keyline(float f, float f7, float f8, boolean z8, boolean z9, boolean z10, float f9) {
        this.size = f;
        this.offset = f7;
        this.unadjustedOffset = f8;
        this.isFocal = z8;
        this.isAnchor = z9;
        this.isPivot = z10;
        this.cutoff = f9;
    }

    public static /* synthetic */ Keyline copy$default(Keyline keyline, float f, float f7, float f8, boolean z8, boolean z9, boolean z10, float f9, int i, Object obj) {
        if ((i & 1) != 0) {
            f = keyline.size;
        }
        if ((i & 2) != 0) {
            f7 = keyline.offset;
        }
        if ((i & 4) != 0) {
            f8 = keyline.unadjustedOffset;
        }
        if ((i & 8) != 0) {
            z8 = keyline.isFocal;
        }
        if ((i & 16) != 0) {
            z9 = keyline.isAnchor;
        }
        if ((i & 32) != 0) {
            z10 = keyline.isPivot;
        }
        if ((i & 64) != 0) {
            f9 = keyline.cutoff;
        }
        boolean z11 = z10;
        float f10 = f9;
        boolean z12 = z9;
        float f11 = f8;
        return keyline.copy(f, f7, f11, z8, z12, z11, f10);
    }

    /* renamed from: component1, reason: from getter */
    public final float getSize() {
        return this.size;
    }

    /* renamed from: component2, reason: from getter */
    public final float getOffset() {
        return this.offset;
    }

    /* renamed from: component3, reason: from getter */
    public final float getUnadjustedOffset() {
        return this.unadjustedOffset;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsFocal() {
        return this.isFocal;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsAnchor() {
        return this.isAnchor;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsPivot() {
        return this.isPivot;
    }

    /* renamed from: component7, reason: from getter */
    public final float getCutoff() {
        return this.cutoff;
    }

    @NotNull
    public final Keyline copy(float size, float offset, float unadjustedOffset, boolean isFocal, boolean isAnchor, boolean isPivot, float cutoff) {
        return new Keyline(size, offset, unadjustedOffset, isFocal, isAnchor, isPivot, cutoff);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Keyline)) {
            return false;
        }
        Keyline keyline = (Keyline) other;
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
        return Float.hashCode(this.cutoff) + AbstractC0584a.m908i(this.isPivot, AbstractC0584a.m908i(this.isAnchor, AbstractC0584a.m908i(this.isFocal, AbstractC0584a.m901b(this.unadjustedOffset, AbstractC0584a.m901b(this.offset, Float.hashCode(this.size) * 31, 31), 31), 31), 31), 31);
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

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("Keyline(size=");
        sb.append(this.size);
        sb.append(", offset=");
        sb.append(this.offset);
        sb.append(", unadjustedOffset=");
        sb.append(this.unadjustedOffset);
        sb.append(", isFocal=");
        sb.append(this.isFocal);
        sb.append(", isAnchor=");
        sb.append(this.isAnchor);
        sb.append(", isPivot=");
        sb.append(this.isPivot);
        sb.append(", cutoff=");
        return AbstractC0584a.m915p(sb, this.cutoff, ')');
    }
}
