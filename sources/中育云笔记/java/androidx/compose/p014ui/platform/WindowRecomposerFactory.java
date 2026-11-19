package androidx.compose.p014ui.platform;

import android.view.View;
import androidx.compose.p014ui.InternalComposeUiApi;
import androidx.compose.p014ui.platform.WindowRecomposerFactory;
import androidx.compose.runtime.Recomposer;

@InternalComposeUiApi
/* loaded from: classes2.dex */
public interface WindowRecomposerFactory {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final WindowRecomposerFactory LifecycleAware = new WindowRecomposerFactory() { // from class: androidx.compose.ui.platform.e1
            @Override // androidx.compose.p014ui.platform.WindowRecomposerFactory
            public final Recomposer createRecomposer(View view) {
                return WindowRecomposerFactory.Companion.LifecycleAware$lambda$0(view);
            }
        };

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Recomposer LifecycleAware$lambda$0(View view) {
            return WindowRecomposer_androidKt.createLifecycleAwareWindowRecomposer$default(view, null, null, 3, null);
        }

        public final WindowRecomposerFactory getLifecycleAware() {
            return LifecycleAware;
        }
    }

    Recomposer createRecomposer(View view);
}
