package androidx.compose.p014ui.contentcapture;

import androidx.compose.p014ui.ExperimentalComposeUiApi;

@ExperimentalComposeUiApi
/* loaded from: classes2.dex */
public interface ContentCaptureManager {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static boolean isEnabled = true;

        private Companion() {
        }

        @ExperimentalComposeUiApi
        public static /* synthetic */ void isEnabled$annotations() {
        }

        @ExperimentalComposeUiApi
        public final boolean isEnabled() {
            return isEnabled;
        }

        @ExperimentalComposeUiApi
        public final void setEnabled(boolean z10) {
            isEnabled = z10;
        }
    }
}
