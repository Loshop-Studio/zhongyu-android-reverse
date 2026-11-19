package androidx.compose.foundation;

import android.graphics.Rect;
import android.view.View;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.p011ui.layout.LayoutCoordinatesKt;
import androidx.compose.p011ui.node.DelegatableNode_androidKt;
import androidx.compose.p011ui.node.GlobalPositionAwareModifierNode;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6471c;
import p169t6.AbstractC6600a;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\u0016H&¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001a\u001a\u00020\u000b2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\u0016H&¢\u0006\u0004\b\u001a\u0010\u001bR0\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010\bR\u0018\u0010 \u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010%\u001a\u00020\"8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006&"}, m5110d2 = {"Landroidx/compose/foundation/RectListNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/GlobalPositionAwareModifierNode;", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "Landroidx/compose/ui/geometry/Rect;", "rect", "<init>", "(Lr6/c;)V", "Landroid/graphics/Rect;", "newRect", "Ld6/s;", "replaceRect", "(Landroid/graphics/Rect;)V", "layoutCoordinates", "calcBounds", "(Landroidx/compose/ui/layout/LayoutCoordinates;Landroidx/compose/ui/geometry/Rect;)Landroid/graphics/Rect;", "coordinates", "onGloballyPositioned", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "onDetach", "()V", "Landroidx/compose/runtime/collection/MutableVector;", "currentRects", "()Landroidx/compose/runtime/collection/MutableVector;", "rects", "updateRects", "(Landroidx/compose/runtime/collection/MutableVector;)V", "Lr6/c;", "getRect", "()Lr6/c;", "setRect", "androidRect", "Landroid/graphics/Rect;", "Landroid/view/View;", "getView", "()Landroid/view/View;", "view", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nRectListNode.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RectListNode.android.kt\nandroidx/compose/foundation/RectListNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 6 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,98:1\n1#2:99\n641#3,2:100\n65#4:102\n69#4:105\n65#4:108\n69#4:111\n60#5:103\n70#5:106\n60#5:109\n70#5:112\n22#6:104\n22#6:107\n22#6:110\n22#6:113\n*S KotlinDebug\n*F\n+ 1 RectListNode.android.kt\nandroidx/compose/foundation/RectListNode\n*L\n68#1:100,2\n85#1:102\n86#1:105\n87#1:108\n88#1:111\n85#1:103\n86#1:106\n87#1:109\n88#1:112\n85#1:104\n86#1:107\n87#1:110\n88#1:113\n*E\n"})
/* loaded from: classes.dex */
public abstract class RectListNode extends Modifier.Node implements GlobalPositionAwareModifierNode {
    public static final int $stable = 8;

    @Nullable
    private Rect androidRect;

    @Nullable
    private InterfaceC6471c rect;

    public RectListNode(@Nullable InterfaceC6471c interfaceC6471c) {
        this.rect = interfaceC6471c;
    }

    private final Rect calcBounds(LayoutCoordinates layoutCoordinates, androidx.compose.p011ui.geometry.Rect rect) {
        LayoutCoordinates layoutCoordinatesFindRootCoordinates = LayoutCoordinatesKt.findRootCoordinates(layoutCoordinates);
        long jMo12042localPositionOfR5De75A = layoutCoordinatesFindRootCoordinates.mo12042localPositionOfR5De75A(layoutCoordinates, rect.m10476getTopLeftF1C5BW0());
        long jMo12042localPositionOfR5De75A2 = layoutCoordinatesFindRootCoordinates.mo12042localPositionOfR5De75A(layoutCoordinates, rect.m10477getTopRightF1C5BW0());
        long jMo12042localPositionOfR5De75A3 = layoutCoordinatesFindRootCoordinates.mo12042localPositionOfR5De75A(layoutCoordinates, rect.m10469getBottomLeftF1C5BW0());
        long jMo12042localPositionOfR5De75A4 = layoutCoordinatesFindRootCoordinates.mo12042localPositionOfR5De75A(layoutCoordinates, rect.m10470getBottomRightF1C5BW0());
        int i = (int) (jMo12042localPositionOfR5De75A >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i);
        int i8 = (int) (jMo12042localPositionOfR5De75A2 >> 32);
        int i9 = (int) (jMo12042localPositionOfR5De75A3 >> 32);
        int i10 = (int) (jMo12042localPositionOfR5De75A4 >> 32);
        boolean z8 = true;
        float[] fArr = {Float.intBitsToFloat(i8), Float.intBitsToFloat(i9), Float.intBitsToFloat(i10)};
        int i11 = 0;
        while (i11 < 3) {
            fIntBitsToFloat = Math.min(fIntBitsToFloat, fArr[i11]);
            i11++;
            z8 = z8;
        }
        boolean z9 = z8;
        int i12 = (int) (jMo12042localPositionOfR5De75A & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i12);
        int i13 = (int) (jMo12042localPositionOfR5De75A2 & 4294967295L);
        float fIntBitsToFloat3 = Float.intBitsToFloat(i13);
        int i14 = (int) (jMo12042localPositionOfR5De75A3 & 4294967295L);
        float fIntBitsToFloat4 = Float.intBitsToFloat(i14);
        int i15 = (int) (jMo12042localPositionOfR5De75A4 & 4294967295L);
        float fIntBitsToFloat5 = Float.intBitsToFloat(i15);
        float[] fArr2 = new float[3];
        fArr2[0] = fIntBitsToFloat3;
        fArr2[z9 ? 1 : 0] = fIntBitsToFloat4;
        fArr2[2] = fIntBitsToFloat5;
        for (int i16 = 0; i16 < 3; i16++) {
            fIntBitsToFloat2 = Math.min(fIntBitsToFloat2, fArr2[i16]);
        }
        float fIntBitsToFloat6 = Float.intBitsToFloat(i);
        float fIntBitsToFloat7 = Float.intBitsToFloat(i8);
        float fIntBitsToFloat8 = Float.intBitsToFloat(i9);
        float fIntBitsToFloat9 = Float.intBitsToFloat(i10);
        float[] fArr3 = new float[3];
        fArr3[0] = fIntBitsToFloat7;
        fArr3[z9 ? 1 : 0] = fIntBitsToFloat8;
        fArr3[2] = fIntBitsToFloat9;
        for (int i17 = 0; i17 < 3; i17++) {
            fIntBitsToFloat6 = Math.max(fIntBitsToFloat6, fArr3[i17]);
        }
        float fIntBitsToFloat10 = Float.intBitsToFloat(i12);
        float fIntBitsToFloat11 = Float.intBitsToFloat(i13);
        float fIntBitsToFloat12 = Float.intBitsToFloat(i14);
        float fIntBitsToFloat13 = Float.intBitsToFloat(i15);
        float[] fArr4 = new float[3];
        fArr4[0] = fIntBitsToFloat11;
        fArr4[z9 ? 1 : 0] = fIntBitsToFloat12;
        fArr4[2] = fIntBitsToFloat13;
        for (int i18 = 0; i18 < 3; i18++) {
            fIntBitsToFloat10 = Math.max(fIntBitsToFloat10, fArr4[i18]);
        }
        return new Rect(AbstractC6600a.m6241q(fIntBitsToFloat), AbstractC6600a.m6241q(fIntBitsToFloat2), AbstractC6600a.m6241q(fIntBitsToFloat6), AbstractC6600a.m6241q(fIntBitsToFloat10));
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

    @NotNull
    public abstract MutableVector<Rect> currentRects();

    @Nullable
    public InterfaceC6471c getRect() {
        return this.rect;
    }

    @NotNull
    public final View getView() {
        return DelegatableNode_androidKt.requireView(this);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        super.onDetach();
        replaceRect(null);
    }

    @Override // androidx.compose.p011ui.node.GlobalPositionAwareModifierNode
    public void onGloballyPositioned(@NotNull LayoutCoordinates coordinates) {
        Rect rectCalcBounds;
        if (getRect() == null) {
            androidx.compose.p011ui.geometry.Rect rectBoundsInRoot = LayoutCoordinatesKt.boundsInRoot(coordinates);
            rectCalcBounds = new Rect(AbstractC6600a.m6241q(rectBoundsInRoot.getLeft()), AbstractC6600a.m6241q(rectBoundsInRoot.getTop()), AbstractC6600a.m6241q(rectBoundsInRoot.getRight()), AbstractC6600a.m6241q(rectBoundsInRoot.getBottom()));
        } else {
            InterfaceC6471c rect = getRect();
            AbstractC5830k.m5327d(rect);
            rectCalcBounds = calcBounds(coordinates, (androidx.compose.p011ui.geometry.Rect) rect.invoke(coordinates));
        }
        replaceRect(rectCalcBounds);
    }

    public void setRect(@Nullable InterfaceC6471c interfaceC6471c) {
        this.rect = interfaceC6471c;
    }

    public abstract void updateRects(@NotNull MutableVector<Rect> rects);
}
