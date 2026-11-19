package androidx.compose.p014ui.focus;

import androidx.compose.p014ui.ExperimentalComposeUiApi;
import p309qc.InterfaceC10770a;

/* loaded from: classes2.dex */
public interface FocusEnterExitScope {
    @InterfaceC10770a
    @ExperimentalComposeUiApi
    default void cancelFocus() {
        cancelFocusChange();
    }

    void cancelFocusChange();

    /* renamed from: getRequestedFocusDirection-dhqQ-8s */
    int mo30510getRequestedFocusDirectiondhqQ8s();
}
