package androidx.compose.foundation.layout;

import androidx.compose.p006ui.unit.Constraints;
import androidx.compose.p006ui.unit.ConstraintsKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.umeng.analytics.pro.C3335ai;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m5174d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u001a\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0002\u0010\u0006B%\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0002\u0010\fJ\t\u0010\u0012\u001a\u00020\bHÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\bHÖ\u0001J\u000e\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0005J\u000e\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0005J\u0006\u0010\u001d\u001a\u00020\u0000J\u001e\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J\t\u0010!\u001a\u00020\"HÖ\u0001R\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006#"}, m5175d2 = {"Landroidx/compose/foundation/layout/OrientationIndependentConstraints;", "", C3335ai.f1663aD, "Landroidx/compose/ui/unit/Constraints;", "orientation", "Landroidx/compose/foundation/layout/LayoutOrientation;", "(JLandroidx/compose/foundation/layout/LayoutOrientation;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "mainAxisMin", "", "mainAxisMax", "crossAxisMin", "crossAxisMax", "(IIII)V", "getCrossAxisMax", "()I", "getCrossAxisMin", "getMainAxisMax", "getMainAxisMin", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "maxHeight", "maxWidth", "stretchCrossAxis", "toBoxConstraints", "toBoxConstraints-OenEA2s", "(Landroidx/compose/foundation/layout/LayoutOrientation;)J", "toString", "", "foundation-layout_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final /* data */ class OrientationIndependentConstraints {
    private final int crossAxisMax;
    private final int crossAxisMin;
    private final int mainAxisMax;
    private final int mainAxisMin;

    public /* synthetic */ OrientationIndependentConstraints(long j4, LayoutOrientation layoutOrientation, DefaultConstructorMarker defaultConstructorMarker) {
        this(j4, layoutOrientation);
    }

    public static /* synthetic */ OrientationIndependentConstraints copy$default(OrientationIndependentConstraints orientationIndependentConstraints, int i4, int i5, int i6, int i7, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i4 = orientationIndependentConstraints.mainAxisMin;
        }
        if ((i8 & 2) != 0) {
            i5 = orientationIndependentConstraints.mainAxisMax;
        }
        if ((i8 & 4) != 0) {
            i6 = orientationIndependentConstraints.crossAxisMin;
        }
        if ((i8 & 8) != 0) {
            i7 = orientationIndependentConstraints.crossAxisMax;
        }
        return orientationIndependentConstraints.copy(i4, i5, i6, i7);
    }

    /* renamed from: component1, reason: from getter */
    public final int getMainAxisMin() {
        return this.mainAxisMin;
    }

    /* renamed from: component2, reason: from getter */
    public final int getMainAxisMax() {
        return this.mainAxisMax;
    }

    /* renamed from: component3, reason: from getter */
    public final int getCrossAxisMin() {
        return this.crossAxisMin;
    }

    /* renamed from: component4, reason: from getter */
    public final int getCrossAxisMax() {
        return this.crossAxisMax;
    }

    public final OrientationIndependentConstraints copy(int mainAxisMin, int mainAxisMax, int crossAxisMin, int crossAxisMax) {
        return new OrientationIndependentConstraints(mainAxisMin, mainAxisMax, crossAxisMin, crossAxisMax);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrientationIndependentConstraints)) {
            return false;
        }
        OrientationIndependentConstraints orientationIndependentConstraints = (OrientationIndependentConstraints) other;
        return this.mainAxisMin == orientationIndependentConstraints.mainAxisMin && this.mainAxisMax == orientationIndependentConstraints.mainAxisMax && this.crossAxisMin == orientationIndependentConstraints.crossAxisMin && this.crossAxisMax == orientationIndependentConstraints.crossAxisMax;
    }

    public final int getCrossAxisMax() {
        return this.crossAxisMax;
    }

    public final int getCrossAxisMin() {
        return this.crossAxisMin;
    }

    public final int getMainAxisMax() {
        return this.mainAxisMax;
    }

    public final int getMainAxisMin() {
        return this.mainAxisMin;
    }

    public int hashCode() {
        return (((((this.mainAxisMin * 31) + this.mainAxisMax) * 31) + this.crossAxisMin) * 31) + this.crossAxisMax;
    }

    public final int maxHeight(LayoutOrientation orientation) {
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        return orientation == LayoutOrientation.Horizontal ? this.crossAxisMax : this.mainAxisMax;
    }

    public final int maxWidth(LayoutOrientation orientation) {
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        return orientation == LayoutOrientation.Horizontal ? this.mainAxisMax : this.crossAxisMax;
    }

    public final OrientationIndependentConstraints stretchCrossAxis() {
        int i4 = this.mainAxisMin;
        int i5 = this.mainAxisMax;
        int i6 = this.crossAxisMax;
        return new OrientationIndependentConstraints(i4, i5, i6 != Integer.MAX_VALUE ? i6 : this.crossAxisMin, i6);
    }

    /* renamed from: toBoxConstraints-OenEA2s, reason: not valid java name */
    public final long m7308toBoxConstraintsOenEA2s(LayoutOrientation orientation) {
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        return orientation == LayoutOrientation.Horizontal ? ConstraintsKt.Constraints(this.mainAxisMin, this.mainAxisMax, this.crossAxisMin, this.crossAxisMax) : ConstraintsKt.Constraints(this.crossAxisMin, this.crossAxisMax, this.mainAxisMin, this.mainAxisMax);
    }

    public String toString() {
        return "OrientationIndependentConstraints(mainAxisMin=" + this.mainAxisMin + ", mainAxisMax=" + this.mainAxisMax + ", crossAxisMin=" + this.crossAxisMin + ", crossAxisMax=" + this.crossAxisMax + ')';
    }

    public OrientationIndependentConstraints(int i4, int i5, int i6, int i7) {
        this.mainAxisMin = i4;
        this.mainAxisMax = i5;
        this.crossAxisMin = i6;
        this.crossAxisMax = i7;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private OrientationIndependentConstraints(long j4, LayoutOrientation layoutOrientation) {
        LayoutOrientation layoutOrientation2 = LayoutOrientation.Horizontal;
        this(layoutOrientation == layoutOrientation2 ? Constraints.m11495getMinWidthimpl(j4) : Constraints.m11494getMinHeightimpl(j4), layoutOrientation == layoutOrientation2 ? Constraints.m11493getMaxWidthimpl(j4) : Constraints.m11492getMaxHeightimpl(j4), layoutOrientation == layoutOrientation2 ? Constraints.m11494getMinHeightimpl(j4) : Constraints.m11495getMinWidthimpl(j4), layoutOrientation == layoutOrientation2 ? Constraints.m11492getMaxHeightimpl(j4) : Constraints.m11493getMaxWidthimpl(j4));
    }
}
