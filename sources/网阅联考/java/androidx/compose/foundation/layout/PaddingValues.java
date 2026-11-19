package androidx.compose.foundation.layout;

import androidx.compose.p006ui.unit.C1700Dp;
import androidx.compose.p006ui.unit.LayoutDirection;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Immutable
@Metadata(m5174d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0001\u0018\u00002\u00020\u0001B0\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0002\u0010\u0007J\u0018\u0010\u0013\u001a\u00020\u0003H\u0016ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u000bJ \u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0017H\u0016ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J \u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0017H\u0016ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u0019J\u0018\u0010\u001c\u001a\u00020\u0003H\u0016ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u000bJ\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0096\u0002J\b\u0010\"\u001a\u00020#H\u0016J\b\u0010$\u001a\u00020%H\u0016R'\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\f\u0012\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR'\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\f\u0012\u0004\b\r\u0010\t\u001a\u0004\b\u000e\u0010\u000bR'\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\f\u0012\u0004\b\u000f\u0010\t\u001a\u0004\b\u0010\u0010\u000bR'\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\f\u0012\u0004\b\u0011\u0010\t\u001a\u0004\b\u0012\u0010\u000b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006&"}, m5175d2 = {"Landroidx/compose/foundation/layout/PaddingValuesImpl;", "Landroidx/compose/foundation/layout/PaddingValues;", "start", "Landroidx/compose/ui/unit/Dp;", "top", "end", "bottom", "(FFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getBottom-D9Ej5fM$annotations", "()V", "getBottom-D9Ej5fM", "()F", "F", "getEnd-D9Ej5fM$annotations", "getEnd-D9Ej5fM", "getStart-D9Ej5fM$annotations", "getStart-D9Ej5fM", "getTop-D9Ej5fM$annotations", "getTop-D9Ej5fM", "calculateBottomPadding", "calculateBottomPadding-D9Ej5fM", "calculateLeftPadding", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "calculateLeftPadding-u2uoSUM", "(Landroidx/compose/ui/unit/LayoutDirection;)F", "calculateRightPadding", "calculateRightPadding-u2uoSUM", "calculateTopPadding", "calculateTopPadding-D9Ej5fM", "equals", "", "other", "", "hashCode", "", "toString", "", "foundation-layout_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nPadding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingValuesImpl\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,436:1\n155#2:437\n155#2:438\n155#2:439\n155#2:440\n*S KotlinDebug\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingValuesImpl\n*L\n305#1:437\n307#1:438\n309#1:439\n311#1:440\n*E\n"})
/* renamed from: androidx.compose.foundation.layout.PaddingValuesImpl, reason: from toString */
/* loaded from: classes.dex */
public final class PaddingValues implements androidx.compose.foundation.layout.PaddingValues {
    private final float bottom;
    private final float end;
    private final float start;
    private final float top;

    public /* synthetic */ PaddingValues(float f4, float f5, float f6, float f7, DefaultConstructorMarker defaultConstructorMarker) {
        this(f4, f5, f6, f7);
    }

    @Stable
    /* renamed from: getBottom-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m7329getBottomD9Ej5fM$annotations() {
    }

    @Stable
    /* renamed from: getEnd-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m7330getEndD9Ej5fM$annotations() {
    }

    @Stable
    /* renamed from: getStart-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m7331getStartD9Ej5fM$annotations() {
    }

    @Stable
    /* renamed from: getTop-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m7332getTopD9Ej5fM$annotations() {
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateBottomPadding-D9Ej5fM, reason: from getter */
    public float getBottom() {
        return this.bottom;
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateLeftPadding-u2uoSUM */
    public float mo7297calculateLeftPaddingu2uoSUM(LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        return layoutDirection == LayoutDirection.Ltr ? this.start : this.end;
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateRightPadding-u2uoSUM */
    public float mo7298calculateRightPaddingu2uoSUM(LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        return layoutDirection == LayoutDirection.Ltr ? this.end : this.start;
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateTopPadding-D9Ej5fM, reason: from getter */
    public float getTop() {
        return this.top;
    }

    public boolean equals(Object other) {
        if (!(other instanceof PaddingValues)) {
            return false;
        }
        PaddingValues paddingValues = (PaddingValues) other;
        return C1700Dp.m11530equalsimpl0(this.start, paddingValues.start) && C1700Dp.m11530equalsimpl0(this.top, paddingValues.top) && C1700Dp.m11530equalsimpl0(this.end, paddingValues.end) && C1700Dp.m11530equalsimpl0(this.bottom, paddingValues.bottom);
    }

    /* renamed from: getBottom-D9Ej5fM, reason: not valid java name */
    public final float m7333getBottomD9Ej5fM() {
        return this.bottom;
    }

    /* renamed from: getEnd-D9Ej5fM, reason: not valid java name and from getter */
    public final float getEnd() {
        return this.end;
    }

    /* renamed from: getStart-D9Ej5fM, reason: not valid java name and from getter */
    public final float getStart() {
        return this.start;
    }

    /* renamed from: getTop-D9Ej5fM, reason: not valid java name */
    public final float m7336getTopD9Ej5fM() {
        return this.top;
    }

    public int hashCode() {
        return (((((C1700Dp.m11531hashCodeimpl(this.start) * 31) + C1700Dp.m11531hashCodeimpl(this.top)) * 31) + C1700Dp.m11531hashCodeimpl(this.end)) * 31) + C1700Dp.m11531hashCodeimpl(this.bottom);
    }

    public String toString() {
        return "PaddingValues(start=" + ((Object) C1700Dp.m11536toStringimpl(this.start)) + ", top=" + ((Object) C1700Dp.m11536toStringimpl(this.top)) + ", end=" + ((Object) C1700Dp.m11536toStringimpl(this.end)) + ", bottom=" + ((Object) C1700Dp.m11536toStringimpl(this.bottom)) + ')';
    }

    private PaddingValues(float f4, float f5, float f6, float f7) {
        this.start = f4;
        this.top = f5;
        this.end = f6;
        this.bottom = f7;
    }

    public /* synthetic */ PaddingValues(float f4, float f5, float f6, float f7, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? C1700Dp.m11525constructorimpl(0) : f4, (i4 & 2) != 0 ? C1700Dp.m11525constructorimpl(0) : f5, (i4 & 4) != 0 ? C1700Dp.m11525constructorimpl(0) : f6, (i4 & 8) != 0 ? C1700Dp.m11525constructorimpl(0) : f7, null);
    }
}
