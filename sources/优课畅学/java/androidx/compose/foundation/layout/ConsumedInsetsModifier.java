package androidx.compose.foundation.layout;

import androidx.compose.p013ui.modifier.ModifierLocalConsumer;
import androidx.compose.p013ui.modifier.ModifierLocalReadScope;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10570l;

@Stable
/* loaded from: classes.dex */
final class ConsumedInsetsModifier implements ModifierLocalConsumer {
    private final InterfaceC10570l block;
    private WindowInsets oldWindowInsets;

    public ConsumedInsetsModifier(InterfaceC10570l interfaceC10570l) {
        this.block = interfaceC10570l;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ConsumedInsetsModifier) && ((ConsumedInsetsModifier) obj).block == this.block;
    }

    public int hashCode() {
        return this.block.hashCode();
    }

    @Override // androidx.compose.p013ui.modifier.ModifierLocalConsumer
    public void onModifierLocalsUpdated(ModifierLocalReadScope modifierLocalReadScope) {
        WindowInsets windowInsets = (WindowInsets) modifierLocalReadScope.getCurrent(WindowInsetsPaddingKt.getModifierLocalConsumedWindowInsets());
        if (AbstractC9133u.m16128b(windowInsets, this.oldWindowInsets)) {
            return;
        }
        this.oldWindowInsets = windowInsets;
        this.block.invoke(windowInsets);
    }
}
