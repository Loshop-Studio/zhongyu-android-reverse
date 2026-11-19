package androidx.compose.p012ui;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.JvmField;

@StabilityInferred(parameters = 0)
@ExperimentalComposeUiApi
@Metadata(m13412d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0018\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0002R\u0018\u0010\u0006\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u0007\u0010\u0002R\u0018\u0010\b\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\b\n\u0000\u0012\u0004\b\t\u0010\u0002R\u0018\u0010\n\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u000b\u0010\u0002R\u0018\u0010\f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\b\n\u0000\u0012\u0004\b\r\u0010\u0002R\u0018\u0010\u000e\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u000f\u0010\u0002¨\u0006\u0010"}, m13413d2 = {"Landroidx/compose/ui/ComposeUiFlags;", "", "()V", "NewNestedScrollFlingDispatchingEnabled", "", "getNewNestedScrollFlingDispatchingEnabled$annotations", "isRectTrackingEnabled", "isRectTrackingEnabled$annotations", "isRemoveFocusedViewFixEnabled", "isRemoveFocusedViewFixEnabled$annotations", "isSemanticAutofillEnabled", "isSemanticAutofillEnabled$annotations", "isTrackFocusEnabled", "isTrackFocusEnabled$annotations", "isViewFocusFixEnabled", "isViewFocusFixEnabled$annotations", "ui_release"}, m13414k = 1, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class ComposeUiFlags {

    @JvmField
    public static boolean isRemoveFocusedViewFixEnabled;

    @JvmField
    public static boolean isViewFocusFixEnabled;
    public static final ComposeUiFlags INSTANCE = new ComposeUiFlags();

    @JvmField
    public static boolean isRectTrackingEnabled = true;

    @JvmField
    public static boolean NewNestedScrollFlingDispatchingEnabled = true;

    @JvmField
    public static boolean isSemanticAutofillEnabled = true;

    @JvmField
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
