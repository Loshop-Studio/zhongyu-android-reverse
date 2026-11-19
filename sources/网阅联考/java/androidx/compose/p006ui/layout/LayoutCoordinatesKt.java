package androidx.compose.p006ui.layout;

import androidx.compose.p006ui.geometry.Offset;
import androidx.compose.p006ui.geometry.OffsetKt;
import androidx.compose.p006ui.geometry.Rect;
import androidx.compose.p006ui.node.NodeCoordinator;
import androidx.compose.p006ui.unit.IntSize;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.comparisons.ComparisonsKt___ComparisonsJvmKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;

@Metadata(m5174d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0004\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0005\u001a\u00020\u0002*\u00020\u0002\u001a\u0012\u0010\u0006\u001a\u00020\u0007*\u00020\u0002ø\u0001\u0000¢\u0006\u0002\u0010\b\u001a\u0012\u0010\t\u001a\u00020\u0007*\u00020\u0002ø\u0001\u0000¢\u0006\u0002\u0010\b\u001a\u0012\u0010\n\u001a\u00020\u0007*\u00020\u0002ø\u0001\u0000¢\u0006\u0002\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, m5175d2 = {"boundsInParent", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "boundsInRoot", "boundsInWindow", "findRootCoordinates", "positionInParent", "Landroidx/compose/ui/geometry/Offset;", "(Landroidx/compose/ui/layout/LayoutCoordinates;)J", "positionInRoot", "positionInWindow", "ui_release"}, m5176k = 2, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class LayoutCoordinatesKt {
    public static final Rect boundsInParent(LayoutCoordinates layoutCoordinates) {
        Rect rectM639c;
        Intrinsics.checkNotNullParameter(layoutCoordinates, "<this>");
        LayoutCoordinates parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        return (parentLayoutCoordinates == null || (rectM639c = AbstractC1418b.m639c(parentLayoutCoordinates, layoutCoordinates, false, 2, null)) == null) ? new Rect(0.0f, 0.0f, IntSize.m11685getWidthimpl(layoutCoordinates.mo10589getSizeYbymL2g()), IntSize.m11684getHeightimpl(layoutCoordinates.mo10589getSizeYbymL2g())) : rectM639c;
    }

    public static final Rect boundsInRoot(LayoutCoordinates layoutCoordinates) {
        Intrinsics.checkNotNullParameter(layoutCoordinates, "<this>");
        return AbstractC1418b.m639c(findRootCoordinates(layoutCoordinates), layoutCoordinates, false, 2, null);
    }

    public static final Rect boundsInWindow(LayoutCoordinates layoutCoordinates) {
        Intrinsics.checkNotNullParameter(layoutCoordinates, "<this>");
        LayoutCoordinates layoutCoordinatesFindRootCoordinates = findRootCoordinates(layoutCoordinates);
        Rect rectBoundsInRoot = boundsInRoot(layoutCoordinates);
        float fM11685getWidthimpl = IntSize.m11685getWidthimpl(layoutCoordinatesFindRootCoordinates.mo10589getSizeYbymL2g());
        float fM11684getHeightimpl = IntSize.m11684getHeightimpl(layoutCoordinatesFindRootCoordinates.mo10589getSizeYbymL2g());
        float fCoerceIn = RangesKt___RangesKt.coerceIn(rectBoundsInRoot.getLeft(), 0.0f, fM11685getWidthimpl);
        float fCoerceIn2 = RangesKt___RangesKt.coerceIn(rectBoundsInRoot.getTop(), 0.0f, fM11684getHeightimpl);
        float fCoerceIn3 = RangesKt___RangesKt.coerceIn(rectBoundsInRoot.getRight(), 0.0f, fM11685getWidthimpl);
        float fCoerceIn4 = RangesKt___RangesKt.coerceIn(rectBoundsInRoot.getBottom(), 0.0f, fM11684getHeightimpl);
        if (!(fCoerceIn == fCoerceIn3)) {
            if (!(fCoerceIn2 == fCoerceIn4)) {
                long jMo10592localToWindowMKHz9U = layoutCoordinatesFindRootCoordinates.mo10592localToWindowMKHz9U(OffsetKt.Offset(fCoerceIn, fCoerceIn2));
                long jMo10592localToWindowMKHz9U2 = layoutCoordinatesFindRootCoordinates.mo10592localToWindowMKHz9U(OffsetKt.Offset(fCoerceIn3, fCoerceIn2));
                long jMo10592localToWindowMKHz9U3 = layoutCoordinatesFindRootCoordinates.mo10592localToWindowMKHz9U(OffsetKt.Offset(fCoerceIn3, fCoerceIn4));
                long jMo10592localToWindowMKHz9U4 = layoutCoordinatesFindRootCoordinates.mo10592localToWindowMKHz9U(OffsetKt.Offset(fCoerceIn, fCoerceIn4));
                return new Rect(ComparisonsKt___ComparisonsJvmKt.minOf(Offset.m8945getXimpl(jMo10592localToWindowMKHz9U), Offset.m8945getXimpl(jMo10592localToWindowMKHz9U2), Offset.m8945getXimpl(jMo10592localToWindowMKHz9U4), Offset.m8945getXimpl(jMo10592localToWindowMKHz9U3)), ComparisonsKt___ComparisonsJvmKt.minOf(Offset.m8946getYimpl(jMo10592localToWindowMKHz9U), Offset.m8946getYimpl(jMo10592localToWindowMKHz9U2), Offset.m8946getYimpl(jMo10592localToWindowMKHz9U4), Offset.m8946getYimpl(jMo10592localToWindowMKHz9U3)), ComparisonsKt___ComparisonsJvmKt.maxOf(Offset.m8945getXimpl(jMo10592localToWindowMKHz9U), Offset.m8945getXimpl(jMo10592localToWindowMKHz9U2), Offset.m8945getXimpl(jMo10592localToWindowMKHz9U4), Offset.m8945getXimpl(jMo10592localToWindowMKHz9U3)), ComparisonsKt___ComparisonsJvmKt.maxOf(Offset.m8946getYimpl(jMo10592localToWindowMKHz9U), Offset.m8946getYimpl(jMo10592localToWindowMKHz9U2), Offset.m8946getYimpl(jMo10592localToWindowMKHz9U4), Offset.m8946getYimpl(jMo10592localToWindowMKHz9U3)));
            }
        }
        return Rect.INSTANCE.getZero();
    }

    public static final LayoutCoordinates findRootCoordinates(LayoutCoordinates layoutCoordinates) {
        LayoutCoordinates layoutCoordinates2;
        Intrinsics.checkNotNullParameter(layoutCoordinates, "<this>");
        LayoutCoordinates parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        while (true) {
            LayoutCoordinates layoutCoordinates3 = parentLayoutCoordinates;
            layoutCoordinates2 = layoutCoordinates;
            layoutCoordinates = layoutCoordinates3;
            if (layoutCoordinates == null) {
                break;
            }
            parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        }
        NodeCoordinator nodeCoordinator = layoutCoordinates2 instanceof NodeCoordinator ? (NodeCoordinator) layoutCoordinates2 : null;
        if (nodeCoordinator == null) {
            return layoutCoordinates2;
        }
        NodeCoordinator wrappedBy = nodeCoordinator.getWrappedBy();
        while (true) {
            NodeCoordinator nodeCoordinator2 = wrappedBy;
            NodeCoordinator nodeCoordinator3 = nodeCoordinator;
            nodeCoordinator = nodeCoordinator2;
            if (nodeCoordinator == null) {
                return nodeCoordinator3;
            }
            wrappedBy = nodeCoordinator.getWrappedBy();
        }
    }

    public static final long positionInParent(LayoutCoordinates layoutCoordinates) {
        Intrinsics.checkNotNullParameter(layoutCoordinates, "<this>");
        LayoutCoordinates parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        return parentLayoutCoordinates != null ? parentLayoutCoordinates.mo10590localPositionOfR5De75A(layoutCoordinates, Offset.INSTANCE.m8961getZeroF1C5BW0()) : Offset.INSTANCE.m8961getZeroF1C5BW0();
    }

    public static final long positionInRoot(LayoutCoordinates layoutCoordinates) {
        Intrinsics.checkNotNullParameter(layoutCoordinates, "<this>");
        return layoutCoordinates.mo10591localToRootMKHz9U(Offset.INSTANCE.m8961getZeroF1C5BW0());
    }

    public static final long positionInWindow(LayoutCoordinates layoutCoordinates) {
        Intrinsics.checkNotNullParameter(layoutCoordinates, "<this>");
        return layoutCoordinates.mo10592localToWindowMKHz9U(Offset.INSTANCE.m8961getZeroF1C5BW0());
    }
}
