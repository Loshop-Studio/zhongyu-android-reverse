package androidx.compose.foundation;

import android.graphics.Rect;
import android.view.View;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.layout.LayoutCoordinates;
import androidx.compose.p014ui.layout.LayoutCoordinatesKt;
import androidx.compose.p014ui.node.DelegatableNode_androidKt;
import androidx.compose.p014ui.node.GlobalPositionAwareModifierNode;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;
import p211jd.AbstractC9719c;
import p364uc.AbstractC11383c;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public abstract class RectListNode extends Modifier.Node implements GlobalPositionAwareModifierNode {
    public static final int $stable = 8;
    private Rect androidRect;
    private InterfaceC9540l rect;

    public RectListNode(InterfaceC9540l interfaceC9540l) {
        this.rect = interfaceC9540l;
    }

    private final Rect calcBounds(LayoutCoordinates layoutCoordinates, androidx.compose.p014ui.geometry.Rect rect) {
        LayoutCoordinates layoutCoordinatesFindRootCoordinates = LayoutCoordinatesKt.findRootCoordinates(layoutCoordinates);
        long jMo32238localPositionOfR5De75A = layoutCoordinatesFindRootCoordinates.mo32238localPositionOfR5De75A(layoutCoordinates, rect.m30672getTopLeftF1C5BW0());
        long jMo32238localPositionOfR5De75A2 = layoutCoordinatesFindRootCoordinates.mo32238localPositionOfR5De75A(layoutCoordinates, rect.m30673getTopRightF1C5BW0());
        long jMo32238localPositionOfR5De75A3 = layoutCoordinatesFindRootCoordinates.mo32238localPositionOfR5De75A(layoutCoordinates, rect.m30665getBottomLeftF1C5BW0());
        long jMo32238localPositionOfR5De75A4 = layoutCoordinatesFindRootCoordinates.mo32238localPositionOfR5De75A(layoutCoordinates, rect.m30666getBottomRightF1C5BW0());
        int i10 = (int) (jMo32238localPositionOfR5De75A >> 32);
        int i11 = (int) (jMo32238localPositionOfR5De75A2 >> 32);
        int i12 = (int) (jMo32238localPositionOfR5De75A3 >> 32);
        int i13 = (int) (jMo32238localPositionOfR5De75A4 >> 32);
        int i14 = (int) (jMo32238localPositionOfR5De75A & 4294967295L);
        int i15 = (int) (jMo32238localPositionOfR5De75A2 & 4294967295L);
        int i16 = (int) (jMo32238localPositionOfR5De75A3 & 4294967295L);
        int i17 = (int) (jMo32238localPositionOfR5De75A4 & 4294967295L);
        return new Rect(AbstractC9719c.m19282d(AbstractC11383c.m25337k(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11), Float.intBitsToFloat(i12), Float.intBitsToFloat(i13))), AbstractC9719c.m19282d(AbstractC11383c.m25337k(Float.intBitsToFloat(i14), Float.intBitsToFloat(i15), Float.intBitsToFloat(i16), Float.intBitsToFloat(i17))), AbstractC9719c.m19282d(AbstractC11383c.m25334h(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11), Float.intBitsToFloat(i12), Float.intBitsToFloat(i13))), AbstractC9719c.m19282d(AbstractC11383c.m25334h(Float.intBitsToFloat(i14), Float.intBitsToFloat(i15), Float.intBitsToFloat(i16), Float.intBitsToFloat(i17))));
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

    public InterfaceC9540l getRect() {
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

    @Override // androidx.compose.p014ui.node.GlobalPositionAwareModifierNode
    public void onGloballyPositioned(LayoutCoordinates layoutCoordinates) {
        Rect rectCalcBounds;
        if (getRect() == null) {
            androidx.compose.p014ui.geometry.Rect rectBoundsInRoot = LayoutCoordinatesKt.boundsInRoot(layoutCoordinates);
            rectCalcBounds = new Rect(AbstractC9719c.m19282d(rectBoundsInRoot.getLeft()), AbstractC9719c.m19282d(rectBoundsInRoot.getTop()), AbstractC9719c.m19282d(rectBoundsInRoot.getRight()), AbstractC9719c.m19282d(rectBoundsInRoot.getBottom()));
        } else {
            InterfaceC9540l rect = getRect();
            AbstractC9979u.m20291d(rect);
            rectCalcBounds = calcBounds(layoutCoordinates, (androidx.compose.p014ui.geometry.Rect) rect.invoke(layoutCoordinates));
        }
        replaceRect(rectCalcBounds);
    }

    public void setRect(InterfaceC9540l interfaceC9540l) {
        this.rect = interfaceC9540l;
    }

    public abstract void updateRects(MutableVector<Rect> mutableVector);
}
