package androidx.compose.foundation.gestures;

import androidx.compose.runtime.Stable;
import p181hd.InterfaceC9540l;
import vc.InterfaceC11588c;

@Stable
/* loaded from: classes.dex */
public interface TargetedFlingBehavior extends FlingBehavior {
    static /* synthetic */ Object performFling$suspendImpl(TargetedFlingBehavior targetedFlingBehavior, ScrollScope scrollScope, float f10, InterfaceC11588c<? super Float> interfaceC11588c) {
        return targetedFlingBehavior.performFling(scrollScope, f10, TargetedFlingBehaviorKt.NoOnReport, interfaceC11588c);
    }

    Object performFling(ScrollScope scrollScope, float f10, InterfaceC9540l interfaceC9540l, InterfaceC11588c<? super Float> interfaceC11588c);

    @Override // androidx.compose.foundation.gestures.FlingBehavior
    default Object performFling(ScrollScope scrollScope, float f10, InterfaceC11588c<? super Float> interfaceC11588c) {
        return performFling$suspendImpl(this, scrollScope, f10, interfaceC11588c);
    }
}
