package androidx.compose.foundation.text;

import androidx.compose.p011ui.focus.FocusDirection;
import androidx.compose.p011ui.focus.FocusManager;
import androidx.compose.p011ui.platform.SoftwareKeyboardController;
import androidx.compose.p011ui.text.input.ImeAction;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p152r6.InterfaceC6471c;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000¢\u0006\u0004\b\f\u0010\nR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR\"\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0017\u001a\u00020\u00168\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001d"}, m5110d2 = {"Landroidx/compose/foundation/text/KeyboardActionRunner;", "Landroidx/compose/foundation/text/KeyboardActionScope;", "Landroidx/compose/ui/platform/SoftwareKeyboardController;", "keyboardController", "<init>", "(Landroidx/compose/ui/platform/SoftwareKeyboardController;)V", "Landroidx/compose/ui/text/input/ImeAction;", "imeAction", "Ld6/s;", "runAction-KlQnJC8", "(I)V", "runAction", "defaultKeyboardAction-KlQnJC8", "defaultKeyboardAction", "Landroidx/compose/ui/platform/SoftwareKeyboardController;", "Landroidx/compose/foundation/text/KeyboardActions;", "keyboardActions", "Landroidx/compose/foundation/text/KeyboardActions;", "getKeyboardActions", "()Landroidx/compose/foundation/text/KeyboardActions;", "setKeyboardActions", "(Landroidx/compose/foundation/text/KeyboardActions;)V", "Landroidx/compose/ui/focus/FocusManager;", "focusManager", "Landroidx/compose/ui/focus/FocusManager;", "getFocusManager", "()Landroidx/compose/ui/focus/FocusManager;", "setFocusManager", "(Landroidx/compose/ui/focus/FocusManager;)V", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class KeyboardActionRunner implements KeyboardActionScope {
    public static final int $stable = 8;
    public FocusManager focusManager;
    public KeyboardActions keyboardActions;

    @Nullable
    private final SoftwareKeyboardController keyboardController;

    public KeyboardActionRunner(@Nullable SoftwareKeyboardController softwareKeyboardController) {
        this.keyboardController = softwareKeyboardController;
    }

    @Override // androidx.compose.foundation.text.KeyboardActionScope
    /* renamed from: defaultKeyboardAction-KlQnJC8, reason: not valid java name */
    public void mo7608defaultKeyboardActionKlQnJC8(int imeAction) {
        ImeAction.Companion companion = ImeAction.INSTANCE;
        if (ImeAction.m12936equalsimpl0(imeAction, companion.m12952getNexteUduSuo())) {
            getFocusManager().mo10333moveFocus3ESFkO8(FocusDirection.INSTANCE.m10326getNextdhqQ8s());
            return;
        }
        if (ImeAction.m12936equalsimpl0(imeAction, companion.m12954getPreviouseUduSuo())) {
            getFocusManager().mo10333moveFocus3ESFkO8(FocusDirection.INSTANCE.m10327getPreviousdhqQ8s());
            return;
        }
        if (!ImeAction.m12936equalsimpl0(imeAction, companion.m12950getDoneeUduSuo())) {
            if (ImeAction.m12936equalsimpl0(imeAction, companion.m12951getGoeUduSuo()) ? true : ImeAction.m12936equalsimpl0(imeAction, companion.m12955getSearcheUduSuo()) ? true : ImeAction.m12936equalsimpl0(imeAction, companion.m12956getSendeUduSuo()) ? true : ImeAction.m12936equalsimpl0(imeAction, companion.m12949getDefaulteUduSuo())) {
                return;
            }
            ImeAction.m12936equalsimpl0(imeAction, companion.m12953getNoneeUduSuo());
        } else {
            SoftwareKeyboardController softwareKeyboardController = this.keyboardController;
            if (softwareKeyboardController != null) {
                softwareKeyboardController.hide();
            }
        }
    }

    @NotNull
    public final FocusManager getFocusManager() {
        FocusManager focusManager = this.focusManager;
        if (focusManager != null) {
            return focusManager;
        }
        AbstractC5830k.m5339p("focusManager");
        throw null;
    }

    @NotNull
    public final KeyboardActions getKeyboardActions() {
        KeyboardActions keyboardActions = this.keyboardActions;
        if (keyboardActions != null) {
            return keyboardActions;
        }
        AbstractC5830k.m5339p("keyboardActions");
        throw null;
    }

    /* renamed from: runAction-KlQnJC8, reason: not valid java name */
    public final void m7609runActionKlQnJC8(int imeAction) {
        InterfaceC6471c onSend;
        ImeAction.Companion companion = ImeAction.INSTANCE;
        C5443s c5443s = null;
        if (ImeAction.m12936equalsimpl0(imeAction, companion.m12950getDoneeUduSuo())) {
            onSend = getKeyboardActions().getOnDone();
        } else if (ImeAction.m12936equalsimpl0(imeAction, companion.m12951getGoeUduSuo())) {
            onSend = getKeyboardActions().getOnGo();
        } else if (ImeAction.m12936equalsimpl0(imeAction, companion.m12952getNexteUduSuo())) {
            onSend = getKeyboardActions().getOnNext();
        } else if (ImeAction.m12936equalsimpl0(imeAction, companion.m12954getPreviouseUduSuo())) {
            onSend = getKeyboardActions().getOnPrevious();
        } else if (ImeAction.m12936equalsimpl0(imeAction, companion.m12955getSearcheUduSuo())) {
            onSend = getKeyboardActions().getOnSearch();
        } else if (ImeAction.m12936equalsimpl0(imeAction, companion.m12956getSendeUduSuo())) {
            onSend = getKeyboardActions().getOnSend();
        } else {
            if (!(ImeAction.m12936equalsimpl0(imeAction, companion.m12949getDefaulteUduSuo()) ? true : ImeAction.m12936equalsimpl0(imeAction, companion.m12953getNoneeUduSuo()))) {
                throw new IllegalStateException("invalid ImeAction");
            }
            onSend = null;
        }
        if (onSend != null) {
            onSend.invoke(this);
            c5443s = C5443s.f8405a;
        }
        if (c5443s == null) {
            mo7608defaultKeyboardActionKlQnJC8(imeAction);
        }
    }

    public final void setFocusManager(@NotNull FocusManager focusManager) {
        this.focusManager = focusManager;
    }

    public final void setKeyboardActions(@NotNull KeyboardActions keyboardActions) {
        this.keyboardActions = keyboardActions;
    }
}
