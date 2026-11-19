package androidx.compose.p013ui;

import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 0)
@ExperimentalComposeUiApi
/* loaded from: classes2.dex */
public final class ComposeUiFlags {
    public static boolean isRemoveFocusedViewFixEnabled;
    public static boolean isViewFocusFixEnabled;
    public static final ComposeUiFlags INSTANCE = new ComposeUiFlags();
    public static boolean isRectTrackingEnabled = true;
    public static boolean NewNestedScrollFlingDispatchingEnabled = true;
    public static boolean isSemanticAutofillEnabled = true;
    public static boolean isTrackFocusEnabled = true;
    public static final int $stable = 8;

    private ComposeUiFlags() {
    }

    public static /* synthetic */ void getNewNestedScrollFlingDispatchingEnabled$annotations() {
    }

    public static /* synthetic */ void isRectTrackingEnabled$annotations() {
    }

    public static /* synthetic */ void isRemoveFocusedViewFixEnabled$annotations() {
    }

    public static /* synthetic */ void isSemanticAutofillEnabled$annotations() {
    }

    public static /* synthetic */ void isTrackFocusEnabled$annotations() {
    }

    public static /* synthetic */ void isViewFocusFixEnabled$annotations() {
    }
}
