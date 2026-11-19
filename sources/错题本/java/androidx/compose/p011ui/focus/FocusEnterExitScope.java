package androidx.compose.p011ui.focus;

import androidx.compose.p011ui.ExperimentalComposeUiApi;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;

@Metadata(m5109d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0005\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00068&X¦\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0001\nø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, m5110d2 = {"Landroidx/compose/ui/focus/FocusEnterExitScope;", "", "Ld6/s;", "cancelFocusChange", "()V", "cancelFocus", "Landroidx/compose/ui/focus/FocusDirection;", "getRequestedFocusDirection-dhqQ-8s", "()I", "requestedFocusDirection", "Landroidx/compose/ui/focus/CancelIndicatingFocusBoundaryScope;", "ui_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public interface FocusEnterExitScope {
    @Deprecated(message = "Use cancelFocusChange instead", replaceWith = @ReplaceWith(expression = "cancelFocusChange", imports = {}))
    @ExperimentalComposeUiApi
    default void cancelFocus() {
        cancelFocusChange();
    }

    void cancelFocusChange();

    /* renamed from: getRequestedFocusDirection-dhqQ-8s */
    int mo10314getRequestedFocusDirectiondhqQ8s();
}
