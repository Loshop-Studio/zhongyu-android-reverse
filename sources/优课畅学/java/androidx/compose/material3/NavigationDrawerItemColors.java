package androidx.compose.material3;

import androidx.compose.p013ui.graphics.Color;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;

@Stable
/* loaded from: classes2.dex */
public interface NavigationDrawerItemColors {
    @Composable
    State<Color> badgeColor(boolean z10, Composer composer, int i10);

    @Composable
    State<Color> containerColor(boolean z10, Composer composer, int i10);

    @Composable
    State<Color> iconColor(boolean z10, Composer composer, int i10);

    @Composable
    State<Color> textColor(boolean z10, Composer composer, int i10);
}
