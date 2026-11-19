package androidx.compose.p014ui.layout;

import androidx.compose.p014ui.geometry.Offset;
import androidx.compose.p014ui.geometry.Rect;
import androidx.compose.p014ui.node.NodeCoordinator;

/* loaded from: classes2.dex */
public final class LayoutCoordinatesKt {
    public static final Rect boundsInParent(LayoutCoordinates layoutCoordinates) {
        Rect rectLocalBoundingBoxOf$default;
        LayoutCoordinates parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        return (parentLayoutCoordinates == null || (rectLocalBoundingBoxOf$default = LayoutCoordinates.localBoundingBoxOf$default(parentLayoutCoordinates, layoutCoordinates, false, 2, null)) == null) ? new Rect(0.0f, 0.0f, (int) (layoutCoordinates.mo32237getSizeYbymL2g() >> 32), (int) (layoutCoordinates.mo32237getSizeYbymL2g() & 4294967295L)) : rectLocalBoundingBoxOf$default;
    }

    public static final Rect boundsInRoot(LayoutCoordinates layoutCoordinates) {
        return LayoutCoordinates.localBoundingBoxOf$default(findRootCoordinates(layoutCoordinates), layoutCoordinates, false, 2, null);
    }

    public static final Rect boundsInWindow(LayoutCoordinates layoutCoordinates) {
        LayoutCoordinates layoutCoordinatesFindRootCoordinates = findRootCoordinates(layoutCoordinates);
        float fMo32237getSizeYbymL2g = (int) (layoutCoordinatesFindRootCoordinates.mo32237getSizeYbymL2g() >> 32);
        float fMo32237getSizeYbymL2g2 = (int) (layoutCoordinatesFindRootCoordinates.mo32237getSizeYbymL2g() & 4294967295L);
        Rect rectLocalBoundingBoxOf$default = LayoutCoordinates.localBoundingBoxOf$default(layoutCoordinatesFindRootCoordinates, layoutCoordinates, false, 2, null);
        float left = rectLocalBoundingBoxOf$default.getLeft();
        if (left < 0.0f) {
            left = 0.0f;
        }
        if (left > fMo32237getSizeYbymL2g) {
            left = fMo32237getSizeYbymL2g;
        }
        float top2 = rectLocalBoundingBoxOf$default.getTop();
        if (top2 < 0.0f) {
            top2 = 0.0f;
        }
        if (top2 > fMo32237getSizeYbymL2g2) {
            top2 = fMo32237getSizeYbymL2g2;
        }
        float right = rectLocalBoundingBoxOf$default.getRight();
        if (right < 0.0f) {
            right = 0.0f;
        }
        if (right <= fMo32237getSizeYbymL2g) {
            fMo32237getSizeYbymL2g = right;
        }
        float bottom = rectLocalBoundingBoxOf$default.getBottom();
        float f10 = bottom >= 0.0f ? bottom : 0.0f;
        if (f10 <= fMo32237getSizeYbymL2g2) {
            fMo32237getSizeYbymL2g2 = f10;
        }
        if (left == fMo32237getSizeYbymL2g || top2 == fMo32237getSizeYbymL2g2) {
            return Rect.Companion.getZero();
        }
        long jMo32242localToWindowMKHz9U = layoutCoordinatesFindRootCoordinates.mo32242localToWindowMKHz9U(Offset.m30629constructorimpl((Float.floatToRawIntBits(left) << 32) | (Float.floatToRawIntBits(top2) & 4294967295L)));
        long jMo32242localToWindowMKHz9U2 = layoutCoordinatesFindRootCoordinates.mo32242localToWindowMKHz9U(Offset.m30629constructorimpl((Float.floatToRawIntBits(top2) & 4294967295L) | (Float.floatToRawIntBits(fMo32237getSizeYbymL2g) << 32)));
        long jMo32242localToWindowMKHz9U3 = layoutCoordinatesFindRootCoordinates.mo32242localToWindowMKHz9U(Offset.m30629constructorimpl((Float.floatToRawIntBits(fMo32237getSizeYbymL2g) << 32) | (Float.floatToRawIntBits(fMo32237getSizeYbymL2g2) & 4294967295L)));
        long jMo32242localToWindowMKHz9U4 = layoutCoordinatesFindRootCoordinates.mo32242localToWindowMKHz9U(Offset.m30629constructorimpl((Float.floatToRawIntBits(fMo32237getSizeYbymL2g2) & 4294967295L) | (Float.floatToRawIntBits(left) << 32)));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jMo32242localToWindowMKHz9U >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jMo32242localToWindowMKHz9U2 >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jMo32242localToWindowMKHz9U4 >> 32));
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jMo32242localToWindowMKHz9U3 >> 32));
        float fMin = Math.min(fIntBitsToFloat, Math.min(fIntBitsToFloat2, Math.min(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fMax = Math.max(fIntBitsToFloat, Math.max(fIntBitsToFloat2, Math.max(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fIntBitsToFloat5 = Float.intBitsToFloat((int) (jMo32242localToWindowMKHz9U & 4294967295L));
        float fIntBitsToFloat6 = Float.intBitsToFloat((int) (jMo32242localToWindowMKHz9U2 & 4294967295L));
        float fIntBitsToFloat7 = Float.intBitsToFloat((int) (jMo32242localToWindowMKHz9U4 & 4294967295L));
        float fIntBitsToFloat8 = Float.intBitsToFloat((int) (jMo32242localToWindowMKHz9U3 & 4294967295L));
        return new Rect(fMin, Math.min(fIntBitsToFloat5, Math.min(fIntBitsToFloat6, Math.min(fIntBitsToFloat7, fIntBitsToFloat8))), fMax, Math.max(fIntBitsToFloat5, Math.max(fIntBitsToFloat6, Math.max(fIntBitsToFloat7, fIntBitsToFloat8))));
    }

    public static final LayoutCoordinates findRootCoordinates(LayoutCoordinates layoutCoordinates) {
        LayoutCoordinates layoutCoordinates2;
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
        NodeCoordinator wrappedBy$ui_release = nodeCoordinator.getWrappedBy$ui_release();
        while (true) {
            NodeCoordinator nodeCoordinator2 = wrappedBy$ui_release;
            NodeCoordinator nodeCoordinator3 = nodeCoordinator;
            nodeCoordinator = nodeCoordinator2;
            if (nodeCoordinator == null) {
                return nodeCoordinator3;
            }
            wrappedBy$ui_release = nodeCoordinator.getWrappedBy$ui_release();
        }
    }

    public static final long positionInParent(LayoutCoordinates layoutCoordinates) {
        LayoutCoordinates parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        return parentLayoutCoordinates != null ? parentLayoutCoordinates.mo32238localPositionOfR5De75A(layoutCoordinates, Offset.Companion.m30653getZeroF1C5BW0()) : Offset.Companion.m30653getZeroF1C5BW0();
    }

    public static final long positionInRoot(LayoutCoordinates layoutCoordinates) {
        return layoutCoordinates.mo32240localToRootMKHz9U(Offset.Companion.m30653getZeroF1C5BW0());
    }

    public static final long positionInWindow(LayoutCoordinates layoutCoordinates) {
        return layoutCoordinates.mo32242localToWindowMKHz9U(Offset.Companion.m30653getZeroF1C5BW0());
    }

    public static final long positionOnScreen(LayoutCoordinates layoutCoordinates) {
        return layoutCoordinates.mo32241localToScreenMKHz9U(Offset.Companion.m30653getZeroF1C5BW0());
    }
}
