package androidx.compose.material3;

import androidx.compose.p012ui.graphics.Color;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@Immutable
@Metadata(m13412d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001Bm\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003¢\u0006\u0002\u0010\u0010J%\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0092\u0001\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u00132\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J%\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u0016J%\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b \u0010\u0016J%\u0010!\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\"\u0010\u0016R\u0016\u0010\u0002\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0011R\u0016\u0010\b\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0011R\u0016\u0010\t\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0011R\u0016\u0010\f\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0011R\u0016\u0010\n\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0011R\u0016\u0010\u0004\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0011R\u0016\u0010\u0005\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0011R\u0016\u0010\u000b\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0011R\u0016\u0010\r\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0011R\u0016\u0010\u000e\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0011R\u0016\u0010\u000f\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0011R\u0016\u0010\u0006\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0011\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006#"}, m13413d2 = {"Landroidx/compose/material3/SelectableChipColors;", "", "containerColor", "Landroidx/compose/ui/graphics/Color;", "labelColor", "leadingIconColor", "trailingIconColor", "disabledContainerColor", "disabledLabelColor", "disabledLeadingIconColor", "disabledTrailingIconColor", "selectedContainerColor", "disabledSelectedContainerColor", "selectedLabelColor", "selectedLeadingIconColor", "selectedTrailingIconColor", "(JJJJJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "J", "enabled", "", "selected", "containerColor-WaAFU9c$material3_release", "(ZZ)J", "copy", "copy-daRQuJA", "(JJJJJJJJJJJJJ)Landroidx/compose/material3/SelectableChipColors;", "equals", "other", "hashCode", "", "labelColor-WaAFU9c$material3_release", "leadingIconContentColor", "leadingIconContentColor-WaAFU9c$material3_release", "trailingIconContentColor", "trailingIconContentColor-WaAFU9c$material3_release", "material3_release"}, m13414k = 1, m13415mv = {1, 8, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nChip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Chip.kt\nandroidx/compose/material3/SelectableChipColors\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,2787:1\n708#2:2788\n696#2:2789\n708#2:2790\n696#2:2791\n708#2:2792\n696#2:2793\n708#2:2794\n696#2:2795\n708#2:2796\n696#2:2797\n708#2:2798\n696#2:2799\n708#2:2800\n696#2:2801\n708#2:2802\n696#2:2803\n708#2:2804\n696#2:2805\n708#2:2806\n696#2:2807\n708#2:2808\n696#2:2809\n708#2:2810\n696#2:2811\n708#2:2812\n696#2:2813\n*S KotlinDebug\n*F\n+ 1 Chip.kt\nandroidx/compose/material3/SelectableChipColors\n*L\n2601#1:2788\n2601#1:2789\n2602#1:2790\n2602#1:2791\n2603#1:2792\n2603#1:2793\n2604#1:2794\n2604#1:2795\n2605#1:2796\n2605#1:2797\n2606#1:2798\n2606#1:2799\n2607#1:2800\n2607#1:2801\n2608#1:2802\n2608#1:2803\n2609#1:2804\n2609#1:2805\n2610#1:2806\n2610#1:2807\n2611#1:2808\n2611#1:2809\n2612#1:2810\n2612#1:2811\n2613#1:2812\n2613#1:2813\n*E\n"})
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

    public /* synthetic */ SelectableChipColors(long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, DefaultConstructorMarker defaultConstructorMarker) {
        this(j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21);
    }

    /* renamed from: copy-daRQuJA$default, reason: not valid java name */
    public static /* synthetic */ SelectableChipColors m19628copydaRQuJA$default(SelectableChipColors selectableChipColors, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, int i9, Object obj) {
        long j22;
        long j23;
        long j24 = (i9 & 1) != 0 ? selectableChipColors.containerColor : j9;
        long j25 = (i9 & 2) != 0 ? selectableChipColors.labelColor : j10;
        long j26 = (i9 & 4) != 0 ? selectableChipColors.leadingIconColor : j11;
        long j27 = (i9 & 8) != 0 ? selectableChipColors.trailingIconColor : j12;
        long j28 = (i9 & 16) != 0 ? selectableChipColors.disabledContainerColor : j13;
        long j29 = (i9 & 32) != 0 ? selectableChipColors.disabledLabelColor : j14;
        long j30 = (i9 & 64) != 0 ? selectableChipColors.disabledLeadingIconColor : j15;
        long j31 = j24;
        long j32 = (i9 & 128) != 0 ? selectableChipColors.disabledTrailingIconColor : j16;
        long j33 = (i9 & 256) != 0 ? selectableChipColors.selectedContainerColor : j17;
        long j34 = (i9 & 512) != 0 ? selectableChipColors.disabledSelectedContainerColor : j18;
        long j35 = (i9 & 1024) != 0 ? selectableChipColors.selectedLabelColor : j19;
        long j36 = (i9 & 2048) != 0 ? selectableChipColors.selectedLeadingIconColor : j20;
        if ((i9 & 4096) != 0) {
            j23 = j36;
            j22 = selectableChipColors.selectedTrailingIconColor;
        } else {
            j22 = j21;
            j23 = j36;
        }
        return selectableChipColors.m19630copydaRQuJA(j31, j25, j26, j27, j28, j29, j30, j32, j33, j34, j35, j23, j22);
    }

    @Stable
    /* renamed from: containerColor-WaAFU9c$material3_release, reason: not valid java name */
    public final long m19629containerColorWaAFU9c$material3_release(boolean enabled, boolean selected) {
        return !enabled ? selected ? this.disabledSelectedContainerColor : this.disabledContainerColor : !selected ? this.containerColor : this.selectedContainerColor;
    }

    /* renamed from: copy-daRQuJA, reason: not valid java name */
    public final SelectableChipColors m19630copydaRQuJA(long containerColor, long labelColor, long leadingIconColor, long trailingIconColor, long disabledContainerColor, long disabledLabelColor, long disabledLeadingIconColor, long disabledTrailingIconColor, long selectedContainerColor, long disabledSelectedContainerColor, long selectedLabelColor, long selectedLeadingIconColor, long selectedTrailingIconColor) {
        return new SelectableChipColors(containerColor != 16 ? containerColor : this.containerColor, labelColor != 16 ? labelColor : this.labelColor, leadingIconColor != 16 ? leadingIconColor : this.leadingIconColor, trailingIconColor != 16 ? trailingIconColor : this.trailingIconColor, disabledContainerColor != 16 ? disabledContainerColor : this.disabledContainerColor, disabledLabelColor != 16 ? disabledLabelColor : this.disabledLabelColor, disabledLeadingIconColor != 16 ? disabledLeadingIconColor : this.disabledLeadingIconColor, disabledTrailingIconColor != 16 ? disabledTrailingIconColor : this.disabledTrailingIconColor, selectedContainerColor != 16 ? selectedContainerColor : this.selectedContainerColor, disabledSelectedContainerColor != 16 ? disabledSelectedContainerColor : this.disabledSelectedContainerColor, selectedLabelColor != 16 ? selectedLabelColor : this.selectedLabelColor, selectedLeadingIconColor != 16 ? selectedLeadingIconColor : this.selectedLeadingIconColor, selectedTrailingIconColor != 16 ? selectedTrailingIconColor : this.selectedTrailingIconColor, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof SelectableChipColors)) {
            return false;
        }
        SelectableChipColors selectableChipColors = (SelectableChipColors) other;
        return Color.m21410equalsimpl0(this.containerColor, selectableChipColors.containerColor) && Color.m21410equalsimpl0(this.labelColor, selectableChipColors.labelColor) && Color.m21410equalsimpl0(this.leadingIconColor, selectableChipColors.leadingIconColor) && Color.m21410equalsimpl0(this.trailingIconColor, selectableChipColors.trailingIconColor) && Color.m21410equalsimpl0(this.disabledContainerColor, selectableChipColors.disabledContainerColor) && Color.m21410equalsimpl0(this.disabledLabelColor, selectableChipColors.disabledLabelColor) && Color.m21410equalsimpl0(this.disabledLeadingIconColor, selectableChipColors.disabledLeadingIconColor) && Color.m21410equalsimpl0(this.disabledTrailingIconColor, selectableChipColors.disabledTrailingIconColor) && Color.m21410equalsimpl0(this.selectedContainerColor, selectableChipColors.selectedContainerColor) && Color.m21410equalsimpl0(this.disabledSelectedContainerColor, selectableChipColors.disabledSelectedContainerColor) && Color.m21410equalsimpl0(this.selectedLabelColor, selectableChipColors.selectedLabelColor) && Color.m21410equalsimpl0(this.selectedLeadingIconColor, selectableChipColors.selectedLeadingIconColor) && Color.m21410equalsimpl0(this.selectedTrailingIconColor, selectableChipColors.selectedTrailingIconColor);
    }

    public int hashCode() {
        return (((((((((((((((((((((((Color.m21416hashCodeimpl(this.containerColor) * 31) + Color.m21416hashCodeimpl(this.labelColor)) * 31) + Color.m21416hashCodeimpl(this.leadingIconColor)) * 31) + Color.m21416hashCodeimpl(this.trailingIconColor)) * 31) + Color.m21416hashCodeimpl(this.disabledContainerColor)) * 31) + Color.m21416hashCodeimpl(this.disabledLabelColor)) * 31) + Color.m21416hashCodeimpl(this.disabledLeadingIconColor)) * 31) + Color.m21416hashCodeimpl(this.disabledTrailingIconColor)) * 31) + Color.m21416hashCodeimpl(this.selectedContainerColor)) * 31) + Color.m21416hashCodeimpl(this.disabledSelectedContainerColor)) * 31) + Color.m21416hashCodeimpl(this.selectedLabelColor)) * 31) + Color.m21416hashCodeimpl(this.selectedLeadingIconColor)) * 31) + Color.m21416hashCodeimpl(this.selectedTrailingIconColor);
    }

    @Stable
    /* renamed from: labelColor-WaAFU9c$material3_release, reason: not valid java name */
    public final long m19631labelColorWaAFU9c$material3_release(boolean enabled, boolean selected) {
        return !enabled ? this.disabledLabelColor : !selected ? this.labelColor : this.selectedLabelColor;
    }

    @Stable
    /* renamed from: leadingIconContentColor-WaAFU9c$material3_release, reason: not valid java name */
    public final long m19632leadingIconContentColorWaAFU9c$material3_release(boolean enabled, boolean selected) {
        return !enabled ? this.disabledLeadingIconColor : !selected ? this.leadingIconColor : this.selectedLeadingIconColor;
    }

    @Stable
    /* renamed from: trailingIconContentColor-WaAFU9c$material3_release, reason: not valid java name */
    public final long m19633trailingIconContentColorWaAFU9c$material3_release(boolean enabled, boolean selected) {
        return !enabled ? this.disabledTrailingIconColor : !selected ? this.trailingIconColor : this.selectedTrailingIconColor;
    }

    private SelectableChipColors(long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21) {
        this.containerColor = j9;
        this.labelColor = j10;
        this.leadingIconColor = j11;
        this.trailingIconColor = j12;
        this.disabledContainerColor = j13;
        this.disabledLabelColor = j14;
        this.disabledLeadingIconColor = j15;
        this.disabledTrailingIconColor = j16;
        this.selectedContainerColor = j17;
        this.disabledSelectedContainerColor = j18;
        this.selectedLabelColor = j19;
        this.selectedLeadingIconColor = j20;
        this.selectedTrailingIconColor = j21;
    }
}
