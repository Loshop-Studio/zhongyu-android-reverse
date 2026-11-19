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
@Metadata(m5109d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ`\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0013J\u001d\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0013J\u001d\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0013J\u001a\u0010\u0018\u001a\u00020\u00102\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010\u0004\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b \u0010\u001fR\u001d\u0010\u0005\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b!\u0010\u001fR\u001d\u0010\u0006\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\"\u0010\u001fR\u001d\u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b#\u0010\u001fR\u001d\u0010\b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b$\u0010\u001fR\u001d\u0010\t\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b%\u0010\u001fR\u001d\u0010\n\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\n\u0010\u001d\u001a\u0004\b&\u0010\u001f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006'"}, m5110d2 = {"Landroidx/compose/material3/ChipColors;", "", "Landroidx/compose/ui/graphics/Color;", "containerColor", "labelColor", "leadingIconContentColor", "trailingIconContentColor", "disabledContainerColor", "disabledLabelColor", "disabledLeadingIconContentColor", "disabledTrailingIconContentColor", "<init>", "(JJJJJJJJLkotlin/jvm/internal/e;)V", "copy-FD3wquc", "(JJJJJJJJ)Landroidx/compose/material3/ChipColors;", "copy", "", "enabled", "containerColor-vNxB06k$material3_release", "(Z)J", "labelColor-vNxB06k$material3_release", "leadingIconContentColor-vNxB06k$material3_release", "trailingIconContentColor-vNxB06k$material3_release", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "J", "getContainerColor-0d7_KjU", "()J", "getLabelColor-0d7_KjU", "getLeadingIconContentColor-0d7_KjU", "getTrailingIconContentColor-0d7_KjU", "getDisabledContainerColor-0d7_KjU", "getDisabledLabelColor-0d7_KjU", "getDisabledLeadingIconContentColor-0d7_KjU", "getDisabledTrailingIconContentColor-0d7_KjU", "material3_release"}, m5111k = 1, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nChip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Chip.kt\nandroidx/compose/material3/ChipColors\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,2787:1\n708#2:2788\n696#2:2789\n708#2:2790\n696#2:2791\n708#2:2792\n696#2:2793\n708#2:2794\n696#2:2795\n708#2:2796\n696#2:2797\n708#2:2798\n696#2:2799\n708#2:2800\n696#2:2801\n708#2:2802\n696#2:2803\n*S KotlinDebug\n*F\n+ 1 Chip.kt\nandroidx/compose/material3/ChipColors\n*L\n2461#1:2788\n2461#1:2789\n2462#1:2790\n2462#1:2791\n2463#1:2792\n2463#1:2793\n2464#1:2794\n2464#1:2795\n2465#1:2796\n2465#1:2797\n2466#1:2798\n2466#1:2799\n2467#1:2800\n2467#1:2801\n2468#1:2802\n2468#1:2803\n*E\n"})
/* loaded from: classes.dex */
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

    public /* synthetic */ ChipColors(long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, AbstractC5824e abstractC5824e) {
        this(j7, j8, j9, j10, j11, j12, j13, j14);
    }

    /* renamed from: copy-FD3wquc$default, reason: not valid java name */
    public static /* synthetic */ ChipColors m8239copyFD3wquc$default(ChipColors chipColors, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, int i, Object obj) {
        long j15;
        long j16;
        long j17 = (i & 1) != 0 ? chipColors.containerColor : j7;
        long j18 = (i & 2) != 0 ? chipColors.labelColor : j8;
        long j19 = (i & 4) != 0 ? chipColors.leadingIconContentColor : j9;
        long j20 = (i & 8) != 0 ? chipColors.trailingIconContentColor : j10;
        long j21 = (i & 16) != 0 ? chipColors.disabledContainerColor : j11;
        long j22 = (i & 32) != 0 ? chipColors.disabledLabelColor : j12;
        long j23 = (i & 64) != 0 ? chipColors.disabledLeadingIconContentColor : j13;
        if ((i & 128) != 0) {
            j15 = chipColors.disabledTrailingIconContentColor;
            j16 = j17;
        } else {
            j15 = j14;
            j16 = j17;
        }
        return chipColors.m8241copyFD3wquc(j16, j18, j19, j20, j21, j22, j23, j15);
    }

    @Stable
    /* renamed from: containerColor-vNxB06k$material3_release, reason: not valid java name */
    public final long m8240containerColorvNxB06k$material3_release(boolean enabled) {
        return enabled ? this.containerColor : this.disabledContainerColor;
    }

    @NotNull
    /* renamed from: copy-FD3wquc, reason: not valid java name */
    public final ChipColors m8241copyFD3wquc(long containerColor, long labelColor, long leadingIconContentColor, long trailingIconContentColor, long disabledContainerColor, long disabledLabelColor, long disabledLeadingIconContentColor, long disabledTrailingIconContentColor) {
        return new ChipColors(containerColor != 16 ? containerColor : this.containerColor, labelColor != 16 ? labelColor : this.labelColor, leadingIconContentColor != 16 ? leadingIconContentColor : this.leadingIconContentColor, trailingIconContentColor != 16 ? trailingIconContentColor : this.trailingIconContentColor, disabledContainerColor != 16 ? disabledContainerColor : this.disabledContainerColor, disabledLabelColor != 16 ? disabledLabelColor : this.disabledLabelColor, disabledLeadingIconContentColor != 16 ? disabledLeadingIconContentColor : this.disabledLeadingIconContentColor, disabledTrailingIconContentColor != 16 ? disabledTrailingIconContentColor : this.disabledTrailingIconContentColor, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof ChipColors)) {
            return false;
        }
        ChipColors chipColors = (ChipColors) other;
        return Color.m10683equalsimpl0(this.containerColor, chipColors.containerColor) && Color.m10683equalsimpl0(this.labelColor, chipColors.labelColor) && Color.m10683equalsimpl0(this.leadingIconContentColor, chipColors.leadingIconContentColor) && Color.m10683equalsimpl0(this.trailingIconContentColor, chipColors.trailingIconContentColor) && Color.m10683equalsimpl0(this.disabledContainerColor, chipColors.disabledContainerColor) && Color.m10683equalsimpl0(this.disabledLabelColor, chipColors.disabledLabelColor) && Color.m10683equalsimpl0(this.disabledLeadingIconContentColor, chipColors.disabledLeadingIconContentColor) && Color.m10683equalsimpl0(this.disabledTrailingIconContentColor, chipColors.disabledTrailingIconContentColor);
    }

    /* renamed from: getContainerColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getContainerColor() {
        return this.containerColor;
    }

    /* renamed from: getDisabledContainerColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledContainerColor() {
        return this.disabledContainerColor;
    }

    /* renamed from: getDisabledLabelColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledLabelColor() {
        return this.disabledLabelColor;
    }

    /* renamed from: getDisabledLeadingIconContentColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledLeadingIconContentColor() {
        return this.disabledLeadingIconContentColor;
    }

    /* renamed from: getDisabledTrailingIconContentColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledTrailingIconContentColor() {
        return this.disabledTrailingIconContentColor;
    }

    /* renamed from: getLabelColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getLabelColor() {
        return this.labelColor;
    }

    /* renamed from: getLeadingIconContentColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getLeadingIconContentColor() {
        return this.leadingIconContentColor;
    }

    /* renamed from: getTrailingIconContentColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getTrailingIconContentColor() {
        return this.trailingIconContentColor;
    }

    public int hashCode() {
        return Color.m10689hashCodeimpl(this.disabledTrailingIconContentColor) + AbstractC0584a.m904e(this.disabledLeadingIconContentColor, AbstractC0584a.m904e(this.disabledLabelColor, AbstractC0584a.m904e(this.disabledContainerColor, AbstractC0584a.m904e(this.trailingIconContentColor, AbstractC0584a.m904e(this.leadingIconContentColor, AbstractC0584a.m904e(this.labelColor, Color.m10689hashCodeimpl(this.containerColor) * 31, 31), 31), 31), 31), 31), 31);
    }

    @Stable
    /* renamed from: labelColor-vNxB06k$material3_release, reason: not valid java name */
    public final long m8250labelColorvNxB06k$material3_release(boolean enabled) {
        return enabled ? this.labelColor : this.disabledLabelColor;
    }

    @Stable
    /* renamed from: leadingIconContentColor-vNxB06k$material3_release, reason: not valid java name */
    public final long m8251leadingIconContentColorvNxB06k$material3_release(boolean enabled) {
        return enabled ? this.leadingIconContentColor : this.disabledLeadingIconContentColor;
    }

    @Stable
    /* renamed from: trailingIconContentColor-vNxB06k$material3_release, reason: not valid java name */
    public final long m8252trailingIconContentColorvNxB06k$material3_release(boolean enabled) {
        return enabled ? this.trailingIconContentColor : this.disabledTrailingIconContentColor;
    }

    private ChipColors(long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14) {
        this.containerColor = j7;
        this.labelColor = j8;
        this.leadingIconContentColor = j9;
        this.trailingIconContentColor = j10;
        this.disabledContainerColor = j11;
        this.disabledLabelColor = j12;
        this.disabledLeadingIconContentColor = j13;
        this.disabledTrailingIconContentColor = j14;
    }
}
