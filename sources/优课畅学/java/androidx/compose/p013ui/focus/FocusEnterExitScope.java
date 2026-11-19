package androidx.compose.p013ui.focus;

import androidx.compose.p013ui.ExperimentalComposeUiApi;
import p123h7.InterfaceC8721a;

/* loaded from: classes2.dex */
public interface FocusEnterExitScope {
    @InterfaceC8721a
    @ExperimentalComposeUiApi
    default void cancelFocus() {
        cancelFocusChange();
    }

    void cancelFocusChange();

    /* renamed from: getRequestedFocusDirection-dhqQ-8s */
    int mo23908getRequestedFocusDirectiondhqQ8s();
}
