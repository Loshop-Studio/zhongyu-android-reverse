package androidx.compose.p013ui.node;

import androidx.compose.p013ui.focus.FocusProperties;
import androidx.compose.p013ui.internal.InlineClassHelperKt;
import kotlin.KotlinNothingValueException;

/* loaded from: classes2.dex */
final class CanFocusChecker implements FocusProperties {
    public static final CanFocusChecker INSTANCE = new CanFocusChecker();
    private static Boolean canFocusValue;

    private CanFocusChecker() {
    }

    @Override // androidx.compose.p013ui.focus.FocusProperties
    public boolean getCanFocus() {
        Boolean bool = canFocusValue;
        if (bool != null) {
            return bool.booleanValue();
        }
        InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("canFocus is read before it is written");
        throw new KotlinNothingValueException();
    }

    public final boolean isCanFocusSet() {
        return canFocusValue != null;
    }

    public final void reset() {
        canFocusValue = null;
    }

    @Override // androidx.compose.p013ui.focus.FocusProperties
    public void setCanFocus(boolean z10) {
        canFocusValue = Boolean.valueOf(z10);
    }
}
