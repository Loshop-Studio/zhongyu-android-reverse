package androidx.compose.p013ui.platform;

import android.view.View;
import androidx.annotation.VisibleForTesting;
import androidx.compose.p013ui.node.RootForTest;
import p300x7.InterfaceC10570l;

@VisibleForTesting
/* loaded from: classes2.dex */
public interface ViewRootForTest extends RootForTest {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static InterfaceC10570l onViewCreatedCallback;

        private Companion() {
        }

        @VisibleForTesting
        public static /* synthetic */ void getOnViewCreatedCallback$annotations() {
        }

        public final InterfaceC10570l getOnViewCreatedCallback() {
            return onViewCreatedCallback;
        }

        public final void setOnViewCreatedCallback(InterfaceC10570l interfaceC10570l) {
            onViewCreatedCallback = interfaceC10570l;
        }
    }

    boolean getHasPendingMeasureOrLayout();

    View getView();

    void invalidateDescendants();

    boolean isLifecycleInResumedState();
}
