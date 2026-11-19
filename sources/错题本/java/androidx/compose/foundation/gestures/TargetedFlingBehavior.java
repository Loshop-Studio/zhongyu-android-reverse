package androidx.compose.foundation.gestures;

import androidx.compose.runtime.Stable;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6471c;

@Stable
@Metadata(m5109d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J0\u0010\b\u001a\u00020\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005H¦@¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\b\u001a\u00020\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0096@¢\u0006\u0004\b\b\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, m5110d2 = {"Landroidx/compose/foundation/gestures/TargetedFlingBehavior;", "Landroidx/compose/foundation/gestures/FlingBehavior;", "Landroidx/compose/foundation/gestures/ScrollScope;", "", "initialVelocity", "Lkotlin/Function1;", "Ld6/s;", "onRemainingDistanceUpdated", "performFling", "(Landroidx/compose/foundation/gestures/ScrollScope;FLr6/c;Lh6/c;)Ljava/lang/Object;", "(Landroidx/compose/foundation/gestures/ScrollScope;FLh6/c;)Ljava/lang/Object;", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public interface TargetedFlingBehavior extends FlingBehavior {
    static /* synthetic */ Object performFling$suspendImpl(TargetedFlingBehavior targetedFlingBehavior, ScrollScope scrollScope, float f, InterfaceC5631c<? super Float> interfaceC5631c) {
        return targetedFlingBehavior.performFling(scrollScope, f, TargetedFlingBehaviorKt.NoOnReport, interfaceC5631c);
    }

    @Override // androidx.compose.foundation.gestures.FlingBehavior
    @Nullable
    default Object performFling(@NotNull ScrollScope scrollScope, float f, @NotNull InterfaceC5631c<? super Float> interfaceC5631c) {
        return performFling$suspendImpl(this, scrollScope, f, interfaceC5631c);
    }

    @Nullable
    Object performFling(@NotNull ScrollScope scrollScope, float f, @NotNull InterfaceC6471c interfaceC6471c, @NotNull InterfaceC5631c<? super Float> interfaceC5631c);
}
