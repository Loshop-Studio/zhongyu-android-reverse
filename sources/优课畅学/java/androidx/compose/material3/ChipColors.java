package androidx.compose.material3;

import androidx.compose.p013ui.graphics.Color;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC9126n;

@Immutable
/* loaded from: classes2.dex */
public final class ChipColors {
    public static final int $stable = 0;
    private final long containerColor;
    private final long disabledContainerColor;
    private final long disabledLabelColor;
    private final long disabledLeadingIconContentColor;
    private final long disabledTrailingIconContentColor;
    private final long labelColor;
    private final long leadingIconContentColor;
    private final long trailingIconContentColor;

    public /* synthetic */ ChipColors(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, AbstractC9126n abstractC9126n) {
        this(j10, j11, j12, j13, j14, j15, j16, j17);
    }

    /* renamed from: copy-FD3wquc$default, reason: not valid java name */
    public static /* synthetic */ ChipColors m21833copyFD3wquc$default(ChipColors chipColors, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, int i10, Object obj) {
        long j18;
        long j19;
        long j20 = (i10 & 1) != 0 ? chipColors.containerColor : j10;
        long j21 = (i10 & 2) != 0 ? chipColors.labelColor : j11;
        long j22 = (i10 & 4) != 0 ? chipColors.leadingIconContentColor : j12;
        long j23 = (i10 & 8) != 0 ? chipColors.trailingIconContentColor : j13;
        long j24 = (i10 & 16) != 0 ? chipColors.disabledContainerColor : j14;
        long j25 = (i10 & 32) != 0 ? chipColors.disabledLabelColor : j15;
        long j26 = (i10 & 64) != 0 ? chipColors.disabledLeadingIconContentColor : j16;
        if ((i10 & 128) != 0) {
            j18 = chipColors.disabledTrailingIconContentColor;
            j19 = j20;
        } else {
            j18 = j17;
            j19 = j20;
        }
        return chipColors.m21835copyFD3wquc(j19, j21, j22, j23, j24, j25, j26, j18);
    }

    @Stable
    /* renamed from: containerColor-vNxB06k$material3_release, reason: not valid java name */
    public final long m21834containerColorvNxB06k$material3_release(boolean z10) {
        return z10 ? this.containerColor : this.disabledContainerColor;
    }

    /* renamed from: copy-FD3wquc, reason: not valid java name */
    public final ChipColors m21835copyFD3wquc(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17) {
        return new ChipColors(j10 != 16 ? j10 : this.containerColor, j11 != 16 ? j11 : this.labelColor, j12 != 16 ? j12 : this.leadingIconContentColor, j13 != 16 ? j13 : this.trailingIconContentColor, j14 != 16 ? j14 : this.disabledContainerColor, j15 != 16 ? j15 : this.disabledLabelColor, j16 != 16 ? j16 : this.disabledLeadingIconContentColor, j17 != 16 ? j17 : this.disabledTrailingIconContentColor, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ChipColors)) {
            return false;
        }
        ChipColors chipColors = (ChipColors) obj;
        return Color.m24277equalsimpl0(this.containerColor, chipColors.containerColor) && Color.m24277equalsimpl0(this.labelColor, chipColors.labelColor) && Color.m24277equalsimpl0(this.leadingIconContentColor, chipColors.leadingIconContentColor) && Color.m24277equalsimpl0(this.trailingIconContentColor, chipColors.trailingIconContentColor) && Color.m24277equalsimpl0(this.disabledContainerColor, chipColors.disabledContainerColor) && Color.m24277equalsimpl0(this.disabledLabelColor, chipColors.disabledLabelColor) && Color.m24277equalsimpl0(this.disabledLeadingIconContentColor, chipColors.disabledLeadingIconContentColor) && Color.m24277equalsimpl0(this.disabledTrailingIconContentColor, chipColors.disabledTrailingIconContentColor);
    }

    /* renamed from: getContainerColor-0d7_KjU, reason: not valid java name */
    public final long m21836getContainerColor0d7_KjU() {
        return this.containerColor;
    }

    /* renamed from: getDisabledContainerColor-0d7_KjU, reason: not valid java name */
    public final long m21837getDisabledContainerColor0d7_KjU() {
        return this.disabledContainerColor;
    }

    /* renamed from: getDisabledLabelColor-0d7_KjU, reason: not valid java name */
    public final long m21838getDisabledLabelColor0d7_KjU() {
        return this.disabledLabelColor;
    }

    /* renamed from: getDisabledLeadingIconContentColor-0d7_KjU, reason: not valid java name */
    public final long m21839getDisabledLeadingIconContentColor0d7_KjU() {
        return this.disabledLeadingIconContentColor;
    }

    /* renamed from: getDisabledTrailingIconContentColor-0d7_KjU, reason: not valid java name */
    public final long m21840getDisabledTrailingIconContentColor0d7_KjU() {
        return this.disabledTrailingIconContentColor;
    }

    /* renamed from: getLabelColor-0d7_KjU, reason: not valid java name */
    public final long m21841getLabelColor0d7_KjU() {
        return this.labelColor;
    }

    /* renamed from: getLeadingIconContentColor-0d7_KjU, reason: not valid java name */
    public final long m21842getLeadingIconContentColor0d7_KjU() {
        return this.leadingIconContentColor;
    }

    /* renamed from: getTrailingIconContentColor-0d7_KjU, reason: not valid java name */
    public final long m21843getTrailingIconContentColor0d7_KjU() {
        return this.trailingIconContentColor;
    }

    public int hashCode() {
        return (((((((((((((Color.m24283hashCodeimpl(this.containerColor) * 31) + Color.m24283hashCodeimpl(this.labelColor)) * 31) + Color.m24283hashCodeimpl(this.leadingIconContentColor)) * 31) + Color.m24283hashCodeimpl(this.trailingIconContentColor)) * 31) + Color.m24283hashCodeimpl(this.disabledContainerColor)) * 31) + Color.m24283hashCodeimpl(this.disabledLabelColor)) * 31) + Color.m24283hashCodeimpl(this.disabledLeadingIconContentColor)) * 31) + Color.m24283hashCodeimpl(this.disabledTrailingIconContentColor);
    }

    @Stable
    /* renamed from: labelColor-vNxB06k$material3_release, reason: not valid java name */
    public final long m21844labelColorvNxB06k$material3_release(boolean z10) {
        return z10 ? this.labelColor : this.disabledLabelColor;
    }

    @Stable
    /* renamed from: leadingIconContentColor-vNxB06k$material3_release, reason: not valid java name */
    public final long m21845leadingIconContentColorvNxB06k$material3_release(boolean z10) {
        return z10 ? this.leadingIconContentColor : this.disabledLeadingIconContentColor;
    }

    @Stable
    /* renamed from: trailingIconContentColor-vNxB06k$material3_release, reason: not valid java name */
    public final long m21846trailingIconContentColorvNxB06k$material3_release(boolean z10) {
        return z10 ? this.trailingIconContentColor : this.disabledTrailingIconContentColor;
    }

    private ChipColors(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17) {
        this.containerColor = j10;
        this.labelColor = j11;
        this.leadingIconContentColor = j12;
        this.trailingIconContentColor = j13;
        this.disabledContainerColor = j14;
        this.disabledLabelColor = j15;
        this.disabledLeadingIconContentColor = j16;
        this.disabledTrailingIconContentColor = j17;
    }
}
