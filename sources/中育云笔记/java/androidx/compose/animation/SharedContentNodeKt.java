package androidx.compose.animation;

import androidx.compose.p014ui.modifier.ModifierLocalKt;
import androidx.compose.p014ui.modifier.ProvidableModifierLocal;
import p181hd.InterfaceC9529a;

/* loaded from: classes.dex */
public final class SharedContentNodeKt {
    private static final ProvidableModifierLocal<SharedElementInternalState> ModifierLocalSharedElementInternalState = ModifierLocalKt.modifierLocalOf(new InterfaceC9529a() { // from class: androidx.compose.animation.SharedContentNodeKt$ModifierLocalSharedElementInternalState$1
        @Override // p181hd.InterfaceC9529a
        public final SharedElementInternalState invoke() {
            return null;
        }
    });

    public static final ProvidableModifierLocal<SharedElementInternalState> getModifierLocalSharedElementInternalState() {
        return ModifierLocalSharedElementInternalState;
    }
}
