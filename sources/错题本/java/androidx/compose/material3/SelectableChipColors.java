package androidx.compose.material3;

import androidx.collection.AbstractC0584a;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Immutable
@Metadata(m5109d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001Bo\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0092\u0001\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0019J%\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u0019J%\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u0019J\u001a\u0010 \u001a\u00020\u00152\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0003\u0010%R\u001a\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0004\u0010%R\u001a\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0005\u0010%R\u001a\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0006\u0010%R\u001a\u0010\u0007\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0007\u0010%R\u001a\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\b\u0010%R\u001a\u0010\t\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\t\u0010%R\u001a\u0010\n\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\n\u0010%R\u001a\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u000b\u0010%R\u001a\u0010\f\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\f\u0010%R\u001a\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\r\u0010%R\u001a\u0010\u000e\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u000e\u0010%R\u001a\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u000f\u0010%\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006&"}, m5110d2 = {"Landroidx/compose/material3/SelectableChipColors;", "", "Landroidx/compose/ui/graphics/Color;", "containerColor", "labelColor", "leadingIconColor", "trailingIconColor", "disabledContainerColor", "disabledLabelColor", "disabledLeadingIconColor", "disabledTrailingIconColor", "selectedContainerColor", "disabledSelectedContainerColor", "selectedLabelColor", "selectedLeadingIconColor", "selectedTrailingIconColor", "<init>", "(JJJJJJJJJJJJJLkotlin/jvm/internal/e;)V", "copy-daRQuJA", "(JJJJJJJJJJJJJ)Landroidx/compose/material3/SelectableChipColors;", "copy", "", "enabled", "selected", "containerColor-WaAFU9c$material3_release", "(ZZ)J", "labelColor-WaAFU9c$material3_release", "leadingIconContentColor-WaAFU9c$material3_release", "leadingIconContentColor", "trailingIconContentColor-WaAFU9c$material3_release", "trailingIconContentColor", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "J", "material3_release"}, m5111k = 1, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nChip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Chip.kt\nandroidx/compose/material3/SelectableChipColors\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,2787:1\n708#2:2788\n696#2:2789\n708#2:2790\n696#2:2791\n708#2:2792\n696#2:2793\n708#2:2794\n696#2:2795\n708#2:2796\n696#2:2797\n708#2:2798\n696#2:2799\n708#2:2800\n696#2:2801\n708#2:2802\n696#2:2803\n708#2:2804\n696#2:2805\n708#2:2806\n696#2:2807\n708#2:2808\n696#2:2809\n708#2:2810\n696#2:2811\n708#2:2812\n696#2:2813\n*S KotlinDebug\n*F\n+ 1 Chip.kt\nandroidx/compose/material3/SelectableChipColors\n*L\n2601#1:2788\n2601#1:2789\n2602#1:2790\n2602#1:2791\n2603#1:2792\n2603#1:2793\n2604#1:2794\n2604#1:2795\n2605#1:2796\n2605#1:2797\n2606#1:2798\n2606#1:2799\n2607#1:2800\n2607#1:2801\n2608#1:2802\n2608#1:2803\n2609#1:2804\n2609#1:2805\n2610#1:2806\n2610#1:2807\n2611#1:2808\n2611#1:2809\n2612#1:2810\n2612#1:2811\n2613#1:2812\n2613#1:2813\n*E\n"})
/* loaded from: classes.dex */
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

    public /* synthetic */ SelectableChipColors(long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, AbstractC5824e abstractC5824e) {
        this(j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19);
    }

    /* renamed from: copy-daRQuJA$default, reason: not valid java name */
    public static /* synthetic */ SelectableChipColors m8865copydaRQuJA$default(SelectableChipColors selectableChipColors, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, int i, Object obj) {
        long j20;
        long j21;
        long j22 = (i & 1) != 0 ? selectableChipColors.containerColor : j7;
        long j23 = (i & 2) != 0 ? selectableChipColors.labelColor : j8;
        long j24 = (i & 4) != 0 ? selectableChipColors.leadingIconColor : j9;
        long j25 = (i & 8) != 0 ? selectableChipColors.trailingIconColor : j10;
        long j26 = (i & 16) != 0 ? selectableChipColors.disabledContainerColor : j11;
        long j27 = (i & 32) != 0 ? selectableChipColors.disabledLabelColor : j12;
        long j28 = (i & 64) != 0 ? selectableChipColors.disabledLeadingIconColor : j13;
        long j29 = j22;
        long j30 = (i & 128) != 0 ? selectableChipColors.disabledTrailingIconColor : j14;
        long j31 = (i & 256) != 0 ? selectableChipColors.selectedContainerColor : j15;
        long j32 = (i & 512) != 0 ? selectableChipColors.disabledSelectedContainerColor : j16;
        long j33 = (i & 1024) != 0 ? selectableChipColors.selectedLabelColor : j17;
        long j34 = (i & 2048) != 0 ? selectableChipColors.selectedLeadingIconColor : j18;
        if ((i & 4096) != 0) {
            j21 = j34;
            j20 = selectableChipColors.selectedTrailingIconColor;
        } else {
            j20 = j19;
            j21 = j34;
        }
        return selectableChipColors.m8867copydaRQuJA(j29, j23, j24, j25, j26, j27, j28, j30, j31, j32, j33, j21, j20);
    }

    @Stable
    /* renamed from: containerColor-WaAFU9c$material3_release, reason: not valid java name */
    public final long m8866containerColorWaAFU9c$material3_release(boolean enabled, boolean selected) {
        return !enabled ? selected ? this.disabledSelectedContainerColor : this.disabledContainerColor : !selected ? this.containerColor : this.selectedContainerColor;
    }

    @NotNull
    /* renamed from: copy-daRQuJA, reason: not valid java name */
    public final SelectableChipColors m8867copydaRQuJA(long containerColor, long labelColor, long leadingIconColor, long trailingIconColor, long disabledContainerColor, long disabledLabelColor, long disabledLeadingIconColor, long disabledTrailingIconColor, long selectedContainerColor, long disabledSelectedContainerColor, long selectedLabelColor, long selectedLeadingIconColor, long selectedTrailingIconColor) {
        return new SelectableChipColors(containerColor != 16 ? containerColor : this.containerColor, labelColor != 16 ? labelColor : this.labelColor, leadingIconColor != 16 ? leadingIconColor : this.leadingIconColor, trailingIconColor != 16 ? trailingIconColor : this.trailingIconColor, disabledContainerColor != 16 ? disabledContainerColor : this.disabledContainerColor, disabledLabelColor != 16 ? disabledLabelColor : this.disabledLabelColor, disabledLeadingIconColor != 16 ? disabledLeadingIconColor : this.disabledLeadingIconColor, disabledTrailingIconColor != 16 ? disabledTrailingIconColor : this.disabledTrailingIconColor, selectedContainerColor != 16 ? selectedContainerColor : this.selectedContainerColor, disabledSelectedContainerColor != 16 ? disabledSelectedContainerColor : this.disabledSelectedContainerColor, selectedLabelColor != 16 ? selectedLabelColor : this.selectedLabelColor, selectedLeadingIconColor != 16 ? selectedLeadingIconColor : this.selectedLeadingIconColor, selectedTrailingIconColor != 16 ? selectedTrailingIconColor : this.selectedTrailingIconColor, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof SelectableChipColors)) {
            return false;
        }
        SelectableChipColors selectableChipColors = (SelectableChipColors) other;
        return Color.m10683equalsimpl0(this.containerColor, selectableChipColors.containerColor) && Color.m10683equalsimpl0(this.labelColor, selectableChipColors.labelColor) && Color.m10683equalsimpl0(this.leadingIconColor, selectableChipColors.leadingIconColor) && Color.m10683equalsimpl0(this.trailingIconColor, selectableChipColors.trailingIconColor) && Color.m10683equalsimpl0(this.disabledContainerColor, selectableChipColors.disabledContainerColor) && Color.m10683equalsimpl0(this.disabledLabelColor, selectableChipColors.disabledLabelColor) && Color.m10683equalsimpl0(this.disabledLeadingIconColor, selectableChipColors.disabledLeadingIconColor) && Color.m10683equalsimpl0(this.disabledTrailingIconColor, selectableChipColors.disabledTrailingIconColor) && Color.m10683equalsimpl0(this.selectedContainerColor, selectableChipColors.selectedContainerColor) && Color.m10683equalsimpl0(this.disabledSelectedContainerColor, selectableChipColors.disabledSelectedContainerColor) && Color.m10683equalsimpl0(this.selectedLabelColor, selectableChipColors.selectedLabelColor) && Color.m10683equalsimpl0(this.selectedLeadingIconColor, selectableChipColors.selectedLeadingIconColor) && Color.m10683equalsimpl0(this.selectedTrailingIconColor, selectableChipColors.selectedTrailingIconColor);
    }

    public int hashCode() {
        return Color.m10689hashCodeimpl(this.selectedTrailingIconColor) + AbstractC0584a.m904e(this.selectedLeadingIconColor, AbstractC0584a.m904e(this.selectedLabelColor, AbstractC0584a.m904e(this.disabledSelectedContainerColor, AbstractC0584a.m904e(this.selectedContainerColor, AbstractC0584a.m904e(this.disabledTrailingIconColor, AbstractC0584a.m904e(this.disabledLeadingIconColor, AbstractC0584a.m904e(this.disabledLabelColor, AbstractC0584a.m904e(this.disabledContainerColor, AbstractC0584a.m904e(this.trailingIconColor, AbstractC0584a.m904e(this.leadingIconColor, AbstractC0584a.m904e(this.labelColor, Color.m10689hashCodeimpl(this.containerColor) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    @Stable
    /* renamed from: labelColor-WaAFU9c$material3_release, reason: not valid java name */
    public final long m8868labelColorWaAFU9c$material3_release(boolean enabled, boolean selected) {
        return !enabled ? this.disabledLabelColor : !selected ? this.labelColor : this.selectedLabelColor;
    }

    @Stable
    /* renamed from: leadingIconContentColor-WaAFU9c$material3_release, reason: not valid java name */
    public final long m8869leadingIconContentColorWaAFU9c$material3_release(boolean enabled, boolean selected) {
        return !enabled ? this.disabledLeadingIconColor : !selected ? this.leadingIconColor : this.selectedLeadingIconColor;
    }

    @Stable
    /* renamed from: trailingIconContentColor-WaAFU9c$material3_release, reason: not valid java name */
    public final long m8870trailingIconContentColorWaAFU9c$material3_release(boolean enabled, boolean selected) {
        return !enabled ? this.disabledTrailingIconColor : !selected ? this.trailingIconColor : this.selectedTrailingIconColor;
    }

    private SelectableChipColors(long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19) {
        this.containerColor = j7;
        this.labelColor = j8;
        this.leadingIconColor = j9;
        this.trailingIconColor = j10;
        this.disabledContainerColor = j11;
        this.disabledLabelColor = j12;
        this.disabledLeadingIconColor = j13;
        this.disabledTrailingIconColor = j14;
        this.selectedContainerColor = j15;
        this.disabledSelectedContainerColor = j16;
        this.selectedLabelColor = j17;
        this.selectedLeadingIconColor = j18;
        this.selectedTrailingIconColor = j19;
    }
}
