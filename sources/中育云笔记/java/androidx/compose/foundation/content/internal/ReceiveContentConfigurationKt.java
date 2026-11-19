package androidx.compose.foundation.content.internal;

import androidx.compose.p014ui.modifier.ModifierLocalKt;
import androidx.compose.p014ui.modifier.ModifierLocalModifierNode;
import androidx.compose.p014ui.modifier.ProvidableModifierLocal;
import p181hd.InterfaceC9529a;

/* loaded from: classes.dex */
public final class ReceiveContentConfigurationKt {
    private static final ProvidableModifierLocal<ReceiveContentConfiguration> ModifierLocalReceiveContent = ModifierLocalKt.modifierLocalOf(new InterfaceC9529a() { // from class: androidx.compose.foundation.content.internal.ReceiveContentConfigurationKt$ModifierLocalReceiveContent$1
        @Override // p181hd.InterfaceC9529a
        public final ReceiveContentConfiguration invoke() {
            return null;
        }
    });

    public static final ProvidableModifierLocal<ReceiveContentConfiguration> getModifierLocalReceiveContent() {
        return ModifierLocalReceiveContent;
    }

    public static final ReceiveContentConfiguration getReceiveContentConfiguration(ModifierLocalModifierNode modifierLocalModifierNode) {
        if (modifierLocalModifierNode.getNode().isAttached()) {
            return (ReceiveContentConfiguration) modifierLocalModifierNode.getCurrent(ModifierLocalReceiveContent);
        }
        return null;
    }
}
