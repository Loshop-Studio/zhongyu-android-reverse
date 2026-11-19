package androidx.compose.material3;

import androidx.compose.p013ui.graphics.Color;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@Immutable
@Metadata(m13557d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0002\u0010\u000bJ\u001d\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0017H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J`\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u00172\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u001f\u001a\u00020 H\u0016J\u001d\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0017H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b!\u0010\u0019J\u001d\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0017H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\"\u0010\u0019J\u001d\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0017H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b#\u0010\u0019R\u0019\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0007\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u000f\u0010\rR\u0019\u0010\b\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0010\u0010\rR\u0019\u0010\t\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0011\u0010\rR\u0019\u0010\n\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0012\u0010\rR\u0019\u0010\u0004\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0013\u0010\rR\u0019\u0010\u0005\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0014\u0010\rR\u0019\u0010\u0006\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0015\u0010\r\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006$"}, m13558d2 = {"Landroidx/compose/material3/ChipColors;", "", "containerColor", "Landroidx/compose/ui/graphics/Color;", "labelColor", "leadingIconContentColor", "trailingIconContentColor", "disabledContainerColor", "disabledLabelColor", "disabledLeadingIconContentColor", "disabledTrailingIconContentColor", "(JJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getContainerColor-0d7_KjU", "()J", "J", "getDisabledContainerColor-0d7_KjU", "getDisabledLabelColor-0d7_KjU", "getDisabledLeadingIconContentColor-0d7_KjU", "getDisabledTrailingIconContentColor-0d7_KjU", "getLabelColor-0d7_KjU", "getLeadingIconContentColor-0d7_KjU", "getTrailingIconContentColor-0d7_KjU", "enabled", "", "containerColor-vNxB06k$material3_release", "(Z)J", "copy", "copy-FD3wquc", "(JJJJJJJJ)Landroidx/compose/material3/ChipColors;", "equals", "other", "hashCode", "", "labelColor-vNxB06k$material3_release", "leadingIconContentColor-vNxB06k$material3_release", "trailingIconContentColor-vNxB06k$material3_release", "material3_release"}, m13559k = 1, m13560mv = {1, 8, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nChip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Chip.kt\nandroidx/compose/material3/ChipColors\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,2787:1\n708#2:2788\n696#2:2789\n708#2:2790\n696#2:2791\n708#2:2792\n696#2:2793\n708#2:2794\n696#2:2795\n708#2:2796\n696#2:2797\n708#2:2798\n696#2:2799\n708#2:2800\n696#2:2801\n708#2:2802\n696#2:2803\n*S KotlinDebug\n*F\n+ 1 Chip.kt\nandroidx/compose/material3/ChipColors\n*L\n2461#1:2788\n2461#1:2789\n2462#1:2790\n2462#1:2791\n2463#1:2792\n2463#1:2793\n2464#1:2794\n2464#1:2795\n2465#1:2796\n2465#1:2797\n2466#1:2798\n2466#1:2799\n2467#1:2800\n2467#1:2801\n2468#1:2802\n2468#1:2803\n*E\n"})
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

    public /* synthetic */ ChipColors(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, j13, j14, j15, j16, j17);
    }

    /* renamed from: copy-FD3wquc$default, reason: not valid java name */
    public static /* synthetic */ ChipColors m18590copyFD3wquc$default(ChipColors chipColors, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, int i10, Object obj) {
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
        return chipColors.m18592copyFD3wquc(j19, j21, j22, j23, j24, j25, j26, j18);
    }

    @Stable
    /* renamed from: containerColor-vNxB06k$material3_release, reason: not valid java name */
    public final long m18591containerColorvNxB06k$material3_release(boolean enabled) {
        return enabled ? this.containerColor : this.disabledContainerColor;
    }

    /* renamed from: copy-FD3wquc, reason: not valid java name */
    public final ChipColors m18592copyFD3wquc(long containerColor, long labelColor, long leadingIconContentColor, long trailingIconContentColor, long disabledContainerColor, long disabledLabelColor, long disabledLeadingIconContentColor, long disabledTrailingIconContentColor) {
        return new ChipColors(containerColor != 16 ? containerColor : this.containerColor, labelColor != 16 ? labelColor : this.labelColor, leadingIconContentColor != 16 ? leadingIconContentColor : this.leadingIconContentColor, trailingIconContentColor != 16 ? trailingIconContentColor : this.trailingIconContentColor, disabledContainerColor != 16 ? disabledContainerColor : this.disabledContainerColor, disabledLabelColor != 16 ? disabledLabelColor : this.disabledLabelColor, disabledLeadingIconContentColor != 16 ? disabledLeadingIconContentColor : this.disabledLeadingIconContentColor, disabledTrailingIconContentColor != 16 ? disabledTrailingIconContentColor : this.disabledTrailingIconContentColor, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof ChipColors)) {
            return false;
        }
        ChipColors chipColors = (ChipColors) other;
        return Color.m20977equalsimpl0(this.containerColor, chipColors.containerColor) && Color.m20977equalsimpl0(this.labelColor, chipColors.labelColor) && Color.m20977equalsimpl0(this.leadingIconContentColor, chipColors.leadingIconContentColor) && Color.m20977equalsimpl0(this.trailingIconContentColor, chipColors.trailingIconContentColor) && Color.m20977equalsimpl0(this.disabledContainerColor, chipColors.disabledContainerColor) && Color.m20977equalsimpl0(this.disabledLabelColor, chipColors.disabledLabelColor) && Color.m20977equalsimpl0(this.disabledLeadingIconContentColor, chipColors.disabledLeadingIconContentColor) && Color.m20977equalsimpl0(this.disabledTrailingIconContentColor, chipColors.disabledTrailingIconContentColor);
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
        return (((((((((((((Color.m20983hashCodeimpl(this.containerColor) * 31) + Color.m20983hashCodeimpl(this.labelColor)) * 31) + Color.m20983hashCodeimpl(this.leadingIconContentColor)) * 31) + Color.m20983hashCodeimpl(this.trailingIconContentColor)) * 31) + Color.m20983hashCodeimpl(this.disabledContainerColor)) * 31) + Color.m20983hashCodeimpl(this.disabledLabelColor)) * 31) + Color.m20983hashCodeimpl(this.disabledLeadingIconContentColor)) * 31) + Color.m20983hashCodeimpl(this.disabledTrailingIconContentColor);
    }

    @Stable
    /* renamed from: labelColor-vNxB06k$material3_release, reason: not valid java name */
    public final long m18601labelColorvNxB06k$material3_release(boolean enabled) {
        return enabled ? this.labelColor : this.disabledLabelColor;
    }

    @Stable
    /* renamed from: leadingIconContentColor-vNxB06k$material3_release, reason: not valid java name */
    public final long m18602leadingIconContentColorvNxB06k$material3_release(boolean enabled) {
        return enabled ? this.leadingIconContentColor : this.disabledLeadingIconContentColor;
    }

    @Stable
    /* renamed from: trailingIconContentColor-vNxB06k$material3_release, reason: not valid java name */
    public final long m18603trailingIconContentColorvNxB06k$material3_release(boolean enabled) {
        return enabled ? this.trailingIconContentColor : this.disabledTrailingIconContentColor;
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
