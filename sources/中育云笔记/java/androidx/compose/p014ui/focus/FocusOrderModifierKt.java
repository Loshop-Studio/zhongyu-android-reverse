package androidx.compose.p014ui.focus;

import androidx.compose.p014ui.Modifier;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;
import p309qc.InterfaceC10770a;

/* loaded from: classes2.dex */
public final class FocusOrderModifierKt {
    @InterfaceC10770a
    public static final Modifier focusOrder(Modifier modifier, InterfaceC9540l interfaceC9540l) {
        final FocusOrderToProperties focusOrderToProperties = new FocusOrderToProperties(interfaceC9540l);
        return FocusPropertiesKt.focusProperties(modifier, new InterfaceC9540l() { // from class: androidx.compose.ui.focus.FocusOrderModifierKt.focusOrder.1
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((FocusProperties) obj);
                return C10786q.f26013a;
            }

            public final void invoke(FocusProperties focusProperties) {
                focusOrderToProperties.apply(focusProperties);
            }
        });
    }

    @InterfaceC10770a
    public static final Modifier focusOrder(Modifier modifier, FocusRequester focusRequester) {
        return FocusRequesterModifierKt.focusRequester(modifier, focusRequester);
    }

    @InterfaceC10770a
    public static final Modifier focusOrder(Modifier modifier, FocusRequester focusRequester, InterfaceC9540l interfaceC9540l) {
        final FocusOrderToProperties focusOrderToProperties = new FocusOrderToProperties(interfaceC9540l);
        return FocusPropertiesKt.focusProperties(FocusRequesterModifierKt.focusRequester(modifier, focusRequester), new InterfaceC9540l() { // from class: androidx.compose.ui.focus.FocusOrderModifierKt.focusOrder.2
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((FocusProperties) obj);
                return C10786q.f26013a;
            }

            public final void invoke(FocusProperties focusProperties) {
                focusOrderToProperties.apply(focusProperties);
            }
        });
    }
}
