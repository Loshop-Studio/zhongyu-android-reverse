package androidx.compose.material3;

import androidx.compose.animation.core.EasingKt;
import androidx.compose.p014ui.graphics.Color;
import androidx.compose.p014ui.graphics.ColorKt;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC9972n;

@Stable
@ExperimentalMaterial3Api
/* loaded from: classes2.dex */
public final class TopAppBarColors {
    public static final int $stable = 0;
    private final long actionIconContentColor;
    private final long containerColor;
    private final long navigationIconContentColor;
    private final long scrolledContainerColor;
    private final long titleContentColor;

    public /* synthetic */ TopAppBarColors(long j10, long j11, long j12, long j13, long j14, AbstractC9972n abstractC9972n) {
        this(j10, j11, j12, j13, j14);
    }

    /* renamed from: copy-t635Npw$default, reason: not valid java name */
    public static /* synthetic */ TopAppBarColors m29459copyt635Npw$default(TopAppBarColors topAppBarColors, long j10, long j11, long j12, long j13, long j14, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = topAppBarColors.containerColor;
        }
        long j15 = j10;
        if ((i10 & 2) != 0) {
            j11 = topAppBarColors.scrolledContainerColor;
        }
        return topAppBarColors.m29461copyt635Npw(j15, j11, (i10 & 4) != 0 ? topAppBarColors.navigationIconContentColor : j12, (i10 & 8) != 0 ? topAppBarColors.titleContentColor : j13, (i10 & 16) != 0 ? topAppBarColors.actionIconContentColor : j14);
    }

    @Stable
    /* renamed from: containerColor-vNxB06k$material3_release, reason: not valid java name */
    public final long m29460containerColorvNxB06k$material3_release(float f10) {
        return ColorKt.m30929lerpjxsXWHM(this.containerColor, this.scrolledContainerColor, EasingKt.getFastOutLinearInEasing().transform(f10));
    }

    /* renamed from: copy-t635Npw, reason: not valid java name */
    public final TopAppBarColors m29461copyt635Npw(long j10, long j11, long j12, long j13, long j14) {
        return new TopAppBarColors(j10 != 16 ? j10 : this.containerColor, j11 != 16 ? j11 : this.scrolledContainerColor, j12 != 16 ? j12 : this.navigationIconContentColor, j13 != 16 ? j13 : this.titleContentColor, j14 != 16 ? j14 : this.actionIconContentColor, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof TopAppBarColors)) {
            return false;
        }
        TopAppBarColors topAppBarColors = (TopAppBarColors) obj;
        return Color.m30879equalsimpl0(this.containerColor, topAppBarColors.containerColor) && Color.m30879equalsimpl0(this.scrolledContainerColor, topAppBarColors.scrolledContainerColor) && Color.m30879equalsimpl0(this.navigationIconContentColor, topAppBarColors.navigationIconContentColor) && Color.m30879equalsimpl0(this.titleContentColor, topAppBarColors.titleContentColor) && Color.m30879equalsimpl0(this.actionIconContentColor, topAppBarColors.actionIconContentColor);
    }

    /* renamed from: getActionIconContentColor-0d7_KjU, reason: not valid java name */
    public final long m29462getActionIconContentColor0d7_KjU() {
        return this.actionIconContentColor;
    }

    /* renamed from: getContainerColor-0d7_KjU, reason: not valid java name */
    public final long m29463getContainerColor0d7_KjU() {
        return this.containerColor;
    }

    /* renamed from: getNavigationIconContentColor-0d7_KjU, reason: not valid java name */
    public final long m29464getNavigationIconContentColor0d7_KjU() {
        return this.navigationIconContentColor;
    }

    /* renamed from: getScrolledContainerColor-0d7_KjU, reason: not valid java name */
    public final long m29465getScrolledContainerColor0d7_KjU() {
        return this.scrolledContainerColor;
    }

    /* renamed from: getTitleContentColor-0d7_KjU, reason: not valid java name */
    public final long m29466getTitleContentColor0d7_KjU() {
        return this.titleContentColor;
    }

    public int hashCode() {
        return (((((((Color.m30885hashCodeimpl(this.containerColor) * 31) + Color.m30885hashCodeimpl(this.scrolledContainerColor)) * 31) + Color.m30885hashCodeimpl(this.navigationIconContentColor)) * 31) + Color.m30885hashCodeimpl(this.titleContentColor)) * 31) + Color.m30885hashCodeimpl(this.actionIconContentColor);
    }

    private TopAppBarColors(long j10, long j11, long j12, long j13, long j14) {
        this.containerColor = j10;
        this.scrolledContainerColor = j11;
        this.navigationIconContentColor = j12;
        this.titleContentColor = j13;
        this.actionIconContentColor = j14;
    }
}
