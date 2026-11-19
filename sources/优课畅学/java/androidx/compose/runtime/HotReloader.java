package androidx.compose.runtime;

import java.util.List;
import kotlin.jvm.internal.AbstractC9126n;

/* loaded from: classes2.dex */
final class HotReloader {
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        private final void loadStateAndCompose(Object obj) {
            Recomposer.Companion.loadStateAndComposeForHotReload$runtime_release(obj);
        }

        private final Object saveStateAndDispose(Object obj) {
            return Recomposer.Companion.saveStateAndDisposeForHotReload$runtime_release();
        }

        public final void clearErrors$runtime_release() {
            Recomposer.Companion.clearErrors$runtime_release();
        }

        public final List<RecomposerErrorInfo> getCurrentErrors$runtime_release() {
            return Recomposer.Companion.getCurrentErrors$runtime_release();
        }

        public final void invalidateGroupsWithKey$runtime_release(int i10) {
            Recomposer.Companion.invalidateGroupsWithKey$runtime_release(i10);
        }

        public final void simulateHotReload$runtime_release(Object obj) {
            loadStateAndCompose(saveStateAndDispose(obj));
        }

        private Companion() {
        }
    }
}
