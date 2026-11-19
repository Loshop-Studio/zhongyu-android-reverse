package androidx.compose.p014ui.focus;

import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.focus.FocusRequester;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;

/* loaded from: classes2.dex */
public final class FocusPropertiesKt {
    public static final Modifier focusProperties(Modifier modifier, InterfaceC9540l interfaceC9540l) {
        return modifier.then(new FocusPropertiesElement(new C2700xfe8f9d59(interfaceC9540l)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC9540l toUsingEnterExitScope(final InterfaceC9540l interfaceC9540l) {
        return new InterfaceC9540l() { // from class: androidx.compose.ui.focus.FocusPropertiesKt.toUsingEnterExitScope.1
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((FocusEnterExitScope) obj);
                return C10786q.f26013a;
            }

            public final void invoke(FocusEnterExitScope focusEnterExitScope) {
                FocusRequester focusRequester = (FocusRequester) interfaceC9540l.invoke(FocusDirection.m30511boximpl(focusEnterExitScope.mo30510getRequestedFocusDirectiondhqQ8s()));
                FocusRequester.Companion companion = FocusRequester.Companion;
                if (focusRequester == companion.getCancel()) {
                    focusEnterExitScope.cancelFocusChange();
                } else if (focusRequester != companion.getDefault()) {
                    FocusRequester.m30545requestFocus3ESFkO8$default(focusRequester, 0, 1, null);
                }
            }
        };
    }
}
