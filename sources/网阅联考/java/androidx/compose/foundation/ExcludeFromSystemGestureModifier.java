package androidx.compose.foundation;

import android.view.View;
import androidx.annotation.RequiresApi;
import androidx.compose.p006ui.AbstractC1266a;
import androidx.compose.p006ui.AbstractC1267b;
import androidx.compose.p006ui.Modifier;
import androidx.compose.p006ui.geometry.Offset;
import androidx.compose.p006ui.geometry.Rect;
import androidx.compose.p006ui.layout.LayoutCoordinates;
import androidx.compose.p006ui.layout.LayoutCoordinatesKt;
import androidx.compose.p006ui.layout.OnGloballyPositionedModifier;
import androidx.compose.runtime.collection.MutableVector;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.comparisons.ComparisonsKt___ComparisonsJvmKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt__MathJVMKt;

@RequiresApi(29)
@Metadata(m5174d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\u0002\u0010\bJ\u0018\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0007H\u0002J\u0010\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0006H\u0002J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0006H\u0016J\u0006\u0010\u0019\u001a\u00020\u0017J\u0010\u0010\u001a\u001a\u00020\u00172\b\u0010\u001b\u001a\u0004\u0018\u00010\fR\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001c"}, m5175d2 = {"Landroidx/compose/foundation/ExcludeFromSystemGestureModifier;", "Landroidx/compose/ui/layout/OnGloballyPositionedModifier;", "view", "Landroid/view/View;", "exclusion", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "Landroidx/compose/ui/geometry/Rect;", "(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V", "getExclusion", "()Lkotlin/jvm/functions/Function1;", "rect", "Landroid/graphics/Rect;", "getRect", "()Landroid/graphics/Rect;", "setRect", "(Landroid/graphics/Rect;)V", "getView", "()Landroid/view/View;", "calcBounds", "layoutCoordinates", "findRoot", "onGloballyPositioned", "", "coordinates", "removeRect", "replaceRect", "newRect", "foundation_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nSystemGestureExclusion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SystemGestureExclusion.kt\nandroidx/compose/foundation/ExcludeFromSystemGestureModifier\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,162:1\n1182#2:163\n1161#2,2:164\n138#3:166\n728#3,2:168\n1#4:167\n*S KotlinDebug\n*F\n+ 1 SystemGestureExclusion.kt\nandroidx/compose/foundation/ExcludeFromSystemGestureModifier\n*L\n117#1:163\n117#1:164,2\n118#1:166\n123#1:168,2\n*E\n"})
/* loaded from: classes.dex */
final class ExcludeFromSystemGestureModifier implements OnGloballyPositionedModifier {
    private final Function1<LayoutCoordinates, Rect> exclusion;
    private android.graphics.Rect rect;
    private final View view;

    /* JADX WARN: Multi-variable type inference failed */
    public ExcludeFromSystemGestureModifier(View view, Function1<? super LayoutCoordinates, Rect> function1) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.view = view;
        this.exclusion = function1;
    }

    private final android.graphics.Rect calcBounds(LayoutCoordinates layoutCoordinates, Rect rect) {
        LayoutCoordinates layoutCoordinatesFindRoot = findRoot(layoutCoordinates);
        long jMo10590localPositionOfR5De75A = layoutCoordinatesFindRoot.mo10590localPositionOfR5De75A(layoutCoordinates, rect.m8980getTopLeftF1C5BW0());
        long jMo10590localPositionOfR5De75A2 = layoutCoordinatesFindRoot.mo10590localPositionOfR5De75A(layoutCoordinates, rect.m8981getTopRightF1C5BW0());
        long jMo10590localPositionOfR5De75A3 = layoutCoordinatesFindRoot.mo10590localPositionOfR5De75A(layoutCoordinates, rect.m8973getBottomLeftF1C5BW0());
        long jMo10590localPositionOfR5De75A4 = layoutCoordinatesFindRoot.mo10590localPositionOfR5De75A(layoutCoordinates, rect.m8974getBottomRightF1C5BW0());
        return new android.graphics.Rect(MathKt__MathJVMKt.roundToInt(ComparisonsKt___ComparisonsJvmKt.minOf(Offset.m8945getXimpl(jMo10590localPositionOfR5De75A), Offset.m8945getXimpl(jMo10590localPositionOfR5De75A2), Offset.m8945getXimpl(jMo10590localPositionOfR5De75A3), Offset.m8945getXimpl(jMo10590localPositionOfR5De75A4))), MathKt__MathJVMKt.roundToInt(ComparisonsKt___ComparisonsJvmKt.minOf(Offset.m8946getYimpl(jMo10590localPositionOfR5De75A), Offset.m8946getYimpl(jMo10590localPositionOfR5De75A2), Offset.m8946getYimpl(jMo10590localPositionOfR5De75A3), Offset.m8946getYimpl(jMo10590localPositionOfR5De75A4))), MathKt__MathJVMKt.roundToInt(ComparisonsKt___ComparisonsJvmKt.maxOf(Offset.m8945getXimpl(jMo10590localPositionOfR5De75A), Offset.m8945getXimpl(jMo10590localPositionOfR5De75A2), Offset.m8945getXimpl(jMo10590localPositionOfR5De75A3), Offset.m8945getXimpl(jMo10590localPositionOfR5De75A4))), MathKt__MathJVMKt.roundToInt(ComparisonsKt___ComparisonsJvmKt.maxOf(Offset.m8946getYimpl(jMo10590localPositionOfR5De75A), Offset.m8946getYimpl(jMo10590localPositionOfR5De75A2), Offset.m8946getYimpl(jMo10590localPositionOfR5De75A3), Offset.m8946getYimpl(jMo10590localPositionOfR5De75A4))));
    }

    private final LayoutCoordinates findRoot(LayoutCoordinates layoutCoordinates) {
        LayoutCoordinates parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        while (true) {
            LayoutCoordinates layoutCoordinates2 = parentLayoutCoordinates;
            LayoutCoordinates layoutCoordinates3 = layoutCoordinates;
            layoutCoordinates = layoutCoordinates2;
            if (layoutCoordinates == null) {
                return layoutCoordinates3;
            }
            parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        }
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.p006ui.Modifier
    public /* synthetic */ boolean all(Function1 function1) {
        return AbstractC1267b.m309a(this, function1);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.p006ui.Modifier
    public /* synthetic */ boolean any(Function1 function1) {
        return AbstractC1267b.m310b(this, function1);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.p006ui.Modifier
    public /* synthetic */ Object foldIn(Object obj, Function2 function2) {
        return AbstractC1267b.m311c(this, obj, function2);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.p006ui.Modifier
    public /* synthetic */ Object foldOut(Object obj, Function2 function2) {
        return AbstractC1267b.m312d(this, obj, function2);
    }

    public final Function1<LayoutCoordinates, Rect> getExclusion() {
        return this.exclusion;
    }

    public final android.graphics.Rect getRect() {
        return this.rect;
    }

    public final View getView() {
        return this.view;
    }

    @Override // androidx.compose.p006ui.layout.OnGloballyPositionedModifier
    public void onGloballyPositioned(LayoutCoordinates coordinates) {
        android.graphics.Rect rectCalcBounds;
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        Function1<LayoutCoordinates, Rect> function1 = this.exclusion;
        if (function1 == null) {
            Rect rectBoundsInRoot = LayoutCoordinatesKt.boundsInRoot(coordinates);
            rectCalcBounds = new android.graphics.Rect(MathKt__MathJVMKt.roundToInt(rectBoundsInRoot.getLeft()), MathKt__MathJVMKt.roundToInt(rectBoundsInRoot.getTop()), MathKt__MathJVMKt.roundToInt(rectBoundsInRoot.getRight()), MathKt__MathJVMKt.roundToInt(rectBoundsInRoot.getBottom()));
        } else {
            rectCalcBounds = calcBounds(coordinates, function1.invoke(coordinates));
        }
        replaceRect(rectCalcBounds);
    }

    public final void removeRect() {
        replaceRect(null);
    }

    public final void replaceRect(android.graphics.Rect newRect) {
        boolean z3 = false;
        MutableVector mutableVector = new MutableVector(new android.graphics.Rect[16], 0);
        List systemGestureExclusionRects = this.view.getSystemGestureExclusionRects();
        Intrinsics.checkNotNullExpressionValue(systemGestureExclusionRects, "view.systemGestureExclusionRects");
        mutableVector.addAll(mutableVector.getSize(), systemGestureExclusionRects);
        android.graphics.Rect rect = this.rect;
        if (rect != null) {
            mutableVector.remove(rect);
        }
        if (newRect != null && !newRect.isEmpty()) {
            z3 = true;
        }
        if (z3) {
            mutableVector.add(newRect);
        }
        this.view.setSystemGestureExclusionRects(mutableVector.asMutableList());
        this.rect = newRect;
    }

    public final void setRect(android.graphics.Rect rect) {
        this.rect = rect;
    }

    @Override // androidx.compose.p006ui.Modifier
    public /* synthetic */ Modifier then(Modifier modifier) {
        return AbstractC1266a.m307a(this, modifier);
    }
}
