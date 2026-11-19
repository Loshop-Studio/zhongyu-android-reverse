package androidx.compose.material3;

import androidx.compose.p014ui.graphics.Color;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC9972n;

@Stable
@Immutable
@ExperimentalMaterial3Api
/* loaded from: classes2.dex */
public final class RichTooltipColors {
    public static final int $stable = 0;
    private final long actionContentColor;
    private final long containerColor;
    private final long contentColor;
    private final long titleContentColor;

    public /* synthetic */ RichTooltipColors(long j10, long j11, long j12, long j13, AbstractC9972n abstractC9972n) {
        this(j10, j11, j12, j13);
    }

    /* renamed from: copy-jRlVdoo$default, reason: not valid java name */
    public static /* synthetic */ RichTooltipColors m28998copyjRlVdoo$default(RichTooltipColors richTooltipColors, long j10, long j11, long j12, long j13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = richTooltipColors.containerColor;
        }
        long j14 = j10;
        if ((i10 & 2) != 0) {
            j11 = richTooltipColors.contentColor;
        }
        long j15 = j11;
        if ((i10 & 4) != 0) {
            j12 = richTooltipColors.titleContentColor;
        }
        return richTooltipColors.m28999copyjRlVdoo(j14, j15, j12, (i10 & 8) != 0 ? richTooltipColors.actionContentColor : j13);
    }

    /* renamed from: copy-jRlVdoo, reason: not valid java name */
    public final RichTooltipColors m28999copyjRlVdoo(long j10, long j11, long j12, long j13) {
        return new RichTooltipColors(j10 != 16 ? j10 : this.containerColor, j11 != 16 ? j11 : this.contentColor, j12 != 16 ? j12 : this.titleContentColor, j13 != 16 ? j13 : this.actionContentColor, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RichTooltipColors)) {
            return false;
        }
        RichTooltipColors richTooltipColors = (RichTooltipColors) obj;
        return Color.m30879equalsimpl0(this.containerColor, richTooltipColors.containerColor) && Color.m30879equalsimpl0(this.contentColor, richTooltipColors.contentColor) && Color.m30879equalsimpl0(this.titleContentColor, richTooltipColors.titleContentColor) && Color.m30879equalsimpl0(this.actionContentColor, richTooltipColors.actionContentColor);
    }

    /* renamed from: getActionContentColor-0d7_KjU, reason: not valid java name */
    public final long m29000getActionContentColor0d7_KjU() {
        return this.actionContentColor;
    }

    /* renamed from: getContainerColor-0d7_KjU, reason: not valid java name */
    public final long m29001getContainerColor0d7_KjU() {
        return this.containerColor;
    }

    /* renamed from: getContentColor-0d7_KjU, reason: not valid java name */
    public final long m29002getContentColor0d7_KjU() {
        return this.contentColor;
    }

    /* renamed from: getTitleContentColor-0d7_KjU, reason: not valid java name */
    public final long m29003getTitleContentColor0d7_KjU() {
        return this.titleContentColor;
    }

    public int hashCode() {
        return (((((Color.m30885hashCodeimpl(this.containerColor) * 31) + Color.m30885hashCodeimpl(this.contentColor)) * 31) + Color.m30885hashCodeimpl(this.titleContentColor)) * 31) + Color.m30885hashCodeimpl(this.actionContentColor);
    }

    private RichTooltipColors(long j10, long j11, long j12, long j13) {
        this.containerColor = j10;
        this.contentColor = j11;
        this.titleContentColor = j12;
        this.actionContentColor = j13;
    }
}
