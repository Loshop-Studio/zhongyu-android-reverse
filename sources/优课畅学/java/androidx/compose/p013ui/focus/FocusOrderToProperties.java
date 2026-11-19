package androidx.compose.p013ui.focus;

import androidx.compose.runtime.internal.StabilityInferred;
import p300x7.InterfaceC10570l;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class FocusOrderToProperties implements FocusPropertiesScope {
    public static final int $stable = 0;
    private final InterfaceC10570l focusOrderReceiver;

    public FocusOrderToProperties(InterfaceC10570l interfaceC10570l) {
        this.focusOrderReceiver = interfaceC10570l;
    }

    @Override // androidx.compose.p013ui.focus.FocusPropertiesScope
    public void apply(FocusProperties focusProperties) {
        this.focusOrderReceiver.invoke(new FocusOrder(focusProperties));
    }

    public final InterfaceC10570l getFocusOrderReceiver() {
        return this.focusOrderReceiver;
    }
}
