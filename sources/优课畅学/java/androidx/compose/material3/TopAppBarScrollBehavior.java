package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.p013ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.runtime.Stable;

@Stable
@ExperimentalMaterial3Api
/* loaded from: classes2.dex */
public interface TopAppBarScrollBehavior {
    DecayAnimationSpec<Float> getFlingAnimationSpec();

    NestedScrollConnection getNestedScrollConnection();

    AnimationSpec<Float> getSnapAnimationSpec();

    TopAppBarState getState();

    boolean isPinned();
}
