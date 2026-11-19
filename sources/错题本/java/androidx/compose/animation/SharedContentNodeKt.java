package androidx.compose.animation;

import androidx.compose.p011ui.modifier.ModifierLocalKt;
import androidx.compose.p011ui.modifier.ProvidableModifierLocal;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p152r6.InterfaceC6469a;

@Metadata(m5109d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u001c\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m5110d2 = {"ModifierLocalSharedElementInternalState", "Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "Landroidx/compose/animation/SharedElementInternalState;", "getModifierLocalSharedElementInternalState", "()Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "animation_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class SharedContentNodeKt {

    @NotNull
    private static final ProvidableModifierLocal<SharedElementInternalState> ModifierLocalSharedElementInternalState = ModifierLocalKt.modifierLocalOf(new InterfaceC6469a() { // from class: androidx.compose.animation.SharedContentNodeKt$ModifierLocalSharedElementInternalState$1
        @Override // p152r6.InterfaceC6469a
        public final SharedElementInternalState invoke() {
            return null;
        }
    });

    @NotNull
    public static final ProvidableModifierLocal<SharedElementInternalState> getModifierLocalSharedElementInternalState() {
        return ModifierLocalSharedElementInternalState;
    }
}
