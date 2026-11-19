package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import vc.InterfaceC11588c;

/* loaded from: classes.dex */
public interface ScrollableState {

    public static final class DefaultImpls {
        @Deprecated
        public static boolean getCanScrollBackward(ScrollableState scrollableState) {
            return ScrollableState.super.getCanScrollBackward();
        }

        @Deprecated
        public static boolean getCanScrollForward(ScrollableState scrollableState) {
            return ScrollableState.super.getCanScrollForward();
        }

        @Deprecated
        public static boolean getLastScrolledBackward(ScrollableState scrollableState) {
            return ScrollableState.super.getLastScrolledBackward();
        }

        @Deprecated
        public static boolean getLastScrolledForward(ScrollableState scrollableState) {
            return ScrollableState.super.getLastScrolledForward();
        }
    }

    static /* synthetic */ Object scroll$default(ScrollableState scrollableState, MutatePriority mutatePriority, InterfaceC9544p interfaceC9544p, InterfaceC11588c interfaceC11588c, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scroll");
        }
        if ((i10 & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return scrollableState.scroll(mutatePriority, interfaceC9544p, interfaceC11588c);
    }

    float dispatchRawDelta(float f10);

    default boolean getCanScrollBackward() {
        return true;
    }

    default boolean getCanScrollForward() {
        return true;
    }

    default boolean getLastScrolledBackward() {
        return false;
    }

    default boolean getLastScrolledForward() {
        return false;
    }

    boolean isScrollInProgress();

    Object scroll(MutatePriority mutatePriority, InterfaceC9544p interfaceC9544p, InterfaceC11588c<? super C10786q> interfaceC11588c);
}
