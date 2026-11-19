package androidx.compose.p006ui.geometry;

import androidx.compose.p006ui.util.MathHelpersKt;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m5174d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\u001a%\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a%\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u0006\u001a%\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a \u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\rH\u0007\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0014"}, m5175d2 = {"Rect", "Landroidx/compose/ui/geometry/Rect;", "topLeft", "Landroidx/compose/ui/geometry/Offset;", "bottomRight", "Rect-0a9Yr6o", "(JJ)Landroidx/compose/ui/geometry/Rect;", "offset", "size", "Landroidx/compose/ui/geometry/Size;", "Rect-tz77jQw", "center", "radius", "", "Rect-3MmeM6k", "(JF)Landroidx/compose/ui/geometry/Rect;", "lerp", "start", "stop", "fraction", "ui-geometry_release"}, m5176k = 2, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class RectKt {
    @Stable
    /* renamed from: Rect-0a9Yr6o, reason: not valid java name */
    public static final Rect m8983Rect0a9Yr6o(long j4, long j5) {
        return new Rect(Offset.m8945getXimpl(j4), Offset.m8946getYimpl(j4), Offset.m8945getXimpl(j5), Offset.m8946getYimpl(j5));
    }

    @Stable
    /* renamed from: Rect-3MmeM6k, reason: not valid java name */
    public static final Rect m8984Rect3MmeM6k(long j4, float f4) {
        return new Rect(Offset.m8945getXimpl(j4) - f4, Offset.m8946getYimpl(j4) - f4, Offset.m8945getXimpl(j4) + f4, Offset.m8946getYimpl(j4) + f4);
    }

    @Stable
    /* renamed from: Rect-tz77jQw, reason: not valid java name */
    public static final Rect m8985Recttz77jQw(long j4, long j5) {
        return new Rect(Offset.m8945getXimpl(j4), Offset.m8946getYimpl(j4), Offset.m8945getXimpl(j4) + Size.m9014getWidthimpl(j5), Offset.m8946getYimpl(j4) + Size.m9011getHeightimpl(j5));
    }

    @Stable
    public static final Rect lerp(Rect start, Rect stop, float f4) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(stop, "stop");
        return new Rect(MathHelpersKt.lerp(start.getLeft(), stop.getLeft(), f4), MathHelpersKt.lerp(start.getTop(), stop.getTop(), f4), MathHelpersKt.lerp(start.getRight(), stop.getRight(), f4), MathHelpersKt.lerp(start.getBottom(), stop.getBottom(), f4));
    }
}
