package androidx.compose.foundation.text;

import androidx.compose.p014ui.focus.FocusDirection;
import androidx.compose.p014ui.focus.FocusManager;
import androidx.compose.p014ui.platform.SoftwareKeyboardController;
import androidx.compose.p014ui.text.input.ImeAction;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;

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
    public void mo27804defaultKeyboardActionKlQnJC8(int i10) {
        ImeAction.Companion companion = ImeAction.Companion;
        if (ImeAction.m33132equalsimpl0(i10, companion.m33148getNexteUduSuo())) {
            getFocusManager().mo30529moveFocus3ESFkO8(FocusDirection.Companion.m30522getNextdhqQ8s());
            return;
        }
        if (ImeAction.m33132equalsimpl0(i10, companion.m33150getPreviouseUduSuo())) {
            getFocusManager().mo30529moveFocus3ESFkO8(FocusDirection.Companion.m30523getPreviousdhqQ8s());
            return;
        }
        if (!ImeAction.m33132equalsimpl0(i10, companion.m33146getDoneeUduSuo())) {
            if (ImeAction.m33132equalsimpl0(i10, companion.m33147getGoeUduSuo()) ? true : ImeAction.m33132equalsimpl0(i10, companion.m33151getSearcheUduSuo()) ? true : ImeAction.m33132equalsimpl0(i10, companion.m33152getSendeUduSuo()) ? true : ImeAction.m33132equalsimpl0(i10, companion.m33145getDefaulteUduSuo())) {
                return;
            }
            ImeAction.m33132equalsimpl0(i10, companion.m33149getNoneeUduSuo());
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
        AbstractC9979u.m20312y("focusManager");
        return null;
    }

    public final KeyboardActions getKeyboardActions() {
        KeyboardActions keyboardActions = this.keyboardActions;
        if (keyboardActions != null) {
            return keyboardActions;
        }
        AbstractC9979u.m20312y("keyboardActions");
        return null;
    }

    /* renamed from: runAction-KlQnJC8, reason: not valid java name */
    public final void m27805runActionKlQnJC8(int i10) {
        InterfaceC9540l onSend;
        ImeAction.Companion companion = ImeAction.Companion;
        C10786q c10786q = null;
        if (ImeAction.m33132equalsimpl0(i10, companion.m33146getDoneeUduSuo())) {
            onSend = getKeyboardActions().getOnDone();
        } else if (ImeAction.m33132equalsimpl0(i10, companion.m33147getGoeUduSuo())) {
            onSend = getKeyboardActions().getOnGo();
        } else if (ImeAction.m33132equalsimpl0(i10, companion.m33148getNexteUduSuo())) {
            onSend = getKeyboardActions().getOnNext();
        } else if (ImeAction.m33132equalsimpl0(i10, companion.m33150getPreviouseUduSuo())) {
            onSend = getKeyboardActions().getOnPrevious();
        } else if (ImeAction.m33132equalsimpl0(i10, companion.m33151getSearcheUduSuo())) {
            onSend = getKeyboardActions().getOnSearch();
        } else if (ImeAction.m33132equalsimpl0(i10, companion.m33152getSendeUduSuo())) {
            onSend = getKeyboardActions().getOnSend();
        } else {
            if (!(ImeAction.m33132equalsimpl0(i10, companion.m33145getDefaulteUduSuo()) ? true : ImeAction.m33132equalsimpl0(i10, companion.m33149getNoneeUduSuo()))) {
                throw new IllegalStateException("invalid ImeAction");
            }
            onSend = null;
        }
        if (onSend != null) {
            onSend.invoke(this);
            c10786q = C10786q.f26013a;
        }
        if (c10786q == null) {
            mo27804defaultKeyboardActionKlQnJC8(i10);
        }
    }

    public final void setFocusManager(FocusManager focusManager) {
        this.focusManager = focusManager;
    }

    public final void setKeyboardActions(KeyboardActions keyboardActions) {
        this.keyboardActions = keyboardActions;
    }
}
