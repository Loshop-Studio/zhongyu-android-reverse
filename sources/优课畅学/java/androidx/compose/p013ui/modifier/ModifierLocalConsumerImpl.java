package androidx.compose.p013ui.modifier;

import androidx.compose.p013ui.platform.InspectorValueInfo;
import androidx.compose.runtime.Stable;
import p300x7.InterfaceC10570l;

@Stable
/* loaded from: classes2.dex */
final class ModifierLocalConsumerImpl extends InspectorValueInfo implements ModifierLocalConsumer {
    private final InterfaceC10570l consumer;

    public ModifierLocalConsumerImpl(InterfaceC10570l interfaceC10570l, InterfaceC10570l interfaceC10570l2) {
        super(interfaceC10570l2);
        this.consumer = interfaceC10570l;
    }

    public boolean equals(Object obj) {
        return (obj instanceof ModifierLocalConsumerImpl) && ((ModifierLocalConsumerImpl) obj).consumer == this.consumer;
    }

    public final InterfaceC10570l getConsumer() {
        return this.consumer;
    }

    public int hashCode() {
        return this.consumer.hashCode();
    }

    @Override // androidx.compose.p013ui.modifier.ModifierLocalConsumer
    public void onModifierLocalsUpdated(ModifierLocalReadScope modifierLocalReadScope) {
        this.consumer.invoke(modifierLocalReadScope);
    }
}
