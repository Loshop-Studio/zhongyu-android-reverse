package androidx.compose.p012ui.focus;

import androidx.compose.p012ui.ExperimentalComposeUiApi;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;

@Metadata(m13412d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001J\b\u0010\u0006\u001a\u00020\u0007H\u0017J\b\u0010\b\u001a\u00020\u0007H&R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0001\tø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, m13413d2 = {"Landroidx/compose/ui/focus/FocusEnterExitScope;", "", "requestedFocusDirection", "Landroidx/compose/ui/focus/FocusDirection;", "getRequestedFocusDirection-dhqQ-8s", "()I", "cancelFocus", "", "cancelFocusChange", "Landroidx/compose/ui/focus/CancelIndicatingFocusBoundaryScope;", "ui_release"}, m13414k = 1, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public interface FocusEnterExitScope {
    @Deprecated(message = "Use cancelFocusChange instead", replaceWith = @ReplaceWith(expression = "cancelFocusChange", imports = {}))
    @ExperimentalComposeUiApi
    default void cancelFocus() {
        cancelFocusChange();
    }

    void cancelFocusChange();

    /* renamed from: getRequestedFocusDirection-dhqQ-8s */
    int mo21048getRequestedFocusDirectiondhqQ8s();
}
