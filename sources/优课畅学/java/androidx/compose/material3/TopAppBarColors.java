package androidx.compose.material3;

import androidx.compose.animation.core.EasingKt;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.p013ui.graphics.ColorKt;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC9126n;

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

    public /* synthetic */ TopAppBarColors(long j10, long j11, long j12, long j13, long j14, AbstractC9126n abstractC9126n) {
        this(j10, j11, j12, j13, j14);
    }

    /* renamed from: copy-t635Npw$default, reason: not valid java name */
    public static /* synthetic */ TopAppBarColors m22857copyt635Npw$default(TopAppBarColors topAppBarColors, long j10, long j11, long j12, long j13, long j14, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = topAppBarColors.containerColor;
        }
        long j15 = j10;
        if ((i10 & 2) != 0) {
            j11 = topAppBarColors.scrolledContainerColor;
        }
        return topAppBarColors.m22859copyt635Npw(j15, j11, (i10 & 4) != 0 ? topAppBarColors.navigationIconContentColor : j12, (i10 & 8) != 0 ? topAppBarColors.titleContentColor : j13, (i10 & 16) != 0 ? topAppBarColors.actionIconContentColor : j14);
    }

    @Stable
    /* renamed from: containerColor-vNxB06k$material3_release, reason: not valid java name */
    public final long m22858containerColorvNxB06k$material3_release(float f10) {
        return ColorKt.m24327lerpjxsXWHM(this.containerColor, this.scrolledContainerColor, EasingKt.getFastOutLinearInEasing().transform(f10));
    }

    /* renamed from: copy-t635Npw, reason: not valid java name */
    public final TopAppBarColors m22859copyt635Npw(long j10, long j11, long j12, long j13, long j14) {
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
        return Color.m24277equalsimpl0(this.containerColor, topAppBarColors.containerColor) && Color.m24277equalsimpl0(this.scrolledContainerColor, topAppBarColors.scrolledContainerColor) && Color.m24277equalsimpl0(this.navigationIconContentColor, topAppBarColors.navigationIconContentColor) && Color.m24277equalsimpl0(this.titleContentColor, topAppBarColors.titleContentColor) && Color.m24277equalsimpl0(this.actionIconContentColor, topAppBarColors.actionIconContentColor);
    }

    /* renamed from: getActionIconContentColor-0d7_KjU, reason: not valid java name */
    public final long m22860getActionIconContentColor0d7_KjU() {
        return this.actionIconContentColor;
    }

    /* renamed from: getContainerColor-0d7_KjU, reason: not valid java name */
    public final long m22861getContainerColor0d7_KjU() {
        return this.containerColor;
    }

    /* renamed from: getNavigationIconContentColor-0d7_KjU, reason: not valid java name */
    public final long m22862getNavigationIconContentColor0d7_KjU() {
        return this.navigationIconContentColor;
    }

    /* renamed from: getScrolledContainerColor-0d7_KjU, reason: not valid java name */
    public final long m22863getScrolledContainerColor0d7_KjU() {
        return this.scrolledContainerColor;
    }

    /* renamed from: getTitleContentColor-0d7_KjU, reason: not valid java name */
    public final long m22864getTitleContentColor0d7_KjU() {
        return this.titleContentColor;
    }

    public int hashCode() {
        return (((((((Color.m24283hashCodeimpl(this.containerColor) * 31) + Color.m24283hashCodeimpl(this.scrolledContainerColor)) * 31) + Color.m24283hashCodeimpl(this.navigationIconContentColor)) * 31) + Color.m24283hashCodeimpl(this.titleContentColor)) * 31) + Color.m24283hashCodeimpl(this.actionIconContentColor);
    }

    private TopAppBarColors(long j10, long j11, long j12, long j13, long j14) {
        this.containerColor = j10;
        this.scrolledContainerColor = j11;
        this.navigationIconContentColor = j12;
        this.titleContentColor = j13;
        this.actionIconContentColor = j14;
    }
}
