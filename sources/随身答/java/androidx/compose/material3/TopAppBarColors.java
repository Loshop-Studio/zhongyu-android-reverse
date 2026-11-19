package androidx.compose.material3;

import androidx.compose.animation.core.EasingKt;
import androidx.compose.p012ui.graphics.Color;
import androidx.compose.p012ui.graphics.ColorKt;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@ExperimentalMaterial3Api
@Metadata(m13412d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\u001d\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013JB\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016R\u0019\u0010\u0007\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\f\u0010\nR\u0019\u0010\u0005\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\r\u0010\nR\u0019\u0010\u0004\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u000e\u0010\nR\u0019\u0010\u0006\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u000f\u0010\n\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001c"}, m13413d2 = {"Landroidx/compose/material3/TopAppBarColors;", "", "containerColor", "Landroidx/compose/ui/graphics/Color;", "scrolledContainerColor", "navigationIconContentColor", "titleContentColor", "actionIconContentColor", "(JJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getActionIconContentColor-0d7_KjU", "()J", "J", "getContainerColor-0d7_KjU", "getNavigationIconContentColor-0d7_KjU", "getScrolledContainerColor-0d7_KjU", "getTitleContentColor-0d7_KjU", "colorTransitionFraction", "", "containerColor-vNxB06k$material3_release", "(F)J", "copy", "copy-t635Npw", "(JJJJJ)Landroidx/compose/material3/TopAppBarColors;", "equals", "", "other", "hashCode", "", "material3_release"}, m13414k = 1, m13415mv = {1, 8, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@Stable
@SourceDebugExtension({"SMAP\nAppBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppBar.kt\nandroidx/compose/material3/TopAppBarColors\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,2543:1\n708#2:2544\n696#2:2545\n708#2:2546\n696#2:2547\n708#2:2548\n696#2:2549\n708#2:2550\n696#2:2551\n708#2:2552\n696#2:2553\n*S KotlinDebug\n*F\n+ 1 AppBar.kt\nandroidx/compose/material3/TopAppBarColors\n*L\n1436#1:2544\n1436#1:2545\n1437#1:2546\n1437#1:2547\n1438#1:2548\n1438#1:2549\n1439#1:2550\n1439#1:2551\n1440#1:2552\n1440#1:2553\n*E\n"})
/* loaded from: classes2.dex */
public final class TopAppBarColors {
    public static final int $stable = 0;
    private final long actionIconContentColor;
    private final long containerColor;
    private final long navigationIconContentColor;
    private final long scrolledContainerColor;
    private final long titleContentColor;

    public /* synthetic */ TopAppBarColors(long j9, long j10, long j11, long j12, long j13, DefaultConstructorMarker defaultConstructorMarker) {
        this(j9, j10, j11, j12, j13);
    }

    /* renamed from: copy-t635Npw$default, reason: not valid java name */
    public static /* synthetic */ TopAppBarColors m20018copyt635Npw$default(TopAppBarColors topAppBarColors, long j9, long j10, long j11, long j12, long j13, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            j9 = topAppBarColors.containerColor;
        }
        long j14 = j9;
        if ((i9 & 2) != 0) {
            j10 = topAppBarColors.scrolledContainerColor;
        }
        return topAppBarColors.m20020copyt635Npw(j14, j10, (i9 & 4) != 0 ? topAppBarColors.navigationIconContentColor : j11, (i9 & 8) != 0 ? topAppBarColors.titleContentColor : j12, (i9 & 16) != 0 ? topAppBarColors.actionIconContentColor : j13);
    }

    @Stable
    /* renamed from: containerColor-vNxB06k$material3_release, reason: not valid java name */
    public final long m20019containerColorvNxB06k$material3_release(float colorTransitionFraction) {
        return ColorKt.m21460lerpjxsXWHM(this.containerColor, this.scrolledContainerColor, EasingKt.getFastOutLinearInEasing().transform(colorTransitionFraction));
    }

    /* renamed from: copy-t635Npw, reason: not valid java name */
    public final TopAppBarColors m20020copyt635Npw(long containerColor, long scrolledContainerColor, long navigationIconContentColor, long titleContentColor, long actionIconContentColor) {
        return new TopAppBarColors(containerColor != 16 ? containerColor : this.containerColor, scrolledContainerColor != 16 ? scrolledContainerColor : this.scrolledContainerColor, navigationIconContentColor != 16 ? navigationIconContentColor : this.navigationIconContentColor, titleContentColor != 16 ? titleContentColor : this.titleContentColor, actionIconContentColor != 16 ? actionIconContentColor : this.actionIconContentColor, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof TopAppBarColors)) {
            return false;
        }
        TopAppBarColors topAppBarColors = (TopAppBarColors) other;
        return Color.m21410equalsimpl0(this.containerColor, topAppBarColors.containerColor) && Color.m21410equalsimpl0(this.scrolledContainerColor, topAppBarColors.scrolledContainerColor) && Color.m21410equalsimpl0(this.navigationIconContentColor, topAppBarColors.navigationIconContentColor) && Color.m21410equalsimpl0(this.titleContentColor, topAppBarColors.titleContentColor) && Color.m21410equalsimpl0(this.actionIconContentColor, topAppBarColors.actionIconContentColor);
    }

    /* renamed from: getActionIconContentColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getActionIconContentColor() {
        return this.actionIconContentColor;
    }

    /* renamed from: getContainerColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getContainerColor() {
        return this.containerColor;
    }

    /* renamed from: getNavigationIconContentColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getNavigationIconContentColor() {
        return this.navigationIconContentColor;
    }

    /* renamed from: getScrolledContainerColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getScrolledContainerColor() {
        return this.scrolledContainerColor;
    }

    /* renamed from: getTitleContentColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getTitleContentColor() {
        return this.titleContentColor;
    }

    public int hashCode() {
        return (((((((Color.m21416hashCodeimpl(this.containerColor) * 31) + Color.m21416hashCodeimpl(this.scrolledContainerColor)) * 31) + Color.m21416hashCodeimpl(this.navigationIconContentColor)) * 31) + Color.m21416hashCodeimpl(this.titleContentColor)) * 31) + Color.m21416hashCodeimpl(this.actionIconContentColor);
    }

    private TopAppBarColors(long j9, long j10, long j11, long j12, long j13) {
        this.containerColor = j9;
        this.scrolledContainerColor = j10;
        this.navigationIconContentColor = j11;
        this.titleContentColor = j12;
        this.actionIconContentColor = j13;
    }
}
