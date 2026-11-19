package androidx.compose.foundation.text.input.internal;

import androidx.compose.runtime.Stable;

@Stable
/* loaded from: classes.dex */
public interface CodepointTransformation {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    int transform(int i10, int i11);
}
