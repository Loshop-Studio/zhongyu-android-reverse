package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 0)
@ExperimentalComposeApi
/* loaded from: classes2.dex */
public final class ComposeRuntimeFlags {
    public static final ComposeRuntimeFlags INSTANCE = new ComposeRuntimeFlags();
    public static boolean isMovingNestedMovableContentEnabled = true;
    public static final int $stable = 8;

    private ComposeRuntimeFlags() {
    }

    public static /* synthetic */ void isMovingNestedMovableContentEnabled$annotations() {
    }
}
