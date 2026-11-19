package androidx.compose.foundation.layout;

import androidx.compose.p014ui.modifier.ModifierLocalConsumer;
import androidx.compose.p014ui.modifier.ModifierLocalReadScope;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;

@Stable
/* loaded from: classes.dex */
final class ConsumedInsetsModifier implements ModifierLocalConsumer {
    private final InterfaceC9540l block;
    private WindowInsets oldWindowInsets;

    public ConsumedInsetsModifier(InterfaceC9540l interfaceC9540l) {
        this.block = interfaceC9540l;
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

    @Override // androidx.compose.p014ui.modifier.ModifierLocalConsumer
    public void onModifierLocalsUpdated(ModifierLocalReadScope modifierLocalReadScope) {
        WindowInsets windowInsets = (WindowInsets) modifierLocalReadScope.getCurrent(WindowInsetsPaddingKt.getModifierLocalConsumedWindowInsets());
        if (AbstractC9979u.m20289b(windowInsets, this.oldWindowInsets)) {
            return;
        }
        this.oldWindowInsets = windowInsets;
        this.block.invoke(windowInsets);
    }
}
