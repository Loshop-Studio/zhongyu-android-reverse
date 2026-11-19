package androidx.compose.p014ui.focus;

import androidx.compose.runtime.internal.StabilityInferred;
import p181hd.InterfaceC9540l;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class FocusOrderToProperties implements FocusPropertiesScope {
    public static final int $stable = 0;
    private final InterfaceC9540l focusOrderReceiver;

    public FocusOrderToProperties(InterfaceC9540l interfaceC9540l) {
        this.focusOrderReceiver = interfaceC9540l;
    }

    @Override // androidx.compose.p014ui.focus.FocusPropertiesScope
    public void apply(FocusProperties focusProperties) {
        this.focusOrderReceiver.invoke(new FocusOrder(focusProperties));
    }

    public final InterfaceC9540l getFocusOrderReceiver() {
        return this.focusOrderReceiver;
    }
}
