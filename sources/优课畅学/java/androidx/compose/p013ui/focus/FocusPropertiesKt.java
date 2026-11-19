package androidx.compose.p013ui.focus;

import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.focus.FocusRequester;
import p123h7.C8736p;
import p300x7.InterfaceC10570l;

/* loaded from: classes2.dex */
public final class FocusPropertiesKt {
    public static final Modifier focusProperties(Modifier modifier, InterfaceC10570l interfaceC10570l) {
        return modifier.then(new FocusPropertiesElement(new C2670xfe8f9d59(interfaceC10570l)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC10570l toUsingEnterExitScope(final InterfaceC10570l interfaceC10570l) {
        return new InterfaceC10570l() { // from class: androidx.compose.ui.focus.FocusPropertiesKt.toUsingEnterExitScope.1
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((FocusEnterExitScope) obj);
                return C8736p.f16368a;
            }

            public final void invoke(FocusEnterExitScope focusEnterExitScope) {
                FocusRequester focusRequester = (FocusRequester) interfaceC10570l.invoke(FocusDirection.m23909boximpl(focusEnterExitScope.mo23908getRequestedFocusDirectiondhqQ8s()));
                FocusRequester.Companion companion = FocusRequester.Companion;
                if (focusRequester == companion.getCancel()) {
                    focusEnterExitScope.cancelFocusChange();
                } else if (focusRequester != companion.getDefault()) {
                    FocusRequester.m23943requestFocus3ESFkO8$default(focusRequester, 0, 1, null);
                }
            }
        };
    }
}
