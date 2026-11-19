package androidx.compose.p013ui.focus;

import androidx.compose.p013ui.Modifier;
import p123h7.C8736p;
import p123h7.InterfaceC8721a;
import p300x7.InterfaceC10570l;

/* loaded from: classes2.dex */
public final class FocusOrderModifierKt {
    @InterfaceC8721a
    public static final Modifier focusOrder(Modifier modifier, InterfaceC10570l interfaceC10570l) {
        final FocusOrderToProperties focusOrderToProperties = new FocusOrderToProperties(interfaceC10570l);
        return FocusPropertiesKt.focusProperties(modifier, new InterfaceC10570l() { // from class: androidx.compose.ui.focus.FocusOrderModifierKt.focusOrder.1
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((FocusProperties) obj);
                return C8736p.f16368a;
            }

            public final void invoke(FocusProperties focusProperties) {
                focusOrderToProperties.apply(focusProperties);
            }
        });
    }

    @InterfaceC8721a
    public static final Modifier focusOrder(Modifier modifier, FocusRequester focusRequester) {
        return FocusRequesterModifierKt.focusRequester(modifier, focusRequester);
    }

    @InterfaceC8721a
    public static final Modifier focusOrder(Modifier modifier, FocusRequester focusRequester, InterfaceC10570l interfaceC10570l) {
        final FocusOrderToProperties focusOrderToProperties = new FocusOrderToProperties(interfaceC10570l);
        return FocusPropertiesKt.focusProperties(FocusRequesterModifierKt.focusRequester(modifier, focusRequester), new InterfaceC10570l() { // from class: androidx.compose.ui.focus.FocusOrderModifierKt.focusOrder.2
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((FocusProperties) obj);
                return C8736p.f16368a;
            }

            public final void invoke(FocusProperties focusProperties) {
                focusOrderToProperties.apply(focusProperties);
            }
        });
    }
}
