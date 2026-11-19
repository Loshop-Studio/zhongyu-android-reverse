package androidx.compose.foundation;

import android.graphics.Rect;
import android.view.View;
import androidx.compose.p009ui.Modifier;
import androidx.compose.p009ui.layout.LayoutCoordinates;
import androidx.compose.p009ui.layout.LayoutCoordinatesKt;
import androidx.compose.p009ui.node.DelegatableNode_androidKt;
import androidx.compose.p009ui.node.GlobalPositionAwareModifierNode;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;

@StabilityInferred(parameters = 0)
@Metadata(m7879d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b \u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004¢\u0006\u0002\u0010\u0007J\u0018\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0006H\u0002J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\u0014H&J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0005H\u0016J\u0012\u0010\u0019\u001a\u00020\u00162\b\u0010\u001a\u001a\u0004\u0018\u00010\tH\u0002J\u0016\u0010\u001b\u001a\u00020\u00162\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\t0\u0014H&R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R(\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\u0007R\u0014\u0010\r\u001a\u00020\u000e8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, m7880d2 = {"Landroidx/compose/foundation/RectListNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/GlobalPositionAwareModifierNode;", "rect", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "Landroidx/compose/ui/geometry/Rect;", "(Lkotlin/jvm/functions/Function1;)V", "androidRect", "Landroid/graphics/Rect;", "getRect", "()Lkotlin/jvm/functions/Function1;", "setRect", "view", "Landroid/view/View;", "getView", "()Landroid/view/View;", "calcBounds", "layoutCoordinates", "currentRects", "Landroidx/compose/runtime/collection/MutableVector;", "onDetach", "", "onGloballyPositioned", "coordinates", "replaceRect", "newRect", "updateRects", "rects", "foundation_release"}, m7881k = 1, m7882mv = {1, 9, 0}, m7884xi = 48)
@SourceDebugExtension({"SMAP\nRectListNode.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RectListNode.android.kt\nandroidx/compose/foundation/RectListNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 6 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,98:1\n1#2:99\n641#3,2:100\n65#4:102\n69#4:105\n65#4:108\n69#4:111\n60#5:103\n70#5:106\n60#5:109\n70#5:112\n22#6:104\n22#6:107\n22#6:110\n22#6:113\n*S KotlinDebug\n*F\n+ 1 RectListNode.android.kt\nandroidx/compose/foundation/RectListNode\n*L\n68#1:100,2\n85#1:102\n86#1:105\n87#1:108\n88#1:111\n85#1:103\n86#1:106\n87#1:109\n88#1:112\n85#1:104\n86#1:107\n87#1:110\n88#1:113\n*E\n"})
/* loaded from: classes.dex */
public abstract class RectListNode extends Modifier.Node implements GlobalPositionAwareModifierNode {
    public static final int $stable = 8;
    private Rect androidRect;
    private Function1<? super LayoutCoordinates, androidx.compose.p009ui.geometry.Rect> rect;

    public RectListNode(Function1<? super LayoutCoordinates, androidx.compose.p009ui.geometry.Rect> function1) {
        this.rect = function1;
    }

    private final Rect calcBounds(LayoutCoordinates layoutCoordinates, androidx.compose.p009ui.geometry.Rect rect) {
        LayoutCoordinates layoutCoordinatesFindRootCoordinates = LayoutCoordinatesKt.findRootCoordinates(layoutCoordinates);
        long jMo15256localPositionOfR5De75A = layoutCoordinatesFindRootCoordinates.mo15256localPositionOfR5De75A(layoutCoordinates, rect.m13693getTopLeftF1C5BW0());
        long jMo15256localPositionOfR5De75A2 = layoutCoordinatesFindRootCoordinates.mo15256localPositionOfR5De75A(layoutCoordinates, rect.m13694getTopRightF1C5BW0());
        long jMo15256localPositionOfR5De75A3 = layoutCoordinatesFindRootCoordinates.mo15256localPositionOfR5De75A(layoutCoordinates, rect.m13686getBottomLeftF1C5BW0());
        long jMo15256localPositionOfR5De75A4 = layoutCoordinatesFindRootCoordinates.mo15256localPositionOfR5De75A(layoutCoordinates, rect.m13687getBottomRightF1C5BW0());
        int i6 = (int) (jMo15256localPositionOfR5De75A >> 32);
        int i7 = (int) (jMo15256localPositionOfR5De75A2 >> 32);
        int i8 = (int) (jMo15256localPositionOfR5De75A3 >> 32);
        int i9 = (int) (jMo15256localPositionOfR5De75A4 >> 32);
        int i10 = (int) (jMo15256localPositionOfR5De75A & 4294967295L);
        int i11 = (int) (jMo15256localPositionOfR5De75A2 & 4294967295L);
        int i12 = (int) (jMo15256localPositionOfR5De75A3 & 4294967295L);
        int i13 = (int) (jMo15256localPositionOfR5De75A4 & 4294967295L);
        return new Rect(MathKt.roundToInt(ComparisonsKt.minOf(Float.intBitsToFloat(i6), Float.intBitsToFloat(i7), Float.intBitsToFloat(i8), Float.intBitsToFloat(i9))), MathKt.roundToInt(ComparisonsKt.minOf(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11), Float.intBitsToFloat(i12), Float.intBitsToFloat(i13))), MathKt.roundToInt(ComparisonsKt.maxOf(Float.intBitsToFloat(i6), Float.intBitsToFloat(i7), Float.intBitsToFloat(i8), Float.intBitsToFloat(i9))), MathKt.roundToInt(ComparisonsKt.maxOf(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11), Float.intBitsToFloat(i12), Float.intBitsToFloat(i13))));
    }

    private final void replaceRect(Rect newRect) {
        MutableVector<Rect> mutableVectorCurrentRects = currentRects();
        Rect rect = this.androidRect;
        if (rect != null) {
            mutableVectorCurrentRects.remove(rect);
        }
        if (newRect != null && !newRect.isEmpty()) {
            mutableVectorCurrentRects.add(newRect);
        }
        updateRects(mutableVectorCurrentRects);
        this.androidRect = newRect;
    }

    public abstract MutableVector<Rect> currentRects();

    public Function1<LayoutCoordinates, androidx.compose.p009ui.geometry.Rect> getRect() {
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

    @Override // androidx.compose.p009ui.node.GlobalPositionAwareModifierNode
    public void onGloballyPositioned(LayoutCoordinates coordinates) {
        Rect rectCalcBounds;
        if (getRect() == null) {
            androidx.compose.p009ui.geometry.Rect rectBoundsInRoot = LayoutCoordinatesKt.boundsInRoot(coordinates);
            rectCalcBounds = new Rect(MathKt.roundToInt(rectBoundsInRoot.getLeft()), MathKt.roundToInt(rectBoundsInRoot.getTop()), MathKt.roundToInt(rectBoundsInRoot.getRight()), MathKt.roundToInt(rectBoundsInRoot.getBottom()));
        } else {
            Function1<LayoutCoordinates, androidx.compose.p009ui.geometry.Rect> rect = getRect();
            Intrinsics.checkNotNull(rect);
            rectCalcBounds = calcBounds(coordinates, rect.invoke(coordinates));
        }
        replaceRect(rectCalcBounds);
    }

    public void setRect(Function1<? super LayoutCoordinates, androidx.compose.p009ui.geometry.Rect> function1) {
        this.rect = function1;
    }

    public abstract void updateRects(MutableVector<Rect> rects);
}
