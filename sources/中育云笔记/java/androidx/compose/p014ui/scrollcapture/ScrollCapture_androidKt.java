package androidx.compose.p014ui.scrollcapture;

import androidx.compose.p014ui.internal.InlineClassHelperKt;
import androidx.compose.p014ui.layout.LayoutCoordinates;
import androidx.compose.p014ui.layout.LayoutCoordinatesKt;
import androidx.compose.p014ui.node.NodeCoordinator;
import androidx.compose.p014ui.platform.SemanticsUtils_androidKt;
import androidx.compose.p014ui.semantics.ScrollAxisRange;
import androidx.compose.p014ui.semantics.SemanticsActions;
import androidx.compose.p014ui.semantics.SemanticsConfigurationKt;
import androidx.compose.p014ui.semantics.SemanticsNode;
import androidx.compose.p014ui.semantics.SemanticsProperties;
import androidx.compose.p014ui.unit.IntRect;
import androidx.compose.p014ui.unit.IntRectKt;
import androidx.compose.runtime.collection.MutableVector;
import java.util.List;
import kotlin.KotlinNothingValueException;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;

/* loaded from: classes2.dex */
public final class ScrollCapture_androidKt {
    private static final boolean getCanScrollVertically(SemanticsNode semanticsNode) {
        InterfaceC9544p scrollCaptureScrollByAction = getScrollCaptureScrollByAction(semanticsNode);
        ScrollAxisRange scrollAxisRange = (ScrollAxisRange) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getVerticalScrollAxisRange());
        return (scrollCaptureScrollByAction == null || scrollAxisRange == null || ((Number) scrollAxisRange.getMaxValue().invoke()).floatValue() <= 0.0f) ? false : true;
    }

    private static final List<SemanticsNode> getChildrenForSearch(SemanticsNode semanticsNode) {
        return semanticsNode.getChildren$ui_release(false, false, false);
    }

    public static final InterfaceC9544p getScrollCaptureScrollByAction(SemanticsNode semanticsNode) {
        return (InterfaceC9544p) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getScrollByOffset());
    }

    private static final void visitDescendants(SemanticsNode semanticsNode, InterfaceC9540l interfaceC9540l) {
        MutableVector mutableVector = new MutableVector(new SemanticsNode[16], 0);
        mutableVector.addAll(mutableVector.getSize(), (List) getChildrenForSearch(semanticsNode));
        while (mutableVector.getSize() != 0) {
            SemanticsNode semanticsNode2 = (SemanticsNode) mutableVector.removeAt(mutableVector.getSize() - 1);
            if (((Boolean) interfaceC9540l.invoke(semanticsNode2)).booleanValue()) {
                mutableVector.addAll(mutableVector.getSize(), (List) getChildrenForSearch(semanticsNode2));
            }
        }
    }

    private static final void visitScrollCaptureCandidates(SemanticsNode semanticsNode, int i10, InterfaceC9540l interfaceC9540l) {
        SemanticsNode semanticsNode2;
        MutableVector mutableVector = new MutableVector(new SemanticsNode[16], 0);
        List<SemanticsNode> childrenForSearch = getChildrenForSearch(semanticsNode);
        while (true) {
            mutableVector.addAll(mutableVector.getSize(), (List) childrenForSearch);
            while (mutableVector.getSize() != 0) {
                semanticsNode2 = (SemanticsNode) mutableVector.removeAt(mutableVector.getSize() - 1);
                if (!SemanticsUtils_androidKt.isHidden(semanticsNode2) && !semanticsNode2.getUnmergedConfig$ui_release().contains(SemanticsProperties.INSTANCE.getDisabled())) {
                    NodeCoordinator nodeCoordinatorFindCoordinatorToGetBounds$ui_release = semanticsNode2.findCoordinatorToGetBounds$ui_release();
                    if (nodeCoordinatorFindCoordinatorToGetBounds$ui_release == null) {
                        InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("Expected semantics node to have a coordinator.");
                        throw new KotlinNothingValueException();
                    }
                    LayoutCoordinates coordinates = nodeCoordinatorFindCoordinatorToGetBounds$ui_release.getCoordinates();
                    IntRect intRectRoundToIntRect = IntRectKt.roundToIntRect(LayoutCoordinatesKt.boundsInWindow(coordinates));
                    if (intRectRoundToIntRect.isEmpty()) {
                        continue;
                    } else {
                        if (!getCanScrollVertically(semanticsNode2)) {
                            break;
                        }
                        int i11 = i10 + 1;
                        interfaceC9540l.invoke(new ScrollCaptureCandidate(semanticsNode2, i11, intRectRoundToIntRect, coordinates));
                        visitScrollCaptureCandidates(semanticsNode2, i11, interfaceC9540l);
                    }
                }
            }
            return;
            childrenForSearch = getChildrenForSearch(semanticsNode2);
        }
    }

    public static /* synthetic */ void visitScrollCaptureCandidates$default(SemanticsNode semanticsNode, int i10, InterfaceC9540l interfaceC9540l, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        visitScrollCaptureCandidates(semanticsNode, i10, interfaceC9540l);
    }
}
