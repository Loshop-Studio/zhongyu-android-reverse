package androidx.compose.material3;

import androidx.compose.p014ui.graphics.Color;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC9972n;

@Immutable
/* loaded from: classes2.dex */
public final class SelectableChipColors {
    public static final int $stable = 0;
    private final long containerColor;
    private final long disabledContainerColor;
    private final long disabledLabelColor;
    private final long disabledLeadingIconColor;
    private final long disabledSelectedContainerColor;
    private final long disabledTrailingIconColor;
    private final long labelColor;
    private final long leadingIconColor;
    private final long selectedContainerColor;
    private final long selectedLabelColor;
    private final long selectedLeadingIconColor;
    private final long selectedTrailingIconColor;
    private final long trailingIconColor;

    public /* synthetic */ SelectableChipColors(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, AbstractC9972n abstractC9972n) {
        this(j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22);
    }

    /* renamed from: copy-daRQuJA$default, reason: not valid java name */
    public static /* synthetic */ SelectableChipColors m29061copydaRQuJA$default(SelectableChipColors selectableChipColors, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, int i10, Object obj) {
        long j23;
        long j24;
        long j25 = (i10 & 1) != 0 ? selectableChipColors.containerColor : j10;
        long j26 = (i10 & 2) != 0 ? selectableChipColors.labelColor : j11;
        long j27 = (i10 & 4) != 0 ? selectableChipColors.leadingIconColor : j12;
        long j28 = (i10 & 8) != 0 ? selectableChipColors.trailingIconColor : j13;
        long j29 = (i10 & 16) != 0 ? selectableChipColors.disabledContainerColor : j14;
        long j30 = (i10 & 32) != 0 ? selectableChipColors.disabledLabelColor : j15;
        long j31 = (i10 & 64) != 0 ? selectableChipColors.disabledLeadingIconColor : j16;
        long j32 = j25;
        long j33 = (i10 & 128) != 0 ? selectableChipColors.disabledTrailingIconColor : j17;
        long j34 = (i10 & 256) != 0 ? selectableChipColors.selectedContainerColor : j18;
        long j35 = (i10 & 512) != 0 ? selectableChipColors.disabledSelectedContainerColor : j19;
        long j36 = (i10 & 1024) != 0 ? selectableChipColors.selectedLabelColor : j20;
        long j37 = (i10 & 2048) != 0 ? selectableChipColors.selectedLeadingIconColor : j21;
        if ((i10 & 4096) != 0) {
            j24 = j37;
            j23 = selectableChipColors.selectedTrailingIconColor;
        } else {
            j23 = j22;
            j24 = j37;
        }
        return selectableChipColors.m29063copydaRQuJA(j32, j26, j27, j28, j29, j30, j31, j33, j34, j35, j36, j24, j23);
    }

    @Stable
    /* renamed from: containerColor-WaAFU9c$material3_release, reason: not valid java name */
    public final long m29062containerColorWaAFU9c$material3_release(boolean z10, boolean z11) {
        return !z10 ? z11 ? this.disabledSelectedContainerColor : this.disabledContainerColor : !z11 ? this.containerColor : this.selectedContainerColor;
    }

