package androidx.compose.foundation.layout;

import androidx.compose.p014ui.unit.Density;
import androidx.compose.p014ui.unit.LayoutDirection;
import androidx.compose.runtime.Stable;

@Stable
/* loaded from: classes.dex */
public interface WindowInsets {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    int getBottom(Density density);

    int getLeft(Density density, LayoutDirection layoutDirection);

    int getRight(Density density, LayoutDirection layoutDirection);

    int getTop(Density density);
}
