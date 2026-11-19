package androidx.compose.foundation;

import android.graphics.Rect;
import android.view.View;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.layout.LayoutCoordinates;
import androidx.compose.p013ui.layout.LayoutCoordinatesKt;
import androidx.compose.p013ui.node.DelegatableNode_androidKt;
import androidx.compose.p013ui.node.GlobalPositionAwareModifierNode;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9133u;
import p168l7.AbstractC9261c;
import p300x7.InterfaceC10570l;
import p322z7.AbstractC10729c;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public abstract class RectListNode extends Modifier.Node implements GlobalPositionAwareModifierNode {
    public static final int $stable = 8;
    private Rect androidRect;
    private InterfaceC10570l rect;

    public RectListNode(InterfaceC10570l interfaceC10570l) {
        this.rect = interfaceC10570l;
    }

    private final Rect calcBounds(LayoutCoordinates layoutCoordinates, androidx.compose.p013ui.geometry.Rect rect) {
        LayoutCoordinates layoutCoordinatesFindRootCoordinates = LayoutCoordinatesKt.findRootCoordinates(layoutCoordinates);
        long jMo25636localPositionOfR5De75A = layoutCoordinatesFindRootCoordinates.mo25636localPositionOfR5De75A(layoutCoordinates, rect.m24070getTopLeftF1C5BW0());
        long jMo25636localPositionOfR5De75A2 = layoutCoordinatesFindRootCoordinates.mo25636localPositionOfR5De75A(layoutCoordinates, rect.m24071getTopRightF1C5BW0());
        long jMo25636localPositionOfR5De75A3 = layoutCoordinatesFindRootCoordinates.mo25636localPositionOfR5De75A(layoutCoordinates, rect.m24063getBottomLeftF1C5BW0());
        long jMo25636localPositionOfR5De75A4 = layoutCoordinatesFindRootCoordinates.mo25636localPositionOfR5De75A(layoutCoordinates, rect.m24064getBottomRightF1C5BW0());
        int i10 = (int) (jMo25636localPositionOfR5De75A >> 32);
        int i11 = (int) (jMo25636localPositionOfR5De75A2 >> 32);
        int i12 = (int) (jMo25636localPositionOfR5De75A3 >> 32);
        int i13 = (int) (jMo25636localPositionOfR5De75A4 >> 32);
        int i14 = (int) (jMo25636localPositionOfR5De75A & 4294967295L);
        int i15 = (int) (jMo25636localPositionOfR5De75A2 & 4294967295L);
        int i16 = (int) (jMo25636localPositionOfR5De75A3 & 4294967295L);
        int i17 = (int) (jMo25636localPositionOfR5De75A4 & 4294967295L);
        return new Rect(AbstractC10729c.m20035d(AbstractC9261c.m16983j(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11), Float.intBitsToFloat(i12), Float.intBitsToFloat(i13))), AbstractC10729c.m20035d(AbstractC9261c.m16983j(Float.intBitsToFloat(i14), Float.intBitsToFloat(i15), Float.intBitsToFloat(i16), Float.intBitsToFloat(i17))), AbstractC10729c.m20035d(AbstractC9261c.m16980g(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11), Float.intBitsToFloat(i12), Float.intBitsToFloat(i13))), AbstractC10729c.m20035d(AbstractC9261c.m16980g(Float.intBitsToFloat(i14), Float.intBitsToFloat(i15), Float.intBitsToFloat(i16), Float.intBitsToFloat(i17))));
    }

    private final void replaceRect(Rect rect) {
        MutableVector<Rect> mutableVectorCurrentRects = currentRects();
        Rect rect2 = this.androidRect;
        if (rect2 != null) {
            mutableVectorCurrentRects.remove(rect2);
        }
        if (rect != null && !rect.isEmpty()) {
            mutableVectorCurrentRects.add(rect);
        }
        updateRects(mutableVectorCurrentRects);
        this.androidRect = rect;
    }

    public abstract MutableVector<Rect> currentRects();

    public InterfaceC10570l getRect() {
        return this.rect;
    }

    public final View getView() {
        return DelegatableNode_androidKt.requireView(this);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        super.onDetach();
        replaceRect(null);
    }

    @Override // androidx.compose.p013ui.node.GlobalPositionAwareModifierNode
    public void onGloballyPositioned(LayoutCoordinates layoutCoordinates) {
        Rect rectCalcBounds;
        if (getRect() == null) {
            androidx.compose.p013ui.geometry.Rect rectBoundsInRoot = LayoutCoordinatesKt.boundsInRoot(layoutCoordinates);
            rectCalcBounds = new Rect(AbstractC10729c.m20035d(rectBoundsInRoot.getLeft()), AbstractC10729c.m20035d(rectBoundsInRoot.getTop()), AbstractC10729c.m20035d(rectBoundsInRoot.getRight()), AbstractC10729c.m20035d(rectBoundsInRoot.getBottom()));
        } else {
            InterfaceC10570l rect = getRect();
            AbstractC9133u.m16130d(rect);
            rectCalcBounds = calcBounds(layoutCoordinates, (androidx.compose.p013ui.geometry.Rect) rect.invoke(layoutCoordinates));
        }
        replaceRect(rectCalcBounds);
    }

    public void setRect(InterfaceC10570l interfaceC10570l) {
        this.rect = interfaceC10570l;
    }

    public abstract void updateRects(MutableVector<Rect> mutableVector);
}