    /* renamed from: copy-daRQuJA, reason: not valid java name */
    public final SelectableChipColors m29063copydaRQuJA(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22) {
        return new SelectableChipColors(j10 != 16 ? j10 : this.containerColor, j11 != 16 ? j11 : this.labelColor, j12 != 16 ? j12 : this.leadingIconColor, j13 != 16 ? j13 : this.trailingIconColor, j14 != 16 ? j14 : this.disabledContainerColor, j15 != 16 ? j15 : this.disabledLabelColor, j16 != 16 ? j16 : this.disabledLeadingIconColor, j17 != 16 ? j17 : this.disabledTrailingIconColor, j18 != 16 ? j18 : this.selectedContainerColor, j19 != 16 ? j19 : this.disabledSelectedContainerColor, j20 != 16 ? j20 : this.selectedLabelColor, j21 != 16 ? j21 : this.selectedLeadingIconColor, j22 != 16 ? j22 : this.selectedTrailingIconColor, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof SelectableChipColors)) {
            return false;
        }
        SelectableChipColors selectableChipColors = (SelectableChipColors) obj;
        return Color.m30879equalsimpl0(this.containerColor, selectableChipColors.containerColor) && Color.m30879equalsimpl0(this.labelColor, selectableChipColors.labelColor) && Color.m30879equalsimpl0(this.leadingIconColor, selectableChipColors.leadingIconColor) && Color.m30879equalsimpl0(this.trailingIconColor, selectableChipColors.trailingIconColor) && Color.m30879equalsimpl0(this.disabledContainerColor, selectableChipColors.disabledContainerColor) && Color.m30879equalsimpl0(this.disabledLabelColor, selectableChipColors.disabledLabelColor) && Color.m30879equalsimpl0(this.disabledLeadingIconColor, selectableChipColors.disabledLeadingIconColor) && Color.m30879equalsimpl0(this.disabledTrailingIconColor, selectableChipColors.disabledTrailingIconColor) && Color.m30879equalsimpl0(this.selectedContainerColor, selectableChipColors.selectedContainerColor) && Color.m30879equalsimpl0(this.disabledSelectedContainerColor, selectableChipColors.disabledSelectedContainerColor) && Color.m30879equalsimpl0(this.selectedLabelColor, selectableChipColors.selectedLabelColor) && Color.m30879equalsimpl0(this.selectedLeadingIconColor, selectableChipColors.selectedLeadingIconColor) && Color.m30879equalsimpl0(this.selectedTrailingIconColor, selectableChipColors.selectedTrailingIconColor);
    }

    public int hashCode() {
        return (((((((((((((((((((((((Color.m30885hashCodeimpl(this.containerColor) * 31) + Color.m30885hashCodeimpl(this.labelColor)) * 31) + Color.m30885hashCodeimpl(this.leadingIconColor)) * 31) + Color.m30885hashCodeimpl(this.trailingIconColor)) * 31) + Color.m30885hashCodeimpl(this.disabledContainerColor)) * 31) + Color.m30885hashCodeimpl(this.disabledLabelColor)) * 31) + Color.m30885hashCodeimpl(this.disabledLeadingIconColor)) * 31) + Color.m30885hashCodeimpl(this.disabledTrailingIconColor)) * 31) + Color.m30885hashCodeimpl(this.selectedContainerColor)) * 31) + Color.m30885hashCodeimpl(this.disabledSelectedContainerColor)) * 31) + Color.m30885hashCodeimpl(this.selectedLabelColor)) * 31) + Color.m30885hashCodeimpl(this.selectedLeadingIconColor)) * 31) + Color.m30885hashCodeimpl(this.selectedTrailingIconColor);
    }

    @Stable
    /* renamed from: labelColor-WaAFU9c$material3_release, reason: not valid java name */
    public final long m29064labelColorWaAFU9c$material3_release(boolean z10, boolean z11) {
        return !z10 ? this.disabledLabelColor : !z11 ? this.labelColor : this.selectedLabelColor;
    }

    @Stable
    /* renamed from: leadingIconContentColor-WaAFU9c$material3_release, reason: not valid java name */
    public final long m29065leadingIconContentColorWaAFU9c$material3_release(boolean z10, boolean z11) {
        return !z10 ? this.disabledLeadingIconColor : !z11 ? this.leadingIconColor : this.selectedLeadingIconColor;
    }

    @Stable
    /* renamed from: trailingIconContentColor-WaAFU9c$material3_release, reason: not valid java name */
    public final long m29066trailingIconContentColorWaAFU9c$material3_release(boolean z10, boolean z11) {
        return !z10 ? this.disabledTrailingIconColor : !z11 ? this.trailingIconColor : this.selectedTrailingIconColor;
    }

    private SelectableChipColors(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22) {
        this.containerColor = j10;
        this.labelColor = j11;
        this.leadingIconColor = j12;
        this.trailingIconColor = j13;
        this.disabledContainerColor = j14;
        this.disabledLabelColor = j15;
        this.disabledLeadingIconColor = j16;
        this.disabledTrailingIconColor = j17;
        this.selectedContainerColor = j18;
        this.disabledSelectedContainerColor = j19;
        this.selectedLabelColor = j20;
        this.selectedLeadingIconColor = j21;
        this.selectedTrailingIconColor = j22;
    }
}
