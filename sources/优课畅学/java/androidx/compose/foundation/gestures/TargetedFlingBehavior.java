package androidx.compose.foundation.gestures;

import androidx.compose.runtime.Stable;
import p179m7.InterfaceC9324c;
import p300x7.InterfaceC10570l;

@Stable
/* loaded from: classes.dex */
public interface TargetedFlingBehavior extends FlingBehavior {
    static /* synthetic */ Object performFling$suspendImpl(TargetedFlingBehavior targetedFlingBehavior, ScrollScope scrollScope, float f10, InterfaceC9324c<? super Float> interfaceC9324c) {
        return targetedFlingBehavior.performFling(scrollScope, f10, TargetedFlingBehaviorKt.NoOnReport, interfaceC9324c);
    }

    @Override // androidx.compose.foundation.gestures.FlingBehavior
    default Object performFling(ScrollScope scrollScope, float f10, InterfaceC9324c<? super Float> interfaceC9324c) {
        return performFling$suspendImpl(this, scrollScope, f10, interfaceC9324c);
    }

    Object performFling(ScrollScope scrollScope, float f10, InterfaceC10570l interfaceC10570l, InterfaceC9324c<? super Float> interfaceC9324c);
}
