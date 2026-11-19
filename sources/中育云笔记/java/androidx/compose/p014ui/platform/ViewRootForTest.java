package androidx.compose.p014ui.platform;

import android.view.View;
import androidx.annotation.VisibleForTesting;
import androidx.compose.p014ui.node.RootForTest;
import p181hd.InterfaceC9540l;

@VisibleForTesting
/* loaded from: classes2.dex */
public interface ViewRootForTest extends RootForTest {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static InterfaceC9540l onViewCreatedCallback;

        private Companion() {
        }

        @VisibleForTesting
        public static /* synthetic */ void getOnViewCreatedCallback$annotations() {
        }

        public final InterfaceC9540l getOnViewCreatedCallback() {
            return onViewCreatedCallback;
        }

        public final void setOnViewCreatedCallback(InterfaceC9540l interfaceC9540l) {
            onViewCreatedCallback = interfaceC9540l;
        }
    }

    boolean getHasPendingMeasureOrLayout();

    View getView();

    void invalidateDescendants();

    boolean isLifecycleInResumedState();
}
