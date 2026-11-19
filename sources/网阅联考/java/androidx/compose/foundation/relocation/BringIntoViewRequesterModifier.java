package androidx.compose.foundation.relocation;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.p006ui.geometry.Rect;
import androidx.compose.p006ui.geometry.SizeKt;
import androidx.compose.p006ui.layout.LayoutCoordinates;
import androidx.compose.p006ui.unit.IntSizeKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@ExperimentalFoundationApi
@Metadata(m5174d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001b\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, m5175d2 = {"Landroidx/compose/foundation/relocation/BringIntoViewRequesterModifier;", "Landroidx/compose/foundation/relocation/BringIntoViewChildModifier;", "defaultParent", "Landroidx/compose/foundation/relocation/BringIntoViewParent;", "(Landroidx/compose/foundation/relocation/BringIntoViewParent;)V", "bringIntoView", "", "rect", "Landroidx/compose/ui/geometry/Rect;", "(Landroidx/compose/ui/geometry/Rect;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "foundation_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
final class BringIntoViewRequesterModifier extends BringIntoViewChildModifier {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BringIntoViewRequesterModifier(BringIntoViewParent defaultParent) {
        super(defaultParent);
        Intrinsics.checkNotNullParameter(defaultParent, "defaultParent");
    }

    public final Object bringIntoView(final Rect rect, Continuation<? super Unit> continuation) {
        BringIntoViewParent parent = getParent();
        LayoutCoordinates layoutCoordinates = getLayoutCoordinates();
        if (layoutCoordinates == null) {
            return Unit.INSTANCE;
        }
        Object objBringChildIntoView = parent.bringChildIntoView(layoutCoordinates, new Function0<Rect>() { // from class: androidx.compose.foundation.relocation.BringIntoViewRequesterModifier.bringIntoView.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Rect invoke() {
                Rect rect2 = rect;
                if (rect2 != null) {
                    return rect2;
                }
                LayoutCoordinates layoutCoordinates2 = this.getLayoutCoordinates();
                if (layoutCoordinates2 != null) {
                    return SizeKt.m9035toRectuvyYCjk(IntSizeKt.m11695toSizeozmzZPI(layoutCoordinates2.mo10589getSizeYbymL2g()));
                }
                return null;
            }
        }, continuation);
        return objBringChildIntoView == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objBringChildIntoView : Unit.INSTANCE;
    }
}
