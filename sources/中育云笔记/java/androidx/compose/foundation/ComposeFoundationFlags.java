package androidx.compose.foundation;

import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 0)
@ExperimentalFoundationApi
/* loaded from: classes.dex */
public final class ComposeFoundationFlags {
    public static final ComposeFoundationFlags INSTANCE = new ComposeFoundationFlags();
    public static boolean NewNestedFlingPropagationEnabled = true;
    public static boolean DragGesturePickUpEnabled = true;
    public static boolean isDetectTapGesturesImmediateCoroutineDispatchEnabled = true;
    public static final int $stable = 8;

    private ComposeFoundationFlags() {
    }

    public static /* synthetic */ void getDragGesturePickUpEnabled$annotations() {
    }

    public static /* synthetic */ void getNewNestedFlingPropagationEnabled$annotations() {
    }

    public static /* synthetic */ void isDetectTapGesturesImmediateCoroutineDispatchEnabled$annotations() {
    }
}
