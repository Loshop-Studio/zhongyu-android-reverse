package androidx.compose.foundation.text;

import androidx.compose.p013ui.focus.FocusDirection;
import androidx.compose.p013ui.focus.FocusManager;
import androidx.compose.p013ui.platform.SoftwareKeyboardController;
import androidx.compose.p013ui.text.input.ImeAction;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p300x7.InterfaceC10570l;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class KeyboardActionRunner implements KeyboardActionScope {
    public static final int $stable = 8;
    public FocusManager focusManager;
    public KeyboardActions keyboardActions;
    private final SoftwareKeyboardController keyboardController;

    public KeyboardActionRunner(SoftwareKeyboardController softwareKeyboardController) {
        this.keyboardController = softwareKeyboardController;
    }

    @Override // androidx.compose.foundation.text.KeyboardActionScope
    /* renamed from: defaultKeyboardAction-KlQnJC8, reason: not valid java name */
    public void mo21202defaultKeyboardActionKlQnJC8(int i10) {
        ImeAction.Companion companion = ImeAction.Companion;
        if (ImeAction.m26530equalsimpl0(i10, companion.m26546getNexteUduSuo())) {
            getFocusManager().mo23927moveFocus3ESFkO8(FocusDirection.Companion.m23920getNextdhqQ8s());
            return;
        }
        if (ImeAction.m26530equalsimpl0(i10, companion.m26548getPreviouseUduSuo())) {
            getFocusManager().mo23927moveFocus3ESFkO8(FocusDirection.Companion.m23921getPreviousdhqQ8s());
            return;
        }
        if (!ImeAction.m26530equalsimpl0(i10, companion.m26544getDoneeUduSuo())) {
            if (ImeAction.m26530equalsimpl0(i10, companion.m26545getGoeUduSuo()) ? true : ImeAction.m26530equalsimpl0(i10, companion.m26549getSearcheUduSuo()) ? true : ImeAction.m26530equalsimpl0(i10, companion.m26550getSendeUduSuo()) ? true : ImeAction.m26530equalsimpl0(i10, companion.m26543getDefaulteUduSuo())) {
                return;
            }
            ImeAction.m26530equalsimpl0(i10, companion.m26547getNoneeUduSuo());
        } else {
            SoftwareKeyboardController softwareKeyboardController = this.keyboardController;
            if (softwareKeyboardController != null) {
                softwareKeyboardController.hide();
            }
        }
    }

    public final FocusManager getFocusManager() {
        FocusManager focusManager = this.focusManager;
        if (focusManager != null) {
            return focusManager;
        }
        AbstractC9133u.m16151y("focusManager");
        return null;
    }

    public final KeyboardActions getKeyboardActions() {
        KeyboardActions keyboardActions = this.keyboardActions;
        if (keyboardActions != null) {
            return keyboardActions;
        }
        AbstractC9133u.m16151y("keyboardActions");
        return null;
    }

    /* renamed from: runAction-KlQnJC8, reason: not valid java name */
    public final void m21203runActionKlQnJC8(int i10) {
        InterfaceC10570l onSend;
        ImeAction.Companion companion = ImeAction.Companion;
        C8736p c8736p = null;
        if (ImeAction.m26530equalsimpl0(i10, companion.m26544getDoneeUduSuo())) {
            onSend = getKeyboardActions().getOnDone();
        } else if (ImeAction.m26530equalsimpl0(i10, companion.m26545getGoeUduSuo())) {
            onSend = getKeyboardActions().getOnGo();
        } else if (ImeAction.m26530equalsimpl0(i10, companion.m26546getNexteUduSuo())) {
            onSend = getKeyboardActions().getOnNext();
        } else if (ImeAction.m26530equalsimpl0(i10, companion.m26548getPreviouseUduSuo())) {
            onSend = getKeyboardActions().getOnPrevious();
        } else if (ImeAction.m26530equalsimpl0(i10, companion.m26549getSearcheUduSuo())) {
            onSend = getKeyboardActions().getOnSearch();
        } else if (ImeAction.m26530equalsimpl0(i10, companion.m26550getSendeUduSuo())) {
            onSend = getKeyboardActions().getOnSend();
        } else {
            if (!(ImeAction.m26530equalsimpl0(i10, companion.m26543getDefaulteUduSuo()) ? true : ImeAction.m26530equalsimpl0(i10, companion.m26547getNoneeUduSuo()))) {
                throw new IllegalStateException("invalid ImeAction");
            }
            onSend = null;
        }
        if (onSend != null) {
            onSend.invoke(this);
            c8736p = C8736p.f16368a;
        }
        if (c8736p == null) {
            mo21202defaultKeyboardActionKlQnJC8(i10);
        }
    }

    public final void setFocusManager(FocusManager focusManager) {
        this.focusManager = focusManager;
    }

    public final void setKeyboardActions(KeyboardActions keyboardActions) {
        this.keyboardActions = keyboardActions;
    }
}
