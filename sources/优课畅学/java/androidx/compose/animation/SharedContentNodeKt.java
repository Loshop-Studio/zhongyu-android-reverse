package androidx.compose.animation;

import androidx.compose.p013ui.modifier.ModifierLocalKt;
import androidx.compose.p013ui.modifier.ProvidableModifierLocal;
import p300x7.InterfaceC10559a;

/* loaded from: classes.dex */
public final class SharedContentNodeKt {
    private static final ProvidableModifierLocal<SharedElementInternalState> ModifierLocalSharedElementInternalState = ModifierLocalKt.modifierLocalOf(new InterfaceC10559a() { // from class: androidx.compose.animation.SharedContentNodeKt$ModifierLocalSharedElementInternalState$1
        @Override // p300x7.InterfaceC10559a
        public final SharedElementInternalState invoke() {
            return null;
        }
    });

    public static final ProvidableModifierLocal<SharedElementInternalState> getModifierLocalSharedElementInternalState() {
        return ModifierLocalSharedElementInternalState;
    }
}
