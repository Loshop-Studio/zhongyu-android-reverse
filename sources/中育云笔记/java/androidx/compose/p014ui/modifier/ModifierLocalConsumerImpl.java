package androidx.compose.p014ui.modifier;

import androidx.compose.p014ui.platform.InspectorValueInfo;
import androidx.compose.runtime.Stable;
import p181hd.InterfaceC9540l;

@Stable
/* loaded from: classes2.dex */
final class ModifierLocalConsumerImpl extends InspectorValueInfo implements ModifierLocalConsumer {
    private final InterfaceC9540l consumer;

    public ModifierLocalConsumerImpl(InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2) {
        super(interfaceC9540l2);
        this.consumer = interfaceC9540l;
    }

    public boolean equals(Object obj) {
        return (obj instanceof ModifierLocalConsumerImpl) && ((ModifierLocalConsumerImpl) obj).consumer == this.consumer;
    }

    public final InterfaceC9540l getConsumer() {
        return this.consumer;
    }

    public int hashCode() {
        return this.consumer.hashCode();
    }

    @Override // androidx.compose.p014ui.modifier.ModifierLocalConsumer
    public void onModifierLocalsUpdated(ModifierLocalReadScope modifierLocalReadScope) {
        this.consumer.invoke(modifierLocalReadScope);
    }
}
